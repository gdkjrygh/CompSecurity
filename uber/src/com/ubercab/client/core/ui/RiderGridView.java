// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import dsr;
import dss;
import dst;
import java.util.ArrayList;

public class RiderGridView extends GridView
{

    private ArrayList a;
    private ArrayList b;

    public RiderGridView(Context context)
    {
        super(context);
        a = new ArrayList();
        b = new ArrayList();
        b();
    }

    public RiderGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = new ArrayList();
        b();
    }

    public RiderGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
        b = new ArrayList();
        b();
    }

    private static void a(View view, ArrayList arraylist)
    {
        int j = arraylist.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (((dsr)arraylist.get(i)).a != view)
                    {
                        break label0;
                    }
                    arraylist.remove(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    private void b()
    {
        super.setClipChildren(false);
    }

    public final int a()
    {
        return b.size();
    }

    public final void a(View view)
    {
        a(view, true);
    }

    public final void a(View view, boolean flag)
    {
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && !(listadapter instanceof dst))
        {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        dsr dsr1 = new dsr((byte)0);
        dss dss1 = new dss(this, getContext());
        dss1.addView(view);
        dsr1.a = view;
        dsr1.b = dss1;
        dsr1.c = null;
        dsr1.d = flag;
        a.add(dsr1);
        if (listadapter != null)
        {
            ((dst)listadapter).a();
        }
    }

    public final void b(View view)
    {
        b(view, true);
    }

    public final void b(View view, boolean flag)
    {
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && !(listadapter instanceof dst))
        {
            throw new IllegalStateException("Cannot add footer view to grid -- setAdapter has already been called.");
        }
        dsr dsr1 = new dsr((byte)0);
        dss dss1 = new dss(this, getContext());
        dss1.addView(view);
        dsr1.a = view;
        dsr1.b = dss1;
        dsr1.c = null;
        dsr1.d = flag;
        b.add(dsr1);
        if (listadapter != null)
        {
            ((dst)listadapter).a();
        }
    }

    public final boolean c(View view)
    {
        if (a.size() > 0)
        {
            ListAdapter listadapter = getAdapter();
            boolean flag;
            if (listadapter != null && ((dst)listadapter).a(view))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(view, a);
            return flag;
        } else
        {
            return false;
        }
    }

    public final boolean d(View view)
    {
        if (b.size() > 0)
        {
            ListAdapter listadapter = getAdapter();
            boolean flag;
            if (listadapter != null && ((dst)listadapter).b(view))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(view, b);
            return flag;
        } else
        {
            return false;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && (listadapter instanceof dst))
        {
            ((dst)listadapter).a(getNumColumns());
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (a.size() > 0 || b.size() > 0)
        {
            listadapter = new dst(a, b, listadapter);
            int i = getNumColumns();
            if (i > 1)
            {
                listadapter.a(i);
            }
            super.setAdapter(listadapter);
            return;
        } else
        {
            super.setAdapter(listadapter);
            return;
        }
    }

    public void setClipChildren(boolean flag)
    {
    }
}
