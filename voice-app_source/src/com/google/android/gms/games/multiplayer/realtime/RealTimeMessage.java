// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzu;

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdL(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzfU(i);
        }

        public RealTimeMessage zzdL(Parcel parcel)
        {
            return new RealTimeMessage(parcel);
        }

        public RealTimeMessage[] zzfU(int i)
        {
            return new RealTimeMessage[i];
        }

    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String zzauq;
    private final byte zzaur[];
    private final int zzaus;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }


    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        zzauq = (String)zzu.zzu(s);
        zzaur = (byte[])((byte[])zzu.zzu(abyte0)).clone();
        zzaus = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getMessageData()
    {
        return zzaur;
    }

    public String getSenderParticipantId()
    {
        return zzauq;
    }

    public boolean isReliable()
    {
        return zzaus == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(zzauq);
        parcel.writeByteArray(zzaur);
        parcel.writeInt(zzaus);
    }

}
