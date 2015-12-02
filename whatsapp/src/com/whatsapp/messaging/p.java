// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.whatsapp.messaging:
//            am, a9

final class p
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new am();
    private final com.whatsapp.protocol.VoipOptions.Miscellaneous a;

    private p(Parcel parcel)
    {
        a = new com.whatsapp.protocol.VoipOptions.Miscellaneous((Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()), (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader()));
    }

    p(Parcel parcel, a9 a9)
    {
        this(parcel);
    }

    private p(com.whatsapp.protocol.VoipOptions.Miscellaneous miscellaneous)
    {
        a = miscellaneous;
    }

    p(com.whatsapp.protocol.VoipOptions.Miscellaneous miscellaneous, a9 a9)
    {
        this(miscellaneous);
    }

    public com.whatsapp.protocol.VoipOptions.Miscellaneous a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(a.enableComfortNoiseGeneration);
        parcel.writeValue(a.enableHighPassFiltering);
    }

}
