package SerDe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SerializeObject so = new SerializeObject();
        so.Serialize();
        DeserializeObject ds = new DeserializeObject();
        ds.Deserialize();
    }
}
