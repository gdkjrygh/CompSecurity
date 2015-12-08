// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.jy;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            GooglePlayServicesAvailabilityException, GoogleAuthException, UserRecoverableAuthException

public final class a
{

    public static final String a = "callerUid";
    public static final String b = "androidPackageName";
    private static final ComponentName c;
    private static final ComponentName d;
    private static final Intent e;
    private static final Intent f;

    public static String a(Context context, String s, String s1)
    {
        return a(context, s, s1, new Bundle());
    }

    private static String a(Context context, String s, String s1, Bundle bundle)
    {
        Context context1;
        context1 = context.getApplicationContext();
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
        }
        boolean flag1;
        try
        {
            com.google.android.gms.common.e.b(context1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesAvailabilityException(context.getConnectionStatusCode(), context.getMessage(), context.getIntent());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GoogleAuthException(context.getMessage());
        }
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        context = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", context);
        if (!bundle.containsKey(b))
        {
            bundle.putString(b, context);
        }
        context = new f();
        if (!context1.bindService(e, context, 1))
        {
            break MISSING_BLOCK_LABEL_387;
        }
        s = jy.a(context.a()).a(s, s1, bundle);
        s1 = s.getString("authtoken");
        flag1 = TextUtils.isEmpty(s1);
        if (!flag1)
        {
            context1.unbindService(context);
            return s1;
        }
        s1 = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        boolean flag;
        if (!"BadAuthentication".equals(s1) && !"CaptchaRequired".equals(s1) && !"DeviceManagementRequiredOrSyncDisabled".equals(s1) && !"NeedPermission".equals(s1) && !"NeedsBrowser".equals(s1) && !"UserCancel".equals(s1) && !"AppDownloadRequired".equals(s1))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        throw new UserRecoverableAuthException(s1, s);
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        context1.unbindService(context);
        throw s;
        if (!"NetworkError".equals(s1) && !"ServiceUnavailable".equals(s1) && !"Timeout".equals(s1))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        throw new IOException(s1);
        s;
        throw new GoogleAuthException("Interrupted");
        throw new GoogleAuthException(s1);
        throw new IOException("Could not bind to service with the given context.");
    }

    public static void a(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        i = android.os.Build.VERSION.SDK_INT;
        c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        e = (new Intent()).setPackage("com.google.android.gms").setComponent(c);
        f = (new Intent()).setPackage("com.google.android.gms").setComponent(d);
    }
}
