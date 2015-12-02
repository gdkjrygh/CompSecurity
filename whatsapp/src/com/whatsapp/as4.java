// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Arrays;

// Referenced classes of package com.whatsapp:
//            u

public class as4
{

    private static final String z[];
    public byte a[];
    public byte b[];
    public u c;

    public as4(byte abyte0[], String s, byte abyte1[], byte abyte2[], byte abyte3[], byte abyte4[], byte abyte5[])
    {
        c = new u(abyte0, s, abyte1, abyte2, abyte4);
        b = abyte3;
        a = abyte5;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(c.toString()).append(z[1]).append(Arrays.toString(b)).append(z[2]).append(Arrays.toString(a)).append("]").toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "0Uk]1\002\177mOd)";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "^\024`W7\032Qlq+\035SdS\r\026\t";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "^\024k_4\032Qz}!\013\t";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 68;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 114;
          goto _L9
_L5:
        byte0 = 52;
          goto _L9
_L6:
        byte0 = 8;
          goto _L9
        byte0 = 54;
          goto _L9
    }
}
