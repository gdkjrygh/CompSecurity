// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.io.iobuffer;

import java.io.OutputStream;

// Referenced classes of package com.google.android.apps.ytremote.fork.io.iobuffer:
//            b

public final class IOBufferOutputStream extends OutputStream
{

    private b a;

    public IOBufferOutputStream(b b1)
    {
        a = b1;
    }

    public final void close()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.b();
            a.a(true);
            a = null;
            return;
        }
    }

    public final void flush()
    {
        if (a == null)
        {
            throw new IOBufferOutputStreamClosedException();
        } else
        {
            a.b();
            a.a();
            return;
        }
    }

    public final void write(int i)
    {
        if (a == null)
        {
            throw new IOBufferOutputStreamClosedException();
        } else
        {
            a.b(i);
            return;
        }
    }

    public final void write(byte abyte0[])
    {
        if (a == null)
        {
            throw new IOBufferOutputStreamClosedException();
        } else
        {
            a.b(abyte0);
            return;
        }
    }

    public final void write(byte abyte0[], int i, int j)
    {
        if (a == null)
        {
            throw new IOBufferOutputStreamClosedException();
        } else
        {
            a.b(abyte0, i, j);
            return;
        }
    }

    private class IOBufferOutputStreamClosedException extends IllegalStateException
    {

        private static final long serialVersionUID = 1L;

        public IOBufferOutputStreamClosedException()
        {
            super("invalid use; stream has been closed");
        }
    }

}
