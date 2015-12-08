// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public final class FindMeUtil
{
    public static interface LBSDisabledDialogListener
    {

        public abstract void onDialogLaterClick();
    }


    public static final int SETTINGS = 1;

    private FindMeUtil()
    {
    }

    public static AlertDialog showLBSDisabledDialogFragment(Activity activity)
    {
        return showLBSDisabledDialogFragment(activity, 0x7f07017b, ((LBSDisabledDialogListener) (new _cls1())));
    }

    public static AlertDialog showLBSDisabledDialogFragment(Activity activity, int i)
    {
        return showLBSDisabledDialogFragment(activity, i, ((LBSDisabledDialogListener) (new _cls2())));
    }

    public static AlertDialog showLBSDisabledDialogFragment(Activity activity, int i, LBSDisabledDialogListener lbsdisableddialoglistener)
    {
        TextView textview = new TextView(activity);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        textview.setClickable(true);
        textview.setPadding(4, 2, 4, 2);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        textview.setText(i);
        builder.setView(textview);
        builder.setPositiveButton(0x7f0700e2, new _cls3(activity));
        builder.setNegativeButton(0x7f0700e1, new _cls4(lbsdisableddialoglistener));
        builder.setCancelable(false);
        return builder.create();
    }

    public static AlertDialog showLBSDisabledDialogFragment(Activity activity, LBSDisabledDialogListener lbsdisableddialoglistener)
    {
        return showLBSDisabledDialogFragment(activity, 0x7f07017b, lbsdisableddialoglistener);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
