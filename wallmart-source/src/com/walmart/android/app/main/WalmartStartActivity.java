// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.squareup.otto.Bus;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.StartupAppConfigEvent;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.VersionUtil;
import com.walmart.android.wmservice.DialogActivity;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.ui.FragmentSwitcher;
import com.walmartlabs.ui.PresenterFragment;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            UpgradeActivity, CartActionController

public abstract class WalmartStartActivity extends AppCompatActivity
{

    private static final String TAG = com/walmart/android/app/main/WalmartStartActivity.getSimpleName();
    private String mBackToFragmentTag;
    private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {

        final WalmartStartActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("com.walmart.android.MAINTENANCE"))
            {
                context = new Intent(WalmartStartActivity.this, com/walmart/android/wmservice/DialogActivity);
                context.putExtra("title", getString(0x7f0901d5));
                context.putExtra("msg", getString(0x7f0901d4));
                startActivity(context);
            }
        }

            
            {
                this$0 = WalmartStartActivity.this;
                super();
            }
    };
    protected CartActionController mCartActionController;
    protected FragmentSwitcher mFragmentSwitcher;
    protected final Handler mHandler = new Handler();
    protected SystemBarTintManager mSystemBarTintManager;

    public WalmartStartActivity()
    {
    }

    private void checkNeedsCacheClear(Context context, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        s = SharedPreferencesUtil.getClearCacheUUID(context);
        WLog.d(TAG, "Checking clearClientCache field...");
        if (!s.equals(s1))
        {
            WLog.d(TAG, (new StringBuilder()).append("New clearClientCache UUID found: ").append(s1).toString());
            SharedPreferencesUtil.setClearCacheUUID(context, s1);
            if (!s.equals("not_set"))
            {
                WLog.d(TAG, "Clearing cache...");
                Services.get().getWalmartService().clearCache(new AsyncCallbackOnThread(new Handler()) {

                    final WalmartStartActivity this$0;

                    public void onFailureSameThread(Integer integer, Integer integer1)
                    {
                        WLog.e(WalmartStartActivity.TAG, "Failed to clear cache!");
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (Integer)obj1);
                    }

                    public void onSuccessSameThread(Integer integer)
                    {
                        WLog.e(WalmartStartActivity.TAG, "Cleared cache successfully.");
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((Integer)obj);
                    }

            
            {
                this$0 = WalmartStartActivity.this;
                super(handler);
            }
                });
                return;
            } else
            {
                WLog.d(TAG, "Field was previously not persisted, ignoring.");
                return;
            }
        } else
        {
            WLog.d(TAG, "Found nothing new.");
            return;
        }
    }

    private void checkVersion(AppConfig appconfig)
    {
        Intent intent;
        int i;
        i = VersionUtil.getVersionInfo(this, appconfig);
        switch (i)
        {
        case 1: // '\001'
        default:
            return;

        case 0: // '\0'
        case 2: // '\002'
            intent = new Intent(this, com/walmart/android/app/main/UpgradeActivity);
            break;
        }
        intent.setFlags(0x10000000);
        if (i != 0) goto _L2; else goto _L1
_L1:
        intent.putExtra("extra_unsupported", true);
_L4:
        startActivity(intent);
        return;
_L2:
        if (appconfig.merchData != null)
        {
            intent.putExtra("extra_url", appconfig.merchData.url);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void close()
    {
        super.onBackPressed();
    }

    protected CartActionController createCartActionController()
    {
        return new CartActionController(this);
    }

    protected Class fragmentNameToClass(com.walmart.android.config.FragmentConfig.FragmentName fragmentname)
    {
        return FragmentConfig.getFragmentClass(fragmentname);
    }

    protected PresenterFragment getFragment(Class class1)
        throws Exception
    {
        return (PresenterFragment)class1.newInstance();
    }

    public void onBackPressed()
    {
        if (mBackToFragmentTag == null) goto _L2; else goto _L1
_L1:
        PresenterFragment presenterfragment = mFragmentSwitcher.getTopFragment();
        if (!mFragmentSwitcher.onBackPressed(mBackToFragmentTag)) goto _L4; else goto _L3
_L3:
        if (presenterfragment != null && !presenterfragment.equals(mFragmentSwitcher.getTopFragment()))
        {
            mBackToFragmentTag = null;
        }
_L5:
        return;
_L2:
        if (mFragmentSwitcher.onBackPressed()) goto _L5; else goto _L4
_L4:
        close();
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(null);
        mSystemBarTintManager = new SystemBarTintManager(this);
        mSystemBarTintManager.setStatusBarTintEnabled(true);
        mSystemBarTintManager.setStatusBarTintColor(getResources().getColor(0x7f0f0006));
        mFragmentSwitcher = new FragmentSwitcher(getSupportFragmentManager(), 0x7f100209);
        mFragmentSwitcher.setAnimations(0x7f05000f, 0x7f050011);
        setContentView(0x7f040097);
        bundle = (Toolbar)findViewById(0x7f100207);
        setSupportActionBar(bundle);
        bundle.setBackgroundDrawable(getResources().getDrawable(0x7f02003c));
        getWindow().setBackgroundDrawable(null);
        MessageBus.getBus().register(this);
        mCartActionController = createCartActionController();
        mCartActionController.init();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.clear();
        getMenuInflater().inflate(0x7f120002, menu);
        MenuItemCompat.setActionProvider(menu.findItem(0x7f100690), mCartActionController);
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (mCartActionController != null)
        {
            mCartActionController.destroy();
            mCartActionController = null;
        }
        MessageBus.getBus().unregister(this);
    }

    public void onFirstAppConfig(StartupAppConfigEvent startupappconfigevent)
    {
        if (startupappconfigevent != null && startupappconfigevent.appConfig != null && startupappconfigevent.appConfig.merchData != null)
        {
            com.walmart.android.data.AppConfig.MerchandisingData merchandisingdata = startupappconfigevent.appConfig.merchData;
            checkVersion(startupappconfigevent.appConfig);
            checkNeedsCacheClear(this, merchandisingdata.clearClientCache);
        }
    }

    protected void onPause()
    {
        super.onPause();
        try
        {
            unregisterReceiver(mBroadcastReceiver);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            WLog.e(TAG, "Failed to unregister receiver.", illegalargumentexception);
        }
    }

    protected void onResume()
    {
        super.onResume();
        registerReceiver(mBroadcastReceiver, new IntentFilter("com.walmart.android.MAINTENANCE"));
    }

    protected void switchToFragment(Class class1, Bundle bundle, boolean flag)
    {
        String s = class1.getName();
        PresenterFragment presenterfragment = mFragmentSwitcher.getTopFragment();
        if (flag && presenterfragment != null && !s.equals(presenterfragment.getTag()) && !s.equals(mBackToFragmentTag))
        {
            mBackToFragmentTag = presenterfragment.getTag();
        } else
        {
            mBackToFragmentTag = null;
        }
        if (mFragmentSwitcher.hasFragment(s))
        {
            mFragmentSwitcher.getFragment(s).setDynamicArguments(bundle);
            mFragmentSwitcher.switchToFragment(s, false, false);
            return;
        }
        try
        {
            class1 = getFragment(class1);
            class1.setDynamicArguments(bundle);
            mFragmentSwitcher.addFragment(s, class1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            WLog.e("CaughtException", "Caught exception", class1);
        }
    }


}
