package Synatax;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by limerickgangster on 9/7/16.
 */
public class Extractor {

    public Map<Integer,String[]> extractSentencesFromText(String text){
        String[] sentencesRaw = text.split("[.!?]");

        Map<Integer, String[]> SentenceMap = new HashMap<Integer,String[]>();
        int loopCount = 0;
        for (String sentence : sentencesRaw) {
            String[] words = sentence.split(" ");
            SentenceMap.put(loopCount++,words);
        }
            return  SentenceMap;
        }

}

