// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;

// Referenced classes of package com.walmart.android.ui:
//            CustomProgressDialog

public class DialogFactory
{

    public static final int LOADING_INDICATOR = 0;
    public static final int LOADING_INDICATOR_NOT_CANCELABLE = 1;

    public DialogFactory()
    {
    }

    public static Dialog createAlertDialog(int i, String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener, String s3, Context context)
    {
        context = new CustomAlertDialog.Builder(context);
        context.setTitle(s).setMessage(s1).setIcon(i).setCancelable(true).setPositiveButton(s2, onclicklistener).setNegativeButton(s3, null);
        return context.create();
    }

    public static Dialog createAlertDialog(View view, String s, android.content.DialogInterface.OnClickListener onclicklistener, String s1, Context context)
    {
        context = new CustomAlertDialog.Builder(context);
        context.setView(view).setCancelable(true).setPositiveButton(s, onclicklistener).setNegativeButton(s1, null);
        return context.create();
    }

    public static Dialog createAlertDialog(String s, Context context)
    {
        return createAlertDialog(null, s, context);
    }

    public static Dialog createAlertDialog(String s, String s1, Context context)
    {
        return createAlertDialog(s, s1, context, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

        });
    }

    public static Dialog createAlertDialog(String s, String s1, Context context, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.setMessage(s1);
        if (!TextUtils.isEmpty(s))
        {
            builder.setTitle(s);
        }
        builder.setCancelable(true).setPositiveButton(context.getString(0x104000a), onclicklistener);
        return builder.create();
    }

    public static Dialog createAlertDialog(String s, String s1, android.content.DialogInterface.OnClickListener onclicklistener, String s2, Context context)
    {
        context = new CustomAlertDialog.Builder(context);
        context.setMessage(s).setCancelable(true).setPositiveButton(s1, onclicklistener).setNegativeButton(s2, null);
        return context.create();
    }

    public static Dialog createAlertDialog(String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener, String s3, Context context)
    {
        context = new CustomAlertDialog.Builder(context);
        context.setTitle(s).setMessage(s1).setCancelable(true).setPositiveButton(s2, onclicklistener).setNegativeButton(s3, null);
        return context.create();
    }

    public static Dialog createDialog(int i, String s, Context context)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            context = CustomProgressDialog.create(context);
            context.setMessage(s);
            context.setIndeterminate(true);
            context.setCancelable(true);
            return context;

        case 1: // '\001'
            context = CustomProgressDialog.create(context);
            break;
        }
        context.setMessage(s);
        context.setIndeterminate(true);
        context.setCancelable(false);
        return context;
    }
}
