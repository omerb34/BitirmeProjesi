package pojos.viceDeanCreatsLesson;

public class US08_ViceDeanCreatsLessonMainPojo {
    private US08_ViceDeanCreatsLessonObjectPojo object;
    private String message;

    public US08_ViceDeanCreatsLessonMainPojo() {
    }

    public US08_ViceDeanCreatsLessonMainPojo(US08_ViceDeanCreatsLessonObjectPojo object, String message) {
        this.object = object;
        this.message = message;
    }

    public US08_ViceDeanCreatsLessonObjectPojo getObject() {
        return object;
    }

    public void setObject(US08_ViceDeanCreatsLessonObjectPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "US08_ViceDeanCreatsLessonMainPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                '}';
    }
}
