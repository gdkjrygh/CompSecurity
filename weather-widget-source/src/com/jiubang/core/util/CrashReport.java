// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.gtp.a.a.b.c;

// Referenced classes of package com.jiubang.core.util:
//            ErrorReporter, ReportingInteractionMode

public class CrashReport
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    protected static final String LOG_TAG = "ACRA";
    public static final int NOTIF_CRASH_ID = 666;
    private static final String PRERFERENCE_KEY = "pref_key_report";
    public static final String RES_DIALOG_COMMENT_PROMPT = "RES_DIALOG_COMMENT_PROMPT";
    public static final String RES_DIALOG_ICON = "RES_DIALOG_ICON";
    public static final String RES_DIALOG_OK_TOAST = "RES_DIALOG_OK_TOAST";
    public static final String RES_DIALOG_TEXT = "RES_DIALOG_TEXT";
    public static final String RES_DIALOG_TITLE = "RES_DIALOG_TITLE";
    public static final String RES_NOTIF_ICON = "RES_NOTIF_ICON";
    public static final String RES_NOTIF_TEXT = "RES_NOTIF_TEXT";
    public static final String RES_NOTIF_TICKER_TEXT = "RES_NOTIF_TICKER_TEXT";
    public static final String RES_NOTIF_TITLE = "RES_NOTIF_TITLE";
    public static final String RES_TOAST_TEXT = "RES_TOAST_TEXT";
    private Context mApp;
    SharedPreferences mSharedPreferences;

    public CrashReport()
    {
        mApp = null;
        mSharedPreferences = null;
    }

    private SharedPreferences getACRASharedPreferences()
    {
        return PreferenceManager.getDefaultSharedPreferences(mApp);
    }

    private void initAcra()
    {
        c.a("ACRA", (new StringBuilder()).append("ACRA is enabled for ").append(mApp.getPackageName()).append(", intializing...").toString());
        ErrorReporter errorreporter = ErrorReporter.getInstance();
        errorreporter.setFormUri(getFormUri());
        errorreporter.setReportingInteractionMode(getReportingInteractionMode());
        errorreporter.setCrashResources(getCrashResources());
        errorreporter.init(mApp.getApplicationContext());
        errorreporter.checkReportsOnApplicationStart();
    }

    public Bundle getCrashResources()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("RES_NOTIF_ICON", 0x1080078);
        bundle.putInt("RES_NOTIF_TICKER_TEXT", 0x7f0800eb);
        bundle.putInt("RES_NOTIF_TITLE", 0x7f0800ec);
        bundle.putInt("RES_NOTIF_TEXT", 0x7f0800ed);
        bundle.putInt("RES_DIALOG_ICON", 0x108009b);
        bundle.putInt("RES_DIALOG_TITLE", 0x7f0800ee);
        bundle.putInt("RES_DIALOG_TEXT", 0x7f0800ef);
        return bundle;
    }

    public String getFormId()
    {
        return "dEM4SDNGX0tvaDVxSjk0NVM5ZTl4Y3c6MQ";
    }

    public Uri getFormUri()
    {
        return Uri.parse((new StringBuilder()).append("http://spreadsheets.google.com/formResponse?formkey=").append(getFormId()).append("&amp;ifq").toString());
    }

    ReportingInteractionMode getReportingInteractionMode()
    {
        return ReportingInteractionMode.NOTIFICATION;
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (!"pref_key_report".equals(s)) goto _L2; else goto _L1
_L1:
        sharedpreferences = Boolean.valueOf(false);
        boolean flag = mSharedPreferences.getBoolean("pref_key_report", true);
        sharedpreferences = Boolean.valueOf(flag);
_L6:
        if (!sharedpreferences.booleanValue()) goto _L4; else goto _L3
_L3:
        initAcra();
_L2:
        return;
_L4:
        ErrorReporter.getInstance().disable();
        return;
        s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void start(Context context)
    {
        mApp = context;
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        mSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        initAcra();
    }
}
