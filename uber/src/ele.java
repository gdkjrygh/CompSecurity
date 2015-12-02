// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.ubercab.client.feature.notification.model.NotificationData;
import com.ubercab.client.feature.notification.model.ReceiptNotificationData;

public final class ele extends eld
{

    private final eku a;
    private final dal b;

    public ele(Context context, cev cev, eku eku1, dal dal1, NotificationManager notificationmanager)
    {
        super(context, cev, notificationmanager);
        a = eku1;
        b = dal1;
    }

    private String a(Context context, ReceiptNotificationData receiptnotificationdata)
    {
        String s = null;
        String s1 = receiptnotificationdata.getCreditsUsed();
        if (s1 != null)
        {
            s = context.getString(0x7f0701bd, new Object[] {
                s1
            });
        }
        context = a(receiptnotificationdata.getTimestamp());
        if (!TextUtils.isEmpty(context) && !TextUtils.isEmpty(s1))
        {
            context = String.format("%s \u2022 %s", new Object[] {
                context, s
            });
        } else
        if (TextUtils.isEmpty(context))
        {
            context = s;
            if (TextUtils.isEmpty(s))
            {
                return "";
            }
        } else
        {
            return context;
        }
        return context;
    }

    private static String a(Context context, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            return context.getString(0x7f0702f0, new Object[] {
                s
            });
        } else
        {
            return context.getString(0x7f0702ef);
        }
    }

    private void a(ReceiptNotificationData receiptnotificationdata)
    {
        c(receiptnotificationdata);
    }

    private Notification b(ReceiptNotificationData receiptnotificationdata)
    {
        Context context = e();
        Object obj = context.getString(0x7f0702f1, new Object[] {
            receiptnotificationdata.getAmountCharged()
        });
        int i = receiptnotificationdata.getMessageIdentifier().intValue();
        android.app.PendingIntent pendingintent;
        Object obj1;
        android.app.PendingIntent pendingintent1;
        android.graphics.Bitmap bitmap;
        long l;
        if (receiptnotificationdata.getTimestamp() == null)
        {
            l = 0L;
        } else
        {
            l = receiptnotificationdata.getTimestamp().longValue();
        }
        obj1 = c(i, "com.ubercab.client.ACTION_TRIP_SHOW_MAP");
        pendingintent1 = b(2, receiptnotificationdata.getTag());
        pendingintent = c(i, "com.ubercab.client.ACTION_RECEIPT_RATE_DRIVER");
        bitmap = ((BitmapDrawable)e().getResources().getDrawable(0x7f020191)).getBitmap();
        obj = (new android.support.v4.app.NotificationCompat.Builder(e())).setSmallIcon(0x7f020191).setLargeIcon(bitmap).setContentTitle(((CharSequence) (obj))).setContentText(a(context, receiptnotificationdata)).setContentIntent(((android.app.PendingIntent) (obj1))).setDeleteIntent(pendingintent1).setAutoCancel(true).setTicker(((CharSequence) (obj))).setWhen(l);
        obj1 = a.a(receiptnotificationdata.getMapImageUrl());
        if (obj1 != null)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setStyle((new android.support.v4.app.NotificationCompat.BigPictureStyle(((android.support.v4.app.NotificationCompat.Builder) (obj)))).bigPicture(((android.graphics.Bitmap) (obj1))));
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).addAction(0x7f020166, a(context, receiptnotificationdata.getDriverName()), pendingintent);
        return ((android.support.v4.app.NotificationCompat.Builder) (obj)).build();
    }

    private void c(ReceiptNotificationData receiptnotificationdata)
    {
        if (gjx.a(b.F(), receiptnotificationdata.getTripId()))
        {
            return;
        } else
        {
            a(2, receiptnotificationdata.getTag(), b(receiptnotificationdata));
            return;
        }
    }

    public final void a()
    {
    }

    public final volatile void a(NotificationData notificationdata)
    {
        a((ReceiptNotificationData)notificationdata);
    }

    public final void onReceiptRateEvent(fdn fdn1)
    {
        a(2, fdn1.a());
    }

    public final void onShowReceiptEvent(fdo fdo1)
    {
        a(2, fdo1.a());
    }
}
