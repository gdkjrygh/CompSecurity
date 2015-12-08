// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.app;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adobe.mobile.Config;
import com.android.debug.hv.ViewServer;
import com.comscore.analytics.comScore;
import com.kahuna.sdk.IKahuna;
import com.kahuna.sdk.Kahuna;
import com.sessionm.api.SessionM;
import com.weather.ads2.ui.AdRefreshable;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.ui.PortalButton;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;
import java.util.HashMap;
import java.util.Map;

public abstract class TWCBaseActivity extends FragmentActivity
{

    public static final String ALLERGY_FEED_ID = "allergyFeed";
    public static final String COLD_FLU_FEED_ID = "coldFluFeed";
    public static final String EXTRA_AD_TARGETING_EXTRA_KEY = "com.weather.extraAdTargeting";
    public static final String FROM_FEED_EXTRA_KEY = "com.weather.fromFeed";
    public static final String HURRICANE_CENTRAL_FEED_ID = "hurricaneFeed";
    public static final String MAIN_FEED_ID = "mainFeed";
    private static final int STARTING_ACTION_BAR_ALPHA = 255;
    protected final String TAG = getClass().getSimpleName();
    private int actionBarBackgroundAlpha;
    private Drawable actionBarBackgroundDrawable;
    protected boolean isInUS;
    private boolean isTestMode;
    private boolean isThisActivityBeingDisplayed;

    public TWCBaseActivity()
    {
        actionBarBackgroundAlpha = 255;
    }

    public static void addInitialTargetingToAd(AdRefreshable adrefreshable, Intent intent)
    {
        adrefreshable.setSingleUseAdParameters(getInitialTargetingParameters(intent));
    }

    public static Map getInitialTargetingParameters(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getSerializableExtra("com.weather.extraAdTargeting");
            if (intent instanceof Map)
            {
                return (Map)intent;
            }
        }
        return new HashMap(0);
    }

    private void logSessionM()
    {
        if (getIntent().hasExtra(AlertResponseField.PRODUCT.getName()))
        {
            SessionMUtils.logAction("launch_app_from_push_notification");
        }
    }

    private boolean wasCreatedFromFeed(String s)
    {
        Intent intent = getIntent();
        if (intent == null)
        {
            return false;
        } else
        {
            return s.equals(intent.getStringExtra("com.weather.fromFeed"));
        }
    }

    protected void addSessionMButton(Menu menu)
    {
        boolean flag = false;
        if (!TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, false))
        {
            flag = true;
        }
        if (SessionMUtils.isActive() && flag)
        {
            SessionM.getInstance();
            if (!TwcPrefs.getInstance().contains(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT))
            {
                SessionMUtils.syncOptOut();
            }
            String s = getString(com.weather.commons.R.string.settings_sessionm_switch_title);
            PortalButton portalbutton = new PortalButton(this);
            portalbutton.setOnClickListener(new android.view.View.OnClickListener() {

                final TWCBaseActivity this$0;

                public void onClick(View view)
                {
                    recordButtonPress(LocalyticsFeedButton.SESSION_M);
                    SessionM.getInstance().presentActivity(com.sessionm.api.SessionM.ActivityType.PORTAL);
                }

            
            {
                this$0 = TWCBaseActivity.this;
                super();
            }
            });
            FrameLayout framelayout = new FrameLayout(this);
            (new android.widget.FrameLayout.LayoutParams(-2, -2)).gravity = 17;
            framelayout.addView(portalbutton);
            menu.add(s).setActionView(framelayout).setShowAsAction(1);
            portalbutton.setBackgroundDrawable(getResources().getDrawable(com.weather.commons.R.drawable.sessionm));
            portalbutton.updateButton();
            return;
        } else
        {
            recordButtonNotDisplayed(LocalyticsFeedButton.SESSION_M);
            return;
        }
    }

    public boolean isThisActivityBeingDisplayed()
    {
        return isThisActivityBeingDisplayed;
    }

    public void onBackPressed()
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        android.app.FragmentManager fragmentmanager1 = getFragmentManager();
        if (fragmentmanager != null && fragmentmanager.getBackStackEntryCount() > 1)
        {
            fragmentmanager.popBackStack();
            return;
        }
        if (fragmentmanager1.getBackStackEntryCount() > 1)
        {
            fragmentmanager1.popBackStack();
            return;
        }
        if (!wasCreatedFromMainFeed()) goto _L2; else goto _L1
_L1:
        onReturnToMainFeed();
_L4:
        super.onBackPressed();
        return;
_L2:
        if (wasCreatedFromHurricaneCentralFeed())
        {
            onReturnToHurricaneCentralFeed();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        logSessionM();
        if (AbstractTwcApplication.isBuildServerDebug())
        {
            ViewServer.get(this).addWindow(this);
        }
        bundle = (ImageView)findViewById(0x102002c);
        if (bundle != null)
        {
            bundle.setPadding(getResources().getDimensionPixelSize(com.weather.commons.R.dimen.home_icon_padding_left), 0, 0, 0);
        }
        isInUS = LocaleUtil.isDeviceInUS();
    }

    protected void onDestroy()
    {
        if (AbstractTwcApplication.isBuildServerDebug())
        {
            ViewServer.get(this).removeWindow(this);
        }
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        logSessionM();
    }

    protected void onPause()
    {
        isThisActivityBeingDisplayed = false;
        comScore.onExitForeground();
        Config.pauseCollectingLifecycleData();
        if (isInUS)
        {
            SessionM.getInstance().onActivityPause(this);
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        isTestMode = TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.TEST_MODE, false);
        comScore.onEnterForeground();
        Config.collectLifecycleData();
        isThisActivityBeingDisplayed = true;
        setActionBarColor();
        if (isInUS)
        {
            SessionM.getInstance().setAutopresentMode(false);
            SessionM.getInstance().onActivityResume(this);
        }
    }

    protected void onReturnToHurricaneCentralFeed()
    {
    }

    protected void onReturnToMainFeed()
    {
    }

    protected void onStart()
    {
        super.onStart();
        Kahuna.getInstance().start();
        if (isInUS)
        {
            SessionM.getInstance().onActivityStart(this);
        }
    }

    protected void onStop()
    {
        if (isInUS)
        {
            SessionM.getInstance().onActivityStop(this);
        }
        super.onStop();
        Kahuna.getInstance().stop();
    }

    protected void recordButtonNotDisplayed(LocalyticsFeedButton localyticsfeedbutton)
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValueIfAbsent(localyticsfeedbutton, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.NOT_DISPLAYED.getAttributeValue());
    }

    protected void recordButtonPress(LocalyticsFeedButton localyticsfeedbutton)
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(localyticsfeedbutton, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void setActionBarBackgroundAlpha(int i)
    {
        LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "setActionBarColor isThisActivityBeingDisplayed=%s", new Object[] {
            Boolean.valueOf(isThisActivityBeingDisplayed)
        });
        if (isThisActivityBeingDisplayed)
        {
            actionBarBackgroundAlpha = i;
            if (actionBarBackgroundDrawable != null)
            {
                actionBarBackgroundDrawable.setAlpha(i);
                LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "setActionBarBackgroundAlpha actionBarBackgroundDrawable=%s,actionBarBackgroundAlpha=%s", new Object[] {
                    actionBarBackgroundDrawable, Integer.valueOf(i)
                });
                return;
            }
        }
    }

    protected void setActionBarColor()
    {
        LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "setActionBarColor isThisActivityBeingDisplayed=%s", new Object[] {
            Boolean.valueOf(isThisActivityBeingDisplayed)
        });
        if (isThisActivityBeingDisplayed)
        {
            ActionBar actionbar = getActionBar();
            LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "setActionBarColor actionBar=%s, isTestMode=%s", new Object[] {
                actionbar, Boolean.valueOf(isTestMode)
            });
            if (actionbar != null)
            {
                if (isTestMode)
                {
                    actionbar.setBackgroundDrawable(getResources().getDrawable(com.weather.commons.R.color.actionbar_color_test));
                    return;
                }
                actionBarBackgroundDrawable = getResources().getDrawable(com.weather.commons.R.color.actionbar_color);
                if (actionBarBackgroundDrawable != null)
                {
                    actionBarBackgroundDrawable.setAlpha(actionBarBackgroundAlpha);
                }
                LogUtil.d(TAG, LoggingMetaTags.TWC_UI, "setActionBarColor actionBarBackgroundDrawable=%s, actionBarBackgroundAlpha=%s", new Object[] {
                    actionBarBackgroundDrawable, Integer.valueOf(actionBarBackgroundAlpha)
                });
                actionbar.setBackgroundDrawable(actionBarBackgroundDrawable);
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    actionbar.setDisplayShowTitleEnabled(false);
                    actionbar.setDisplayShowTitleEnabled(true);
                    return;
                }
            }
        }
    }

    protected boolean wasCreatedFromHurricaneCentralFeed()
    {
        return wasCreatedFromFeed("hurricaneFeed");
    }

    protected boolean wasCreatedFromMainFeed()
    {
        return wasCreatedFromFeed("mainFeed");
    }
}
