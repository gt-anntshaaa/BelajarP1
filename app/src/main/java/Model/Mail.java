package Model;

public class Mail {
    private String mailFrom;
    private String mailTo;
    private String mailSubject;
    private String mailContains;

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailContains() {
        return mailContains;
    }

    public void setMailContains(String mailContains) {
        this.mailContains = mailContains;
    }
}
