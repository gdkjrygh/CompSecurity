// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.view.View;

// Referenced classes of package com.walmart.android.ui:
//            Presenter

public abstract class OnSingleClickListener
    implements android.view.View.OnClickListener
{

    private Presenter mPresenter;

    public OnSingleClickListener(Presenter presenter)
    {
        mPresenter = presenter;
    }

    public void onClick(View view)
    {
        if (!mPresenter.isSingleClickFlagSet())
        {
            mPresenter.setSingleClickFlag(true);
            onSingleClick(view);
        }
    }

    public abstract void onSingleClick(View view);
}
