// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

final class GwtWorkarounds
{
    static interface ByteInput
    {

        public abstract void close()
            throws IOException;

        public abstract int read()
            throws IOException;
    }

    static interface ByteOutput
    {

        public abstract void close()
            throws IOException;

        public abstract void flush()
            throws IOException;

        public abstract void write(byte byte0)
            throws IOException;
    }

    static interface CharInput
    {

        public abstract void close()
            throws IOException;

        public abstract int read()
            throws IOException;
    }

    static interface CharOutput
    {

        public abstract void close()
            throws IOException;

        public abstract void flush()
            throws IOException;

        public abstract void write(char c)
            throws IOException;
    }


    private GwtWorkarounds()
    {
    }

    static CharInput asCharInput(Reader reader)
    {
        Preconditions.checkNotNull(reader);
        return new CharInput(reader) {

            final Reader val$reader;

            public void close()
                throws IOException
            {
                reader.close();
            }

            public int read()
                throws IOException
            {
                return reader.read();
            }

            
            {
                reader = reader1;
                super();
            }
        };
    }

    static CharInput asCharInput(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return new CharInput(charsequence) {

            int index;
            final CharSequence val$chars;

            public void close()
            {
                index = chars.length();
            }

            public int read()
            {
                if (index < chars.length())
                {
                    CharSequence charsequence1 = chars;
                    int i = index;
                    index = i + 1;
                    return charsequence1.charAt(i);
                } else
                {
                    return -1;
                }
            }

            
            {
                chars = charsequence;
                super();
                index = 0;
            }
        };
    }

    static CharOutput asCharOutput(Writer writer)
    {
        Preconditions.checkNotNull(writer);
        return new CharOutput(writer) {

            final Writer val$writer;

            public void close()
                throws IOException
            {
                writer.close();
            }

            public void flush()
                throws IOException
            {
                writer.flush();
            }

            public void write(char c)
                throws IOException
            {
                writer.append(c);
            }

            
            {
                writer = writer1;
                super();
            }
        };
    }

    static InputStream asInputStream(ByteInput byteinput)
    {
        Preconditions.checkNotNull(byteinput);
        return new InputStream(byteinput) {

            final ByteInput val$input;

            public void close()
                throws IOException
            {
                input.close();
            }

            public int read()
                throws IOException
            {
                return input.read();
            }

            public int read(byte abyte0[], int i, int j)
                throws IOException
            {
                Preconditions.checkNotNull(abyte0);
                Preconditions.checkPositionIndexes(i, i + j, abyte0.length);
                if (j != 0) goto _L2; else goto _L1
_L1:
                int l = 0;
_L4:
                return l;
_L2:
                int k = read();
                if (k == -1)
                {
                    return -1;
                }
                abyte0[i] = (byte)k;
                k = 1;
label0:
                do
                {
label1:
                    {
                        if (k >= j)
                        {
                            break label1;
                        }
                        int i1 = read();
                        l = k;
                        if (i1 == -1)
                        {
                            break label0;
                        }
                        abyte0[i + k] = (byte)i1;
                        k++;
                    }
                } while (true);
                if (true) goto _L4; else goto _L3
_L3:
                return j;
            }

            
            {
                input = byteinput;
                super();
            }
        };
    }

    static OutputStream asOutputStream(ByteOutput byteoutput)
    {
        Preconditions.checkNotNull(byteoutput);
        return new OutputStream(byteoutput) {

            final ByteOutput val$output;

            public void close()
                throws IOException
            {
                output.close();
            }

            public void flush()
                throws IOException
            {
                output.flush();
            }

            public void write(int i)
                throws IOException
            {
                output.write((byte)i);
            }

            
            {
                output = byteoutput;
                super();
            }
        };
    }

    static CharOutput stringBuilderOutput(int i)
    {
        return new CharOutput(new StringBuilder(i)) {

            final StringBuilder val$builder;

            public void close()
            {
            }

            public void flush()
            {
            }

            public String toString()
            {
                return builder.toString();
            }

            public void write(char c)
            {
                builder.append(c);
            }

            
            {
                builder = stringbuilder;
                super();
            }
        };
    }
}
