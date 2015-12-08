// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EndianUtils
{

    public EndianUtils()
    {
    }

    private static int read(InputStream inputstream)
        throws IOException
    {
        int i = inputstream.read();
        if (-1 == i)
        {
            throw new EOFException("Unexpected EOF reached");
        } else
        {
            return i;
        }
    }

    public static double readSwappedDouble(InputStream inputstream)
        throws IOException
    {
        return Double.longBitsToDouble(readSwappedLong(inputstream));
    }

    public static double readSwappedDouble(byte abyte0[], int i)
    {
        return Double.longBitsToDouble(readSwappedLong(abyte0, i));
    }

    public static float readSwappedFloat(InputStream inputstream)
        throws IOException
    {
        return Float.intBitsToFloat(readSwappedInteger(inputstream));
    }

    public static float readSwappedFloat(byte abyte0[], int i)
    {
        return Float.intBitsToFloat(readSwappedInteger(abyte0, i));
    }

    public static int readSwappedInteger(InputStream inputstream)
        throws IOException
    {
        return ((read(inputstream) & 0xff) << 0) + ((read(inputstream) & 0xff) << 8) + ((read(inputstream) & 0xff) << 16) + ((read(inputstream) & 0xff) << 24);
    }

    public static int readSwappedInteger(byte abyte0[], int i)
    {
        return ((abyte0[i + 0] & 0xff) << 0) + ((abyte0[i + 1] & 0xff) << 8) + ((abyte0[i + 2] & 0xff) << 16) + ((abyte0[i + 3] & 0xff) << 24);
    }

    public static long readSwappedLong(InputStream inputstream)
        throws IOException
    {
        byte abyte0[] = new byte[8];
        for (int i = 0; i < 8; i++)
        {
            abyte0[i] = (byte)read(inputstream);
        }

        return readSwappedLong(abyte0, 0);
    }

    public static long readSwappedLong(byte abyte0[], int i)
    {
        long l = ((abyte0[i + 0] & 0xff) << 0) + ((abyte0[i + 1] & 0xff) << 8) + ((abyte0[i + 2] & 0xff) << 16) + ((abyte0[i + 3] & 0xff) << 24);
        return ((long)(((abyte0[i + 4] & 0xff) << 0) + ((abyte0[i + 5] & 0xff) << 8) + ((abyte0[i + 6] & 0xff) << 16) + ((abyte0[i + 7] & 0xff) << 24)) << 32) + (0xffffffffL & l);
    }

    public static short readSwappedShort(InputStream inputstream)
        throws IOException
    {
        return (short)(((read(inputstream) & 0xff) << 0) + ((read(inputstream) & 0xff) << 8));
    }

    public static short readSwappedShort(byte abyte0[], int i)
    {
        return (short)(((abyte0[i + 0] & 0xff) << 0) + ((abyte0[i + 1] & 0xff) << 8));
    }

    public static long readSwappedUnsignedInteger(InputStream inputstream)
        throws IOException
    {
        int i = read(inputstream);
        int j = read(inputstream);
        int k = read(inputstream);
        int l = read(inputstream);
        long l1 = ((i & 0xff) << 0) + ((j & 0xff) << 8) + ((k & 0xff) << 16);
        return ((long)(l & 0xff) << 24) + (0xffffffffL & l1);
    }

    public static long readSwappedUnsignedInteger(byte abyte0[], int i)
    {
        long l = ((abyte0[i + 0] & 0xff) << 0) + ((abyte0[i + 1] & 0xff) << 8) + ((abyte0[i + 2] & 0xff) << 16);
        return ((long)(abyte0[i + 3] & 0xff) << 24) + (0xffffffffL & l);
    }

    public static int readSwappedUnsignedShort(InputStream inputstream)
        throws IOException
    {
        return ((read(inputstream) & 0xff) << 0) + ((read(inputstream) & 0xff) << 8);
    }

    public static int readSwappedUnsignedShort(byte abyte0[], int i)
    {
        return ((abyte0[i + 0] & 0xff) << 0) + ((abyte0[i + 1] & 0xff) << 8);
    }

    public static double swapDouble(double d)
    {
        return Double.longBitsToDouble(swapLong(Double.doubleToLongBits(d)));
    }

    public static float swapFloat(float f)
    {
        return Float.intBitsToFloat(swapInteger(Float.floatToIntBits(f)));
    }

    public static int swapInteger(int i)
    {
        return ((i >> 0 & 0xff) << 24) + ((i >> 8 & 0xff) << 16) + ((i >> 16 & 0xff) << 8) + ((i >> 24 & 0xff) << 0);
    }

    public static long swapLong(long l)
    {
        return ((l >> 0 & 255L) << 56) + ((l >> 8 & 255L) << 48) + ((l >> 16 & 255L) << 40) + ((l >> 24 & 255L) << 32) + ((l >> 32 & 255L) << 24) + ((l >> 40 & 255L) << 16) + ((l >> 48 & 255L) << 8) + ((l >> 56 & 255L) << 0);
    }

    public static short swapShort(short word0)
    {
        return (short)(((word0 >> 0 & 0xff) << 8) + ((word0 >> 8 & 0xff) << 0));
    }

    public static void writeSwappedDouble(OutputStream outputstream, double d)
        throws IOException
    {
        writeSwappedLong(outputstream, Double.doubleToLongBits(d));
    }

    public static void writeSwappedDouble(byte abyte0[], int i, double d)
    {
        writeSwappedLong(abyte0, i, Double.doubleToLongBits(d));
    }

    public static void writeSwappedFloat(OutputStream outputstream, float f)
        throws IOException
    {
        writeSwappedInteger(outputstream, Float.floatToIntBits(f));
    }

    public static void writeSwappedFloat(byte abyte0[], int i, float f)
    {
        writeSwappedInteger(abyte0, i, Float.floatToIntBits(f));
    }

    public static void writeSwappedInteger(OutputStream outputstream, int i)
        throws IOException
    {
        outputstream.write((byte)(i >> 0 & 0xff));
        outputstream.write((byte)(i >> 8 & 0xff));
        outputstream.write((byte)(i >> 16 & 0xff));
        outputstream.write((byte)(i >> 24 & 0xff));
    }

    public static void writeSwappedInteger(byte abyte0[], int i, int j)
    {
        abyte0[i + 0] = (byte)(j >> 0 & 0xff);
        abyte0[i + 1] = (byte)(j >> 8 & 0xff);
        abyte0[i + 2] = (byte)(j >> 16 & 0xff);
        abyte0[i + 3] = (byte)(j >> 24 & 0xff);
    }

    public static void writeSwappedLong(OutputStream outputstream, long l)
        throws IOException
    {
        outputstream.write((byte)(int)(l >> 0 & 255L));
        outputstream.write((byte)(int)(l >> 8 & 255L));
        outputstream.write((byte)(int)(l >> 16 & 255L));
        outputstream.write((byte)(int)(l >> 24 & 255L));
        outputstream.write((byte)(int)(l >> 32 & 255L));
        outputstream.write((byte)(int)(l >> 40 & 255L));
        outputstream.write((byte)(int)(l >> 48 & 255L));
        outputstream.write((byte)(int)(l >> 56 & 255L));
    }

    public static void writeSwappedLong(byte abyte0[], int i, long l)
    {
        abyte0[i + 0] = (byte)(int)(l >> 0 & 255L);
        abyte0[i + 1] = (byte)(int)(l >> 8 & 255L);
        abyte0[i + 2] = (byte)(int)(l >> 16 & 255L);
        abyte0[i + 3] = (byte)(int)(l >> 24 & 255L);
        abyte0[i + 4] = (byte)(int)(l >> 32 & 255L);
        abyte0[i + 5] = (byte)(int)(l >> 40 & 255L);
        abyte0[i + 6] = (byte)(int)(l >> 48 & 255L);
        abyte0[i + 7] = (byte)(int)(l >> 56 & 255L);
    }

    public static void writeSwappedShort(OutputStream outputstream, short word0)
        throws IOException
    {
        outputstream.write((byte)(word0 >> 0 & 0xff));
        outputstream.write((byte)(word0 >> 8 & 0xff));
    }

    public static void writeSwappedShort(byte abyte0[], int i, short word0)
    {
        abyte0[i + 0] = (byte)(word0 >> 0 & 0xff);
        abyte0[i + 1] = (byte)(word0 >> 8 & 0xff);
    }
}
