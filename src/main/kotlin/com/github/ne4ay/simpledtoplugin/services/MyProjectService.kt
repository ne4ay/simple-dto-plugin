package com.github.ne4ay.simpledtoplugin.services

import com.intellij.openapi.project.Project
import com.github.ne4ay.simpledtoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
