// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.ebay.redlasersdk.BarcodeResult;
import com.ebay.redlasersdk.BarcodeScanActivity;
import com.ebay.redlasersdk.BarcodeTypes;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.CameraSnapshotUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.AddRefillToCartHelper;
import com.walmartlabs.android.pharmacy.PharmacyUtils;
import com.walmartlabs.android.pharmacy.data.PrescriptionInfo;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.main:
//            AppState

public class RedLaserActivity extends BarcodeScanActivity
{

    private static final int DIALOG_PHARMACY_HELP = 0;
    private static final int DIALOG_PHARMACY_INVALID_BARCODE = 1;
    private static final int DIALOG_PHARMACY_INVALID_BARCODE_ACCOUNT = 2;
    public static final String EXTRA_ACTIVITY_RESULT_MODE = "EXTRA_ACTIVITY_RESULT_MODE";
    public static final String EXTRA_MODE = "mode";
    public static final int MODE_DEFAULT = 0;
    public static final int MODE_ERECEIPT = 1;
    public static final int MODE_MOBILE_PAY = 4;
    public static final int MODE_RX_ACCOUNT = 2;
    public static final int MODE_RX_REFILL = 3;
    public static final String RESULT_EXTRA_CODE128 = "code128";
    public static final String RESULT_EXTRA_ENTER_MANUALLY = "enter_manually";
    public static final String RESULT_EXTRA_QRCODE = "qrcode";
    public static final String RESULT_EXTRA_RECEIPT_ID = "receipt_id";
    public static final String RESULT_EXTRA_RX_REFILL = "refill";
    public static final String RESULT_EXTRA_UPC = "upc";
    private static final String TAG = com/walmart/android/app/main/RedLaserActivity.getSimpleName();
    protected boolean mActivityResultMode;
    private BarcodeResult mBarcodeResult;
    private boolean mCaptureImageData;
    private int mEnabledTypesTemp;
    protected boolean mHandleFinish;
    private boolean mIsPlayerPrepared;
    private MediaPlayer mMediaPlayer;
    private int mMode;
    private int mScanAreaIndicatorRes;
    private View mScanAreaIndicatorView;
    private long mScanStartTime;

    public RedLaserActivity()
    {
        mScanAreaIndicatorRes = 0x7f0202ba;
    }

    private void handleFinish()
    {
        Intent intent = new Intent();
        String s;
        if (mBarcodeResult.barcodeType == 16)
        {
            s = "qrcode";
        } else
        if (mBarcodeResult.barcodeType == 32)
        {
            s = "code128";
        } else
        {
            s = "upc";
        }
        intent.putExtra(s, mBarcodeResult.barcodeString);
        setResult(-1, intent);
        finish();
    }

    private MediaPlayer initMediaPlayer()
    {
        AssetFileDescriptor assetfiledescriptor;
        MediaPlayer mediaplayer;
        mediaplayer = null;
        assetfiledescriptor = null;
        AssetFileDescriptor assetfiledescriptor1 = getResources().openRawResourceFd(0x7f080000);
        assetfiledescriptor = assetfiledescriptor1;
_L2:
        if (assetfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        mediaplayer = new MediaPlayer();
        mediaplayer.setDataSource(assetfiledescriptor.getFileDescriptor(), assetfiledescriptor.getStartOffset(), assetfiledescriptor.getLength());
        mediaplayer.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final RedLaserActivity this$0;

            public void onPrepared(MediaPlayer mediaplayer1)
            {
                mIsPlayerPrepared = true;
            }

            
            {
                this$0 = RedLaserActivity.this;
                super();
            }
        });
        assetfiledescriptor.close();
        mediaplayer.prepareAsync();
        return mediaplayer;
        RuntimeException runtimeexception;
        runtimeexception;
        runtimeexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj;
        obj;
_L4:
        ((Exception) (obj)).printStackTrace();
        return mediaplayer;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void initRxCode128(boolean flag)
    {
        mHandleFinish = true;
        enabledTypes.setCode128(true);
        setContentView(0x7f0400f1);
        if (flag)
        {
            findViewById(0x7f100080).setVisibility(0);
            findViewById(0x7f100375).setOnClickListener(new android.view.View.OnClickListener() {

                final RedLaserActivity this$0;

                public void onClick(View view)
                {
                    view = new Intent();
                    view.putExtra("enter_manually", true);
                    setResult(-1, view);
                    finish();
                    postRxScanAnalyticsEvent("manual");
                }

            
            {
                this$0 = RedLaserActivity.this;
                super();
            }
            });
        }
        findViewById(0x7f100374).setOnClickListener(new android.view.View.OnClickListener() {

            final RedLaserActivity this$0;

            public void onClick(View view)
            {
                showScannerDialog(0);
            }

            
            {
                this$0 = RedLaserActivity.this;
                super();
            }
        });
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:Scan"));
    }

