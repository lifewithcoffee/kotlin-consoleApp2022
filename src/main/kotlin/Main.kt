import classDemos.doClassDemo
import collectionDemos.testArray
import fileDemos.listFiles
import functionDemos.getFunctionFromFile
import functionDemos.lambdaDemo

fun main(args: Array<String>) {
    printArgs(args)

    // just call the first function for testing
    // can use ::fnName and {} to the same arrayOf --> TODO: why?
    arrayOf(
        { listFiles("d:\\_temp") },
        { lambdaDemo() },
        { doClassDemo() },
        { testLoop() },
        { testArray() },
        { getFunctionFromFile(args[0], args[1])?.call() },
        {})[0]();       // the last parameter {} is just a placeholder for its previous ','
}

fun printArgs(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    if (args.isNotEmpty()) {
        print("args: ")
        for (arg in args){
            print(arg)
            print(' ')
        }
        println()
    }
}