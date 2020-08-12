package com.example.API;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class api_weather {

   public class Clouds {

        @SerializedName("all")
        @Expose
        private Long all;

        public Long getAll() {
            return all;
        }

        public void setAll(Long all) {
            this.all = all;
        }

    }

    public class Coord {

        @SerializedName("lon")
        @Expose
        private Float lon;
        @SerializedName("lat")
        @Expose
        private Float lat;

        public Float getLon() {
            return lon;
        }

        public void setLon(Float lon) {
            this.lon = lon;
        }

        public Float getLat() {
            return lat;
        }

        public void setLat(Float lat) {
            this.lat = lat;
        }

    }

    public class Example {

        @SerializedName("cnt")
        @Expose
        private Long cnt;
        @SerializedName("list")
        @Expose
        private java.util.List<List> list = null;

        public Long getCnt() {
            return cnt;
        }

        public void setCnt(Long cnt) {
            this.cnt = cnt;
        }

        public java.util.List<List> getList() {
            return list;
        }

        public void setList(java.util.List<List> list) {
            this.list = list;
        }

    }

    public class List {

        @SerializedName("coord")
        @Expose
        private Coord coord;
        @SerializedName("sys")
        @Expose
        private Sys sys;
        @SerializedName("weather")
        @Expose
        private java.util.List<Weather> weather = null;
        @SerializedName("main")
        @Expose
        private Main main;
        @SerializedName("visibility")
        @Expose
        private Long visibility;
        @SerializedName("wind")
        @Expose
        private Wind wind;
        @SerializedName("clouds")
        @Expose
        private Clouds clouds;
        @SerializedName("dt")
        @Expose
        private Long dt;
        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("name")
        @Expose
        private String name;

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public Sys getSys() {
            return sys;
        }

        public void setSys(Sys sys) {
            this.sys = sys;
        }

        public java.util.List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(java.util.List<Weather> weather) {
            this.weather = weather;
        }

        public Main getMain() {
            return main;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public Long getVisibility() {
            return visibility;
        }

        public void setVisibility(Long visibility) {
            this.visibility = visibility;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        public Long getDt() {
            return dt;
        }

        public void setDt(Long dt) {
            this.dt = dt;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Main {

        @SerializedName("temp")
        @Expose
        private Long temp;
        @SerializedName("feels_like")
        @Expose
        private Float feelsLike;
        @SerializedName("temp_min")
        @Expose
        private Long tempMin;
        @SerializedName("temp_max")
        @Expose
        private Long tempMax;
        @SerializedName("pressure")
        @Expose
        private Long pressure;
        @SerializedName("humidity")
        @Expose
        private Long humidity;
        @SerializedName("sea_level")
        @Expose
        private Long seaLevel;
        @SerializedName("grnd_level")
        @Expose
        private Long grndLevel;

        public Long getTemp() {
            return temp;
        }

        public void setTemp(Long temp) {
            this.temp = temp;
        }

        public Float getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(Float feelsLike) {
            this.feelsLike = feelsLike;
        }

        public Long getTempMin() {
            return tempMin;
        }

        public void setTempMin(Long tempMin) {
            this.tempMin = tempMin;
        }

        public Long getTempMax() {
            return tempMax;
        }

        public void setTempMax(Long tempMax) {
            this.tempMax = tempMax;
        }

        public Long getPressure() {
            return pressure;
        }

        public void setPressure(Long pressure) {
            this.pressure = pressure;
        }

        public Long getHumidity() {
            return humidity;
        }

        public void setHumidity(Long humidity) {
            this.humidity = humidity;
        }

        public Long getSeaLevel() {
            return seaLevel;
        }

        public void setSeaLevel(Long seaLevel) {
            this.seaLevel = seaLevel;
        }

        public Long getGrndLevel() {
            return grndLevel;
        }

        public void setGrndLevel(Long grndLevel) {
            this.grndLevel = grndLevel;
        }

    }

    public class Sys {

        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("timezone")
        @Expose
        private Long timezone;
        @SerializedName("sunrise")
        @Expose
        private Long sunrise;
        @SerializedName("sunset")
        @Expose
        private Long sunset;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Long getTimezone() {
            return timezone;
        }

        public void setTimezone(Long timezone) {
            this.timezone = timezone;
        }

        public Long getSunrise() {
            return sunrise;
        }

        public void setSunrise(Long sunrise) {
            this.sunrise = sunrise;
        }

        public Long getSunset() {
            return sunset;
        }

        public void setSunset(Long sunset) {
            this.sunset = sunset;
        }

    }


    public class Weather {

        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("main")
        @Expose
        private String main;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("icon")
        @Expose
        private String icon;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

    }

    public class Wind {

        @SerializedName("speed")
        @Expose
        private Long speed;
        @SerializedName("deg")
        @Expose
        private Long deg;

        public Long getSpeed() {
            return speed;
        }

        public void setSpeed(Long speed) {
            this.speed = speed;
        }

        public Long getDeg() {
            return deg;
        }

        public void setDeg(Long deg) {
            this.deg = deg;
        }


}
}
