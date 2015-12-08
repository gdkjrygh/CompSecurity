// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Dialog;
import android.content.Context;

public class BundleDialogFactory
{

    public static final int DIALOG_MULTI_SELECT_REMOVE = 102;
    public static final int DIALOG_SINGLE_SELECT_REPLACE = 101;

    public BundleDialogFactory()
    {
    }

    public static Dialog createDialog(Context context, int i, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        return createDialog(context, i, onclicklistener, null, null);
    }

    public static Dialog createDialog(Context context, int i, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        if (i == 101)
        {
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(context, 0)).setTitle(0x7f0901a5).setMessage(0x7f09009d).setCancelable(true).setPositiveButton(0x1040013, onclicklistener).setNegativeButton(0x1040009, onclicklistener1).setOnCancelListener(oncancellistener).create();
        }
        if (i == 102)
        {
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(context, 0)).setTitle(0x7f0901a3).setMessage(0x7f09009c).setCancelable(true).setPositiveButton(0x7f090292, onclicklistener).setOnCancelListener(oncancellistener).create();
        } else
        {
            return null;
        }
    }
}
