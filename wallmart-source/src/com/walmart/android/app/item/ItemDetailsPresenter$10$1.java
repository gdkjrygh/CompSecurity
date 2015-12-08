// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.view.View;
import com.walmart.android.app.item.view.OnlineView;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ReturnPolicyActivity

class val.result
    implements android.view.sPresenter._cls10._cls1
{

    final val.result this$1;
    final Result val$result;

    public void onClick(View view)
    {
        ItemDetailsPresenter.access$200(_fld0).startActivity(ReturnPolicyActivity.makeIntent(ItemDetailsPresenter.access$200(_fld0), (String)val$result.getData()));
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$result = Result.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/item/ItemDetailsPresenter$10

/* anonymous class */
    class ItemDetailsPresenter._cls10 extends CallbackSameThread
    {

        final ItemDetailsPresenter this$0;

        public void onResultSameThread(Request request, Result result1)
        {
            if (result1.successful() && result1.hasData())
            {
                ItemDetailsPresenter.access$3200(ItemDetailsPresenter.this).showReturnPolicy();
                ItemDetailsPresenter.access$3200(ItemDetailsPresenter.this).setReturnPolicyListener(result1. new ItemDetailsPresenter._cls10._cls1());
            }
        }

            
            {
                this$0 = ItemDetailsPresenter.this;
                super();
            }
    }

}
