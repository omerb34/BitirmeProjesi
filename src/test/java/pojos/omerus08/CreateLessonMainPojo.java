package pojos.omerus08;

public class CreateLessonMainPojo {
    private DataPojo object;
    private String message;
    private String httpStatus;

    public CreateLessonMainPojo() {
    }

    public DataPojo getObject() {
        return object;
    }

    public void setObject(DataPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "CreateLessonMainPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }

    public CreateLessonMainPojo(DataPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;


    }
}