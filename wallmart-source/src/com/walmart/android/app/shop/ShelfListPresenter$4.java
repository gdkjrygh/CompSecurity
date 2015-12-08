// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.walmart.android.analytics.AnalyticsHelper;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter, ShopFilterActivity, ShopFilterManager

class this._cls0
    implements android.view.ListPresenter._cls4
{

    final ShelfListPresenter this$0;

    public void onClick(View view)
    {
        view = new Intent(mActivity, com/walmart/android/app/shop/ShopFilterActivity);
        ShopFilterManager shopfiltermanager = new ShopFilterManager();
        shopfiltermanager.setStoreID(mFilterManager.getStoreID());
        shopfiltermanager.setBrowseToken(mFilterManager.getBrowseToken());
        shopfiltermanager.setSearchQuery(mFilterManager.getSearchQuery());
        shopfiltermanager.setDepartment(mFilterManager.getDepartment());
        shopfiltermanager.setShelfDepartmentTitle(mFilterManager.getShelfDepartmentTitle());
        shopfiltermanager.setRefinements(mFilterManager.getRefinements());
        ShopFilterActivity.setFilterParams(shopfiltermanager);
        mActivity.startActivityForResult(view, 100);
        mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
        if (mMode == 1)
        {
            AnalyticsHelper.post(AnalyticsHelper.prepareSearchFilterPageViewEvent());
        }
    }

    ()
    {
        this$0 = ShelfListPresenter.this;
        super();
    }
}
