// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.instrumentation;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;

public class InstrumentedFragmentActivity extends FragmentActivity
{

    public InstrumentedFragmentActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        comScore.setAppContext(getApplicationContext());
    }

    protected void onPause()
    {
        super.onPause();
        comScore.onExitForeground();
    }

    protected void onResume()
    {
        super.onResume();
        comScore.getCore().setCurrentActivityName(getClass().getSimpleName());
        comScore.onEnterForeground();
    }
}
