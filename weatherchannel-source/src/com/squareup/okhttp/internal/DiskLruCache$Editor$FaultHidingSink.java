// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache

private class this._cls1 extends ForwardingSink
{

    final this._cls1 this$1;

    public void close()
        throws IOException
    {
        try
        {
            super.close();
            return;
        }
        catch (IOException ioexception) { }
        synchronized (_fld1)
        {
            this._mth1(this._cls1.this, true);
        }
        return;
        exception;
        disklrucache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void flush()
        throws IOException
    {
        try
        {
            super.flush();
            return;
        }
        catch (IOException ioexception) { }
        synchronized (_fld1)
        {
            this._mth1(this._cls1.this, true);
        }
        return;
        exception;
        disklrucache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        try
        {
            super.write(buffer, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Buffer buffer) { }
        synchronized (_fld1)
        {
            this._mth1(this._cls1.this, true);
        }
        return;
        exception;
        buffer;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (Sink sink)
    {
        this$1 = this._cls1.this;
        super(sink);
    }
}
