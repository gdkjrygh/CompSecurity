// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.wb;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.youtube.n;
import com.google.android.youtube.p;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;

// Referenced classes of package com.google.android.apps.youtube.app.notification:
//            d, a

public class GcmBroadcastReceiver extends BroadcastReceiver
{

    public GcmBroadcastReceiver()
    {
    }

    private static kz a(Intent intent)
    {
        kz kz1 = new kz();
        try
        {
            intent = intent.getStringExtra("n");
            if (!TextUtils.isEmpty(intent))
            {
                c.a(kz1, Base64.decode(intent, 0));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            L.b("Could not convert base64-encoded byte stream into NavigationEndpoint proto: ", intent);
            return kz1;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            L.b("Could not convert base64-encoded byte stream into NavigationEndpoint proto: ", intent);
            return kz1;
        }
        return kz1;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor.PushNotificationsBroadcastReceiver.a(intent))
        {
            YouTubeApplication youtubeapplication = (YouTubeApplication)context.getApplicationContext();
            ax ax1 = youtubeapplication.d();
            Object obj = ax1.bk();
            if (ax1.aT().b())
            {
                context = context.getSharedPreferences("youtube", 0);
                kz kz1 = a(intent);
                if (kz1.i != null && context.getBoolean("video_notifications_enabled", true))
                {
                    if (kz1.i == null || TextUtils.isEmpty(kz1.i.b))
                    {
                        L.c("No video ID was found in NavigationEndpoint proto.");
                        return;
                    }
                    Resources resources = youtubeapplication.getResources();
                    obj = intent.getStringExtra("t");
                    context = ((Context) (obj));
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        context = resources.getString(p.gS);
                    }
                    String s = intent.getStringExtra("sm");
                    obj = s;
                    if (TextUtils.isEmpty(s))
                    {
                        obj = resources.getString(p.gR);
                    }
                    intent = intent.getStringExtra("i");
                    if (TextUtils.isEmpty(intent))
                    {
                        d.a(youtubeapplication, context, ((String) (obj)), BitmapFactory.decodeResource(resources, n.a), kz1);
                        return;
                    } else
                    {
                        youtubeapplication.d().aw().a(Uri.parse(intent), new a(this, youtubeapplication, context, ((String) (obj)), kz1, resources, (byte)0));
                        return;
                    }
                }
                if (kz1.v != null)
                {
                    ((aa) (obj)).a("Sign out notification received");
                    return;
                }
            }
        }
    }
}
