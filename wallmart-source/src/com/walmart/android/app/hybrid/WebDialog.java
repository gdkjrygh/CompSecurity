// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.walmartlabs.utils.WLog;

public class WebDialog extends DialogFragment
{

    public static final String TAG = com/walmart/android/app/hybrid/WebDialog.getSimpleName();
    private boolean handleAccept;
    private String mBaseUrl;
    private JSBridgeAdapter.BridgeCallback mBridgeCallback;
    private JSBridgeAdapter.DialogData mDialogData;
    private WebView webView;

    public WebDialog()
    {
        handleAccept = false;
    }

    private void bridgeCallback(String s, String s1)
    {
        JSBridgeAdapter.WebDialogResponse webdialogresponse = new JSBridgeAdapter.WebDialogResponse();
        webdialogresponse.action = s;
        webdialogresponse.data = s1;
        mBridgeCallback.respond(webdialogresponse);
    }

    public void closeDialog(final String action, final String data)
    {
        Activity activity = getActivity();
        if (activity != null)
        {
            activity.runOnUiThread(new Runnable() {

                final WebDialog this$0;
                final String val$action;
                final String val$data;

                public void run()
                {
                    bridgeCallback(action, data);
                    dismiss();
                }

            
            {
                this$0 = WebDialog.this;
                action = s;
                data = s1;
                super();
            }
            });
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        WLog.i(TAG, (new StringBuilder()).append("WebDialog.onCreateDialog(): ").append(mBaseUrl).toString());
        bundle = new android.app.AlertDialog.Builder(getActivity());
        String s = mDialogData.okButton;
        String s1 = mDialogData.title;
        String s2 = mDialogData.cancelButton;
        String s3 = mDialogData.neutralButton;
        String s4 = String.format("<body class=\"native-dialog android\">%s</body>", new Object[] {
            mDialogData.content
        });
        handleAccept = mDialogData.handleAccept;
        bundle.setTitle(s1);
        webView = new WebView(getActivity());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient() {

            final WebDialog this$0;

            public boolean onConsoleMessage(ConsoleMessage consolemessage)
            {
                WLog.i(WebDialog.TAG, consolemessage.message());
                return true;
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        webView.setWebViewClient(new WebViewClient() {

            final WebDialog this$0;

            public void onPageFinished(WebView webview, String s5)
            {
                super.onPageFinished(webview, s5);
                getDialog().show();
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        webView.addJavascriptInterface(this, "Bridge");
        webView.loadDataWithBaseURL(mBaseUrl, s4, "text/html", "UTF-8", null);
        bundle.setView(webView);
        if (s != null)
        {
            bundle.setPositiveButton(s, new android.content.DialogInterface.OnClickListener() {

                final WebDialog this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = WebDialog.this;
                super();
            }
            });
        }
        if (s2 != null)
        {
            bundle.setNegativeButton(s2, new android.content.DialogInterface.OnClickListener() {

                final WebDialog this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    bridgeCallback("cancel", null);
                }

            
            {
                this$0 = WebDialog.this;
                super();
            }
            });
        }
        if (s3 != null)
        {
            bundle.setNeutralButton(s3, new android.content.DialogInterface.OnClickListener() {

                final WebDialog this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    bridgeCallback("neutral", null);
                }

            
            {
                this$0 = WebDialog.this;
                super();
            }
            });
        }
        return bundle.create();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        bridgeCallback("cancel", null);
        super.onDismiss(dialoginterface);
    }

    public void onStart()
    {
        super.onStart();
        Object obj = (AlertDialog)getDialog();
        if (obj != null)
        {
            ((AlertDialog) (obj)).hide();
            obj = ((AlertDialog) (obj)).getButton(-1);
            if (obj != null)
            {
                ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                    final WebDialog this$0;

                    public void onClick(View view)
                    {
                        if (handleAccept)
                        {
                            webView.loadUrl("javascript:onAccept()");
                            return;
                        } else
                        {
                            bridgeCallback("ok", null);
                            dismiss();
                            return;
                        }
                    }

            
            {
                this$0 = WebDialog.this;
                super();
            }
                });
                return;
            }
        }
    }

    public void setBaseUrl(String s)
    {
        mBaseUrl = s;
    }

    public void setBridgeCallback(JSBridgeAdapter.BridgeCallback bridgecallback)
    {
        mBridgeCallback = bridgecallback;
    }

    public void setDialogData(JSBridgeAdapter.DialogData dialogdata)
    {
        mDialogData = dialogdata;
    }




}
