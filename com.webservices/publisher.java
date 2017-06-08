import javax.xml.ws.Endpoint;
//Endpoint publisher
public class publisher{
    public static void main(String[] args) {
       Endpoint.publish("http://localhost:7779/ws/Order", new WebServices());
        }
}
