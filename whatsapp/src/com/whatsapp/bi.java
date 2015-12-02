// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.util.a3;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App, a9v, og, ua, 
//            an

class bi
    implements Runnable
{

    private static final String z[];
    final a9v a;
    final og b;
    final an c;

    bi(an an, og og1, a9v a9v1)
    {
        c = an;
        b = og1;
        a = a9v1;
        super();
    }

    public void run()
    {
        int i;
        int i1;
label0:
        {
            i1 = App.am;
            b.a(a.d, a.c);
            int j = b.u;
            if (a.d != null)
            {
                j = a.b;
                i = j;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            i = j;
            if (j == a.b)
            {
                break label0;
            }
            if (a.b < j)
            {
                Log.e((new StringBuilder()).append(z[2]).append(a.b).append(z[3]).append(j).toString());
                i = j;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            b.c().delete();
            i = 0;
        }
        int k;
label1:
        {
            int l = b.q;
            if (a.c != null)
            {
                l = a.b;
                k = l;
                if (i1 == 0)
                {
                    break label1;
                }
            }
            k = l;
            if (l == a.b)
            {
                break label1;
            }
            if (a.b < l)
            {
                Log.e((new StringBuilder()).append(z[0]).append(a.b).append(z[1]).append(l).toString());
                k = l;
                if (i1 == 0)
                {
                    break label1;
                }
            }
            b.h().delete();
            k = 0;
        }
        b.a(i, k);
        if (a.d != null)
        {
            App.E.b(b.a);
        }
        if (a.c != null)
        {
            App.at.b(b.a);
        }
        if (a.d != null || a.c != null)
        {
            App.au.ab().post(new ua(this));
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "OF;#cKF<fzUL,)UIK-+hbJ<fcSU9*cY\017x";
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
                obj = "\035P0)\177QGx$o\035\035ef";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "OF;#cKF<fzUL,)U[V4*UTGx/dKB4/n\021\003";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\035P0)\177QGx$o\035\035ef";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 61;
          goto _L9
_L5:
        byte0 = 35;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 70;
          goto _L9
    }
}
