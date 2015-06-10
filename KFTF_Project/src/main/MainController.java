package main;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class MainController {

	public MainController() {
		// TODO Auto-generated constructor stub
	}
	//teststststststs
	public static void main(String[] args) {

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("p4h5GnRN1PifAiLqPq6Advsgv");
		cb.setOAuthConsumerSecret("zJWx8uzmRjZvEx1idTb3M3HrbcnzKsfVYKhFmnlRo4mdrCVil6");
		cb.setOAuthAccessToken("307545859-kPrLZrDsRbZjaYYzDclEbIV62o1O6fqaKXpEODC9");
		cb.setOAuthAccessTokenSecret("Mbj06hTbxZMXfHlF96l2qfDUJDZvAzVDLjrzoTl4hAjmw");
		
		 TwitterFactory tf = new TwitterFactory(cb.build());

		try {
			Twitter twitter = tf.getInstance();
			//long id = 3063900783L;
			List<Status> statuses = twitter.getFavorites();
			for (Status status : statuses) {
				System.out.println(twitter.getScreenName() + " - " + status.getText());
			}
			System.out.println("done.");
			System.exit(0);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to get favorites: " + te.getMessage());
			System.exit(-1);
		}
	}

}
