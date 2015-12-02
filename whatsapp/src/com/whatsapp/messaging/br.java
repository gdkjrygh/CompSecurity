// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp.messaging:
//            b4, a9

final class br
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b4();
    private final com.whatsapp.protocol.VoipOptions.Encode a;

    private br(Parcel parcel)
    {
        a = new com.whatsapp.protocol.VoipOptions.Encode((Short)parcel.readValue(java/lang/Short.getClassLoader()), (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()), (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()), (Integer)parcel.readValue(java/lang/Integer.getClassLoader()), (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()), (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()), (Integer)parcel.readValue(java/lang/Integer.getClassLoader()));
    }

    br(Parcel parcel, a9 a9)
    {
        this(parcel);
    }

    private br(com.whatsapp.protocol.VoipOptions.Encode encode)
    {
        a = encode;
    }

    br(com.whatsapp.protocol.VoipOptions.Encode encode, a9 a9)
    {
        this(encode);
    }

    public com.whatsapp.protocol.VoipOptions.Encode a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(a.complexity);
        parcel.writeValue(a.enableConstantBitrate);
        parcel.writeValue(a.enableDiscontinuousTransmission);
        parcel.writeValue(a.targetBitrate);
        parcel.writeValue(a.forwardErrorCorrection);
        parcel.writeValue(a.disableRateControl);
        parcel.writeValue(a.framesPerPacket);
    }

}
