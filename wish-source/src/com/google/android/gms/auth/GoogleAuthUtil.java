// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzr;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            UserRecoverableAuthException, GoogleAuthException, GooglePlayServicesAvailabilityException

public final class GoogleAuthUtil
{

    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    private static final ComponentName zzKA = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName zzKB = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    public static String getToken(Context context, Account account, String s)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, account, s, new Bundle());
    }

    public static String getToken(Context context, Account account, String s, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return zza(context, account, s, bundle, null);
    }

    public static String getToken(Context context, String s, String s1)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, new Account(s, "com.google"), s1);
    }

    private static void zzM(Context context)
        throws GoogleAuthException
    {
        try
        {
            GooglePlayServicesUtil.zzM(context);
            return;
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
    }

    public static String zza(Context context, Account account, String s, Bundle bundle, Boolean boolean1)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return zzb(context, account, s, bundle, boolean1).getString("authtoken");
    }

    public static Bundle zzb(Context context, Account account, String s, Bundle bundle, Boolean boolean1)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        Context context1 = context.getApplicationContext();
        zzv.zzbJ("Calling this from your main thread can lead to deadlock");
        zzM(context1);
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        context = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", context);
        if (TextUtils.isEmpty(bundle.getString(KEY_ANDROID_PACKAGE_NAME)))
        {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, context);
        }
        if (boolean1 != null)
        {
            bundle.putBoolean("UseCache", boolean1.booleanValue());
        }
        context = new zza();
        boolean1 = zzk.zzU(context1);
        if (!boolean1.zza(zzKA, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_292;
        }
        s = com.google.android.gms.internal.zzr.zza.zza(context.zzkt()).zza(account, s, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new GoogleAuthException("ServiceUnavailable");
        account;
        Log.i("GoogleAuthUtil", "GMS remote exception ", account);
        throw new IOException("remote exception");
        account;
        boolean1.zzb(zzKA, context, "GoogleAuthUtil");
        throw account;
        boolean flag = TextUtils.isEmpty(s.getString("authtoken"));
        if (!flag)
        {
            boolean1.zzb(zzKA, context, "GoogleAuthUtil");
            return s;
        }
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        if (zzbh(account))
        {
            throw new UserRecoverableAuthException(account, s);
        }
        break MISSING_BLOCK_LABEL_267;
        account;
        throw new GoogleAuthException("Interrupted");
        if (zzbg(account))
        {
            throw new IOException(account);
        } else
        {
            throw new GoogleAuthException(account);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    private static boolean zzbg(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    private static boolean zzbh(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || zzha.zzKX.zzjP().equals(s) || zzha.zzKY.zzjP().equals(s) || zzha.zzKZ.zzjP().equals(s) || zzha.zzLa.zzjP().equals(s) || zzha.zzLb.zzjP().equals(s) || zzha.zzLc.zzjP().equals(s) || zzha.zzKV.zzjP().equals(s);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        if (android.os.Build.VERSION.SDK_INT < 14);
    }
}
