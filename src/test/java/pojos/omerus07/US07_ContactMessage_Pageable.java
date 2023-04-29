package pojos.omerus07;

public class US07_ContactMessage_Pageable {
    private US07_ContactMessage_Sort sort;
    private  int pageNumber;
    private  int pageSize;
    private  int offset;
    private  boolean unpaged;
    private  boolean paged;

    public US07_ContactMessage_Pageable() {
    }

    public US07_ContactMessage_Pageable(US07_ContactMessage_Sort sort, int pageNumber, int pageSize, int offset, boolean unpaged, boolean paged) {
        this.sort = sort;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.offset = offset;
        this.unpaged = unpaged;
        this.paged = paged;
    }

    public US07_ContactMessage_Sort getSort() {
        return sort;
    }

    public void setSort(US07_ContactMessage_Sort sort) {
        this.sort = sort;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isUnpaged() {
        return unpaged;
    }

    public void setUnpaged(boolean unpaged) {
        this.unpaged = unpaged;
    }

    public boolean isPaged() {
        return paged;
    }

    public void setPaged(boolean paged) {
        this.paged = paged;
    }

    @Override
    public String toString() {
        return "Pageable{" +
                "sort=" + sort +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", offset=" + offset +
                ", unpaged=" + unpaged +
                ", paged=" + paged +
                '}';
    }
}
