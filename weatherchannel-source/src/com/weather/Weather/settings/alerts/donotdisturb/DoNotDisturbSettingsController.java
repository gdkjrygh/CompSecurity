// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts.donotdisturb;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.weather.Weather.settings.alerts.donotdisturb.localytics.DoNotDisturbEventTagger;
import com.weather.commons.ui.widgets.TimeOfDaySelector;
import com.weather.commons.ui.widgets.listeners.OnTimeOfDayChangedListener;
import com.weather.util.time.TimeOfDay;

// Referenced classes of package com.weather.Weather.settings.alerts.donotdisturb:
//            DoNotDisturbModel

public class DoNotDisturbSettingsController
{

    protected DoNotDisturbModel doNotDisturbModel;
    private TimeOfDaySelector endTimeOfDaySelector;
    protected int endTimeOfDaySelectorDefaultId;
    private final OnTimeOfDayChangedListener endTimeOfDayUpdater = new OnTimeOfDayChangedListener() {

        final DoNotDisturbSettingsController this$0;

        public void onTimeOfDayChanged(Object obj, TimeOfDay timeofday)
        {
            doNotDisturbModel.setEndTimeOfDay(timeofday);
            doNotDisturbModel.setEnabled(true);
            isEnabledCheckBox.setChecked(true);
        }

            
            {
                this$0 = DoNotDisturbSettingsController.this;
                super();
            }
    };
    private CompoundButton isEnabledCheckBox;
    protected int isEnabledCheckBoxDefaultId;
    private final android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new android.widget.CompoundButton.OnCheckedChangeListener() {

        final DoNotDisturbSettingsController this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            doNotDisturbModel.setEnabled(flag);
        }

            
            {
                this$0 = DoNotDisturbSettingsController.this;
                super();
            }
    };
    private TimeOfDaySelector startTimeOfDaySelector;
    protected int startTimeOfDaySelectorDefaultId;
    private final OnTimeOfDayChangedListener startTimeOfDayUpdater = new OnTimeOfDayChangedListener() {

        final DoNotDisturbSettingsController this$0;

        public void onTimeOfDayChanged(Object obj, TimeOfDay timeofday)
        {
            doNotDisturbModel.setStartTimeOfDay(timeofday);
            doNotDisturbModel.setEnabled(true);
            isEnabledCheckBox.setChecked(true);
        }

            
            {
                this$0 = DoNotDisturbSettingsController.this;
                super();
            }
    };

    public DoNotDisturbSettingsController()
    {
        startTimeOfDaySelectorDefaultId = 0x7f0d024d;
        endTimeOfDaySelectorDefaultId = 0x7f0d024e;
        isEnabledCheckBoxDefaultId = 0x7f0d024a;
        doNotDisturbModel = new DoNotDisturbModel();
    }

    private void findViews(View view)
    {
        startTimeOfDaySelector = (TimeOfDaySelector)view.findViewById(startTimeOfDaySelectorDefaultId);
        endTimeOfDaySelector = (TimeOfDaySelector)view.findViewById(endTimeOfDaySelectorDefaultId);
        isEnabledCheckBox = (CompoundButton)view.findViewById(isEnabledCheckBoxDefaultId);
    }

    private void initializeViewsState(Bundle bundle)
    {
        startTimeOfDaySelector.setTimeOfDay(doNotDisturbModel.getStartTimeOfDay());
        endTimeOfDaySelector.setTimeOfDay(doNotDisturbModel.getEndTimeOfDay());
        isEnabledCheckBox.setChecked(doNotDisturbModel.isEnabled());
    }

    private void setEventListeners()
    {
        startTimeOfDaySelector.setOnTimeOfDayChangedListener(startTimeOfDayUpdater);
        endTimeOfDaySelector.setOnTimeOfDayChangedListener(endTimeOfDayUpdater);
        isEnabledCheckBox.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private void tagEventInLocalytics()
    {
        if (!doNotDisturbModel.isChanged())
        {
            return;
        } else
        {
            (new DoNotDisturbEventTagger()).tagEvent();
            return;
        }
    }

    public void start(View view, Bundle bundle)
    {
        findViews(view);
        initializeViewsState(bundle);
        setEventListeners();
    }

    public void stop()
    {
        tagEventInLocalytics();
    }

}
