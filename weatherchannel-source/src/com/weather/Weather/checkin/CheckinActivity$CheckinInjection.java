// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.LoaderManager;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.commons.analytics.checkin.CheckInSocialWeatherSummaryRecorder;
import com.weather.dal2.checkin.CheckinFetcher;
import com.weather.dal2.checkin.CheckinRequester;
import dagger.ObjectGraph;
import flow.Flow;
import java.util.concurrent.Executor;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinActivity, CheckinCache, CheckinIconProvider

class this._cls0
{

    final CheckinActivity this$0;

    ActionBar provideActionBar()
    {
        return getActionBar();
    }

    Activity provideActivity()
    {
        return CheckinActivity.this;
    }

    CheckinHistoryManager provideCheckinHistoryManager()
    {
        return new CheckinHistoryManager(getContentResolver());
    }

    CheckinRequester provideCheckinRequester()
    {
        return new CheckinRequester(new ctory());
    }

    Executor provideExecutor()
    {
        return CheckinActivity.access$300(CheckinActivity.this);
    }

    Flow provideFlow()
    {
        return CheckinActivity.access$200(CheckinActivity.this);
    }

    FragmentManager provideFragmentModule()
    {
        return getFragmentManager();
    }

    LoaderManager provideLoaderManager()
    {
        return getLoaderManager();
    }

    CheckinFetcher provideNearMeCache()
    {
        return CheckinCache.NEAR_ME_CACHE;
    }

    ObjectGraph provideObjectGraph()
    {
        return CheckinActivity.access$100(CheckinActivity.this);
    }

    CheckinIconProvider providePinProvider()
    {
        return CheckinIconProvider.PIN_PROVIDER;
    }

    CheckInSocialWeatherSummaryRecorder provideSocialWeatherRecorder()
    {
        return new CheckInSocialWeatherSummaryRecorder();
    }

    maryRecorder()
    {
        this$0 = CheckinActivity.this;
        super();
    }
}
