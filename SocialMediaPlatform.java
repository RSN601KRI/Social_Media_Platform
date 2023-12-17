
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialMediaPlatform {
    private Map<String, User> users;

    public SocialMediaPlatform() {
        this.users = new HashMap<>();
    }

    public void addUser(String username) {
        users.put(username, new User(username));
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public void postMessage(String username, String content) {
        User user = users.get(username);
        if (user != null) {
            Post post = new Post(content);
            user.addPost(post);
            System.out.println("Message posted successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    public void displayTimeline(String username) {
        User user = users.get(username);
        if (user != null) {
            List<Post> posts = user.getPosts();
            System.out.println("Timeline for " + username + ":");
            for (Post post : posts) {
                System.out.println(post.getTimestamp() + " - " + post.getContent());
            }
        } else {
            System.out.println("User not found.");
        }
    }
}
