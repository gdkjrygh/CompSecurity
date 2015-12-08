// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.alert;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.util.BitmapUtil;

public class PopupAlertDialog
{
    public static final class AlertType extends Enum
    {

        private static final AlertType $VALUES[];
        public static final AlertType Error;
        public static final AlertType Success;

        public static AlertType valueOf(String s)
        {
            return (AlertType)Enum.valueOf(com/contextlogic/wish/ui/components/alert/PopupAlertDialog$AlertType, s);
        }

        public static AlertType[] values()
        {
            return (AlertType[])$VALUES.clone();
        }

        static 
        {
            Error = new AlertType("Error", 0);
            Success = new AlertType("Success", 1);
            $VALUES = (new AlertType[] {
                Error, Success
            });
        }

        private AlertType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long DISMISS_DELAY = 5000L;
    private static final long LONG_DISMISS_DELAY = 8000L;
    private Dialog alertDialog;
    private LinearLayout alertLayout;
    private AlertType alertType;
    private Context context;
    private Runnable dismissRunnable;
    private boolean dismissed;
    private String message;
    private String title;

    public PopupAlertDialog(Context context1)
    {
        context = context1;
        dismissed = false;
    }

    public static void showError(Context context1, String s, String s1)
    {
        showError(context1, s, s1, true);
    }

    public static void showError(Context context1, String s, String s1, boolean flag)
    {
        PopupAlertDialog popupalertdialog = new PopupAlertDialog(context1);
        if (flag && !WishHttpClient.isNetworkAvailable())
        {
            popupalertdialog.setTitle(context1.getString(0x7f0602c5));
            popupalertdialog.setMessage(context1.getString(0x7f0602c4));
        } else
        {
            popupalertdialog.setTitle(s);
            popupalertdialog.setMessage(s1);
        }
        popupalertdialog.setAlertType(AlertType.Error);
        try
        {
            popupalertdialog.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            return;
        }
    }

    public static void showSuccess(Context context1, String s, String s1)
    {
        context1 = new PopupAlertDialog(context1);
        context1.setMessage(s1);
        context1.setTitle(s);
        context1.setAlertType(AlertType.Success);
        try
        {
            context1.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            return;
        }
    }

    public void dismiss()
    {
        if (dismissed)
        {
            return;
        }
        alertLayout.removeCallbacks(dismissRunnable);
        dismissed = true;
        try
        {
            alertDialog.dismiss();
        }
        catch (Exception exception) { }
        alertDialog = null;
        alertLayout = null;
    }

    public void setAlertType(AlertType alerttype)
    {
        alertType = alerttype;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void show()
    {
        alertDialog = new Dialog(context, 0x7f0b0102);
        alertDialog.setContentView(0x7f0300c6);
        Object obj = (TextView)alertDialog.findViewById(0x7f0d0416);
        if (message == null)
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(message);
        }
        obj = (TextView)alertDialog.findViewById(0x7f0d0415);
        if (title == null)
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(title);
        }
        obj = (ImageView)alertDialog.findViewById(0x7f0d0414);
        if (alertType == AlertType.Success)
        {
            BitmapUtil.safeSetImageResource(((ImageView) (obj)), 0x7f0200a1);
        } else
        if (alertType == AlertType.Error)
        {
            BitmapUtil.safeSetImageResource(((ImageView) (obj)), 0x7f0200af);
        }
        alertLayout = (LinearLayout)alertDialog.findViewById(0x7f0d0413);
        alertLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final PopupAlertDialog this$0;

            public void onClick(View view)
            {
                dismiss();
            }

            
            {
                this$0 = PopupAlertDialog.this;
                super();
            }
        });
        try
        {
            alertDialog.show();
        }
        catch (Exception exception) { }
        dismissRunnable = new Runnable() {

            final PopupAlertDialog this$0;

            public void run()
            {
                dismiss();
            }

            
            {
                this$0 = PopupAlertDialog.this;
                super();
            }
        };
        alertLayout.postDelayed(dismissRunnable, 5000L);
        context = null;
    }
}
