//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Java 10--
    String greeting = "Hi Pola!";
    float numberOne = 10;
    float numberTwo = 3;
    int a = 10, b = 3;
    System.out.println("a / b: "+ a / b);      // → ?
    System.out.println("a % b: "+ a % b);      // → ?
    System.out.println(b == 10);


    var greeting1 = "Hello World!";
    var numberOfOptions1 = 3;
    var mobilityIndicator1 = true;

    //Most popular JDK versions: 8, 11, 17, 21

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format(greeting));

    //Declare a String
    String leo = "leo";
    String leo2 = "LEO";
    if (leo2.equals(leo)) {
        IO.println("Leo es igual");
    }


    int edad = 17;
    IO.println("edad: "+ edad);


    boolean tieneCC = false;
    IO.println("La persona tiene CC? : " + tieneCC);

    if (!tieneCC) {
        IO.println(greeting);
        throw new RuntimeException("This is an exception!");
    }

    callSomething();

    String msg;
    int num = 0;
    if (num % 2 == 0) {
        msg = "Par";
    } else if (num % 3 == 0) {
        msg = "Impar";
    } else if (num % 4 == 0) {
        msg = "Repetir";
    } else if (num % 5 == 0) {
        msg = "Repetir";
    }

    switch (num) {
        case 0:
            msg = "Par";
            break;
        case 1:
            msg = "Impar";
            break;
        case 2:
            msg = "Repetir";
            break;
        case 3:
            msg = "Repetir";
            break;
        default:
            msg = "No es par ni impar ni repetir";
    }


    String msg2 = (num % 2 == 0) ? "Par" : "Impar";
    IO.println(msg);
// mismo resultado ✅


    while(true){

    }

}

/**
 * This is a method for call something
 */
private void callSomething() {
    IO.println("Calling something");
}
