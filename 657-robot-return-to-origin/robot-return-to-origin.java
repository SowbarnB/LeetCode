class Solution {
    public boolean judgeCircle(String moves) {

        int updown = 0;
        int rightleft = 0;

        for(char c : moves.toCharArray())
        {
            if(c == 'U')
            {
                updown++;
            }
            else if(c == 'D')
            {
                updown--;
            }
            else if(c == 'L')
            {
                rightleft++;
            }
            else if(c == 'R')
            {
                rightleft--;
            }
        }
        return (rightleft == 0 && updown == 0);


    }
}