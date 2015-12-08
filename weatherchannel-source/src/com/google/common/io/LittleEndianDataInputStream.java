// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.io:
//            ByteStreams

public final class LittleEndianDataInputStream extends FilterInputStream
    implements DataInput
{

    public LittleEndianDataInputStream(InputStream inputstream)
    {
        super((InputStream)Preconditions.checkNotNull(inputstream));
    }

    private byte readAndCheckByte()
        throws IOException, EOFException
    {
        int i = in.read();
        if (-1 == i)
        {
            throw new EOFException();
        } else
        {
            return (byte)i;
        }
    }

    public boolean readBoolean()
        throws IOException
    {
        return readUnsignedByte() != 0;
    }

    public byte readByte()
        throws IOException
    {
        return (byte)readUnsignedByte();
    }

    public char readChar()
        throws IOException
    {
        return (char)readUnsignedShort();
    }

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte abyte0[])
        throws IOException
    {
        ByteStreams.readFully(this, abyte0);
    }

    public void readFully(byte abyte0[], int i, int j)
        throws IOException
    {
        ByteStreams.readFully(this, abyte0, i, j);
    }

    public int readInt()
        throws IOException
    {
        byte byte0 = readAndCheckByte();
        byte byte1 = readAndCheckByte();
        byte byte2 = readAndCheckByte();
        return Ints.fromBytes(readAndCheckByte(), byte2, byte1, byte0);
    }

    public String readLine()
    {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    public long readLong()
        throws IOException
    {
        byte byte0 = readAndCheckByte();
        byte byte1 = readAndCheckByte();
        byte byte2 = readAndCheckByte();
        byte byte3 = readAndCheckByte();
        byte byte4 = readAndCheckByte();
        byte byte5 = readAndCheckByte();
        byte byte6 = readAndCheckByte();
        return Longs.fromBytes(readAndCheckByte(), byte6, byte5, byte4, byte3, byte2, byte1, byte0);
    }

    public short readShort()
        throws IOException
    {
        return (short)readUnsignedShort();
    }

    public String readUTF()
        throws IOException
    {
        return (new DataInputStream(in)).readUTF();
    }

    public int readUnsignedByte()
        throws IOException
    {
        int i = in.read();
        if (i < 0)
        {
            throw new EOFException();
        } else
        {
            return i;
        }
    }

    public int readUnsignedShort()
        throws IOException
    {
        byte byte0 = readAndCheckByte();
        return Ints.fromBytes((byte)0, (byte)0, readAndCheckByte(), byte0);
    }

    public int skipBytes(int i)
        throws IOException
    {
        return (int)in.skip(i);
    }
}
