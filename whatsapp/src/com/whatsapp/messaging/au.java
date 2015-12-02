// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp.messaging:
//            a8, a9

final class au
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a8();
    private final com.whatsapp.protocol.VoipOptions.NoiseSuppression a;

    private au(Parcel parcel)
    {
        a = new com.whatsapp.protocol.VoipOptions.NoiseSuppression((Short)parcel.readValue(java/lang/Short.getClassLoader()));
    }

    au(Parcel parcel, a9 a9)
    {
        this(parcel);
    }

    private au(com.whatsapp.protocol.VoipOptions.NoiseSuppression noisesuppression)
    {
        a = noisesuppression;
    }

    au(com.whatsapp.protocol.VoipOptions.NoiseSuppression noisesuppression, a9 a9)
    {
        this(noisesuppression);
    }

    public com.whatsapp.protocol.VoipOptions.NoiseSuppression a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(a.mode);
    }

}
