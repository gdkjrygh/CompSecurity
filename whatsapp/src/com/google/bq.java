// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class bq extends RuntimeException
{

    private static final long serialVersionUID = 0x4be86cb6ba5b1c4aL;
    private static final String z;

    public bq()
    {
        super(z);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "4Qu&T2I\177\026\025\fU~4\027\013\031k4\007@Xp'\021\001]eu\027\001Up0\020@Xr1T\003Xr;\033\024\031~0T\003Xp9\021\004\031q \030\024Pl9\021@Mu8\021\023\027".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 116;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 96;
          goto _L8
_L3:
        byte0 = 57;
          goto _L8
_L4:
        byte0 = 28;
          goto _L8
        byte0 = 85;
          goto _L8
    }
}
