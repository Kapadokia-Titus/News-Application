package kapadokia.nyandoro.newsapp;

public class NewsItem {

    private String Title,Context,Date;
    int userPhoto;

    public NewsItem(){}
    public NewsItem(String Title, String Context, String Date, int userPhoto){

        this.Title =Title;
        this.Context =Context;
        this.Date = Date;
        this.userPhoto = userPhoto;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String context) {
        Context = context;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(int userPhoto) {
        this.userPhoto = userPhoto;
    }
}
