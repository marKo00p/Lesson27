package HomeWork;

import java.util.List;

public interface Tag {
    void print(StringBuilder stringBuilder);

    Tag getParent();
    List<Tag> getChildren();
}
