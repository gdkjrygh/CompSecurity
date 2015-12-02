// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dup
{

    private final Map a = new HashMap();
    private final LinkedHashMap b = new LinkedHashMap();

    public dup(List list)
    {
        Pair pair;
        for (list = list.iterator(); list.hasNext(); b.put(pair.first, pair.second))
        {
            pair = (Pair)list.next();
        }

    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            hrs hrs1 = (hrs)a.get(entry.getKey());
            ((hse)entry.getValue()).a(hrs1);
            if (hrs1 != null)
            {
                arraylist.add(new hrr(entry.getValue(), hrs1));
                if (!flag && (entry.getValue() instanceof View) && ((View)entry.getValue()).isFocusable())
                {
                    ((View)entry.getValue()).requestFocus();
                    flag = true;
                }
            }
        } while (true);
        return arraylist;
    }

    public final void a(Map map)
    {
        a.clear();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)map.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj != null && s != null)
            {
                a.put(s, new hrs(obj.toString()));
            }
        } while (true);
    }
}
