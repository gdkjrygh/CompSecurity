// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ParseException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.squareup.otto.Bus;
import com.walmart.android.app.Debug;
import com.walmart.android.app.WalmartApplication;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.util.facebook.AppLinks;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            OnboardingActivity, HomeActivity, ProductDetailsActivity

public class MainActivity extends Activity
{

    public static final String DELAY = "DELAY";
    private static long SAFEGUARD_SPLASHSCREEN_TIMEOUT = 500L;
    private static final String TAG = com/walmart/android/app/main/MainActivity.getSimpleName();
    private static boolean sIsFirstInstance = true;
    private long mDelay;
    private Handler mHandler;
    private boolean mIsResumed;
    private Intent mNextActivity;
    private Runnable mSafeguardSplashscreenTimeout;

    public MainActivity()
    {
        mHandler = new Handler();
        mSafeguardSplashscreenTimeout = new Runnable() {

            final MainActivity this$0;

            public void run()
            {
                moveToNextActivity();
                WLog.e(MainActivity.TAG, "Using safeguard timeout for splash screen", new Exception((new StringBuilder()).append("Splashscreen timeout: resumed:").append(mIsResumed).append(" hasFocus:").append(hasWindowFocus()).toString()));
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        };
    }

    private long adjustDelayForColdStart(long l)
    {
        long l1 = l;
        if (sIsFirstInstance)
        {
            WalmartApplication walmartapplication = (WalmartApplication)getApplicationContext();
            l1 = Math.max(0L, l - (System.currentTimeMillis() - walmartapplication.getCreationTime()));
            sIsFirstInstance = false;
        }
        return l1;
    }

    private Uri getReferrerCompatible()
    {
        Object obj;
        Object obj1;
        obj = getIntent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj1 = (Uri)((Intent) (obj)).getParcelableExtra("android.intent.extra.REFERRER");
        if (obj1 != null)
        {
            return ((Uri) (obj1));
        }
        obj1 = ((Intent) (obj)).getStringExtra("android.intent.extra.REFERRER_NAME");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj1 = Uri.parse(((String) (obj1)));
        return ((Uri) (obj1));
        ParseException parseexception1;
        parseexception1;
        obj = ((Intent) (obj)).getStringExtra("com.android.browser.application_id");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = Uri.parse(((String) (obj)));
        return ((Uri) (obj));
        ParseException parseexception;
        parseexception;
        return null;
    }

    private void moveToNextActivity()
    {
        if (!isFinishing())
        {
            startActivity(mNextActivity);
            finish();
            overridePendingTransition(0x7f05000f, 0x7f050011);
        }
    }

    private void setNextActivityBasedOnAppUpgrade()
    {
        if (SharedPreferencesUtil.shouldShowOnboarding(this, 1))
        {
            mNextActivity = new Intent(this, com/walmart/android/app/main/OnboardingActivity);
            return;
        } else
        {
            mNextActivity = new Intent(this, com/walmart/android/app/main/HomeActivity);
            return;
        }
    }

    private void setupSplashScreenTimeout(boolean flag)
    {
label0:
        {
            if (flag && mIsResumed)
            {
                mHandler.removeCallbacks(mSafeguardSplashscreenTimeout);
                if (mDelay <= 0L)
                {
                    break label0;
                }
                mHandler.postDelayed(new Runnable() {

                    final MainActivity this$0;

                    public void run()
                    {
                        moveToNextActivity();
                    }

            
            {
                this$0 = MainActivity.this;
                super();
            }
                }, mDelay);
            }
            return;
        }
        moveToNextActivity();
    }

    public Uri getReferrer()
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            return super.getReferrer();
        } else
        {
            return getReferrerCompatible();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag;
        super.onCreate(bundle);
        Debug.logIntent(TAG, "onCreate", getIntent());
        if (!getResources().getBoolean(0x7f0c0003))
        {
            setRequestedOrientation(1);
        }
        flag = false;
        bundle = getPackageManager().getActivityInfo(getComponentName(), 128);
        int i = ((flag) ? 1 : 0);
        Uri uri;
        try
        {
            if (((ActivityInfo) (bundle)).metaData != null)
            {
                i = ((ActivityInfo) (bundle)).metaData.getInt("DELAY");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.wtf(TAG, "Failed to get activity info", bundle);
            i = ((flag) ? 1 : 0);
        }
        mDelay = adjustDelayForColdStart(i);
        mHandler.postDelayed(mSafeguardSplashscreenTimeout, (long)i + SAFEGUARD_SPLASHSCREEN_TIMEOUT);
        uri = AppLinks.getTargetUrlFromInboundIntent(getIntent());
        if (getIntent() != null && ("android.intent.action.VIEW".equals(getIntent().getAction()) || uri != null))
        {
            if (uri != null)
            {
                bundle = uri;
            } else
            {
                bundle = getIntent().getData();
            }
            sendReferralEvent(bundle);
            bundle = WalmartUri.parse(bundle);
            if (bundle != null && bundle.getType() == 7)
            {
                mNextActivity = new Intent(this, com/walmart/android/app/main/ProductDetailsActivity);
            } else
            {
                mNextActivity = new Intent(this, com/walmart/android/app/main/HomeActivity);
            }
        } else
        {
            setNextActivityBasedOnAppUpgrade();
        }
        if (getIntent() != null)
        {
            mNextActivity.fillIn(getIntent(), 0);
            if (uri != null)
            {
                mNextActivity.setData(uri);
            }
            mNextActivity.setFlags(mNextActivity.getFlags() & 0xffdfffff);
        }
        return;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        Debug.logIntent(TAG, "onNewIntent", getIntent());
    }

    protected void onPause()
    {
        super.onPause();
        mIsResumed = false;
    }

    protected void onResume()
    {
        super.onResume();
        mIsResumed = true;
        WLog.d(TAG, (new StringBuilder()).append("onResume -> resumed:").append(mIsResumed).append(" hasFocus:").append(hasWindowFocus()).toString());
        setupSplashScreenTimeout(hasWindowFocus());
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        WLog.d(TAG, (new StringBuilder()).append("onWindowFocusChanged -> resumed:").append(mIsResumed).append(" hasFocus:").append(flag).toString());
        setupSplashScreenTimeout(flag);
    }

    protected void sendReferralEvent(Uri uri)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("referralSource");
        if (uri != null)
        {
            builder.putString("refDestinationFull", uri.toString());
        }
        uri = getReferrer();
        if (uri != null)
        {
            builder.putString("refSourceFull", uri.toString());
        }
        MessageBus.getBus().post(builder);
    }




}
