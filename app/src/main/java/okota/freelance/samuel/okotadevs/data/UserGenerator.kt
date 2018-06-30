package okota.freelance.samuel.okotadevs.data

object UserGenerator {
    fun getUsers() : ArrayList<Users> {
        val list = ArrayList<Users>()
        with (list){
            val user = Users("Samuel Agbede", "09055052360", "I'm an android developer who loves building worthy solutions")

            val femi = Users("Femi Sotonwa", "07019103894", "Software Developer")
            val chibuzor = Users("Chibuzor Ojukwu", "07018606789","Software Developer")
            val oluwole = Users("Oluwole Ilesanmi", "07030565701", "Software Developer")

            val clifford = Users("Clifford Odoh", "08169794997", "Software Developer")

            val henry = Users("Henry Ezeagu", "07064649056", "Software Developer")

            val ifunanya = Users("Ifunanya Albert", "08165640882", "Software Developer")

            add(user)
            add(femi)
            add(chibuzor)
            add(oluwole)
            add(clifford)
            add(henry)
            add(ifunanya)

        }

        return list
    }
}