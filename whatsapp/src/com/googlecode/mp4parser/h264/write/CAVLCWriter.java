// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.googlecode.mp4parser.h264.write:
//            BitstreamWriter

public class CAVLCWriter extends BitstreamWriter
{

    public CAVLCWriter(OutputStream outputstream)
    {
        super(outputstream);
    }

    public void writeBool(boolean flag, String s)
        throws IOException
    {
        Debug.print((new StringBuilder(String.valueOf(s))).append("\t").toString());
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        write1Bit(i);
        Debug.println((new StringBuilder("\t")).append(flag).toString());
    }

    public void writeNBit(long l, int i, String s)
        throws IOException
    {
        Debug.print((new StringBuilder(String.valueOf(s))).append("\t").toString());
        int j = 0;
        do
        {
            if (j >= i)
            {
                Debug.println((new StringBuilder("\t")).append(l).toString());
                return;
            }
            write1Bit((int)(l >> i - j - 1) & 1);
            j++;
        } while (true);
    }

    public void writeSE(int i, String s)
        throws IOException
    {
        int j = 1;
        Debug.print((new StringBuilder(String.valueOf(s))).append("\t").toString());
        byte byte0;
        if (i < 0)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        if (i <= 0)
        {
            j = 0;
        }
        writeUE(j + byte0 * (i << 1));
        Debug.println((new StringBuilder("\t")).append(i).toString());
    }

    public void writeSliceTrailingBits()
    {
        throw new IllegalStateException("todo");
    }

    public void writeTrailingBits()
        throws IOException
    {
        write1Bit(1);
        writeRemainingZero();
        flush();
    }

    public void writeU(int i, int j)
        throws IOException
    {
        writeNBit(i, j);
    }

    public void writeU(int i, int j, String s)
        throws IOException
    {
        Debug.print((new StringBuilder(String.valueOf(s))).append("\t").toString());
        writeNBit(i, j);
        Debug.println((new StringBuilder("\t")).append(i).toString());
    }

    public void writeUE(int i)
        throws IOException
    {
        int j;
        int k;
        boolean flag;
        flag = false;
        k = 0;
        j = 0;
_L6:
        if (j < 15) goto _L2; else goto _L1
_L1:
        j = ((flag) ? 1 : 0);
_L3:
        writeNBit(0L, j);
        write1Bit(1);
        writeNBit(i - k, j);
        return;
_L2:
        if (i >= (1 << j) + k) goto _L4; else goto _L3
_L4:
        k += 1 << j;
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void writeUE(int i, String s)
        throws IOException
    {
        Debug.print((new StringBuilder(String.valueOf(s))).append("\t").toString());
        writeUE(i);
        Debug.println((new StringBuilder("\t")).append(i).toString());
    }
}
