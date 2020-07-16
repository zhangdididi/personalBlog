package dison.Service;

import dison.mapper.CommentMapper;
import dison.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> queryComments(Long id) {
        return commentMapper.queryComments(id);
    }

    public int insert(Comment comment) {
        return commentMapper.insert(comment);
    }
}
