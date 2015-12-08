// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.io.iobuffer;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.google.android.apps.ytremote.fork.io.iobuffer:
//            b

public final class IOBufferWriter extends Writer
{

    private b a;

    public final void close()
    {
        if (a == null)
        {
            return;
        }
        a.b();
        a.a(true);
        a = null;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        a = null;
        throw obj;
    }

    public final void flush()
    {
        if (a == null)
        {
            throw new IOBufferWriterClosedException();
        }
        try
        {
            a.b();
            a.a();
            return;
        }
        catch (IOException ioexception)
        {
            a = null;
            throw ioexception;
        }
    }

    public final void write(int i)
    {
        if (a == null)
        {
            throw new IOBufferWriterClosedException();
        }
        try
        {
            a.a(i);
            return;
        }
        catch (IOException ioexception)
        {
            a = null;
            throw ioexception;
        }
    }

    public final void write(String s)
    {
        write(s, 0, s.length());
    }

    public final void write(String s, int i, int j)
    {
        write(s.toCharArray(), i, j);
    }

    public final void write(char ac[])
    {
        write(ac, 0, ac.length);
    }

    public final void write(char ac[], int i, int j)
    {
        if (a == null)
        {
            throw new IOBufferWriterClosedException();
        }
        try
        {
            a.a(ac, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            a = null;
        }
        throw ac;
    }

    private class IOBufferWriterClosedException extends IllegalStateException
    {

        private static final long serialVersionUID = 1L;

        public IOBufferWriterClosedException()
        {
            super("invalid use; writer has been closed");
        }
    }

}
