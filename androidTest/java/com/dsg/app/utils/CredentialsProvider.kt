object CredentialsProvider {
    fun getCredentials(): Pair<String, String> {
        val arguments = InstrumentationRegistry.getArguments()
        val username = arguments.getString("username") ?: throw IllegalStateException("Username not provided")
        val password = arguments.getString("password") ?: throw IllegalStateException("Password not provided")
        return username to password
    }
}