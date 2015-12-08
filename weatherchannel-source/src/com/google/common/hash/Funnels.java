// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

// Referenced classes of package com.google.common.hash:
//            PrimitiveSink, Funnel

public final class Funnels
{
    private static final class ByteArrayFunnel extends Enum
        implements Funnel
    {

        private static final ByteArrayFunnel $VALUES[];
        public static final ByteArrayFunnel INSTANCE;

        public static ByteArrayFunnel valueOf(String s)
        {
            return (ByteArrayFunnel)Enum.valueOf(com/google/common/hash/Funnels$ByteArrayFunnel, s);
        }

        public static ByteArrayFunnel[] values()
        {
            return (ByteArrayFunnel[])$VALUES.clone();
        }

        public volatile void funnel(Object obj, PrimitiveSink primitivesink)
        {
            funnel((byte[])obj, primitivesink);
        }

        public void funnel(byte abyte0[], PrimitiveSink primitivesink)
        {
            primitivesink.putBytes(abyte0);
        }

        public String toString()
        {
            return "Funnels.byteArrayFunnel()";
        }

        static 
        {
            INSTANCE = new ByteArrayFunnel("INSTANCE", 0);
            $VALUES = (new ByteArrayFunnel[] {
                INSTANCE
            });
        }

        private ByteArrayFunnel(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class IntegerFunnel extends Enum
        implements Funnel
    {

        private static final IntegerFunnel $VALUES[];
        public static final IntegerFunnel INSTANCE;

        public static IntegerFunnel valueOf(String s)
        {
            return (IntegerFunnel)Enum.valueOf(com/google/common/hash/Funnels$IntegerFunnel, s);
        }

        public static IntegerFunnel[] values()
        {
            return (IntegerFunnel[])$VALUES.clone();
        }

        public void funnel(Integer integer, PrimitiveSink primitivesink)
        {
            primitivesink.putInt(integer.intValue());
        }

        public volatile void funnel(Object obj, PrimitiveSink primitivesink)
        {
            funnel((Integer)obj, primitivesink);
        }

        public String toString()
        {
            return "Funnels.integerFunnel()";
        }

        static 
        {
            INSTANCE = new IntegerFunnel("INSTANCE", 0);
            $VALUES = (new IntegerFunnel[] {
                INSTANCE
            });
        }

        private IntegerFunnel(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class LongFunnel extends Enum
        implements Funnel
    {

        private static final LongFunnel $VALUES[];
        public static final LongFunnel INSTANCE;

        public static LongFunnel valueOf(String s)
        {
            return (LongFunnel)Enum.valueOf(com/google/common/hash/Funnels$LongFunnel, s);
        }

        public static LongFunnel[] values()
        {
            return (LongFunnel[])$VALUES.clone();
        }

        public void funnel(Long long1, PrimitiveSink primitivesink)
        {
            primitivesink.putLong(long1.longValue());
        }

        public volatile void funnel(Object obj, PrimitiveSink primitivesink)
        {
            funnel((Long)obj, primitivesink);
        }

        public String toString()
        {
            return "Funnels.longFunnel()";
        }

        static 
        {
            INSTANCE = new LongFunnel("INSTANCE", 0);
            $VALUES = (new LongFunnel[] {
                INSTANCE
            });
        }

        private LongFunnel(String s, int i)
        {
            super(s, i);
        }
    }

    private static class SequentialFunnel
        implements Funnel, Serializable
    {

        private final Funnel elementFunnel;

        public boolean equals(Object obj)
        {
            if (obj instanceof SequentialFunnel)
            {
                obj = (SequentialFunnel)obj;
                return elementFunnel.equals(((SequentialFunnel) (obj)).elementFunnel);
            } else
            {
                return false;
            }
        }

        public void funnel(Iterable iterable, PrimitiveSink primitivesink)
        {
            Object obj;
            for (iterable = iterable.iterator(); iterable.hasNext(); elementFunnel.funnel(obj, primitivesink))
            {
                obj = iterable.next();
            }

        }

        public volatile void funnel(Object obj, PrimitiveSink primitivesink)
        {
            funnel((Iterable)obj, primitivesink);
        }

        public int hashCode()
        {
            return com/google/common/hash/Funnels$SequentialFunnel.hashCode() ^ elementFunnel.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(elementFunnel));
            return (new StringBuilder(s.length() + 26)).append("Funnels.sequentialFunnel(").append(s).append(")").toString();
        }

        SequentialFunnel(Funnel funnel1)
        {
            elementFunnel = (Funnel)Preconditions.checkNotNull(funnel1);
        }
    }

    private static class SinkAsStream extends OutputStream
    {

        final PrimitiveSink sink;

        public String toString()
        {
            String s = String.valueOf(String.valueOf(sink));
            return (new StringBuilder(s.length() + 24)).append("Funnels.asOutputStream(").append(s).append(")").toString();
        }

        public void write(int i)
        {
            sink.putByte((byte)i);
        }

        public void write(byte abyte0[])
        {
            sink.putBytes(abyte0);
        }

        public void write(byte abyte0[], int i, int j)
        {
            sink.putBytes(abyte0, i, j);
        }

        SinkAsStream(PrimitiveSink primitivesink)
        {
            sink = (PrimitiveSink)Preconditions.checkNotNull(primitivesink);
        }
    }

    private static class StringCharsetFunnel
        implements Funnel, Serializable
    {

        private final Charset charset;

        public boolean equals(Object obj)
        {
            if (obj instanceof StringCharsetFunnel)
            {
                obj = (StringCharsetFunnel)obj;
                return charset.equals(((StringCharsetFunnel) (obj)).charset);
            } else
            {
                return false;
            }
        }

        public void funnel(CharSequence charsequence, PrimitiveSink primitivesink)
        {
            primitivesink.putString(charsequence, charset);
        }

        public volatile void funnel(Object obj, PrimitiveSink primitivesink)
        {
            funnel((CharSequence)obj, primitivesink);
        }

        public int hashCode()
        {
            return com/google/common/hash/Funnels$StringCharsetFunnel.hashCode() ^ charset.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(charset.name()));
            return (new StringBuilder(s.length() + 22)).append("Funnels.stringFunnel(").append(s).append(")").toString();
        }

        Object writeReplace()
        {
            return new SerializedForm(charset);
        }

        StringCharsetFunnel(Charset charset1)
        {
            charset = (Charset)Preconditions.checkNotNull(charset1);
        }
    }

    private static class StringCharsetFunnel.SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final String charsetCanonicalName;

        private Object readResolve()
        {
            return Funnels.stringFunnel(Charset.forName(charsetCanonicalName));
        }

        StringCharsetFunnel.SerializedForm(Charset charset)
        {
            charsetCanonicalName = charset.name();
        }
    }

    private static final class UnencodedCharsFunnel extends Enum
        implements Funnel
    {

        private static final UnencodedCharsFunnel $VALUES[];
        public static final UnencodedCharsFunnel INSTANCE;

        public static UnencodedCharsFunnel valueOf(String s)
        {
            return (UnencodedCharsFunnel)Enum.valueOf(com/google/common/hash/Funnels$UnencodedCharsFunnel, s);
        }

        public static UnencodedCharsFunnel[] values()
        {
            return (UnencodedCharsFunnel[])$VALUES.clone();
        }

        public void funnel(CharSequence charsequence, PrimitiveSink primitivesink)
        {
            primitivesink.putUnencodedChars(charsequence);
        }

        public volatile void funnel(Object obj, PrimitiveSink primitivesink)
        {
            funnel((CharSequence)obj, primitivesink);
        }

        public String toString()
        {
            return "Funnels.unencodedCharsFunnel()";
        }

        static 
        {
            INSTANCE = new UnencodedCharsFunnel("INSTANCE", 0);
            $VALUES = (new UnencodedCharsFunnel[] {
                INSTANCE
            });
        }

        private UnencodedCharsFunnel(String s, int i)
        {
            super(s, i);
        }
    }


    private Funnels()
    {
    }

    public static OutputStream asOutputStream(PrimitiveSink primitivesink)
    {
        return new SinkAsStream(primitivesink);
    }

    public static Funnel byteArrayFunnel()
    {
        return ByteArrayFunnel.INSTANCE;
    }

    public static Funnel integerFunnel()
    {
        return IntegerFunnel.INSTANCE;
    }

    public static Funnel longFunnel()
    {
        return LongFunnel.INSTANCE;
    }

    public static Funnel sequentialFunnel(Funnel funnel)
    {
        return new SequentialFunnel(funnel);
    }

    public static Funnel stringFunnel(Charset charset)
    {
        return new StringCharsetFunnel(charset);
    }

    public static Funnel unencodedCharsFunnel()
    {
        return UnencodedCharsFunnel.INSTANCE;
    }
}
