package APIBDD.PageObjectPackage;

public class ListOfUsers {

    public String getBaseURI(){
        String URL = "https://reqres.in/";
        return URL;
    }

    public String getResource(){
        String resourceAndQueryParam = "/api/users?page=2";
        return resourceAndQueryParam;
    }
}
