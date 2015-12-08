// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentResolver;
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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.zzau;
import com.google.android.gms.internal.zzjr;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            GooglePlayServicesAvailabilityException, GoogleAuthException, AccountChangeEventsRequest, AccountChangeEventsResponse, 
//            UserRecoverableAuthException, UserRecoverableNotifiedException

public final class GoogleAuthUtil
{

    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    private static final ComponentName zzOB = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName zzOC = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    private GoogleAuthUtil()
    {
    }

    public static void clearToken(Context context, String s)
        throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
    {
        Object obj;
        Object obj1;
        obj = context.getApplicationContext();
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        zzY(((Context) (obj)));
        obj1 = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj1)).putString("clientPackageName", context);
        if (!((Bundle) (obj1)).containsKey(KEY_ANDROID_PACKAGE_NAME))
        {
            ((Bundle) (obj1)).putString(KEY_ANDROID_PACKAGE_NAME, context);
        }
        context = new zza();
        obj = zzk.zzah(((Context) (obj)));
        if (!((zzk) (obj)).zza(zzOB, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        s = com.google.android.gms.internal.zzau.zza.zza(context.zzmh()).zza(s, ((Bundle) (obj1)));
        obj1 = s.getString("Error");
        if (!s.getBoolean("booleanResult"))
        {
            throw new GoogleAuthException(((String) (obj1)));
        }
        break MISSING_BLOCK_LABEL_154;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        ((zzk) (obj)).zzb(zzOB, context, "GoogleAuthUtil");
        throw s;
        ((zzk) (obj)).zzb(zzOB, context, "GoogleAuthUtil");
        return;
        s;
        throw new GoogleAuthException("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    public static List getAccountChangeEvents(Context context, int i, String s)
        throws GoogleAuthException, IOException
    {
        Object obj;
        zzu.zzh(s, "accountName must be provided");
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        obj = context.getApplicationContext();
        zzY(((Context) (obj)));
        context = new zza();
        obj = zzk.zzah(((Context) (obj)));
        if (!((zzk) (obj)).zza(zzOB, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        s = com.google.android.gms.internal.zzau.zza.zza(context.zzmh()).zza((new AccountChangeEventsRequest()).setAccountName(s).setEventIndex(i)).getEvents();
        ((zzk) (obj)).zzb(zzOB, context, "GoogleAuthUtil");
        return s;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        ((zzk) (obj)).zzb(zzOB, context, "GoogleAuthUtil");
        throw s;
        s;
        throw new GoogleAuthException("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String getAccountId(Context context, String s)
        throws GoogleAuthException, IOException
    {
        zzu.zzh(s, "accountName must be provided");
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        zzY(context.getApplicationContext());
        return getToken(context, s, "^^_account_id_^^", new Bundle());
    }

    public static String getToken(Context context, Account account, String s)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, account, s, new Bundle());
    }

    public static String getToken(Context context, Account account, String s, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return zza(context, account, s, bundle).getString("authtoken");
    }

    public static String getToken(Context context, String s, String s1)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, new Account(s, "com.google"), s1);
    }

    public static String getToken(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, new Account(s, "com.google"), s1, bundle);
    }

    public static String getTokenWithNotification(Context context, Account account, String s, Bundle bundle)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putBoolean("handle_notification", true);
        return zzb(context, account, s, bundle1);
    }

    public static String getTokenWithNotification(Context context, Account account, String s, Bundle bundle, Intent intent)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        zzi(intent);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putParcelable("callback_intent", intent);
        bundle1.putBoolean("handle_notification", true);
        return zzb(context, account, s, bundle1);
    }

    public static String getTokenWithNotification(Context context, Account account, String s, Bundle bundle, String s1, Bundle bundle1)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Authority cannot be empty or null.");
        }
        Bundle bundle2 = bundle;
        if (bundle == null)
        {
            bundle2 = new Bundle();
        }
        bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle);
        bundle2.putString("authority", s1);
        bundle2.putBundle("sync_extras", bundle);
        bundle2.putBoolean("handle_notification", true);
        return zzb(context, account, s, bundle2);
    }

    public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        return getTokenWithNotification(context, new Account(s, "com.google"), s1, bundle);
    }

    public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle, Intent intent)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        return getTokenWithNotification(context, new Account(s, "com.google"), s1, bundle, intent);
    }

    public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle, String s2, Bundle bundle1)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        return getTokenWithNotification(context, new Account(s, "com.google"), s1, bundle, s2, bundle1);
    }

    public static void invalidateToken(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    private static void zzY(Context context)
        throws GoogleAuthException
    {
        try
        {
            GooglePlayServicesUtil.zzY(context);
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

    public static Bundle zza(Context context, Account account, String s, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        Object obj;
        obj = context.getApplicationContext();
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        zzY(((Context) (obj)));
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
        context = new zza();
        obj = zzk.zzah(((Context) (obj)));
        if (!((zzk) (obj)).zza(zzOB, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_279;
        }
        s = com.google.android.gms.internal.zzau.zza.zza(context.zzmh()).zza(account, s, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new GoogleAuthException("ServiceUnavailable");
        account;
        Log.i("GoogleAuthUtil", "GMS remote exception ", account);
        throw new IOException("remote exception");
        account;
        ((zzk) (obj)).zzb(zzOB, context, "GoogleAuthUtil");
        throw account;
        boolean flag = TextUtils.isEmpty(s.getString("authtoken"));
        if (!flag)
        {
            ((zzk) (obj)).zzb(zzOB, context, "GoogleAuthUtil");
            return s;
        }
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        if (zzbv(account))
        {
            throw new UserRecoverableAuthException(account, s);
        }
        break MISSING_BLOCK_LABEL_254;
        account;
        throw new GoogleAuthException("Interrupted");
        if (zzbu(account))
        {
            throw new IOException(account);
        } else
        {
            throw new GoogleAuthException(account);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    private static String zzb(Context context, Account account, String s, Bundle bundle)
        throws IOException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        try
        {
            account = getToken(context, account, s, bundle1);
            GooglePlayServicesUtil.zzac(context);
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            GooglePlayServicesUtil.showErrorNotification(account.getConnectionStatusCode(), context);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            GooglePlayServicesUtil.zzac(context);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        return account;
    }

    private static boolean zzbu(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    private static boolean zzbv(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || zzjr.zzPR.zzld().equals(s) || zzjr.zzPS.zzld().equals(s) || zzjr.zzPT.zzld().equals(s) || zzjr.zzPU.zzld().equals(s) || zzjr.zzPV.zzld().equals(s) || zzjr.zzPW.zzld().equals(s) || zzjr.zzPP.zzld().equals(s);
    }

    private static void zzi(Intent intent)
    {
        if (intent == null)
        {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        intent = intent.toUri(1);
        try
        {
            Intent.parseUri(intent, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        if (android.os.Build.VERSION.SDK_INT < 14);
    }
}
