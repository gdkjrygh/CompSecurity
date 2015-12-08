// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts.donotdisturb;

import android.widget.CompoundButton;

// Referenced classes of package com.weather.Weather.settings.alerts.donotdisturb:
//            DoNotDisturbSettingsController, DoNotDisturbModel

class this._cls0
    implements android.widget.tener
{

    final DoNotDisturbSettingsController this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        doNotDisturbModel.setEnabled(flag);
    }

    ()
    {
        this$0 = DoNotDisturbSettingsController.this;
        super();
    }
}
