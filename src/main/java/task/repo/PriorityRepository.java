package task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import task.entity.Priority;

import java.util.List;

public interface PriorityRepository extends JpaRepository<Priority, Integer> {

    boolean deleteById(int id);

    List<Priority> findAllByOrderByTitleAsc();


}

/* Примечания
Если вам нужны только стандартные методы репозитория
вы можете использовать не JpaRepository, а CrudRepository

List<Priority> findAllByOrderByTitleAsc();
Пример работы JPA Named Queries
Мы можем изменить работу стандариных методов, добавив
дополнительные условия. В данном случае мы ищем всех, и
сортируем их в афавитном порядке по полю title

 */
