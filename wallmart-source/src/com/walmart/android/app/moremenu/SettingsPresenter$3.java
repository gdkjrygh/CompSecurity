// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.content.Context;
import android.widget.CompoundButton;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.util.SharedPreferencesUtil;

// Referenced classes of package com.walmart.android.app.moremenu:
//            SettingsPresenter

class val.context
    implements android.widget.ckedChangeListener
{

    final SettingsPresenter this$0;
    final Context val$context;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        SharedPreferencesUtil.setStoreFeatureNotificationsEnabled(val$context, flag);
        if (flag)
        {
            compoundbutton = "Store Features Enabled";
        } else
        {
            compoundbutton = "Store Features Disabled";
        }
        GoogleAnalytics.trackEvent("Notifications", compoundbutton, "");
        SettingsPresenter.access$000(SettingsPresenter.this, "events", flag);
    }

    ()
    {
        this$0 = final_settingspresenter;
        val$context = Context.this;
        super();
    }
}
