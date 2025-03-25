package academy.javapro.week9.lab;

/**
 * Interface representing a library item with common behavior.
 */
public interface LibraryItem {
    /**
     * Gets the title of the item.
     * @return the title of the item
     */
    String getTitle();

    /**
     * Gets the type of the item.
     * @return the type of the item
     */
    String getItemType();

    /**
     * Gets a unique identifier for the item.
     * @return the unique identifier
     */
    String getUniqueIdentifier();
}
