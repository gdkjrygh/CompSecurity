// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverPresenterSyncCallback, SaverDashboardPresenter

class  extends SaverPresenterSyncCallback
{

    final SaverDashboardPresenter this$0;

    protected void onSyncResult(Integer integer)
    {
        if (!isPopped())
        {
            SaverDashboardPresenter.access$000(SaverDashboardPresenter.this);
        }
    }

    protected void showNoNetworkDialog()
    {
        SaverDashboardPresenter.access$100(SaverDashboardPresenter.this, 2);
    }

    protected void showUnknownErrorDialog()
    {
        SaverDashboardPresenter.access$200(SaverDashboardPresenter.this, 3);
    }

    (Presenter presenter)
    {
        this$0 = SaverDashboardPresenter.this;
        super(presenter);
    }
}
