// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;

public class TimeoutSettings
{

    public static final String TIMEOUT_DEFAULT = "default";
    public static final String TIMEOUT_LONG = "long";
    private static final String TIMEOUT_OPTIONS[] = {
        "default", "long"
    };
    public static final String TIMEOUT_PREF_KEY = "SELECTED_TIMEOUT";
    public static final String TIMEOUT_PREF_NAME = "TIMEOUT_SETTING";

    public TimeoutSettings()
    {
    }

    public static Dialog createDialog(Context context)
    {
        int i = (new ArrayList(Arrays.asList(TIMEOUT_OPTIONS))).indexOf(getTimeoutSetting(context));
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle("Timeout").setSingleChoiceItems(TIMEOUT_OPTIONS, i, new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                TimeoutSettings.setTimeoutSetting(TimeoutSettings.TIMEOUT_OPTIONS[j], context);
                dialoginterface.dismiss();
            }

            
            {
                context = context1;
                super();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int j)
            {
            }

        });
        return builder.create();
    }

    public static String getTimeoutSetting(Context context)
    {
        return context.getSharedPreferences("TIMEOUT_SETTING", 0).getString("SELECTED_TIMEOUT", "default");
    }

    public static void setTimeoutSetting(String s, Context context)
    {
        context = context.getSharedPreferences("TIMEOUT_SETTING", 0).edit();
        context.putString("SELECTED_TIMEOUT", s);
        context.apply();
    }


}
