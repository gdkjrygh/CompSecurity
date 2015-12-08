// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import com.walmart.android.service.weeklyad.WeeklyAdItem;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.weeklyad:
//            WeeklyAdStoreItemPresenter

class this._cls0 extends CallbackSameThread
{

    final WeeklyAdStoreItemPresenter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        if (result.successful() && result.hasData())
        {
            WeeklyAdStoreItemPresenter.access$000(WeeklyAdStoreItemPresenter.this, (WeeklyAdItem)result.getData());
            return;
        } else
        {
            WeeklyAdStoreItemPresenter.access$100(WeeklyAdStoreItemPresenter.this);
            DialogFactory.showDialog(2, WeeklyAdStoreItemPresenter.access$200(WeeklyAdStoreItemPresenter.this));
            return;
        }
    }

    ()
    {
        this$0 = WeeklyAdStoreItemPresenter.this;
        super();
    }
}
