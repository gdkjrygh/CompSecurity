// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.support.v7.app.AppCompatActivity;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            SplittableBreadcrumbTaxonomyPresenter

class this._cls0
    implements com.walmart.android.ui.omyPresenter._cls1
{

    final SplittableBreadcrumbTaxonomyPresenter this$0;

    public boolean onInterceptPresenterPush(Presenter presenter, boolean flag, boolean flag1)
    {
        return false;
    }

    public void onPresenterPopped(Presenter presenter)
    {
        ((AppCompatActivity)SplittableBreadcrumbTaxonomyPresenter.access$000(SplittableBreadcrumbTaxonomyPresenter.this)).supportInvalidateOptionsMenu();
    }

    public void onPresenterPushed(Presenter presenter)
    {
        ((AppCompatActivity)SplittableBreadcrumbTaxonomyPresenter.access$000(SplittableBreadcrumbTaxonomyPresenter.this)).supportInvalidateOptionsMenu();
    }

    public void onPresenterTitleUpdated(Presenter presenter)
    {
    }

    ()
    {
        this$0 = SplittableBreadcrumbTaxonomyPresenter.this;
        super();
    }
}
