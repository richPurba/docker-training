import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.io.IOException;

@Path("random")
public class RestController {

    @GET
    public RandomNumber getRandomNumber() throws IOException {
        RandomNumber randomNumber = null;
     try{
         RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
         randomNumber =  randomNumberGenerator.getRandomNumber();
     }catch (IOException e){
         throw new IOException("error is thrown");
     }
     return randomNumber;
    }

}
