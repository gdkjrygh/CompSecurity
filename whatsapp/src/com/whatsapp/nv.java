// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp:
//            ov, p8

public class nv
{

    public ConcurrentHashMap a;

    public nv()
    {
        a = new ConcurrentHashMap();
    }

    public int a(int i)
    {
        Iterator iterator;
        int j;
        int k;
        int l;
        boolean flag;
        flag = ov.e;
        iterator = a.values().iterator();
        j = 0;
        k = 0;
        l = 0;
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int k1;
        i1 = j;
        k1 = j;
        j1 = k;
        ((p8)iterator.next()).a();
        JVM INSTR lookupswitch 3: default 92
    //                   5: 120
    //                   8: 105
    //                   13: 110;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!flag) goto _L7; else goto _L2
_L5:
        i1 = j + 1;
_L6:
        j1 = k + 1;
        k1 = i1;
_L4:
        j = k1;
        k = j1;
        l++;
          goto _L3
          goto _L7
_L2:
        if (j >= i)
        {
            return 8;
        }
        if (k >= i)
        {
            return 13;
        }
        return l < i ? 4 : 5;
    }

    public void a(String s, int i, long l)
    {
        p8 p8_1;
        boolean flag;
        flag = ov.e;
        p8 p8_2 = (p8)a.get(s);
        p8_1 = p8_2;
        if (p8_2 == null)
        {
            p8_1 = new p8();
            a.put(s, p8_1);
        }
        i;
        JVM INSTR lookupswitch 3: default 84
    //                   5: 107
    //                   8: 85
    //                   13: 96;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        p8_1.c = l;
        if (!flag) goto _L1; else goto _L4
_L4:
        p8_1.a = l;
        if (!flag) goto _L1; else goto _L2
_L2:
        p8_1.d = l;
        return;
    }
}
