// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.main;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.jiubang.playsdk.main:
//            d

public class BitmapBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private Bitmap a;
    private String b;

    public BitmapBean()
    {
    }

    public BitmapBean(Bitmap bitmap, String s)
    {
        a = bitmap;
        b = s;
    }

    static Bitmap a(BitmapBean bitmapbean, Bitmap bitmap)
    {
        bitmapbean.a = bitmap;
        return bitmap;
    }

    static String a(BitmapBean bitmapbean, String s)
    {
        bitmapbean.b = s;
        return s;
    }

    public Bitmap a()
    {
        return a;
    }

    public void a(Bitmap bitmap)
    {
        a = bitmap;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeParcelable(a, 0);
    }

}
