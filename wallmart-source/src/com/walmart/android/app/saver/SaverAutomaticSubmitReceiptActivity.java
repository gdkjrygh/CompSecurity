// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Window;
import android.widget.Toast;
import com.squareup.otto.Bus;
import com.walmart.android.app.main.AppState;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.service.saver.StatusResponse;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.utils.NetworkConnectivityHelper;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverSubmitReceiptActivity, SaverReceiptActivity

public class SaverAutomaticSubmitReceiptActivity extends Activity
{
    private class EReceiptCallback extends SaverSubmitReceipt.EReceiptCallback
    {

        final SaverAutomaticSubmitReceiptActivity this$0;

        protected void dismissDialog(int i)
        {
            SaverAutomaticSubmitReceiptActivity.this.dismissDialog(i);
        }

        protected boolean isTop()
        {
            return SaverAutomaticSubmitReceiptActivity.this.isTop();
        }

        protected void onNotFoundFailure()
        {
            AppConfig appconfig = AppConfigManager.get().getAppConfig();
            if (appconfig == null || !appconfig.allowSaverWithoutEReceipt)
            {
                showDialog(1002);
                return;
            } else
            {
                checkAndSubmitToSaver();
                return;
            }
        }

        protected void onReceipt(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
        {
            mRuid = receipt.uuid;
            if (receipt.store != null)
            {
                mStoreId = receipt.store.id;
            }
        }

        protected void showDialog(int i)
        {
            SaverAutomaticSubmitReceiptActivity.this.showDialog(i);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            SaverAutomaticSubmitReceiptActivity.this.showDialog(i, bundle);
        }

        public EReceiptCallback(Handler handler)
        {
            this$0 = SaverAutomaticSubmitReceiptActivity.this;
            super(handler);
        }
    }

    private class SaverCallback extends SaverSubmitReceipt.SaverCallback
    {

        final SaverAutomaticSubmitReceiptActivity this$0;

        protected void dismissDialog(int i)
        {
            SaverAutomaticSubmitReceiptActivity.this.dismissDialog(i);
        }

        protected boolean isEReceipt()
        {
            return mRuid != null;
        }

        protected boolean isTop()
        {
            return SaverAutomaticSubmitReceiptActivity.this.isTop();
        }

        public void onSuccessSameThread(StatusResponse statusresponse)
        {
            Toast.makeText(SaverAutomaticSubmitReceiptActivity.this, 0x7f090537, 0).show();
            if (isTop())
            {
                dismissDialog(1001);
                onShowCompetitors(mRuid, mTcNbr, mLocalDate, mStoreId, false);
            }
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((StatusResponse)obj);
        }

        protected void showDialog(int i)
        {
            SaverAutomaticSubmitReceiptActivity.this.showDialog(i);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            SaverAutomaticSubmitReceiptActivity.this.showDialog(i, bundle);
        }

        public SaverCallback(Handler handler)
        {
            this$0 = SaverAutomaticSubmitReceiptActivity.this;
            super(handler);
        }
    }


    private static final int DIALOG_ALREADY_SUBMITTED = 1005;
    private static final int DIALOG_NO_CONNECTION = 102;
    private static final int DIALOG_PLEASE_SIGN_IN = 101;
    private static final int DIALOG_PROGRESS = 1001;
    private static final int DIALOG_SAVER_NOT_ELIGIBLE = 1004;
    private static final int DIALOG_TC_NOT_VALID = 1002;
    private static final int DIALOG_UNKNOWN_ERROR = 1003;
    private static final int DIALOG_WEEKLY_LIMIT = 1006;
    public static final String EXTRA_ACTIVITY_RESULT_MODE = "EXTRA_ACTIVITY_RESULT_MODE";
    public static final String EXTRA_LOCAL_DATE = "LOCAL_DATE";
    public static final String EXTRA_SOURCE = "SOURCE";
    public static final String EXTRA_TC_NBR = "TC_NBR";
    private static final int REQUEST_CODE_SIGN_IN = 1;
    public static final int RESULT_CLOSE = 10;
    public static final int RESULT_SCAN_ANOTHER = 12;
    public static final int RESULT_SHOW_BANNER = 13;
    public static final int RESULT_SHOW_RECEIPT = 11;
    private static final String TAG = com/walmart/android/app/saver/SaverAutomaticSubmitReceiptActivity.getSimpleName();
    private final Handler mHandler = new Handler();
    private String mLocalDate;
    private boolean mOnTop;
    private String mRuid;
    private String mSource;
    private boolean mStarted;
    private String mStoreId;
    private String mTcNbr;

