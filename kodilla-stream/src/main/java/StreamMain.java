import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[]args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hi Mate",(text) -> text.toUpperCase());
        poemBeautifier.beautify("I'm tired",(text) -> text.replace('t', 'f'));
        poemBeautifier.beautify("...and hungry", (text) -> text.substring(1,13));
        poemBeautifier.beautify("Goodnight.", (text -> text.concat(" Zzz")));
    }
}
