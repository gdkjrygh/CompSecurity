// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.view.ActionProvider;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.ebay.redlasersdk.BarcodeResult;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ShopSearchEvent;
import com.walmart.android.app.qr.QRProductPageActivity;
import com.walmart.android.app.saver.SaverScannerActivity;
import com.walmart.android.app.shop.search.ShopSearchData;
import com.walmart.android.events.BarcodeActionClickedEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.ScannerUtil;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.utils.UrlUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ereceipt.EReceiptUtils;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

public class BarcodeActionController extends ActionProvider
{

    public static final int REQUEST_CODE_BARCODE_SCAN = 1001;
    private static final String TAG = com/walmart/android/app/main/BarcodeActionController.getSimpleName();
    private Activity mActivity;
    private boolean mHasAutoFocus;

    public BarcodeActionController(Activity activity)
    {
        super(activity);
        mActivity = activity;
        mHasAutoFocus = mActivity.getPackageManager().hasSystemFeature("android.hardware.camera.autofocus");
    }

    private void handleQrCode(String s)
    {
        if (UrlUtils.isHttpUrl(s)) goto _L2; else goto _L1
_L1:
        s = WalmartUri.parse(s);
        if (s == null || s.getType() != 26) goto _L4; else goto _L3
_L3:
        MobilePayManager.get().setManuallyEnabled(true);
        if (MobilePayManager.get().isMobilePayAvailable())
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.MOBILE_PAY, null));
        }
_L6:
        return;
_L4:
        (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setTitle(0x7f09046b).setMessage(0x7f09046a).setNegativeButton(0x7f090292, null).show();
        return;
_L2:
        if (EReceiptUtils.getUuid(s) == null)
        {
            GoogleAnalytics.trackEvent("Scan", "QR", s);
            Intent intent = new Intent(mActivity, com/walmart/android/app/qr/QRProductPageActivity);
            intent.putExtra("extra_url", s);
            mActivity.startActivity(intent);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isAvailable()
    {
        return ScannerUtil.scannerAvailable(mActivity);
    }

    public View onCreateActionView()
    {
        View view = ViewUtil.inflate(getContext(), 0x7f040029);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final BarcodeActionController this$0;

            public void onClick(View view1)
            {
                startScanner(true);
                MessageBus.getBus().post(new BarcodeActionClickedEvent());
            }

            
            {
                this$0 = BarcodeActionController.this;
                super();
            }
        });
        return view;
    }

    public void onScanResult(int i, Intent intent)
    {
        if (i != -1 || intent == null) goto _L2; else goto _L1
_L1:
        intent = intent.getParcelableArrayListExtra("com.ebay.redlasersdk.results");
        Object obj;
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder;
        if (intent != null && !intent.isEmpty())
        {
            obj = (BarcodeResult)intent.get(0);
        } else
        {
            obj = null;
        }
        if (obj != null && ((BarcodeResult) (obj)).barcodeString != null)
        {
            intent = ((BarcodeResult) (obj)).barcodeString;
        } else
        {
            intent = "";
        }
        if (obj != null)
        {
            i = ((BarcodeResult) (obj)).barcodeType;
        } else
        {
            i = 0;
        }
        if (obj != null)
        {
            obj = ((BarcodeResult) (obj)).getBarcodeType();
        } else
        {
            obj = "";
        }
        WLog.d(TAG, (new StringBuilder()).append("BARCODE: ").append(intent).append(" (").append(((String) (obj))).append(")").toString());
        if (i == 0 || TextUtils.isEmpty(intent)) goto _L4; else goto _L3
_L3:
        builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("barcodeQRScan")).putString("scanType", ((String) (obj))).putString("scanCode", intent);
        MessageBus.getBus().post(builder);
        if (i != 16) goto _L6; else goto _L5
_L5:
        handleQrCode(intent);
_L10:
        GoogleAnalytics.trackEvent("Scan", "Scan Performed", ((String) (obj)));
_L4:
        return;
_L6:
        boolean flag;
        flag = false;
        i = ((flag) ? 1 : 0);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (!intent.startsWith("http:") && !intent.startsWith("https:"))
        {
            i = ((flag) ? 1 : 0);
            if (!intent.startsWith("www."))
            {
                break MISSING_BLOCK_LABEL_267;
            }
        }
        Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(intent));
        mActivity.startActivity(intent1);
        i = 1;
_L7:
        if (i == 0)
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, (new ShopSearchData(intent, 2)).toBundle()));
            MessageBus.getBus().post(new ShopSearchEvent(intent, "Barcode"));
        }
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        Log.w(TAG, (new StringBuilder()).append("failed to view '").append(intent).append("' in browser").toString());
        i = ((flag) ? 1 : 0);
        if (true) goto _L7; else goto _L2
_L2:
        if (i == 12)
        {
            startScanner(false);
            return;
        }
        if (i != 11) goto _L4; else goto _L8
_L8:
        Bus bus = MessageBus.getBus();
        com.walmart.android.config.FragmentConfig.FragmentName fragmentname = com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD;
        if (intent != null)
        {
            intent = intent.getExtras();
        } else
        {
            intent = null;
        }
        bus.post(new SwitchFragmentEvent(fragmentname, intent));
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void startScanner(boolean flag)
    {
        startScanner(flag, false);
    }

    public void startScanner(boolean flag, final boolean startSaverScanner)
    {
        if (flag && !mHasAutoFocus && !SharedPreferencesUtil.hasShownNoAutofocusDialog(mActivity))
        {
            (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setIcon(0x1080027).setTitle(0x7f090085).setMessage(0x7f090084).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

                final BarcodeActionController this$0;
                final boolean val$startSaverScanner;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    startScanner(false, startSaverScanner);
                }

            
            {
                this$0 = BarcodeActionController.this;
                startSaverScanner = flag;
                super();
            }
            }).setCancelable(false).show();
            SharedPreferencesUtil.setHasShownNoAutoFocusDialog(mActivity);
            return;
        }
        Intent intent = new Intent(mActivity, com/walmart/android/app/saver/SaverScannerActivity);
        intent.addFlags(0x20000);
        if (startSaverScanner)
        {
            intent.putExtra("mode", 1);
        }
        mActivity.startActivityForResult(intent, 1001);
        GoogleAnalytics.trackEvent("Scan", "Scan Screen", "");
    }

}
