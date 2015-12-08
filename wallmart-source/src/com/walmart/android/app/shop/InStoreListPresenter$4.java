// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreListPresenter

class val.action extends OnSingleClickListener
{

    final InStoreListPresenter this$0;
    final String val$action;

    public void onSingleClick(View view)
    {
        NavigationItemUtils.launchFromUri(InStoreListPresenter.access$200(InStoreListPresenter.this), val$action, true);
    }

    _cls9(String s)
    {
        this$0 = final_instorelistpresenter;
        val$action = s;
        super(Presenter.this);
    }
}
