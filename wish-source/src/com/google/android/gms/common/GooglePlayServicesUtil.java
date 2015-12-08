// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzhs;
import com.google.android.gms.internal.zzic;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Referenced classes of package com.google.android.gms.common:
//            zzc, SupportErrorDialogFragment, ErrorDialogFragment, GooglePlayServicesRepairableException, 
//            GooglePlayServicesNotAvailableException, zzb

public final class GooglePlayServicesUtil
{
    private static class zza extends Handler
    {

        private final Context zzoh;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 1: default 24
        //                       1 53;
               goto _L1 _L2
_L1:
            Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Don't know how to handle this message: ").append(message.what).toString());
_L4:
            return;
_L2:
            int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzoh);
            if (GooglePlayServicesUtil.isUserRecoverableError(i))
            {
                GooglePlayServicesUtil.zzb(i, zzoh);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        zza(Context context)
        {
            Looper looper;
            if (Looper.myLooper() == null)
            {
                looper = Looper.getMainLooper();
            } else
            {
                looper = Looper.myLooper();
            }
            super(looper);
            zzoh = context.getApplicationContext();
        }
    }


    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0x6fd4e8;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static boolean zzOV = false;
    public static boolean zzOW = false;
    private static int zzOX = -1;
    private static String zzOY = null;
    private static Integer zzOZ = null;
    private static final Object zznu = new Object();

    private GooglePlayServicesUtil()
    {
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j)
    {
        return getErrorDialog(i, activity, j, null);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return zza(i, activity, null, j, oncancellistener);
    }

    protected static int getErrorNotificationId(int i)
    {
        switch (i)
        {
        default:
            return 39789;

        case 1: // '\001'
        case 3: // '\003'
        case 18: // '\022'
            return 10436;
        }
    }

    public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
    {
        Intent intent = zzar(i);
        if (intent == null)
        {
            return null;
        } else
        {
            return PendingIntent.getActivity(context, j, intent, 0x10000000);
        }
    }

    public static String getErrorString(int i)
    {
        switch (i)
        {
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 17: // '\021'
        default:
            return "UNKNOWN_ERROR_CODE";

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";

        case 16: // '\020'
            return "API_UNAVAILABLE";

        case 18: // '\022'
            return "SERVICE_UPDATING";
        }
    }

