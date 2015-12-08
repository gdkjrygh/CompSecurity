// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.EndianUtils;

// Referenced classes of package org.apache.commons.io.input:
//            ProxyInputStream

public class SwappedDataInputStream extends ProxyInputStream
    implements DataInput
{

    public SwappedDataInputStream(InputStream inputstream)
    {
        super(inputstream);
    }

    public boolean readBoolean()
        throws IOException, EOFException
    {
        return readByte() != 0;
    }

    public byte readByte()
        throws IOException, EOFException
    {
        return (byte)in.read();
    }

    public char readChar()
        throws IOException, EOFException
    {
        return (char)readShort();
    }

    public double readDouble()
        throws IOException, EOFException
    {
        return EndianUtils.readSwappedDouble(in);
    }

    public float readFloat()
        throws IOException, EOFException
    {
        return EndianUtils.readSwappedFloat(in);
    }

    public void readFully(byte abyte0[])
        throws IOException, EOFException
    {
        readFully(abyte0, 0, abyte0.length);
    }

    public void readFully(byte abyte0[], int i, int j)
        throws IOException, EOFException
    {
        int l;
        for (int k = j; k > 0; k -= l)
        {
            l = read(abyte0, (i + j) - k, k);
            if (-1 == l)
            {
                throw new EOFException();
            }
        }

    }

    public int readInt()
        throws IOException, EOFException
    {
        return EndianUtils.readSwappedInteger(in);
    }

    public String readLine()
        throws IOException, EOFException
    {
        throw new UnsupportedOperationException("Operation not supported: readLine()");
    }

    public long readLong()
        throws IOException, EOFException
    {
        return EndianUtils.readSwappedLong(in);
    }

    public short readShort()
        throws IOException, EOFException
    {
        return EndianUtils.readSwappedShort(in);
    }

    public String readUTF()
        throws IOException, EOFException
    {
        throw new UnsupportedOperationException("Operation not supported: readUTF()");
    }

    public int readUnsignedByte()
        throws IOException, EOFException
    {
        return in.read();
    }

    public int readUnsignedShort()
        throws IOException, EOFException
    {
        return EndianUtils.readSwappedUnsignedShort(in);
    }

    public int skipBytes(int i)
        throws IOException, EOFException
    {
        return (int)in.skip(i);
    }
}
