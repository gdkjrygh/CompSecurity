// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.ebay.redlasersdk.BarcodeResult;
import com.ebay.redlasersdk.BarcodeTypes;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.main.RedLaserActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.service.saver.StatusResponse;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.TextUtils;
import com.walmart.android.utils.NetworkConnectivityHelper;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ereceipt.EReceiptUtils;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverSubmitReceiptActivity, SaverReceiptActivity

public class SaverScannerActivity extends RedLaserActivity
{
    private class EReceiptCallback extends SaverSubmitReceipt.EReceiptCallback
    {

        final SaverScannerActivity this$0;

        protected void dismissDialog(int i)
        {
            SaverScannerActivity.this.dismissDialog(i);
        }

        protected boolean isTop()
        {
            return !isFinishing();
        }

        protected void onNotFoundFailure()
        {
            showScannerDialog(1002);
            trackError("Error Handling - Scan Entry Not Recognized");
        }

        protected void onReceipt(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
        {
            mRuid = receipt.uuid;
            if (receipt.store != null)
            {
                mStoreId = receipt.store.id;
            }
            if (!android.text.TextUtils.isEmpty(receipt.tcNumber))
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("tcNumber")).putString("number", receipt.tcNumber));
            }
        }

        protected void showDialog(int i)
        {
            showScannerDialog(i);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            showScannerDialog(i, bundle);
        }

        public EReceiptCallback(Handler handler)
        {
            this$0 = SaverScannerActivity.this;
            super(handler);
        }
    }

    private class SaverCallback extends SaverSubmitReceipt.SaverCallback
    {

        final SaverScannerActivity this$0;

        protected void dismissDialog(int i)
        {
            SaverScannerActivity.this.dismissDialog(i);
        }

        protected boolean isEReceipt()
        {
            return mRuid != null;
        }

        protected boolean isTop()
        {
            return !isFinishing();
        }

        public void onSuccessSameThread(StatusResponse statusresponse)
        {
            Toast.makeText(SaverScannerActivity.this, 0x7f090537, 0).show();
            if (!isFinishing())
            {
                dismissDialog(1001);
                statusresponse = new Intent(SaverScannerActivity.this, com/walmart/android/app/saver/SaverSubmitReceiptActivity);
                statusresponse.addFlags(0x2000000);
                statusresponse.putExtra("EXTRA_RECEIPT_SUBMITTED", true);
                statusresponse.putExtra("EXTRA_RECEIPT_ID", mRuid);
                statusresponse.putExtra("EXTRA_STORE_ID", mStoreId);
                statusresponse.putExtra("EXTRA_FROM_SCANNER", true);
                startActivity(statusresponse);
                doneScanning();
            }
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((StatusResponse)obj);
        }

        protected void showDialog(int i)
        {
            showScannerDialog(i);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            showScannerDialog(i, bundle);
        }

        public SaverCallback(Handler handler)
        {
            this$0 = SaverScannerActivity.this;
            super(handler);
        }
    }

    private class ScanTimeoutHandler extends Handler
    {

        public static final int MSG_SCAN_TIMEOUT = 1;
        public static final int SCAN_TIMEOUT_MILLIS = 20000;
        final SaverScannerActivity this$0;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                showScannerDialog(112);
                break;
            }
        }

        private ScanTimeoutHandler()
        {
            this$0 = SaverScannerActivity.this;
            super();
        }

    }


    private static final int DIALOG_ALREADY_SUBMITTED = 1005;
    private static final int DIALOG_NOT_VALID = 101;
    private static final int DIALOG_NO_CONNECTION = 104;
    private static final int DIALOG_PLEASE_SIGN_IN = 103;
    private static final int DIALOG_PROGRESS = 1001;
    private static final int DIALOG_QR_INFO = 102;
    private static final int DIALOG_SAVER_NOT_ELIGIBLE = 1004;
    private static final int DIALOG_SCAN_TIMEOUT = 112;
    private static final int DIALOG_TC_NOT_VALID = 1002;
    private static final int DIALOG_UNKNOWN_ERROR = 1003;
    private static final int DIALOG_WEEKLY_LIMIT = 1006;
    public static final String EXTRA_ORIGIN = "origin";
    public static final String EXTRA_ORIGIN_SAVER = "origin_saver";
    public static final String EXTRA_ORIGIN_WISHLIST = "origin_list";
    private static final int REQUEST_CODE_SIGN_IN = 2;
    private static final int REQUEST_SUBMIT_RECEIPT = 1;
    public static final int RESULT_SCAN_ANOTHER = 12;
    public static final int RESULT_SHOW_RECEIPT = 11;
    private static final String STATE_HAS_SCANNED = "STATE_HAS_SCANNED";
    private static final String STATE_PENDING_BARCODE_RESULT = "STATE_PENDING_BARCODE_RESULT";
    private static final String TAG = com/walmart/android/app/saver/SaverScannerActivity.getSimpleName();
    private Handler mHandler;
    private boolean mHasScanned;
    private BarcodeResult mPendingBarcodeResult;
    private String mRuid;
    private String mStoreId;

    public SaverScannerActivity()
    {
        mHandler = new ScanTimeoutHandler();
    }

    private String createComparableReceiptId(String s)
    {
        Object obj = s;
        if (!s.contains("-"))
        {
            obj = s;
            if (s.length() == 32)
            {
                obj = new StringBuilder(s.substring(0, 8));
                ((StringBuilder) (obj)).append('-').append(s.substring(8, 12)).append('-').append(s.substring(12, 16)).append('-').append(s.substring(16, 20)).append('-').append(s.substring(20, 32));
                obj = ((StringBuilder) (obj)).toString();
            }
        }
        return ((String) (obj));
    }

    private String getOrigin()
    {
        if (getIntent().hasExtra("origin"))
        {
            return getIntent().getStringExtra("origin");
        } else
        {
            return "origin_saver";
        }
    }

    private void handleCode39(String s)
    {
        if (!isFinishing())
        {
            Intent intent = new Intent(this, com/walmart/android/app/saver/SaverSubmitReceiptActivity);
            intent.putExtra("EXTRA_ACTIVITY_RESULT_MODE", mActivityResultMode);
            intent.addFlags(0x2000000);
            intent.putExtra("TC_NBR", s);
            startActivity(intent);
            if (!mActivityResultMode)
            {
                dismissDialog(1001);
            }
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("tcNumber")).putString("number", s));
            doneScanning();
        }
    }

    private void handleQRCode(final String ruid)
    {
        final Handler handler = new Handler();
        SharedPreferencesUtil.setSaverReceiptScanned(this, true);
        String s = createComparableReceiptId(ruid);
        SaverManager.get().getReceipt(s, new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverScannerActivity this$0;
            final Handler val$handler;
            final String val$ruid;

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
                        if (!isFinishing())
                        {
                            startReceiptDetails();
                            finish();
                        }
                        return;
                    } else
                    {
                        SaverManager.get().addReceiptToSaver(saverreceipt, "qr-scan", new SaverCallback(handler));
                        return;
                    }
                } else
                {
                    SaverManager.get().retrieveReceipt(ruid, "qr-scan", new EReceiptCallback(handler), new SaverCallback(handler));
                    return;
                }
            }

            public volatile void onResult(Object obj)
            {
                onResult((SaverReceipt)obj);
            }

            
            {
                this$0 = SaverScannerActivity.this;
                handler = handler1;
                ruid = s;
                super();
            }
        });
    }

    private void postPageViewEvent()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder;
        String s;
        byte byte0;
        builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Receipt - Scan");
        s = getOrigin();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 56
    //                   1729708567: 104
    //                   2087586876: 118;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 76
    //                   0 132;
           goto _L4 _L5
