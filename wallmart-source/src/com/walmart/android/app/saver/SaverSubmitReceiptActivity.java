// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.ereceipt.EReceiptNotificationUtils;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNotificationUtils, SaverNearbyCompetitorsPresenter, SaverManualReceiptPresenter, SaverGettingResultsPresenter

public class SaverSubmitReceiptActivity extends FullScreenActivity
{
    private class ManualReceiptCallbacks
        implements SaverManualReceiptPresenter.ActionCallbacks
    {

        final SaverSubmitReceiptActivity this$0;

        public void onForceClose()
        {
            setResult(10);
            finish();
        }

        public void onReceiptInfoEntered(String s, String s1)
        {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_TC_NUMBER", s);
            intent.putExtra("EXTRA_DATE", s1);
            setResult(-1, intent);
            finish();
        }

        public void onShowCompetitors(String s, String s1, String s2, String s3, boolean flag)
        {
            setResult(-1);
            getPresenterStack().pushAndReplacePresenter(new SaverNearbyCompetitorsPresenter(SaverSubmitReceiptActivity.this, s, s3, s1, s2, flag, new NearbyCompetitorsCallback()), true);
        }

        public void onShowReceipt(String s, String s1, String s2, String s3, boolean flag)
        {
            Intent intent = new Intent();
            intent.addFlags(0x20000);
            intent.putExtra("EXTRA_RECEIPT_ID", s);
            intent.putExtra("EXTRA_STORE_ID", s3);
            intent.putExtra("EXTRA_TC_NUMBER", s1);
            intent.putExtra("EXTRA_DATE", s2);
            intent.putExtra("EXTRA_FROM_SCANNER", true);
            setResult(11, intent);
            finish();
        }

        private ManualReceiptCallbacks()
        {
            this$0 = SaverSubmitReceiptActivity.this;
            super();
        }

    }

    private class NearbyCompetitorsCallback
        implements SaverNearbyCompetitorsPresenter.ActionCallbacks
    {

        final SaverSubmitReceiptActivity this$0;

        public void onForceClose()
        {
            setResult(10);
            finish();
        }

        public void onGettingResults()
        {
            getPresenterStack().pushPresenter(new SaverGettingResultsPresenter(), true);
        }

        public void onScanAnother()
        {
            setResult(12);
            finish();
        }

        public void onShowMerchandise(String s)
        {
            NavigationItemUtils.launchFromUri(SaverSubmitReceiptActivity.this, s);
            setResult(13);
            finish();
        }

        public void onShowReceipt(String s, String s1, String s2, String s3, boolean flag)
        {
            Intent intent = new Intent();
            intent.addFlags(0x20000);
            intent.putExtra("EXTRA_RECEIPT_ID", s);
            intent.putExtra("EXTRA_STORE_ID", s3);
            intent.putExtra("EXTRA_DATE", s2);
            intent.putExtra("EXTRA_FROM_SCANNER", true);
            intent.putExtra("EXTRA_TC_NUMBER", s1);
            setResult(11, intent);
            finish();
        }

        private NearbyCompetitorsCallback()
        {
            this$0 = SaverSubmitReceiptActivity.this;
            super();
        }

    }


    public static final String EXTRA_ACTIVITY_RESULT_MODE = "EXTRA_ACTIVITY_RESULT_MODE";
    public static final String EXTRA_RECEIPT_SUBMITTED = "EXTRA_RECEIPT_SUBMITTED";
    public static final String EXTRA_SCAN_START = "EXTRA_SCAN_START";
    public static final String EXTRA_TC_NBR = "TC_NBR";
    public static final int RESULT_CLOSE = 10;
    public static final int RESULT_SCAN_ANOTHER = 12;
    public static final int RESULT_SHOW_BANNER = 13;
    public static final int RESULT_SHOW_RECEIPT = 11;
    private static final String TAG = com/walmart/android/app/saver/SaverSubmitReceiptActivity.getSimpleName();

    public SaverSubmitReceiptActivity()
    {
    }

    private String getOrigin(Intent intent)
    {
        if (intent != null && intent.hasExtra("origin"))
        {
            return intent.getStringExtra("origin");
        } else
        {
            return "origin_saver";
        }
    }

    protected void handleIntent(Intent intent)
    {
        Object obj;
        if (intent != null)
        {
            obj = intent.getExtras();
        } else
        {
            obj = null;
        }
        getPresenterStack().popToRoot();
        if (obj != null && ((Bundle) (obj)).containsKey("EXTRA_RECEIPT_SUBMITTED"))
        {
            intent = EReceiptNotificationUtils.getEReceiptId(((Bundle) (obj)));
            String s = EReceiptNotificationUtils.getStoreId(((Bundle) (obj)));
            boolean flag = EReceiptNotificationUtils.isFromScanner(((Bundle) (obj)));
            String s2 = SaverNotificationUtils.getReceiptId(((Bundle) (obj)));
            obj = SaverNotificationUtils.getLocalDate(((Bundle) (obj)));
            getPresenterStack().pushPresenter(new SaverNearbyCompetitorsPresenter(this, intent, s, s2, ((String) (obj)), flag, new NearbyCompetitorsCallback()), false);
            setResult(-1);
            return;
        }
        boolean flag2 = intent.getBooleanExtra("EXTRA_ACTIVITY_RESULT_MODE", false);
        String s1;
        long l;
        boolean flag1;
        if (obj != null)
        {
            s1 = ((Bundle) (obj)).getString("TC_NBR");
        } else
        {
            s1 = null;
        }
        if (obj != null)
        {
            l = ((Bundle) (obj)).getLong("EXTRA_SCAN_START", 0L);
        } else
        {
            l = 0L;
        }
        intent = getOrigin(intent);
        obj = getPresenterStack();
        if (s1 == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((PresenterStack) (obj)).pushPresenter(new SaverManualReceiptPresenter(this, flag1, s1, l, new ManualReceiptCallbacks(), flag2, intent), false);
    }

    protected void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate()");
        super.onCreate(bundle);
        setResult(0);
        AppState.rerouteOnAppStart(this);
        handleIntent(getIntent());
    }

    protected void onDestroy()
    {
        WLog.v(TAG, "onDestroy()");
        super.onDestroy();
    }

    public void onNewIntent(Intent intent)
    {
        WLog.v(TAG, "onNewIntent()");
        super.onNewIntent(intent);
        handleIntent(intent);
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

    protected void onPause()
    {
        WLog.v(TAG, "onPause()");
        super.onPause();
    }

    public void onPresenterStackUpdatedEvent(PresenterStackUpdatedEvent presenterstackupdatedevent)
    {
        getSupportActionBar().setTitle(presenterstackupdatedevent.onTop.getTitleText());
        supportInvalidateOptionsMenu();
    }

    protected void onResume()
    {
        WLog.v(TAG, "onResume()");
        super.onResume();
    }

    protected void onStart()
    {
        WLog.v(TAG, "onStart()");
        super.onStart();
    }

    protected void onStop()
    {
        WLog.v(TAG, "onStop()");
        super.onStop();
    }



}
