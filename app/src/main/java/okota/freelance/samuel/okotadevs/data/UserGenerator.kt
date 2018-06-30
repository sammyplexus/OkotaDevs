package okota.freelance.samuel.okotadevs.data

object UserGenerator {
    fun getUsers() : ArrayList<Users> {
        val list = ArrayList<Users>()
        with (list){
            val user = Users("Samuel Agbede", "09055052360", "I'm an android developer who loves building worthy solutions")

            add(user)
        }

        return list
    }
}