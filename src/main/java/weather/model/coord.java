package weather.model;

public class coord {
    private double lon;
    private double lat;

    public coord(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public coord() {}

    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }

}
