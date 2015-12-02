// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp.messaging:
//            z, a9

final class i
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    private final com.whatsapp.protocol.VoipOptions.AudioRestrict a;

    private i(Parcel parcel)
    {
        a = new com.whatsapp.protocol.VoipOptions.AudioRestrict(parcel.readString(), (Integer)parcel.readValue(java/lang/Integer.getClassLoader()));
    }

    i(Parcel parcel, a9 a9)
    {
        this(parcel);
    }

    private i(com.whatsapp.protocol.VoipOptions.AudioRestrict audiorestrict)
    {
        a = audiorestrict;
    }

    i(com.whatsapp.protocol.VoipOptions.AudioRestrict audiorestrict, a9 a9)
    {
        this(audiorestrict);
    }

    public com.whatsapp.protocol.VoipOptions.AudioRestrict a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(a.encoding);
        parcel.writeValue(a.rate);
    }

}
