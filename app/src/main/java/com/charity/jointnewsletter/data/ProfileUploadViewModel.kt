package com.charity.jointnewsletter.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.charity.jointnewsletter.model.ProfileUpload
import com.google.android.gms.analytics.ecommerce.Product
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class ProfileUploadViewModel(var navController: NavHostController, var context: Context) {
    var progress: ProgressDialog

    init {
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

fun saveProductWithImage(profileName:String, profileEmail:String, profilePhone:String, filePath: Uri){
    var id = System.currentTimeMillis().toString()
    var storageReference = FirebaseStorage.getInstance().getReference().child("Uploads/$id")
    progress.show()

    storageReference.putFile(filePath).addOnCompleteListener{
        progress.dismiss()
        if (it.isSuccessful){
            // Proceed to store other data into the db
            storageReference.downloadUrl.addOnSuccessListener {
                var imageUrl = it.toString()
                var houseData = ProfileUpload(profileName,profileEmail,
                    profilePhone,imageUrl,id)
                var dbRef = FirebaseDatabase.getInstance()
                    .getReference().child("Uploads/$id")
                dbRef.setValue(houseData)
                Toast.makeText(context, "Upload successful", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
        }
    }
}


fun viewUploads(upload: MutableState<ProfileUpload>, uploads: SnapshotStateList<ProfileUpload>): SnapshotStateList<ProfileUpload> {
    var ref = FirebaseDatabase.getInstance().getReference().child("Uploads")

    progress.show()
    ref.addValueEventListener(object : ValueEventListener {
        override fun onDataChange(snapshot: DataSnapshot) {
            progress.dismiss()
            uploads.clear()
            for (snap in snapshot.children){
                val value = snap.getValue(ProfileUpload::class.java)
                upload.value = value!!
                uploads.add(value)
            }
        }

        override fun onCancelled(error: DatabaseError) {
            Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
        }
    })
    return uploads
}


}