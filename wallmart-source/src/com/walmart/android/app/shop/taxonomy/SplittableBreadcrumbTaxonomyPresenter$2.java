// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import com.walmart.android.app.item.ItemDetailsPresenter;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            SplittableBreadcrumbTaxonomyPresenter

class this._cls0
    implements edListener
{

    final SplittableBreadcrumbTaxonomyPresenter this$0;

    public void onItemClicked(com.walmart.android.data.yPresenter._cls2 _pcls2)
    {
        SplittableBreadcrumbTaxonomyPresenter.access$100(SplittableBreadcrumbTaxonomyPresenter.this, new ItemDetailsPresenter(SplittableBreadcrumbTaxonomyPresenter.access$000(SplittableBreadcrumbTaxonomyPresenter.this), _pcls2.yPresenter()));
    }

    edListener()
    {
        this$0 = SplittableBreadcrumbTaxonomyPresenter.this;
        super();
    }
}
