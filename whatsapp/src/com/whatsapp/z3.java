// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            hf, dx, App, og, 
//            as6

class z3
    implements Runnable
{

    private static final String z[];
    final hf a;
    final ArrayList b;

    z3(hf hf1, ArrayList arraylist)
    {
        a = hf1;
        b = arraylist;
        super();
    }

    public void run()
    {
label0:
        {
            a.b.c();
            if (b != null)
            {
                String s = (new StringBuilder()).append(App.au.getString(0x7f0e0149, new Object[] {
                    a.a.a(a.c)
                }).replaceAll(z[2], "")).append(z[4]).toString();
                as6.a((new Intent(z[0])).setType(z[5]).putExtra(z[6], App.au.getString(0x7f0e0149, new Object[] {
                    a.a.a(a.c)
                })).putExtra(z[3], App.au.getString(0x7f0e0147, new Object[] {
                    s
                })).putParcelableArrayListExtra(z[1], b), a.c, a.b, a.c.getString(0x7f0e0375));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.b.a(0x7f0e0148);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "r%LGNz/\006\\Og.FA\017r(\\\\N}e{poW\024e`mG\002xyd";
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
                obj = "r%LGNz/\006\\Og.FA\017v3\\G@=\030|gdR\006";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Ht\022i\0169i\024\013]N";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "r%LGNz/\006\\Og.FA\017v3\\G@=\037mmu";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "=?PA";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "g.PA\0169";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "r%LGNz/\006\\Og.FA\017v3\\G@=\030}wkV\b|";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 33;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 19;
          goto _L9
_L5:
        byte1 = 75;
          goto _L9
_L6:
        byte1 = 40;
          goto _L9
        byte1 = 53;
          goto _L9
    }
}
