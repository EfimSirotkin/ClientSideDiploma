package sample.http;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class QueryGenerator {

    private HttpRequest customRequest;

    public QueryGenerator(HttpRequest customRequest) {
        this.customRequest = customRequest;
    }

    public QueryGenerator() {}

    public String queryTeachers() {
        this.customRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8001/get-teachers"))
                .build();
        return getResponseResults();
    }

    public String queryPupils() {
        this.customRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8001/get-pupils"))
                .build();
        return getResponseResults();
    }

    public String queryGrades() {
        this.customRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8001/get-grades"))
                .build();
        return getResponseResults();
    }

    public String querySchoolClasses() {
        this.customRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8001/get-schoolclasses"))
                .build();
        return getResponseResults();
    }

    public String querySubjects() {
        this.customRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8001/get-subjects"))
                .build();
        return getResponseResults();
    }

    private String getResponseResults() {
        CompletableFuture<HttpResponse<String>>response = CustomHttpClientSingleton.getInstance().sendAsync(customRequest, HttpResponse.BodyHandlers.ofString());
        String result = response.thenApply(HttpResponse::body).join();

        return result;
    }

}
