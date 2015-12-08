// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.app.moremenu.AboutPresenter;
import com.walmart.android.app.moremenu.SettingsPresenter;
import com.walmart.android.app.moremenu.TermsOfUsePresenter;
import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.app.weeklyad.WeeklyAdActivity;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderController;
import com.walmartlabs.storelocator.StorePickerListener;

// Referenced classes of package com.walmart.android.app.main:
//            FullScreenActivity

public class MiscActivity extends FullScreenActivity
{

    public static final String EXTRA_STORE_PICKER_OPENED_FROM = "EXTRA_STORE_PICKER_OPENED_FROM";
    public static final String SHOW = "show";
    public static final int SHOW_ABOUT = 1;
    public static final int SHOW_MY_STORE_DETAILS = 3;
    public static final int SHOW_SETTINGS = 2;
    public static final int SHOW_STORE_PICKER = 4;
    public static final int SHOW_TERMS = 5;

    public MiscActivity()
    {
    }

    protected void onCreate(final Bundle from)
    {
        final WalmartStore store;
        PresenterStack presenterstack;
        Object obj;
        super.onCreate(from);
        store = null;
        presenterstack = getPresenterStack();
        obj = getIntent();
        from = store;
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i = ((Intent) (obj)).getIntExtra("show", -1);
        if (i != 1) goto _L4; else goto _L3
_L3:
        from = new AboutPresenter(this);
_L2:
        if (from == null) goto _L6; else goto _L5
_L5:
        presenterstack.pushPresenter(from, false);
_L8:
        return;
_L4:
        if (i == 2)
        {
            from = new SettingsPresenter();
        } else
        if (i == 3)
        {
            store = SharedPreferencesUtil.getSavedLocalAdJsonStore(this);
            from = new StoreDetailPresenter(this, store);
            from.setOnShowLocalAdListener(new com.walmart.android.app.storelocator.StoreDetailPresenter.OnShowLocalAdListener() {

                final MiscActivity this$0;
                final WalmartStore val$store;

                public void onShowLocalAd()
                {
                    Intent intent = new Intent(MiscActivity.this, com/walmart/android/app/weeklyad/WeeklyAdActivity);
                    intent.putExtra("store_id", store.getId());
                    startActivity(intent);
                }

            
            {
                this$0 = MiscActivity.this;
                store = walmartstore;
                super();
            }
            });
        } else
        if (i == 4)
        {
            from = ((Intent) (obj)).getStringExtra("EXTRA_STORE_PICKER_OPENED_FROM");
            obj = new StoreFinderController(this, presenterstack, new WalmartStoreConfigurator(this));
            ((StoreFinderController) (obj)).initPickerMode();
            ((StoreFinderController) (obj)).setStorePickerListener(new StorePickerListener() {

                final MiscActivity this$0;
                final String val$from;

                public void onCancelled()
                {
                }

                public void onStoreClicked(WalmartStore walmartstore)
                {
                    com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("makeMyStore")).putString("storeId", walmartstore.getId());
                    if (!TextUtils.isEmpty(from))
                    {
                        builder.putString("tapLocation", from);
                    }
                    MessageBus.getBus().post(builder);
                    SharedPreferencesUtil.saveLocalAdStore(MiscActivity.this, walmartstore);
                    finish();
                }

                public volatile void onStoreClicked(StoreData storedata)
                {
                    onStoreClicked((WalmartStore)storedata);
                }

            
            {
                this$0 = MiscActivity.this;
                from = s;
                super();
            }
            });
            ((StoreFinderController) (obj)).initLocation();
            ((StoreFinderController) (obj)).setStorePickerTitle(getString(0x7f09059e));
            ((StoreFinderController) (obj)).show(false);
            from = store;
        } else
        {
            from = store;
            if (i == 5)
            {
                from = new TermsOfUsePresenter(this);
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (presenterstack.peek() != null) goto _L8; else goto _L7
_L7:
        finish();
        return;
        if (true) goto _L2; else goto _L9
_L9:
    }
}
