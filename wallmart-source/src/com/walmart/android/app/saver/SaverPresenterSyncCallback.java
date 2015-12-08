// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.ui.Presenter;

public abstract class SaverPresenterSyncCallback
    implements com.walmart.android.service.saver.SaverManager.ResultCallback
{

    private final Presenter mPresenter;

    protected SaverPresenterSyncCallback(Presenter presenter)
    {
        mPresenter = presenter;
    }

    public void onResult(Integer integer)
    {
        onSyncResult(integer);
        if (integer != null && mPresenter.isTop())
        {
            if (integer.intValue() == 1 || integer.intValue() == 0x15f92)
            {
                showNoNetworkDialog();
            } else
            if (integer.intValue() != 4 && integer.intValue() != -1)
            {
                showUnknownErrorDialog();
                return;
            }
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Integer)obj);
    }

    protected abstract void onSyncResult(Integer integer);

    protected abstract void showNoNetworkDialog();

    protected abstract void showUnknownErrorDialog();
}
