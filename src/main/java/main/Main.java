package main;

import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("John Smith");
        comment.setText("Test comment please ignore");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
