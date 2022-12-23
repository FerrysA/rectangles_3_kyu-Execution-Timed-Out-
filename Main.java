
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Random;


public class Main {




    public class RectanglesUnion {


        public static int[] Inter ( int[] A, int[] B ){

            int[] Res = new int[4];
            int[] Point = new int[4];
            int poz = -1;

            for (int i = 1; i <= 1; i++) {
                if (B[0] <= A[0] && A[0] <= B[2] && B[1] <= A[1] && A[1] <= B[3]) {

                    Point[0] = A[0];
                    Point[1] = A[1];
                    poz = 0;
                    break;

                }
                if (B[0] <= A[0] && A[0] <= B[2] && B[1] <= A[3] && A[3] <= B[3]) {

                    Point[0] = A[0];
                    Point[3] = A[3];
                    poz = 1;
                    break;
                }
                if (B[0] <= A[2] && A[2] <= B[2] && B[1] <= A[3] && A[3] <= B[3]) {

                    Point[2] = A[2];
                    Point[3] = A[3];
                    poz = 2;
                    break;
                }
                if (B[0] <= A[2] && A[2] <= B[2] && B[1] <= A[1] && A[1] <= B[3]) {

                    Point[2] = A[2];
                    Point[1] = A[1];
                    poz = 3;
                    break;
                }
                if (poz == -1)// ретурн 0 не пересекаются или B не захватывает уголки А
                {
                    if (Jnter(B, A) == -1) {
                        return Res;
                    }
                    return Inter(B, A);

                }
            }
            if (poz == 0) {
                if (A[2] > B[2]) {
                    Point[2] = B[2];

                }
                if (A[2] <= B[2]) {
                    Point[2] = A[2];

                }
                if (A[3] > B[3]) {
                    Point[3] = B[3];

                }
                if (A[3] <= B[3]) {
                    Point[3] = A[3];

                }
            }
            if (poz == 1) {
                if (A[2] > B[2]) {
                    Point[2] = B[2];

                }
                if (A[2] <= B[2]) {
                    Point[2] = A[2];

                }
                if (A[1] < B[1]) {
                    Point[1] = B[1];

                }
                if (A[1] >= B[1]) {
                    Point[1] = A[1];

                }
            }
            if (poz == 2) {
                if (A[0] < B[0]) {
                    Point[0] = B[0];

                }
                if (A[0] >= B[0]) {
                    Point[0] = A[0];

                }
                if (A[1] < B[1]) {
                    Point[1] = B[1];

                }
                if (A[1] >= B[1]) {
                    Point[1] = A[1];

                }
            }
            if (poz == 3) {
                if (A[0] < B[0]) {
                    Point[0] = B[0];

                }
                if (A[0] >= B[0]) {
                    Point[0] = A[0];

                }
                if (A[3] > B[3]) {
                    Point[3] = B[3];

                }
                if (A[3] <= B[3]) {
                    Point[3] = A[3];

                }
            }


            return Point;
        }/// возвращает массив пересечения
        public static int Jnter ( int[] A, int[] B ){

            int[] Res = new int[4];
            int[] Point = new int[4];
            int poz = -1;

            for (int i = 1; i <= 1; i++) {
                if (B[0] <= A[0] && A[0] <= B[2] && B[1] <= A[1] && A[1] <= B[3]) {

                    Point[0] = A[0];
                    Point[1] = A[1];
                    poz = 0;
                    break;

                }
                if (B[0] <= A[0] && A[0] <= B[2] && B[1] <= A[3] && A[3] <= B[3]) {

                    Point[0] = A[0];
                    Point[3] = A[3];
                    poz = 1;
                    break;
                }
                if (B[0] <= A[2] && A[2] <= B[2] && B[1] <= A[3] && A[3] <= B[3]) {

                    Point[2] = A[2];
                    Point[3] = A[3];
                    poz = 2;
                    break;
                }
                if (B[0] <= A[2] && A[2] <= B[2] && B[1] <= A[1] && A[1] <= B[3]) {

                    Point[2] = A[2];
                    Point[1] = A[1];
                    poz = 3;
                    break;
                }
                if (poz == -1)// ретурн 0 не пересекаются или B не захватывает уголки А
                {
                    return poz;
                }
            }
            if (poz == 0) {
                if (A[2] > B[2]) {
                    Point[2] = B[2];

                }
                if (A[2] <= B[2]) {
                    Point[2] = A[2];

                }
                if (A[3] > B[3]) {
                    Point[3] = B[3];

                }
                if (A[3] <= B[3]) {
                    Point[3] = A[3];

                }
            }
            if (poz == 1) {
                if (A[2] > B[2]) {
                    Point[2] = B[2];

                }
                if (A[2] <= B[2]) {
                    Point[2] = A[2];

                }
                if (A[1] < B[1]) {
                    Point[1] = B[1];

                }
                if (A[1] >= B[1]) {
                    Point[1] = A[1];

                }
            }
            if (poz == 2) {
                if (A[0] < B[0]) {
                    Point[0] = B[0];

                }
                if (A[0] >= B[0]) {
                    Point[0] = A[0];

                }
                if (A[1] < B[1]) {
                    Point[1] = B[1];

                }
                if (A[1] >= B[1]) {
                    Point[1] = A[1];

                }
            }
            if (poz == 3) {
                if (A[0] < B[0]) {
                    Point[0] = B[0];

                }
                if (A[0] >= B[0]) {
                    Point[0] = A[0];

                }
                if (A[3] > B[3]) {
                    Point[3] = B[3];

                }
                if (A[3] <= B[3]) {
                    Point[3] = A[3];

                }
            }


            return poz;
        }/// вспомогательное для интер

