public class Summer {
    InputOutput io;

    public Summer(InputOutput io){
        this.io = io;
    }

    public void Calculate(){
        int sum = 0;
        while(true){
            int num = io.getInput();
            if(num<0){
                break;
            }
            sum += num;
        }
        io.setSum(sum);

    }

    
}
