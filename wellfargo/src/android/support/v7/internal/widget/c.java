// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat

class c
{

    final AbsSpinnerCompat a;
    private final SparseArray b = new SparseArray();

    c(AbsSpinnerCompat absspinnercompat)
    {
        a = absspinnercompat;
        super();
    }

    View a(int i)
    {
        View view = (View)b.get(i);
        if (view != null)
        {
            b.delete(i);
        }
        return view;
    }

    void a()
    {
        SparseArray sparsearray = b;
        int j = sparsearray.size();
        for (int i = 0; i < j; i++)
        {
            View view = (View)sparsearray.valueAt(i);
            if (view != null)
            {
                AbsSpinnerCompat.a(a, view, true);
            }
        }

        sparsearray.clear();
    }

    public void a(int i, View view)
    {
        b.put(i, view);
    }
}
