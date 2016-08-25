package prashastsaxena;

public class WaterJug {

    public static void main(String args[]){
        WaterJug waterJug = new WaterJug();
        boolean canMeasureWater = waterJug.canMeasureWater(6,4,8);
        System.out.println("can measure water "+canMeasureWater);
    }


    public boolean canMeasureWater(int x, int y, int z){

        //doing below to make sure x is always bigger size jug
        if(x < y){
            int temp = y;
            y = x;
            x = temp;
        }

        if(z==0){
            return true;
        }

        if(x == 0 && y== 0 && z==0){
            return true;
        }

        if(x == 0 || y == 0){
            return false;
        }

        int jug1 = 0;
        int jug2 = 0;

        /*
        if(jug1 == z || jug2 == z || jug1+jug2 == z){ //if jug1 or jug2 in full state already has z gallons of water return
            return true;
        }
        */

        while(jug1 != z){ //we will run until jug1 has exact z gallons of water

            if(jug1 == 0){
                jug1 = x; //fill jug1 with water of x gallons if it's empty
            }

            if(jug1+jug2 ==z){
                break;
            }

            //transfer of water from jug1 to jug2
            if(jug1 < y){
                jug2 = jug1; //if jug1 has less than what jug2 can accomodate then fill jug2 with what's remaining in jug1.
                jug1 = 0;

            }else {
                int toFillExtra = y-jug2; //identify how much do we need to fill in jug2 and how much we need to minus from jug1.
                jug2 += toFillExtra;
                jug1 -= toFillExtra;
            }

            if(jug2 == y){
                jug2 = 0; //empty out jug on floor as it's filled out & can be used for next fill
            }
            if(jug1 == 0 && jug2 == 0){
                break;
            }

        }

        if(jug1 == z || jug1+jug2 ==z){
            return true;
        }else {
            return false;
        }
    }

}
