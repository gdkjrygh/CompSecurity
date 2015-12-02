// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.cf;
import com.whatsapp.protocol.cs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            App, aoz, p8, tn

class et
    implements Runnable
{

    private static final String z;
    final tn a;
    final String b;
    final int c;
    final cf d;
    final String e;

    et(tn tn, cf cf1, String s, String s1, int i)
    {
        a = tn;
        d = cf1;
        e = s;
        b = s1;
        c = i;
        super();
    }

    public void run()
    {
        ArrayList arraylist;
        Iterator iterator;
        int i;
        i = App.am;
        arraylist = new ArrayList();
        iterator = d.h.iterator();
_L4:
        cf cf1;
        Vector vector;
        Iterator iterator1;
        long l1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cf1 = (cf)iterator.next();
        Map map = App.ah.b(cf1.f, cf1.k);
        vector = new Vector(map.size());
        iterator1 = map.entrySet().iterator();
        l1 = 0L;
_L5:
        long l;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_414;
        }
        Object obj1 = (java.util.Map.Entry)iterator1.next();
        Object obj = (String)((java.util.Map.Entry) (obj1)).getKey();
        obj1 = (p8)((java.util.Map.Entry) (obj1)).getValue();
        if (((p8) (obj1)).c > cf1.i)
        {
            obj = new cs(((String) (obj)), 4);
            l = ((p8) (obj1)).c;
        } else
        if (((p8) (obj1)).a > cf1.i)
        {
            obj = new cs(((String) (obj)), 3);
            l = ((p8) (obj1)).a;
        } else
        if (((p8) (obj1)).d > cf1.i)
        {
            obj = new cs(((String) (obj)), 2);
            l = ((p8) (obj1)).d;
        } else
        if (((p8) (obj1)).b > cf1.i)
        {
            obj = new cs(((String) (obj)), 1);
            l = ((p8) (obj1)).b;
        } else
        {
            obj = null;
            l = 0L;
        }
        if (obj != null)
        {
            vector.add(obj);
            long l2 = l1;
            if (l > l1)
            {
                l2 = l;
            }
            l = l2;
        } else
        {
            l = l1;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (vector.size() > 0)
        {
            obj = new cf();
            obj.f = cf1.f;
            obj.i = l;
            obj.h = vector;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            arraylist.add(obj);
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        App.d(e, b, z);
        App.a(e, arraylist, c);
        return;
_L2:
        l1 = l;
          goto _L5
        l = l1;
          goto _L1
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Q\n\013".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 88;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 38;
          goto _L8
_L3:
        byte0 = 111;
          goto _L8
_L4:
        byte0 = 105;
          goto _L8
        byte0 = 33;
          goto _L8
    }
}
