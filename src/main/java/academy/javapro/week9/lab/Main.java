package academy.javapro.week9.lab;

import java.util.Objects;

/**
 * Class representing a magazine that implements LibraryItem.
 */
public final class Magazine implements LibraryItem {
    private final String title;
    private final int issueNumber;
    private final String publicationDate;

    /**
     * Constructs a Magazine instance.
     * @param title the title of the magazine (cannot be null or empty)
     * @param issueNumber the issue number (must be positive)
     * @param publicationDate the publication date (cannot be null or empty)
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Magazine(String title, int issueNumber, String publicationDate) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be positive");
        }
        if (publicationDate == null || publicationDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Publication date cannot be null or empty");
        }

        this.title = title;
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public String getUniqueIdentifier() {
        return title + "-" + issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber && Objects.equals(title, magazine.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, issueNumber);
    }
}
