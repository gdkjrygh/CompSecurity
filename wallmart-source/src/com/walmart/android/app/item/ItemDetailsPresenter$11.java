// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.text.TextUtils;
import com.walmart.android.data.ItemRecommendationResult;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class this._cls0 extends CallbackSameThread
{

    final ItemDetailsPresenter this$0;

    private com.walmart.android.data..Module validateAndGetModule(Result result)
    {
        Object obj = null;
        Result result1 = obj;
        if (result.successful())
        {
            result1 = obj;
            if (result.hasData())
            {
                result = (ItemRecommendationResult)result.getData();
                result1 = obj;
                if (((ItemRecommendationResult) (result)).result != null)
                {
                    result1 = obj;
                    if (((ItemRecommendationResult) (result)).result.modules != null)
                    {
                        result = ((ItemRecommendationResult) (result)).result.modules[0];
                        result1 = obj;
                        if (result != null)
                        {
                            result1 = obj;
                            if (!TextUtils.isEmpty(((com.walmart.android.data..Module) (result)).moduleTitle))
                            {
                                result1 = obj;
                                if (((com.walmart.android.data..Module) (result)).recommendedItems != null)
                                {
                                    result1 = obj;
                                    if (((com.walmart.android.data..Module) (result)).recommendedItems.length > 0)
                                    {
                                        result1 = result;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result1;
    }

    public void onResultSameThread(Request request, Result result)
    {
        ItemDetailsPresenter.access$600(ItemDetailsPresenter.this).remove(request);
        if (isPopped())
        {
            return;
        }
        request = validateAndGetModule(result);
        if (request != null)
        {
            ItemDetailsPresenter.access$3300(ItemDetailsPresenter.this, request);
        }
        result = ItemDetailsPresenter.access$3400(ItemDetailsPresenter.this);
        boolean flag;
        if (request != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        result.setHasRecommendationModule(flag);
    }

    ule(Context context)
    {
        this$0 = ItemDetailsPresenter.this;
        super(context);
    }
}
