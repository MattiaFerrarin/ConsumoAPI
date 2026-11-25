import static java.lang.IO.println;

void main() {
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