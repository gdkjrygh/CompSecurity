// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.app.al;
import android.text.TextUtils;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.h;

public final class d
{

    public static void a(Context context, String s, String s1, Bitmap bitmap, kz kz1)
    {
        c.a(context);
        c.a(kz1.i);
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && bitmap != null)
        {
            Intent intent = WatchWhileActivity.a(context);
            intent.putExtra("watch", new WatchDescriptor(new PlaybackStartDescriptor(kz1, WatchFeature.VIDEO_NOTIFICATION)));
            kz1 = PendingIntent.getActivity(context, (int)(Math.random() * 2147483647D), intent, 0x40000000);
            s = (new al(context)).b(true).a(kz1).b(s1).a(s).a(h.ae).a(bitmap).b(5).a();
            if (s != null)
            {
                ((NotificationManager)context.getSystemService("notification")).notify(1002, s);
                return;
            }
        }
    }
}
