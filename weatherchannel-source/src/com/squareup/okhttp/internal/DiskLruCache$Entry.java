// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache, Util

private final class <init>
{

    private final File cleanFiles[];
    private  currentEditor;
    private final File dirtyFiles[];
    private final String key;
    private final long lengths[];
    private boolean readable;
    private long sequenceNumber;
    final DiskLruCache this$0;

    private IOException invalidLengths(String as[])
        throws IOException
    {
        throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(as)).toString());
    }

    private void setLengths(String as[])
        throws IOException
    {
        if (as.length != DiskLruCache.access$2200(DiskLruCache.this))
        {
            throw invalidLengths(as);
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= as.length)
                {
                    break;
                }
                lengths[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw invalidLengths(as);
            }
            i++;
        } while (true);
    }

    ot snapshot()
    {
        if (!Thread.holdsLock(DiskLruCache.this))
        {
            throw new AssertionError();
        }
        Source asource[] = new Source[DiskLruCache.access$2200(DiskLruCache.this)];
        int i = 0;
        do
        {
            ot ot;
            try
            {
                if (i >= DiskLruCache.access$2200(DiskLruCache.this))
                {
                    break;
                }
                asource[i] = Okio.source(cleanFiles[i]);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                for (int j = 0; j < DiskLruCache.access$2200(DiskLruCache.this) && asource[j] != null; j++)
                {
                    Util.closeQuietly(asource[j]);
                }

                return null;
            }
            i++;
        } while (true);
        ot = new ot(DiskLruCache.this, key, sequenceNumber, asource, lengths, null);
        return ot;
    }

    void writeLengths(BufferedSink bufferedsink)
        throws IOException
    {
        long al[] = lengths;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            bufferedsink.writeByte(32).writeUtf8(Long.toString(l));
        }

    }







/*
    static long access$1402(ot ot, long l)
    {
        ot.sequenceNumber = l;
        return l;
    }

*/



/*
    static boolean access$602(sequenceNumber sequencenumber, boolean flag)
    {
        sequencenumber.readable = flag;
        return flag;
    }

*/



/*
    static  access$702( ,  1)
    {
        .currentEditor = 1;
        return 1;
    }

*/


    private currentEditor(String s)
    {
        this$0 = DiskLruCache.this;
        super();
        key = s;
        lengths = new long[DiskLruCache.access$2200(DiskLruCache.this)];
        cleanFiles = new File[DiskLruCache.access$2200(DiskLruCache.this)];
        dirtyFiles = new File[DiskLruCache.access$2200(DiskLruCache.this)];
        s = (new StringBuilder(s)).append('.');
        int j = s.length();
        for (int i = 0; i < DiskLruCache.access$2200(DiskLruCache.this); i++)
        {
            s.append(i);
            cleanFiles[i] = new File(DiskLruCache.access$2300(DiskLruCache.this), s.toString());
            s.append(".tmp");
            dirtyFiles[i] = new File(DiskLruCache.access$2300(DiskLruCache.this), s.toString());
            s.setLength(j);
        }

    }

    ._cls2300(String s, ._cls2300 _pcls2300)
    {
        this(s);
    }
}
