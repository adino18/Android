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
//public class APlant implements Parcelable{
//    @SerializedName("id")
//    private Long id;
//    @SerializedName("name")
//    private String name;
//    @SerializedName("location")
//    private String location;
//    @SerializedName("start_time")
//    private String start_time;
//    @SerializedName("image_path")
//    private String image_path;
//    @SerializedName("current_water")
//    private String current_water;
//    @SerializedName("current_temp")
//    private String current_temp;
//    @SerializedName("status")
//    private String status;
//    @SerializedName("plantID")
//    private String plantID;
//    @SerializedName("note")
//    private String note;
//
//
//    protected APlant(Parcel in) {
//        id = in.readLong();
//        name = in.readString();
//        location = in.readString();
//        start_time = in.readString();
//        image_path = in.readString();
//        current_water = in.readString();
//        current_temp = in.readString();
//        status = in.readString();
//        plantID = in.readString();
//        note = in.readString();
//
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeLong(id);
//        dest.writeString(name);
//        dest.writeString(location);
//        dest.writeString(start_time);
//        dest.writeString(image_path);
//        dest.writeString(current_water);
//        dest.writeString(current_temp);
//        dest.writeString(status);
//        dest.writeString(plantID);
//        dest.writeString(note);
//
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    public static final Creator<APlant> CREATOR = new Creator<APlant>() {
//        @Override
//        public APlant createFromParcel(Parcel in) {
//            return new APlant(in);
//        }
//
//        @Override
//        public APlant[] newArray(int size) {
//            return new APlant[size];
//        }
//    };
//
//    public String getImage_path() {
//        return Constant.STATIC_BASE_IMAGE + image_path;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public String getStart_time() {
//        return start_time;
//    }
//
//    public String getCurrent_water() {
//        return current_water;
//    }
//
//    public String getCurrent_temp() {
//        return current_temp;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public String getPlantID() {
//        return plantID;
//    }
//
//    public String getNote() {
//        return note;
//    }
//}
