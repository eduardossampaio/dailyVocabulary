package apps.esampaio.com.dailyvocabulary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform