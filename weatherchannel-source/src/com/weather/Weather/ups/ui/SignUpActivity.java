// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ups.ui;

import android.app.ActionBar;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.common.GoogleApiAvailability;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSource;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSummaryRecorder;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.commons.ups.ui.Liveable;
import com.weather.commons.ups.ui.SignUpActions;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;

// Referenced classes of package com.weather.Weather.ups.ui:
//            SignUpFragment

public class SignUpActivity extends TWCBaseActivity
    implements Liveable
{
    private static final class AppEventReceiver
    {

        public void onAppEvent(AppEvent appevent)
        {
            static class _cls1
            {

                static final int $SwitchMap$com$weather$dal2$system$AppEvent$Cause[];

                static 
                {
                    $SwitchMap$com$weather$dal2$system$AppEvent$Cause = new int[com.weather.dal2.system.AppEvent.Cause.values().length];
                    try
                    {
                        $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_START.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_STOP.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.weather.dal2.system.AppEvent.Cause[appevent.getCause().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                LocalyticsHandler.getInstance().getUpsSignupSummaryRecorder().resumeTime();
                return;

            case 2: // '\002'
                LocalyticsHandler.getInstance().getUpsSignupSummaryRecorder().pauseTime();
                break;
            }
        }

        private AppEventReceiver()
        {
        }

    }


    static final String SIGN_UP_FRAGMENT = "signup_fragment";
    private static final AppEventReceiver appEventReceiver = new AppEventReceiver(null);
    private boolean alive;
    private ProgressDialog connectionProgressDialog;
    private SignUpActions signUpActions;

    public SignUpActivity()
    {
    }

    public boolean isAlive()
    {
        return alive;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        signUpActions.handleActivityResult(i, j, intent);
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            if (getString(0x7f070046).equals(actionbar.getTitle()))
            {
                finish();
            } else
            if (!getString(0x7f07007d).equals(actionbar.getTitle()))
            {
                signUpActions.invalidateAccount();
                actionbar.setTitle(0x7f070319);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag;
        boolean flag1 = true;
        super.onCreate(bundle);
        alive = true;
        setContentView(0x7f0300b9);
        Object obj = getActionBar();
        if (obj != null)
        {
            ((ActionBar) (obj)).setDisplayOptions(15);
        }
        connectionProgressDialog = new ProgressDialog(this);
        connectionProgressDialog.setMessage(getString(0x7f07018a));
        signUpActions = new SignUpActions(this, connectionProgressDialog);
        SignUpFragment signupfragment = (SignUpFragment)getFragmentManager().findFragmentByTag("signup_fragment");
        obj = signupfragment;
        if (signupfragment == null)
        {
            FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
            obj = new SignUpFragment();
            fragmenttransaction.add(0x7f0d0313, ((android.app.Fragment) (obj)), "signup_fragment");
            fragmenttransaction.addToBackStack(obj.getClass().getName());
            fragmenttransaction.commit();
        }
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        Analytics.trackState(getResources().getString(0x7f0704d6), null);
        if (LocationUtils.getViewIntentUri(getIntent()) != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            LocalyticsUpsSupport.recordSignupStarted(LocalyticsHandler.getInstance(), LocalyticsUpsSignupSource.MARKETING);
        }
        DataAccessLayer.BUS.register(appEventReceiver);
_L4:
        ((SignUpFragment) (obj)).setInterface(signUpActions);
        return;
_L2:
        if (UpsCommonUtil.isLoggedIntoNamedAccount())
        {
            finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Dialog onCreateDialog(int i)
    {
        if (i != 1)
        {
            return super.onCreateDialog(i);
        }
        i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
        if (i == 0)
        {
            return null;
        }
        if (GoogleApiAvailability.getInstance().isUserResolvableError(i))
        {
            return GoogleApiAvailability.getInstance().getErrorDialog(this, i, 2);
        } else
        {
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f07023c).setCancelable(true).create();
        }
    }

    protected void onDestroy()
    {
        alive = false;
        if (connectionProgressDialog != null && connectionProgressDialog.isShowing())
        {
            connectionProgressDialog.dismiss();
            connectionProgressDialog = null;
        }
        if (isFinishing())
        {
            LocalyticsHandler.getInstance().tagSummaryEvent(LocalyticsEvent.UPS_SIGNUP_SUMMARY);
            try
            {
                DataAccessLayer.BUS.unregister(appEventReceiver);
            }
            catch (IllegalArgumentException illegalargumentexception) { }
        }
        signUpActions.onActivityDestroy();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    protected void onResume()
    {
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.WX_PROFILE_SIGNUP);
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
        signUpActions.onActivityStart();
    }

    protected void onStop()
    {
        signUpActions.onActivityStop();
        super.onStop();
    }

}
