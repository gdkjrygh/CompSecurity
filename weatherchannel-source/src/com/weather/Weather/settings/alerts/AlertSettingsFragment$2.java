// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.widget.CompoundButton;
import com.weather.util.prefs.Prefs;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment

class this._cls0
    implements android.widget.ChangeListener
{

    final AlertSettingsFragment this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        prefs.putBoolean(vibrationKey, flag);
    }

    A()
    {
        this$0 = AlertSettingsFragment.this;
        super();
    }
}
