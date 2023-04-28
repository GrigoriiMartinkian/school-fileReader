package model;

public class Report {
    private int math;
    private int geo;
    private int english;
    private int average;
    public Report(int math, int geo, int english) {
        this.english = english;
        this.geo = geo;
        this.math = math;
        this.average=(math+geo+english)/3;
    }
   // public int filingOutReport(){

   // }
    @Override
    public String toString (){
        String result=math+" "+geo+" "+english;
        return result;
    }


}
