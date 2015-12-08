// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.products;

import android.os.Parcel;
import android.os.Parcelable;

public class PhotoProduct
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PhotoProduct createFromParcel(Parcel parcel)
        {
            return new PhotoProduct(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PhotoProduct[] newArray(int i)
        {
            return new PhotoProduct[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private int mDpi;
    private int mHeight;
    private String mIdentifier;
    private String mName;
    private double mPrice;
    private String mShortName;
    private int mWidth;

    private PhotoProduct(Parcel parcel)
    {
        mName = parcel.readString();
        mShortName = parcel.readString();
        mIdentifier = parcel.readString();
        mPrice = parcel.readDouble();
        mWidth = parcel.readInt();
        mHeight = parcel.readInt();
        mDpi = parcel.readInt();
    }


    public PhotoProduct(String s, String s1, String s2, double d, int i, int j, 
            int k)
    {
        mName = s;
        mShortName = s1;
        mIdentifier = s2;
        mPrice = d;
        mWidth = i;
        mHeight = j;
        mDpi = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PhotoProduct)
        {
            return ((PhotoProduct)obj).getProductIdentifier().equals(mIdentifier);
        } else
        {
            return false;
        }
    }

    public int getDpi()
    {
        return mDpi;
    }

    public int getHeight()
    {
        return mHeight;
    }

    public int getMinimumHeightPixels()
    {
        return mDpi * mHeight;
    }

    public int getMinimumWidthPixels()
    {
        return mDpi * mWidth;
    }

    public double getPrice()
    {
        return mPrice;
    }

    public String getProductIdentifier()
    {
        return mIdentifier;
    }

    public String getProductName()
    {
        return mName;
    }

    public String getShortProductName()
    {
        return mShortName;
    }

    public int getWidth()
    {
        return mWidth;
    }

    public int hashCode()
    {
        return mIdentifier.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("PhotoProduct[").append(mName).append("/").append(mPrice).append("/").append(mIdentifier).append("/").append(mWidth).append("x").append(mHeight).append("/").append(mDpi).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mName);
        parcel.writeString(mShortName);
        parcel.writeString(mIdentifier);
        parcel.writeDouble(mPrice);
        parcel.writeInt(mWidth);
        parcel.writeInt(mHeight);
        parcel.writeInt(mDpi);
    }

}
