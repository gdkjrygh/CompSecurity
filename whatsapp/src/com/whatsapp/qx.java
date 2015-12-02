// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.ci;
import com.whatsapp.util.Log;

public class qx
    implements Runnable, ci
{

    private static final String z[];
    public String a;

    qx(String s)
    {
        a = s;
    }

    public void a(int i)
    {
        Log.e((new StringBuilder()).append(z[1]).append(i).toString());
    }

    public void run()
    {
        Log.i(z[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\0007U \\\0057X2]\002+C#[\017*_#M\036=E1G\002+S)I\002<Z$ZC+C\"K\t+E";
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
                obj = "\0007U \\\0057X2]\002+C#[\017*_#M\036=E1G\002+S)I\002<Z$ZC=D3G\036x";
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
        char c = obj[j];
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
        byte byte0 = 40;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 108;
          goto _L9
_L5:
        byte0 = 88;
          goto _L9
_L6:
        byte0 = 54;
          goto _L9
        byte0 = 65;
          goto _L9
    }
}
