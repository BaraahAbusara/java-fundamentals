 void containsDuplicatesTest (){
        int[] arr1 = 1,2,3,4,5,6
        boolean test1=App.containsDuplicates(arr1);
        assertTrue(test1);

        int[] arr2 = {1,2,3,4,5,6,1};
        boolean test2=App.containsDuplicates(arr2);
        assertFalse(test2);
    }
