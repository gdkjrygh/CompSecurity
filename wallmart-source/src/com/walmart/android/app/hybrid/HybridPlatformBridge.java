// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.widget.DatePicker;
import com.ebay.redlasersdk.BarcodeResult;
import com.walmart.android.app.main.ActivityResultRouter;
import com.walmart.android.app.main.BarcodeActionController;
import com.walmart.android.app.saver.SaverScannerActivity;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebDialog

public class HybridPlatformBridge
    implements JSBridgeAdapter.HybridPlatformInterface
{
    private static class BarcodeInfo
    {

        public String barcode;
        public String type;

        private BarcodeInfo()
        {
        }

    }

    private static class MultipleChoiceOnClickListener
        implements android.content.DialogInterface.OnClickListener
    {

        private final String mAction;
        private final JSBridgeAdapter.BridgeCallback mCallback;
        private final boolean mCheckedItems[];

        private static ArrayList getIntegerList(boolean aflag[])
        {
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < aflag.length; i++)
            {
                if (aflag[i])
                {
                    arraylist.add(Integer.valueOf(i));
                }
            }

            return arraylist;
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = new JSBridgeAdapter.DialogResponse(mAction);
            dialoginterface.selectedItems = getIntegerList(mCheckedItems);
            mCallback.respond(dialoginterface);
        }

        public MultipleChoiceOnClickListener(JSBridgeAdapter.BridgeCallback bridgecallback, boolean aflag[], String s)
        {
            mCallback = bridgecallback;
            mCheckedItems = aflag;
            mAction = s;
        }
    }


    public static final int REQUEST_CODE_BARCODE_SCAN = 1500;
    public static final int REQUEST_CODE_RECEIPT_SCAN = 1501;
    private static final String TAG = com/walmart/android/app/hybrid/HybridPlatformBridge.getSimpleName();
    private Activity mContext;
    private ProgressDialog mProgressDialog;
    private WebView mWebView;

    public HybridPlatformBridge(Activity activity, WebView webview)
    {
        mContext = activity;
        mWebView = webview;
    }

    private BarcodeInfo getInfoFromIntent(Intent intent)
    {
        String s = null;
        BarcodeInfo barcodeinfo = new BarcodeInfo();
        if (intent != null && intent.hasExtra("com.ebay.redlasersdk.results"))
        {
            ArrayList arraylist = intent.getParcelableArrayListExtra("com.ebay.redlasersdk.results");
            intent = s;
            if (arraylist != null)
            {
                intent = s;
                if (!arraylist.isEmpty())
                {
                    intent = (BarcodeResult)arraylist.get(0);
                }
            }
            if (intent != null && ((BarcodeResult) (intent)).barcodeString != null)
            {
                s = ((BarcodeResult) (intent)).barcodeString;
            } else
            {
                s = "";
            }
            barcodeinfo.barcode = s;
            if (intent != null)
            {
                intent = intent.getBarcodeType();
            } else
            {
                intent = "";
            }
            barcodeinfo.type = intent;
        }
        return barcodeinfo;
    }

    private static void sendDialogCallback(AtomicInteger atomicinteger, JSBridgeAdapter.BridgeCallback bridgecallback, String s)
    {
        int i;
        if (atomicinteger == null)
        {
            i = -1;
        } else
        {
            i = atomicinteger.get();
        }
        bridgecallback.respond(new JSBridgeAdapter.DialogResponse(s, i));
    }

    private static void setCancelButton(JSBridgeAdapter.DialogData dialogdata, JSBridgeAdapter.BridgeCallback bridgecallback, com.walmart.android.ui.CustomAlertDialog.Builder builder, AtomicInteger atomicinteger)
    {
        if (!TextUtils.isEmpty(dialogdata.cancelButton))
        {
            builder.setNegativeButton(dialogdata.cancelButton, new android.content.DialogInterface.OnClickListener(atomicinteger, bridgecallback) {

                final JSBridgeAdapter.BridgeCallback val$callback;
                final AtomicInteger val$selectedItem;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    HybridPlatformBridge.sendDialogCallback(selectedItem, callback, "cancel");
                }

            
            {
                selectedItem = atomicinteger;
                callback = bridgecallback;
                super();
            }
            });
        }
    }

    private static com.walmart.android.ui.CustomAlertDialog.Builder setMessage(JSBridgeAdapter.DialogData dialogdata, com.walmart.android.ui.CustomAlertDialog.Builder builder)
    {
        if (!TextUtils.isEmpty(dialogdata.message))
        {
            builder.setMessage(dialogdata.message);
        }
        return builder;
    }

    private static void setNeutralButton(JSBridgeAdapter.DialogData dialogdata, JSBridgeAdapter.BridgeCallback bridgecallback, com.walmart.android.ui.CustomAlertDialog.Builder builder, AtomicInteger atomicinteger)
    {
        if (!TextUtils.isEmpty(dialogdata.neutralButton))
        {
            builder.setNeutralButton(dialogdata.neutralButton, new android.content.DialogInterface.OnClickListener(atomicinteger, bridgecallback) {

                final JSBridgeAdapter.BridgeCallback val$callback;
                final AtomicInteger val$selectedItem;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    HybridPlatformBridge.sendDialogCallback(selectedItem, callback, "neutral");
                }

            
            {
                selectedItem = atomicinteger;
                callback = bridgecallback;
                super();
            }
            });
        }
    }

    private static void setOkButton(JSBridgeAdapter.DialogData dialogdata, JSBridgeAdapter.BridgeCallback bridgecallback, com.walmart.android.ui.CustomAlertDialog.Builder builder, AtomicInteger atomicinteger)
    {
        if (!TextUtils.isEmpty(dialogdata.okButton))
        {
            builder.setPositiveButton(dialogdata.okButton, new android.content.DialogInterface.OnClickListener(atomicinteger, bridgecallback) {

                final JSBridgeAdapter.BridgeCallback val$callback;
                final AtomicInteger val$selectedItem;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    HybridPlatformBridge.sendDialogCallback(selectedItem, callback, "ok");
                }

            
            {
                selectedItem = atomicinteger;
                callback = bridgecallback;
                super();
            }
            });
        }
    }

    private static com.walmart.android.ui.CustomAlertDialog.Builder setTitle(JSBridgeAdapter.DialogData dialogdata, com.walmart.android.ui.CustomAlertDialog.Builder builder)
    {
        if (!TextUtils.isEmpty(dialogdata.title))
        {
            builder.setTitle(dialogdata.title);
        }
        return builder;
    }

    private void showDialog(com.walmart.android.ui.CustomAlertDialog.Builder builder)
    {
        builder = builder.create();
        builder.setCanceledOnTouchOutside(false);
        builder.show();
    }

    public void onAlertDialog(JSBridgeAdapter.DialogData dialogdata, final JSBridgeAdapter.BridgeCallback callback)
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mContext);
        setTitle(dialogdata, builder);
        setMessage(dialogdata, builder);
        setOkButton(dialogdata, callback, builder, null);
        setCancelButton(dialogdata, callback, builder, null);
        setNeutralButton(dialogdata, callback, builder, null);
        builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final HybridPlatformBridge this$0;
            final JSBridgeAdapter.BridgeCallback val$callback;

            public void onCancel(DialogInterface dialoginterface)
            {
                HybridPlatformBridge.sendDialogCallback(null, callback, "cancel");
            }

            
            {
                this$0 = HybridPlatformBridge.this;
                callback = bridgecallback;
                super();
            }
        });
        showDialog(builder);
    }

    public void onDateDialog(JSBridgeAdapter.DatePickerDialogData datepickerdialogdata, final JSBridgeAdapter.BridgeCallback bridgeCallback)
    {
        android.app.DatePickerDialog.OnDateSetListener ondatesetlistener = new android.app.DatePickerDialog.OnDateSetListener() {

            final HybridPlatformBridge this$0;
            final JSBridgeAdapter.BridgeCallback val$bridgeCallback;

            public void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
                datepicker = new JSBridgeAdapter.DatePickerDialogResponse();
                datepicker.year = i;
                datepicker.month = j;
                datepicker.day = k;
                datepicker.action = "ok";
                bridgeCallback.respond(datepicker);
            }

            
            {
                this$0 = HybridPlatformBridge.this;
                bridgeCallback = bridgecallback;
                super();
            }
        };
        datepickerdialogdata = new DatePickerDialog(mContext, ondatesetlistener, datepickerdialogdata.year, datepickerdialogdata.month, datepickerdialogdata.day);
        datepickerdialogdata.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final HybridPlatformBridge this$0;
            final JSBridgeAdapter.BridgeCallback val$bridgeCallback;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface = new JSBridgeAdapter.DatePickerDialogResponse();
                dialoginterface.action = "cancel";
                bridgeCallback.respond(dialoginterface);
            }

            
            {
                this$0 = HybridPlatformBridge.this;
                bridgeCallback = bridgecallback;
                super();
            }
        });
        datepickerdialogdata.setCanceledOnTouchOutside(false);
        datepickerdialogdata.show();
    }

    public void onHideLoadingIndicator()
    {
        if (mProgressDialog != null)
        {
            mProgressDialog.dismiss();
            mProgressDialog = null;
        }
    }

    public void onListDialog(JSBridgeAdapter.DialogData dialogdata, final JSBridgeAdapter.BridgeCallback callback)
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mContext);
        setTitle(dialogdata, builder);
        if (dialogdata.items != null && dialogdata.items.length > 0)
        {
            builder.setItems(dialogdata.items, new android.content.DialogInterface.OnClickListener() {

                final HybridPlatformBridge this$0;
                final JSBridgeAdapter.BridgeCallback val$callback;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = new JSBridgeAdapter.DialogResponse("ok", i);
                    callback.respond(dialoginterface);
                }

            
            {
                this$0 = HybridPlatformBridge.this;
                callback = bridgecallback;
                super();
            }
            });
        }
        setOkButton(dialogdata, callback, builder, null);
        setCancelButton(dialogdata, callback, builder, null);
        setNeutralButton(dialogdata, callback, builder, null);
        builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final HybridPlatformBridge this$0;
            final JSBridgeAdapter.BridgeCallback val$callback;

            public void onCancel(DialogInterface dialoginterface)
            {
                HybridPlatformBridge.sendDialogCallback(null, callback, "cancel");
            }

            
            {
                this$0 = HybridPlatformBridge.this;
                callback = bridgecallback;
                super();
            }
        });
        showDialog(builder);
    }

    public void onMultipleChoiceDialog(JSBridgeAdapter.DialogData dialogdata, final JSBridgeAdapter.BridgeCallback callback)
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mContext);
        setTitle(dialogdata, builder);
        if (dialogdata.items != null && dialogdata.items.length > 0)
        {
            final boolean checkedItems[] = new boolean[dialogdata.items.length];
            if (dialogdata.selectedItems != null)
            {
                for (int i = 0; i < dialogdata.selectedItems.size(); i++)
                {
                    int j = ((Integer)dialogdata.selectedItems.get(i)).intValue();
                    if (j < checkedItems.length)
                    {
                        checkedItems[j] = true;
                    }
                }

            }
            builder.setMultiChoiceItems(dialogdata.items, checkedItems, new android.content.DialogInterface.OnMultiChoiceClickListener() {

                final HybridPlatformBridge this$0;
                final boolean val$checkedItems[];

                public void onClick(DialogInterface dialoginterface, int k, boolean flag)
                {
                    checkedItems[k] = flag;
                }

            
            {
                this$0 = HybridPlatformBridge.this;
                checkedItems = aflag;
                super();
            }
            });
            if (!TextUtils.isEmpty(dialogdata.okButton))
            {
                builder.setPositiveButton(dialogdata.okButton, new MultipleChoiceOnClickListener(callback, checkedItems, "ok"));
            }
            if (!TextUtils.isEmpty(dialogdata.cancelButton))
            {
                builder.setNegativeButton(dialogdata.cancelButton, new MultipleChoiceOnClickListener(callback, checkedItems, "cancel"));
            }
            if (!TextUtils.isEmpty(dialogdata.neutralButton))
            {
                builder.setNeutralButton(dialogdata.neutralButton, new MultipleChoiceOnClickListener(callback, checkedItems, "neutral"));
            }
            builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final HybridPlatformBridge this$0;
                final JSBridgeAdapter.BridgeCallback val$callback;
                final boolean val$checkedItems[];

                public void onCancel(DialogInterface dialoginterface)
                {
                    (new MultipleChoiceOnClickListener(callback, checkedItems, "cancel")).onClick(null, -1);
                }

            
            {
                this$0 = HybridPlatformBridge.this;
                callback = bridgecallback;
                checkedItems = aflag;
                super();
            }
            });
            showDialog(builder);
        }
    }

    public void onRadioDialog(final JSBridgeAdapter.DialogData data, final JSBridgeAdapter.BridgeCallback callback)
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mContext);
        setTitle(data, builder);
        final AtomicInteger selectedItem = new AtomicInteger(data.selectedItem);
        if (data.items != null && data.items.length > 0)
        {
            builder.setSingleChoiceItems(data.items, data.selectedItem, new android.content.DialogInterface.OnClickListener() {

                final HybridPlatformBridge this$0;
                final JSBridgeAdapter.BridgeCallback val$callback;
                final JSBridgeAdapter.DialogData val$data;
                final AtomicInteger val$selectedItem;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    selectedItem.set(i);
                    if (TextUtils.isEmpty(data.okButton))
                    {
                        JSBridgeAdapter.DialogResponse dialogresponse = new JSBridgeAdapter.DialogResponse("ok", i);
                        callback.respond(dialogresponse);
                        dialoginterface.dismiss();
                    }
                }

            
            {
                this$0 = HybridPlatformBridge.this;
                selectedItem = atomicinteger;
                data = dialogdata;
                callback = bridgecallback;
                super();
            }
            });
        }
        setOkButton(data, callback, builder, selectedItem);
        setCancelButton(data, callback, builder, selectedItem);
        setNeutralButton(data, callback, builder, selectedItem);
        builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final HybridPlatformBridge this$0;
            final JSBridgeAdapter.BridgeCallback val$callback;
            final AtomicInteger val$selectedItem;

            public void onCancel(DialogInterface dialoginterface)
            {
                HybridPlatformBridge.sendDialogCallback(selectedItem, callback, "cancel");
            }

            
            {
                this$0 = HybridPlatformBridge.this;
                selectedItem = atomicinteger;
                callback = bridgecallback;
                super();
            }
        });
        showDialog(builder);
    }

    public void onScanItem(JSBridgeAdapter.ScanItemData scanitemdata, final JSBridgeAdapter.BridgeCallback callback)
    {
        scanitemdata = new Intent(mContext, com/walmart/android/app/saver/SaverScannerActivity);
        scanitemdata.addFlags(0x20000);
        callback = new com.walmart.android.app.main.ActivityResultRouter.ActivityResultCallback() {

            final HybridPlatformBridge this$0;
            final JSBridgeAdapter.BridgeCallback val$callback;

            public void onActivityResult(int i, int j, Intent intent)
            {
                JSBridgeAdapter.ScanItemResponse scanitemresponse = new JSBridgeAdapter.ScanItemResponse();
                if (j == 0)
                {
                    Log.i(HybridPlatformBridge.TAG, "Scan canceled!");
                    scanitemresponse.action = "cancel";
                    return;
                }
                intent = getInfoFromIntent(intent);
                Log.i(HybridPlatformBridge.TAG, (new StringBuilder()).append("BarcodeTypeString: ").append(((BarcodeInfo) (intent)).type).toString());
                Log.i(HybridPlatformBridge.TAG, (new StringBuilder()).append("Barcode: ").append(((BarcodeInfo) (intent)).barcode).toString());
                if (!TextUtils.isEmpty(((BarcodeInfo) (intent)).barcode))
                {
                    scanitemresponse.action = "ok";
                    scanitemresponse.code = ((BarcodeInfo) (intent)).barcode;
                } else
                {
                    scanitemresponse.action = "cancel";
                }
                callback.respond(scanitemresponse);
            }

            
            {
                this$0 = HybridPlatformBridge.this;
                callback = bridgecallback;
                super();
            }
        };
        ActivityResultRouter.getInstance(mContext).startActivityForResult(scanitemdata, 1500, callback);
    }

    public void onScanReceipt(JSBridgeAdapter.ScanReceiptData scanreceiptdata, final JSBridgeAdapter.BridgeCallback callback)
    {
        scanreceiptdata = new Intent(mContext, com/walmart/android/app/saver/SaverScannerActivity);
        scanreceiptdata.putExtra("mode", 1);
        scanreceiptdata.putExtra("EXTRA_ACTIVITY_RESULT_MODE", true);
        callback = new com.walmart.android.app.main.ActivityResultRouter.ActivityResultCallback() {

            final HybridPlatformBridge this$0;
            final JSBridgeAdapter.BridgeCallback val$callback;

            public void onActivityResult(int i, int j, Intent intent)
            {
                JSBridgeAdapter.ScanReceiptResponse scanreceiptresponse = new JSBridgeAdapter.ScanReceiptResponse();
                if (j != 0) goto _L2; else goto _L1
_L1:
                Log.i(HybridPlatformBridge.TAG, "RESULT_CANCELED");
                scanreceiptresponse.action = "cancel";
_L4:
                callback.respond(scanreceiptresponse);
                return;
_L2:
                if (j == -1)
                {
                    Log.i(HybridPlatformBridge.TAG, "RESULT_OK");
                    if (intent != null)
                    {
                        String s = intent.getStringExtra("receipt_id");
                        String s1 = intent.getStringExtra("EXTRA_TC_NUMBER");
                        intent = intent.getStringExtra("EXTRA_DATE");
                        WLog.i(HybridPlatformBridge.TAG, (new StringBuilder()).append("Retrieved receiptId: ").append(s).append(" tcNumber: ").append(s1).append(" date: ").append(intent).toString());
                        if (!TextUtils.isEmpty(s))
                        {
                            scanreceiptresponse.receiptId = s;
                            scanreceiptresponse.action = "ok";
                        } else
                        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(intent))
                        {
                            scanreceiptresponse.tcNumber = s1;
                            try
                            {
                                intent = intent.split("-");
                                scanreceiptresponse.year = Integer.parseInt(intent[0]);
                                scanreceiptresponse.month = Integer.parseInt(intent[1]) - 1;
                                scanreceiptresponse.day = Integer.parseInt(intent[2]);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Intent intent)
                            {
                                WLog.e(HybridPlatformBridge.TAG, "Failed to parse receipt date!", intent);
                            }
                            scanreceiptresponse.action = "ok";
                        }
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = HybridPlatformBridge.this;
                callback = bridgecallback;
                super();
            }
        };
        ActivityResultRouter.getInstance(mContext).startActivityForResult(scanreceiptdata, 1501, callback);
    }

    public void onShowLoadingIndicator(JSBridgeAdapter.DialogData dialogdata)
    {
        mProgressDialog = CustomProgressDialog.create(mContext);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setIndeterminate(true);
        if (dialogdata.message != null)
        {
            mProgressDialog.setMessage(dialogdata.message);
        }
        mProgressDialog.show();
    }

    public void onStartWalmartScanFlow()
    {
        (new BarcodeActionController(mContext)).startScanner(false);
    }

    public void onWebDialog(JSBridgeAdapter.DialogData dialogdata, JSBridgeAdapter.BridgeCallback bridgecallback)
    {
        WebDialog webdialog = new WebDialog();
        webdialog.setBaseUrl(mWebView.getOriginalUrl());
        webdialog.setDialogData(dialogdata);
        webdialog.setBridgeCallback(bridgecallback);
        webdialog.show(mContext.getFragmentManager(), "web-dialog");
    }




}
