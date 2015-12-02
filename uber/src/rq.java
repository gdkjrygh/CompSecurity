// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

public final class rq
{

    public static final String a = "callerUid";
    public static final String b = "androidPackageName";
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    private static String a(Context context, Account account, String s, Bundle bundle)
    {
        return b(context, account, s, bundle);
    }

    public static String a(Context context, String s, String s1, Bundle bundle)
    {
        return a(context, new Account(s, "com.google"), s1, bundle);
    }

    private static void a(Context context)
    {
        try
        {
            rz.b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new rr(context.a(), context.getMessage(), context.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new rp(context.getMessage());
        }
    }

    public static void a(Context context, String s)
    {
        Object obj;
        Object obj1;
        obj = context.getApplicationContext();
        wn.c("Calling this from your main thread can lead to deadlock");
        a(((Context) (obj)));
        obj1 = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj1)).putString("clientPackageName", context);
        if (!((Bundle) (obj1)).containsKey(b))
        {
            ((Bundle) (obj1)).putString(b, context);
        }
        context = new xh();
        obj = vq.a(((Context) (obj)));
        if (!((vq) (obj)).a(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_173;
        }
        s = aqb.a(context.a()).a(s, ((Bundle) (obj1)));
        obj1 = s.getString(alc.W);
        if (!s.getBoolean("booleanResult"))
        {
            throw new rp(((String) (obj1)));
        }
        break MISSING_BLOCK_LABEL_153;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        ((vq) (obj)).a(c, context);
        throw s;
        ((vq) (obj)).a(c, context);
        return;
        s;
        throw new rp("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    private static boolean a(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    private static String b(Context context, Account account, String s, Bundle bundle)
    {
        return c(context, account, s, bundle).getString("authtoken");
    }

    private static boolean b(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || alc.u.a().equals(s) || alc.v.a().equals(s) || alc.w.a().equals(s) || alc.x.a().equals(s) || alc.y.a().equals(s) || alc.z.a().equals(s) || alc.s.a().equals(s);
    }

    private static Bundle c(Context context, Account account, String s, Bundle bundle)
    {
        Object obj;
        obj = context.getApplicationContext();
        wn.c("Calling this from your main thread can lead to deadlock");
        a(((Context) (obj)));
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        context = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", context);
        if (TextUtils.isEmpty(bundle.getString(b)))
        {
            bundle.putString(b, context);
        }
        context = new xh();
        obj = vq.a(((Context) (obj)));
        if (!((vq) (obj)).a(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        s = aqb.a(context.a()).a(account, s, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new rp("ServiceUnavailable");
        account;
        Log.i("GoogleAuthUtil", "GMS remote exception ", account);
        throw new IOException("remote exception");
        account;
        ((vq) (obj)).a(c, context);
        throw account;
        boolean flag = TextUtils.isEmpty(s.getString("authtoken"));
        if (!flag)
        {
            ((vq) (obj)).a(c, context);
            return s;
        }
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        if (b(account))
        {
            throw new rs(account, s);
        }
        break MISSING_BLOCK_LABEL_249;
        account;
        throw new rp("Interrupted");
        if (a(account))
        {
            throw new IOException(account);
        } else
        {
            throw new rp(account);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        if (android.os.Build.VERSION.SDK_INT < 14);
    }
}
