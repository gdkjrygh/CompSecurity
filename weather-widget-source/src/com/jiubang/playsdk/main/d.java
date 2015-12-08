// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.main;

import android.graphics.Bitmap;
import android.os.Parcel;

// Referenced classes of package com.jiubang.playsdk.main:
//            BitmapBean

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public BitmapBean a(Parcel parcel)
    {
        BitmapBean bitmapbean = new BitmapBean();
        BitmapBean.a(bitmapbean, parcel.readString());
        BitmapBean.a(bitmapbean, (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader()));
        return bitmapbean;
    }

    public BitmapBean[] a(int i)
    {
        return null;
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
