// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.weather.Weather.settings:
//            SettingsFragment

class val.actionBar
    implements android.graphics.drawable._cls13
{

    final SettingsFragment this$0;
    final ActionBar val$actionBar;

    public void invalidateDrawable(Drawable drawable)
    {
        val$actionBar.setBackgroundDrawable(drawable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
    }

    ()
    {
        this$0 = final_settingsfragment;
        val$actionBar = ActionBar.this;
        super();
    }
}
