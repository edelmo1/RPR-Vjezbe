public class Faktorijel {

    public Faktorijel() {
    };

    public static int dajFaktorijel(int n)     {

int faktorijel=1;
for(int i=2;i<=n;i++) faktorijel*=i;
return faktorijel;
};
}
