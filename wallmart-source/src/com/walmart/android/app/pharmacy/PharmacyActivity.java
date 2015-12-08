// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.squareup.otto.Bus;
import com.walmart.android.app.Debug;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.DrawerController;
import com.walmart.android.app.main.HomeActivity;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.events.ExtraFragmentSwitchedEvent;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.android.pharmacy.OrderConfirmationRefillPresenter;
import com.walmartlabs.android.pharmacy.PharmacyManager;
import com.walmartlabs.android.pharmacy.UserInteractionObservable;
import com.walmartlabs.ui.PresenterFragment;
import com.walmartlabs.utils.WLog;

public class PharmacyActivity extends AppCompatActivity
    implements UserInteractionObservable
{

    private static final int REQUEST_CODE = 2000;
    private static final String TAG = com/walmart/android/app/pharmacy/PharmacyActivity.getSimpleName();
    private DrawerController mDrawerController;
    private FragmentManager mFragmentManager;
    private String mFragmentName;
    private com.walmartlabs.android.pharmacy.UserInteractionObservable.OnUserInteractionObserver mOnUserInteractionObserver;
    private SystemBarTintManager mSystemBarTintManager;

    public PharmacyActivity()
    {
    }

    public static void close(Activity activity)
    {
        activity.finishActivity(2000);
    }

    public static void launch(Activity activity)
    {
        Intent intent = new Intent(activity, com/walmart/android/app/pharmacy/PharmacyActivity);
        intent.setFlags(0x20000);
        activity.startActivityForResult(intent, 2000);
        activity.overridePendingTransition(0x7f05000f, 0x7f050011);
    }

    private void showMainActivity()
    {
        Intent intent = new Intent(this, com/walmart/android/app/main/HomeActivity);
        intent.setFlags(0x20000);
        startActivity(intent);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        PresenterFragment presenterfragment = (PresenterFragment)mFragmentManager.findFragmentById(0x7f100209);
        if (presenterfragment != null)
        {
            presenterfragment.onActivityResult(i, j, intent);
        }
    }

    public void onBackPressed()
    {
        PresenterFragment presenterfragment;
        if (mDrawerController == null || !mDrawerController.onBackPressed())
        {
            if ((presenterfragment = (PresenterFragment)mFragmentManager.findFragmentById(0x7f100209)) == null || !presenterfragment.onBackPressed())
            {
                if (mFragmentManager.getBackStackEntryCount() > 0)
                {
                    mFragmentManager.popBackStack();
                    MessageBus.getBus().post(new ExtraFragmentSwitchedEvent(mFragmentName, TAG));
                    return;
                } else
                {
                    super.onBackPressed();
                    return;
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mDrawerController != null)
        {
            mDrawerController.onConfigurationChanged(configuration);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        Class class1;
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        }
        if (!Debug.getPharmacyScreenshotSetting(this))
        {
            getWindow().setFlags(8192, 8192);
        }
        setContentView(0x7f040097);
        bundle = (Toolbar)findViewById(0x7f100207);
        setSupportActionBar(bundle);
        mDrawerController = new DrawerController(this);
        mDrawerController.init();
        mFragmentManager = getSupportFragmentManager();
        mSystemBarTintManager = new SystemBarTintManager(this);
        mSystemBarTintManager.setStatusBarTintEnabled(true);
        mSystemBarTintManager.setStatusBarTintColor(getResources().getColor(0x7f0f0006));
        getWindow().setBackgroundDrawable(null);
        bundle.setBackgroundDrawable(getResources().getDrawable(0x7f02003c));
        MessageBus.getBus().register(this);
        bundle = null;
        class1 = FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.PHARMACY);
        PresenterFragment presenterfragment = (PresenterFragment)class1.newInstance();
        bundle = presenterfragment;
_L1:
        Exception exception;
        if (bundle != null)
        {
            mFragmentName = class1.getName();
            FragmentTransaction fragmenttransaction = mFragmentManager.beginTransaction();
            fragmenttransaction.add(0x7f100209, bundle, mFragmentName);
            fragmenttransaction.commit();
            MessageBus.getBus().post(new ExtraFragmentSwitchedEvent(mFragmentName, TAG));
            return;
        } else
        {
            finish();
            return;
        }
        exception;
        WLog.e(TAG, "Failed to create pharmacy fragment", exception);
          goto _L1
    }

    protected void onDestroy()
    {
        super.onDestroy();
        MessageBus.getBus().unregister(this);
        if (mDrawerController != null)
        {
            mDrawerController.destroy();
            mDrawerController = null;
        }
        PharmacyManager.get().endSession();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (mDrawerController != null && mDrawerController.onOptionsItemSelected(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        if (mDrawerController != null)
        {
            mDrawerController.syncState();
        }
    }

    public void onPresenterStackUpdatedEvent(PresenterStackUpdatedEvent presenterstackupdatedevent)
    {
        if ((presenterstackupdatedevent.onTop instanceof OrderConfirmationRefillPresenter) && !SharedPreferencesUtil.hasShownRateAppDialog(this))
        {
            SharedPreferencesUtil.setShowRateAppDialog(this, true);
        }
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(presenterstackupdatedevent.onTop.getTitleText());
        }
        supportInvalidateOptionsMenu();
    }

    public void onSwitchFragmentEvent(SwitchFragmentEvent switchfragmentevent)
    {
        showMainActivity();
    }

    public void onUserInteraction()
    {
        super.onUserInteraction();
        if (mOnUserInteractionObserver != null)
        {
            mOnUserInteractionObserver.onUserInteraction();
        }
    }

    public void setOnUserInteractionObserver(com.walmartlabs.android.pharmacy.UserInteractionObservable.OnUserInteractionObserver onuserinteractionobserver)
    {
        mOnUserInteractionObserver = onuserinteractionobserver;
    }

    public void showPharmacyStoreLocator()
    {
        PresenterFragment presenterfragment;
        Object obj;
        Class class1;
        obj = new Bundle();
        ((Bundle) (obj)).putString("default_filter", "Pharmacy");
        class1 = FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.STORE_FINDER);
        presenterfragment = null;
        PresenterFragment presenterfragment1 = (PresenterFragment)class1.newInstance();
        presenterfragment = presenterfragment1;
_L2:
        if (presenterfragment != null)
        {
            String s = class1.getName();
            presenterfragment.setDynamicArguments(((Bundle) (obj)));
            obj = mFragmentManager.beginTransaction();
            ((FragmentTransaction) (obj)).setCustomAnimations(0x7f05002d, 0x7f05002e, 0x7f050031, 0x7f050032);
            ((FragmentTransaction) (obj)).replace(0x7f100209, presenterfragment, s);
            ((FragmentTransaction) (obj)).addToBackStack(null);
            ((FragmentTransaction) (obj)).commit();
            MessageBus.getBus().post(new ExtraFragmentSwitchedEvent(s, TAG));
        }
        return;
        Exception exception;
        exception;
        WLog.e(TAG, "Failed to create pharmacy store finder fragment", exception);
        if (true) goto _L2; else goto _L1
_L1:
    }

}
