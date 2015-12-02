// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            RiderAccountPicture

public final class Shape_RiderAccountPicture extends RiderAccountPicture
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final RiderAccountPicture createFromParcel(Parcel parcel)
        {
            return new Shape_RiderAccountPicture(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final RiderAccountPicture[] newArray(int i)
        {
            return new RiderAccountPicture[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_RiderAccountPicture.getClassLoader();
    private String picture;

    Shape_RiderAccountPicture()
    {
    }

    private Shape_RiderAccountPicture(Parcel parcel)
    {
        picture = (String)parcel.readValue(PARCELABLE_CL);
    }


    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RiderAccountPicture)obj;
            if (((RiderAccountPicture) (obj)).getPicture() == null ? getPicture() != null : !((RiderAccountPicture) (obj)).getPicture().equals(getPicture()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getPicture()
    {
        return picture;
    }

    public final int hashCode()
    {
        int i;
        if (picture == null)
        {
            i = 0;
        } else
        {
            i = picture.hashCode();
        }
        return i ^ 0xf4243;
    }

    final RiderAccountPicture setPicture(String s)
    {
        picture = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderAccountPicture{picture=")).append(picture).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(picture);
    }

}
