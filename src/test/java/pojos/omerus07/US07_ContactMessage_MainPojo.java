package pojos.omerus07;

import java.util.ArrayList;

public class US07_ContactMessage_MainPojo {
    private ArrayList<US07_ContactMessage_Content> content;
    private US07_ContactMessage_Pageable pageable;
    private int totalPages;
    private int totalElements;
    private boolean last;
    private boolean first;
    private US07_ContactMessage_Sort sort;
    private int size;
    private int number;
    private int numberOfElements;
    private boolean empty;

    public US07_ContactMessage_MainPojo() {
    }

    public US07_ContactMessage_MainPojo(ArrayList<US07_ContactMessage_Content> content, US07_ContactMessage_Pageable pageable, int totalPages, int totalElements, boolean last, boolean first, US07_ContactMessage_Sort sort, int size, int number, int numberOfElements, boolean empty) {
        this.content = content;
        this.pageable = pageable;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.last = last;
        this.first = first;
        this.sort = sort;
        this.size = size;
        this.number = number;
        this.numberOfElements = numberOfElements;
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "MainPojo{" +
                "content=" + content +
                ", pageable=" + pageable +
                ", totalPages=" + totalPages +
                ", totalElements=" + totalElements +
                ", last=" + last +
                ", first=" + first +
                ", sort=" + sort +
                ", size=" + size +
                ", number=" + number +
                ", numberOfElements=" + numberOfElements +
                ", empty=" + empty +
                '}';
    }


}

