// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.protocol.b3;

// Referenced classes of package com.whatsapp.messaging:
//            ak

final class n
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ak();
    private final b3 a;

    private n(Parcel parcel)
    {
        a = new b3();
        a.a = parcel.readString();
        a.b = parcel.readString();
        a.d = parcel.readString();
        a.c = parcel.readString();
        a.e = parcel.readString();
    }

    n(Parcel parcel, ak ak1)
    {
        this(parcel);
    }

    public n(b3 b3_1)
    {
        a = b3_1;
    }

    public b3 a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.a);
        parcel.writeString(a.b);
        parcel.writeString(a.d);
        parcel.writeString(a.c);
        parcel.writeString(a.e);
    }

}
