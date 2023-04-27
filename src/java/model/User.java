package model;

public class User {
    //Atributos
    private String userName;
    private String userPass;
    private String userNick;
    
    //Contrutor
    public User(String user, String pass){
        this.userName = user;
        this.userPass = user;
    }
    
    //Getters & Setters
    public String getUserName(){
        return this.userName;
    }
    
    public void setUserName(String name){
        this.userName = name;   
    }
    
    public String getUserPass(){
        return this.userPass;
    }
    
    public void setUserPass(String pass){
        this.userPass = pass;
    }    
    
    public String getUserNick(){
        return this.userNick;
    }
    
    public void setUserNick(String nick){
        this.userNick = nick;
    }

    //toString = Representação em formato string do objeto
    
    @Override
    public String toString(){
        return "Nome: " + this.userName + "<br>Apelido: " + this.userNick;
    }
    
    //Métodos gerais (regras de negócio)
    public boolean isLogged(){
        return (this.userName.equals("mai") &&
                this.userPass.equals("senha12345"));  
        
    }
}
