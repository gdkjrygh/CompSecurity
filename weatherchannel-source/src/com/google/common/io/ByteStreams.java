// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

// Referenced classes of package com.google.common.io:
//            ByteProcessor, ByteArrayDataInput, ByteArrayDataOutput

public final class ByteStreams
{
    private static class ByteArrayDataInputStream
        implements ByteArrayDataInput
    {

        final DataInput input;

        public boolean readBoolean()
        {
            boolean flag;
            try
            {
                flag = input.readBoolean();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return flag;
        }

        public byte readByte()
        {
            byte byte0;
            try
            {
                byte0 = input.readByte();
            }
            catch (EOFException eofexception)
            {
                throw new IllegalStateException(eofexception);
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
            return byte0;
        }

        public char readChar()
        {
            char c;
            try
            {
                c = input.readChar();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return c;
        }

        public double readDouble()
        {
            double d;
            try
            {
                d = input.readDouble();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return d;
        }

        public float readFloat()
        {
            float f;
            try
            {
                f = input.readFloat();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return f;
        }

        public void readFully(byte abyte0[])
        {
            try
            {
                input.readFully(abyte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IllegalStateException(abyte0);
            }
        }

        public void readFully(byte abyte0[], int i, int j)
        {
            try
            {
                input.readFully(abyte0, i, j);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IllegalStateException(abyte0);
            }
        }

        public int readInt()
        {
            int i;
            try
            {
                i = input.readInt();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        public String readLine()
        {
            String s;
            try
            {
                s = input.readLine();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return s;
        }

        public long readLong()
        {
            long l;
            try
            {
                l = input.readLong();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return l;
        }

        public short readShort()
        {
            short word0;
            try
            {
                word0 = input.readShort();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return word0;
        }

        public String readUTF()
        {
            String s;
            try
            {
                s = input.readUTF();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return s;
        }

        public int readUnsignedByte()
        {
            int i;
            try
            {
                i = input.readUnsignedByte();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        public int readUnsignedShort()
        {
            int i;
            try
            {
                i = input.readUnsignedShort();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        public int skipBytes(int i)
        {
            try
            {
                i = input.skipBytes(i);
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        ByteArrayDataInputStream(ByteArrayInputStream bytearrayinputstream)
        {
            input = new DataInputStream(bytearrayinputstream);
        }
    }

    private static class ByteArrayDataOutputStream
        implements ByteArrayDataOutput
    {

        final ByteArrayOutputStream byteArrayOutputSteam;
        final DataOutput output;

        public byte[] toByteArray()
        {
            return byteArrayOutputSteam.toByteArray();
        }

        public void write(int i)
        {
            try
            {
                output.write(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void write(byte abyte0[])
        {
            try
            {
                output.write(abyte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new AssertionError(abyte0);
            }
        }

        public void write(byte abyte0[], int i, int j)
        {
            try
            {
                output.write(abyte0, i, j);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new AssertionError(abyte0);
            }
        }

        public void writeBoolean(boolean flag)
        {
            try
            {
                output.writeBoolean(flag);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeByte(int i)
        {
            try
            {
                output.writeByte(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeBytes(String s)
        {
            try
            {
                output.writeBytes(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
        }

        public void writeChar(int i)
        {
            try
            {
                output.writeChar(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeChars(String s)
        {
            try
            {
                output.writeChars(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
        }

        public void writeDouble(double d)
        {
            try
            {
                output.writeDouble(d);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeFloat(float f)
        {
            try
            {
                output.writeFloat(f);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeInt(int i)
        {
            try
            {
                output.writeInt(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeLong(long l)
        {
            try
            {
                output.writeLong(l);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeShort(int i)
        {
            try
            {
                output.writeShort(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeUTF(String s)
        {
            try
            {
                output.writeUTF(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
        }

        ByteArrayDataOutputStream(ByteArrayOutputStream bytearrayoutputstream)
        {
            byteArrayOutputSteam = bytearrayoutputstream;
            output = new DataOutputStream(bytearrayoutputstream);
        }
    }

    private static final class FastByteArrayOutputStream extends ByteArrayOutputStream
    {

        void writeTo(byte abyte0[], int i)
        {
            System.arraycopy(buf, 0, abyte0, i, count);
        }

        private FastByteArrayOutputStream()
        {
        }

    }

    private static final class LimitedInputStream extends FilterInputStream
    {

        private long left;
        private long mark;

        public int available()
            throws IOException
        {
            return (int)Math.min(in.available(), left);
        }

        public void mark(int i)
        {
            this;
            JVM INSTR monitorenter ;
            in.mark(i);
            mark = left;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public int read()
            throws IOException
        {
            int i;
            if (left == 0L)
            {
                i = -1;
            } else
            {
                int j = in.read();
                i = j;
                if (j != -1)
                {
                    left = left - 1L;
                    return j;
                }
            }
            return i;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            if (left == 0L)
            {
                i = -1;
            } else
            {
                j = (int)Math.min(j, left);
                j = in.read(abyte0, i, j);
                i = j;
                if (j != -1)
                {
                    left = left - (long)j;
                    return j;
                }
            }
            return i;
        }

        public void reset()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (!in.markSupported())
            {
                throw new IOException("Mark not supported");
            }
            break MISSING_BLOCK_LABEL_27;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            if (mark == -1L)
            {
                throw new IOException("Mark not set");
            }
            in.reset();
            left = mark;
            this;
            JVM INSTR monitorexit ;
        }

        public long skip(long l)
            throws IOException
        {
            l = Math.min(l, left);
            l = in.skip(l);
            left = left - l;
            return l;
        }

        LimitedInputStream(InputStream inputstream, long l)
        {
            super(inputstream);
            mark = -1L;
            Preconditions.checkNotNull(inputstream);
            boolean flag;
            if (l >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "limit must be non-negative");
            left = l;
        }
    }


    private static final int BUF_SIZE = 4096;
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() {

        public String toString()
        {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i)
        {
        }

        public void write(byte abyte0[])
        {
            Preconditions.checkNotNull(abyte0);
        }

        public void write(byte abyte0[], int i, int j)
        {
            Preconditions.checkNotNull(abyte0);
        }

    };

    private ByteStreams()
    {
    }

    public static long copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        Preconditions.checkNotNull(outputstream);
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return l;
            }
            outputstream.write(abyte0, 0, i);
            l += i;
        } while (true);
    }

    public static long copy(ReadableByteChannel readablebytechannel, WritableByteChannel writablebytechannel)
        throws IOException
    {
        Preconditions.checkNotNull(readablebytechannel);
        Preconditions.checkNotNull(writablebytechannel);
        ByteBuffer bytebuffer = ByteBuffer.allocate(4096);
        long l = 0L;
        for (; readablebytechannel.read(bytebuffer) != -1; bytebuffer.clear())
        {
            bytebuffer.flip();
            while (bytebuffer.hasRemaining()) 
            {
                l += writablebytechannel.write(bytebuffer);
            }
        }

        return l;
    }

    public static InputStream limit(InputStream inputstream, long l)
    {
        return new LimitedInputStream(inputstream, l);
    }

    public static ByteArrayDataInput newDataInput(ByteArrayInputStream bytearrayinputstream)
    {
        return new ByteArrayDataInputStream((ByteArrayInputStream)Preconditions.checkNotNull(bytearrayinputstream));
    }

    public static ByteArrayDataInput newDataInput(byte abyte0[])
    {
        return newDataInput(new ByteArrayInputStream(abyte0));
    }

    public static ByteArrayDataInput newDataInput(byte abyte0[], int i)
    {
        Preconditions.checkPositionIndex(i, abyte0.length);
        return newDataInput(new ByteArrayInputStream(abyte0, i, abyte0.length - i));
    }

    public static ByteArrayDataOutput newDataOutput()
    {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static ByteArrayDataOutput newDataOutput(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid size: %s", new Object[] {
            Integer.valueOf(i)
        });
        return newDataOutput(new ByteArrayOutputStream(i));
    }

    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream bytearrayoutputstream)
    {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream)Preconditions.checkNotNull(bytearrayoutputstream));
    }

    public static OutputStream nullOutputStream()
    {
        return NULL_OUTPUT_STREAM;
    }

    public static int read(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        Preconditions.checkNotNull(abyte0);
        if (j < 0)
        {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int k = 0;
        do
        {
            int l;
label0:
            {
                if (k < j)
                {
                    l = inputstream.read(abyte0, i + k, j - k);
                    if (l != -1)
                    {
                        break label0;
                    }
                }
                return k;
            }
            k += l;
        } while (true);
    }

    public static Object readBytes(InputStream inputstream, ByteProcessor byteprocessor)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        Preconditions.checkNotNull(byteprocessor);
        byte abyte0[] = new byte[4096];
        int i;
        do
        {
            i = inputstream.read(abyte0);
        } while (i != -1 && byteprocessor.processBytes(abyte0, 0, i));
        return byteprocessor.getResult();
    }

    public static void readFully(InputStream inputstream, byte abyte0[])
        throws IOException
    {
        readFully(inputstream, abyte0, 0, abyte0.length);
    }

    public static void readFully(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        i = read(inputstream, abyte0, i, j);
        if (i != j)
        {
            throw new EOFException((new StringBuilder(81)).append("reached end of stream after reading ").append(i).append(" bytes; ").append(j).append(" bytes expected").toString());
        } else
        {
            return;
        }
    }

    public static void skipFully(InputStream inputstream, long l)
        throws IOException
    {
        for (long l1 = l; l1 > 0L;)
        {
            long l2 = inputstream.skip(l1);
            if (l2 == 0L)
            {
                if (inputstream.read() == -1)
                {
                    throw new EOFException((new StringBuilder(100)).append("reached end of stream after skipping ").append(l - l1).append(" bytes; ").append(l).append(" bytes expected").toString());
                }
                l1--;
            } else
            {
                l1 -= l2;
            }
        }

    }

    public static byte[] toByteArray(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    static byte[] toByteArray(InputStream inputstream, int i)
        throws IOException
    {
        byte abyte1[];
        int j;
        abyte1 = new byte[i];
        j = i;
_L8:
        if (j <= 0) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        k = i - j;
        l = inputstream.read(abyte1, k, j);
        if (l != -1) goto _L4; else goto _L3
_L3:
        byte abyte0[] = Arrays.copyOf(abyte1, k);
_L6:
        return abyte0;
_L4:
        j -= l;
        continue; /* Loop/switch isn't completed */
_L2:
        i = inputstream.read();
        abyte0 = abyte1;
        if (i == -1) goto _L6; else goto _L5
_L5:
        FastByteArrayOutputStream fastbytearrayoutputstream = new FastByteArrayOutputStream();
        fastbytearrayoutputstream.write(i);
        copy(inputstream, fastbytearrayoutputstream);
        inputstream = new byte[abyte1.length + fastbytearrayoutputstream.size()];
        System.arraycopy(abyte1, 0, inputstream, 0, abyte1.length);
        fastbytearrayoutputstream.writeTo(inputstream, abyte1.length);
        return inputstream;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
