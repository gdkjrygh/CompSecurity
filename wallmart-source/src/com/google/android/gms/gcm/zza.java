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
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

class com.google.android.gms.gcm.zza
{
    private class zza extends IllegalArgumentException
    {

        final com.google.android.gms.gcm.zza zzazI;

        private zza(String s)
        {
            zzazI = com.google.android.gms.gcm.zza.this;
            super(s);
        }

    }


    static com.google.android.gms.gcm.zza zzazH;
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

    static com.google.android.gms.gcm.zza zzay(Context context)
    {
        com/google/android/gms/gcm/zza;
        JVM INSTR monitorenter ;
        if (zzazH == null)
        {
            zzazH = new com.google.android.gms.gcm.zza(context);
        }
        context = zzazH;
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

    private String zzc(Bundle bundle, String s)
    {
        Object obj = zzb(bundle, s);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return ((String) (obj));
        }
        obj = zzb(bundle, (new StringBuilder()).append(s).append("_loc_key").toString());
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        }
        Resources resources = mContext.getResources();
        int j = resources.getIdentifier(((String) (obj)), "string", mContext.getPackageName());
        if (j == 0)
        {
            throw new zza((new StringBuilder()).append(zzdk((new StringBuilder()).append(s).append("_loc_key").toString())).append(" resource not found: ").append(((String) (obj))).toString());
        }
        bundle = zzb(bundle, (new StringBuilder()).append(s).append("_loc_args").toString());
        if (TextUtils.isEmpty(bundle))
        {
            return resources.getString(j);
        }
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new zza((new StringBuilder()).append("Malformed ").append(zzdk((new StringBuilder()).append(s).append("_loc_args").toString())).append(": ").append(bundle).toString());
        }
        bundle = new String[jsonarray.length()];
        for (int i = 0; i < bundle.length; i++)
        {
            bundle[i] = jsonarray.opt(i);
        }

        try
        {
            bundle = resources.getString(j, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new zza((new StringBuilder()).append("Missing format argument for ").append(((String) (obj))).append(": ").append(bundle).toString());
        }
        return bundle;
    }

    private String zzdk(String s)
    {
        return s.substring("gcm.n.".length());
    }

    private int zzdl(String s)
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

    private Uri zzdm(String s)
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

    static boolean zzu(Bundle bundle)
    {
        return zzb(bundle, "gcm.n.icon") != null;
    }

    private Notification zzw(Bundle bundle)
    {
        Object obj = zzc(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new zza("Missing title");
        }
        String s = zzc(bundle, "gcm.n.body");
        int i = zzdl(zzb(bundle, "gcm.n.icon"));
        Uri uri = zzdm(zzb(bundle, "gcm.n.sound"));
        PendingIntent pendingintent = zzx(bundle);
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

    private PendingIntent zzx(Bundle bundle)
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

    boolean zzv(Bundle bundle)
    {
        try
        {
            Notification notification = zzw(bundle);
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
