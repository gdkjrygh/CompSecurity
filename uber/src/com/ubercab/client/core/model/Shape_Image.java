// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            Image

public final class Shape_Image extends Image
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Image createFromParcel(Parcel parcel)
        {
            return new Shape_Image(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Image[] newArray(int i)
        {
            return new Image[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_Image.getClassLoader();
    private int height;
    private String url;
    private int width;

    Shape_Image()
    {
    }

    private Shape_Image(Parcel parcel)
    {
        height = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
        url = (String)parcel.readValue(PARCELABLE_CL);
        width = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
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
            obj = (Image)obj;
            if (((Image) (obj)).getHeight() != getHeight())
            {
                return false;
            }
            if (((Image) (obj)).getUrl() == null ? getUrl() != null : !((Image) (obj)).getUrl().equals(getUrl()))
            {
                return false;
            }
            if (((Image) (obj)).getWidth() != getWidth())
            {
                return false;
            }
        }
        return true;
    }

    public final int getHeight()
    {
        return height;
    }

    public final String getUrl()
    {
        return url;
    }

    public final int getWidth()
    {
        return width;
    }

    public final int hashCode()
    {
        int j = height;
        int i;
        if (url == null)
        {
            i = 0;
        } else
        {
            i = url.hashCode();
        }
        return (i ^ (j ^ 0xf4243) * 0xf4243) * 0xf4243 ^ width;
    }

    final Image setHeight(int i)
    {
        height = i;
        return this;
    }

    final Image setUrl(String s)
    {
        url = s;
        return this;
    }

    final Image setWidth(int i)
    {
        width = i;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Image{height=")).append(height).append(", url=").append(url).append(", width=").append(width).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(Integer.valueOf(height));
        parcel.writeValue(url);
        parcel.writeValue(Integer.valueOf(width));
    }

}
