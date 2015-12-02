// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;

final class a1
{

    private static final String z[];
    private boolean a;
    private final int b;
    private final String c;

    public a1(int i, String s)
    {
        this(i, s, false);
    }

    public a1(int i, String s, boolean flag)
    {
        b = i;
        c = s;
        Log.b(i, (new StringBuilder()).append(s).append(z[1]).append(flag).toString());
        a = flag;
    }

    public void a(boolean flag)
    {
        Log.b(b, (new StringBuilder()).append(c).append(" ").append(a).append(z[0]).append(flag).toString());
        a = flag;
    }

    public boolean a()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "y\024pmJ>\0228xKy";
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
                obj = "y\036veP0\026te^<Wlc\004";
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
        byte byte0 = 36;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 89;
          goto _L9
_L5:
        byte0 = 119;
          goto _L9
_L6:
        byte0 = 24;
          goto _L9
        byte0 = 12;
          goto _L9
    }
}
