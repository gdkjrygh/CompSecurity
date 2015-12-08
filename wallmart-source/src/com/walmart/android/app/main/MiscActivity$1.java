// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Intent;
import com.walmart.android.app.weeklyad.WeeklyAdActivity;
import com.walmart.android.data.WalmartStore;

// Referenced classes of package com.walmart.android.app.main:
//            MiscActivity

class val.store
    implements com.walmart.android.app.storelocator.enter.OnShowLocalAdListener
{

    final MiscActivity this$0;
    final WalmartStore val$store;

    public void onShowLocalAd()
    {
        Intent intent = new Intent(MiscActivity.this, com/walmart/android/app/weeklyad/WeeklyAdActivity);
        intent.putExtra("store_id", val$store.getId());
        startActivity(intent);
    }

    ivity()
    {
        this$0 = final_miscactivity;
        val$store = WalmartStore.this;
        super();
    }
}
