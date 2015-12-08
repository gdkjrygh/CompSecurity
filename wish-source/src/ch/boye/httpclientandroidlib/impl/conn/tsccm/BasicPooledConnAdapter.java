// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.impl.conn.AbstractPoolEntry;
import ch.boye.httpclientandroidlib.impl.conn.AbstractPooledConnAdapter;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn.tsccm:
//            ThreadSafeClientConnManager

public class BasicPooledConnAdapter extends AbstractPooledConnAdapter
{

    protected BasicPooledConnAdapter(ThreadSafeClientConnManager threadsafeclientconnmanager, AbstractPoolEntry abstractpoolentry)
    {
        super(threadsafeclientconnmanager, abstractpoolentry);
        markReusable();
    }

    protected void detach()
    {
        super.detach();
    }

    protected ClientConnectionManager getManager()
    {
        return super.getManager();
    }

    protected AbstractPoolEntry getPoolEntry()
    {
        return super.getPoolEntry();
    }
}
