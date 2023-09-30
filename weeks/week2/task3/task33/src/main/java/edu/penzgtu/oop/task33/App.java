package edu.penzgtu.oop.task33;


public class App {

    public static void main(String[] args) {
        int[] a = {32, -11, 13, 34, 11, 34, 4, -134};
        int n = a.length;

        mergesort(a,0,n-1);
        for(int e:a)
            System.out.print(e+" ");

    }
    static void mergesort(int[] a,int l,int r) {

        if(l<r) {
            int mid = l + (r-l)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    private static void merge(int[] a, int l, int mid, int r) {
        int[] a1 = new int[mid-l+1];
        int[] a2  = new int[r-mid];

        for(int i=l;i<=mid;i++){
            a1[i-l] = a[i];
        }

        for(int i=mid+1;i<=r;i++){
            a2[i-mid-1] = a[i];
        }

        int i = 0,j = 0,k = l;

        while(i<a1.length && j<a2.length) {
            if(a1[i]<=a2[j]) a[k++] = a1[i++];
            else a[k++] = a2[j++];
        }

        while(i<a1.length) a[k++] = a1[i++];
        while(j<a2.length) a[k++] = a2[j++];
    }
}