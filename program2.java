import java.net.InetAddress;
  
class Main {
    private static String ip1;
	private static String ip2;
	private static String mask;
	public static boolean sameNetwork(String ip1, String ip2, String mask)
	
    throws Exception {
                
        byte[] a1 = InetAddress.getByName(ip1).getAddress();
        byte[] a2 = InetAddress.getByName(ip2).getAddress();
        byte[] m = InetAddress.getByName(mask).getAddress();

		for (int i = 0; i < a1.length; i++)
            if ((a1[i] & m[i]) != (a2[i] & m[i]))
                return false;

		return true;
		}
    public static void main(String[] args) throws Exception {
    	
    	
        try 
        {
        System.out.println(sameNetwork(args[0],args[1],args[2]));
       
          boolean check=sameNetwork(args[0],args[1],args[2]);

        	 if(check)
             	System.out.println("SAME SUBNET");
             else
             	System.out.println("DIFFERENT SUBNET");
       
        }
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("invalid input");
		}
        
        
    }

}