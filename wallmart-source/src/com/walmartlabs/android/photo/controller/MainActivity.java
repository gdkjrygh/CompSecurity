// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.walmartlabs.android.photo.service.order.OrderService;
import com.walmartlabs.android.photo.util.BitmapCache;
import com.walmartlabs.android.photo.util.DeviceUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoSettings;
import com.walmartlabs.android.photo.util.analytics.AnalyticsHelper;
import com.walmartlabs.android.photo.util.integration.IntegrationLoader;
import com.walmartlabs.android.photo.view.SystemBarTintHelper;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            NotAvailableFragment, AlbumFragment, OrderActivity, LearnMoreActivity, 
//            EditConfigurationFragment

public class MainActivity extends AppCompatActivity
{

    public static final String EXTRA_INTEGRATION_PROVIDER_CLASS = (new StringBuilder()).append(com/walmartlabs/android/photo/controller/MainActivity.getName()).append(".INTEGRATION_PROVIDER_CLASS").toString();
    private static final int REQUEST_CODE_LAUNCH = 6000;
    private static final String TAG = com/walmartlabs/android/photo/controller/MainActivity.getSimpleName();
    private boolean mGoingHome;

    public MainActivity()
    {
    }

    public static void close(Activity activity)
    {
        activity.finishActivity(6000);
    }

    public static void launch(Activity activity, String s)
    {
        Intent intent = new Intent(activity, com/walmartlabs/android/photo/controller/MainActivity);
        intent.setFlags(0x20000);
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_INTEGRATION_PROVIDER_CLASS, s);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 6000);
        activity.overridePendingTransition(0x10a0000, 0x10a0001);
        AnalyticsHelper.post(AnalyticsHelper.prepareStartedPhotoEvent());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("onActivityResult(").append(i).append(", ").append(j).append(", ").append(intent).append(")").toString());
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getStringExtra(EXTRA_INTEGRATION_PROVIDER_CLASS);
        if (!TextUtils.isEmpty(bundle))
        {
            IntegrationLoader.get().setIntegrationProviderClass(bundle);
        }
        if (OrderService.isProcessingOrder())
        {
            break MISSING_BLOCK_LABEL_271;
        }
        setContentView(com.walmartlabs.android.photo.R.layout.photo_activity_main);
        setSupportActionBar((Toolbar)findViewById(com.walmartlabs.android.photo.R.id.toolbar));
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        SystemBarTintHelper.enableTint(this);
        if (PhotoSettings.get(this).photoEnabled()) goto _L2; else goto _L1
_L1:
        if (getSupportFragmentManager().findFragmentById(com.walmartlabs.android.photo.R.id.content_frame) == null)
        {
            getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.photo.R.id.content_frame, new NotAvailableFragment(), com/walmartlabs/android/photo/controller/NotAvailableFragment.getName()).commit();
        }
_L4:
        return;
_L2:
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Screen width (dp): ").append(DeviceUtils.getScreenWidthDips(this)).toString());
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Screen height (dp): ").append(DeviceUtils.getScreenHeightDips(this)).toString());
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Density multiplier: ").append(DeviceUtils.getDensityMultiplier(this)).toString());
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        if (getSupportFragmentManager().findFragmentById(com.walmartlabs.android.photo.R.id.content_frame) != null) goto _L4; else goto _L3
_L3:
        getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.photo.R.id.content_frame, AlbumFragment.newInstance(), com/walmartlabs/android/photo/controller/AlbumFragment.getName()).commit();
        return;
        startActivity(new Intent(this, com/walmartlabs/android/photo/controller/OrderActivity));
        finish();
        return;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.walmartlabs.android.photo.R.menu.photo_options_menu, menu);
        return true;
    }

    public void onDestroy()
    {
        super.onDestroy();
        BitmapCache.get().evictAll();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentById(com.walmartlabs.android.photo.R.id.content_frame);
            if (fragment != null && (fragment instanceof AlbumFragment))
            {
                mGoingHome = true;
            }
        }
        return super.onKeyDown(i, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.walmartlabs.android.photo.R.id.faq)
        {
            startActivity(new Intent(this, com/walmartlabs/android/photo/controller/LearnMoreActivity));
        } else
        if (menuitem.getItemId() == 0x102002c)
        {
            menuitem = getSupportFragmentManager().findFragmentById(com.walmartlabs.android.photo.R.id.content_frame);
            if (menuitem != null && (menuitem instanceof EditConfigurationFragment))
            {
                getSupportFragmentManager().popBackStack();
                return true;
            } else
            {
                mGoingHome = true;
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void onPause()
    {
        super.onPause();
        if (mGoingHome)
        {
            mGoingHome = false;
            overridePendingTransition(0x10a0000, 0x10a0001);
        }
    }

}
