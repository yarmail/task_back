package task.service;

import org.springframework.stereotype.Service;
import task.entity.Category;
import task.entity.Priority;
import task.repo.PriorityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PriorityService {

    private final PriorityRepository repository;

    public PriorityService(PriorityRepository repository) {
        this.repository = repository;
    }

    public Priority save(Priority priority) {
        return repository.save(priority);
    }

    public void update(Priority priority) {
        repository.save(priority);
    }

    public boolean deleteById(int id) {
        return repository.deleteById(id);
    }

    public List<Priority> findAllByOrderByTitleAsc() {
        return repository.findAllByOrderByTitleAsc();
    }

    public Optional<Priority> findById(int id) {
        return repository.findById(id);
    }
}
