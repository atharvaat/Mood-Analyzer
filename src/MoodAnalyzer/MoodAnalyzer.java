package MoodAnalyzer;

public class MoodAnalyzer {
    public String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

   
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
    }
}
    