_L4:
        builder.putString("section", "Saver - Receipt").putString("subCategory", "Receipt");
_L6:
        MessageBus.getBus().post(builder);
        return;
_L2:
        if (s.equals("origin_list"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("origin_saver"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        builder.putString("section", "lists").putString("subCategory", "lists");
          goto _L6
    }

    private void postScanAnalyticsEvent(String s)
    {
        postScanAnalyticsEvent(s, "none");
    }

    private void postScanAnalyticsEvent(String s, String s1)
    {
        if (getMode() == 1)
        {
            s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("saverScannerOpenTimeAndResult")).putString("scanResult", s).putInt("time", getScanTime()).putString("error", TextUtils.truncate(s1, 60));
            MessageBus.getBus().post(s);
        }
    }

    private void startReceiptDetails()
    {
        Intent intent = new Intent(this, com/walmart/android/app/saver/SaverReceiptActivity);
        intent.addFlags(0x20000);
        intent.putExtra("EXTRA_RECEIPT_ID", mRuid);
        intent.putExtra("EXTRA_STORE_ID", mStoreId);
        intent.putExtra("EXTRA_FROM_SCANNER", true);
        startActivity(intent);
    }

    private void startSignIn()
    {
        startActivityForResult(SaverUtils.createSignInIntent(this), 2);
        overridePendingTransition(0x7f05002c, 0x7f050033);
    }

    protected void handleValidBarcode(BarcodeResult barcoderesult)
    {
        mPendingBarcodeResult = barcoderesult;
        int i = barcoderesult.barcodeType;
        if (i == 16)
        {
            final String ruid = EReceiptUtils.getUuid(barcoderesult.barcodeString);
            if (!android.text.TextUtils.isEmpty(ruid))
            {
                if (mActivityResultMode)
                {
                    barcoderesult = new Intent();
                    barcoderesult.putExtra("receipt_id", ruid);
                    setResult(-1, barcoderesult);
                    finish();
                }
                showScannerDialog(1001);
                Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                    final SaverScannerActivity this$0;
                    final String val$ruid;

                    public void onFailure(int j)
                    {
                        if (!isFinishing())
                        {
                            dismissDialog(1001);
                            startSignIn();
                        }
                    }

                    public void onSuccess()
                    {
                        handleQRCode(ruid);
                        postScanAnalyticsEvent("qrscan");
                    }

            
            {
                this$0 = SaverScannerActivity.this;
                ruid = s;
                super();
            }
                });
                return;
            } else
            {
                super.handleValidBarcode(barcoderesult);
                return;
            }
        }
        if (i == 64)
        {
            final String tcNbr = SaverUtils.barcodeToTc(barcoderesult.barcodeString);
            if (!android.text.TextUtils.isEmpty(tcNbr))
            {
                if (mActivityResultMode)
                {
                    handleCode39(tcNbr);
                    return;
                } else
                {
                    showScannerDialog(1001);
                    Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                        final SaverScannerActivity this$0;
                        final String val$tcNbr;

                        public void onFailure(int j)
                        {
                            if (!isFinishing())
                            {
                                dismissDialog(1001);
                                startSignIn();
                            }
                        }

                        public void onSuccess()
                        {
                            handleCode39(tcNbr);
                            postScanAnalyticsEvent("tcscan");
                        }

            
            {
                this$0 = SaverScannerActivity.this;
                tcNbr = s;
                super();
            }
                    });
                    return;
                }
            } else
            {
                super.handleValidBarcode(barcoderesult);
                return;
            }
        } else
        {
            super.handleValidBarcode(barcoderesult);
            return;
        }
    }

    protected void init()
    {
        if (getMode() == 1)
        {
            mHandleFinish = true;
            enabledTypes.setQRCode(true);
            enabledTypes.setCode39(true);
            setContentView(0x7f04017b);
            findViewById(0x7f100122).setOnClickListener(new android.view.View.OnClickListener() {

                final SaverScannerActivity this$0;

                public void onClick(View view)
                {
                    showScannerDialog(102);
                }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
            });
            findViewById(0x7f10051c).setOnClickListener(new android.view.View.OnClickListener() );
            return;
        } else
        {
            init();
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onActivityResult, req ").append(i).append(", res ").append(j).toString());
        onActivityResult(i, j, intent);
        if (i == 1 && j != 0)
        {
            setResult(j, intent);
            finish();
        } else
        if (i == 2)
        {
            if (j != 1)
            {
                showScannerDialog(103);
                return;
            } else
            {
                handleValidBarcode(mPendingBarcodeResult);
                return;
            }
        }
    }

    public void onBackPressed()
    {
        postScanAnalyticsEvent("abort");
        onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        if (bundle != null)
        {
            mPendingBarcodeResult = (BarcodeResult)bundle.getParcelable("STATE_PENDING_BARCODE_RESULT");
            mHasScanned = bundle.getBoolean("STATE_HAS_SCANNED", false);
        }
    }

    protected Dialog onCreateDialog(int i, Bundle bundle)
    {
        Object obj;
        Object obj1 = null;
        obj = obj1;
        if (bundle != null)
        {
            obj = obj1;
            if (bundle.containsKey("DIALOG_ARG_MESSAGE"))
            {
                obj = bundle.getString("DIALOG_ARG_MESSAGE");
            }
        }
        i;
        JVM INSTR lookupswitch 11: default 132
    //                   101: 152
    //                   102: 191
    //                   103: 248
    //                   104: 548
    //                   112: 583
    //                   1001: 229
    //                   1002: 301
    //                   1003: 336
    //                   1004: 442
    //                   1005: 495
    //                   1006: 389;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L6:
        break MISSING_BLOCK_LABEL_583;
_L1:
        obj = null;
_L13:
        if (obj != null)
        {
            ((Dialog) (obj)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final SaverScannerActivity this$0;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    if (!isFinishing())
                    {
                        enableScanning();
                    }
                }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
            });
            return ((Dialog) (obj));
        } else
        {
            return super.onCreateDialog(i, bundle);
        }
