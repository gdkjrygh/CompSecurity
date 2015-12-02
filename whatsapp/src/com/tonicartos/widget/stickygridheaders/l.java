// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            d, c, g, k, 
//            StickyGridHeadersGridView

public class l extends BaseAdapter
    implements d
{

    private List a;
    private g b;

    public l(g g1)
    {
        b = g1;
        g1.registerDataSetObserver(new c(this, null));
        a = a(g1);
    }

    static g a(l l1)
    {
        return l1.b;
    }

    static List a(l l1, List list)
    {
        l1.a = list;
        return list;
    }

    public int a()
    {
        return a.size();
    }

    public int a(int i)
    {
        return ((k)a.get(i)).a();
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        return b.a(((k)a.get(i)).c(), view, viewgroup);
    }

    protected List a(g g1)
    {
        int j = StickyGridHeadersGridView.s;
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
label0:
            {
                if (i < g1.getCount())
                {
                    long l1 = g1.a(i);
                    k k2 = (k)hashmap.get(Long.valueOf(l1));
                    k k1 = k2;
                    if (k2 == null)
                    {
                        k1 = new k(this, i);
                        arraylist.add(k1);
                    }
                    k1.b();
                    hashmap.put(Long.valueOf(l1), k1);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            i++;
        } while (true);
    }

    public int getCount()
    {
        return b.getCount();
    }

    public Object getItem(int i)
    {
        return b.getItem(i);
    }

    public long getItemId(int i)
    {
        return b.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return b.getView(i, view, viewgroup);
    }
}
