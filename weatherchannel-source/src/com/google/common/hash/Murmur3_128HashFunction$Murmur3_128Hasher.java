// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.common.hash:
//            Murmur3_128HashFunction, HashCode

private static final class length extends amingHasher
{

    private static final long C1 = 0x87c37b91114253d5L;
    private static final long C2 = 0x4cf5ad432745937fL;
    private static final int CHUNK_SIZE = 16;
    private long h1;
    private long h2;
    private int length;

    private void bmix64(long l, long l1)
    {
        h1 = h1 ^ mixK1(l);
        h1 = Long.rotateLeft(h1, 27);
        h1 = h1 + h2;
        h1 = h1 * 5L + 0x52dce729L;
        h2 = h2 ^ mixK2(l1);
        h2 = Long.rotateLeft(h2, 31);
        h2 = h2 + h1;
        h2 = h2 * 5L + 0x38495ab5L;
    }

    private static long fmix64(long l)
    {
        l = (l ^ l >>> 33) * 0xff51afd7ed558ccdL;
        l = (l ^ l >>> 33) * 0xc4ceb9fe1a85ec53L;
        return l ^ l >>> 33;
    }

    private static long mixK1(long l)
    {
        return Long.rotateLeft(l * 0x87c37b91114253d5L, 31) * 0x4cf5ad432745937fL;
    }

    private static long mixK2(long l)
    {
        return Long.rotateLeft(l * 0x4cf5ad432745937fL, 33) * 0x87c37b91114253d5L;
    }

    public HashCode makeHash()
    {
        h1 = h1 ^ (long)length;
        h2 = h2 ^ (long)length;
        h1 = h1 + h2;
        h2 = h2 + h1;
        h1 = fmix64(h1);
        h2 = fmix64(h2);
        h1 = h1 + h2;
        h2 = h2 + h1;
        return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(h1).putLong(h2).array());
    }

    protected void process(ByteBuffer bytebuffer)
    {
        bmix64(bytebuffer.getLong(), bytebuffer.getLong());
        length = length + 16;
    }

    protected void processRemaining(ByteBuffer bytebuffer)
    {
        long l;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        long l13;
        l1 = 0L;
        l = 0L;
        length = length + bytebuffer.remaining();
        l3 = l;
        l4 = l;
        l5 = l;
        l6 = l;
        l7 = l;
        l8 = l;
        l2 = l;
        l9 = l1;
        l10 = l1;
        l11 = l1;
        l12 = l1;
        l13 = l1;
        bytebuffer.remaining();
        JVM INSTR tableswitch 1 15: default 136
    //                   1 409
    //                   2 392
    //                   3 375
    //                   4 358
    //                   5 341
    //                   6 324
    //                   7 307
    //                   8 268
    //                   9 253
    //                   10 235
    //                   11 217
    //                   12 199
    //                   13 181
    //                   14 163
    //                   15 146;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        throw new AssertionError("Should never get here.");
_L16:
        l3 = 0L ^ (long)UnsignedBytes.toInt(bytebuffer.get(14)) << 48;
_L15:
        l4 = l3 ^ (long)UnsignedBytes.toInt(bytebuffer.get(13)) << 40;
_L14:
        l5 = l4 ^ (long)UnsignedBytes.toInt(bytebuffer.get(12)) << 32;
_L13:
        l6 = l5 ^ (long)UnsignedBytes.toInt(bytebuffer.get(11)) << 24;
_L12:
        l7 = l6 ^ (long)UnsignedBytes.toInt(bytebuffer.get(10)) << 16;
_L11:
        l8 = l7 ^ (long)UnsignedBytes.toInt(bytebuffer.get(9)) << 8;
_L10:
        l2 = l8 ^ (long)UnsignedBytes.toInt(bytebuffer.get(8));
_L9:
        l1 = 0L ^ bytebuffer.getLong();
        l = l2;
_L18:
        h1 = h1 ^ mixK1(l1);
        h2 = h2 ^ mixK2(l);
        return;
_L8:
        l9 = 0L ^ (long)UnsignedBytes.toInt(bytebuffer.get(6)) << 48;
_L7:
        l10 = l9 ^ (long)UnsignedBytes.toInt(bytebuffer.get(5)) << 40;
_L6:
        l11 = l10 ^ (long)UnsignedBytes.toInt(bytebuffer.get(4)) << 32;
_L5:
        l12 = l11 ^ (long)UnsignedBytes.toInt(bytebuffer.get(3)) << 24;
_L4:
        l13 = l12 ^ (long)UnsignedBytes.toInt(bytebuffer.get(2)) << 16;
_L3:
        l1 = l13 ^ (long)UnsignedBytes.toInt(bytebuffer.get(1)) << 8;
_L2:
        l1 ^= UnsignedBytes.toInt(bytebuffer.get(0));
        if (true) goto _L18; else goto _L17
_L17:
    }

    amingHasher(int i)
    {
        super(16);
        h1 = i;
        h2 = i;
        length = 0;
    }
}