    public SaverAutomaticSubmitReceiptActivity()
    {
    }

    private void checkAndSubmit()
    {
        if (!NetworkConnectivityHelper.isConnected(this))
        {
            showDialog(102);
            return;
        } else
        {
            showDialog(1001);
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final SaverAutomaticSubmitReceiptActivity this$0;

                public void onFailure(int i)
                {
                    if (isTop())
                    {
                        dismissDialog(1001);
                        startSignIn();
                    }
                }

                public void onSuccess()
                {
                    submit();
                }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
            });
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("tcNumber")).putString("number", mTcNbr));
            return;
        }
    }

    private void checkAndSubmitToSaver()
    {
        if (!NetworkConnectivityHelper.isConnected(this))
        {
            showDialog(102);
            return;
        } else
        {
            showDialog(1001);
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final SaverAutomaticSubmitReceiptActivity this$0;

                public void onFailure(int i)
                {
                    if (isTop())
                    {
                        dismissDialog(1001);
                        startSignIn();
                    }
                }

                public void onSuccess()
                {
                    SaverManager.get().addReceiptToSaverByTc(mTcNbr, mLocalDate, mSource, new SaverCallback(mHandler));
                }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
            });
            return;
        }
    }

    private boolean isTop()
    {
        return mOnTop;
    }

    private void startSignIn()
    {
        startActivityForResult(SaverUtils.createSignInIntent(this), 1);
        overridePendingTransition(0x7f05002c, 0x7f050033);
    }

    private void submit()
    {
        SaverManager.get().getReceiptByTc(mTcNbr, mLocalDate, new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onResult(SaverReceipt saverreceipt)
            {
                if (saverreceipt != null)
                {
                    mRuid = saverreceipt.uuid;
                    if (saverreceipt.store != null)
                    {
                        mStoreId = saverreceipt.store.id;
                    }
                    if (saverreceipt.hasSummary)
                    {
                        if (isTop())
                        {
                            onShowReceipt(mRuid, mTcNbr, mLocalDate, mStoreId, true);
                        }
                        return;
                    } else
                    {
                        SaverManager.get().addReceiptToSaver(saverreceipt, mSource, new SaverCallback(mHandler));
                        return;
                    }
                } else
                {
                    SaverManager.get().retrieveReceiptByTc(mTcNbr, mLocalDate, mSource, new EReceiptCallback(mHandler), new SaverCallback(mHandler));
                    return;
                }
            }

            public volatile void onResult(Object obj)
            {
                onResult((SaverReceipt)obj);
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        });
    }

    protected void handleIntent(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getExtras();
        } else
        {
            intent = null;
        }
        if (intent != null)
        {
            mTcNbr = intent.getString("TC_NBR");
            mLocalDate = intent.getString("LOCAL_DATE");
            mSource = intent.getString("SOURCE");
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (i == 1)
            {
                if (j == 1)
                {
                    break label0;
                }
                showDialog(101);
            }
            return;
        }
        showDialog(1001);
        submit();
    }

    protected void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate()");
        super.onCreate(bundle);
        setResult(0);
        getWindow().setBackgroundDrawable(null);
        AppState.rerouteOnAppStart(this);
        handleIntent(getIntent());
    }

    protected Dialog onCreateDialog(int i, Bundle bundle)
    {
        String s;
        Object obj = null;
        s = obj;
        if (bundle != null)
        {
            s = obj;
            if (bundle.containsKey("DIALOG_ARG_MESSAGE"))
            {
                s = bundle.getString("DIALOG_ARG_MESSAGE");
            }
        }
        i;
        JVM INSTR lookupswitch 8: default 108
    //                   101: 135
    //                   102: 477
    //                   1001: 116
    //                   1002: 188
    //                   1003: 243
    //                   1004: 353
    //                   1005: 415
    //                   1006: 298;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        break MISSING_BLOCK_LABEL_477;
_L1:
        bundle = null;
_L10:
        if (bundle != null)
        {
            return bundle;
        } else
        {
            return super.onCreateDialog(i);
        }
_L4:
        bundle = CustomProgressDialog.create(this);
        bundle.setMessage(getString(0x7f0900cc));
          goto _L10
_L2:
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090534).setPositiveButton(0x7f090535, new android.content.DialogInterface.OnClickListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                startSignIn();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        }).setNegativeButton(0x7f090536, new android.content.DialogInterface.OnClickListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", com.walmart.android.util.TextUtils.truncate("Error Handling - Deny to Sign In", 60));
                MessageBus.getBus().post(dialoginterface);
                onForceClose();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        }).setCancelable(false).create();
          goto _L10
