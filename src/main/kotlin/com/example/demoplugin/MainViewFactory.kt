package com.example.demoplugin

import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory

class MainViewFactory : ToolWindowFactory, DumbAware {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val mainForm = MainForm()
        val contentManager = toolWindow.contentManager
        val content = contentManager.factory.createContent(mainForm.mainPanel, "", true)
        contentManager.addContent(content)
    }
//todo adb controller
}