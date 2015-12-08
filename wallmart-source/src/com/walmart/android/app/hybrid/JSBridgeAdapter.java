// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.walmart.android.analytics.Collector;
import com.walmartlabs.hybrid.WebViewJavascriptBridge;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;

public class JSBridgeAdapter
{
    public static class BridgeCallback
    {

        private com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback mJSCallback;

        public void respond(Object obj)
        {
            mJSCallback.callbackToJs(obj);
        }

        public BridgeCallback(com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
        {
            mJSCallback = jscallback;
        }
    }

    public static class DatePickerDialogData
    {

        public int day;
        public int month;
        public int year;

        public DatePickerDialogData()
        {
        }
    }

    public static class DatePickerDialogResponse
    {

        public String action;
        public int day;
        public int month;
        public int year;

        public DatePickerDialogResponse()
        {
        }
    }

    public static class DialogData
    {

        public String cancelButton;
        public String content;
        public boolean handleAccept;
        public String items[];
        public String message;
        public String neutralButton;
        public String okButton;
        public int selectedItem;
        public ArrayList selectedItems;
        public String title;

        public DialogData()
        {
        }
    }

    public static class DialogResponse
    {

        public static final String ACTION_CANCEL = "cancel";
        public static final String ACTION_NEUTRAL = "neutral";
        public static final String ACTION_OK = "ok";
        public String action;
        public int selectedItem;
        public ArrayList selectedItems;

        public DialogResponse(String s)
        {
            action = s;
            selectedItem = -1;
        }

        public DialogResponse(String s, int i)
        {
            action = s;
            selectedItem = i;
        }
    }

    public static interface HybridPlatformInterface
    {

        public abstract void onAlertDialog(DialogData dialogdata, BridgeCallback bridgecallback);

        public abstract void onDateDialog(DatePickerDialogData datepickerdialogdata, BridgeCallback bridgecallback);

        public abstract void onHideLoadingIndicator();

        public abstract void onListDialog(DialogData dialogdata, BridgeCallback bridgecallback);

        public abstract void onMultipleChoiceDialog(DialogData dialogdata, BridgeCallback bridgecallback);

        public abstract void onRadioDialog(DialogData dialogdata, BridgeCallback bridgecallback);

        public abstract void onScanItem(ScanItemData scanitemdata, BridgeCallback bridgecallback);

        public abstract void onScanReceipt(ScanReceiptData scanreceiptdata, BridgeCallback bridgecallback);

        public abstract void onShowLoadingIndicator(DialogData dialogdata);

        public abstract void onStartWalmartScanFlow();

        public abstract void onWebDialog(DialogData dialogdata, BridgeCallback bridgecallback);
    }

    private abstract class JavaHandlerMain
        implements com.walmartlabs.hybrid.WebViewJavascriptBridge.JavaHandler
    {

        final JSBridgeAdapter this$0;

        public Object handle(final String data, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
        {
            mHandler.post(jscallback. new Runnable() {

                final JavaHandlerMain this$1;
                final String val$data;
                final com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback val$jsCallback;

                public void run()
                {
                    handleOnMain(data, jsCallback);
                }

            
            {
                this$1 = final_javahandlermain;
                data = s;
                jsCallback = com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback.this;
                super();
            }
            });
            return null;
        }

        public abstract void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback);

        private JavaHandlerMain()
        {
            this$0 = JSBridgeAdapter.this;
            super();
        }

    }

    public static interface PageStateListener
    {

        public abstract void back();

        public abstract void onStatePushed(State state);

        public abstract void onStateReplaced(State state);
    }

    public static class ScanItemData
    {

        public ScanItemData()
        {
        }
    }

    public static class ScanItemResponse
    {

        public static final String ACTION_CANCEL = "cancel";
        public static final String ACTION_OK = "ok";
        public String action;
        public String code;

        public ScanItemResponse()
        {
        }
    }

    public static class ScanReceiptData
    {

        public String message;

        public ScanReceiptData()
        {
        }
    }

    public static class ScanReceiptResponse
    {

        public static final String ACTION_CANCEL = "cancel";
        public static final String ACTION_OK = "ok";
        public String action;
        public int day;
        public int month;
        public String receiptId;
        public String tcNumber;
        public int year;

        public ScanReceiptResponse()
        {
            action = "";
            receiptId = "";
            tcNumber = "";
        }
    }

    public static class State
    {

        public String backTitle;
        public String pageLoadUrl;
        public String shareText;
        public String shareTitle;
        public boolean showCart;
        public boolean showSearch;
        public String title;

        public String toString()
        {
            return (new StringBuilder()).append("State{pageLoadUrl='").append(pageLoadUrl).append('\'').append(", title='").append(title).append('\'').append(", backTitle='").append(backTitle).append('\'').append(", shareText='").append(shareText).append('\'').append(", shareTitle='").append(shareTitle).append('\'').append(", showSearch=").append(showSearch).append(", showCart=").append(showCart).append('}').toString();
        }

