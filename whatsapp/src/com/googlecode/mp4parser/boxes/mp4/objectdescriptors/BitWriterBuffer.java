// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitWriterBuffer
{

    static final boolean $assertionsDisabled;
    private ByteBuffer buffer;
    int initialPos;
    int position;

    public BitWriterBuffer(ByteBuffer bytebuffer)
    {
        position = 0;
        buffer = bytebuffer;
        initialPos = bytebuffer.position();
    }

    public void writeBits(int i, int j)
    {
        boolean flag = true;
        if (!$assertionsDisabled && i > (1 << j) - 1)
        {
            throw new AssertionError(String.format("Trying to write a value bigger (%s) than the number bits (%s) allows. Please mask the value before writing it and make your code is really working as intended.", new Object[] {
                Integer.valueOf(i), Integer.valueOf((1 << j) - 1)
            }));
        }
        int j1 = 8 - position % 8;
        ByteBuffer bytebuffer1;
        int l;
        if (j <= j1)
        {
            int i1 = buffer.get(initialPos + position / 8);
            int k = i1;
            if (i1 < 0)
            {
                k = i1 + 256;
            }
            k += i << j1 - j;
            ByteBuffer bytebuffer = buffer;
            i1 = initialPos;
            j1 = position / 8;
            i = k;
            if (k > 127)
            {
                i = k - 256;
            }
            bytebuffer.put(i1 + j1, (byte)i);
            position = position + j;
        } else
        {
            j -= j1;
            writeBits(i >> j, j1);
            writeBits((1 << j) - 1 & i, j);
        }
        bytebuffer1 = buffer;
        j = initialPos;
        l = position / 8;
        if (position % 8 > 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        bytebuffer1.position(i + (j + l));
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
