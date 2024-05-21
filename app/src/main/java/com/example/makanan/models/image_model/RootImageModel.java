package com.example.makanan.models.image_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import kotlin.jvm.internal.SerializedIr;

public class RootImageModel {
    @SerializedName("LARGE")
    @Expose()
    private LargeImage largeImage;
    @SerializedName("SMALL")
    @Expose()
    private SmallImage smallImage;
    @SerializedName("THUMBNAIL")
    @Expose()
    private ThumbNail thumbNail;
    @SerializedName("REGULAR")
    @Expose()
    private RegularImage regularImage;

    public RootImageModel(LargeImage largeImage, SmallImage smallImage, ThumbNail thumbNail, RegularImage regularImage) {
        this.largeImage = largeImage;
        this.smallImage = smallImage;
        this.thumbNail = thumbNail;
        this.regularImage = regularImage;
    }

    public LargeImage getLargeImage() {
        return largeImage;
    }

    public SmallImage getSmallImage() {
        return smallImage;
    }

    public ThumbNail getThumbNail() {
        return thumbNail;
    }

    public RegularImage getRegularImage() {
        return regularImage;
    }
}
