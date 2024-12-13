package com.example.tes

val movie = intArrayOf(R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground)

fun film() {
    val filmArray = Array(3) { Array(7) { arrayOfNulls<Any>(3) } }

    //Film Trending
    filmArray[0][0] = arrayOf("Red One", 6.8, "After Santa Claus (codename: Red One) is kidnapped, the North Pole's Head of Security must team up with the world's most infamous tracker in a globe-trotting, action-packed mission to save Christmas.")
    filmArray[0][1] = arrayOf("Venom: The Last Dance", 6.7, "Eddie and Venom are on the run. Hunted by both of their worlds and with the net closing in, the duo are forced into a devastating decision that will bring the curtains down on Venom and Eddie's last dance.")
    filmArray[0][2] = arrayOf("Secret Level", 8.0, "Adult animated series of original short stories which are set within the worlds of beloved video games. Each episode serves as a gateway to a new adventure, unlocking exciting worlds from beloved gaming classics and highly anticipated new titles.")
    filmArray[0][3] = arrayOf("Carry-On", 7.3, "A young TSA agent fights to outsmart a mysterious traveler who blackmails him into letting a dangerous package slip onto a Christmas Eve flight.")
    filmArray[0][4] = arrayOf("Heretic", 7.0, "Two young missionaries are forced to prove their faith when they knock on the wrong door and are greeted by a diabolical Mr. Reed, becoming ensnared in his deadly game of cat-and-mouse.")
    filmArray[0][5] = arrayOf("Kraven the Hunter", 6.1, "Kraven Kravinoff's complex relationship with his ruthless gangster father, Nikolai, starts him down a path of vengeance with brutal consequences, motivating him to become not only the greatest hunter in the world, but also one of its most feared.")
    filmArray[0][6] = arrayOf("One Hundred Years of Solitude", 9.1, "In the mythical town Macondo, seven generations of the Buendía family navigate love, oblivion and the inescapability of their past — and their fate.")

    //Film Horror
    filmArray[1][0] = arrayOf("Apocalypse Z: The Beginning of the End", 6.9, "When a kind of rabies that transforms people into aggressive creatures spreads across the planet, Manel isolates himself at home with his cat, relying on his wits to survive; but soon they must go out in search of food, by land and by sea, dodging many dangers.")
    filmArray[1][1] = arrayOf("Smile 2", 6.6, "About to embark on a new world tour, global pop sensation Skye Riley begins experiencing increasingly terrifying and inexplicable events. Overwhelmed by the escalating horrors and the pressures of fame, Skye is forced to face her dark past to regain control of her life before it spirals out of control.")
    filmArray[1][2] = arrayOf("Alien: Romulus", 7.2, "While scavenging the deep ends of a derelict space station, a group of young space colonizers come face to face with the most terrifying life form in the universe.")
    filmArray[1][3] = arrayOf("The Substance", 7.2, "A fading celebrity decides to use a black market drug, a cell-replicating substance that temporarily creates a younger, better version of herself.")
    filmArray[1][4] = arrayOf("Terrifier 3", 6.8, "Five years after surviving Art the Clown's Halloween massacre, Sienna and Jonathan are still struggling to rebuild their shattered lives. As the holiday season approaches, they try to embrace the Christmas spirit and leave the horrors of the past behind. But just when they think they're safe, Art returns, determined to turn their holiday cheer into a new nightmare. The festive season quickly unravels as Art unleashes his twisted brand of terror, proving that no holiday is safe.")
    filmArray[1][5] = arrayOf("Arena Wars", 5.4, "In 2045 convicted criminals are given the opportunity to compete on the world's #1 televised sporting event, Arena Wars. They must survive 7 rooms and 7 of the most vicious killers in the country. If they win, they regain their freedom.")
    filmArray[1][6] = arrayOf("Arcadian", 6.1, "In the near future, on a decimated Earth, Paul and his twin sons face terror at night when ferocious creatures awaken. When Paul is nearly killed, the boys come up with a plan for survival, using everything their father taught them to keep him alive.")

    //Film Action
    filmArray[2][0] = arrayOf("Venom: The Last Dance", 6.7, "Eddie and Venom are on the run. Hunted by both of their worlds and with the net closing in, the duo are forced into a devastating decision that will bring the curtains down on Venom and Eddie's last dance.")
    filmArray[2][1] = arrayOf("Elevation", 6.4, "A single father and two women venture from the safety of their homes to face monstrous creatures to save the life of a young boy.")
    filmArray[2][2] = arrayOf("Absolution", 6.1, "An aging ex-boxer gangster working as muscle for a Boston crime boss receives an upsetting diagnosis. Despite a faltering memory, he attempts to rectify the sins of his past and reconnect with his estranged children. He is determined to leave a positive legacy for his grandson, but the criminal underworld isn’t done with him and won’t loosen their grip willingly.")
    filmArray[2][3] = arrayOf("Armor", 5.6, "Armored truck security guard James Brody is working with his son Casey transporting millions of dollars between banks when a team of thieves led by Rook orchestrate a takeover of their truck to seize the riches. Following a violent car chase, Rook soon has the armored truck surrounded and James and Casey find themselves cornered onto a decrepit bridge.")
    filmArray[2][4] = arrayOf("Watchmen: Chapter II", 7.6, "Suspicious of the events ensnaring their former colleagues, Nite Owl and Silk Spectre are spurred out of retirement to investigate. As they grapple with personal ethics, inner demons and a society turned against them, they race the clock to uncover a deepening plot that might trigger global nuclear war.")
    filmArray[2][5] = arrayOf("Miraculous World, London: At the Edge of Time", 8.5, "To save the future from a terrible fate, Marinette becomes Chronobug and teams up with Bunnyx to defeat a mysterious opponent who travels through time. Who is this new supervillain, and why are they obsessed with exposing Marinette's secret superhero identity? Marinette's only hope is to defeat her new opponent to prevent the end of Ladybug and time itself!")
    filmArray[2][6] = arrayOf("Red One", 6.8, "After Santa Claus (codename: Red One) is kidnapped, the North Pole's Head of Security must team up with the world's most infamous tracker in a globe-trotting, action-packed mission to save Christmas.")

    val kategori = listOf("Trending", "Horror", "Action")

    for ((index, jenis) in filmArray.withIndex()) {
        for (filmArray in jenis) {
            val title = filmArray[0]
            val rating = filmArray[1]
            val description = filmArray[2]
            println("Judul      : $title")
            println("Rating     : $rating")
            println("Deskripsi  : $description")
        }
    }
}