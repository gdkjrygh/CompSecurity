// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.util.ArrayMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class cyt
    implements doc
{

    private final List a;
    private final doc b;

    public cyt(doc doc1, List list)
    {
        b = doc1;
        a = list;
    }

    public final void a(Map map, boolean flag)
    {
        if (a.isEmpty())
        {
            b.a(map, flag);
            return;
        }
        ArrayMap arraymap = new ArrayMap(map.size() + a.size());
        arraymap.putAll(map);
        for (map = a.iterator(); map.hasNext(); arraymap.put((String)map.next(), Boolean.valueOf(true))) { }
        b.a(arraymap, flag);
    }
}
