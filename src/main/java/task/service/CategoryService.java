package task.service;

import org.springframework.stereotype.Service;
import task.entity.Category;
import task.repo.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category save(Category category) {
        return repository.save(category);
    }

    public void update(Category category) {
        repository.save(category);
    }

    public boolean deleteById(int id) {
        return repository.deleteById(id);
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Optional<Category> findById(int id) {
        return repository.findById(id);
    }

    /**
     * Поиск по категориям
     */
    public List<Category> search(String text) {
        return repository.findByTitle(text);
    }
}