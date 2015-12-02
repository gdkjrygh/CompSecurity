// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.notification.p;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, u5, aoz, og, 
//            mk

final class wp
    implements Runnable
{

    final ConditionVariable a;
    final HashMap b;
    final String c;
    final ConditionVariable d;
    final boolean e;

    wp(HashMap hashmap, String s, boolean flag, ConditionVariable conditionvariable, ConditionVariable conditionvariable1)
    {
        b = hashmap;
        c = s;
        e = flag;
        d = conditionvariable;
        a = conditionvariable1;
        super();
    }

    public void run()
    {
        Object obj1;
        ArrayList arraylist;
        int i;
        long l1;
        i = App.am;
        obj1 = new ArrayList();
        l1 = System.currentTimeMillis();
        arraylist = new ArrayList();
        Iterator iterator = b.entrySet().iterator();
_L6:
        String s1;
        c4 c4_1;
        cf cf1;
        og og1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        s1 = (String)entry.getKey();
        c4_1 = (c4)entry.getValue();
        cf1 = new cf();
        og1 = u5.d(s1);
        cf1.i = App.ah.r(s1);
        cf1.o = App.ah.B(s1);
        cf1.f = s1;
        if (!og1.k()) goto _L2; else goto _L1
_L1:
        long l = p.c(App.au, s1);
_L7:
        cf1.a = l;
        cf1.j = og1.c;
        cf1.l = App.ah.y(s1);
        if (!TextUtils.isEmpty(og1.n)) goto _L4; else goto _L3
_L3:
        Object obj = null;
_L8:
        cf1.d = ((String) (obj));
        if (!og1.k())
        {
            break MISSING_BLOCK_LABEL_225;
        }
        boolean flag;
        if (!mk.c(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cf1.q = flag;
        ((List) (obj1)).add(cf1);
        if (c4_1 == null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        if (og.g(s1) && c4_1.M == 6)
        {
            App.c(s1, true);
        }
        if (l1 - 0x5265c00L >= cf1.i || c4_1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(Pair.create(c4_1.y, Integer.valueOf(cf1.j + 20)));
        if (i == 0) goto _L6; else goto _L5
_L5:
        obj = c;
        byte byte0;
        if (e)
        {
            byte0 = 7;
        } else
        {
            byte0 = 0;
        }
        com.whatsapp.App.a(((String) (obj)), ((List) (obj1)), byte0, e);
        d.open();
        obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (Pair)((Iterator) (obj)).next();
            com.whatsapp.App.a(1, App.ah.a((a)((Pair) (obj1)).first, ((Integer)((Pair) (obj1)).second).intValue()), false, e, null, a);
        } while (i == 0);
        return;
_L2:
        l = 0L;
          goto _L7
_L4:
        obj = og1.n;
          goto _L8
        Exception exception;
        exception;
        String s = c;
        byte byte1;
        if (e)
        {
            byte1 = 7;
        } else
        {
            byte1 = 0;
        }
        com.whatsapp.App.a(s, ((List) (obj1)), byte1, e);
        d.open();
        throw exception;
          goto _L7
    }
}
