// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.os.Bundle;
import com.sessionm.api.SessionM;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;

public abstract class SessionMBaseActivity extends TWCBaseActivity
{

    private boolean isActive;

    public SessionMBaseActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        isActive = SessionMUtils.isActive();
    }

    protected void onPause()
    {
        if (isActive)
        {
            SessionM.getInstance().onActivityPause(this);
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (isActive)
        {
            boolean flag = TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_BANNERS, false);
            SessionM.getInstance().setAutopresentMode(flag);
            SessionM.getInstance().onActivityResume(this);
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (isActive)
        {
            SessionM.getInstance().onActivityStart(this);
        }
    }

    protected void onStop()
    {
        if (isActive)
        {
            SessionM.getInstance().onActivityStop(this);
        }
        super.onStop();
    }
}
