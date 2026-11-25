import picocli.CommandLine;

import static java.lang.IO.println;

@CommandLine.Command(name = "pokemon", mixinStandardHelpOptions = true, version = "1.0", description = "Pokemon CLI")
public class MainCLI implements Runnable {
    @CommandLine.Parameters(index = "0", description = "Command: get")
    private String command;

    @CommandLine.Parameters(index = "1", description = "Parameter: pokemon name or id")
    private String parameter;

    @Override
    public void run(){
        switch (command.toLowerCase()){
            case "get":
                // print pokemon, use custom class to check in database or request from network
                println(); // Pokemon
        }
    }
}
