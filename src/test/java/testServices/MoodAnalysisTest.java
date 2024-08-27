package testServices;
import static org.junit.jupiter.api.Assertions.*;
import org.example.MoodAnalysis;
import org.junit.jupiter.api.Test;

public class MoodAnalysisTest {

    @Test
    void test() {
        MoodAnalysis obj = new MoodAnalysis("I am in Sad mood");
        String ans = obj.mood();
        assertEquals("SAD",ans);
    }

    @Test
    void moodTest() {
        MoodAnalysis obj = new MoodAnalysis("I am in Happy mood");
        String res = obj.mood();
        assertEquals("HAPPY",res);
    }

    @Test
    void moodNullTest() {
        MoodAnalysis obj = new MoodAnalysis(null);
        String res = obj.mood();
        assertEquals("HAPPY",res);
    }

}
