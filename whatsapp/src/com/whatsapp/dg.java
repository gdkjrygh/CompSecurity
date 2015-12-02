// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.cf;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            App, k, og, mk, 
//            k4, as_, tn

class dg
    implements Runnable
{

    private static final String z[];
    final int a;
    final cf b;
    final String c;
    final tn d;
    final String e;

    dg(tn tn, cf cf1, String s, int i, String s1)
    {
        d = tn;
        b = cf1;
        c = s;
        a = i;
        e = s1;
        super();
    }

    public void run()
    {
        int i = App.am;
        cf cf1 = new cf();
        Object obj = App.az.f(b.f);
        if (obj != null)
        {
            boolean flag;
            try
            {
                flag = ((og) (obj)).k();
            }
            catch (NumberFormatException numberformatexception)
            {
                throw numberformatexception;
            }
            if (flag)
            {
                cf1.f = ((og) (obj)).x();
                as_ as_1;
                cf cf2;
                try
                {
                    cf1.i = Long.parseLong(((og) (obj)).M);
                }
                catch (NumberFormatException numberformatexception1)
                {
                    Log.e((new StringBuilder()).append(z[0]).append(((og) (obj)).M).append(" ").append(numberformatexception1).toString());
                }
            }
        }
        obj = mk.a(((og) (obj)).a).i();
        cf1.h = new Vector(((Collection) (obj)).size());
        obj = ((Collection) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            as_1 = (as_)((Iterator) (obj)).next();
            cf2 = new cf();
            cf2.f = as_1.b;
            cf2.l = as_1.d;
            cf1.h.add(cf2);
        } while (i == 0);
        App.a(c, cf1, a);
        App.d(c, e, z[1]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "(o:;\r$o:;\007,|<;\002,}\025e\000,m3;\022;p?dU";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = ">z(";
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
        byte byte0 = 117;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 73;
          goto _L9
_L5:
        byte0 = 31;
          goto _L9
_L6:
        byte0 = 74;
          goto _L9
        byte0 = 20;
          goto _L9
    }
}
