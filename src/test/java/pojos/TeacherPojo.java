package pojos;

public class TeacherPojo {
    public ObjectPojo object;
    public String message;
    public String httpStatus;

    public TeacherPojo(ObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public ObjectPojo getObject() {
        return object;
    }

    public void setObject(ObjectPojo object) {
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

    public TeacherPojo() {
    }

    @Override
    public String toString() {
        return "TeacherPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
