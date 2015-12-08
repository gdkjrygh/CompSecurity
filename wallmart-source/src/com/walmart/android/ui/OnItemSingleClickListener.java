// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmart.android.ui:
//            Presenter

public abstract class OnItemSingleClickListener
    implements android.widget.AdapterView.OnItemClickListener
{

    private Presenter mPresenter;

    public OnItemSingleClickListener(Presenter presenter)
    {
        mPresenter = presenter;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!mPresenter.isSingleClickFlagSet())
        {
            mPresenter.setSingleClickFlag(true);
            onItemSingleClick(adapterview, view, i, l);
        }
    }

    public abstract void onItemSingleClick(AdapterView adapterview, View view, int i, long l);
}
