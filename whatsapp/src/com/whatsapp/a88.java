// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.protocol.a;

// Referenced classes of package com.whatsapp:
//            gt

public class a88
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gt();
    a a;

    public a88(Parcel parcel)
    {
        boolean flag = true;
        super();
        String s = parcel.readString();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        a = new a(s, flag, parcel.readString());
    }

    public a88(a a1)
    {
        a = a1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.a);
        if (a.b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeString(a.c);
    }

}
