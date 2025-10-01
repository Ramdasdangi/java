class Operator {
    public static void operator(String[] args){
        Integer number = 5;
        boolean res;

        if (res = number instanceof Integer ){
            System.out.println("number is an object of integer " +res);
        } else {
            System.out.println("number is not an object of integer "+ res);
        }
    }
}

