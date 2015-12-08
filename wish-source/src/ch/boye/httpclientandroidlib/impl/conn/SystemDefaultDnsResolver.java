// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.conn.DnsResolver;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemDefaultDnsResolver
    implements DnsResolver
{

    public SystemDefaultDnsResolver()
    {
    }

    public InetAddress[] resolve(String s)
        throws UnknownHostException
    {
        return InetAddress.getAllByName(s);
    }
}
