package ro.sci.domain;

public class SearchRequest {
    public float size;
    public float radius;
    public String type;

    public SearchRequest(float size, float radius, String type) {
        this.size = size;
        this.radius = radius;
        this.type = type;
    }

    public SearchRequest(String type) {
        this.type = type;
    }

    public SearchRequest(float size) {
        this.size = size;
    }

    public SearchRequest(float size, float radius) {
        this.size = size;
        this.radius = radius;
    }

    public SearchRequest(float size, String type) {
        this.size = size;
        this.type = type;
    }
}
