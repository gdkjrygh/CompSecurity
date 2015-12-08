// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapController

class val.actionBar
    implements Runnable
{

    final CheckinMapController this$0;
    final ActionBar val$actionBar;

    public void run()
    {
        val$actionBar.setSelectedNavigationItem(0);
    }

    ()
    {
        this$0 = final_checkinmapcontroller;
        val$actionBar = ActionBar.this;
        super();
    }
}
