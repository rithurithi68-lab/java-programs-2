class nestedif{
    public static void main(String[] args){
        String username="rithika";
        String password="1234";
        if(username=="rithika"){
            if(password=="1234"){
                System.out.println("Correct password");
            }
            else{
                System.out.println("Incorrect password");
            }
        }
        else{
            System.out.println("Invalid username");
        }
    }
}