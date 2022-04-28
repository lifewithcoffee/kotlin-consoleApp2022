package fileDemos

import java.io.File

fun listFiles(targetPath: String) {
    val folders = File(targetPath).listFiles { file -> file.isDirectory && file.name.contains("")}
    folders?.forEach { folder -> println(folder) }
}
