pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven ("https://jitpack.io")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven ("https://jitpack.io")

    }
}

rootProject.name = "Blood Donation"
include(":app")
