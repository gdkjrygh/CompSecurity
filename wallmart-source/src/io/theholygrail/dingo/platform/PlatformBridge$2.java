// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.platform;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;

// Referenced classes of package io.theholygrail.dingo.platform:
//            PlatformBridge, DialogData, PlatformBridgeCallback

class val.callbackValue
    implements Runnable
{

    final PlatformBridge this$0;
    final JSValue val$callbackValue;
    final DialogData val$dialogData;

    private void sendToJs(String s, String s1)
    {
        JSLog.d(PlatformBridge.access$100(), (new StringBuilder()).append("error: ").append(s).append(" id: ").append(s1).toString());
        if (val$callbackValue.isFunction().booleanValue())
        {
            s1 = new JSValue(s1);
            val$callbackValue.callFunction(PlatformBridge.access$300(PlatformBridge.this), new Object[] {
                s, s1
            }, null);
        }
    }

    public void run()
    {
        final AlertDialog dialog = (new android.app.er(PlatformBridge.access$000(PlatformBridge.this))).setTitle(val$dialogData.title).setMessage(val$dialogData.message);
        boolean flag1 = false;
        boolean flag = false;
         a[] = val$dialogData.actions;
        int j = a.length;
        int i = 0;
        while (i < j) 
        {
            final  action = a[i];
            boolean flag2;
            if ("cancel".equalsIgnoreCase(action.id))
            {
                dialog.setNegativeButton(action.label, new android.content.DialogInterface.OnClickListener() {

                    final PlatformBridge._cls2 this$1;
                    final DialogData.Action val$action;

                    public void onClick(DialogInterface dialoginterface, int k)
                    {
                        JSLog.d(PlatformBridge.access$100(), "negative button clicked!");
                        sendToJs("", action.id);
                    }

            
            {
                this$1 = PlatformBridge._cls2.this;
                action = action1;
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
                    android.content.nClickListener nclicklistener = new android.content.DialogInterface.OnClickListener() {

                        final PlatformBridge._cls2 this$1;
                        final DialogData.Action val$action;

                        public void onClick(DialogInterface dialoginterface, int k)
                        {
                            JSLog.i(PlatformBridge.access$100(), (new StringBuilder()).append(action.id).append(" button clicked!").toString());
                            sendToJs("", action.id);
                        }

            
            {
                this$1 = PlatformBridge._cls2.this;
                action = action1;
                super();
            }
                    };
                    if (flag)
                    {
                        dialog.setPositiveButton(action.label, nclicklistener);
                    } else
                    {
                        dialog.setNeutralButton(action.label, nclicklistener);
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
            dialog = dialog.create();
            PlatformBridge.access$500(PlatformBridge.this, dialog);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final PlatformBridge._cls2 this$1;

                public void onCancel(DialogInterface dialoginterface)
                {
                    JSLog.d(PlatformBridge.access$100(), "onCancel()");
                    sendToJs("", "back");
                }

            
            {
                this$1 = PlatformBridge._cls2.this;
                super();
            }
            });
            dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final PlatformBridge._cls2 this$1;
                final AlertDialog val$dialog;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    JSLog.d(PlatformBridge.access$100(), "onDismiss()");
                    PlatformBridge.access$600(this$0).onDialogDismissed(dialog);
                }

            
            {
                this$1 = PlatformBridge._cls2.this;
                dialog = alertdialog;
                super();
            }
            });
            PlatformBridge.access$600(PlatformBridge.this).showDialog(dialog);
            return;
        } else
        {
            sendToJs("Could not create dialog", "");
            JSLog.w(PlatformBridge.access$100(), "Could not create Dialog!");
            return;
        }
    }


    _cls4.val.dialog()
    {
        this$0 = final_platformbridge;
        val$dialogData = dialogdata;
        val$callbackValue = JSValue.this;
        super();
    }
}
