// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;

final class zzbi
    implements com.google.android.gms.wearable.ChannelApi.ChannelListener
{

    private final String zzaZM;
    private final com.google.android.gms.wearable.ChannelApi.ChannelListener zzbaR;

    zzbi(String s, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzaZM = (String)zzx.zzv(s);
        zzbaR = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzx.zzv(channellistener);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzbi))
            {
                return false;
            }
            obj = (zzbi)obj;
            if (!zzbaR.equals(((zzbi) (obj)).zzbaR) || !zzaZM.equals(((zzbi) (obj)).zzaZM))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzaZM.hashCode() * 31 + zzbaR.hashCode();
    }

    public void onChannelClosed(Channel channel, int i, int j)
    {
        zzbaR.onChannelClosed(channel, i, j);
    }

    public void onChannelOpened(Channel channel)
    {
        zzbaR.onChannelOpened(channel);
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
        zzbaR.onInputClosed(channel, i, j);
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
        zzbaR.onOutputClosed(channel, i, j);
    }
}
