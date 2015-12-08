// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.order;

import android.os.Parcel;
import android.os.Parcelable;

public class Crop
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Crop createFromParcel(Parcel parcel)
        {
            return new Crop(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Crop[] newArray(int i)
        {
            return new Crop[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private float mBottom;
    private float mLeft;
    private float mRight;
    private float mTop;

    public Crop(float f, float f1, float f2, float f3)
    {
        mLeft = Math.max(0.0F, f);
        mTop = Math.max(0.0F, f1);
        mRight = Math.min(1.0F, f2);
        mBottom = Math.min(1.0F, f3);
    }

    public Crop(Parcel parcel)
    {
        float f = parcel.readFloat();
        float f1 = parcel.readFloat();
        float f2 = parcel.readFloat();
        float f3 = parcel.readFloat();
        mLeft = Math.max(0.0F, f);
        mTop = Math.max(0.0F, f1);
        mRight = Math.min(1.0F, f2);
        mBottom = Math.min(1.0F, f3);
    }

    public int describeContents()
    {
        return 0;
    }

    public float getBottom()
    {
        return mBottom;
    }

    public float getLeft()
    {
        return mLeft;
    }

    public float getRight()
    {
        return mRight;
    }

    public float getTop()
    {
        return mTop;
    }

    public boolean isCropped()
    {
        return mLeft > 0.0F || mTop > 0.0F || mRight < 1.0F || mBottom < 1.0F;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Crop[").append(mLeft).append(", ").append(mTop).append(", ").append(mRight).append(", ").append(mBottom).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(mLeft);
        parcel.writeFloat(mTop);
        parcel.writeFloat(mRight);
        parcel.writeFloat(mBottom);
    }

}
