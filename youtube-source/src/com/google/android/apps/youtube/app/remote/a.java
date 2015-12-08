// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.al;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.honeycomb.phone.AutomaticPairingActivity;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.youtube.h;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            b, bw, d, YouTubeTvScreen

public final class a
{

    public static void a(Context context, bw bw1, Bundle bundle)
    {
        a(bundle, bw1, ((b) (new com.google.android.apps.youtube.app.remote.b(bw1, context))));
    }

    static void a(Context context, CloudScreen cloudscreen, YouTubeTvScreen youtubetvscreen)
    {
        String s;
        String s1;
        NotificationManager notificationmanager;
        ScreenId screenid;
        String s2;
        Intent intent;
        int i;
        int j;
        if (youtubetvscreen != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        notificationmanager = (NotificationManager)context.getSystemService("notification");
        j = h.M;
        if (i != 0)
        {
            s = context.getString(p.cY);
        } else
        {
            s = context.getString(p.cZ);
        }
        if (i != 0)
        {
            s1 = context.getString(p.cY);
        } else
        {
            s1 = context.getString(p.cZ);
        }
        s2 = context.getString(p.cX);
        screenid = cloudscreen.getScreenId();
        intent = new Intent(context, com/google/android/apps/youtube/app/honeycomb/phone/AutomaticPairingActivity);
        intent.putExtra("cloud_screen", cloudscreen);
        if (i != 0)
        {
            intent.putExtra("yt_tv_screen", youtubetvscreen);
        }
        intent.setAction(screenid.toString());
        i = screenid.hashCode();
        cloudscreen = PendingIntent.getActivity(context, i, intent, 0x8000000);
        context = (new al(context)).a(j).d(s).a(s1).b(s2).a(cloudscreen).a();
        context.flags = 16;
        notificationmanager.notify(screenid.toString(), i, context);
    }

    public static void a(Context context, ScreenId screenid)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(screenid.toString(), screenid.hashCode());
    }

    private static void a(Bundle bundle, bw bw1, b b1)
    {
        String s = null;
        if (bundle != null)
        {
            bundle.getString("tv_name");
            s = bundle.getString("pairing_code");
        }
        if (!TextUtils.isEmpty(s))
        {
            bw1.a(new PairingCode(s), b1);
        }
    }

    public static void b(Context context, bw bw1, Bundle bundle)
    {
        a(bundle, bw1, new d(context));
    }
}
