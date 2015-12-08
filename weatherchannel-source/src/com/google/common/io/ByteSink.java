// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.io:
//            Closer, ByteStreams, CharSink

public abstract class ByteSink
{
    private final class AsCharSink extends CharSink
    {

        private final Charset charset;
        final ByteSink this$0;

        public Writer openStream()
            throws IOException
        {
            return new OutputStreamWriter(ByteSink.this.openStream(), charset);
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Object.this.toString()));
            String s1 = String.valueOf(String.valueOf(charset));
            return (new StringBuilder(s.length() + 13 + s1.length())).append(s).append(".asCharSink(").append(s1).append(")").toString();
        }

        private AsCharSink(Charset charset1)
        {
            this$0 = ByteSink.this;
            super();
            charset = (Charset)Preconditions.checkNotNull(charset1);
        }

    }


    protected ByteSink()
    {
    }

    public CharSink asCharSink(Charset charset)
    {
        return new AsCharSink(charset);
    }

    public OutputStream openBufferedStream()
        throws IOException
    {
        OutputStream outputstream = openStream();
        if (outputstream instanceof BufferedOutputStream)
        {
            return (BufferedOutputStream)outputstream;
        } else
        {
            return new BufferedOutputStream(outputstream);
        }
    }

    public abstract OutputStream openStream()
        throws IOException;

    public void write(byte abyte0[])
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(abyte0);
        closer = Closer.create();
        OutputStream outputstream = (OutputStream)closer.register(openStream());
        outputstream.write(abyte0);
        outputstream.flush();
        closer.close();
        return;
        abyte0;
        throw closer.rethrow(abyte0);
        abyte0;
        closer.close();
        throw abyte0;
    }

    public long writeFrom(InputStream inputstream)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(inputstream);
        closer = Closer.create();
        long l;
        OutputStream outputstream = (OutputStream)closer.register(openStream());
        l = ByteStreams.copy(inputstream, outputstream);
        outputstream.flush();
        closer.close();
        return l;
        inputstream;
        throw closer.rethrow(inputstream);
        inputstream;
        closer.close();
        throw inputstream;
    }
}
