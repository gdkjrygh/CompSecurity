// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.widget.AbsListView;

// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfPresenter, BundlesShelfAdapter

class this._cls0
    implements android.widget.ener
{

    final BundlesShelfPresenter this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0 || i == 1)
        {
            BundlesShelfPresenter.access$500(BundlesShelfPresenter.this).setImageDownloadingEnabled(true);
        } else
        if (i == 2)
        {
            BundlesShelfPresenter.access$500(BundlesShelfPresenter.this).setImageDownloadingEnabled(false);
            return;
        }
    }

    ()
    {
        this$0 = BundlesShelfPresenter.this;
        super();
    }
}
