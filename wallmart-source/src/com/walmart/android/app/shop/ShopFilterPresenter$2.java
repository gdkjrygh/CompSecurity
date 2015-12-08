// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.walmart.android.data.StoreQueryResult;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.wmservice.DialogFactory;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterPresenter, ShopFilterManager

class init> extends AsyncCallbackOnThread
{

    final ShopFilterPresenter this$0;

    public void onFailureSameThread(Integer integer, StoreQueryResult storequeryresult)
    {
        ShopFilterPresenter.access$300(ShopFilterPresenter.this).setVisibility(8);
        Log.w(ShopFilterPresenter.access$400(), (new StringBuilder()).append("Failed to load filter refinement items. ErrorCode: ").append(integer).toString());
        if (isPopped())
        {
            return;
        }
        ShopFilterPresenter.access$500(ShopFilterPresenter.this);
        if (integer.intValue() == 0x15f92)
        {
            DialogFactory.showDialog(600, ShopFilterPresenter.access$600(ShopFilterPresenter.this));
            return;
        } else
        {
            DialogFactory.showDialog(900, ShopFilterPresenter.access$600(ShopFilterPresenter.this));
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StoreQueryResult)obj1);
    }

    public void onSuccessSameThread(StoreQueryResult storequeryresult)
    {
        if (isPopped())
        {
            return;
        }
        com.walmart.android.data.ementGroup aementgroup[] = storequeryresult.getRefinementGroups();
        if (aementgroup == null || aementgroup.length == 0)
        {
            Log.w(ShopFilterPresenter.access$400(), "Failed to load filter refinement items.  No data returned.");
            storequeryresult = ShopFilterPresenter.access$700(ShopFilterPresenter.this).getRefinements();
            if (storequeryresult != null && storequeryresult.size() > 0)
            {
                ShopFilterPresenter.access$800(ShopFilterPresenter.this, 1);
                ShopFilterPresenter.access$200(ShopFilterPresenter.this);
                setInStoreActive(false);
                reloadData();
                return;
            } else
            {
                ShopFilterPresenter.access$900(ShopFilterPresenter.this, 2);
                return;
            }
        } else
        {
            ShopFilterPresenter.access$1000(ShopFilterPresenter.this, storequeryresult);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StoreQueryResult)obj);
    }

    (Handler handler)
    {
        this$0 = ShopFilterPresenter.this;
        super(handler);
    }
}
