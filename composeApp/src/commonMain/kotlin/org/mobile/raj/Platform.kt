package org.mobile.raj

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform