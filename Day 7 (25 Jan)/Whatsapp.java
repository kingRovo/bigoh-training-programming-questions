import java.util.ArrayList;





class Contact {

    private String name;
    private String contactNumber;
    private String address;

    Contact(String name, String contactNumber, String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    public String DisplayInfo(){
        return this.name+"    --     "+this.contactNumber;
    }

    Status status;

    public void setStatus(String text, Image image) {

        status = new Status(text, image);

    }
    public String getStatus(){

        return  status.getStatus()==null?"Nothing":status.getStatus();

    }

    Message message;
    public void sandVideoMessage(String title,String urlPath,String discription){
        message.sandVideo(title, urlPath, discription);
    }
    public String getVideoMessage(){

        return message.getVideo()==null?"Nothing":message.getVideo();
    }

    public void sandImageMessage(String title,String urlPath,String discription){
        message.sandImage(title, urlPath, discription);
    }
    public String getImageMessage(){

        return message.getImage()==null?"Nothing":message.getImage();
    }
    public void sandMp3Message(String title,String urlPath,String discription){
        message.sandMP3(title, urlPath, discription);
    }
    public String getMp3Message(){

        return message.getMP3()==null?"Nothing":message.getMP3();
    }
    public void sandTextMessage(String msg){
        message.sandMessage(msg);
    }
    public String getTextMessage(){
        return message.getMessage()==null?"Nothing":message.getMessage();
    }

    

}

class Status {
    private String text;
    private Image image;

    Status(String text, Image image){

        this.image = image;
        this.text = text;
    }
    

    public String getStatus() {
        return this.text + "  " + this.image;
    }
}

class Message {

    private String textMessage;

    public String getMessage(){
        return this.textMessage;
    }
    public void sandMessage(String message){

        this.textMessage = message;
    }
    Video video;
    Image image;
    MP3 mp3;
    public void sandVideo(String title, String urlPath, String discription){
        new Video(title, urlPath, discription);
    }

    public String getVideo(){
        return video.viewVideo();
    }
    public void sandImage(String title, String urlPath, String discription){
        new Image(title, urlPath, discription);
    }
    public String getImage(){
        return image.viewImage();
    }
    public void sandMP3(String title, String urlPath, String discription){
        new MP3(title, urlPath, discription);
    }
    public String getMP3(){
        return mp3.viewMP3();
    }

}
class Media {

    private String title;
    private String urlpath;
    private String discription;

    Media() {

    }

    public String getTitle() {
        return title;
    }
    public String getDiscription() {
        return discription;
    }
    public String getUrlpath() {
        return urlpath;
    }

    Media(String title, String urlPath, String discription) {
        this.title = title;
        this.urlpath = urlPath;
        this.discription = discription;
    }

}

class Video extends Media {

    Video(String title, String urlPath, String discription) {
        super(title, urlPath, discription);
    }
    public String viewVideo(){
        return super.getTitle()+"   -  ("+super.getDiscription()+" )  --- "+super.getUrlpath();
    }

}

class Image extends Media {

    Image(String title, String urlPath, String discription) {
        super(title, urlPath, discription);
    }
    public String viewImage(){
        return super.getTitle()+"   -  ("+super.getDiscription()+" )  --- "+super.getUrlpath();
    }
}
class MP3 extends Media{
    MP3(String title, String urlPath, String discription) {
        super(title, urlPath, discription);
    }
    public String viewMP3(){
        return super.getTitle()+"   -  ("+super.getDiscription()+" )  --- "+super.getUrlpath();
    }
}

class User {
    private String name;
    private String phoneNumber;
    private String address;

    User(String name,String phoneNumber,String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phoneNumber, String address) {
        contacts.add(new Contact(name, phoneNumber, address));
    }

    public ArrayList<Contact> contactList() {
        return contacts;
    }


    public void sandVideo(Contact sandtoContact,String title,String urlPath,String discription){

        sandtoContact.sandVideoMessage(title, urlPath, discription);
        
    }
    public void sandImage(Contact sandtoContact,String title,String urlPath,String discription){

        sandtoContact.sandImageMessage(title, urlPath, discription);
        
    }
    public void sandMP3(Contact sandtoContact,String title,String urlPath,String discription){

        sandtoContact.sandMp3Message(title, urlPath, discription);
        
    }

    public void sandTextMessage(Contact sandtoContact,String msg){

        sandtoContact.sandTextMessage(msg);
        
    }

    public String viewVideoMessage(Contact viewMsgOf){
        return viewMsgOf.getVideoMessage();
    }
    public String viewImageMessage(Contact viewMsgOf){
        return viewMsgOf.getImageMessage();
    }
    public String viewMp3Message(Contact viewMsgOf){
        return viewMsgOf.getMp3Message();
    }
    public String viewTextMessage(Contact viewMsgOf){
        return viewMsgOf.getTextMessage();
    }

    public String viewStatus(Contact contact){
        
        return contact.getStatus();
    }
   
    Status status;
    public void addStatus(String text,Image image){
        status= new Status(text, image);
    }

}


public class Whatsapp {

    

    public static void main(String[] args) {
        User user = new User("Updesh","7457037445","Agra");

        user.addContact("Raj","3456789", "Noida");
        user.addContact("Rahul", "454465", "Mathura");

        ArrayList<Contact>contacts  = user.contactList();

        for (int i = 0; i < contacts.size(); i++) {
            
            System.out.println((i+1)+". "+contacts.get(i).DisplayInfo());
        }
        Image image = new Image("Grp pic","https..","college pic");
        contacts.get(1).setStatus("Hello, ", image);


     
        System.out.println(contacts.get(1).getStatus());

       
    }
}