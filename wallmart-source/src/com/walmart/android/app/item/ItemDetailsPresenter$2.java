// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class this._cls0 extends CallbackSameThread
{

    final ItemDetailsPresenter this$0;

    private ItemModel validateAndGetModel(Result result)
    {
        Object obj = null;
        ItemModel itemmodel = obj;
        if (result.successful())
        {
            itemmodel = obj;
            if (result.hasData())
            {
                itemmodel = obj;
                if (((ItemModel)result.getData()).getItemId() != null)
                {
                    itemmodel = (ItemModel)result.getData();
                }
            }
        }
        return itemmodel;
    }

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        ItemDetailsPresenter.access$502(ItemDetailsPresenter.this, true);
        ItemDetailsPresenter.access$600(ItemDetailsPresenter.this).remove(request);
        request = validateAndGetModel(result);
        if (request != null)
        {
            ItemDetailsPresenter.access$700(ItemDetailsPresenter.this, request);
            ItemDetailsPresenter.access$800(ItemDetailsPresenter.this);
            if (ItemDetailsPresenter.access$900(ItemDetailsPresenter.this))
            {
                ItemDetailsPresenter.access$1000(ItemDetailsPresenter.this);
            }
            return;
        }
        ItemDetailsPresenter.access$1100(ItemDetailsPresenter.this);
        if (result.hasError() && result.getError().r(com.walmartlabs.kangaroo.CONNECTED))
        {
            DialogFactory.showDialog(600, ItemDetailsPresenter.access$200(ItemDetailsPresenter.this));
            return;
        } else
        {
            DialogFactory.showDialog(2, ItemDetailsPresenter.access$200(ItemDetailsPresenter.this));
            return;
        }
    }

    _cls9(Context context)
    {
        this$0 = ItemDetailsPresenter.this;
        super(context);
    }
}
