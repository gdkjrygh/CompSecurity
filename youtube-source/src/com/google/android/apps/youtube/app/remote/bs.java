// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.apps.ytremote.backend.browserchannel.k;
import com.google.android.apps.ytremote.backend.logic.d;
import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.Params;
import com.google.android.apps.ytremote.backend.model.a;
import com.google.android.apps.ytremote.backend.model.b;
import com.google.android.apps.ytremote.model.AppStatus;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bk, bp, YouTubeTvScreen, bt, 
//            bq

final class bs extends Handler
{

    final bk a;

    private bs(bk bk1, Looper looper)
    {
        a = bk1;
        super(looper);
    }

    bs(bk bk1, Looper looper, byte byte0)
    {
        this(bk1, looper);
    }

    private void a(Context context, boolean flag)
    {
        if (com.google.android.apps.youtube.app.remote.bk.d(a).a() || com.google.android.apps.youtube.app.remote.bk.d(a).b())
        {
            com.google.android.apps.youtube.app.remote.bk.d(a).a(flag);
        }
        if (com.google.android.apps.youtube.app.remote.bk.k(a))
        {
            context.unregisterReceiver(bk.l(a));
            com.google.android.apps.youtube.app.remote.bk.b(a, false);
        }
    }

    static void a(bs bs1, CloudScreen cloudscreen, bp bp1)
    {
        bs1.a(cloudscreen, bp1);
    }

    static void a(bs bs1, YouTubeDevice youtubedevice, CloudScreen cloudscreen)
    {
        bk.o(bs1.a).put(youtubedevice, cloudscreen);
        bk.p(bs1.a).edit().putString(youtubedevice.getSsdpId().toString(), cloudscreen.getScreenId().toString()).apply();
    }

