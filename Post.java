
// Post.java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String content;
    private LocalDateTime timestamp;

    public Post(String content) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timestamp.format(formatter);
    }
}
