// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Arrays;

public class u
{

    private static final String z[];
    public byte a[];
    public byte b[];
    public String c;
    public byte d[];
    public byte e[];

    public u(byte abyte0[], String s, byte abyte1[], byte abyte2[], byte abyte3[])
    {
        b = abyte0;
        c = s;
        e = abyte1;
        a = abyte2;
        d = abyte3;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[3]).append(Arrays.toString(b)).append(z[4]).append(c).append(z[1]).append(Arrays.toString(e)).append(z[0]).append(Arrays.toString(a)).append(z[2]).append(Arrays.toString(d)).append("]").toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\031\0204{FR\\6]MfQ?`\024";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\031\020 q[CU!GHYDn";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\031\0206zJGI#`@Z^\032b\024";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "wQ0\177\\Es:dAPBsOJ\\@;q[cU!g@Z^n";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\025[6m\177PB }F[\r";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 41;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 53;
          goto _L9
_L5:
        byte1 = 48;
          goto _L9
_L6:
        byte1 = 83;
          goto _L9
        byte1 = 20;
          goto _L9
    }
}
