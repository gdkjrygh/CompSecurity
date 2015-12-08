// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.app.Activity;
import android.app.Dialog;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.bridge:
//            HybridPresenter, Page

class this._cls0
    implements resenterCallback
{

    final HybridPresenter this$0;

    public boolean isVisible()
    {
        return HybridPresenter.access$200(HybridPresenter.this);
    }

    public void pageError(int i, String s, String s1)
    {
        if (HybridPresenter.access$200(HybridPresenter.this) && HybridPresenter.access$400(HybridPresenter.this).isResumed())
        {
            DialogFactory.createAlertDialog(HybridPresenter.access$500(HybridPresenter.this).getString(0x7f0900a8), HybridPresenter.access$500(HybridPresenter.this)).show();
            if (i != 1)
            {
                HybridPresenter.access$500(HybridPresenter.this).onBackPressed();
            }
        }
        if (i == 1)
        {
            reload();
            return;
        } else
        {
            HybridPresenter.access$602(HybridPresenter.this, true);
            return;
        }
    }

    public void pushPresenter(Presenter presenter)
    {
        HybridPresenter.access$700(HybridPresenter.this, presenter);
    }

    public void updateHeader(Page page, boolean flag)
    {
        HybridPresenter.access$800(HybridPresenter.this, page, flag);
    }

    public void updateLoadingView(boolean flag)
    {
        HybridPresenter.access$102(HybridPresenter.this, flag);
        HybridPresenter.access$300(HybridPresenter.this);
    }

    agmentCallback()
    {
        this$0 = HybridPresenter.this;
        super();
    }
}
