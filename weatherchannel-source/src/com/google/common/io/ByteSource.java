// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.google.common.io:
//            Closer, ByteStreams, ByteSink, CharSource, 
//            ByteProcessor, BaseEncoding, MultiInputStream

public abstract class ByteSource
{
    private final class AsCharSource extends CharSource
    {

        private final Charset charset;
        final ByteSource this$0;

        public Reader openStream()
            throws IOException
        {
            return new InputStreamReader(ByteSource.this.openStream(), charset);
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Object.this.toString()));
            String s1 = String.valueOf(String.valueOf(charset));
            return (new StringBuilder(s.length() + 15 + s1.length())).append(s).append(".asCharSource(").append(s1).append(")").toString();
        }

        private AsCharSource(Charset charset1)
        {
            this$0 = ByteSource.this;
            super();
            charset = (Charset)Preconditions.checkNotNull(charset1);
        }

    }

    private static class ByteArrayByteSource extends ByteSource
    {

        protected final byte bytes[];

        public long copyTo(OutputStream outputstream)
            throws IOException
        {
            outputstream.write(bytes);
            return (long)bytes.length;
        }

        public HashCode hash(HashFunction hashfunction)
            throws IOException
        {
            return hashfunction.hashBytes(bytes);
        }

        public boolean isEmpty()
        {
            return bytes.length == 0;
        }

        public InputStream openBufferedStream()
            throws IOException
        {
            return openStream();
        }

        public InputStream openStream()
        {
            return new ByteArrayInputStream(bytes);
        }

        public Object read(ByteProcessor byteprocessor)
            throws IOException
        {
            byteprocessor.processBytes(bytes, 0, bytes.length);
            return byteprocessor.getResult();
        }

        public byte[] read()
        {
            return (byte[])bytes.clone();
        }

        public long size()
        {
            return (long)bytes.length;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Ascii.truncate(BaseEncoding.base16().encode(bytes), 30, "...")));
            return (new StringBuilder(s.length() + 17)).append("ByteSource.wrap(").append(s).append(")").toString();
        }

        protected ByteArrayByteSource(byte abyte0[])
        {
            bytes = (byte[])Preconditions.checkNotNull(abyte0);
        }
    }

    private static final class ConcatenatedByteSource extends ByteSource
    {

        private final Iterable sources;

        public boolean isEmpty()
            throws IOException
        {
            for (Iterator iterator = sources.iterator(); iterator.hasNext();)
            {
                if (!((ByteSource)iterator.next()).isEmpty())
                {
                    return false;
                }
            }

            return true;
        }

        public InputStream openStream()
            throws IOException
        {
            return new MultiInputStream(sources.iterator());
        }

        public long size()
            throws IOException
        {
            long l = 0L;
            for (Iterator iterator = sources.iterator(); iterator.hasNext();)
            {
                l += ((ByteSource)iterator.next()).size();
            }

            return l;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(sources));
            return (new StringBuilder(s.length() + 19)).append("ByteSource.concat(").append(s).append(")").toString();
        }

        ConcatenatedByteSource(Iterable iterable)
        {
            sources = (Iterable)Preconditions.checkNotNull(iterable);
        }
    }

    private static final class EmptyByteSource extends ByteArrayByteSource
    {

        private static final EmptyByteSource INSTANCE = new EmptyByteSource();

        public CharSource asCharSource(Charset charset)
        {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }

        public byte[] read()
        {
            return bytes;
        }

        public String toString()
        {
            return "ByteSource.empty()";
        }



        private EmptyByteSource()
        {
            super(new byte[0]);
        }
    }

    private final class SlicedByteSource extends ByteSource
    {

        private final long length;
        private final long offset;
        final ByteSource this$0;

        private InputStream sliceStream(InputStream inputstream)
            throws IOException
        {
            if (offset <= 0L)
            {
                break MISSING_BLOCK_LABEL_17;
            }
            ByteStreams.skipFully(inputstream, offset);
            return ByteStreams.limit(inputstream, length);
            Throwable throwable;
            throwable;
            Closer closer;
            closer = Closer.create();
            closer.register(inputstream);
            throw closer.rethrow(throwable);
            inputstream;
            closer.close();
            throw inputstream;
        }

        public boolean isEmpty()
            throws IOException
        {
            return length == 0L || isEmpty();
        }

        public InputStream openBufferedStream()
            throws IOException
        {
            return sliceStream(ByteSource.this.openBufferedStream());
        }

        public InputStream openStream()
            throws IOException
        {
            return sliceStream(ByteSource.this.openStream());
        }

        public ByteSource slice(long l, long l1)
        {
            long l2;
            boolean flag;
            if (l >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "offset (%s) may not be negative", new Object[] {
                Long.valueOf(l)
            });
            if (l1 >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "length (%s) may not be negative", new Object[] {
                Long.valueOf(l1)
            });
            l2 = length;
            return ByteSource.this.slice(offset + l, Math.min(l1, l2 - l));
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Object.this.toString()));
            long l = offset;
            long l1 = length;
            return (new StringBuilder(s.length() + 50)).append(s).append(".slice(").append(l).append(", ").append(l1).append(")").toString();
        }

        private SlicedByteSource(long l, long l1)
        {
            this$0 = ByteSource.this;
            super();
            boolean flag;
            if (l >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "offset (%s) may not be negative", new Object[] {
                Long.valueOf(l)
            });
            if (l1 >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "length (%s) may not be negative", new Object[] {
                Long.valueOf(l1)
            });
            offset = l;
            length = l1;
        }

        SlicedByteSource(long l, long l1, _cls1 _pcls1)
        {
            this(l, l1);
        }
    }


    private static final int BUF_SIZE = 4096;
    private static final byte countBuffer[] = new byte[4096];

    protected ByteSource()
    {
    }

    public static ByteSource concat(Iterable iterable)
    {
        return new ConcatenatedByteSource(iterable);
    }

    public static ByteSource concat(Iterator iterator)
    {
        return concat(((Iterable) (ImmutableList.copyOf(iterator))));
    }

    public static transient ByteSource concat(ByteSource abytesource[])
    {
        return concat(((Iterable) (ImmutableList.copyOf(abytesource))));
    }

    private long countByReading(InputStream inputstream)
        throws IOException
    {
        long l = 0L;
        do
        {
            long l1 = inputstream.read(countBuffer);
            if (l1 != -1L)
            {
                l += l1;
            } else
            {
                return l;
            }
        } while (true);
    }

    private long countBySkipping(InputStream inputstream)
        throws IOException
    {
        long l = 0L;
        do
        {
            long l1 = inputstream.skip(Math.min(inputstream.available(), 0x7fffffff));
            if (l1 <= 0L)
            {
                if (inputstream.read() == -1)
                {
                    return l;
                }
                if (l == 0L && inputstream.available() == 0)
                {
                    throw new IOException();
                }
                l++;
            } else
            {
                l += l1;
            }
        } while (true);
    }

    public static ByteSource empty()
    {
        return EmptyByteSource.INSTANCE;
    }

    public static ByteSource wrap(byte abyte0[])
    {
        return new ByteArrayByteSource(abyte0);
    }

    public CharSource asCharSource(Charset charset)
    {
        return new AsCharSource(charset);
    }

    public boolean contentEquals(ByteSource bytesource)
        throws IOException
    {
        Closer closer;
        byte abyte0[];
        byte abyte1[];
        Preconditions.checkNotNull(bytesource);
        abyte0 = new byte[4096];
        abyte1 = new byte[4096];
        closer = Closer.create();
        InputStream inputstream;
        inputstream = (InputStream)closer.register(openStream());
        bytesource = (InputStream)closer.register(bytesource.openStream());
_L4:
        int i = ByteStreams.read(inputstream, abyte0, 0, 4096);
        if (i != ByteStreams.read(bytesource, abyte1, 0, 4096)) goto _L2; else goto _L1
_L1:
        boolean flag = Arrays.equals(abyte0, abyte1);
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        closer.close();
        return false;
        if (i == 4096) goto _L4; else goto _L3
_L3:
        closer.close();
        return true;
        bytesource;
        throw closer.rethrow(bytesource);
        bytesource;
        closer.close();
        throw bytesource;
    }

    public long copyTo(ByteSink bytesink)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(bytesink);
        closer = Closer.create();
        long l = ByteStreams.copy((InputStream)closer.register(openStream()), (OutputStream)closer.register(bytesink.openStream()));
        closer.close();
        return l;
        bytesink;
        throw closer.rethrow(bytesink);
        bytesink;
        closer.close();
        throw bytesink;
    }

    public long copyTo(OutputStream outputstream)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(outputstream);
        closer = Closer.create();
        long l = ByteStreams.copy((InputStream)closer.register(openStream()), outputstream);
        closer.close();
        return l;
        outputstream;
        throw closer.rethrow(outputstream);
        outputstream;
        closer.close();
        throw outputstream;
    }

    public HashCode hash(HashFunction hashfunction)
        throws IOException
    {
        hashfunction = hashfunction.newHasher();
        copyTo(Funnels.asOutputStream(hashfunction));
        return hashfunction.hash();
    }

    public boolean isEmpty()
        throws IOException
    {
        Closer closer = Closer.create();
        int i = ((InputStream)closer.register(openStream())).read();
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        closer.close();
        return flag;
        Object obj;
        obj;
        throw closer.rethrow(((Throwable) (obj)));
        obj;
        closer.close();
        throw obj;
    }

    public InputStream openBufferedStream()
        throws IOException
    {
        InputStream inputstream = openStream();
        if (inputstream instanceof BufferedInputStream)
        {
            return (BufferedInputStream)inputstream;
        } else
        {
            return new BufferedInputStream(inputstream);
        }
    }

    public abstract InputStream openStream()
        throws IOException;

    public Object read(ByteProcessor byteprocessor)
        throws IOException
    {
        Closer closer;
        Preconditions.checkNotNull(byteprocessor);
        closer = Closer.create();
        byteprocessor = ((ByteProcessor) (ByteStreams.readBytes((InputStream)closer.register(openStream()), byteprocessor)));
        closer.close();
        return byteprocessor;
        byteprocessor;
        throw closer.rethrow(byteprocessor);
        byteprocessor;
        closer.close();
        throw byteprocessor;
    }

    public byte[] read()
        throws IOException
    {
        Closer closer = Closer.create();
        byte abyte0[] = ByteStreams.toByteArray((InputStream)closer.register(openStream()));
        closer.close();
        return abyte0;
        Object obj;
        obj;
        throw closer.rethrow(((Throwable) (obj)));
        obj;
        closer.close();
        throw obj;
    }

    public long size()
        throws IOException
    {
        Closer closer = Closer.create();
        long l = countBySkipping((InputStream)closer.register(openStream()));
        closer.close();
        return l;
        Object obj;
        obj;
        closer.close();
        closer = Closer.create();
        l = countByReading((InputStream)closer.register(openStream()));
        closer.close();
        return l;
        obj;
        closer.close();
        throw obj;
        obj;
        throw closer.rethrow(((Throwable) (obj)));
        obj;
        closer.close();
        throw obj;
    }

    public ByteSource slice(long l, long l1)
    {
        return new SlicedByteSource(l, l1);
    }

}
