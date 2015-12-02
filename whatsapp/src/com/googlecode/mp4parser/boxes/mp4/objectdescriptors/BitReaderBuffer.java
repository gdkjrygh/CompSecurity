// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitReaderBuffer
{

    private ByteBuffer buffer;
    int initialPos;
    int position;

    public BitReaderBuffer(ByteBuffer bytebuffer)
    {
        buffer = bytebuffer;
        initialPos = bytebuffer.position();
    }

    public int byteSync()
    {
        int j = 8 - position % 8;
        int i = j;
        if (j == 8)
        {
            i = 0;
        }
        readBits(i);
        return i;
    }

    public int getPosition()
    {
        return position;
    }

    public int readBits(int i)
    {
        int j = buffer.get(initialPos + position / 8);
        if (j < 0)
        {
            j += 256;
        }
        int k = 8 - position % 8;
        if (i <= k)
        {
            j = (j << position % 8 & 0xff) >> position % 8 + (k - i);
            position = position + i;
            i = j;
        } else
        {
            i -= k;
            i = (readBits(k) << i) + readBits(i);
        }
        buffer.position(initialPos + (int)Math.ceil((double)position / 8D));
        return i;
    }

    public int remainingBits()
    {
        return buffer.limit() * 8 - position;
    }
}