_L2:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090530).setCancelable(true).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).create();
          goto _L13
_L3:
        obj = ViewUtil.inflate(this, 0x7f04017a);
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setView(((View) (obj))).setCancelable(true).setPositiveButton(0x7f090292, null).create();
          goto _L13
_L7:
        obj = CustomProgressDialog.create(this);
        ((ProgressDialog) (obj)).setMessage(getString(0x7f0900cc));
          goto _L13
_L4:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090534).setPositiveButton(0x7f090535, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                startSignIn();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).setNegativeButton(0x7f090536, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
                postScanAnalyticsEvent("abort");
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", TextUtils.truncate("Error Handling - Deny to Sign In", 60));
                MessageBus.getBus().post(dialoginterface);
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).setCancelable(false).create();
          goto _L13
_L8:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090532).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).create();
          goto _L13
_L9:
        Object obj2 = obj;
        if (android.text.TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj2 = getString(0x7f0904a8);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(((CharSequence) (obj2))).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).create();
          goto _L13
_L12:
        Object obj3 = obj;
        if (android.text.TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj3 = getString(0x7f090533);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(((CharSequence) (obj3))).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).create();
          goto _L13
_L10:
        Object obj4 = obj;
        if (android.text.TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj4 = getString(0x7f09052f);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(((CharSequence) (obj4))).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface = new Intent(SaverScannerActivity.this, com/walmart/android/app/saver/SaverReceiptActivity);
                dialoginterface.addFlags(0x20000);
                startActivity(dialoginterface);
                setResult(-1);
                finish();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).create();
          goto _L13
