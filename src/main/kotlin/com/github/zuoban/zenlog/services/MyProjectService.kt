package com.github.zuoban.zenlog.services

import com.intellij.openapi.project.Project
import com.github.zuoban.zenlog.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
