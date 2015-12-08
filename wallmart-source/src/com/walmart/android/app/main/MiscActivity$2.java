// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StorePickerListener;

// Referenced classes of package com.walmart.android.app.main:
//            MiscActivity

class val.from
    implements StorePickerListener
{

    final MiscActivity this$0;
    final String val$from;

    public void onCancelled()
    {
    }

    public void onStoreClicked(WalmartStore walmartstore)
    {
        com.walmartlabs.anivia.on.Builder builder = (new com.walmartlabs.anivia.on.Builder("makeMyStore")).putString("storeId", walmartstore.getId());
        if (!TextUtils.isEmpty(val$from))
        {
            builder.putString("tapLocation", val$from);
        }
        MessageBus.getBus().post(builder);
        SharedPreferencesUtil.saveLocalAdStore(MiscActivity.this, walmartstore);
        finish();
    }

    public volatile void onStoreClicked(StoreData storedata)
    {
        onStoreClicked((WalmartStore)storedata);
    }

    il()
    {
        this$0 = final_miscactivity;
        val$from = String.this;
        super();
    }
}
