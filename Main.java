//                                                --------------------------------------- Polymorphism in java------------------------------------------


// Type 1 ---------- method overload----- thats called ----compile time Polymorphism----- thats all

// poly that means many
// morphs means forms 
// the end means many forms in one person


class a{
    static int paper(int a,int b){
        return a*b;
    }
    static double paper(double a,double b){
        return a*b;
    }
}
class Main{
    public static void main(String[] args){
        a student = new a();
        System.out.println(student.paper(2,2));
        System.out.println(student.paper(11,4));
    }
}