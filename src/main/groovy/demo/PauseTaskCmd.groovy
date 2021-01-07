package demo

import grails.validation.Validateable

class PauseTaskCmd implements Validateable {

    String taskName
    String taskGroup
    Map<String, Boolean> idToCheckedValue = new HashMap<>();

    static constraints = {
        taskName nullable: false
        taskGroup nullable: false
    }
}