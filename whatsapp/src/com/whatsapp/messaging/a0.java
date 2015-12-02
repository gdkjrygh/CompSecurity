// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp.messaging:
//            ae, a9

final class a0
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    private final com.whatsapp.protocol.VoipOptions.Agc a;

    private a0(Parcel parcel)
    {
        a = new com.whatsapp.protocol.VoipOptions.Agc((Short)parcel.readValue(java/lang/Short.getClassLoader()), (Short)parcel.readValue(java/lang/Short.getClassLoader()), (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()), (Short)parcel.readValue(java/lang/Short.getClassLoader()));
    }

    a0(Parcel parcel, a9 a9)
    {
        this(parcel);
    }

    private a0(com.whatsapp.protocol.VoipOptions.Agc agc)
    {
        a = agc;
    }

    a0(com.whatsapp.protocol.VoipOptions.Agc agc, a9 a9)
    {
        this(agc);
    }

    public com.whatsapp.protocol.VoipOptions.Agc a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(a.targetLevel);
        parcel.writeValue(a.compressionGain);
        parcel.writeValue(a.enableLimiter);
        parcel.writeValue(a.mode);
    }

}
