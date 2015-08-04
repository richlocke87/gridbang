object Timer {
    def main(args: Array[String]) {
        startTimer(() => println("Wut?"))
    }
    
    def startTimer(callback: () => Unit) {
        while(true) {
            callback()
            Thread sleep 1000
        }
    }
}