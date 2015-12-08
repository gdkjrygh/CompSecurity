// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

class FaultHidingSink extends ForwardingSink
{

    private boolean hasErrors;

    public FaultHidingSink(Sink sink)
    {
        super(sink);
    }

    public void close()
        throws IOException
    {
        if (hasErrors)
        {
            return;
        }
        try
        {
            super.close();
            return;
        }
        catch (IOException ioexception)
        {
            hasErrors = true;
            onException(ioexception);
            return;
        }
    }

    public void flush()
        throws IOException
    {
        if (hasErrors)
        {
            return;
        }
        try
        {
            super.flush();
            return;
        }
        catch (IOException ioexception)
        {
            hasErrors = true;
            onException(ioexception);
            return;
        }
    }

    protected void onException(IOException ioexception)
    {
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        if (hasErrors)
        {
            buffer.skip(l);
            return;
        }
        try
        {
            super.write(buffer, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Buffer buffer)
        {
            hasErrors = true;
        }
        onException(buffer);
    }
}
