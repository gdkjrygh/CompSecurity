// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.listview;

import android.view.View;

// Referenced classes of package com.jiubang.pla.listview:
//            MultiColumnListView

class b
{

    final MultiColumnListView a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public b(MultiColumnListView multicolumnlistview, int i)
    {
        a = multicolumnlistview;
        super();
        e = 0;
        f = 0;
        b = i;
    }

    static int a(b b1, int i)
    {
        b1.c = i;
        return i;
    }

    static int b(b b1, int i)
    {
        b1.d = i;
        return i;
    }

    public int a()
    {
        return d;
    }

    public void a(int i)
    {
        if (i != 0)
        {
            int k = a.getChildCount();
            int j = 0;
            while (j < k) 
            {
                View view = a.getChildAt(j);
                if (view.getLeft() == d || a.d(view))
                {
                    view.offsetTopAndBottom(i);
                }
                j++;
            }
        }
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return b;
    }

    public int d()
    {
        int l = a.getChildCount();
        int j = 0;
        int i = 0x80000000;
        while (j < l) 
        {
            View view = a.getChildAt(j);
            int k;
            if (view.getLeft() != d && !a.d(view))
            {
                k = i;
            } else
            {
                k = i;
                if (i < view.getBottom())
                {
                    k = view.getBottom();
                }
            }
            j++;
            i = k;
        }
        j = i;
        if (i == 0x80000000)
        {
            j = f;
        }
        return j;
    }

    public int e()
    {
        int l = a.getChildCount();
        int j = 0;
        int i = 0x7fffffff;
        while (j < l) 
        {
            View view = a.getChildAt(j);
            int k;
            if (view.getLeft() != d && !a.d(view))
            {
                k = i;
            } else
            {
                k = i;
                if (i > view.getTop())
                {
                    k = view.getTop();
                }
            }
            j++;
            i = k;
        }
        j = i;
        if (i == 0x7fffffff)
        {
            j = e;
        }
        return j;
    }

    public void f()
    {
        e = 0;
        f = e();
    }

    public void g()
    {
        e = 0;
        f = 0;
    }
}
