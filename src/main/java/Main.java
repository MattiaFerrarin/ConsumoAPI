import picocli.CommandLine;

import static java.lang.IO.println;

void main() {
    new CommandLine(new MainCLI()).execute();
    API api = new API();
    try{
        Pokemon pokemon = api.getPokemonByName("pikachu");
        println(pokemon);
    } catch (IOException e) {
        println("IOException: "+e.getMessage());
    } catch (InterruptedException e) {
        println("InterruptedException: "+e.getMessage());
    }
}