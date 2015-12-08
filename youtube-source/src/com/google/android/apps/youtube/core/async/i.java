// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af

public final class i
    implements b, af
{

    private final af a;
    private final Map b = new HashMap();

    public i(af af1)
    {
        a = (af)c.a(af1);
    }

    public final void a(Object obj, b b1)
    {
        c.a(obj);
        c.a(b1);
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        if (!b.containsKey(obj))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        ((List)b.get(obj)).add(b1);
_L2:
        return;
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(b1);
        b.put(obj, arraylist);
        a.a(obj, this);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public final void a(Object obj, Exception exception)
    {
        List list;
        int j;
        synchronized (b)
        {
            list = (List)b.remove(obj);
        }
        for (j = 0; j < list.size(); j++)
        {
            ((b)list.get(j)).a(obj, exception);
        }

    }

    public final void a(Object obj, Object obj1)
    {
        List list;
        int j;
        synchronized (b)
        {
            list = (List)b.remove(obj);
        }
        for (j = 0; j < list.size(); j++)
        {
            ((b)list.get(j)).a(obj, obj1);
        }

    }
}
