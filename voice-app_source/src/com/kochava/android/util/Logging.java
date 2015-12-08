// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.util;

import android.util.Log;
import com.kochava.android.tracker.Global;
import java.util.regex.Pattern;

public class Logging
{

    private static final boolean IS_KOCHAVA = true;
    protected static final String LOGTAG = "KochavaTracker";
    private static final String REPLACE = "(?<!\\.)koch(ava)?_?(?!\\.com)( (?=generated)|%20)?";
    protected static final String REQLOGTAG = "KochavaRequirements";
    static Pattern p = Pattern.compile("(?<!\\.)koch(ava)?_?(?!\\.com)( (?=generated)|%20)?", 2);

    public Logging()
    {
    }

    public static void Log(String s)
    {
        if (Global.DEBUG)
        {
            android.util.Log.i("KochavaTracker", s);
        }
    }

    public static void LogError(String s)
    {
        if (Global.DEBUGERROR)
        {
            android.util.Log.e("KochavaTracker", s);
        }
    }

    public static void LogRequirementsError(String s)
    {
        if (Global.DEBUGERROR)
        {
            android.util.Log.e("KochavaRequirements", s);
        }
    }

}
