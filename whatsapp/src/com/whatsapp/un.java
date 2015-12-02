// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            e, App, aoz, au8, 
//            ex

public class un
{

    private static final HashMap d = new HashMap();
    public a a;
    public String b[];
    public String c;

    public un()
    {
    }

    public static void a(a a1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        e e1 = (e)d.get(a1.a);
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        e1.b.remove(a1.c);
        if (e1.b.isEmpty())
        {
            App.ah.a(a1.a, e1.a);
            d.remove(a1.a);
        }
        hashmap;
        JVM INSTR monitorexit ;
        return;
        a1;
        hashmap;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public static void a(c4 c4_1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new au8(c4_1, App.ah.h(c4_1)));
        a(((Collection) (arraylist)));
    }

    public static void a(Collection collection)
    {
        Object obj;
        int j;
        j = App.am;
        obj = new HashMap();
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            au8 au8_1 = (au8)iterator.next();
            collection = au8_1.b;
            ex ex1 = new ex(((c4) (collection)).y.a, ((c4) (collection)).G);
            ArrayList arraylist = (ArrayList)((HashMap) (obj)).get(ex1);
            collection = arraylist;
            if (arraylist == null)
            {
                collection = new ArrayList();
                ((HashMap) (obj)).put(ex1, collection);
            }
            collection.add(au8_1);
        } while (j == 0);
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        obj = ((HashMap) (obj)).values().iterator();
_L5:
        un un1;
        c4 c4_1;
        long l1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        collection = (ArrayList)((Iterator) (obj)).next();
        un1 = new un();
        c4_1 = ((au8)collection.get(0)).b;
        un1.a = c4_1.y;
        un1.c = c4_1.G;
        l1 = ((au8)collection.get(0)).a;
        long l = l1;
        if (collection.size() <= 1) goto _L2; else goto _L1
_L1:
        un1.b = new String[collection.size() - 1];
        int i = 1;
_L6:
        l = l1;
        if (i >= collection.size()) goto _L2; else goto _L3
_L3:
        un1.b[i - 1] = ((au8)collection.get(i)).b.y.c;
        l = Math.max(l1, ((au8)collection.get(i)).a);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_391;
        }
_L2:
        e e1 = (e)d.get(c4_1.y.a);
        collection = e1;
        if (e1 != null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        collection = new e();
        d.put(c4_1.y.a, collection);
        ((e) (collection)).b.put(c4_1.y.c, un1);
        collection.a = Math.max(((e) (collection)).a, l);
        com.whatsapp.App.a(un1);
        if (j == 0) goto _L5; else goto _L4
_L4:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        collection;
        hashmap;
        JVM INSTR monitorexit ;
        throw collection;
        i++;
        l1 = l;
          goto _L6
    }

}
