// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

// Referenced classes of package com.google.common.io:
//            Closer, CharStreams

public abstract class CharSink
{

    protected CharSink()
    {
    }

    public Writer openBufferedStream()
        throws IOException
    {
        Writer writer = openStream();
        if (writer instanceof BufferedWriter)
        {
            return (BufferedWriter)writer;
        } else
        {
            return new BufferedWriter(writer);
        }
    }

    public abstract Writer openStream()
        throws IOException;

    public void write(CharSequence charsequence)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(charsequence);
        closer = Closer.create();
        Writer writer = (Writer)closer.register(openStream());
        writer.append(charsequence);
        writer.flush();
        closer.close();
        return;
        charsequence;
        throw closer.rethrow(charsequence);
        charsequence;
        closer.close();
        throw charsequence;
    }

    public long writeFrom(Readable readable)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(readable);
        closer = Closer.create();
        long l;
        Writer writer = (Writer)closer.register(openStream());
        l = CharStreams.copy(readable, writer);
        writer.flush();
        closer.close();
        return l;
        readable;
        throw closer.rethrow(readable);
        readable;
        closer.close();
        throw readable;
    }

    public void writeLines(Iterable iterable)
        throws IOException
    {
        writeLines(iterable, System.getProperty("line.separator"));
    }

    public void writeLines(Iterable iterable, String s)
        throws IOException
    {
        Closer closer;
        Writer writer;
label0:
        {
            Preconditions.checkNotNull(iterable);
            Preconditions.checkNotNull(s);
            closer = Closer.create();
            try
            {
                writer = (Writer)closer.register(openBufferedStream());
                for (iterable = iterable.iterator(); iterable.hasNext(); writer.append((CharSequence)iterable.next()).append(s)) { }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (Iterable iterable) { }
            finally
            {
                closer.close();
                throw iterable;
            }
        }
        throw closer.rethrow(iterable);
        writer.flush();
        closer.close();
        return;
    }
}