        private static double S ( int[] A)
        {
            return (-A[0] + A[2]) * (-A[1] + A[3]);
        }
        private static double S (Rec R)
        {
            int[] A = R.A;
            return (-A[0] + A[2]) * (-A[1] + A[3]);
        }
        static class Rec {
            int[] A = new int[4];

            Rec(int[] AA) {
                for (int i = 0; i < 4; i++) {
                    A[i] = AA[i];
                }
                l=A[0];
                p=A[2];
                d=A[1];
                u=A[3];

            }

            static public Rec Inter(Rec R, Rec Q) {

                int A[] = R.A;
                int B[] = Q.A;


                int[] C = new int[4];
                C = RectanglesUnion.Inter(A, B);
                Rec Res = new Rec(C);
                return Res;
            }


            public void Print(Rec R) {
                int[] A = R.A;
                int n = A.length;

                System.out.print("( ");
                for (int i = 0; i < n; i++) {
                    System.out.print(A[i]);
                    System.out.print(",");
                }
                System.out.print(" )");

            }

            int l;
            int p;
            int d;
            int u;

            public boolean BetL(Rec A,Rec B)
            {
                if(A.l<B.l && B.l<A.p && A.p<B.p)
                {
                    return true;
                }
                return false;
            }

            public boolean BetR(Rec A,Rec B)
            {
                if(B.l<A.l && A.l<B.p   &&  A.p>B.p)
                {
                    return true;
                }
                return false;
            }
            public boolean BetU(Rec A,Rec B)
            {
                if(A.u>B.u  &&   B.d<A.d && A.d<B.u)
                {
                    return true;
                }
                return false;
            }
            public boolean BetD(Rec A,Rec B)
            {
                if(A.d<B.d &&     B.d<A.u && A.u<B.u)
                {
                    return true;
                }
                return false;
            }

            public boolean InsX(Rec A,Rec B)
            {
                if(B.l<=A.l && A.l<=B.p   &&   B.l<=A.p && A.p<=B.p)
                {
                    return true;
                }
                return false;
            }
            public boolean InsY(Rec A,Rec B)
            {
                if(B.d<=A.d && A.d<=B.u   &&   B.d<=A.u && A.u<=B.u)
                {
                    return true;
                }
                return false;
            }

        }
        public static int calculateSpace(int[][]WW) {

            int count =0;//счетчик числа операций
            int n = WW.length;// число точек


            if(n==1)
            {
                return  (int)S(WW[0]);
            }


            int[][]AA= new int[n][4];
            int[] TTT={0,0,0,0};
            for(int i=0;i<n;i++)
            {
                if(WW[i].length==0)
                {
                    AA[i]=TTT;
                    continue;
                }
                for (int j=0;j<4;j++)
                {
                    AA[i][j]=WW[i][j];
                }

            }

            int Res=0;
            int ResM=-1;
            int S=0;
            int SM=-1;

            int[]HH={0,0,0,0};
            Rec R = new Rec(HH);// просто так создан для печати


            ArrayList<Rec> L = new ArrayList<>();
            ArrayList<Rec> M = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                Rec A = new Rec(AA[i]);
                L.add(A);
            }
            int poz = -1;

