// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import java.io.OutputStream;

class e
{

    static byte a(short word0)
    {
        return (byte)(word0 & 0xff);
    }

    static int a(byte byte0, byte byte1, byte byte2, byte byte3)
    {
        return byte0 << 24 & 0xff000000 | byte1 << 16 & 0xff0000 | byte2 << 8 & 0xff00 | byte3 & 0xff;
    }

    static short a(byte byte0, byte byte1)
    {
        return (short)(byte0 << 8 & 0xff00 | byte1 & 0xff);
    }

    static short a(byte abyte0[], int i)
    {
        return a(abyte0[i], abyte0[i + 1]);
    }

    static void a(OutputStream outputstream, int i)
    {
        outputstream.write(i >>> 24 & 0xff);
        outputstream.write(i >>> 16 & 0xff);
        outputstream.write(i >>> 8 & 0xff);
        outputstream.write(i & 0xff);
    }

    static void a(OutputStream outputstream, short word0)
    {
        outputstream.write(b(word0));
        outputstream.write(a(word0));
    }

    static void a(short word0, byte abyte0[], int i)
    {
        abyte0[i] = b(word0);
        abyte0[i + 1] = a(word0);
    }

    static byte b(short word0)
    {
        return (byte)((0xff00 & word0) >>> 8);
    }

    static int b(byte abyte0[], int i)
    {
        return a(abyte0[i], abyte0[i + 1], abyte0[i + 2], abyte0[i + 3]);
    }
}
