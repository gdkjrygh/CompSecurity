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

class val.action
    implements android.content.lickListener
{

    final d this$1;
    final d val$action;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        JSLog.i(PlatformBridge.access$100(), (new StringBuilder()).append(val$action.d).append(" button clicked!").toString());
        ndToJs("", val$action.d);
    }

    l.callbackValue()
    {
        this$1 = final_callbackvalue;
        val$action = val.action.this;
        super();
    }

    // Unreferenced inner class io/theholygrail/dingo/platform/PlatformBridge$2

/* anonymous class */
    class PlatformBridge._cls2
        implements Runnable
    {

        final PlatformBridge this$0;
        final JSValue val$callbackValue;
        final DialogData val$dialogData;

        private void sendToJs(String s, String s1)
        {
            JSLog.d(PlatformBridge.access$100(), (new StringBuilder()).append("error: ").append(s).append(" id: ").append(s1).toString());
            if (callbackValue.isFunction().booleanValue())
            {
                s1 = new JSValue(s1);
                callbackValue.callFunction(PlatformBridge.access$300(PlatformBridge.this), new Object[] {
                    s, s1
                }, null);
            }
        }

        public void run()
        {
            final AlertDialog dialog = (new android.app.AlertDialog.Builder(PlatformBridge.access$000(PlatformBridge.this))).setTitle(dialogData.title).setMessage(dialogData.message);
            boolean flag1 = false;
            boolean flag = false;
            DialogData.Action aaction[] = dialogData.actions;
            int j = aaction.length;
            int i = 0;
            while (i < j) 
            {
                final DialogData.Action action = aaction[i];
                boolean flag2;
                if ("cancel".equalsIgnoreCase(action.id))
                {
                    dialog.setNegativeButton(action.label, new PlatformBridge._cls2._cls1());
                    flag1 = true;
                    flag2 = flag;
                } else
                {
                    flag2 = flag;
                    if (!TextUtils.isEmpty(action.id))
                    {
                        PlatformBridge._cls2._cls2 _lcls2 = action. new PlatformBridge._cls2._cls2();
                        if (flag)
                        {
                            dialog.setPositiveButton(action.label, _lcls2);
                        } else
                        {
                            dialog.setNeutralButton(action.label, _lcls2);
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
                dialog.setOnCancelListener(new PlatformBridge._cls2._cls3());
                dialog.setOnDismissListener(new PlatformBridge._cls2._cls4());
                PlatformBridge.access$600(PlatformBridge.this).showDialog(dialog);
                return;
            } else
            {
                sendToJs("Could not create dialog", "");
                JSLog.w(PlatformBridge.access$100(), "Could not create Dialog!");
                return;
            }
        }


            
            {
                this$0 = final_platformbridge;
                dialogData = dialogdata;
                callbackValue = JSValue.this;
                super();
            }

        // Unreferenced inner class io/theholygrail/dingo/platform/PlatformBridge$2$1

/* anonymous class */
        class PlatformBridge._cls2._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final PlatformBridge._cls2 this$1;
            final DialogData.Action val$action;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                JSLog.d(PlatformBridge.access$100(), "negative button clicked!");
                sendToJs("", action.id);
            }

                    
                    {
                        this$1 = PlatformBridge._cls2.this;
                        action = action1;
                        super();
                    }
        }


        // Unreferenced inner class io/theholygrail/dingo/platform/PlatformBridge$2$3

/* anonymous class */
        class PlatformBridge._cls2._cls3
            implements android.content.DialogInterface.OnCancelListener
        {

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
        }


        // Unreferenced inner class io/theholygrail/dingo/platform/PlatformBridge$2$4

/* anonymous class */
        class PlatformBridge._cls2._cls4
            implements android.content.DialogInterface.OnDismissListener
        {

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
        }

    }

}
