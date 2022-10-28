import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_6a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s = br.readLine();

        String [] listOfStrings = s.split(",");

        List<Integer> listOfFish = new ArrayList<>();


        int numOfDays = 80;
        int newFish = 8;

        for (String str : listOfStrings){
            listOfFish.add(Integer.parseInt(str));
        }

        int num = listOfFish.size();
        System.out.println(num);

        for(int i=0; i<numOfDays; i++){
            List<Integer> tempList = new ArrayList<>();
            for(int j=0; j < listOfFish.size(); j++){
                int fish = listOfFish.get(j);
                if(fish > 0) {
                    fish--;
                    listOfFish.set(j, fish);
                }
                else if(fish == 0){
                    fish = 6;
                    listOfFish.set(j, fish);
                    tempList.add(newFish);
                }

            }
            listOfFish.addAll(tempList);
        }

        int numOfFish = listOfFish.size();
        System.out.println(numOfFish);

    }
}