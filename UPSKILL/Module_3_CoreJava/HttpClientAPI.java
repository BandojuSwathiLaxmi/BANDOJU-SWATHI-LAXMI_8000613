import java.net.URI;
import java.net.http.*;
class HttpClientAPI{
    public static void main(String[] args) {
        try{
            HttpClient client=HttpClient.newHttpClient();
            HttpRequest request=HttpRequest.newBuilder().uri(new URI("https://api.github.com")).build();
            HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code: "+response.statusCode());
            System.out.println(response.body());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}