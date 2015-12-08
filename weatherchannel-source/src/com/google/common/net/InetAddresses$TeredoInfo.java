// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.net.Inet4Address;

// Referenced classes of package com.google.common.net:
//            InetAddresses

public static final class flags
{

    private final Inet4Address client;
    private final int flags;
    private final int port;
    private final Inet4Address server;

    public Inet4Address getClient()
    {
        return client;
    }

    public int getFlags()
    {
        return flags;
    }

    public int getPort()
    {
        return port;
    }

    public Inet4Address getServer()
    {
        return server;
    }

    public (Inet4Address inet4address, Inet4Address inet4address1, int i, int j)
    {
        boolean flag;
        if (i >= 0 && i <= 65535)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "port '%s' is out of range (0 <= port <= 0xffff)", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j <= 65535)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "flags '%s' is out of range (0 <= flags <= 0xffff)", new Object[] {
            Integer.valueOf(j)
        });
        server = (Inet4Address)MoreObjects.firstNonNull(inet4address, InetAddresses.access$000());
        client = (Inet4Address)MoreObjects.firstNonNull(inet4address1, InetAddresses.access$000());
        port = i;
        flags = j;
    }
}
