// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

class com.google.android.gms.gcm.zza
{
    private class zza extends IllegalArgumentException
    {

        final com.google.android.gms.gcm.zza zzavG;

        private zza(String s)
        {
            zzavG = com.google.android.gms.gcm.zza.this;
            super(s);
        }

    }


    static com.google.android.gms.gcm.zza zzavF;
    private Context mContext;

    private com.google.android.gms.gcm.zza(Context context)
    {
        mContext = context.getApplicationContext();
    }

    private void zza(String s, Notification notification)
    {
        if (Log.isLoggable("GcmNotification", 3))
        {
            Log.d("GcmNotification", "Showing notification");
        }
        NotificationManager notificationmanager = (NotificationManager)mContext.getSystemService("notification");
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = (new StringBuilder()).append("GCM-Notification:").append(SystemClock.uptimeMillis()).toString();
        }
        notificationmanager.notify(s1, 0, notification);
    }

    static com.google.android.gms.gcm.zza zzar(Context context)
    {
        com/google/android/gms/gcm/zza;
        JVM INSTR monitorenter ;
        if (zzavF == null)
        {
            zzavF = new com.google.android.gms.gcm.zza(context);
        }
        context = zzavF;
        com/google/android/gms/gcm/zza;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static String zzb(Bundle bundle, String s)
    {
        String s2 = bundle.getString(s);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = bundle.getString(s.replace("gcm.n.", "gcm.notification."));
        }
        return s1;
    }

    private int zzda(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new zza("Missing icon");
        }
        Resources resources = mContext.getResources();
        int i = resources.getIdentifier(s, "drawable", mContext.getPackageName());
        if (i == 0)
        {
            int j = resources.getIdentifier(s, "mipmap", mContext.getPackageName());
            i = j;
            if (j == 0)
            {
                throw new zza((new StringBuilder()).append("Icon resource not found: ").append(s).toString());
            }
        }
        return i;
    }

    private Uri zzdb(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        if ("default".equals(s))
        {
            return RingtoneManager.getDefaultUri(2);
        } else
        {
            throw new zza((new StringBuilder()).append("Invalid sound: ").append(s).toString());
        }
    }

    static boolean zzt(Bundle bundle)
    {
        return zzb(bundle, "gcm.n.title") != null;
    }

    private Notification zzv(Bundle bundle)
    {
        Object obj = zzb(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new zza("Missing title");
        }
        String s = zzb(bundle, "gcm.n.body");
        int i = zzda(zzb(bundle, "gcm.n.icon"));
        Uri uri = zzdb(zzb(bundle, "gcm.n.sound"));
        PendingIntent pendingintent = zzw(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj = (new android.app.Notification.Builder(mContext)).setAutoCancel(true).setSmallIcon(i).setContentTitle(((CharSequence) (obj))).setContentText(s);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                bundle = zzb(bundle, "gcm.n.color");
                if (!TextUtils.isEmpty(bundle))
                {
                    ((android.app.Notification.Builder) (obj)).setColor(Color.parseColor(bundle));
                }
            }
            if (uri != null)
            {
                ((android.app.Notification.Builder) (obj)).setSound(uri);
            }
            if (pendingintent != null)
            {
                ((android.app.Notification.Builder) (obj)).setContentIntent(pendingintent);
            }
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                return ((android.app.Notification.Builder) (obj)).build();
            } else
            {
                return ((android.app.Notification.Builder) (obj)).getNotification();
            }
        }
        Notification notification = new Notification();
        notification.flags = notification.flags | 0x10;
        notification.icon = i;
        if (uri != null)
        {
            notification.sound = uri;
        }
        bundle = pendingintent;
        if (pendingintent == null)
        {
            bundle = new Intent();
            bundle.setPackage("com.google.example.invalidpackage");
            bundle = PendingIntent.getBroadcast(mContext, 0, bundle, 0);
        }
        notification.setLatestEventInfo(mContext, ((CharSequence) (obj)), s, bundle);
        return notification;
    }

    private PendingIntent zzw(Bundle bundle)
    {
        Object obj = zzb(bundle, "gcm.n.click_action");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        }
        obj = new Intent(((String) (obj)));
        ((Intent) (obj)).setPackage(mContext.getPackageName());
        ((Intent) (obj)).setFlags(0x10000000);
        ((Intent) (obj)).putExtras(bundle);
        bundle = bundle.keySet().iterator();
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            String s = (String)bundle.next();
            if (s.startsWith("gcm.n.") || s.startsWith("gcm.notification."))
            {
                ((Intent) (obj)).removeExtra(s);
            }
        } while (true);
        return PendingIntent.getActivity(mContext, 0, ((Intent) (obj)), 0x40000000);
    }

    boolean zzu(Bundle bundle)
    {
        try
        {
            Notification notification = zzv(bundle);
            zza(zzb(bundle, "gcm.n.tag"), notification);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.w("GcmNotification", (new StringBuilder()).append("Failed to show notification: ").append(bundle.getMessage()).toString());
            return false;
        }
        return true;
    }
}
