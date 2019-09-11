package course.chapter8.exercise.applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import course.chapter8.exercise.entities.Comment;
import course.chapter8.exercise.entities.Post;

public class Program2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
	
		Post p1 = new Post(
				sdf.parse("09/09/2019 23:33:15"),
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		
		Post p2 = new Post(
				sdf.parse("07/08/2019 22:10:15"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		System.out.println(p1);
		System.out.println(p2);
				
	}

}
