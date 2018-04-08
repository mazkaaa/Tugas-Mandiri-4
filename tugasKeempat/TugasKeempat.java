package tugasKeempat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class TugasKeempat {

    public static void main(String args[]){
        ArrayList<Mahasiswa> arrayList = new ArrayList<Mahasiswa>();
        Scanner scanner = new Scanner(System.in);
        String input = null;
        Random random = new Random();
        int defaultNim = 1001;
        int counter = 0;
        do{
            if (counter == 0){
                System.out.println("-- Data is empty --");
            } else {
                Collections.sort(arrayList);
                for (int i = 0; i < counter; i++){
                    System.out.println(arrayList.get(i).getNim() + "     | " + arrayList.get(i).getNama() + "     | " + (float)arrayList.get(i).getNilai());
                }
            }
            System.out.print("\n\nMasukan nama: ");
            input = scanner.next();
            arrayList.add(new Mahasiswa(defaultNim, input, random.nextInt(10) + 1));
            counter++;
            defaultNim++;
        }while (!input.equalsIgnoreCase("exit"));
    }
}
