package activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *             Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting     
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0
                )
        {
            response = "Tell me more about your family.";
        }
        else if(statement.indexOf("cat") >=0
            || statement.indexOf("dog") >=0) {
            response = "Tell me more about your pets.";
        }
        else if(statement.indexOf("Mr. Jaffe")>=0 ){
            response = "He sounds like an excellent teacher!";
        }
        else if (statement.indexOf("hey") >=0){
            response = "ayo";
        }
        else if (statement.indexOf("help") >=0){
            response = "should i call virtual ambulance";
        }
        else if (statement.indexOf("are you a bot") >=0 ) {
            response = "no of course im not a bot, people often think i am by how boring and repeative i am but i really havent learned how to expereince with other people very much";
        }
        else
        {
            response = getRandomResponse();
        }
        return response.trim();
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4){
            response = "may you elaborate";
        }
        else if (whichResponse == 5){
            response = "i do not know the answer to the universe try again please";
        }
        return response;
    }
}
