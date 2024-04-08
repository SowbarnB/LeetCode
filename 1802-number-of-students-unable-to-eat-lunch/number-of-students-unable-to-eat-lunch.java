class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentwith0 = 0;
        int studentwith1 = 0;

        for(int student: students)
        {
            if(student == 0)
            {
                studentwith0++;
            }
            studentwith1 = students.length - studentwith0;
        } 

        for(int sandwich: sandwiches)
        {
            if(sandwich == 0 && studentwith0 == 0)
            {
                return studentwith1;
            }
            else if(sandwich == 1 && studentwith1 == 0)
            {
                return studentwith0;
            }
            if(sandwich == 0)
            {
                studentwith0--;
            }
            else
            {
                studentwith1--;
            }
        }
        return 0;
    }
}