package task.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Stat {
    private Integer id;
    private Integer completedTotal;
    private Integer uncompletedTotal;

    @Basic
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "completed_total", nullable = true)
    public Integer getCompletedTotal() {
        return completedTotal;
    }

    public void setCompletedTotal(Integer completedTotal) {
        this.completedTotal = completedTotal;
    }

    @Basic
    @Column(name = "uncompleted_total", nullable = true)
    public Integer getUncompletedTotal() {
        return uncompletedTotal;
    }

    public void setUncompletedTotal(Integer uncompletedTotal) {
        this.uncompletedTotal = uncompletedTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stat stat = (Stat) o;
        return Objects.equals(id, stat.id) && Objects.equals(completedTotal, stat.completedTotal) && Objects.equals(uncompletedTotal, stat.uncompletedTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, completedTotal, uncompletedTotal);
    }
}