    private void a(CloudScreen cloudscreen, bp bp1)
    {
        if (!cloudscreen.equals(bk.c(a)))
        {
            bk.m(a).clear();
        }
        com.google.android.apps.youtube.app.remote.bk.a(a, cloudscreen);
        if (!com.google.android.apps.youtube.app.remote.bk.k(a))
        {
            com.google.android.apps.youtube.app.remote.bk.b(a).registerReceiver(bk.l(a), bk.z());
        }
        Object obj1 = (new b()).a(cloudscreen.getLoungeToken());
        if (!TextUtils.isEmpty(com.google.android.apps.youtube.app.remote.bp.b(bp1)))
        {
            b b1 = ((b) (obj1)).a(Method.SET_PLAYLIST);
            Object obj;
            if (bk.n(a))
            {
                obj = new Params();
                ((Params) (obj)).a("videoId", com.google.android.apps.youtube.app.remote.bp.b(bp1));
                ((Params) (obj)).a("currentIndex", Integer.toString(bp.f(bp1)));
                ((Params) (obj)).a("listId", bp.g(bp1));
                ((Params) (obj)).a("currentTime", Long.toString(bp.e(bp1) / 1000L));
            } else
            {
                obj = new Params();
                ((Params) (obj)).a("videoId", com.google.android.apps.youtube.app.remote.bp.b(bp1));
                ((Params) (obj)).a("currentTime", Long.toString(bp.e(bp1) / 1000L));
                ((Params) (obj)).a("videoSources", "XX");
                ((Params) (obj)).a("videoIds", com.google.android.apps.youtube.app.remote.bp.b(bp1));
            }
            b1.a(((Params) (obj)));
        }
        if (bp.c(bp1))
        {
            ((b) (obj1)).a(true);
        }
        if (com.google.android.apps.youtube.app.remote.bp.d(bp1) != null)
        {
            ((b) (obj1)).a((new StringBuilder("Bearer ")).append(com.google.android.apps.youtube.app.remote.bp.d(bp1)).toString());
        }
        bp1 = ((b) (obj1)).a();
        cloudscreen = (new StringBuilder("Connecting to ")).append(cloudscreen.getScreenId()).append(" with ").toString();
        if (bp1.f())
        {
            obj = a;
            obj1 = (new StringBuilder()).append(cloudscreen).append(bp1.b()).append(" : ");
            if (bp1.g())
            {
                cloudscreen = bp1.c();
            } else
            {
                cloudscreen = "{}";
            }
            com.google.android.apps.youtube.app.remote.bk.a(((bk) (obj)), ((StringBuilder) (obj1)).append(cloudscreen).toString());
        } else
        {
            com.google.android.apps.youtube.app.remote.bk.a(a, (new StringBuilder()).append(cloudscreen).append("no message.").toString());
        }
        com.google.android.apps.youtube.app.remote.bk.d(a).a(bp1);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 7: default 48
    //                   1 49
    //                   2 835
    //                   3 138
    //                   4 538
    //                   5 869
    //                   6 48
    //                   7 72;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7
_L1:
        return;
_L2:
        com.google.android.apps.youtube.app.remote.bk.a(a, "Remote going to sleep ...");
        a(com.google.android.apps.youtube.app.remote.bk.b(a), false);
        return;
_L7:
        if (bk.c(a) == null)
        {
            com.google.android.apps.youtube.app.remote.bk.a(a, "We should reconnect, but we lost the cloud screen.");
            return;
        } else
        {
            com.google.android.apps.youtube.app.remote.bk.a(a, "Remote waking up ...");
            com.google.android.apps.youtube.app.remote.bk.d(a).a((new b()).a(bk.c(a).getLoungeToken()).a());
            return;
        }
_L4:
        if (com.google.android.apps.youtube.app.remote.bk.d(a).a() || com.google.android.apps.youtube.app.remote.bk.d(a).b())
        {
            com.google.android.apps.youtube.app.remote.bk.a(a, "Connecting to a new screen. Will disconnect the previous browser channel connection.");
            com.google.android.apps.youtube.app.remote.bk.d(a).a(true);
        }
        bp bp1 = (bp)message.obj;
        Object obj = com.google.android.apps.youtube.app.remote.bp.a(bp1);
        com.google.android.apps.youtube.app.remote.bk.a(a, (new StringBuilder("Connecting to ")).append(com.google.android.apps.youtube.app.remote.bp.a((bp)message.obj).getScreenName()).toString());
        if (((YouTubeTvScreen) (obj)).hasDevice())
        {
            message = ((YouTubeTvScreen) (obj)).getDevice();
            obj = a.a(message);
            if (obj != null)
            {
                com.google.android.apps.youtube.app.remote.bk.a(a, (new StringBuilder("Found associated cloud screen ")).append(obj).append(" for device ").append(message).toString());
                AppStatus appstatus = bk.j(a).a(message.getAppUri());
                com.google.android.apps.youtube.app.remote.bk.a(a, (new StringBuilder("Application status for device is ")).append(appstatus.getStatus()).toString());
                if (appstatus.getStatus() == 1)
                {
                    Map map = bk.q(a).a(Arrays.asList(new CloudScreen[] {
                        obj
                    }));
                    boolean flag;
                    if (map != null && map.containsKey(obj) && ((Boolean)map.get(obj)).booleanValue())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        com.google.android.apps.youtube.app.remote.bk.a(a, "Screen appears to be online. Will not send a launch request.");
                        a(((CloudScreen) (obj)), bp1);
                        return;
                    }
                }
            }
            bk.c(a, true);
            com.google.android.apps.youtube.app.remote.bk.a(a, (new StringBuilder("Sending launch request for ")).append(message).append(" to ").append(message.getAppUri()).toString());
            bk.e(a).a(message.getAppUri(), com.google.android.apps.youtube.app.remote.bp.b(bp1), bp.e(bp1), null, new bt(this, message, bp1));
            if (obj != null)
            {
                a(((CloudScreen) (obj)), bp1);
                return;
            }
        } else
        {
            a(((YouTubeTvScreen) (obj)).getScreen(), bp1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        YouTubeTvScreen youtubetvscreen;
        boolean flag1;
        message = (bq)message.obj;
        youtubetvscreen = ((bq) (message)).a;
        com.google.android.apps.youtube.app.remote.bk.a(a, (new StringBuilder("Disconnecting from ")).append(youtubetvscreen.getScreenName()).toString());
        flag1 = ((bq) (message)).b;
        if (!flag1 || youtubetvscreen == null || !youtubetvscreen.hasDevice() || !bk.i(a) || youtubetvscreen.getDevice().getAppStatus() == null || !youtubetvscreen.getDevice().getAppStatus().isStopAllowed()) goto _L9; else goto _L8
_L8:
        if (!bk.f(a).containsKey(youtubetvscreen.getDevice().getSsdpId())) goto _L11; else goto _L10
_L10:
        message = (Uri)bk.f(a).get(youtubetvscreen.getDevice().getSsdpId());
_L12:
        com.google.android.apps.youtube.app.remote.bk.a(a, (new StringBuilder("Sending stop request to ")).append(message).toString());
        if (message != null)
        {
            bk.e(a).a(message);
        }
_L9:
        bk.e(a).a();
        if (youtubetvscreen.hasDevice())
        {
            bk.f(a).remove(youtubetvscreen.getDevice().getSsdpId());
        }
        a(com.google.android.apps.youtube.app.remote.bk.b(a), flag1);
        return;
_L11:
        message = youtubetvscreen.getDevice().getAppUri();
        Object obj1 = bk.j(a).a(message);
        if (obj1 != null && ((AppStatus) (obj1)).getStatus() == 1)
        {
            obj1 = ((AppStatus) (obj1)).getRunningPathSegment();
            if (obj1 != null)
            {
                message = message.buildUpon().appendPath(((String) (obj1))).build();
                continue; /* Loop/switch isn't completed */
            }
        }
        message = null;
        if (true) goto _L12; else goto _L3
_L3:
        if (a.b() == RemoteControl.State.CONNECTED && bk.g(a) == RemoteControl.RemotePlayerState.UNCONFIRMED)
        {
            bk.h(a);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        com.google.android.apps.youtube.app.remote.bk.a(a, false);
        return;
    }
}
