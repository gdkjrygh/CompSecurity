// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.Channel;

final class zzbf
    implements com.google.android.gms.wearable.ChannelApi.ChannelListener
{

    private final String zzaTK;
    private final com.google.android.gms.wearable.ChannelApi.ChannelListener zzaUO;

    zzbf(String s, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzaTK = (String)zzu.zzu(s);
        zzaUO = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzu.zzu(channellistener);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzbf))
            {
                return false;
            }
            obj = (zzbf)obj;
            if (!zzaUO.equals(((zzbf) (obj)).zzaUO) || !zzaTK.equals(((zzbf) (obj)).zzaTK))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzaTK.hashCode() * 31 + zzaUO.hashCode();
    }

    public void onChannelClosed(Channel channel, int i, int j)
    {
        zzaUO.onChannelClosed(channel, i, j);
    }

    public void onChannelOpened(Channel channel)
    {
        zzaUO.onChannelOpened(channel);
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
        zzaUO.onInputClosed(channel, i, j);
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
        zzaUO.onOutputClosed(channel, i, j);
    }
}
