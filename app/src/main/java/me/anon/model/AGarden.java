//
///**
// * Created by Adino18 on 5/10/2017.
// */
//
//package me.anon.model;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//import com.google.gson.annotations.SerializedName;
//
///**
// * Created by sonth on 12-Feb-17.
// */
//
//public class AGarden implements Parcelable{
//    @SerializedName("id")
//    private Long id;
//    @SerializedName("name")
//    private String name;
//    @SerializedName("location")
//    private String location;
//    @SerializedName("start_time")
//    private String start_time;
//    @SerializedName("min_temp")
//    private String min_temp;
//    @SerializedName("max_temp")
//    private String max_temp;
//    @SerializedName("min_water")
//    private String min_water;
//    @SerializedName("max_water")
//    private String max_water;
//
//
//    protected APlant(Parcel in) {
//        id = in.readLong();
//        name = in.readString();
//        location = in.readString();
//        start_time = in.readString();
//        min_temp = in.readString();
//        max_temp = in.readString();
//        min_water = in.readString();
//        max_water = in.readString();
//
//
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeLong(id);
//        dest.writeString(name);
//        dest.writeString(location);
//        dest.writeString(start_time);
//        dest.writeString(min_temp);
//        dest.writeString(max_temp);
//        dest.writeString(min_water);
//        dest.writeString(max_water);
//
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    public static final Creator<me.anon.model.AGarden> CREATOR = new Creator<me.anon.model.AGarden>() {
//        @Override
//        public me.anon.model.AGarden createFromParcel(Parcel in) {
//            return new me.anon.model.AGarden(in);
//        }
//
//        @Override
//        public me.anon.model.AGarden[] newArray(int size) {
//            return new me.anon.model.AGarden[size];
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
//    public String getLocation() {
//        return location;
//    }
//
//    public String getStart_time() {
//        return start_time;
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
//}
//
