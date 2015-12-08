// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.pool;

import ch.boye.httpclientandroidlib.HttpClientConnection;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.pool.PoolEntry;
import java.io.IOException;

public class BasicPoolEntry extends PoolEntry
{

    public BasicPoolEntry(String s, HttpHost httphost, HttpClientConnection httpclientconnection)
    {
        super(s, httphost, httpclientconnection);
    }

    public void close()
    {
        try
        {
            ((HttpClientConnection)getConnection()).close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public boolean isClosed()
    {
        return !((HttpClientConnection)getConnection()).isOpen();
    }
}
