public class KeywordsDetector {
    public static void main(String[] args) {
       String[] sentences = {
        "Our product will transform the market",
        "Programming is both painful and engaging",
        "This has nothing to do with machine learning",
        "We need to leverage our core competencies",
        "Let's talk about data and algorithms",
        "Chatbots are great but must be used carefully",
        "This blockchain-based solution will disrupt the industry",
        "The team showed great Synergy in the last project",
        "Use simple words without hype and fluff",
        "Our new technology presents a significant paradigm shift",
        "Effective presentations must be clear concise and humble"
    };
        // Some keywords that typically signal bullshit contents in business presentations 
       String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
       detectAndPrint(sentences, keywords);

      // String [] arr = words(sentences[0]);
      // for(int i=0; i< arr.length; i++){
       // System.out.println(arr[i]);

     //  }
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] arrSen= new String[0];

        for(int i=0; i<sentences.length; i++){
            arrSen = words(sentences[i]);
            for(int j=0; j<arrSen.length; j++){
                for(int k=0; k<keywords.length; k++){
                    if(arrSen[j].toLowerCase().equals(keywords[k].toLowerCase())){
                        System.out.println(sentences[i]);
                        break;
                    }
            }
        }
    }
    }


    private static String[] words(String str) {
        int counter =0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                counter++;
            }
        }

        String[] words = new String[counter+1];
        counter=0;
        int emptyString = 0;

        while(str.contains(" ")){
            emptyString = str.indexOf(" ");
            words[counter] = str.substring(0, emptyString);
            counter ++;
            str = str.substring(emptyString+1);

        }

        words[counter] = str;
        return words;

    }
     
}