        public State()
        {
        }

        public State(State state)
        {
            title = state.title;
            backTitle = state.backTitle;
            shareText = state.shareText;
            shareTitle = state.shareTitle;
            showSearch = state.showSearch;
            showCart = state.showCart;
        }
    }

    public static class WebDialogResponse
    {

        public String action;
        public String data;

        public WebDialogResponse()
        {
        }
    }


    private static final String TAG = com/walmart/android/app/hybrid/JSBridgeAdapter.getSimpleName();
    private WebViewJavascriptBridge mBridge;
    private Context mContext;
    private Handler mHandler;
    private ObjectMapper mObjectMapper;
    private PageStateListener mPageStateListener;
    private HybridPlatformInterface mPlatformInterface;

    public JSBridgeAdapter(Context context, WebView webview)
    {
        mHandler = new Handler();
        mObjectMapper = new ObjectMapper();
        mObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mBridge = new WebViewJavascriptBridge(context, webview);
        mContext = context;
    }

    private Object readValue(String s, Class class1)
    {
        Object obj;
        try
        {
            obj = mObjectMapper.readValue(s, class1);
        }
        catch (IOException ioexception)
        {
            WLog.e(TAG, (new StringBuilder()).append("Failed to map string to object of type: ").append(class1.toString()).append(" for string: ").append(s).toString(), ioexception);
            return null;
        }
        return obj;
    }

    public void callPageFinished()
    {
        mBridge.callJsHandler("pageFinished");
    }

    public void registerHandlers()
    {
        mBridge.registerJavaHandler("alert", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                s = (DialogData)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$DialogData);
                mPlatformInterface.onAlertDialog(s, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("listDialog", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                s = (DialogData)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$DialogData);
                mPlatformInterface.onListDialog(s, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("radioDialog", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                s = (DialogData)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$DialogData);
                mPlatformInterface.onRadioDialog(s, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("multipleChoiceDialog", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                s = (DialogData)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$DialogData);
                mPlatformInterface.onMultipleChoiceDialog(s, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("itemScanner", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                mPlatformInterface.onScanItem(null, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("receiptScanner", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                mPlatformInterface.onScanReceipt(null, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("walmartItemScanner", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                mPlatformInterface.onStartWalmartScanFlow();
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("showLoadingIndicator", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                WLog.d(JSBridgeAdapter.TAG, (new StringBuilder()).append("showLoadingIndicator: ").append(s).toString());
                s = (DialogData)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$DialogData);
                mPlatformInterface.onShowLoadingIndicator(s);
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("hideLoadingIndicator", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                WLog.d(JSBridgeAdapter.TAG, (new StringBuilder()).append("hideLoadingIndicator: ").append(s).toString());
                mPlatformInterface.onHideLoadingIndicator();
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("webDialog", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                WLog.d(JSBridgeAdapter.TAG, (new StringBuilder()).append("webDialog: ").append(s).toString());
                s = (DialogData)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$DialogData);
                mPlatformInterface.onWebDialog(s, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("info", new com.walmartlabs.hybrid.WebViewJavascriptBridge.JavaHandler() {

            final JSBridgeAdapter this$0;

            public Object handle(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                s = new HashMap();
                s.put("osName", "Android");
                s.put("osVersion", android.os.Build.VERSION.RELEASE);
                s.put("apiLevel", Integer.valueOf(1));
                return s;
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("analytics", new com.walmartlabs.hybrid.WebViewJavascriptBridge.JavaHandler() {

            final JSBridgeAdapter this$0;

            public Object handle(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                return Collector.getInstance().getEventMap();
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("datePicker", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                s = (DatePickerDialogData)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$DatePickerDialogData);
                mPlatformInterface.onDateDialog(s, new BridgeCallback(jscallback));
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("pushState", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                jscallback = null;
                if (!TextUtils.isEmpty(s))
                {
                    jscallback = (State)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$State);
                }
                mPageStateListener.onStatePushed(jscallback);
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("replaceState", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                s = (State)readValue(s, com/walmart/android/app/hybrid/JSBridgeAdapter$State);
                if (s != null)
                {
                    mPageStateListener.onStateReplaced(s);
                }
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
        mBridge.registerJavaHandler("back", new JavaHandlerMain() {

            final JSBridgeAdapter this$0;

            public void handleOnMain(String s, com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback jscallback)
            {
                mPageStateListener.back();
            }

            
            {
                this$0 = JSBridgeAdapter.this;
                super();
            }
        });
    }

    public void setCoreInterface(HybridPlatformInterface hybridplatforminterface)
    {
        mPlatformInterface = hybridplatforminterface;
    }

    public void setPageStateListener(PageStateListener pagestatelistener)
    {
        mPageStateListener = pagestatelistener;
    }






}