_L11:
        Object obj5 = obj;
        if (android.text.TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj5 = getString(0x7f09052e);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(((CharSequence) (obj5))).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                startReceiptDetails();
                finish();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).create();
          goto _L13
_L5:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090282).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverScannerActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
            }

            
            {
                this$0 = SaverScannerActivity.this;
                super();
            }
        }).create();
          goto _L13
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090538).setNeutralButton(0x7f090292, null).create();
          goto _L13
    }

    protected void onPause()
    {
        super.onPause();
        mHandler.removeMessages(1);
    }

    protected void onPrepareDialog(int i, Dialog dialog, Bundle bundle)
    {
        super.onPrepareDialog(i, dialog, bundle);
        final boolean hasTimeoutMessage = mHandler.hasMessages(1);
        if (hasTimeoutMessage)
        {
            mHandler.removeMessages(1);
        }
        if (i == 102)
        {
            dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final SaverScannerActivity this$0;
                final boolean val$hasTimeoutMessage;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    if (!isFinishing())
                    {
                        enableScanning();
                        if (getMode() == 1 && hasTimeoutMessage)
                        {
                            mHandler.sendMessageDelayed(mHandler.obtainMessage(1), 20000L);
                        }
                    }
                }

            
            {
                this$0 = SaverScannerActivity.this;
                hasTimeoutMessage = flag;
                super();
            }
            });
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (getMode() == 1)
        {
            postPageViewEvent();
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1), 20000L);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("STATE_PENDING_BARCODE_RESULT", mPendingBarcodeResult);
        bundle.putBoolean("STATE_HAS_SCANNED", mHasScanned);
    }

    protected boolean validBarcodeResult(BarcodeResult barcoderesult)
    {
        if (mHasScanned)
        {
            return false;
        }
        GoogleAnalytics.trackEvent("Scan", "Scan Performed", barcoderesult.barcodeString);
        int i = barcoderesult.barcodeType;
        if (i == 16)
        {
            if (!android.text.TextUtils.isEmpty(EReceiptUtils.getUuid(barcoderesult.barcodeString)))
            {
                if (!NetworkConnectivityHelper.isConnected(this))
                {
                    showScannerDialog(104);
                    return false;
                } else
                {
                    mHasScanned = true;
                    return true;
                }
            }
            if (getMode() == 1)
            {
                showScannerDialog(101);
                postScanAnalyticsEvent("error", getString(0x7f090530));
                mHasScanned = true;
                return false;
            } else
            {
                return super.validBarcodeResult(barcoderesult);
            }
        }
        if (i == 64)
        {
            Log.i(TAG, (new StringBuilder()).append("Type CODE39. Barcode String: ").append(barcoderesult.barcodeString).toString());
            mHasScanned = true;
            if (android.text.TextUtils.isEmpty(SaverUtils.barcodeToTc(barcoderesult.barcodeString)))
            {
                Log.e(TAG, "Failed to convert barcode to TC");
                showScannerDialog(101);
                postScanAnalyticsEvent("error", getString(0x7f090530));
                return false;
            }
            if (!NetworkConnectivityHelper.isConnected(this))
            {
                showScannerDialog(104);
                return false;
            } else
            {
                return true;
            }
        } else
        {
            return super.validBarcodeResult(barcoderesult);
        }
    }





/*
    static String access$1002(SaverScannerActivity saverscanneractivity, String s)
    {
        saverscanneractivity.mStoreId = s;
        return s;
    }

*/






















/*
    static String access$902(SaverScannerActivity saverscanneractivity, String s)
    {
        saverscanneractivity.mRuid = s;
        return s;
    }

*/
}