    private void setContentViewWithScanAreaDimensions(int i, int j, int k)
    {
        setContentView(i);
        View view = findViewById(0x7f100121);
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        layoutparams.height = getResources().getDimensionPixelSize(j);
        layoutparams.width = getResources().getDimensionPixelSize(k);
        view.setLayoutParams(layoutparams);
    }

    private void updateScanAreaIndicator(boolean flag)
    {
        int i;
        if (mMode == 2 || mMode == 3)
        {
            if (flag)
            {
                i = 0x7f020248;
            } else
            {
                i = 0x7f020247;
            }
        } else
        if (flag)
        {
            i = 0x7f0202b9;
        } else
        {
            i = 0x7f0202ba;
        }
        if (i != mScanAreaIndicatorRes)
        {
            mScanAreaIndicatorView.setBackgroundResource(i);
            mScanAreaIndicatorRes = i;
        }
    }

    protected void disableScanning()
    {
        int i = enabledTypes.getEnabledTypes();
        if (i != 0)
        {
            mEnabledTypesTemp = i;
            enabledTypes.setEnabledTypes(0);
        }
    }

    protected void enableScanning()
    {
        if (enabledTypes.getEnabledTypes() == 0)
        {
            enabledTypes.setEnabledTypes(mEnabledTypesTemp);
        }
    }

    protected int getMode()
    {
        return mMode;
    }

    protected long getScanStartTime()
    {
        return mScanStartTime;
    }

    protected int getScanTime()
    {
        return (int)(System.currentTimeMillis() - mScanStartTime) / 1000;
    }

    protected void handleValidBarcode(BarcodeResult barcoderesult)
    {
        if (mMode == 3)
        {
            barcoderesult = PharmacyUtils.getPrescriptionInfo(barcoderesult.barcodeString);
            com.walmartlabs.android.pharmacy.AddRefillToCartHelper.AddRefillToCartCallback addrefilltocartcallback = new com.walmartlabs.android.pharmacy.AddRefillToCartHelper.AddRefillToCartCallback() {

                final RedLaserActivity this$0;

                public void onCancel()
                {
                    finish();
                }

                public void onCoolDown()
                {
                    finish();
                }

                public void onRefillAdded(Cart cart)
                {
                    cart = new Intent();
                    cart.putExtra("refill", true);
                    setResult(-1, cart);
                    finish();
                }

            
            {
                this$0 = RedLaserActivity.this;
                super();
            }
            };
            (new AddRefillToCartHelper(this, null, ((PrescriptionInfo) (barcoderesult)).rxNumber, ((PrescriptionInfo) (barcoderesult)).storeNumber, addrefilltocartcallback)).addRefillToCart();
            postRxScanAnalyticsEvent("scan");
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyEasyRefillEntryMethod")).putString("entryMethod", "scan"));
            return;
        }
        if (mCaptureImageData)
        {
            mBarcodeResult = barcoderesult;
            enabledTypes.setEnabledTypes(0);
            requestImageData();
            return;
        }
        if (mHandleFinish)
        {
            mBarcodeResult = barcoderesult;
            handleFinish();
            return;
        } else
        {
            doneScanning();
            return;
        }
    }

    protected void init()
    {
        switch (mMode)
        {
        default:
            initDefault();
            return;

        case 2: // '\002'
            initRxCode128(false);
            return;

        case 3: // '\003'
            initRxCode128(true);
            break;
        }
    }

    protected void initDefault()
    {
        enabledTypes.setUpce(true);
        enabledTypes.setEan8(true);
        enabledTypes.setEan13(true);
        enabledTypes.setQRCode(true);
        enabledTypes.setCode39(true);
        setContentView(0x7f040139);
    }

    public void onBackPressed()
    {
        if (mHandleFinish)
        {
            setResult(0);
            finish();
            if (mMode == 3)
            {
                postRxScanAnalyticsEvent("abort");
            }
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        } else
        {
            bundle = getIntent();
            mMode = bundle.getIntExtra("mode", 0);
            mActivityResultMode = bundle.getBooleanExtra("EXTRA_ACTIVITY_RESULT_MODE", false);
            init();
            getWindow().setFlags(1024, 1024);
            mScanAreaIndicatorView = findViewById(0x7f100121);
            return;
        }
    }

