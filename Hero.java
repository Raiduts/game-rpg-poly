public class Hero extends Character {
    public void move(){
        System.out.print("Hero deciding where to go");
        try {
            Thread.sleep(100); System.out.print(".");
            Thread.sleep(150); System.out.print(".");
            Thread.sleep(200); System.out.print(".");
            Thread.sleep(250); System.out.println(".");
        } catch (Exception e) {
            // TODO: handle exception
        }
        switch ((int)(Math.random()*3)) {
            case 0:
                System.out.println("Hero move to Japan");
                break;
            case 1:
                System.out.println("Hero move to Switzerland");
                break;
            case 2:
                System.out.println("Hero move to Canada");
                break;
        
            default:
                break;
        }
    }
    
    public void move(String direction){
        System.out.println("Hero move to " + direction);
    }
}
