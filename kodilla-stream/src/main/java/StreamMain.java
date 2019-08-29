import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.beautifier.PoemBeautifier;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[]args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hi Mate",(text) -> text.toUpperCase());
        poemBeautifier.beautify("I'm tired",(text) -> text.replace('t', 'f'));
        poemBeautifier.beautify("...and hungry", (text) -> text.substring(1,13));
        poemBeautifier.beautify("Goodnight.", (text -> text.concat(" Zzz")));

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResult = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getPostsCount() > 0)
                .filter(forumUser -> forumUser.calculateAge() >= 20)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("Size: " + theResult.size());
        theResult.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}
