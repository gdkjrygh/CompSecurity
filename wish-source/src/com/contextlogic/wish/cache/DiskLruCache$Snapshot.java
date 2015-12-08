// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.contextlogic.wish.cache:
//            DiskLruCache

public final class <init>
    implements Closeable
{

    private final InputStream ins[];
    private final String key;
    private long lengths[];
    private final long sequenceNumber;
    final DiskLruCache this$0;
    private final long timestamp;

    public void close()
    {
        if (ins != null)
        {
            InputStream ainputstream[] = ins;
            int j = ainputstream.length;
            int i = 0;
            while (i < j) 
            {
                DiskLruCache.access$1900(ainputstream[i]);
                i++;
            }
        }
    }

    public _cls00 edit()
        throws IOException
    {
        return DiskLruCache.access$1700(DiskLruCache.this, key, sequenceNumber);
    }

    public InputStream getInputStream(int i)
    {
        return ins[i];
    }

    public long[] getLengths()
    {
        return lengths;
    }

    public long getSequenceNumber()
    {
        return sequenceNumber;
    }

    public String getString(int i)
        throws IOException
    {
        return DiskLruCache.access$1800(getInputStream(i));
    }

    public long getTimestamp()
    {
        if (timestamp == 0L)
        {
            return System.currentTimeMillis();
        } else
        {
            return timestamp;
        }
    }

    private (String s, long l, long l1, long al[], 
            InputStream ainputstream[])
    {
        this$0 = DiskLruCache.this;
        super();
        key = s;
        sequenceNumber = l;
        ins = ainputstream;
        timestamp = l1;
        lengths = al;
    }

    lengths(String s, long l, long l1, long al[], 
            InputStream ainputstream[], lengths lengths1)
    {
        this(s, l, l1, al, ainputstream);
    }
}
