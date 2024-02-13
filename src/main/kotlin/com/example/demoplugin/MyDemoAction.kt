package com.example.demoplugin


import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class MyDemoAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val message = "Great! You just created your first action!"
        Messages.showMessageDialog(
            e.project,
            message,
            "My First Action",
            Messages.getInformationIcon()
        )
    }
}
