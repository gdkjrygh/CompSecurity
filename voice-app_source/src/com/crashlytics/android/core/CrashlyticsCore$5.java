// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.SettingsData;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore

class this._cls0
    implements io.fabric.sdk.android.services.settings.ccess
{

    final CrashlyticsCore this$0;

    public Boolean usingSettings(SettingsData settingsdata)
    {
        boolean flag = false;
        if (settingsdata.featuresData.promptEnabled)
        {
            if (!shouldSendReportsWithoutPrompting())
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public volatile Object usingSettings(SettingsData settingsdata)
    {
        return usingSettings(settingsdata);
    }

    sData()
    {
        this$0 = CrashlyticsCore.this;
        super();
    }
}
