package GetBucketCount;

public class Main {
    public static void main(String[] args) {

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <=0 || height <=0 || areaPerBucket <= 0 || extraBuckets <0){
            return -1;
        }
        double neededbuckets = (width * height)/ areaPerBucket;
        int neededBuckets = (int)Math.round(neededbuckets);
        return neededBuckets - extraBuckets;
    }
}
