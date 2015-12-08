// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.common.io:
//            AppendableWriter, LineReader, LineProcessor

public final class CharStreams
{
    private static final class NullWriter extends Writer
    {

        private static final NullWriter INSTANCE = new NullWriter();

        public Writer append(char c)
        {
            return this;
        }

        public Writer append(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return this;
        }

        public Writer append(CharSequence charsequence, int i, int j)
        {
            Preconditions.checkPositionIndexes(i, j, charsequence.length());
            return this;
        }

        public volatile Appendable append(char c)
            throws IOException
        {
            return append(c);
        }

        public volatile Appendable append(CharSequence charsequence)
            throws IOException
        {
            return append(charsequence);
        }

        public volatile Appendable append(CharSequence charsequence, int i, int j)
            throws IOException
        {
            return append(charsequence, i, j);
        }

        public void close()
        {
        }

        public void flush()
        {
        }

        public String toString()
        {
            return "CharStreams.nullWriter()";
        }

        public void write(int i)
        {
        }

        public void write(String s)
        {
            Preconditions.checkNotNull(s);
        }

        public void write(String s, int i, int j)
        {
            Preconditions.checkPositionIndexes(i, i + j, s.length());
        }

        public void write(char ac[])
        {
            Preconditions.checkNotNull(ac);
        }

        public void write(char ac[], int i, int j)
        {
            Preconditions.checkPositionIndexes(i, i + j, ac.length);
        }



        private NullWriter()
        {
        }
    }


    private static final int BUF_SIZE = 2048;

    private CharStreams()
    {
    }

    static Reader asReader(Readable readable)
    {
        Preconditions.checkNotNull(readable);
        if (readable instanceof Reader)
        {
            return (Reader)readable;
        } else
        {
            return new Reader(readable) {

                final Readable val$readable;

                public void close()
                    throws IOException
                {
                    if (readable instanceof Closeable)
                    {
                        ((Closeable)readable).close();
                    }
                }

                public int read(CharBuffer charbuffer)
                    throws IOException
                {
                    return readable.read(charbuffer);
                }

                public int read(char ac[], int i, int j)
                    throws IOException
                {
                    return read(CharBuffer.wrap(ac, i, j));
                }

            
            {
                readable = readable1;
                super();
            }
            };
        }
    }

    public static Writer asWriter(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new AppendableWriter(appendable);
        }
    }

    public static long copy(Readable readable, Appendable appendable)
        throws IOException
    {
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(appendable);
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        long l = 0L;
        for (; readable.read(charbuffer) != -1; charbuffer.clear())
        {
            charbuffer.flip();
            appendable.append(charbuffer);
            l += charbuffer.remaining();
        }

        return l;
    }

    public static Writer nullWriter()
    {
        return NullWriter.INSTANCE;
    }

    public static Object readLines(Readable readable, LineProcessor lineprocessor)
        throws IOException
    {
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(lineprocessor);
        readable = new LineReader(readable);
        String s;
        do
        {
            s = readable.readLine();
        } while (s != null && lineprocessor.processLine(s));
        return lineprocessor.getResult();
    }

    public static List readLines(Readable readable)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        readable = new LineReader(readable);
        do
        {
            String s = readable.readLine();
            if (s != null)
            {
                arraylist.add(s);
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    public static void skipFully(Reader reader, long l)
        throws IOException
    {
        Preconditions.checkNotNull(reader);
        while (l > 0L) 
        {
            long l1 = reader.skip(l);
            if (l1 == 0L)
            {
                if (reader.read() == -1)
                {
                    throw new EOFException();
                }
                l--;
            } else
            {
                l -= l1;
            }
        }
    }

    public static String toString(Readable readable)
        throws IOException
    {
        return toStringBuilder(readable).toString();
    }

    private static StringBuilder toStringBuilder(Readable readable)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        copy(readable, stringbuilder);
        return stringbuilder;
    }
}
