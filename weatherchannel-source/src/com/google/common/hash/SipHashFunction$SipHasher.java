// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.common.hash:
//            SipHashFunction, HashCode

private static final class v3 extends ion.AbstractStreamingHasher
{

    private static final int CHUNK_SIZE = 8;
    private long b;
    private final int c;
    private final int d;
    private long finalM;
    private long v0;
    private long v1;
    private long v2;
    private long v3;

    private void processM(long l)
    {
        v3 = v3 ^ l;
        sipRound(c);
        v0 = v0 ^ l;
    }

    private void sipRound(int i)
    {
        for (int j = 0; j < i; j++)
        {
            v0 = v0 + v1;
            v2 = v2 + v3;
            v1 = Long.rotateLeft(v1, 13);
            v3 = Long.rotateLeft(v3, 16);
            v1 = v1 ^ v0;
            v3 = v3 ^ v2;
            v0 = Long.rotateLeft(v0, 32);
            v2 = v2 + v1;
            v0 = v0 + v3;
            v1 = Long.rotateLeft(v1, 17);
            v3 = Long.rotateLeft(v3, 21);
            v1 = v1 ^ v2;
            v3 = v3 ^ v0;
            v2 = Long.rotateLeft(v2, 32);
        }

    }

    public HashCode makeHash()
    {
        finalM = finalM ^ b << 56;
        processM(finalM);
        v2 = v2 ^ 255L;
        sipRound(d);
        return HashCode.fromLong(v0 ^ v1 ^ v2 ^ v3);
    }

    protected void process(ByteBuffer bytebuffer)
    {
        b = b + 8L;
        processM(bytebuffer.getLong());
    }

    protected void processRemaining(ByteBuffer bytebuffer)
    {
        b = b + (long)bytebuffer.remaining();
        for (int i = 0; bytebuffer.hasRemaining(); i += 8)
        {
            finalM = finalM ^ ((long)bytebuffer.get() & 255L) << i;
        }

    }

    ion.AbstractStreamingHasher(int i, int j, long l, long l1)
    {
        super(8);
        v0 = 0x736f6d6570736575L;
        v1 = 0x646f72616e646f6dL;
        v2 = 0x6c7967656e657261L;
        v3 = 0x7465646279746573L;
        b = 0L;
        finalM = 0L;
        c = i;
        d = j;
        v0 = v0 ^ l;
        v1 = v1 ^ l1;
        v2 = v2 ^ l;
        v3 = v3 ^ l1;
    }
}
