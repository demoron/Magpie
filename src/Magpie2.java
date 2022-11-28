
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
        String trimmed = statement.trim();

        if (statement.indexOf("Yes") >= 0)
        {
            response = "Yes is a good word";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }

          else  if (statement.indexOf("pet")>=0
                || statement.indexOf("cat" ) >= 0
                || statement.indexOf("dog") >=0) {
            response= "Tell me more about your pet(s)";
    }

          else if(statement.indexOf("Friday")>=0) {
            response = "Woo friday!";
        }
          else if(statement.indexOf("tired")>=0) {
              response= "I'm also tired";
        }

          else if(trimmed.length()==0) {
            response = "Please say something";

        }

              else
            response = getRandomResponse();
        return response;
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
        else if(whichResponse == 4) {
            response = "You suck";
        }
        else if(whichResponse == 5){
            response = "I am bored";
        }

        return response;
    }
}