            //////////////////////// удаление неучавсвующих
            {
                for (int i = 0; i < n; i++) {
                    Rec A = L.get(i);
                    boolean peres = true;
                    for (int j = 0; j < n; j++) {
                        if (j == i) {
                            continue;
                        }
                        Rec B = L.get(j);
                        if (S(Rec.Inter(A, B)) == 0) {
                            peres = false;
                        } else {
                            peres = true;
                            M.add(A);
                            break;
                        }
                    }
                    if (peres == false) {
                        Res += S(A);

                    }
                }


                L.clear();
                L = (ArrayList<Rec>) M.clone();// копирование
                M.clear();
            }

            if(L.size()==1)
            {
                return  (int)S(L.get(0));
            }

            while (S!=SM)//
            {
                System.out.println();
                System.out.println("S,SM,число точек =("+S+","+SM+"||" +L.size() +")" );
                SM=S;

                for (int i = 0; i < L.size(); i++) {
                    poz=-1;
                    S=0;
                    for (int j = i + 1; j < L.size(); j++) {

                        Rec A = L.get(i);
                        Rec B = L.get(j);
                        int[]AAA={A.l,A.d, A.p,A.u};
                        int[]BBB={B.l,B.d, B.p,A.u};
                        if (A.BetL(A, B) && A.BetD(A, B)) {
                            poz = 1;

                            int[]XX={A.l,A.d, A.p,B.d};
                            int[]YY={A.l,B.d, B.l,A.u};
                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(X)!=0)
                            {
                                M.add(Y);

                            }


                            break;


                        }
                        if (A.BetR(A, B) && A.BetD(A, B)) {
                            poz = 2;

                            int[]XX={A.l,A.d, A.p,B.d};
                            int[]YY={B.p,B.d, A.p,A.u};


                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);


                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }

                            break;



                        }
                        if (A.InsX(A, B) && A.BetD(A, B)) {
                            poz = 3;

                            int[]XX={A.l,A.d, A.p,B.d};

                            Rec X=new Rec(XX);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }

