// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;
import java.io.IOException;
import java.io.OutputStream;

public class BitstreamWriter
{

    private int curBit;
    private int curByte[];
    private final OutputStream os;

    public BitstreamWriter(OutputStream outputstream)
    {
        curByte = new int[8];
        os = outputstream;
    }

    private void writeCurByte()
        throws IOException
    {
        int i = curByte[0];
        int j = curByte[1];
        int k = curByte[2];
        int l = curByte[3];
        int i1 = curByte[4];
        int j1 = curByte[5];
        int k1 = curByte[6];
        int l1 = curByte[7];
        os.write(i << 7 | j << 6 | k << 5 | l << 4 | i1 << 3 | j1 << 2 | k1 << 1 | l1);
    }

    public void flush()
        throws IOException
    {
        int i = curBit;
        do
        {
            if (i >= 8)
            {
                curBit = 0;
                writeCurByte();
                return;
            }
            curByte[i] = 0;
            i++;
        } while (true);
    }

    public void write1Bit(int i)
        throws IOException
    {
        Debug.print(i);
        if (curBit == 8)
        {
            curBit = 0;
            writeCurByte();
        }
        int ai[] = curByte;
        int j = curBit;
        curBit = j + 1;
        ai[j] = i;
    }

    public void writeByte(int i)
        throws IOException
    {
        os.write(i);
    }

    public void writeNBit(long l, int i)
        throws IOException
    {
        int j = 0;
        do
        {
            if (j >= i)
            {
                return;
            }
            write1Bit((int)(l >> i - j - 1) & 1);
            j++;
        } while (true);
    }

    public void writeRemainingZero()
        throws IOException
    {
        writeNBit(0L, 8 - curBit);
    }
}
