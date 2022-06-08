package HomeWork22;

public class Main {


        public static void main(String[] args) {

            String[][] arr = new String[][]{{"7", "118", "84", "83"}, {"6", "8", "10", "12"}, {"0", "5", "4", "3"}, {"1000", "0", "0", "1000"} /*, {"1", "2", "5", "8"}*/};
            test(arr);
            String[][] arr1 = new String[][]{{"7", "118", "84", "83"}, {"6", "8", "10", "12"}, {"0", "5", "4", "3"}, {"1000", "0", "0", "1000"} , {"1", "2", "5", "8"}};
            test(arr1);
            String[][] arr2 = new String[][]{{"7", "118", "84", "83"}, {"6", "8uu", "10", "12"}, {"0", "5", "4", "3"}, {"1000", "0", "0", "1000"}};
            test(arr2);

        }

    private static void test(String[][] arr) {
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер массива");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение элемента массива");
            System.out.println(e.getMessage());
        }
    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
            int count = 0;
            if (arr.length != 4) {
                throw new MyArraySizeException();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        count += Integer.parseInt(arr[i][j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyArrayDataException("Неудалось преобразовать элемент массива [" + i + "," + j +"]");
                    }
                }

            }
            return count;
        }

    }




