// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzm, ChannelImpl

public final class ChannelEventParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    final int mVersionCode;
    final int type;
    final int zzaZP;
    final int zzaZQ;
    final ChannelImpl zzaZR;

    ChannelEventParcelable(int i, ChannelImpl channelimpl, int j, int k, int l)
    {
        mVersionCode = i;
        zzaZR = channelimpl;
        type = j;
        zzaZP = k;
        zzaZQ = l;
    }

    private static String zzkB(int i)
    {
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 1: // '\001'
            return "CHANNEL_OPENED";

        case 2: // '\002'
            return "CHANNEL_CLOSED";

        case 4: // '\004'
            return "OUTPUT_CLOSED";

        case 3: // '\003'
            return "INPUT_CLOSED";
        }
    }

    private static String zzkC(int i)
    {
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 1: // '\001'
            return "CLOSE_REASON_DISCONNECTED";

        case 2: // '\002'
            return "CLOSE_REASON_REMOTE_CLOSE";

        case 3: // '\003'
            return "CLOSE_REASON_LOCAL_CLOSE";

        case 0: // '\0'
            return "CLOSE_REASON_NORMAL";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ChannelEventParcelable[versionCode=").append(mVersionCode).append(", channel=").append(zzaZR).append(", type=").append(zzkB(type)).append(", closeReason=").append(zzkC(zzaZP)).append(", appErrorCode=").append(zzaZQ).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public void zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        switch (type)
        {
        default:
            Log.w("ChannelEventParcelable", (new StringBuilder()).append("Unknown type: ").append(type).toString());
            return;

        case 1: // '\001'
            channellistener.onChannelOpened(zzaZR);
            return;

        case 2: // '\002'
            channellistener.onChannelClosed(zzaZR, zzaZP, zzaZQ);
            return;

        case 3: // '\003'
            channellistener.onInputClosed(zzaZR, zzaZP, zzaZQ);
            return;

        case 4: // '\004'
            channellistener.onOutputClosed(zzaZR, zzaZP, zzaZQ);
            break;
        }
    }

}
