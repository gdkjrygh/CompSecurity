// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.bs;
import com.whatsapp.protocol.ci;
import com.whatsapp.util.Log;
import java.io.EOFException;
import java.net.SocketException;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            my, k6, App

public class vp
    implements ci, bs
{

    private static final String z[];
    k6 a;

    public vp(k6 k6_1)
    {
        k6_1.a(my.g);
        a = k6_1;
    }

    public void a(int i)
    {
label0:
        {
            int j = App.am;
            if (i >= 500)
            {
                if (a.b())
                {
                    Log.e((new StringBuilder()).append(z[3]).append(a.toString()).toString());
                    my.c.add(a);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                Log.e((new StringBuilder()).append(z[0]).append(a.toString()).toString());
                if (j == 0)
                {
                    break label0;
                }
            }
            if (i >= 400)
            {
                my.i();
                if (j == 0)
                {
                    break label0;
                }
            }
            Log.e((new StringBuilder()).append(z[1]).append(i).append(z[2]).append(a.toString()).toString());
        }
    }

    public void a(Exception exception)
    {
        Log.a((new StringBuilder()).append(z[4]).append(a.toString()).toString(), exception);
        if (((exception instanceof SocketException) || (exception instanceof EOFException)) && a.b())
        {
            Log.e(z[5]);
            my.c.add(a);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "bkKniavf+.#)4dk3pz}z\177pp+\177avd{r}~.+";
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
                obj = "fwqskvz`n\1773kq\177naw4htw|.+";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "3vd1;";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "bkKniavf+.#)4znvlqbut#4";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "bkKncp|d\177r|w.+";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "bkKncp|d\177r|w4znvlqbut";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 27;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 19;
          goto _L9
_L5:
        byte1 = 25;
          goto _L9
_L6:
        byte1 = 20;
          goto _L9
        byte1 = 11;
          goto _L9
    }
}
