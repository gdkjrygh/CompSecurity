// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;


final class Protocol
{

    static final int B0_FLAG_FIN = 128;
    static final int B0_FLAG_RSV1 = 64;
    static final int B0_FLAG_RSV2 = 32;
    static final int B0_FLAG_RSV3 = 16;
    static final int B0_MASK_OPCODE = 15;
    static final int B1_FLAG_MASK = 128;
    static final int B1_MASK_LENGTH = 127;
    static final int OPCODE_BINARY = 2;
    static final int OPCODE_CONTINUATION = 0;
    static final int OPCODE_CONTROL_CLOSE = 8;
    static final int OPCODE_CONTROL_PING = 9;
    static final int OPCODE_CONTROL_PONG = 10;
    static final int OPCODE_FLAG_CONTROL = 8;
    static final int OPCODE_TEXT = 1;
    static final int PAYLOAD_LONG = 127;
    static final int PAYLOAD_MAX = 125;
    static final int PAYLOAD_SHORT = 126;

    private Protocol()
    {
        throw new AssertionError("No instances.");
    }

    static void toggleMask(byte abyte0[], long l, byte abyte1[], long l1)
    {
        int j = abyte1.length;
        for (int i = 0; (long)i < l;)
        {
            int k = (int)(l1 % (long)j);
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[k]);
            i++;
            l1++;
        }

    }
}
