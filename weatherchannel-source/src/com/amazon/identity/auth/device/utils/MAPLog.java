// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.amazon.identity.auth.device.utils:
//            DefaultLibraryInfo

public final class MAPLog
{

    private static final String ENG = "eng";
    private static final int FLAVOR_INDEX = 2;
    public static boolean IS_FIRST_PARTY_DEBUG_BUILD = false;
    private static final String LOG_TAG = com/amazon/identity/auth/device/utils/MAPLog.getName();
    private static final String LOG_TAG_PII = "com.amazon.identity.pii";
    private static final String MATCHER_PATTERN = "^(?:(.*?)_)??(?:([^_]*)_)?([0-9]+)$";
    private static final String NO_MESSAGE = "N/A";
    private static final int NUM_GROUPS = 3;
    private static final String OBSCURED = "<obscured>";
    private static final String PII_STRING = ".PII";
    private static final String SEPARATOR = ":";
    private static final String USERDEBUG = "userdebug";

    public MAPLog()
    {
    }

    public static int d(String s, String s1)
    {
        return Log.d(s, s1);
    }

    public static int d(String s, String s1, Throwable throwable)
    {
        return Log.d(s, s1, throwable);
    }

    public static int e(String s, String s1)
    {
        return Log.e(s, s1);
    }

    public static int e(String s, String s1, Throwable throwable)
    {
        return Log.e(s, s1, throwable);
    }

    public static String getStackTraceString(Throwable throwable)
    {
        return Log.getStackTraceString(throwable);
    }

    private static String getUpdatedMessage(String s, String s1)
    {
        s = new StringBuffer(s);
        if (!TextUtils.isEmpty(s1))
        {
            s.append(":");
            s.append(s1);
        }
        return s.toString();
    }

    public static int i(String s, String s1)
    {
        return Log.i(s, s1);
    }

    public static int i(String s, String s1, Throwable throwable)
    {
        return Log.i(s, s1, throwable);
    }

    private static boolean isFirstPartyDebugBuild()
    {
        boolean flag1 = false;
        String s;
        s = android.os.Build.VERSION.INCREMENTAL;
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_24;
        }
        w(LOG_TAG, "Incremental version was empty");
        return false;
        Object obj;
        obj = Pattern.compile("^(?:(.*?)_)??(?:([^_]*)_)?([0-9]+)$");
        pii(LOG_TAG, "Extracting verison incremental", (new StringBuilder()).append("Build.VERSION.INCREMENTAL: ").append(s).toString());
        obj = ((Pattern) (obj)).matcher(s);
        if (((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        pii(LOG_TAG, "Incremental version '%s' was in invalid format.", (new StringBuilder()).append("ver=").append(s).toString());
        Exception exception;
        return false;
        if (((Matcher) (obj)).groupCount() >= 3)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        e(LOG_TAG, "Error parsing build version string.");
        return false;
        boolean flag;
        try
        {
            exception = ((Matcher) (obj)).group(2);
            pii(LOG_TAG, "Extracting flavor", (new StringBuilder()).append("Build flavor: ").append(exception).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            e(LOG_TAG, exception.getMessage(), exception);
            return false;
        }
        flag = flag1;
        if (TextUtils.isEmpty(exception))
        {
            break MISSING_BLOCK_LABEL_209;
        }
        if (exception.equals("userdebug"))
        {
            break MISSING_BLOCK_LABEL_198;
        }
        flag = flag1;
        if (!exception.equals("eng"))
        {
            break MISSING_BLOCK_LABEL_209;
        }
        i(LOG_TAG, "MAP is running on 1st party debug");
        flag = true;
        return flag;
    }

    public static boolean isLoggable(String s, int j)
    {
        return Log.isLoggable(s, j);
    }

    public static int pii(String s, String s1, String s2)
    {
        return pii(s, s1, s2, null);
    }

    public static int pii(String s, String s1, String s2, Throwable throwable)
    {
        String s3 = s;
        if (s == null)
        {
            s3 = "NULL_TAG";
        }
        byte byte1 = 3;
        s = "<obscured>";
        byte byte0;
        if (IS_FIRST_PARTY_DEBUG_BUILD)
        {
            byte0 = 4;
            s = s2;
        } else
        if (DefaultLibraryInfo.isProd() && Log.isLoggable("com.amazon.identity.pii", 3))
        {
            s = s2;
            byte0 = byte1;
        } else
        {
            byte0 = byte1;
            if (!DefaultLibraryInfo.isProd())
            {
                s = s2;
                byte0 = byte1;
            }
        }
        if (throwable != null)
        {
            if (byte0 == 4)
            {
                return Log.i((new StringBuilder()).append(s3).append(".PII").toString(), getUpdatedMessage(s1, s), throwable);
            } else
            {
                return Log.d((new StringBuilder()).append(s3).append(".PII").toString(), getUpdatedMessage(s1, s), throwable);
            }
        }
        if (byte0 == 4)
        {
            return Log.i((new StringBuilder()).append(s3).append(".PII").toString(), getUpdatedMessage(s1, s));
        } else
        {
            return Log.d((new StringBuilder()).append(s3).append(".PII").toString(), getUpdatedMessage(s1, s));
        }
    }

    public static int println(int j, String s, String s1)
    {
        return Log.println(j, s, s1);
    }

    public static int v(String s, String s1)
    {
        return Log.v(s, s1);
    }

    public static int v(String s, String s1, Throwable throwable)
    {
        return Log.v(s, s1, throwable);
    }

    public static int w(String s, String s1)
    {
        return Log.w(s, s1);
    }

    public static int w(String s, String s1, Throwable throwable)
    {
        return Log.w(s, s1, throwable);
    }

    public static int w(String s, Throwable throwable)
    {
        return Log.w(s, "N/A", throwable);
    }

    public static int wtf(String s, String s1)
    {
        return Log.wtf(s, s1);
    }

    public static int wtf(String s, String s1, Throwable throwable)
    {
        return Log.wtf(s, s1, throwable);
    }

    public static int wtf(String s, Throwable throwable)
    {
        return Log.wtf(s, throwable);
    }

    static 
    {
        IS_FIRST_PARTY_DEBUG_BUILD = isFirstPartyDebugBuild();
    }
}
