// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

public static final class <init>
{
    public static final class Builder
    {

        private CastRemoteDisplayLocalService.NotificationSettings zzRy;

        public CastRemoteDisplayLocalService.NotificationSettings build()
        {
            if (CastRemoteDisplayLocalService.NotificationSettings.zza(zzRy) != null)
            {
                if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzb(zzRy)))
                {
                    throw new IllegalArgumentException("notificationTitle requires using the default notification");
                }
                if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzc(zzRy)))
                {
                    throw new IllegalArgumentException("notificationText requires using the default notification");
                }
                if (CastRemoteDisplayLocalService.NotificationSettings.zzd(zzRy) != null)
                {
                    throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                }
            } else
            if (TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzb(zzRy)) && TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzc(zzRy)) && CastRemoteDisplayLocalService.NotificationSettings.zzd(zzRy) == null)
            {
                throw new IllegalArgumentException("At least an argument must be provided");
            }
            return zzRy;
        }

        public Builder setNotification(Notification notification)
        {
            CastRemoteDisplayLocalService.NotificationSettings.zza(zzRy, notification);
            return this;
        }

        public Builder setNotificationPendingIntent(PendingIntent pendingintent)
        {
            CastRemoteDisplayLocalService.NotificationSettings.zza(zzRy, pendingintent);
            return this;
        }

        public Builder setNotificationText(String s)
        {
            CastRemoteDisplayLocalService.NotificationSettings.zzb(zzRy, s);
            return this;
        }

        public Builder setNotificationTitle(String s)
        {
            CastRemoteDisplayLocalService.NotificationSettings.zza(zzRy, s);
            return this;
        }

        public Builder()
        {
            zzRy = new CastRemoteDisplayLocalService.NotificationSettings(null);
        }
    }


    private Notification mNotification;
    private PendingIntent zzRv;
    private String zzRw;
    private String zzRx;

    static Notification zza(Builder.zzRy zzry)
    {
        return zzry.mNotification;
    }

    static Notification zza(mNotification mnotification, Notification notification)
    {
        mnotification.mNotification = notification;
        return notification;
    }

    static PendingIntent zza(mNotification mnotification, PendingIntent pendingintent)
    {
        mnotification.zzRv = pendingintent;
        return pendingintent;
    }

    static String zza(zzRv zzrv, String s)
    {
        zzrv.zzRw = s;
        return s;
    }

    static String zzb(zzRw zzrw)
    {
        return zzrw.zzRw;
    }

    static String zzb(zzRw zzrw, String s)
    {
        zzrw.zzRx = s;
        return s;
    }

    static String zzc(zzRx zzrx)
    {
        return zzrx.zzRx;
    }

    static PendingIntent zzd(zzRx zzrx)
    {
        return zzrx.zzRv;
    }

    private <init>()
    {
    }

    <init>(<init> <init>1)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        mNotification = <init>1.mNotification;
        zzRv = <init>1.zzRv;
        zzRw = <init>1.zzRw;
        zzRx = <init>1.zzRx;
    }

    zzRx(zzRx zzrx, zzRx zzrx1)
    {
        this(zzrx);
    }
}
