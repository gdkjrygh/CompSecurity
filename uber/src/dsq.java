// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.View;

final class dsq
{

    private View a[];
    private int b[];
    private SparseArray c[];
    private int d;
    private SparseArray e;

    dsq()
    {
        a = new View[0];
        b = new int[0];
    }

    private static View a(SparseArray sparsearray, int i)
    {
        int k = sparsearray.size();
        if (k > 0)
        {
            for (int j = 0; j < k; j++)
            {
                int l = sparsearray.keyAt(j);
                View view = (View)sparsearray.get(l);
                if (l == i)
                {
                    sparsearray.remove(l);
                    return view;
                }
            }

            i = k - 1;
            View view1 = (View)sparsearray.valueAt(i);
            sparsearray.remove(sparsearray.keyAt(i));
            return view1;
        } else
        {
            return null;
        }
    }

    final View a(int i, int j)
    {
        if (d == 1)
        {
            return a(e, i);
        }
        if (j >= 0 && j < c.length)
        {
            return a(c[j], i);
        } else
        {
            return null;
        }
    }

    final void a()
    {
        SparseArray asparsearray[] = new SparseArray[3];
        for (int i = 0; i < 3; i++)
        {
            asparsearray[i] = new SparseArray();
        }

        d = 3;
        e = asparsearray[0];
        c = asparsearray;
    }

    final void a(View view, int i, int j)
    {
        if (d == 1)
        {
            e.put(i, view);
        } else
        {
            c[j].put(i, view);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            view.setAccessibilityDelegate(null);
        }
    }
}
