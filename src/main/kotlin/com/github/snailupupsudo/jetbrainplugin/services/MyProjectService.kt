package com.github.snailupupsudo.jetbrainplugin.services

import com.intellij.openapi.project.Project
import com.github.snailupupsudo.jetbrainplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
