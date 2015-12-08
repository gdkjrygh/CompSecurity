// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzk, ChannelImpl

public final class ChannelEventParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int type;
    final int zzCY;
    final int zzaTN;
    final int zzaTO;
    final ChannelImpl zzaTP;

    ChannelEventParcelable(int i, ChannelImpl channelimpl, int j, int k, int l)
    {
        zzCY = i;
        zzaTP = channelimpl;
        type = j;
        zzaTN = k;
        zzaTO = l;
    }

    private static String zzjT(int i)
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

    private static String zzjU(int i)
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
        return (new StringBuilder()).append("ChannelEventParcelable[versionCode=").append(zzCY).append(", channel=").append(zzaTP).append(", type=").append(zzjT(type)).append(", closeReason=").append(zzjU(zzaTN)).append(", appErrorCode=").append(zzaTO).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public void zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        switch (type)
        {
        default:
            Log.w("ChannelEventParcelable", (new StringBuilder()).append("Unknown type: ").append(type).toString());
            return;

        case 1: // '\001'
            channellistener.onChannelOpened(zzaTP);
            return;

        case 2: // '\002'
            channellistener.onChannelClosed(zzaTP, zzaTN, zzaTO);
            return;

        case 3: // '\003'
            channellistener.onInputClosed(zzaTP, zzaTN, zzaTO);
            return;

        case 4: // '\004'
            channellistener.onOutputClosed(zzaTP, zzaTN, zzaTO);
            break;
        }
    }

}
