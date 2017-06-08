import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
public class clientCodeExample{
    public static void main(String[] args) throws Exception {
    URL url = new URL("http://localhost:7779/ws/Order?wsdl");

        //1st argument service URI, refer to wsdl document above
    //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://javatpoint.com/", "WebServices");
        Service service = Service.create(url, qname);
        ServiceInterface hello = service.getPort(WebServices.class);
     }
 }
