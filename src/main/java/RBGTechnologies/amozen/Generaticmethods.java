public class generaticmethods
  {
      WebDriver drver;
    public void openbrowser(String browsername)
    {
      if(browsername.equals("Chrome"))
      {
        drivernew chromedriver();
      }
      elseif(browsername.equals("edge"))
        {
        drivernew edge driver();
      }
