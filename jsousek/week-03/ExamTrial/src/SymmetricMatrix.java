import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

    public static void main(String[] args) {
        // Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
        // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
        // or false if it is not
        //
        // example for symmetric matrix:
        // 1 0 1
        // 0 2 2
        // 1 2 5
        //
        // example for not symmetric matrix
        // 7 7 7
        // 6 5 7
        // 1 2 1

        ArrayList<ArrayList<Integer>> nonSymmetricMatrix = new ArrayList<ArrayList<Integer>>();

        nonSymmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(7,7,7)));
        nonSymmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(6,5,7)));
        nonSymmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1,2,1)));


        ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

        symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 0, 1)));
        symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(0, 2, 2)));
        symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 2, 5)));

        System.out.println(isSymmetric(symmetricMatrix)); // should print out true

    }//end of main

    public static boolean isSymmetric (ArrayList<ArrayList<Integer>> inputMatrix){// function should return boolean

        int subtotalInColumn = 0;
        int subtotalOfRow = 0;
        boolean output;

        for(int i = 0; i < inputMatrix.size(); i++){
            subtotalInColumn = subtotalInColumn + inputMatrix.get()[i][0];

        }
        for (int i = 0; i <inputMatrix.size() ; i++) {
            subtotalOfRow = subtotalOfRow + inputMatrix.get([0][i]);

        }
        if (subtotalInColumn == subtotalOfRow){
            output = true;
        }

        return output;

    } //end of function
}