package practisePrograms;

public interface InterfaceExamp {
    void connect();
    void disconnect();
}
class mysql implements InterfaceExamp {
    public void connect() {
        System.out.println("connecting to the sql server");
    }
    public void disconnect() {
        System.out.println("disconnecting from the server");
    }
}
class oracledb implements InterfaceExamp {
    public void connect() {
        System.out.println("connecting to the oracle db server");
    }
    public void disconnect() {
        System.out.println("disconnecting from the server");
    }
}
class InterfaceDemo {
    public static void main(String[] args) throws Exception {
        oracledb orc1 = new oracledb();
        orc1.connect();
        orc1.disconnect();
        mysql ms1 = new mysql();
        ms1.connect();;
        ms1.disconnect();
        /*
        // Check if at least one command-line argument is provided
        if (args.length < 1) {
            // Print a message if no arguments are provided and exit the program
            System.out.println("Please provide a class name as a command-line argument.");
            return;
        }

        try {
            // Load the class specified in the first command-line argument
            Class<?> c = Class.forName("practisePrograms." + args[0]);

            // Create an instance of the loaded class using reflection
            InterfaceExamp instance = (InterfaceExamp) c.getDeclaredConstructor().newInstance();

            // Invoke the connect and disconnect methods on the created instance
            instance.connect();
            instance.disconnect();
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException if the specified class is not found
            System.out.println("Class not found: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exception that might occur during class loading or instantiation
            System.out.println("Error occurred: " + e.getMessage());
        }
         */

    }
}
