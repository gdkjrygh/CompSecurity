// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp.messaging:
//            ao, a9

final class ac
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ao();
    private final com.whatsapp.protocol.VoipOptions.Aec a;

    private ac(Parcel parcel)
    {
        a = new com.whatsapp.protocol.VoipOptions.Aec(parcel.readString(), (Integer)parcel.readValue(java/lang/Integer.getClassLoader()), (Integer)parcel.readValue(java/lang/Integer.getClassLoader()), (Short)parcel.readValue(java/lang/Short.getClassLoader()));
    }

    ac(Parcel parcel, a9 a9)
    {
        this(parcel);
    }

    private ac(com.whatsapp.protocol.VoipOptions.Aec aec)
    {
        a = aec;
    }

    ac(com.whatsapp.protocol.VoipOptions.Aec aec, a9 a9)
    {
        this(aec);
    }

    public com.whatsapp.protocol.VoipOptions.Aec a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.algorithm);
        parcel.writeValue(a.offset);
        parcel.writeValue(a.length);
        parcel.writeValue(a.mode);
    }

}
