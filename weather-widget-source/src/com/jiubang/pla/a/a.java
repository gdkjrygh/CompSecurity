// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.a;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.List;

// Referenced classes of package com.jiubang.pla.a:
//            c

public abstract class a extends BaseAdapter
{

    protected List a;
    protected LayoutInflater b;
    protected c c;

    public a(LayoutInflater layoutinflater, c c1)
    {
        b = layoutinflater;
        c = c1;
    }

    public void a()
    {
        if (a != null)
        {
            a.clear();
        }
    }

    public void a(List list)
    {
        a = list;
    }

    public int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public Object getItem(int i)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }
}
