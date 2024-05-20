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
            "What is these special Fruit is called?", R.drawable.smile,
            "Devil Fruits",
            "Smiles",
            "Rubber Fruits",
            "Button Fruits",
            2)

        val que23 = Question(23,
            "Who is the captain of the Heart Pirates?", R.drawable.heartpirates,
            "Trafalgar Law",
            "Eustass Kid",
            "Scratchmen Apoo",
            "Basil Hawkins",
            1)

        val que24 = Question(24,
            "What is the name of the island where the Sky Island, Skypiea, is located?", R.drawable.skypiea,
            "Jaya",
            "Water 7",
            "Enies Lobby",
            "Marineford",
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


        val que30 = Question(30,
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
            "Who is known as 'The Dark King'?", R.drawable.ray,
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
            "Bartholomew Kuma is also known as?", R.drawable.kuma,
            "The Cyborg",
            "The Tyrant",
            "The Killer",
            " The Seraphim",
            2)

        val que64 = Question(64,
            "What is the name of the island where Luffy and the Straw Hat Pirates first meet Boa Hancock?", R.drawable.boaluffy,
            "Whole Cake Island",
            "Sabaody Archipelago",
            "Amazon Lily",
            "Punk Hazard",
            3)

        val que66 = Question(66,
            "Where did the Straw Hat Pirates first meet Nico Robin?", R.drawable.missallsunday,
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

        val que90 = Question(90,
            "What is the name of the worrior tribe living in Skypiea?", R.drawable.shandorians,
            "Minks",
            "Shandorians",
            "Skymans",
            "Tontatta",
            2)

        val que91 = Question(91,
            "Who was considered as GOD in Skypiea?", R.drawable.skyisland,
            "Crocodile",
            "Rob Lucci",
            "Eneru",
            "Donquixote Doflamingo",
            3)

        val que92 = Question(92,
            "What are the special items that found in Skypiea", R.drawable.dials,
            "Dials",
            "Shells",
            "Sea Prism",
            "Lamps",
            1)

        val que93 = Question(93,
            "How many berries did Nami have to gather for Arlong in order to free Cocoyasi Village?", R.drawable.arlong,
            "100,000 Berries",
            "1,000,000 Berries",
            "10,000,000 Berries",
            "100,000,000 Berries",
            4)

        val que94 = Question(94,
            "What is the name of the Straw Hats' first ship?", R.drawable.goingmerry,
            "Going Merry",
            "Merry Go",
            "Merry",
            "Thousand Sunny",
            1)

        val que95 = Question(95,
            "Which devil fruit was the first to appear after Luffy's?", R.drawable.devilfruits,
            "Slip-Slip Fruit",
            "Boom-Boom Fruit",
            "Chop-Chop Fruit",
            "Dice-Dice Fruit",
            3)

        val que96 = Question(96,
            "What is the name of Brook's old crew?", R.drawable.rumba,
            "The Roshio Pirates",
            "The On-Air Pirates",
            "The Rumbar Pirates",
            "The Spade Pirates",
            3)

        val que97 = Question(97,
            "Who took over Chopper's body in Punk Hazard?", R.drawable.punkhazard,
            "Franky",
            "Sanji",
            "Nami",
            "Usopp",
            1)

        val que98 = Question(98,
            "Who took over Chopper's body in Punk Hazard?", R.drawable.punkhazard,
            "Franky",
            "Sanji",
            "Nami",
            "Usopp",
            1)

        val que99 = Question(99,
            "Where was Gol D. Roger executed?", R.drawable.rogerdeath,
            "Raftel",
            "Loguetown",
            "Goa Kingdom",
            "Jaya",
            2)

        val que100 = Question(100,
            " What is the only race/tribe you can't find on Tottoland?", R.drawable.tottoland,
            "Mink Tribe",
            "Longarm Tribe",
            "Giants",
            "Three-Eye Tribe",
            3)

        val que101 = Question(101,
            " Who is the first Child of Charlotte Linlin?", R.drawable.bigmom,
            "Charlotte Katakuri",
            "Charlotte Oven",
            "Charlotte Lola",
            "Charlotte Perospero",
            4)

        val que102 = Question(102,
            " Which race does King belongs to?", R.drawable.king,
            "Lunarians",
            "Kuja ",
            "Torino",
            "Minks",
            1)

        val que103 = Question(103,
            " What is the name of the notorious family to which Sanji belongs to?", R.drawable.vinssmoke,
            "Chef Family",
            "Charlotte Family",
            "Vinsmoke Family",
            "Donquixote Family",
            3)

        val que104 = Question(104,
            " What is the name of the Observation Haki in the Skypiea ?", R.drawable.enel,
            "Haoshoku Haki",
            "Third Eye",
            "Busoshoku Haki",
            "Mantra",
            4)

        val que105 = Question(105,
            "What is the name of Smoker's ship ?", R.drawable.smoker,
            "G-2",
            "White Striker",
            "The Ironclad",
            "The Seastone",
            1)

        val que106 = Question(106,
            "Who is Ace's biological father?", R.drawable.ace,
            "Whitebeard",
            "Dragon",
            "Gol D. Roger",
            "Garp",
            3)

        val que107 = Question(107,
            "What type of Devil Fruit does Marco, 1st Division Commander of the Whitebeard Pirates possess?", R.drawable.marco,
            "Logia-type",
            "Zoan-type",
            "Paramecia-type",
            "Mythical Zoan-type",
            4)

        val que108 = Question(108,
            "What is the name of the Celestial Dragon in the One Piece series who caused trouble at the Human Auctioning House?", R.drawable.saintcharlos,
            "Saint Roswald",
            "Saint Jalmack",
            "Saint Charlos",
            "Saint Mjosgard",
            3)

        val que109 = Question(109,
            "What was the name of Jinbe’s former captain while he was a member of the Sun Pirates?", R.drawable.sunpirates,
            "Fishing Tiger",
            "Fisher Tiger",
            "Sea Tiger",
            "Ocean Tiger",
            2)

        val que110 = Question(110,
            "How many times was Whitebeard shot with bullets during the Paramount War?", R.drawable.whitebd,
            "152",
            "72",
            "267",
            "46",
            1)

        val que111 = Question(111,
            "Which Devil Fruit does Whitebeard possess?", R.drawable.wb,
            "Gomu Gomu no Mi",
            " Mera Mera no Mi",
            "Gura Gura no Mi",
            "Hie Hie no Mi",
            3)

        val que112 = Question(112,
            "What Sea does Sanji originally come from?", R.drawable.sanji1,
            "The East Blue",
            "The West Blue",
            "The North Blue",
            "The South Blue",
            3)

        val que113 = Question(113,
            "Where did  Dorry & Brogy  kept fighting for 100 years?", R.drawable.dorry_vs_brogy,
            "Elbaf",
            "Little Garden",
            "Totto land",
            "Jaya",
            2)

        val que114 = Question(114,
            "Who is the current warden of Impel Down?", R.drawable.magellan,
            "Saldeath",
            "Hannyabal",
            "Domino",
            "Magellan",
            4)

        val que115 = Question(115,
            "What is the name of Conis's pet?", R.drawable.su,
            "Fhu",
            "Su",
            "Fu",
            "Shu",
            2)

        val que116 = Question(116,
            "What was captain Kuro's undercover name when he was in Kaya's mansion?", R.drawable.kuro,
            "Klahadore",
            "Chakrams",
            "Nugire Yainu",
            "Bezan",
            1)

        val que117 = Question(117,
            "Who is the first person to escape Impel Down?", R.drawable.impel,
            "Shiki",
            "Luffy",
            "Emporio Ivankov",
            "Shiryu",
            1)

        val que118 = Question(118,
            "Who sacrificed himself to save Luffy from Impel Down?", R.drawable.bonclay,
            "Jinbe",
            "Ivankov",
            "Bon Clay",
            "Crocodile",
            3)

        val que119 = Question(119,
            "How many children does Charlotte Linlin have?", R.drawable.bigmom,
            "79",
            "81",
            "76",
            "85",
            4)

        val que120 = Question(120,
            "How many children does Charlotte Linlin have?", R.drawable.bigmom,
            "79",
            "81",
            "76",
            "85",
            4)

        val que121 = Question(121,
            "Which pirate crew made the promise to return to Laboon?", R.drawable.laboon,
            "Whitebeard Pirates",
            "Roger Pirates",
            "Rumbar Pirates",
            "Red-Haired Pirates",
            3)

        val que122 = Question(122,
            "What is the main reason Zunesha is wandering the seas?", R.drawable.zunesha,
            "Searching for treasure",
            "As punishment for a crime",
            "Looking for its lost family",
            "Following an eternal log pose",
            2)

        val que123 = Question(123,
            "What special transformation can Carrot undergo during a full moon?", R.drawable.carrot_sulong_form_one_piece,
            "Sulong",
            "Minks",
            "Awakening",
            "Demons",
            1)

        val que124 = Question(124,
            "What unusual ability did Momonosuke gain from his artificial Devil Fruit?", R.drawable.momo,
            "The ability to control weather",
            "The ability to turn invisible",
            "The ability to transform into a dragon",
            "The ability to manipulate gravity",
            3)

        val que125 = Question(125,
            "What is Admiral Fujitora's real name?", R.drawable.fujitora,
            "Issho",
            "Sakazuki",
            "Kizaru",
            "Tsuru",
            1)

        val que126 = Question(126,
            "What is the true identity of the pirate known as Joker?", R.drawable.dressrosa,
            "Kaido",
            "Big Mom",
            " Marshall D. Teach",
            "Donquixote Doflamingo",
            4)

        val que127 = Question(127,
            "What was the name of the ship owned by the Roger Pirates?", R.drawable.roger,
            "Thousand Sunny",
            "Oro Jackson",
            " Moby Dick",
            "Going Merry",
            2)

        val que128 = Question(128,
            "What is the real name of the pirate known as Blackbeard?", R.drawable.blackbeard,
            "Edward Newgate",
            "Charlotte Linlin",
            "Marshall D. Teach",
            "Gol D. Roger",
            3)

        val que129 = Question(129,
            "What is the name of Zoro's cursed sword?", R.drawable.zorosword,
            "Shusui",
            "Wado Ichimonji",
            "Kitetsu III",
            "Sandai Kitetsu",
            4)

        val que130 = Question(130,
            "Who was the Captain of the Rumbar Pirates?", R.drawable.rumba,
            "Brook",
            "Yorki",
            "Fisher Tiger",
            " Hatchan",
            2)

        val que131 = Question(131,
            "What is the name of the island where Luffy and his crew encounter the scientist Caesar Clown?", R.drawable.caesarclown,
            "Punk Hazard",
            "Dressrosa",
            "Zou",
            "Wano",
            1)

        val que132 = Question(132,
            "What is the name of the whale that the Straw Hat Pirates meet at Reverse Mountain?", R.drawable.laboon,
            "Zunisha",
            "Surume",
            "Laboon",
            "Moo Moo",
            3)

        val que133 = Question(133,
            "Which Gear Fourth form did Luffy first use in the fight against Doflamingo?", R.drawable.gearfourth,
            "Tankman",
            "Boundman",
            "Snakeman",
            "Gear Second",
            2)

        val que134 = Question(134,
            "In which arc did Luffy first reveal Gear Second?", R.drawable.secondgear,
            "Enies Lobby",
            "Skypiea",
            "Water 7",
            "Dressrosa",
            1)

        val que135 = Question(135,
            "Which member of the Worst Generation has the epithet 'Magician'?", R.drawable.basile,
            "Urouge",
            "Basil Hawkins",
            "Capone Bege",
            "X Drake",
            2)

        val que136 = Question(136,
            "What is the real identity of the character known as Kyoshiro?", R.drawable.denjiro,
            "Kanjuro",
            "Kin'emon",
            "Kawamatsu",
            "Denjiro",
            4)

        val que137 = Question(137,
            "Raizo swore allegiance to which clan in Wano?", R.drawable.raizo,
            "Kurozumi Clan",
            "Shimotsuki Clan",
            "Kozuki Clan",
            "Amatsuki Clan",
            3)

        val que138 = Question(138,
            "What type of Devil Fruit is the Hie Hie no Mi, consumed by Aokiji?", R.drawable.aokiji,
            "Paramecia",
            "Zoan",
            "Logia",
            "Mythical Zoan",
            3)

        val que139 = Question(139,
            "Who is the current user of the Ito Ito no Mi?", R.drawable.ito_ito_nomi,
            "Donquixote Doflamingo",
            "Crocodile",
            "Trafalgar Law",
            "Boa Hancock",
            1)

        val que140 = Question(140,
            "Which Devil Fruit was eaten by Charlotte Katakuri?", R.drawable.katakuri,
            "Doru Doru no Mi",
            "Mochi Mochi no Mi",
            "Bari Bari no Mi",
            "Doku Doku no Mi",
            2)


















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
        allQuestions.add(que30)
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
        allQuestions.add(que89)
        allQuestions.add(que90)
        allQuestions.add(que91)
        allQuestions.add(que92)
        allQuestions.add(que93)
        allQuestions.add(que94)
        allQuestions.add(que95)
        allQuestions.add(que96)
        allQuestions.add(que97)
        allQuestions.add(que98)
        allQuestions.add(que99)
        allQuestions.add(que100)
        allQuestions.add(que101)
        allQuestions.add(que102)
        allQuestions.add(que103)
        allQuestions.add(que104)
        allQuestions.add(que105)
        allQuestions.add(que106)
        allQuestions.add(que107)
        allQuestions.add(que108)
        allQuestions.add(que109)
        allQuestions.add(que110)
        allQuestions.add(que111)
        allQuestions.add(que112)
        allQuestions.add(que113)
        allQuestions.add(que114)
        allQuestions.add(que115)
        allQuestions.add(que116)
        allQuestions.add(que117)
        allQuestions.add(que118)
        allQuestions.add(que119)
        allQuestions.add(que120)
        allQuestions.add(que121)
        allQuestions.add(que122)
        allQuestions.add(que123)
        allQuestions.add(que124)
        allQuestions.add(que125)
        allQuestions.add(que126);
        allQuestions.add(que127);
        allQuestions.add(que128);
        allQuestions.add(que129);
        allQuestions.add(que130);
        allQuestions.add(que131);
        allQuestions.add(que132);
        allQuestions.add(que133);
        allQuestions.add(que134);
        allQuestions.add(que135);
        allQuestions.add(que136);
        allQuestions.add(que137);
        allQuestions.add(que138);
        allQuestions.add(que139);
        allQuestions.add(que140);



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