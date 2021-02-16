package com.github.gfirey.razeridea.services

import com.github.gfirey.razeridea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
