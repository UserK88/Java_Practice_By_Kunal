package Arrayss;
import java.util.Arrays;
public class NewsFeed {

    // Create getTopics() below:
      public String[] getTopics(){
         String [] topics = {"Opinion", "Tech", "Science", "Health"};
         return topics;
      }
    String [] topics = {"Opinion", "Tech", "Science", "Health"};
    int [] views = {0,0,0,0};

    public String getFirstTopic(){
        return topics[0];
    }

    public void viewTopic(int topicIndex){
        views[topicIndex]=views[topicIndex]+1;
    }

    String [] favoriteArticles;

    public NewsFeed(){
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticles(int favoriteIndex, String newArticle){
        favoriteArticles[favoriteIndex]=newArticle;
    }
        public static void main(String[] args) {
        NewsFeed sampleFeed = new NewsFeed();
        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);
        System.out.println(Arrays.toString(topics));

        sampleFeed.viewTopic(0);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);

        System.out.println("The topic '"+sampleFeed.topics[1]+"' has been viewed "+sampleFeed.views[1]+" times");

        sampleFeed.setFavoriteArticles(0, "An Article");
        sampleFeed.setFavoriteArticles(1, "An Article");
        sampleFeed.setFavoriteArticles(2, "An Article");
        sampleFeed.setFavoriteArticles(3, "An Article");
        sampleFeed.setFavoriteArticles(4, "An Article");
        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}
