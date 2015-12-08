// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            a

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String AS;
    private final byte AT[];
    private final int AU;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    RealTimeMessage(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        AS = (String)gi.a(s);
        AT = (byte[])((byte[])gi.a(abyte0)).clone();
        AU = i;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final byte[] getMessageData()
    {
        return AT;
    }

    public final String getSenderParticipantId()
    {
        return AS;
    }

    public final boolean isReliable()
    {
        return AU == 1;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(AS);
        parcel.writeByteArray(AT);
        parcel.writeInt(AU);
    }

}