    public static String getOpenSourceSoftwareLicenseInfo(Context context)
    {
        Object obj = (new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build();
        InputStream inputstream = context.getContentResolver().openInputStream(((android.net.Uri) (obj)));
        try
        {
            context = (new Scanner(inputstream)).useDelimiter("\\A").next();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (inputstream == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            try
            {
                inputstream.close();
                break MISSING_BLOCK_LABEL_97;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                obj = null;
            }
            break MISSING_BLOCK_LABEL_95;
        }
        finally
        {
            if (inputstream == null) goto _L0; else goto _L0
        }
        obj = context;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        inputstream.close();
        return context;
        inputstream.close();
        throw context;
        return ((String) (obj));
        return null;
    }

    public static Context getRemoteContext(Context context)
    {
        try
        {
            context = context.createPackageContext("com.google.android.gms", 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Resources getRemoteResource(Context context)
    {
        try
        {
            context = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static int isGooglePlayServicesAvailable(Context context)
    {
        Object obj;
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        zzc zzc1;
        if (!zzd.zzSV)
        {
            try
            {
                context.getResources().getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            }
        }
        if (!zzd.zzSV && !"com.google.android.gms".equals(context.getPackageName()))
        {
            zzO(context);
        }
        try
        {
            obj = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        zzc1 = com.google.android.gms.common.zzc.zzkz();
        if (zzhs.zzbj(((PackageInfo) (obj)).versionCode) || zzhs.zzV(context))
        {
            if (zzc1.zza(((PackageInfo) (obj)), zzb.zzbd.zzOU) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_248;
        }
        Object obj1;
        try
        {
            obj1 = zzc1.zza(packagemanager.getPackageInfo("com.android.vending", 64), zzb.zzbd.zzOU);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (zzh(context, "com.android.vending"))
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if (zzc1.zza(((PackageInfo) (obj)), zzb.zzbd.zzOU) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_248;
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (zzc1.zza(((PackageInfo) (obj)), new zzb.zza[] {
    obj1
}) != null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i = zzhs.zzbh(0x6fd4e8);
        if (zzhs.zzbh(((PackageInfo) (obj)).versionCode) < i)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Google Play services out of date.  Requires 7329000 but found ").append(((PackageInfo) (obj)).versionCode).toString());
            return 2;
        }
        obj = ((PackageInfo) (obj)).applicationInfo;
        context = ((Context) (obj));
        if (obj == null)
        {
            try
            {
                context = packagemanager.getApplicationInfo("com.google.android.gms", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                context.printStackTrace();
                return 1;
            }
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static boolean isUserRecoverableError(int i)
    {
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 9: // '\t'
            return true;
        }
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int j)
    {
        return showErrorDialogFragment(i, activity, j, null);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return showErrorDialogFragment(i, activity, null, j, oncancellistener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        boolean flag;
        flag = false;
        fragment = zza(i, activity, fragment, j, oncancellistener);
        if (fragment == null)
        {
            return false;
        }
        boolean flag1 = activity instanceof FragmentActivity;
        flag = flag1;
_L2:
        if (flag)
        {
            activity = ((FragmentActivity)activity).getSupportFragmentManager();
            SupportErrorDialogFragment.newInstance(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        if (zzic.zznd())
        {
            activity = activity.getFragmentManager();
            ErrorDialogFragment.newInstance(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void showErrorNotification(int i, Context context)
    {
        int j = i;
        if (zzhs.zzV(context))
        {
            j = i;
            if (i == 2)
            {
                j = 42;
            }
        }
        if (zze(context, j) || zzf(context, j))
        {
            zzP(context);
            return;
        } else
        {
            zza(j, context);
            return;
        }
    }

    public static void zzM(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        int i = isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            context = zzar(i);
            Log.e("GooglePlayServicesUtil", (new StringBuilder()).append("GooglePlayServices not available due to error ").append(i).toString());
            if (context == null)
            {
                throw new GooglePlayServicesNotAvailableException(i);
            } else
            {
                throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    private static void zzO(Context context)
    {
        Object obj = zznu;
        obj;
        JVM INSTR monitorenter ;
        if (zzOY != null) goto _L2; else goto _L1
_L1:
        zzOY = context.getPackageName();
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (context == null) goto _L4; else goto _L3
_L3:
        zzOZ = Integer.valueOf(context.getInt("com.google.android.gms.version"));
_L5:
        context = zzOZ;
        obj;
        JVM INSTR monitorexit ;
        if (context == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_164;
_L4:
        zzOZ = null;
          goto _L5
        context;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", context);
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (zzOY.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '").append(zzOY).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (context.intValue() != 0x6fd4e8)
        {
            throw new IllegalStateException((new StringBuilder()).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 7329000 but found ").append(context).append(".  You must have the").append(" following declaration within the <application> element: ").append("    <meta-data android:name=\"").append("com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
        } else
        {
            return;
        }
    }

    private static void zzP(Context context)
    {
        context = new zza(context);
        context.sendMessageDelayed(context.obtainMessage(1), 0x1d4c0L);
    }

    public static void zzQ(Context context)
    {
        try
        {
            ((NotificationManager)context.getSystemService("notification")).cancel(10436);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static String zzR(Context context)
    {
        String s1 = context.getApplicationInfo().name;
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = context.getPackageName();
            PackageManager packagemanager = context.getApplicationContext().getPackageManager();
            try
            {
                context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context != null)
            {
                s = packagemanager.getApplicationLabel(context).toString();
            }
        }
        return s;
    }

    private static Dialog zza(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        android.app.AlertDialog.Builder builder1 = null;
        if (i == 0)
        {
            return null;
        }
        int k = i;
        if (zzhs.zzV(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        android.app.AlertDialog.Builder builder = builder1;
        if (zzic.zzng())
        {
            TypedValue typedvalue = new TypedValue();
            activity.getTheme().resolveAttribute(0x1010309, typedvalue, true);
            builder = builder1;
            if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedvalue.resourceId)))
            {
                builder = new android.app.AlertDialog.Builder(activity, 5);
            }
        }
        builder1 = builder;
        if (builder == null)
        {
            builder1 = new android.app.AlertDialog.Builder(activity);
        }
        builder1.setMessage(com.google.android.gms.common.internal.zzf.zzh(activity, k));
        if (oncancellistener != null)
        {
            builder1.setOnCancelListener(oncancellistener);
        }
        oncancellistener = zzar(k);
        if (fragment == null)
        {
            fragment = new zzg(activity, oncancellistener, j);
        } else
        {
            fragment = new zzg(fragment, oncancellistener, j);
        }
        oncancellistener = com.google.android.gms.common.internal.zzf.zzi(activity, k);
        if (oncancellistener != null)
        {
            builder1.setPositiveButton(oncancellistener, fragment);
        }
        activity = com.google.android.gms.common.internal.zzf.zzg(activity, k);
        if (activity != null)
        {
            builder1.setTitle(activity);
        }
        return builder1.create();
    }

    private static void zza(int i, Context context)
    {
        zza(i, context, null);
    }

    private static void zza(int i, Context context, String s)
    {
        Object obj = context.getResources();
        String s1 = com.google.android.gms.common.internal.zzf.zzj(context, i);
        String s2 = ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_error_notification_requested_by_msg, new Object[] {
            zzR(context)
        });
        PendingIntent pendingintent = getErrorPendingIntent(i, context, 0);
        if (zzhs.zzV(context))
        {
            zzv.zzP(zzic.zznh());
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(com.google.android.gms.R.drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(s1).append(" ").append(s2).toString())).addAction(com.google.android.gms.R.drawable.common_full_open_on_phone, ((Resources) (obj)).getString(com.google.android.gms.R.string.common_open_on_phone), pendingintent).build();
        } else
        {
            obj = new Notification(0x108008a, ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_notification_ticker), System.currentTimeMillis());
            obj.flags = ((Notification) (obj)).flags | 0x10;
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                obj.flags = ((Notification) (obj)).flags | 0x100;
            } else
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                ((Notification) (obj)).extras.putBoolean("android.support.localOnly", true);
            }
            ((Notification) (obj)).setLatestEventInfo(context, s1, s2, pendingintent);
        }
        context = (NotificationManager)context.getSystemService("notification");
        if (s != null)
        {
            context.notify(s, getErrorNotificationId(i), ((Notification) (obj)));
            return;
        } else
        {
            context.notify(getErrorNotificationId(i), ((Notification) (obj)));
            return;
        }
    }

    public static boolean zza(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!zzic.zznj())
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(i, s);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
                flag = true;
            }
            return flag;
        }
        context = context.getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (s == null)
        {
            continue;
        }
        flag = flag1;
        if (context == null)
        {
            continue;
        }
        i = 0;
        do
        {
            flag = flag1;
            if (i >= context.length)
            {
                continue;
            }
            if (s.equals(context[i]))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_28;
_L1:
    }

    public static Intent zzar(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 18: // '\022'
            return zzm.zzbQ("com.google.android.gms");

        case 42: // '*'
            return zzm.zzmj();

        case 3: // '\003'
            return zzm.zzbO("com.google.android.gms");
        }
    }

    static void zzb(int i, Context context)
    {
        zza(i, context);
    }

    public static boolean zzb(PackageManager packagemanager)
    {
        Object obj = zznu;
        obj;
        JVM INSTR monitorenter ;
        int i = zzOX;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        if (com.google.android.gms.common.zzc.zzkz().zza(packagemanager, new zzb.zza[] {
            zzb.zzON[1]
        }) == null) goto _L4; else goto _L3
_L3:
        zzOX = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return zzOX != 0;
_L4:
        zzOX = 0;
          goto _L2
        packagemanager;
        zzOX = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static boolean zzb(PackageManager packagemanager, String s)
    {
        return com.google.android.gms.common.zzc.zzkz().zzb(packagemanager, s);
    }

    public static boolean zzc(PackageManager packagemanager)
    {
        return zzb(packagemanager) || !zzky();
    }

    public static boolean zzd(Context context, int i)
    {
        return zza(context, i, "com.google.android.gms") && zzb(context.getPackageManager(), "com.google.android.gms");
    }

    public static boolean zze(Context context, int i)
    {
        if (i == 18)
        {
            return true;
        }
        if (i == 1)
        {
            return zzh(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static boolean zzf(Context context, int i)
    {
        if (i == 9)
        {
            return zzh(context, "com.android.vending");
        } else
        {
            return false;
        }
    }

    public static boolean zzh(Context context, String s)
    {
        if (zzic.zznl())
        {
            context = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break MISSING_BLOCK_LABEL_76;
                }
            } while (!s.equals(((android.content.pm.PackageInstaller.SessionInfo)context.next()).getAppPackageName()));
            return true;
        }
        context = context.getPackageManager();
        boolean flag = context.getApplicationInfo(s, 8192).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_76;
        context;
        return false;
    }

    public static boolean zzky()
    {
        if (zzOV)
        {
            return zzOW;
        } else
        {
            return "user".equals(Build.TYPE);
        }
    }

}
