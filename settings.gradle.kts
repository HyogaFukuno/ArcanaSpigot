rootProject.name = "arcanaspigot"

includeBuild("build-logic")

fun setupSubproject(name: String, dir: String) {
    include(":$name")
    project(":$name").projectDir = file(dir)
}

setupSubproject("arcanaspigot-server", "PandaSpigot-Server")
setupSubproject("pandaspigot-api", "PandaSpigot-API")
setupSubproject("paperclip", "paperclip")
