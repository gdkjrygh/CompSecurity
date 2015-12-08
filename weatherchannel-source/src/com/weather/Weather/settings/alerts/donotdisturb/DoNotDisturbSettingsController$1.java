// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts.donotdisturb;

import android.widget.CompoundButton;
import com.weather.commons.ui.widgets.listeners.OnTimeOfDayChangedListener;
import com.weather.util.time.TimeOfDay;

// Referenced classes of package com.weather.Weather.settings.alerts.donotdisturb:
//            DoNotDisturbSettingsController, DoNotDisturbModel

class this._cls0
    implements OnTimeOfDayChangedListener
{

    final DoNotDisturbSettingsController this$0;

    public void onTimeOfDayChanged(Object obj, TimeOfDay timeofday)
    {
        doNotDisturbModel.setStartTimeOfDay(timeofday);
        doNotDisturbModel.setEnabled(true);
        DoNotDisturbSettingsController.access$000(DoNotDisturbSettingsController.this).setChecked(true);
    }

    ()
    {
        this$0 = DoNotDisturbSettingsController.this;
        super();
    }
}
