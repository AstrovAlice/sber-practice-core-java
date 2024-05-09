public class Phone{
    private String number;
    private String user;
    private int weight;

    public Phone(String number, String user){
        this.number = number;
        this.user = user;
        this.weight = weight;
    }
    public String receiveCall(String number){
        if(this.number.equals(number)){
            return "Звонит" + this.user;
        }else{
            return "Number not found";
        }
    }
    public String getNumber(String user){
        if (this.user.equals(user)){
            return this.number;
        } else {
            return "User not found";
        }
    }
}