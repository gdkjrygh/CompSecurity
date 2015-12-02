// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.InputStream;

public class cw
{

    public static int a(InputStream inputstream)
    {
        return (inputstream.read() << 16) + (inputstream.read() << 8) + inputstream.read();
    }

    public static void a(byte abyte0[], int i, int j, int k)
    {
        j = 0xfffff & k | j << 20;
        abyte0[i] = (byte)((0xff0000 & j) >> 16);
        abyte0[i + 1] = (byte)((0xff00 & j) >> 8);
        abyte0[i + 2] = (byte)((j & 0xff) >> 0);
    }

    public static boolean a(int i)
    {
        return (0x400000 & i) > 0;
    }

    public static int b(int i)
    {
        return 0xfffff & i;
    }

    public static boolean c(int i)
    {
        return (0x100000 & i) > 0;
    }

    public static boolean d(int i)
    {
        return (0x800000 & i) > 0;
    }
}
