package appmessage;

public class Messages {
    private int id_message;
    private String message, messageAuthor, date;

    public Messages(){

    }

    public Messages(String message, String messageAuthor, String date) {
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.date = date;
    }

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