    protected Dialog onCreateDialog(int i, Bundle bundle)
    {
        bundle = null;
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 79
    //                   1 115
    //                   2 154;
           goto _L1 _L2 _L3 _L4
_L1:
        Object obj = bundle;
        if (bundle == null)
        {
            obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setTitle(0).setMessage(0).setCancelable(true).setPositiveButton(0x7f090292, null).create();
        }
        ((Dialog) (obj)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final RedLaserActivity this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (!isFinishing())
                {
                    enableScanning();
                }
            }

            
            {
                this$0 = RedLaserActivity.this;
                super();
            }
        });
        return ((Dialog) (obj));
_L2:
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setView(ViewUtil.inflate(this, 0x7f0400df)).setCancelable(true).setPositiveButton(0x7f090292, null).create();
        continue; /* Loop/switch isn't completed */
_L3:
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f090328).setCancelable(false).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final RedLaserActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
            }

            
            {
                this$0 = RedLaserActivity.this;
                super();
            }
        }).create();
        continue; /* Loop/switch isn't completed */
_L4:
        bundle = (new com.walmart.android.ui.CustomAlertDialog.Builder(this)).setMessage(0x7f0902d9).setCancelable(false).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final RedLaserActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                finish();
            }

            
            {
                this$0 = RedLaserActivity.this;
                super();
            }
        }).create();
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onDestroy()
    {
        WLog.d(TAG, "onDestroy()");
        super.onDestroy();
    }

    protected void onPause()
    {
        WLog.i(TAG, "onPause()");
        try
        {
            super.onPause();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            WLog.e(TAG, "onPause(): ", runtimeexception);
        }
    }

    protected void onResume()
    {
        WLog.i(TAG, "onResume()");
        super.onResume();
        if (mMode == 0)
        {
            AnalyticsHelper.post(AnalyticsHelper.prepareScanScreenPageViewEvent());
        }
        setScanStartTime();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    protected void onScanStatusUpdate(Map map)
    {
        if (map.containsKey("CameraSnapshot"))
        {
            map = (byte[])(byte[])map.get("CameraSnapshot");
            (new CameraSnapshotUtil(this)).storeImageData(mBarcodeResult.barcodeString, map);
            handleFinish();
        } else
        {
            map = (Set)map.get("NewFoundBarcodes");
            if (map != null && !map.isEmpty())
            {
                map = (BarcodeResult)map.iterator().next();
                if (mIsPlayerPrepared && mMediaPlayer != null && !mMediaPlayer.isPlaying())
                {
                    mMediaPlayer.start();
                }
                if (validBarcodeResult(map))
                {
                    updateScanAreaIndicator(true);
                    handleValidBarcode(map);
                    return;
                }
            }
        }
    }

    protected void onStart()
    {
        WLog.i(TAG, "onStart()");
        super.onStart();
        if (mMediaPlayer == null)
        {
            mMediaPlayer = initMediaPlayer();
        }
    }

    protected void onStop()
    {
        WLog.i(TAG, "onStop()");
        super.onStop();
        if (mMediaPlayer != null)
        {
            mMediaPlayer.release();
            mMediaPlayer = null;
            mIsPlayerPrepared = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            WLog.e(TAG, "onTouchEvent(): ", motionevent);
            return true;
        }
        return flag;
    }

    protected void postRxScanAnalyticsEvent(String s)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("scannerOpenTimeAndResult")).putString("pharmScanResult", s);
        if (!s.equals("abort"))
        {
            builder.putInt("pharmScanTime", getScanTime());
        }
        MessageBus.getBus().post(builder);
    }

    protected void setScanStartTime()
    {
        mScanStartTime = System.currentTimeMillis();
    }

    protected void showScannerDialog(int i)
    {
        if (!isFinishing())
        {
            disableScanning();
        }
        try
        {
            showDialog(i);
            return;
        }
        catch (Exception exception)
        {
            WLog.e(TAG, "Unable to show dialog.", exception);
        }
    }

    protected void showScannerDialog(int i, Bundle bundle)
    {
        if (!isFinishing())
        {
            disableScanning();
        }
        try
        {
            showDialog(i, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            WLog.e(TAG, "Unable to show dialog.", bundle);
        }
    }

    protected boolean validBarcodeResult(BarcodeResult barcoderesult)
    {
        mMode;
        JVM INSTR tableswitch 2 3: default 28
    //                   2 30
    //                   3 47;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        if (PharmacyUtils.getPrescriptionInfo(barcoderesult.barcodeString) == null)
        {
            showScannerDialog(2);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (PharmacyUtils.getPrescriptionInfo(barcoderesult.barcodeString) == null)
        {
            showScannerDialog(1);
            postRxScanAnalyticsEvent("error");
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }



/*
    static boolean access$002(RedLaserActivity redlaseractivity, boolean flag)
    {
        redlaseractivity.mIsPlayerPrepared = flag;
        return flag;
    }

*/
}
