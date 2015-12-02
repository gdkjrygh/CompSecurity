// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView, IcsAbsSpinner

class this._cls0
{

    private final SparseArray mScrapHeap = new SparseArray();
    final IcsAbsSpinner this$0;

    void clear()
    {
        int j = AbsActionBarView.b;
        SparseArray sparsearray = mScrapHeap;
        int k = sparsearray.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    View view = (View)sparsearray.valueAt(i);
                    if (view != null)
                    {
                        IcsAbsSpinner.access$100(IcsAbsSpinner.this, view, true);
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                sparsearray.clear();
                return;
            }
            i++;
        } while (true);
    }

    View get(int i)
    {
        View view = (View)mScrapHeap.get(i);
        if (view != null)
        {
            mScrapHeap.delete(i);
        }
        return view;
    }

    public void put(int i, View view)
    {
        mScrapHeap.put(i, view);
    }

    ()
    {
        this$0 = IcsAbsSpinner.this;
        super();
    }
}
