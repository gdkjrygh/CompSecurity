// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewVisitor

private static class <init>
{

    private boolean detectSubgraphCycle(TreeMap treemap, View view, List list)
    {
        if (list.contains(view))
        {
            return false;
        }
        if (!treemap.containsKey(view)) goto _L2; else goto _L1
_L1:
        List list1;
        int i;
        int j;
        list1 = (List)treemap.remove(view);
        list.add(view);
        j = list1.size();
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L3
_L3:
        list.remove(view);
_L2:
        return true;
_L4:
        if (!detectSubgraphCycle(treemap, (View)list1.get(i), list))
        {
            return false;
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean hasCycle(TreeMap treemap)
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            if (treemap.isEmpty())
            {
                return true;
            }
        } while (detectSubgraphCycle(treemap, (View)treemap.firstKey(), arraylist));
        return false;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
