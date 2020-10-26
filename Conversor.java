package analiseImagem;

public class Conversor {
	
	public void rgbParaXyz(double r, double g, double b){
		double x;
		double y;
		double z;
		 x = (0.490 * r) + (0.310 * g) + (0.2000 * b);
		y = (0.177 * r) + (0.812 * g) + (0.011 * b);
		z =(0 * r) + (0.010 * g) + (0.990 * b);
		
		System.out.println("           ");
		System.out.println("Conversao RGB -> XYZ");
		System.out.println("X:"+ x + " Y: " + y + " Z: " + z );
	}
	public void rgbParaCmy(double r, double g, double b) {
		double c;
		double m;
		double y;
		
		c = (1 - r);
		m = (1 - g);
		y = (1 - b);
		System.out.println("           ");
		System.out.println("Conversão RGB -> CMY");
		System.out.println("C: " + c + " M: " + m + " Y: " + y);
	}
	public void rgbParaHsv(double r, double g, double b) {
        r = r / 255.0; 
        g = g / 255.0; 
        b = b / 255.0; 
  
      
        double cmax = Math.max(r, Math.max(g, b)); // maximum of r, g, b 
        double cmin = Math.min(r, Math.min(g, b)); // minimum of r, g, b 
        double diff = cmax - cmin; 
        double h = -1, s = -1; 
          
        if (cmax == cmin) 
            h = 0; 
        else if (cmax == r) 
            h = (60 * ((g - b) / diff) + 360) % 360; 
        else if (cmax == g) 
            h = (60 * ((b - r) / diff) + 120) % 360; 
        else if (cmax == b) 
            h = (60 * ((r - g) / diff) + 240) % 360; 
        if (cmax == 0) 
            s = 0; 
        else
            s = (diff / cmax) * 100; 
  
        double v = (cmax * 255); 
        s = s/100;
        System.out.println("           ");
        System.out.println("Conversão RGB -> HSV");
        System.out.println("H: " + h + " S:" + s + " V:" + v + ""); 
	}
	
}
