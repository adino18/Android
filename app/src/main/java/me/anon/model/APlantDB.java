//package me.anon.model;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import com.google.gson.annotations.SerializedName;
//
///**
// * Created by sonth on 5/10/2017
// */
//
//public class APlantDB implements Parcelable{
//    @SerializedName("id")
//    private Long id;
//    @SerializedName("name")
//    private String name;
//    @SerializedName("start_time")
//    private String start_time;
//    @SerializedName("image_path")
//    private String image_path;
//    @SerializedName("min_temp")
//    private String min_temp;
//    @SerializedName("max_temp")
//    private String max_temp;
//    @SerializedName("min_water")
//    private String min_water;
//    @SerializedName("max_water")
//    private String max_water;
//    @SerializedName("water_day")
//    private String water_day;
//    @SerializedName("nutri_day")
//    private String nutri_day;
//    @SerializedName("note")
//    private String note;
//    @SerializedName("info")
//    private String info;
//
//
//
//    protected APlant(Parcel in) {
//        id = in.readLong();
//        name = in.readString();
//        start_time = in.readString();
//        image_path = in.readString();
//        min_temp = in.readString();
//        max_temp = in.readString();
//        min_water = in.readString();
//        max_water = in.readString();
//        water_day = in.readString();
//        nutri_day = in.readString();
//        note = in.readString();
//        info = in.readString();
//
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeLong(id);
//        dest.writeString(name);
//        dest.writeString(start_time);
//        dest.writeString(image_path);
//        dest.writeString(min_temp);
//        dest.writeString(max_temp);
//        dest.writeString(min_water);
//        dest.writeString(max_water);
//        dest.writeString(water_day);
//        dest.writeString(nutri_day);
//        dest.writeString(note);
//        dest.writeString(info);
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    public static final Creator<APlantDB> CREATOR = new Creator<APlantDB>() {
//        @Override
//        public APlantDB createFromParcel(Parcel in) {
//            return new APlantDB(in);
//        }
//
//        @Override
//        public APlantDB[] newArray(int size) {
//            return new APlantDB[size];
//        }
//    };
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getStart_time() {
//        return start_time;
//    }
//
//    public String getImage_path() {
//        return Constant.STATIC_BASE_IMAGE + image_path;
//    }
//
//    public String getMin_temp() {
//        return min_temp;
//    }
//
//    public String getMax_temp() {
//        return max_temp;
//    }
//
//    public String getMin_water() {
//        return min_water;
//    }
//
//    public String getMax_water() {
//        return max_water;
//    }
//
//    public String getWater_day() {
//        return water_day;
//    }
//
//    public String getNutri_day() {
//        return nutri_day;
//    }
//
//    public String getNote() {
//        return note;
//    }
//
//    public String getInfo() {
//        return info;
//    }
//}
