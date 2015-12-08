// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.wmservice.DialogFactory;

// Referenced classes of package com.walmart.android.app.wishlist:
//            FindListResultsPresenter

class this._cls0
    implements this._cls0
{

    final FindListResultsPresenter this$0;

    public void onError(int i, boolean flag)
    {
        DialogFactory.showErrorDialog(FindListResultsPresenter.access$200(FindListResultsPresenter.this), i);
        if (flag)
        {
            FindListResultsPresenter.access$700(FindListResultsPresenter.this);
        }
    }

    public void onFirstResultBatch(int i)
    {
        if (i > 0)
        {
            FindListResultsPresenter.access$400(FindListResultsPresenter.this, i);
        } else
        {
            FindListResultsPresenter.access$500(FindListResultsPresenter.this);
        }
        FindListResultsPresenter.access$600(FindListResultsPresenter.this, i);
    }

    A()
    {
        this$0 = FindListResultsPresenter.this;
        super();
    }
}
