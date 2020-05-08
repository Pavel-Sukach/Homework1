package homework5.Task2;

public enum Letters {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, V, U, W, X, Y, Z;

    public static void getLetterPosition(String letterName){
        Letters letter = Letters.valueOf(letterName);
        System.out.println(letterName + " - " + (letter.ordinal()+1));
    }
}
