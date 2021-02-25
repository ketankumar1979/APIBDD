package APIBDD.PageObjectPackage;

public class PostUsers {

    public String postBaseURI(){
        String URL = "https://reqres.in/";
        return URL;
    }

    public String postResource(){
        String resourceAndQueryParam = "/api/users";
        return resourceAndQueryParam;
    }

    public String postPayload(){
        String payload = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        return payload;
    }
}
