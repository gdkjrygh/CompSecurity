// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            ByteArrayDataInput, ByteStreams

private static class input
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

    (ByteArrayInputStream bytearrayinputstream)
    {
        input = new DataInputStream(bytearrayinputstream);
    }
}
