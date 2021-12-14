package calc;

public class calc {
	
	    public static double raiz(double x)
	    {
	        double r = x;
	        double t = 0;
	        while (true)
	        {
	            t = r;
	            r = 0.5 * ( (x/r) + r);
	            if(t!=r){
	                break;
	 
	            }
	        }

	        return r;
	    }

	    public static int cuadrado(double x)
	    {
	        return x*x;
	    }
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args)
	    {
	        // TODO code application logic here
	        double raiz= raiz(4);
	    }
	
}
