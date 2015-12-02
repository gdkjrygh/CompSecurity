// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public class a9v
{

    private static final String z[];
    public String a;
    public int b;
    public byte c[];
    public byte d[];
    public int e;

    public a9v(String s, int i, int j)
    {
        a = s;
        b = i;
        e = j;
    }

    public a9v(String s, byte abyte0[], byte abyte1[], int i)
    {
        a = s;
        d = abyte0;
        c = abyte1;
        b = i;
    }

    public String a()
    {
        if (e == 1)
        {
            return z[0];
        }
        if (e == 2)
        {
            return z[2];
        } else
        {
            return z[1];
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "u\033QO\007";
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
                obj = "u\033QO\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "l\004U^\013y\001";
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
        byte byte0 = 98;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 28;
          goto _L9
_L5:
        byte0 = 118;
          goto _L9
_L6:
        byte0 = 48;
          goto _L9
        byte0 = 40;
          goto _L9
    }
}
