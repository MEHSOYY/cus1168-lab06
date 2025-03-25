package academy.javapro.week9.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Generic repository for storing and managing collections of items.
 * @param <T> the type of items to store
 */
public class Repository<T> {
    private final List<T> items = new ArrayList<>();

    /**
     * Adds an item to the repository.
     * @param item the item to add (cannot be null)
     * @throws IllegalArgumentException if the item is null
     */
    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
    }

    /**
     * Removes an item from the repository.
     * @param item the item to remove
     * @return true if the item was removed, false otherwise
     */
    public boolean remove(T item) {
        return items.remove(item);
    }

    /**
     * Finds items matching the given predicate.
     * @param predicate the condition to match
     * @return a list of matching items (never null)
     */
    public List<T> find(Predicate<T> predicate) {
        if (predicate == null) {
            return Collections.emptyList();
        }
        return items.stream().filter(predicate).toList();
    }

    /**
     * Gets all items in the repository.
     * @return an unmodifiable list of all items
     */
    public List<T> getAll() {
        return Collections.unmodifiableList(items);
    }

    /**
     * Counts the number of items in the repository.
     * @return the number of items
     */
    public int count() {
        return items.size();
    }

    /**
     * Checks if the repository contains an item.
     * @param item the item to check
     * @return true if the item is in the repository, false otherwise
     */
    public boolean contains(T item) {
        return items.contains(item);
    }
}
