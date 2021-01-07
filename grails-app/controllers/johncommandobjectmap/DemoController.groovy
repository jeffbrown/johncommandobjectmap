package johncommandobjectmap

import demo.PauseTaskCmd

class DemoController {

    def pauseScheduledTask(PauseTaskCmd cmd) {
        render "cmd.idToCheckedValue -> ${cmd.idToCheckedValue}"
    }
}
