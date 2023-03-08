package task.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Priority {
    private Integer id;
    private String title;
    private String color;
    private Collection<Task> tasksById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "color", nullable = false, length = -1)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Priority priority = (Priority) o;
        return Objects.equals(id, priority.id) && Objects.equals(title, priority.title) && Objects.equals(color, priority.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, color);
    }

    @OneToMany(mappedBy = "priorityByPriorityId")
    public Collection<Task> getTasksById() {
        return tasksById;
    }

    public void setTasksById(Collection<Task> tasksById) {
        this.tasksById = tasksById;
    }
}
