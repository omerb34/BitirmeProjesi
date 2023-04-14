package pojos;

import java.util.ArrayList;

public class MainPojo {
    private ArrayList<Content> content;
    private Pageable pageable;
    private int totalPages;
    private int totalElements;
    private boolean last;
    private boolean first;
    private Sort sort;
    private int size;
    private int number;
    private int numberOfElements;
    private boolean empty;

    public MainPojo() {
    }

    public MainPojo(ArrayList<Content> content, Pageable pageable, int totalPages, int totalElements, boolean last, boolean first, Sort sort, int size, int number, int numberOfElements, boolean empty) {
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

