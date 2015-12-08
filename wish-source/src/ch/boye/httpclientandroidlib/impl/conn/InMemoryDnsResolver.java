// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.DnsResolver;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDnsResolver
    implements DnsResolver
{

    private Map dnsMap;
    public HttpClientAndroidLog log;

    public InMemoryDnsResolver()
    {
        log = new HttpClientAndroidLog(ch/boye/httpclientandroidlib/impl/conn/InMemoryDnsResolver);
        dnsMap = new ConcurrentHashMap();
    }

    public transient void add(String s, InetAddress ainetaddress[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Host name may not be null");
        }
        if (ainetaddress == null)
        {
            throw new IllegalArgumentException("Array of IP addresses may not be null");
        } else
        {
            dnsMap.put(s, ainetaddress);
            return;
        }
    }

    public InetAddress[] resolve(String s)
        throws UnknownHostException
    {
        InetAddress ainetaddress[] = (InetAddress[])dnsMap.get(s);
        if (log.isInfoEnabled())
        {
            log.info((new StringBuilder()).append("Resolving ").append(s).append(" to ").append(Arrays.deepToString(ainetaddress)).toString());
        }
        if (ainetaddress == null)
        {
            throw new UnknownHostException((new StringBuilder()).append(s).append(" cannot be resolved").toString());
        } else
        {
            return ainetaddress;
        }
    }
}