                            break;


                        }
                        if (A.InsX(B, A) && A.BetD(A, B)) {
                            poz = 4;

                            int[]XX={A.l,A.d, A.p,B.d};
                            int[]YY={A.l,B.d, B.l,A.u};
                            int[]ZZ={B.p,B.d, A.p,A.u};

                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);
                            Rec Z=new Rec(ZZ);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }
                            if(S(Z)!=0)
                            {
                                M.add(Z);

                            }


                            break;

                        }
                        if (A.BetL(A, B) && A.InsY(A, B)) {
                            poz = 5;

                            int[]XX={A.l,A.d, B.l,A.u};

                            Rec X=new Rec(XX);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            break;


                        }
                        if (A.BetR(A, B) && A.InsY(A, B)) {
                            poz = 6;

                            int[]XX={B.p,A.d, A.p,A.u};

                            Rec X=new Rec(XX);


                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            break;


                        }
                        if (A.InsX(A, B) && A.InsY(A, B)) {
                            poz = 7;

                            break;

                        }
                        if (A.InsX(B, A) && A.InsY(A, B)) {
                            poz = 8;

                            int[]XX={A.l,A.d, B.l,A.u};
                            int[]YY={B.p,A.d, A.p,A.u};


                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);


                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }


                            break;


                        }
                        if (A.BetL(A, B) && A.BetU(A, B)) {
                            poz = 9;

                            int[]XX={A.l,A.d, B.l,B.u};
                            int[]YY={A.l,B.u, A.p,A.u};


                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);


                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }

                            break;


                        }
                        if (A.BetR(A, B) && A.BetU(A, B)) {
                            poz = 10;
                            int[]XX={B.l,A.d, A.p,B.u};
                            int[]YY={A.l,B.u, A.p,A.u};


                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);


                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }


                            break;


                        }
                        if (A.InsX(A, B) && A.BetU(A, B)) {
                            poz = 11;
                            int[]XX={A.l,B.u, A.p,A.u};


                            Rec X=new Rec(XX);


                            if(S(X)!=0)
                            {
                                M.add(X);

                            }

                            break;


                        }
                        if (A.InsX(B, A) && A.BetU(A, B)) {
                            poz = 12;
                            int[]XX={A.l,A.d, B.l,A.u};
                            int[]YY={B.l,B.u, B.p,A.u};
                            int[]ZZ={B.p,A.d, A.p,A.u};

                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);
                            Rec Z=new Rec(ZZ);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }
                            if(S(Z)!=0)
                            {
                                M.add(Z);

                            }

                            break;

                        }
                        if (A.InsX(B, A) && A.InsY(B, A)) {
                            poz = 13;

                            int[]XX={A.l,A.d, B.l,A.u};
                            int[]YY={B.p,A.d, A.p,A.u};
                            int[]ZZ={B.l,A.d, B.p,B.d};
                            int[]TT={B.l,B.u, B.p,A.u};

                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);
                            Rec Z=new Rec(ZZ);
                            Rec T=new Rec(TT);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }
                            if(S(Z)!=0)
                            {
                                M.add(Z);

                            }
                            if(S(T)!=0)
                            {
                                M.add(T);

                            }



                            break;

                        }
                        if (A.BetR(A, B) && A.InsY(B, A)) {
                            poz = 14;
                            int[]XX={A.l,A.d, B.p,B.d};
                            int[]YY={A.l,B.u, B.p,A.u};
                            int[]ZZ={B.p,A.d, A.p,A.u};

                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);
                            Rec Z=new Rec(ZZ);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }
                            if(S(Z)!=0)
                            {
                                M.add(Z);

                            }
                            break;


                        }
                        if (A.BetL(A, B) && A.InsY(B, A)) {
                            poz = 15;
                            int[]XX={A.l,A.d, B.l,A.u};
                            int[]YY={B.l,A.d, A.p,B.d};
                            int[]ZZ={B.l,B.u, A.p,A.u};

                            Rec X=new Rec(XX);
                            Rec Y=new Rec(YY);
                            Rec Z=new Rec(ZZ);

                            if(S(X)!=0)
                            {
                                M.add(X);

                            }
                            if(S(Y)!=0)
                            {
                                M.add(Y);

                            }
                            if(S(Z)!=0)
                            {
                                M.add(Z);

                            }

                            break;

                        }


                    }
                    if(poz==-1)
                    {
                        Rec A = L.get(i);

                        count++;
                        int[]XX={A.l,A.d, A.p,A.u};
                        Rec X=new Rec(XX);

                        if(S(X)!=0)
                        {
                            M.add(X);

                        }

                    }



                }

                {

                    L.clear();
                    for (int i = 0; i < M.size(); i++) {

                        Rec A = M.get(i);
                        int[]XX={A.l,A.d, A.p,A.u};
                        if(S(A)!=0)
                        {
                            L.add(A);
                            S+=S(A);
                        }

                    }
                    M.clear();



                    //////////////////////// удаление неучавсвующих здесь и вычислится Res
                    {
                        for (int i = 0; i < L.size(); i++) {
                            Rec A = L.get(i);
                            int[]AAAA=A.A;
                            boolean peres = true;
                            for (int j = 0; j < L.size(); j++) {
                                if (j == i) {
                                    continue;
                                }
                                Rec B = L.get(j);
                                if (S(Rec.Inter(A, B)) == 0) {
                                    peres = false;
                                } else {
                                    peres = true;
                                    M.add(A);
                                    break;
                                }
                            }
                            if (peres == false) {
                                Res += S(A);

                            }
                        }


                        L.clear();
                        L = (ArrayList<Rec>) M.clone();// копирование
                        M.clear();
                    }


                }

            }
            //Res+=S;

            System.out.println("число операций"+count);
            return Res;
        }




    }




    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {




        int[]A={1,1,5,5};
        int[]B={9,9,9,9};

        //int[][] AA={{3,3,8,5}, {6,3,8,9}, {11,6,14,12}};
        int[][] AA={{0,0,3,3}, {1,1,5,5}, {2,1,7,3},{2,2,3,5},{7,5,8,9},{3,2,4,3}};


        System.out.println(RectanglesUnion.calculateSpace(AA));


        //Rec.Inter(R,Q);


    }
}
