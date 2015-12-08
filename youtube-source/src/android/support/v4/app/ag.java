// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class ag extends FrameLayout
{

    private ag(Context context)
    {
        super(context);
    }

    static ViewGroup a(View view)
    {
        ag ag1 = new ag(view.getContext());
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams != null)
        {
            ag1.setLayoutParams(layoutparams);
        }
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        ag1.addView(view);
        return ag1;
    }

    protected final void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected final void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }
}
