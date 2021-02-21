class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        
        int k = m + n - 1;
        
        while(i>=0 && j>=0) {
            
            if(nums1[i]>=nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else if(nums2[j]>=nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            }
            
            k--;
        }
        
        while(j>=0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
    
    
    public void merge(int[] arr1, int[] arr2) {
        
        int s1 = arr1.length;
        int s2 = arr2.length;
        
        int res [] = new int[s1+s2];
        
        int i =0,j=0,k=0;
        while(i<s1 && j<s2) {
            
            
            
            if(arr1[i]<=arr2[j]) {
                res[k]= arr1[i];
                i++;
            } else if(arr2[j]<arr1[i]) {
                res[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<s1) {
            res[k++] = arr1[i++];
        }
        
         while(j<s2) {
            res[k++] = arr2[j++];
        }
    }
}