package com.example.flaggame

object Constants {
    private val allQuestions = ArrayList<Question>()
    private val askedQuestions = ArrayList<Question>()

    init {
        val que1 = Question(1,
            "Which county is this?",
            R.drawable.alabasta,
            "Alabasta",
            "Dressrosa",
            "Germa Kingdom", "Wano Country",
            1)



        val que2 = Question(2,
            "Who is this character?", R.drawable.kaido,
            "Beast Dragon",
            "Drago",
            "Kaido",
            "Roronoa",
            3)


        val que3 = Question(3,
            "Which StrawHat pirate is from this island", R.drawable.drumisland,
            "Nami",
            "Chopper",
            "Usopp",
            "Luffy",
            2)


        val que4 = Question(4,
            "Who is this character?", R.drawable.boahancock,
            "Alvida",
            "Charlotte Pudding",
            "Boa Hancock",
            "Catarina Devon",
            3)


        val que5 = Question(5,
            "What is this called?", R.drawable.roadponeglyhs,
            "Cube Cube",
            "Poneglyphs",
            "Road Poneglyphs",
            "Ancient Weapons",
            3)


        val que6 = Question(6,
            "Who is this Admiral ?", R.drawable.kizaru,
            "Admiral Akainu",
            "Admiral Kizaru",
            "Admiral Aokiji",
            "Admiral Fujitora",
            2)


        val que7 = Question(7,
            "Where is the One Piece is located?", R.drawable.laughtale,
            "Grand Line",
            "Laugh Tale",
            "Fish-Man island",
            "Mariejois",
            2)


        val que8 = Question(8,
            "What is term referring to these Pirate Group", R.drawable.worstgen,
            "New Generation",
            "Rookies",
            "New Dawn",
            "Worst Generation",
            4)


        val que9 = Question(9,
            "Who is the Man StawHats were searching for in this island?", R.drawable.sabaodiacapela,
            "Jimbei",
            "Dr.Kureha",
            "Rayleigh",
            "Zunisha",
            3)


        val que10 = Question(10,
            "What is this place called?", R.drawable.ohara,
            "Ohara",
            "Little Garden",
            "Zou",
            "Cactus Island",
            1)

        val que11 = Question(11,
            "Who is the highest Authority in the World?", R.drawable.marijuwa,
            "Five Elders",
            "Fleet Admiral",
            "Imu",
            "King of the Pirates",
            3)

        val que12 = Question(12,
            "What is Nami's role in the crew?", R.drawable.nami,
            "Navigator",
            "Doctor",
            "Cook",
            "Archeologist",
            1)

        val que13 = Question(13,
            "What Organization this character Commands?", R.drawable.dragon,
            "The Government",
            "The Gladiators",
            "The Revolutionary Army",
            "The Giants",
            3)

        val que14 = Question(14,
            "What is the name of this Devil Fruit?", R.drawable.opeopenomi,
            "Mera Mera no Mi",
            "Guru Gura no Mi",
            "Gomu Gomu no Mi",
            "Ope Ope no Mi",
            4)

        val que15 = Question(15,
            "Which Character doesn't have Devil Fruit powers ?", R.drawable.devilfruits,
            "Kaido",
            "Shanks",
            "Robin",
            "Big Mom",
            2)

        val que16 = Question(16,
            "Which county is this?", R.drawable.wano,
            "Little Garden",
            "Onigashima",
            "Wano",
            "Mugiwara",
            3)

        val que17 = Question(17,
            "What is Zoro's famous sword style called?", R.drawable.zoro,
            "Santoryo (3 Swords Style)",
            "Nitoryu (2 Swords Style)",
            "Oni Giri",
            "Taka Nami",
            1)

        val que18 = Question(18,
            "Brook is also known as?", R.drawable.brook,
            "Dark King",
            "Bone Length",
            "Soul King",
            "SogeKing",
            3)

        val que19 = Question(19,
            "In which Arc Usopp got the title (GOD USOPP)?", R.drawable.godussop,
            "Wano Arc",
            "Dressrosa Arc",
            "Wholecake island Arc",
            "Water 7 Arc",
            2)

        val que20 = Question(20,
            "What is the period where no historical records were found?", R.drawable.voidcentury,
            "Hollow Time",
            "Hollow Past",
            "Unknown Times",
            "Void Century",
            4)

        val que21 = Question(21,
            "What is the only known Ancient Weapon?", R.drawable.posiden,
            "Pluton",
            "Uranus",
            "Neptune",
            "Poseidon",
            4)

        val que22 = Question(22,
            "What is the only known Ancient Weapon?", R.drawable.posiden,
            "Poseidon",
            "Uranus",
            "Neptune",
            "Pluton",
            1)

        val que23 = Question(23,
            "Who is the captain of the Heart Pirates?", R.drawable.heartpirates,
            "Trafalgar Law",
            "Eustass Kid",
            "Scratchmen Apoo",
            "Basil Hawkins",
            1)

        val que25 = Question(25,
            "Who is the former Vice captain of the Roger Pirates?", R.drawable.roger,
            "Gol D. Roger",
            "Monkey D. Dragon",
            "Edward Newgate",
            "Silvers Rayleigh",
            4)

        val que26 = Question(26,
            "What is the name of Nico Robin's Devil Fruit power?", R.drawable.nicorobin,
            "Hana Hana no Mi",
            "Yami Yami no Mi",
            "Ope Ope no Mi",
            "Hito Hito no Mi",
            1)

        val que28 = Question(28,
            "Who is the father of Monkey D. Luffy?", R.drawable.luffy,
            "Gol D. Roger",
            "Monkey D. Dragon",
            "Red-Haired Shanks",
            "Monkey D. Garp",
            2)

        val que29 = Question(29,
            "What is the name of Zoro's childhood friend who gave him his famous sword, Wado Ichimonji?", R.drawable.kuina,
            "Tashigi",
            "Kuina",
            "Hina",
            "Kaya",
            2)

        val que24 = Question(24,
            "What is the name of the island where the Sky Island, Skypiea, is located?", R.drawable.skypiea,
            "Jaya",
            "Water 7",
            "Enies Lobby",
            "Marineford",
            1)

        val que31 = Question(31,
            "What is the name of Monkey D. Luffy's grandfather?", R.drawable.garp,
            "Garp",
            "Roger",
            "Dragon",
            "Shanks",
            1)

        val que33 = Question(33,
            "What is the name of the island where Luffy's crew meets Bartholomew Kuma for the first time?", R.drawable.kuma,
            "Drum Island",
            "Marineford",
            "Sabaody Archipelago",
            "Thriller Bark",
            4)

        val que36 = Question(36,
            "What is the name of the island where the World Government's headquarters, Mary Geoise, is located?", R.drawable.marijuwa,
            "Water 7",
            "Mariejois",
            "Fish-Man Island",
            "Enies Lobby",
            2)

        val que38 = Question(38,
            "What is the name of Sanji's father?", R.drawable.judge,
            "Zeff",
            "Yonji",
            "Reiju",
            "Judge",
            4)

        val que40 = Question(40,
            "What is the name of Nami's adoptive mother?", R.drawable.bell,
            "Nojiko",
            "Tashigi",
            "Bell-mère",
            "Hina",
            3)

        val que41 = Question(41,
            "What is the name of the island where the Straw Hat Pirates first meet Brook?", R.drawable.brook,
            "Zou",
            "Sabaody Archipelago",
            "Thriller Bark",
            "Wano",
            3)

        val que43 = Question(43,
            "What is the name of the kingdom ruled by King Riku Dold III?", R.drawable.kingriku,
            "Alabasta",
            "Dressrosa",
            "Wano",
            "Skypiea",
            2)

        val que45 = Question(45,
            "What is the name of Luffy's brother who is the second-in-command of the Revolutionary Army?", R.drawable.revarmy,
            "Ace",
            "Sabo",
            "Dragon",
            "Koby",
            2)

        val que47 = Question(47,
            "What is the name of the island where Luffy grows up and first meets Shanks?", R.drawable.shanks,
            "Loguetown",
            "Water 7",
            "Fusha Village",
            "Shell Town",
            3)

        val que50 = Question(50,
            "Who is the captain of the Red-Haired Pirates?", R.drawable.redhair,
            "Shanks",
            "Whitebeard",
            "Kaido",
            "Blackbeard",
            1)

        val que51 = Question(51,
            "What is the name of the island where the Straw Hat Pirates reunite after the events of the Enies Lobby arc?", R.drawable.sabaodiacapela,
            "Marineford",
            "Loguetown",
            "Sabaody Archipelago",
            "Fish-Man Island",
            3)

        val que52 = Question(52,
            "Who is known as the 'Strongest Man in the World' in the One Piece series?", R.drawable.mobydick,
            "Garp",
            "Kaido",
            "Roger",
            "Whitebeard",
            4)

        val que56 = Question(56,
            "What is the name of the island where the Straw Hat Pirates first meet Nami?", R.drawable.cocyashi,
            "Alabasta",
            "Syrup Village",
            "Cocoyashi Village",
            "Baratie",
            3)

        val que60 = Question(60,
            "What is the name of the island where Luffy trains during the two-year time skip?", R.drawable.rayvsluffy,
            "Amazon Lily",
            "Fish-Man Island",
            "Rusukaina",
            "Kuraigana Island",
            3)

        val que67 = Question(67,
            "Who is known as 'The Dark King' in the One Piece series?", R.drawable.ray,
            "Rayleigh",
            "Shanks",
            "Kuma",
            "Buggy",
            1)

        val que61 = Question(61,
            "Who is the chef of the Straw Hat Pirates?", R.drawable.sanji,
            "Zeff",
            "Sanji",
            "Katakuri",
            "Duval",
            2)

        val que63 = Question(63,
            "Who is known as 'The Tyrant' in the One Piece series?", R.drawable.kuma,
            "Moria",
            "Kuma",
            "Arlong",
            "Hody Jones",
            2)

        val que64 = Question(64,
            "What is the name of the island where Luffy and the Straw Hat Pirates first meet Boa Hancock?", R.drawable.boaluffy,
            "Whole Cake Island",
            "Sabaody Archipelago",
            "Amazon Lily",
            "Punk Hazard",
            3)

        val que66 = Question(66,
            "Where did the Straw Hat Pirates first meet Nico Robin?", R.drawable.alabasta,
            "Arabasta",
            "Baltigo",
            "Elbaf",
            "Zou",
            1)

        val que71 = Question(71,
            "Who is the former Warlord of the Sea known as 'First Son of the sea'?", R.drawable.jinbei,
            "Shirahoshi",
            "Fisher Tiger",
            "Kuma",
            "Jimbei",
            4)

        val que74 = Question(74,
            "What is the name of the island where Luffy and Ace grew up?", R.drawable.luffyace,
            "Loguetown",
            "Dawn Island",
            "Drum Island",
            "Alabasta",
            2)

        val que77 = Question(77,
            "Who is the current Fleet Admiral of the Marines in the One Piece series?", R.drawable.marine,
            "Sengoku",
            "Fujitora",
            "Akainu",
            "Kizaru",
            3)

        val que81 = Question(81,
            "Who is the mayor of Water 7?", R.drawable.water7,
            "Kokoro",
            "Paulie",
            "Tom",
            "Iceburg",
            4)

        val que85 = Question(85,
            "Who is the first mate of the Red-Haired Pirates?", R.drawable.redhair,
            "Yasopp",
            "Shanks",
            "Lucky Roux",
            "Benn Beckman",
            4)

        val que88 = Question(88,
            "What is the name of the island where Luffy's crew finds the shipwright, Franky?", R.drawable.frankyy,
            "Loguetown",
            "Water 7",
            "Thriller Bark",
            "Skypiea",
            2)

        val que89 = Question(89,
            "What happend in this moment?", R.drawable.nothinghappend,
            "Kuma killed Chopper",
            "Something Happend",
            "Paramount War started",
            "Nothing Happend",
            4)








        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)
        allQuestions.add(que7)
        allQuestions.add(que8)
        allQuestions.add(que9)
        allQuestions.add(que10)
        allQuestions.add(que11)
        allQuestions.add(que12)
        allQuestions.add(que13)
        allQuestions.add(que14)
        allQuestions.add(que15)
        allQuestions.add(que16)
        allQuestions.add(que17)
        allQuestions.add(que18)
        allQuestions.add(que19)
        allQuestions.add(que20)
        allQuestions.add(que21)
        allQuestions.add(que22)
        allQuestions.add(que23)
        allQuestions.add(que24)
        allQuestions.add(que25)
        allQuestions.add(que26)
        allQuestions.add(que28)
        allQuestions.add(que29)
        allQuestions.add(que31)
        allQuestions.add(que33)
        allQuestions.add(que36)
        allQuestions.add(que38)
        allQuestions.add(que40)
        allQuestions.add(que41)
        allQuestions.add(que43)
        allQuestions.add(que45)
        allQuestions.add(que47)
        allQuestions.add(que50)
        allQuestions.add(que51)
        allQuestions.add(que52)
        allQuestions.add(que56)
        allQuestions.add(que60)
        allQuestions.add(que67)
        allQuestions.add(que61)
        allQuestions.add(que63)
        allQuestions.add(que64)
        allQuestions.add(que66)
        allQuestions.add(que71)
        allQuestions.add(que74)
        allQuestions.add(que77)
        allQuestions.add(que81)
        allQuestions.add(que85)
        allQuestions.add(que88)


    }



        fun getQuestion(): ArrayList<Question> {
            val availableQuestions = allQuestions.filter { !askedQuestions.contains(it) }.shuffled()
            val questionsList = ArrayList(availableQuestions.take(10))

            // Add the selected questions to the list of asked questions
            askedQuestions.addAll(questionsList)

            // If all questions have been asked, clear the list of asked questions
            if (allQuestions.size == askedQuestions.size) {
                askedQuestions.clear()
            }

            return questionsList
        }
    }