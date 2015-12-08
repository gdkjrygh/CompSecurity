// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.io.OutputStream;
import org.apache.http.util.ByteArrayBuffer;

final class am extends OutputStream
{

    private OutputStream a;
    private ByteArrayBuffer b;

    am()
    {
        a = null;
        b = new ByteArrayBuffer(1024);
    }

    public final void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new NullPointerException("newOut cannot be null");
        }
        if (a != null)
        {
            throw new IllegalStateException("setUnderlyingOutputStream() cannot be called more than once");
        } else
        {
            outputstream.write(b.buffer(), 0, b.length());
            b = null;
            a = outputstream;
            return;
        }
    }

    public final void write(int i)
    {
        if (a == null)
        {
            b.append((byte)i);
            return;
        } else
        {
            a.write(i);
            return;
        }
    }

    public final void write(byte abyte0[], int i, int j)
    {
        if (a == null)
        {
            b.append(abyte0, i, j);
            return;
        } else
        {
            a.write(abyte0, i, j);
            return;
        }
    }
}
