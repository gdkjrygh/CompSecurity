// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.push;

import android.widget.CompoundButton;
import com.contextlogic.wish.api.data.WishPushPreference;
import com.contextlogic.wish.api.service.SaveSettingService;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.push:
//            PushNotificationSettingsAdapter

class val.preference
    implements android.widget.ener
{

    final PushNotificationSettingsAdapter this$0;
    final WishPushPreference val$preference;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        val$preference.setPreferenceSelected(flag);
        (new SaveSettingService()).requestService(val$preference, null, null);
    }

    ()
    {
        this$0 = final_pushnotificationsettingsadapter;
        val$preference = WishPushPreference.this;
        super();
    }
}
