
public class RemDuplicateArryEle {

	public static void main(String []args)
    {
        int []arr={12,34,12,55,43,54,12,10,9,51};
        int tar_index = -1;

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<tar_i;j++)
            {
                if(arr[i]==tar[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                tar_index=tar_index+1;
                tar[tar_index]=arr[i];
            }
        }
        
    }
}

    
    