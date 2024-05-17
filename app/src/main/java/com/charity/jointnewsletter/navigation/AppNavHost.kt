package com.charity.jointnewsletter.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.charity.jointnewsletter.R
import com.charity.jointnewsletter.ui.theme.screens.about.AboutScreen
import com.charity.jointnewsletter.ui.theme.screens.category.Categories
import com.charity.jointnewsletter.ui.theme.screens.contact.ContactScreen
import com.charity.jointnewsletter.ui.theme.screens.detail.DetailScreen
import com.charity.jointnewsletter.ui.theme.screens.feedback.FeedbackScreen
import com.charity.jointnewsletter.ui.theme.screens.home.HomeScreen
import com.charity.jointnewsletter.ui.theme.screens.login.LoginScreen
import com.charity.jointnewsletter.ui.theme.screens.notifications.NotificationScreen
import com.charity.jointnewsletter.ui.theme.screens.onboarding.OnboardingScreen
import com.charity.jointnewsletter.ui.theme.screens.privacy.MyPolicy
import com.charity.jointnewsletter.ui.theme.screens.register.RegisterScreen
import com.charity.jointnewsletter.ui.theme.screens.settings.SettingsScreen
import com.charity.jointnewsletter.ui.theme.screens.splash.SplashScreen
import com.charity.jointnewsletter.ui.theme.screens.topic.TopicScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_SPLASH) {

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination ){
        composable(ROUTE_SPLASH){
            SplashScreen(navController )
        }

        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController )
        }
        composable(ROUTE_CATEGORY){
            Categories(navController )
        }

        composable( "DetailScreen/{index}",
            arguments = listOf(
                navArgument(name = "index") {
                    type = NavType.IntType
                }
            )
        ) {index->
            val imageId = arrayOf(
                R.drawable.flags,
                R.drawable.school,
                R.drawable.food,
                R.drawable.climate,
                R.drawable.music,
                R.drawable.literature,
                R.drawable.art,
                R.drawable.covid,
                R.drawable.ai,
                R.drawable.teaching,
                R.drawable.ancient,

                )

            val names = arrayOf(
                "Issue No.1: \"Flags & Festivals\" Section",
                "Issue No.2: \"Schools & Curriculums\" Section",
                "Issue No.3: \"World in Dishes\" Section",
                "Issue No.4: \"Local Climates\" Section",
                "Issue No.5: \"Global Music\" Section",
                "Issue No.6: \"World Literature\" Section",
                "Issue No.7: \"World Art\" Section",
                "Issue No.8: \"Covid Tales\" Section",
                "Issue No.9: \"Artificial intelligence\" Section",
                "Issue No.10: \"Teaching Methods\" Section",
                "Issue No.11: \"Ancient History\" Section",


                )

            val description = arrayOf(
                "DANNEBROG " +
                        "; (the Danish flag) is the oldest flag still in use as of today. According to the popular myth as to how it came to be, it is said " +
                        "that on the 19th of June 1219, when King Valdemar was leading a crusade on Estonia, at Lyndanisse their army had been surrounded and " +
                        "it looked like they were going to be defeated. However, the priest that the Danish army had brought raised his hands in prayer, and " +
                        "when he finally lowered them the flag fell from the sky and the Danes won the battle.\n" +
                        "We still “celebrate” Valdemarsdag to this day, though the myth, of course, has been disputed and widely discussed since. "+
                        "This is one possible interpretation of the legend of the German flag development.\n" +
                "GERMANY"+ " :In the first half of the 19th century, Germany was in fact split into a lot of small territories. But when Napoleon attacked Germany, " +
                        "many of the little states had to unify again. Germany got the German Bund. And to have at least a chance to defeat Napoleon, they also had to" +
                        " stay together in their offensive. They needed uniform uniforms. Although there were several ones, they had to color them equally. The only color that was possible for doing that was black. So, they had black uniforms." +
                        " Step by step they added red coats and gold insignia. The German flag: Black-Red-Gold (yellow today) was inspired by these uniforms. Black was the major color, " +
                        "so it was placed at the top of the order, red in the middle, and gold at the bottom."+
                "I'm from the United States. My country is quite diverse in all aspects of it. With all the different cultures, there are so many different things to do" +
                        " and try and so many different people to meet. Also all the different places and settings you can visit. In just my state, there's a bit of everything- snow," +
                        " beaches, deserts, and so many more. With all the different food places to activities, not one thing is the same. I think that's what I like most about my country.",


                "Duyi Xu, an 11th grader at Nanchang No.2 High School (Honggutan Campus) has some complaints about some rigid learning methods in Chinese schools," +
                        " “As a liberal arts student in a key high school in China, my personal experience is that time is not enough. We are almost tired of running in " +
                        "one homework after another, box after box of endorsement tasks. However, what we have learned by heart only serves the exam. I'll think about it." +
                        " Is it meaningful to use our golden years to learn things that almost only serve exams, consume our creativity, and make us mWhen you search" +
                        " for \"China\" and \"education\" in your browser, you may come across words like \"strict,\" \"grueling,\" or even \"inhumane.\" You might wonder " +
                        "if that's true, with no way to verify. Today, we're going to ask some high schoolers from a normal school in China about their feelings regarding school in China." +
                        " ore homogeneous .”On a brighter note she adds, “Of course, the existing education model is the most suitable one based on the specific national conditions" +
                        " of China with a large population base. I believe it will continue to develop and progress, which requires our teenagers to compete for the first place and " +
                        "contribute their own strength to the development of the motherland in the future.”",



                "I'm sure every Nanchanger has a different opinion of our city. It's not as big as Beijing or Shanghai, nor is it a small town, being the capital of Jiangxi province and " +
                        "home to millions of people. Despite not having been born here (I was born in Yichun, a few hundred kilometers away), I've lived here for the majority of my life and " +
                        "grown attached to this sleepy, beautiful city in China's Southeast.\n" +
                        "I've been to a good many cities in China and even a few in America, I'm not going to say Nanchang's the best city I've been to; that would be too much. But I would say that overall, Nanchang is a nice place to live.\n" +
                        "The most striking feature you'd notice about Nanchang is its abundance of water. This is a common characteristic of cities in this part of China, which, unlike cities " +
                        "in the North, are generally aquatic. Lakes and ponds dot Nanchang's landscape and to the North, Lake Poyang, one of the largest freshwater lakes in China, provides a steady flow of moisture that prevents Nanchang from being too dry.\n" +
                        "If Nanchang's natural landscape is defined by water, its modern history is marked by the fires of revolution. In 1927, the famous Bayi (August 1st) revolution broke out in downtown Nanchang. " +
                        "It was the first-ever armed revolution led by the red army and marked the beginning of the PLA (People's Liberation Army). Many of Nanchang's landmarks are named \"Bayi\" in honor of our red heritage. \"Bayi\" Bridge, \"Bayi\" Avenue, \"Bayi\" sports teams, are just a few examples.\n" +
                        "Since 2019, Nanchang has set its sights on developing its VR/AR industry. The World Conference on the VR Industry has been held in Nanchang for the past few years and thousands of firms have located here to take advantage of the government's support. " +
                        "In the President's recent visit to Jiangxi and the Yangtze Economic Belt, his message to Jiangxi was to invigorate our economy and protect our green resources. A sensible message for a city on the banks of the Gan River, hoping to soar as the migrating cranes flying over the Gan.",


                "'m sure every Nanchanger has a different opinion of our city. It's not big like Beijing or Shanghai, nor is it a small town,\n" +
                        "being the capital of Jiangxi province and home to millions of people. Despite not having been born here (I was born in \n" +
                        "Yichun, a few hundred kilometers away), I've lived here for the majority of my life and grown attached to this sleepy, \n" +
                        "beautiful city in China's Southeast.\n" +
                        "I've been to a good many cities in China and even a few in America. I'm not going to say Nanchang's the best city I've \n" +
                        "been to; that would be too much. But I would say that overall, Nanchang is a nice place to live.\n" +
                        "The most striking feature you'd notice about Nanchang is its abundance of water. This is a common characteristic of \n" +
                        "cities in this part of China, which, unlike cities in the North, are generally aqueous. Lakes and ponds dot Nanchang's \n" +
                        "landscape and to the North, Lake Poyang, the largest freshwater lake in China, provides a steady flow of wet vapor that \n" +
                        "prevents Nanchang from being too dry.\n" +
                        "If Nanchang's natural landscape is defined by water, its modern history is marked by the fires of revolution. In 1927, the \n" +
                        "famous Bayi (August 1st) revolution broke out in downtown Nanchang. It was the first ever armed revolution led by the \n" +
                        "red army and marked the beginning of the PLA (People's Liberation Army). Many of Nanchang's landmarks are named \n" +
                        "\"Bayi\" in honor of our red heritage. \"Bayi\" Bridge, \"Bayi\" Avenue, \"Bayi\" sports teams, are just a few examples.\n" +
                        "Since 2019, Nanchang has set its sights on developing its VR/AR industry. The World VR Conference has been held in Nanchang for the past few \n" +
                        "years and thousands of firms have located here to take advantage of the government's support. In the President's recent visit to Jiangxi and the \n" +
                        "Yangtze Economic Belt, his message to Jiangxi was to invigorate our economy and protect our green resources. A sensible message for a city on the \n" +
                        "banks of the Gan, hoping to soar as the Snow Crane flying over its shores. (The snow crane was made the provincial bird of Jiangxi in 2019)",


                "I'm not an expert on Taylor Swift, but as a big fan, I'm thrilled to introduce the talented music queen to you.\n" +
                        "Born on December 13, 1989, Taylor Swift is a highly creative singer. At the age of 16, she released her first self-titled album. " +
                        "Passion has been a key factor in her success. With incredible talent and resilience, she won the 54th Grammy Awards for Best Country Singer. " +
                        "In 2012, she transitioned to a pop music style, and her popular album \"1989\" received the Grammy Album of the Year award.\n" +
                        "Now, I'd like to share my favorite album with everyone. \"Reputation\" is not just a body of work but also a reflection of ambition." +
                        " During a tough time, this remarkable album made people remember our queen. Two years of hard work allowed Taylor to transition from a country style to pop." +
                        " In the song \"Look What You Made Me Do,\" she confronts those who had hurt her with a resolute voice. I believe this song is the most iconic on the entire album.\n" +
                        "The Taylor Swift World Tour film was released in mainland China on December 31, 2023, capturing Taylor’s growth journey and classic scenes from world tours." +
                        " For every music fan in Europe and America, this is a must-see. Come see it at the cinema today! ",


                "The Three-Body Problem: When Chinese Sci-fi Went Global\n" +
                        "By Jialiang Tang (China)\n" +
                        "“Oftentimes, the most powerful weapon is not a physical force, but an idea.” - Death’s End, Cixin Liu\n" +
                        "A vast universe of space-zipping aliens, gravity-defying spaceships, four-dimensional exploration, and literal star-crossed romance is beautifully encapsulated " +
                        "by Cixin Liu's Three-Body Problem series. To this day, it remains the most popular sci-fi series in China, known if not read by most of China's literate population." +
                        " Its publication truly marked a turning point in China's sci-fi scene.\n" +
                        "The three-part saga runs from the siege of Constantinople, Mao-era construction in Northern China, to billions of years after the demise of the solar system by a " +
                        "two-dimensional “slip”. It blends realism with fascinating imagination, \"hard\" science with heart-breaking loneliness and romance. It raises deep questions about " +
                        "humanity's place in the universe. In the \"dark forest\" of the universe full of hunters and easy targets, where exposure could mean destruction because for powerful" +
                        " extraterrestrial civilizations, it's easier to eliminate any threat than to make contact and verify.\n" +
                        "For those unfamiliar with Chinese history, the book offers a glimpse into the chaos and disruptions of the 1950s and 60s. Set in the Northeastern region of China," +
                        " the Hong ‘an Base (Red Coast Base) is described believably and with close attention to detail.\n" +
                        "As the first Asia to win the Hugo awards, the Three-Body Problem series is a wonderful read for sci-fi enthusiasts and novices alike. Now translated into English, " +
                        "and having been adapted into a Netflix series and movie, it is reaching ever more overseas readers and viewers.",


                "Art × City\n" +
                        "-How art is transforming Chinese cities\n" +
                        "By Jialiang Tang (China)\n" +
                        "When a society enters a higher level of development, the focus shifts from purely economic growth to the pursuit of both material and cultural prosperity. Since 2016, the P.R.C. has embarked on a new journey of \"high-quality development\" as opposed to purely economic growth. China is certainly not alone in this transition. As developing economies progress along the development ladder, all will, to a certain extent, see this change.\n" +
                        "If you walk the streets in Nanchang today, compared to just a few years ago, you would certainly be struck by the change of landscape. Aside from the cleaner streets and extra skyscrapers jutting into the sky, there are also subtler changes. All outdoor electrical transformers have been painted over with beautiful and creative paintings. Overnight, it seemed, these ugly, bare metal structures on sidewalks and corners had been turned into artworks worthy of being inside a gallery.\n" +
                        "In other cities and even in villages across China, such minor additions are now commonplace. It reflects not just a governmental objective to beautify the streets, but a changing urban attitude towards art and beauty. China's urbanization rate is up from 17.92% in 1978 to 65.2% according to the most recent cencus, growing from 172.45 million to 920.71 million, growing by 748.26 million people, more than the entire population in the European Union (346.66 million) \n" +
                        "As more and more people move into cities, it gives city planners both an opportunity and an imperative to innovate in the urban planning process, creating cities built to last.",


                "Kenya\n" +
                        "By Charity Silah\n" +
                        "The COVID-19 pandemic brought about unique experiences for everyone. One common thread was that it affected every aspect of our lives, including school, family, and daily routines.\n" +
                        "I remember the Wednesday morning when our school principal announced that the government of Kenya had ordered the closure of all schools due to the global pandemic. This news evoked mixed feelings among the students. While some were relieved to return home after a prolonged period in boarding school, there was an underlying anxiety about the future. Questions about the fate of education and our academic futures loomed large.\n" +
                        "At that time, my sister Silvia was in her final year of high school, preparing for her university entrance exams, the KCSE. Adjusting from the structured school environment to studying alone at home presented a significant challenge for all of us.\n" +
                        "Before the pandemic, our parents worked in a different city from where we lived. Unfortunately, due to the total lockdown, they were unable to return home. For nine months, we had to live alone. Although we kept in touch with them, living apart from our parents was particularly difficult for my little sister, Faith, who was only seven years old at the time.\n" +
                        "Amidst the challenges of the pandemic, there were some silver linings. It became a time for self-development, with people picking up new skills such as programming, cooking, and creating podcasts. Additionally, the emphasis on wearing masks and maintaining proper sanitation not only prevented COVID-19 but also other diseases, fostering a culture of self-care.\n" +
                        "Survival is an inherent instinct in human nature. As we move past the COVID-19 pandemic, we can confidently say, \"We survived the COVID ordeal!\"",


                "Life 3.0: Being Human in the Age of Artificial Intelligence\n" +
                        "Years on Max Tegmark’s depiction of Artificial Intelligence has become an imminent reality\n" +
                        "By Jialiang Tang\n" +
                        "Before AI became synonymous with chatbots, machine learning, and way before AI became a household name, in 2018, I chanced upon this book. Looking back years later, a century in modern computer science terms, it is still an insightful and prevalent read today.\n" +
                        "The book begins with a utopian/dystopian tale, depending on how you think about AI helping run the world. Having created the first General Artificial Intelligence ever created, a group of scientists and their benevolent backers use AI to take over the world and make the world run better. As Man becomes ever closer to creating a mechanical equal to himself in all aspects of human intelligence, this and many other scenarios presented in the book have become not fantasy but perhaps a distant reality.\n" +
                        "The author divides life into three forms: Life 1.0, 2.0, and 3.0, depending on if the individuals’ hardware and software have evolved or designed. This neatly captures the essence of this new technology as not merely that, but in fact a new life form alongside ourselves. A lot of companies have as their ultimate goal the creation of this Life 3.0. For animals, there are animal protection and control laws. For a fantastic novel new creature that just so happens to be made by humans, shouldn't there be",


                "Various Teaching Methods in Germany \n" +
                        "By Maura Black (Germany)\n" +
                        "This article can only summarize a few teaching methods we have here. Our school is very modern and it tries to make lessons as informative as possible for its students. As a result, the teaching methods are extremely varied. It always depends on the topic and the teacher, but overall, there are four methods commonly in use in German schools that I'm aware of.\n" +
                        "The first is rather old. It is called frontal lessons, meaning the teacher stands before us and talks to us. It is basically the most informative one according to the things we need to know. Old it may be, it is still very effective.\n" +
                        "To motivate the students, we often have what's called \"project lessons\" here. This is a concept that has developed in recent years. We form small groups and either receive a topic or choose one ourselves. Our school has something called \"Future Skills,\" where students are allowed to explore topics of their interest. The only guideline is that they have to work on something that matters for the future. Teachers now act more as mentors in this approach.\n" +
                        "A less innovative but still very effective method is group work. Almost every teacher tries to incorporate group work into their lessons. Normally, a group consists of 4 to 6 students who discuss or research a topic they have been given. Since each group focuses on a different topic, they present their findings to the class afterward. This ensures that everyone learns the most important points about all the topics.\n" +
                        "Lastly, there is the method of experiments and games. In natural science subjects like biology, physics, chemistry, and geography, students conduct experiments and measurements. This provides a practical application to everyday life. In language subjects and other disciplines, especially younger students, are often allowed to play educational games. Teachers can create these games using platforms like Kahoot or learning apps, and through playing and having fun, students learn. To initiate discussions in subjects like ethics or politics, we also use a platform called Menti, where every student can vote or contribute. Subsequently, we can engage in discussions.\n" +
                        "Each teacher has their own teaching method, and every lesson is slightly different. However, most lessons involve at least two of the teaching methods I mentioned. The sources of information are as varied as the teaching methods themselves . Some prefer textbooks recommended by the Ministry of Education, while others prefer worksheets. Additionally, with the latest technological advancements, we also use iPads in school for internet research.",


                "A History of  Languages \n" +
                        "By Jialiang Tang (China) Maura Blacke (Germany) Diwme (Sri Lanka) Jane (Russia) Charity (Kenya)\n" +
                        "By one count, there are 7,000 different spoken languages in use around the world today. A language is more than just a medium for exchanging information. It is the embodiment of a culture, a people, and its history. All these different languages have a unique story behind them, and today we would like to tell a few of them.\n" +
                        "We begin with the most spoken language in the world: Chinese, which also happens to be one of the oldest alive in the world today. It originated in the early days of Chinese civilization around 1500 B.C. as a way to record events and the results of special kinds of predictions using turtle shells. The characters were carved onto hard surfaces such as turtle shells, giving the script the name jiagu text, with \"gu\" meaning bone. Jiagu text and other early texts sometimes closely resembled the objects they described, with characters that bear a striking resemblance to modern Chinese characters. Throughout history, there have been various script styles, from jiagu text to kaishu, the font seen on computer screens today. Chinese calligraphy is truly an art form, akin to painting or sculpture. While it may seem like merely writing a few words on paper, it is a tradition that spans centuries, if not millennia.\n" +
                        "Next, we’ll dive into the long history of the German Language. whose roots date back approximately 5,000 years. A thousand years later, similarities in languages across Europe emerged, forming what was known as the Indo-Germanic language group. Although predominantly based on consonants, it was not yet a unified language. For instance, the word for \"seeing,\" which is \"sehen\" today, was pronounced differently back then. \n" +
                        "Between 800 and 500 B.C., the first Germanic language, known as \"Althochdeutsch\" or Old High German, emerged. This language lacked strict grammatical rules, allowing for flexibility in word order to convey meaning. Emperor Charlemagne or Karl der Große, played a significant role in promoting and standardizing this language across the empire. Changes in pronunciation, such as \"p\" becoming \"pf\" and \"k\" becoming \"ch,\" were observed during this time. Subsequently, emphasis and grammar began to develop, leading to the era of \"Mittelhochdeutsch\" or Middle High German, which spanned from 1050 to 1350 A.C. This period can be divided into early, classic, and late periods, although a standardized written form had not yet been established. While Latin was predominantly used in books and documents, Middle High German was heavily influenced by French, incorporating accents and evolving pronunciation. For example, the written version included words like Hûs, meaning rabbit. Dialectical variations persisted, making communication challenging even between individuals living in close proximity. The transition to \"Frühneuhochdeutsch\" or Early New High German occurred between 1350 and 1650, resulting in the gradual disappearance of many dialects and a convergence toward a more standardized form of the language. Today dialects still do exist, yet their prevalence decreased over time. This period marked the first significant influence of hundreds of  languages on German, with European and American languages shaping its evolution. Today, the word for saying something is “sagen”, this time they said “saggen”, so the same word, but with a short “a”. The current phase, \"Neuhochdeutsch\" or New High German, has been greatly impacted by globalization and cultural exchange. The influx of new words, shifts in emphasis, and changes in pronunciation have added complexity and uniqueness to the language. The integration of scientific advancements has also influenced language development, enabling the creation of specialized terms like \"DNA-replication.\"\n" +
                        "The incorporation of foreign words and the emergence of inner linguistic pluralism, or innere Mehrsprachigkeit, have enriched the German language. For example, I could call ice cream “Das Eis” (German), “ice cream” (English), “la glace” (French), or “Bīng qí lín” (Chinese). That means that I experience the word from more than one side. That is to say, multilingualism has become more prevalent, with individuals adopting words from various languages into their vocabulary. The influence of youth culture, including the adoption of English-based terms and the rise of emojis, continues to shape contemporary German language usage. There is a ranking of the most popular youth words , or Jugendsprache,  in our news and one word becomes part of the official  dictionary, Duden. As German continues to evolve, it may embrace new influences from diverse regions and fields, reflecting a dynamic and ever-changing linguistic landscape. Language development is an ongoing process, characterized by adaptation and enrichment from external sources.\n" +
                        "And now, we’ll explore the incredible journey of the Russian language whose history spans almost a thousand years. Throughout its existence, it has undergone many changes that are evident in the modern language. The history of the Russian language is divided by scientists into three periods: Old Russian (VI-XIV centuries), Great Russian (XIV-XVII centuries), and the period of the national Russian language (from the middle of the 17th century). Modern lexical and grammatical norms of the Russian language emerged as a result of the long-term interaction of various East Slavic dialects that existed on the Great Russian territory and the Church Slavonic language, which originated from the adaptation of the first Christian books. A significant portion of the Russian vocabulary consists of words of Greek and Turkic origin. For instance, words like \"diamond,\" \"fog,\" and \"pants\" originated from the Turkic language, while words like \"crocodile,\" \"bench,\" and \"beet\" have Greek origins. It is well-known that many names given at baptism in Russia came from Greece, including names of Greek origin like Catherine or Feodor, as well as names of Hebrew origin like Ilya or Maria. In the 16th-17th centuries, the main source of new words in the Russian language was Polish. This led to the introduction of words of Latin, Germanic, and Romance origin such as \"algebra,\" \"dance,\" and \"powder,\" as well as directly borrowed Polish words like \"bank\" and \"duel\" into the language.\n" +
                        "The modern Russian alphabet, consisting of thirty-three letters in the familiar form, has been in existence since 1918 and was officially approved in 1942. Prior to this, the alphabet officially had thirty-one letters, as \"Ë\" was equated with \"E\" and \"Y\" with \"I.\"The modern Russian language, also known as the literary language, emerged in the 17th-18th centuries. In 1918, a reform removed the letters \"decimal i,\" \"fita,\" and \"yat\" from the alphabet, introducing the letters \"i,\" \"f,\" and \"e\" respectively. Additionally, the use of a hard sign at the ends of words was abolished. It became customary to write the letter \"s\" before voiceless consonants and \"z\" before vowels and voiced consonants in prefixes. Other changes were also made regarding the use of endings in different case forms and the replacement of certain word forms with more modern ones. New words continue to enter the Russian language, with many coming from English. This is how the Russian language has evolved over many centuries.\n" +
                        "Swahili, also known as Kiswahili, is a language spoken in Kenya and other East African countries, with a fascinating history! The language emerged as a way of communication between Arab traders and Bantu-speaking communities in the 7th century, resulting in a mix of Arabic, Bantu, Persian, and Portuguese words. Over time, Swahili interacted with European languages such as Portuguese, introducing new vocabulary, while the Oman Sultanate influenced many aspects of governance, law, and Islamic scholarship. During the colonial era, Swahili served as a lingua franca for diverse ethnic groups along the East African coast. \n" +
                        "Following Kenya's independence from colonial rule in the 1960s, Swahili was established as a national language, taught in schools, and recognized as an official language alongside English, with the government working to standardize its grammar and spelling for easier use in administration, education, and media. Swahili has continued to evolve, incorporating loanwords from various languages, including English, due to globalization and technological advancements. It remains an essential component of Kenyan identity and culture, spoken by millions of people across the country in both urban and rural areas. Swahili literature, music, and film contribute to its ongoing cultural significance and evolution.\n" +
                        "And finally, we’ll introduce a lesser-known but no less impressive language. Sinhala, sometimes referred to as Sinhalese, is an Indo-Aryan language spoken by the people of Sri Lanka, with a population of approximately 16 million.According to the Mahawansa, which is considered the earliest historical record of the region and is written in Pali, it is believed that Prince Vijaya from the Vanga Kingdom (Bengal) visited the country, influencing the development of the language.The evolution of Sinhala can be categorized into four main epochs, namely Elu Prakrit (3rd century BCE to 4th century CE), Proto-Sinhala (4th century CE to 8th century CE), Medieval Sinhala (8th century CE to 13th century CE), and Modern Sinhala (13th century CE to the present). The similarities between old Sinhala and modern Sinhala with words from Sanskrit, Persian, French, German, Greek, Gothic, and Latin languages suggest a rich history of linguistic influences. This can be attributed to the interactions with visitors from various countries over time, leading to a diverse vocabulary in Sinhala.\n" +
                        "The Sinhala language also has unique words that are exclusive to its vocabulary. The script of Sinhala originally derived from Brahmi script, with early examples found in caves where Buddhist monks resided. Notably, the Sigiriya rock fortress contains graffiti and songs created by ancient Sri Lankans, providing valuable insights into the early literature of Sinhala. Buddhism has played a significant role in the development of the Sinhala language. With the introduction of Pali texts by Lord Buddha and the subsequent need to study them, combined with interactions with visitors from different cultures, the Sinhala language gradually evolved ",


                )
            DetailScreen(
                photos = imageId ,
                names = names,
                description = description,
                itemIndex =index.arguments?.getInt("index"),

            )


        }

        composable(ROUTE_CONTACT){
            ContactScreen(navController)
        }
        composable(ROUTE_ONBOARDING){
            OnboardingScreen(navController )
        }
       /* composable(ROUTE_TOPICS){
            val imageIds = arrayOf(R.drawable.flags, R.drawable.kenya, R.drawable.ai)
            val names = arrayOf("Name 1", "Name 2", "Name 3")
            val descriptions = arrayOf("Description 1", "Description 2", "Description 3")

            // Create a NavController
            val navController = rememberNavController()
            TopicScreen(imageId = imageIds, names = names, description = descriptions, navController )
        }*/

        composable("topic") {
            val imageId = arrayOf(
                R.drawable.flags,
                R.drawable.school,
                R.drawable.food,
                R.drawable.literature,
                R.drawable.music,
                R.drawable.art,
                R.drawable.covid,
                R.drawable.ai,
                R.drawable.teaching,
                R.drawable.ancient,

                )

            val names = arrayOf(
                "Issue No.1: \"Flags & Festivals\" Section",
                "Issue No.2: \"Schools & Curriculums\" Section",
                "Issue No.3: \"World in Dishes\" Section",
                "Issue No.4: \"Local Climates\" Section",
                "Issue No.5: \"Global Music\" Section",
                "Issue No.6: \"World Literature\" Section",
                "Issue No.7: \"World Art\" Section",
                "Issue No.8: \"Covid Tales\" Section",
                "Issue No.9: \"Artificial intelligence\" Section",
                "Issue No.10: \"Teaching Methods\" Section",
                "Issue No.11: \"Ancient History\" Section",


                )

            val description = arrayOf(
                "Introduces the national flags of several countries and some local festivals",
                "Describes the education systems of several countries from  students' perspectives",
                "Tempts readers with delicious dishes from various countries",
                "Introduces the geographic and climatic features of various countries and regions",
                "Recounts stories about some of the world's most famous music legends, including Taylor ",
                "Introduces famous literary figures from various countries",
                "Features classical and contemporary artists and artworks from a wide range of sources",
                "Retells the mournful or inspiring stories from a difficult time for all humanity",
                "Explores the pros and cons of this emerging technology.",
                "",
                "Dives into the history of different language and how they evolved with time...",
                ""

            )
            TopicScreen(imageId, names, description, navController)
        }

        composable(ROUTE_POLICY){
            MyPolicy(navController )
        }
        composable(ROUTE_NOTIFICATIONS){
            NotificationScreen()
        }
        composable(ROUTE_SETTINGS){
            SettingsScreen(navController )

        }
        composable(ROUTE_FEEDBACK){
            FeedbackScreen(navController )

        }
    }

}




