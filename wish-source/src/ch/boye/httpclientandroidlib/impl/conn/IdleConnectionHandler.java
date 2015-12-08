// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.HttpConnection;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IdleConnectionHandler
{
    private static class TimeValues
    {

        private final long timeAdded;
        private final long timeExpires;



        TimeValues(long l, long l1, TimeUnit timeunit)
        {
            timeAdded = l;
            if (l1 > 0L)
            {
                timeExpires = timeunit.toMillis(l1) + l;
                return;
            } else
            {
                timeExpires = 0x7fffffffffffffffL;
                return;
            }
        }
    }


    private final Map connectionToTimes = new HashMap();
    public HttpClientAndroidLog log;

    public IdleConnectionHandler()
    {
        log = new HttpClientAndroidLog(getClass());
    }

    public void add(HttpConnection httpconnection, long l, TimeUnit timeunit)
    {
        long l1 = System.currentTimeMillis();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Adding connection at: ").append(l1).toString());
        }
        connectionToTimes.put(httpconnection, new TimeValues(l1, l, timeunit));
    }

    public void closeExpiredConnections()
    {
        long l = System.currentTimeMillis();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Checking for expired connections, now: ").append(l).toString());
        }
        Iterator iterator = connectionToTimes.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            HttpConnection httpconnection = (HttpConnection)((java.util.Map.Entry) (obj)).getKey();
            obj = (TimeValues)((java.util.Map.Entry) (obj)).getValue();
            if (((TimeValues) (obj)).timeExpires <= l)
            {
                if (log.isDebugEnabled())
                {
                    log.debug((new StringBuilder()).append("Closing connection, expired @: ").append(((TimeValues) (obj)).timeExpires).toString());
                }
                try
                {
                    httpconnection.close();
                }
                catch (IOException ioexception)
                {
                    log.debug("I/O error closing connection", ioexception);
                }
            }
        } while (true);
    }

    public void closeIdleConnections(long l)
    {
        l = System.currentTimeMillis() - l;
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Checking for connections, idle timeout: ").append(l).toString());
        }
        Iterator iterator = connectionToTimes.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            HttpConnection httpconnection = (HttpConnection)entry.getKey();
            long l1 = ((TimeValues)entry.getValue()).timeAdded;
            if (l1 <= l)
            {
                if (log.isDebugEnabled())
                {
                    log.debug((new StringBuilder()).append("Closing idle connection, connection time: ").append(l1).toString());
                }
                try
                {
                    httpconnection.close();
                }
                catch (IOException ioexception)
                {
                    log.debug("I/O error closing connection", ioexception);
                }
            }
        } while (true);
    }

    public boolean remove(HttpConnection httpconnection)
    {
        httpconnection = (TimeValues)connectionToTimes.remove(httpconnection);
        if (httpconnection == null)
        {
            log.warn("Removing a connection that never existed!");
        } else
        if (System.currentTimeMillis() > ((TimeValues) (httpconnection)).timeExpires)
        {
            return false;
        }
        return true;
    }

    public void removeAll()
    {
        connectionToTimes.clear();
    }
}
