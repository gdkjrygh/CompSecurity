// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            ByteArrayDataOutput, ByteStreams

private static class output
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

    (ByteArrayOutputStream bytearrayoutputstream)
    {
        byteArrayOutputSteam = bytearrayoutputstream;
        output = new DataOutputStream(bytearrayoutputstream);
    }
}
