// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter, CreatorItemsAdapter

class <init> extends CancelableCallback
{

    final ListCreatorPresenter this$0;
    final String val$filter;
    final String val$order;
    final String val$sort;

    protected void onCancel()
    {
        WLog.d(ListCreatorPresenter.access$1300(), "reloadItemsForCurrentList().onCancel");
        ListCreatorPresenter.access$2402(ListCreatorPresenter.this, null);
        ListCreatorPresenter.access$2700(ListCreatorPresenter.this, 1);
    }

    public void onResult(Result result)
    {
        WLog.d(ListCreatorPresenter.access$1300(), "reloadItemsForCurrentList().onResult");
        ListCreatorPresenter.access$2402(ListCreatorPresenter.this, null);
        ListCreatorPresenter.access$2500(ListCreatorPresenter.this, 1);
        if (result.successful() && result.hasData())
        {
            ListCreatorPresenter.access$1702(ListCreatorPresenter.this, val$filter);
            ListCreatorPresenter.access$1802(ListCreatorPresenter.this, val$sort);
            ListCreatorPresenter.access$1902(ListCreatorPresenter.this, val$order);
            result = (List)result.getData();
            ListCreatorPresenter.access$2600(ListCreatorPresenter.this).setItems(result);
            ListCreatorPresenter.access$1100(ListCreatorPresenter.this);
        } else
        if (ListCreatorPresenter.access$2100(ListCreatorPresenter.this))
        {
            DialogFactory.showDialog(900, ListCreatorPresenter.access$200(ListCreatorPresenter.this));
            return;
        }
    }

    (String s2)
    {
        this$0 = final_listcreatorpresenter;
        val$filter = s;
        val$sort = String.this;
        val$order = s2;
        super(final_context);
    }
}