_L5:
        bundle = s;
        if (TextUtils.isEmpty(s))
        {
            bundle = getString(0x7f090532);
        }
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(bundle).setNeutralButton(0x7f090292, null).create();
        bundle.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                onForceClose();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        });
          goto _L10
_L6:
        bundle = s;
        if (TextUtils.isEmpty(s))
        {
            bundle = getString(0x7f0904a8);
        }
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(bundle).setNeutralButton(0x7f090292, null).create();
        bundle.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                onForceClose();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        });
          goto _L10
_L9:
        bundle = s;
        if (TextUtils.isEmpty(s))
        {
            bundle = getString(0x7f090533);
        }
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(bundle).setNeutralButton(0x7f090292, null).create();
        bundle.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                onForceClose();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        });
          goto _L10
_L7:
        bundle = s;
        if (TextUtils.isEmpty(s))
        {
            bundle = getString(0x7f09052f);
        }
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(bundle).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                onShowReceipt(null, null, null, null, false);
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        }).create();
        bundle.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                onForceClose();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        });
          goto _L10
_L8:
        bundle = s;
        if (TextUtils.isEmpty(s))
        {
            bundle = getString(0x7f09052e);
        }
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(bundle).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                onShowReceipt(mRuid, mTcNbr, mLocalDate, mStoreId, true);
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        }).create();
        bundle.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                onForceClose();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        });
          goto _L10
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090282).setNeutralButton(0x7f090292, null).create();
        bundle.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final SaverAutomaticSubmitReceiptActivity this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                onForceClose();
            }

            
            {
                this$0 = SaverAutomaticSubmitReceiptActivity.this;
                super();
            }
        });
          goto _L10
    }

    protected void onDestroy()
    {
        WLog.v(TAG, "onDestroy()");
        super.onDestroy();
    }

    void onForceClose()
    {
        setResult(10);
        finish();
    }

    public void onNewIntent(Intent intent)
    {
        WLog.v(TAG, "onNewIntent()");
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    protected void onPause()
    {
        WLog.v(TAG, "onPause()");
        super.onPause();
        mOnTop = false;
    }

    protected void onResume()
    {
        WLog.v(TAG, "onResume()");
        super.onResume();
        if (!mStarted)
        {
            checkAndSubmit();
            mStarted = true;
        }
        mOnTop = true;
    }

    void onShowCompetitors(String s, String s1, String s2, String s3, boolean flag)
    {
        Intent intent = new Intent(this, com/walmart/android/app/saver/SaverSubmitReceiptActivity);
        intent.addFlags(0x2000000);
        intent.putExtra("EXTRA_RECEIPT_SUBMITTED", true);
        intent.putExtra("EXTRA_RECEIPT_ID", s);
        intent.putExtra("EXTRA_STORE_ID", s3);
        intent.putExtra("EXTRA_TC_NUMBER", s1);
        intent.putExtra("EXTRA_DATE", s2);
        intent.putExtra("EXTRA_FROM_SCANNER", flag);
        startActivity(intent);
        finish();
    }

    void onShowReceipt(String s, String s1, String s2, String s3, boolean flag)
    {
        Intent intent = new Intent(this, com/walmart/android/app/saver/SaverReceiptActivity);
        intent.addFlags(0x20000);
        intent.putExtra("EXTRA_RECEIPT_ID", s);
        intent.putExtra("EXTRA_STORE_ID", s3);
        intent.putExtra("EXTRA_TC_NUMBER", s1);
        intent.putExtra("EXTRA_DATE", s2);
        intent.putExtra("EXTRA_FROM_SCANNER", flag);
        startActivity(intent);
        finish();
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





/*
    static String access$102(SaverAutomaticSubmitReceiptActivity saverautomaticsubmitreceiptactivity, String s)
    {
        saverautomaticsubmitreceiptactivity.mRuid = s;
        return s;
    }

*/





/*
    static String access$402(SaverAutomaticSubmitReceiptActivity saverautomaticsubmitreceiptactivity, String s)
    {
        saverautomaticsubmitreceiptactivity.mStoreId = s;
        return s;
    }

*/





}
