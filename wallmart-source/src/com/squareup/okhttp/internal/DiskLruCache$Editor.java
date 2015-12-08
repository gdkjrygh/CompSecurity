// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Sink;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache, FaultHidingSink

public final class <init>
{

    private boolean committed;
    private final entry entry;
    private boolean hasErrors;
    final DiskLruCache this$0;
    private final boolean written[];

    public void abort()
        throws IOException
    {
        synchronized (DiskLruCache.this)
        {
            DiskLruCache.access$2600(DiskLruCache.this, this, false);
        }
        return;
        exception;
        disklrucache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void abortUnlessCommitted()
    {
        DiskLruCache disklrucache = DiskLruCache.this;
        disklrucache;
        JVM INSTR monitorenter ;
        boolean flag = committed;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Exception exception;
        try
        {
            DiskLruCache.access$2600(DiskLruCache.this, this, false);
        }
        catch (IOException ioexception) { }
        disklrucache;
        JVM INSTR monitorexit ;
        return;
        exception;
        disklrucache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void commit()
        throws IOException
    {
        DiskLruCache disklrucache = DiskLruCache.this;
        disklrucache;
        JVM INSTR monitorenter ;
        if (!hasErrors)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        DiskLruCache.access$2600(DiskLruCache.this, this, false);
        DiskLruCache.access$2700(DiskLruCache.this, entry);
_L2:
        committed = true;
        return;
        DiskLruCache.access$2600(DiskLruCache.this, this, true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        disklrucache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Sink newSink(int i)
        throws IOException
    {
        DiskLruCache disklrucache = DiskLruCache.this;
        disklrucache;
        JVM INSTR monitorenter ;
        if (ccess._mth900(entry) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        disklrucache;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1;
        if (!ccess._mth800(entry))
        {
            written[i] = true;
        }
        obj1 = ccess._mth1400(entry)[i];
        obj1 = DiskLruCache.access$2400(DiskLruCache.this).sink(((java.io.File) (obj1)));
        obj1 = new FaultHidingSink(((Sink) (obj1))) {

            final DiskLruCache.Editor this$1;

            protected void onException(IOException ioexception)
            {
                synchronized (this$0)
                {
                    hasErrors = true;
                }
                return;
                exception;
                ioexception;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$1 = DiskLruCache.Editor.this;
                super(sink);
            }
        };
        disklrucache;
        JVM INSTR monitorexit ;
        return ((Sink) (obj1));
        obj1;
        obj1 = DiskLruCache.access$2500();
        disklrucache;
        JVM INSTR monitorexit ;
        return ((Sink) (obj1));
    }

    public Source newSource(int i)
        throws IOException
    {
        DiskLruCache disklrucache = DiskLruCache.this;
        disklrucache;
        JVM INSTR monitorenter ;
        if (ccess._mth900(entry) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        disklrucache;
        JVM INSTR monitorexit ;
        throw obj;
        if (ccess._mth800(entry))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        disklrucache;
        JVM INSTR monitorexit ;
        return null;
        Source source = DiskLruCache.access$2400(DiskLruCache.this).source(ccess._mth1300(entry)[i]);
        disklrucache;
        JVM INSTR monitorexit ;
        return source;
        source;
        disklrucache;
        JVM INSTR monitorexit ;
        return null;
    }




/*
    static boolean access$1902(_cls1 _pcls1, boolean flag)
    {
        _pcls1.hasErrors = flag;
        return flag;
    }

*/

    private t>(t> t>)
    {
        this$0 = DiskLruCache.this;
        super();
        entry = t>;
        if (ccess._mth800(t>))
        {
            disklrucache = null;
        } else
        {
            disklrucache = new boolean[DiskLruCache.access$2300(DiskLruCache.this)];
        }
        written = DiskLruCache.this;
    }

    written(written written1, written written2)
    {
        this(written1);
    }
}
