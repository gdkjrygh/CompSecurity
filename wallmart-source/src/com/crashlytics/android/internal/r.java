// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.crashlytics.android.internal:
//            q, ab, y, v

public class r
    implements q
{

    public r()
    {
    }

    public static int a(int i)
    {
        if (i < 200 || i > 299)
        {
            if (i >= 300 && i <= 399)
            {
                return 1;
            }
            if (i < 400 || i > 499)
            {
                return i < 500 ? 1 : 1;
            }
        }
        return 0;
    }

    static Activity a(Context context)
    {
        if (context instanceof Activity)
        {
            return (Activity)context;
        } else
        {
            return null;
        }
    }

    public static String a(Context context, boolean flag)
    {
        Object obj;
        obj = context.getApplicationContext();
        String s = ((Context) (obj)).getPackageName();
        obj = ((Context) (obj)).getPackageManager().getApplicationInfo(s, 128).metaData;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Bundle) (obj)).getString("com.crashlytics.ApiKey");
_L4:
        Object obj1;
        obj1 = obj;
        if (ab.e(((String) (obj))))
        {
            int i = ab.a(context, "com.crashlytics.ApiKey", "string");
            obj1 = obj;
            if (i != 0)
            {
                obj1 = context.getResources().getString(i);
            }
        }
        if (!ab.e(((String) (obj1))))
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (flag || ab.f(context))
        {
            throw new IllegalArgumentException("Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
        }
        break; /* Loop/switch isn't completed */
        obj;
        y.a().b().a("Crashlytics", (new StringBuilder("Caught non-fatal exception while retrieving apiKey: ")).append(obj).toString());
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        y.a().b().a("Crashlytics", "Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>", null);
        return ((String) (obj1));
    }

    static Application b(Context context)
    {
        if (context instanceof Application)
        {
            return (Application)context;
        }
        if (context instanceof Activity)
        {
            return ((Activity)context).getApplication();
        }
        if (context instanceof Service)
        {
            return ((Service)context).getApplication();
        }
        if (context.getApplicationContext() instanceof Application)
        {
            return (Application)context.getApplicationContext();
        } else
        {
            return null;
        }
    }

    private static boolean b(int i)
    {
        return y.a().g() <= i;
    }

    public final void a(int i, String s, String s1)
    {
        a(i, s, s1, false);
    }

    public final void a(int i, String s, String s1, boolean flag)
    {
        if (flag || b(i))
        {
            Log.println(i, s, s1);
        }
    }

    public final void a(String s, String s1)
    {
        if (b(3))
        {
            Log.d(s, s1, null);
        }
    }

    public final void a(String s, String s1, Throwable throwable)
    {
        if (b(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public final void b(String s, String s1)
    {
        if (b(4))
        {
            Log.i(s, s1, null);
        }
    }

    public final void c(String s, String s1)
    {
        if (b(5))
        {
            Log.w(s, s1, null);
        }
    }

    public final void d(String s, String s1)
    {
        a(s, s1, ((Throwable) (null)));
    }
}
