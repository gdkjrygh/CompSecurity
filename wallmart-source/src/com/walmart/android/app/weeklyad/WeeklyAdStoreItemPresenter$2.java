// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import com.squareup.picasso.Callback;
import com.walmart.android.service.weeklyad.WeeklyAdItem;

// Referenced classes of package com.walmart.android.app.weeklyad:
//            WeeklyAdStoreItemPresenter

class val.model
    implements Callback
{

    final WeeklyAdStoreItemPresenter this$0;
    final WeeklyAdItem val$model;

    public void onError()
    {
        WeeklyAdStoreItemPresenter.access$300(WeeklyAdStoreItemPresenter.this, val$model);
    }

    public void onSuccess()
    {
        WeeklyAdStoreItemPresenter.access$300(WeeklyAdStoreItemPresenter.this, val$model);
    }

    ()
    {
        this$0 = final_weeklyadstoreitempresenter;
        val$model = WeeklyAdItem.this;
        super();
    }
}
