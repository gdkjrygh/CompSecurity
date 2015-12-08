// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.kahuna.sdk:
//            GCMRegistrationManager, KahunaPushReceiver

public final class GCMRegistrar
{

    public static final long DEFAULT_ON_SERVER_LIFESPAN_MS = 0x240c8400L;
    private static final String GSF_PACKAGE = "com.google.android.gsf";
    private static final String PROPERTY_APP_VERSION = "appVersion";
    private static final String PROPERTY_ON_SERVER = "onServer";
    private static final String PROPERTY_ON_SERVER_EXPIRATION_TIME = "onServerExpirationTime";
    private static final String PROPERTY_ON_SERVER_LIFESPAN = "onServerLifeSpan";
    private static final String PROPERTY_REG_ID = "regId";
    private static final String TAG = "GCMRegistrar";
    private static PendingIntent sAppPendingIntent;
    private static KahunaPushReceiver sRetryReceiver;
    private static String sRetryReceiverClassName;
    private static Context sRetryReceiverContext;

    private GCMRegistrar()
    {
        throw new UnsupportedOperationException();
    }

    static void cancelAppPendingIntent()
    {
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorenter ;
        if (sAppPendingIntent != null)
        {
            sAppPendingIntent.cancel();
            sAppPendingIntent = null;
        }
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void checkDevice(Context context)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 8)
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Device must be at least API Level 8 (instead of ").append(i).append(")").toString());
        }
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo("com.google.android.gsf", 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
        }
    }

    public static void checkManifest(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        Object obj = context.getPackageName();
        Object obj1 = (new StringBuilder()).append(((String) (obj))).append(".permission.C2D_MESSAGE").toString();
        try
        {
            packagemanager.getPermissionInfo(((String) (obj1)), 4096);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append("Application does not define permission ").append(((String) (obj1))).toString());
        }
        try
        {
            obj1 = packagemanager.getPackageInfo(((String) (obj)), 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append("Could not get receivers for package ").append(((String) (obj))).toString());
        }
        obj1 = ((PackageInfo) (obj1)).receivers;
        if (obj1 == null || obj1.length == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("No receiver for package ").append(((String) (obj))).toString());
        }
        log(context, 2, "number of receivers for %s: %d", new Object[] {
            obj, Integer.valueOf(obj1.length)
        });
        obj = new HashSet();
        int j = obj1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj2 = obj1[i];
            if ("com.google.android.c2dm.permission.SEND".equals(((ActivityInfo) (obj2)).permission))
            {
                ((Set) (obj)).add(((ActivityInfo) (obj2)).name);
            }
        }

        if (((Set) (obj)).isEmpty())
        {
            throw new IllegalStateException("No receiver allowed to receive com.google.android.c2dm.permission.SEND");
        } else
        {
            checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.REGISTRATION");
            checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.RECEIVE");
            return;
        }
    }

    private static void checkReceiver(Context context, Set set, String s)
    {
        Object obj = context.getPackageManager();
        String s1 = context.getPackageName();
        Intent intent = new Intent(s);
        intent.setPackage(s1);
        obj = ((PackageManager) (obj)).queryBroadcastReceivers(intent, 32);
        if (((List) (obj)).isEmpty())
        {
            throw new IllegalStateException((new StringBuilder()).append("No receivers for action ").append(s).toString());
        }
        log(context, 2, "Found %d receivers for action %s", new Object[] {
            Integer.valueOf(((List) (obj)).size()), s
        });
        for (context = ((List) (obj)).iterator(); context.hasNext();)
        {
            s = ((ResolveInfo)context.next()).activityInfo.name;
            if (!set.contains(s))
            {
                throw new IllegalStateException((new StringBuilder()).append("Receiver ").append(s).append(" is not set with permission ").append("com.google.android.c2dm.permission.SEND").toString());
            }
        }

    }

    static String clearRegistrationId(Context context)
    {
        setRegisteredOnServer(context, null, 0L);
        return setRegistrationId(context, "");
    }

    private static int getAppVersion(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Coult not get package name: ").append(context).toString());
        }
        return i;
    }

    static transient String getFlatSenderIds(String as[])
    {
        if (as == null || as.length == 0 || as[0] == null)
        {
            Log.w("Kahuna", "App is configured for Push, but you need to call onAppCreate() in your Application to prevent strange behavior!");
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        for (int i = 1; i < as.length; i++)
        {
            stringbuilder.append(',').append(as[i]);
        }

        return stringbuilder.toString();
    }

    private static SharedPreferences getGCMPreferences(Context context)
    {
        return GCMRegistrationManager.getGCMPreferences(context);
    }

    public static long getRegisterOnServerLifespan(Context context)
    {
        return getGCMPreferences(context).getLong("onServerLifeSpan", 0x240c8400L);
    }

    public static String getRegistrationId(Context context)
    {
        Object obj = getGCMPreferences(context);
        String s = ((SharedPreferences) (obj)).getString("regId", "");
        int i = ((SharedPreferences) (obj)).getInt("appVersion", 0x80000000);
        int j = getAppVersion(context);
        obj = s;
        if (i != 0x80000000)
        {
            obj = s;
            if (i != j)
            {
                log(context, 2, "App version changed from %d to %d;resetting registration id", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(j)
                });
                clearRegistrationId(context);
                obj = "";
            }
        }
        return ((String) (obj));
    }

    static transient void internalRegister(Context context, String as[])
    {
        as = getFlatSenderIds(as);
        log(context, 2, "Registering app for senders %s", new Object[] {
            as
        });
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        setPackageNameExtra(context, intent);
        intent.putExtra("sender", as);
        context.startService(intent);
    }

    static void internalUnregister(Context context)
    {
        log(context, 2, "Unregistering app", new Object[0]);
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage("com.google.android.gsf");
        setPackageNameExtra(context, intent);
        context.startService(intent);
    }

    public static boolean isRegistered(Context context)
    {
        return getRegistrationId(context).length() > 0;
    }

    public static boolean isRegisteredOnServer(Context context)
    {
        SharedPreferences sharedpreferences = getGCMPreferences(context);
        boolean flag1 = sharedpreferences.getBoolean("onServer", false);
        log(context, 2, "Is registered on server: %b", new Object[] {
            Boolean.valueOf(flag1)
        });
        boolean flag = flag1;
        if (flag1)
        {
            long l = sharedpreferences.getLong("onServerExpirationTime", -1L);
            flag = flag1;
            if (System.currentTimeMillis() > l)
            {
                log(context, 2, "flag expired on: %s", new Object[] {
                    new Timestamp(l)
                });
                flag = false;
            }
        }
        return flag;
    }

    private static transient void log(Context context, int i, String s, Object aobj[])
    {
        if (Log.isLoggable("GCMRegistrar", i))
        {
            s = String.format(s, aobj);
            Log.println(i, "GCMRegistrar", (new StringBuilder()).append("[").append(context.getPackageName()).append("]: ").append(s).toString());
        }
    }

    public static void onDestroy(Context context)
    {
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorenter ;
        if (sRetryReceiver != null)
        {
            log(context, 2, "Unregistering retry receiver", new Object[0]);
            sRetryReceiverContext.unregisterReceiver(sRetryReceiver);
            sRetryReceiver = null;
            sRetryReceiverContext = null;
        }
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static transient void register(Context context, String as[])
    {
        GCMRegistrationManager.resetBackoff(context);
        internalRegister(context, as);
    }

    private static void setPackageNameExtra(Context context, Intent intent)
    {
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorenter ;
        if (sAppPendingIntent == null)
        {
            log(context, 2, "Creating pending intent to get package name", new Object[0]);
            sAppPendingIntent = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
        }
        intent.putExtra("app", sAppPendingIntent);
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void setRegisterOnServerLifespan(Context context, long l)
    {
        context = getGCMPreferences(context).edit();
        context.putLong("onServerLifeSpan", l);
        context.commit();
    }

    private static void setRegisteredOnServer(Context context, Boolean boolean1, long l)
    {
        android.content.SharedPreferences.Editor editor = getGCMPreferences(context).edit();
        if (boolean1 != null)
        {
            editor.putBoolean("onServer", boolean1.booleanValue());
            log(context, 2, "Setting registeredOnServer flag as %b until %s", new Object[] {
                boolean1, new Timestamp(l)
            });
        } else
        {
            log(context, 2, "Setting registeredOnServer expiration to %s", new Object[] {
                new Timestamp(l)
            });
        }
        editor.putLong("onServerExpirationTime", l);
        editor.commit();
    }

    public static void setRegisteredOnServer(Context context, boolean flag)
    {
        long l = getRegisterOnServerLifespan(context);
        setRegisteredOnServer(context, Boolean.valueOf(flag), System.currentTimeMillis() + l);
    }

    static String setRegistrationId(Context context, String s)
    {
        SharedPreferences sharedpreferences = getGCMPreferences(context);
        String s1 = sharedpreferences.getString("regId", "");
        int i = getAppVersion(context);
        log(context, 2, "Saving regId on app version %d", new Object[] {
            Integer.valueOf(i)
        });
        context = sharedpreferences.edit();
        context.putString("regId", s);
        context.putInt("appVersion", i);
        context.commit();
        return s1;
    }

    static void setRetryBroadcastReceiver(Context context)
    {
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorenter ;
        if (sRetryReceiver != null) goto _L2; else goto _L1
_L1:
        if (sRetryReceiverClassName != null) goto _L4; else goto _L3
_L3:
        log(context, 6, "internal error: retry receiver class not set yet", new Object[0]);
        sRetryReceiver = new KahunaPushReceiver();
_L5:
        String s = context.getPackageName();
        IntentFilter intentfilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
        intentfilter.addCategory(s);
        log(context, 2, "Registering retry receiver", new Object[0]);
        sRetryReceiverContext = context;
        sRetryReceiverContext.registerReceiver(sRetryReceiver, intentfilter);
_L2:
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorexit ;
        return;
_L4:
        sRetryReceiver = (KahunaPushReceiver)Class.forName(sRetryReceiverClassName).newInstance();
          goto _L5
        Exception exception;
        exception;
        log(context, 6, "Could not create instance of %s. Using %s directly.", new Object[] {
            sRetryReceiverClassName, com/kahuna/sdk/KahunaPushReceiver.getName()
        });
        sRetryReceiver = new KahunaPushReceiver();
          goto _L5
        context;
        throw context;
    }

    static void setRetryReceiverClassName(Context context, String s)
    {
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorenter ;
        log(context, 2, "Setting the name of retry receiver class to %s", new Object[] {
            s
        });
        sRetryReceiverClassName = s;
        com/kahuna/sdk/GCMRegistrar;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void unregister(Context context)
    {
        GCMRegistrationManager.resetBackoff(context);
        internalUnregister(context);
    }
}
