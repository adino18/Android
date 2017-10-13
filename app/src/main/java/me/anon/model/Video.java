//package com.tutorial.sonth.movieapi.model;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import com.google.gson.annotations.SerializedName;
//import com.tutorial.sonth.movieapi.utils.Constant;
//
///**
// * Created by Adino18 on 23/2/2017.
// */
//
//public class Video implements Parcelable {
//    @SerializedName("id")
//    private String id;
//    @SerializedName("key")
//    private String key;
//    @SerializedName("name")
//    private String name;
//    @SerializedName("site")
//    private String site;
//    @SerializedName("type")
//    private String type;
//    @SerializedName("size")
//    private int size;
//
//
//    protected Video(Parcel in) {
//        id = in.readString();
//        key = in.readString();
//        name = in.readString();
//        site = in.readString();
//        type = in.readString();
//        size = in.readInt();
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(id);
//        dest.writeString(key);
//        dest.writeString(name);
//        dest.writeString(site);
//        dest.writeString(type);
//        dest.writeInt(size);
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    public static final Creator<Video> CREATOR = new Creator<Video>() {
//        @Override
//        public Video createFromParcel(Parcel in) {
//            return new Video(in);
//        }
//
//        @Override
//        public Video[] newArray(int size) {
//            return new Video[size];
//        }
//    };
//
//    public String getKey() {
//        return key;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getSize() {
//        return size;
//    }
//}
