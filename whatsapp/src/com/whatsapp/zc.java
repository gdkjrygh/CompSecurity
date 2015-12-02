// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;

class zc
{

    private static final String z[];
    int a;
    int b;
    int c;

    zc()
    {
    }

    public static zc a(String s)
    {
        zc zc1;
        try
        {
            String as[] = s.split(z[1]);
            zc1 = new zc();
            zc1.b = Integer.parseInt(as[0]);
            zc1.c = Integer.parseInt(as[1]);
            zc1.a = Integer.parseInt(as[2]);
        }
        catch (Exception exception)
        {
            Log.e((new StringBuilder()).append(z[0]).append(s).append("]").toString());
            return null;
        }
        return zc1;
    }

    public int a(zc zc1)
    {
        if (b >= zc1.b)
        {
            if (b > zc1.b)
            {
                return 1;
            }
            if (c >= zc1.c)
            {
                if (c > zc1.c)
                {
                    return 1;
                }
                if (a >= zc1.a)
                {
                    return a <= zc1.a ? 0 : 1;
                }
            }
        }
        return -1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(".").append(c).append(".").append(a).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "E \004,Q\\+Y/YA6\023\177c";
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
                i = 1;
                obj = "ok";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 56;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 51;
          goto _L9
_L5:
        byte0 = 69;
          goto _L9
_L6:
        byte0 = 118;
          goto _L9
        byte0 = 95;
          goto _L9
    }
}
