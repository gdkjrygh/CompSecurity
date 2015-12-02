// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp.messaging:
//            a2, a9

final class ab
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a2();
    private final com.whatsapp.protocol.VoipOptions.Decode a;

    private ab(Parcel parcel)
    {
        a = new com.whatsapp.protocol.VoipOptions.Decode((Short)parcel.readValue(java/lang/Short.getClassLoader()), (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()));
    }

    ab(Parcel parcel, a9 a9)
    {
        this(parcel);
    }

    private ab(com.whatsapp.protocol.VoipOptions.Decode decode)
    {
        a = decode;
    }

    ab(com.whatsapp.protocol.VoipOptions.Decode decode, a9 a9)
    {
        this(decode);
    }

    public com.whatsapp.protocol.VoipOptions.Decode a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(a.gain);
        parcel.writeValue(a.forwardErrorCorrection);
    }

}
