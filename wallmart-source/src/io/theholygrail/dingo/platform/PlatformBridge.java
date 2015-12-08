// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import io.theholygrail.dingo.JsonTransformer;
import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;
import io.theholygrail.jsbridge.JSWebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.theholygrail.dingo.platform:
//            DialogData, ShareData, PlatformBridgeCallback, Info

public class PlatformBridge
{

    private static final String CANCELLED_ACTION_ID = "back";
    public static final String NAMESPACE = "platform";
    private static final String TAG = io/theholygrail/dingo/platform/PlatformBridge.getSimpleName();
    private PlatformBridgeCallback mCallback;
    private Context mContext;
    private Handler mHandler;
    private JsonTransformer mJsonTransformer;
    private JSWebView mWebView;

    public PlatformBridge(Context context, JSWebView jswebview, JsonTransformer jsontransformer, PlatformBridgeCallback platformbridgecallback)
    {
        mContext = context;
        mWebView = jswebview;
        mJsonTransformer = jsontransformer;
        mCallback = platformbridgecallback;
        mHandler = new Handler();
    }

    private void reverseChildOrder(LinearLayout linearlayout)
    {
        if (linearlayout != null)
        {
            Object obj = new ArrayList();
            for (int i = linearlayout.getChildCount() - 1; i >= 0; i--)
            {
                ((List) (obj)).add(linearlayout.getChildAt(i));
            }

            linearlayout.removeAllViews();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); linearlayout.addView((View)((Iterator) (obj)).next())) { }
        }
    }

    private void stackButtonsIfNeeded(final AlertDialog dialog)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i == 21 || i == 22)
        {
            dialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

                final PlatformBridge this$0;
                final AlertDialog val$dialog;

                public void onShow(DialogInterface dialoginterface)
                {
                    try
                    {
                        dialoginterface = dialog.getButton(-1);
                        Button button = dialog.getButton(-2);
                        Button button1 = dialog.getButton(-3);
                        int j = dialoginterface.getWidth();
                        int k = button.getWidth();
                        int l = button1.getWidth();
                        dialoginterface = (LinearLayout)dialoginterface.getParent();
                        int i1 = dialoginterface.getPaddingLeft();
                        int j1 = dialoginterface.getPaddingRight();
                        if (dialoginterface.getOrientation() == 0 && j + k + l + (i1 + j1) > dialoginterface.getWidth())
                        {
                            dialoginterface.setOrientation(1);
                            dialoginterface.setGravity(5);
                            reverseChildOrder(dialoginterface);
                        }
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        return;
                    }
                }

            
            {
                this$0 = PlatformBridge.this;
                dialog = alertdialog;
                super();
            }
            });
        }
    }

    public void dialog(final String dialogData, final String callbackValue)
    {
        JSLog.d(TAG, (new StringBuilder()).append("dialog: ").append(dialogData).toString());
        dialogData = (DialogData)mJsonTransformer.fromJson(dialogData, io/theholygrail/dingo/platform/DialogData);
        callbackValue = new JSValue(callbackValue);
        mHandler.post(new Runnable() {

            final PlatformBridge this$0;
            final JSValue val$callbackValue;
            final DialogData val$dialogData;

            private void sendToJs(String s, String s1)
            {
                JSLog.d(PlatformBridge.TAG, (new StringBuilder()).append("error: ").append(s).append(" id: ").append(s1).toString());
                if (callbackValue.isFunction().booleanValue())
                {
                    s1 = new JSValue(s1);
                    callbackValue.callFunction(mWebView, new Object[] {
                        s, s1
                    }, null);
                }
            }

            public void run()
            {
                Object obj = (new android.app.AlertDialog.Builder(mContext)).setTitle(dialogData.title).setMessage(dialogData.message);
                boolean flag1 = false;
                boolean flag = false;
                DialogData.Action aaction[] = dialogData.actions;
                int j = aaction.length;
                int i = 0;
                while (i < j) 
                {
                    DialogData.Action action = aaction[i];
                    boolean flag2;
                    if ("cancel".equalsIgnoreCase(action.id))
                    {
                        ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(action.label, action. new android.content.DialogInterface.OnClickListener() {

                            final _cls2 this$1;
                            final DialogData.Action val$action;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                JSLog.d(PlatformBridge.TAG, "negative button clicked!");
                                sendToJs("", action.id);
                            }

            
            {
                this$1 = final__pcls2;
                action = DialogData.Action.this;
                super();
            }
                        });
                        flag1 = true;
                        flag2 = flag;
                    } else
                    {
                        flag2 = flag;
                        if (!TextUtils.isEmpty(action.id))
                        {
                            android.content.DialogInterface.OnClickListener onclicklistener = action. new android.content.DialogInterface.OnClickListener() {

                                final _cls2 this$1;
                                final DialogData.Action val$action;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    JSLog.i(PlatformBridge.TAG, (new StringBuilder()).append(action.id).append(" button clicked!").toString());
                                    sendToJs("", action.id);
                                }

            
            {
                this$1 = final__pcls2;
                action = DialogData.Action.this;
                super();
            }
                            };
                            if (flag)
                            {
                                ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(action.label, onclicklistener);
                            } else
                            {
                                ((android.app.AlertDialog.Builder) (obj)).setNeutralButton(action.label, onclicklistener);
                                flag = true;
                            }
                            flag1 = true;
                            flag2 = flag;
                        }
                    }
                    i++;
                    flag = flag2;
                }
                if (flag1)
                {
                    obj = ((android.app.AlertDialog.Builder) (obj)).create();
                    stackButtonsIfNeeded(((AlertDialog) (obj)));
                    ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
                    ((AlertDialog) (obj)).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                        final _cls2 this$1;

                        public void onCancel(DialogInterface dialoginterface)
                        {
                            JSLog.d(PlatformBridge.TAG, "onCancel()");
                            sendToJs("", "back");
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                    ((AlertDialog) (obj)).setOnDismissListener(((_cls4) (obj)). new android.content.DialogInterface.OnDismissListener() {

                        final _cls2 this$1;
                        final AlertDialog val$dialog;

                        public void onDismiss(DialogInterface dialoginterface)
                        {
                            JSLog.d(PlatformBridge.TAG, "onDismiss()");
                            mCallback.onDialogDismissed(dialog);
                        }

            
            {
                this$1 = final__pcls2;
                dialog = AlertDialog.this;
                super();
            }
                    });
                    mCallback.showDialog(((android.app.Dialog) (obj)));
                    return;
                } else
                {
                    sendToJs("Could not create dialog", "");
                    JSLog.w(PlatformBridge.TAG, "Could not create Dialog!");
                    return;
                }
            }


            
            {
                this$0 = PlatformBridge.this;
                dialogData = dialogdata;
                callbackValue = jsvalue;
                super();
            }
        });
    }

    public void info(final String callbackValue)
    {
        JSLog.d(TAG, "info()");
        callbackValue = new JSValue(callbackValue);
        mHandler.post(new Runnable() {

            final PlatformBridge this$0;
            final JSValue val$callbackValue;

            public void run()
            {
                String s;
                String s2;
                int i;
                s = "Unknown";
                s2 = Build.MODEL;
                i = android.os.Build.VERSION.SDK_INT;
                String s1 = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionName;
                s = s1;
_L2:
                if (callbackValue.isFunction().booleanValue())
                {
                    Info info1 = new Info();
                    info1.appVersion = s;
                    info1.platform = String.valueOf(i);
                    info1.device = s2;
                    s = mJsonTransformer.toJson(info1);
                    callbackValue.callFunction(mWebView, new Object[] {
                        s
                    }, null);
                }
                return;
                android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
                namenotfoundexception;
                JSLog.d(PlatformBridge.TAG, "Failed to get appversion: ", namenotfoundexception);
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = PlatformBridge.this;
                callbackValue = jsvalue;
                super();
            }
        });
    }

    public void share(final String message)
    {
        Object obj = (ShareData)mJsonTransformer.fromJson(message, io/theholygrail/dingo/platform/ShareData);
        message = ((ShareData) (obj)).message;
        obj = ((ShareData) (obj)).url;
        final Intent share = new Intent("android.intent.action.SEND");
        share.setType("text/plain");
        share.putExtra("android.intent.extra.SUBJECT", message);
        share.putExtra("android.intent.extra.TEXT", ((String) (obj)));
        mHandler.post(new Runnable() {

            final PlatformBridge this$0;
            final String val$message;
            final Intent val$share;

            public void run()
            {
                mContext.startActivity(Intent.createChooser(share, message));
            }

            
            {
                this$0 = PlatformBridge.this;
                share = intent;
                message = s;
                super();
            }
        });
    }








}
