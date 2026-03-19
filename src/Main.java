//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Java 10--
    String greeting = "Hello World!";
    int numberOfOptions = 3;
    boolean mobilityIndicator = true;

    // Using vars Java 10+
    var greeting1 = "Hello World!";
    var numberOfOptions1 = 3;
    var mobilityIndicator1 = true;

    //Most popular JDK versions: 8, 11, 17, 21

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format(greeting));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }

    if (true) {
        //TIP Press <shortcut actionId="Run"/> to run the code, and then press <shortcut actionId="Stop"/> to stop it.
        IO.println(greeting);
        throw new RuntimeException("This is an exception!");
    }

    callSomething();


}

/**
 * This is a method for call something
 */
private void callSomething() {
    IO.println("Calling something");
}
