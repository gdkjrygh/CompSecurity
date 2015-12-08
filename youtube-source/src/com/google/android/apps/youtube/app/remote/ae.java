// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.media.a;
import android.support.v7.media.b;
import android.support.v7.media.x;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.youtube.p;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            r, YouTubeTvScreen, ah, ai, 
//            af, bk, ag, e, 
//            aq, YouTubeTvScreensMonitor

final class ae extends r
{

    private final Context b;
    private final Executor c;
    private final PairingCode d;
    private final com.google.android.apps.ytremote.backend.logic.c e;
    private final YouTubeTvScreen f;
    private final aq g = new ah(this, (byte)0);
    private final ai h = new ai(this, (byte)0);
    private PendingIntent i;

    public ae(YouTubeTvScreen youtubetvscreen, PairingCode pairingcode, Context context, bk bk1, YouTubeTvScreensMonitor youtubetvscreensmonitor, Executor executor, com.google.android.apps.ytremote.backend.logic.c c1)
    {
        super(youtubetvscreen, bk1, youtubetvscreensmonitor);
        f = (YouTubeTvScreen)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreen);
        d = (PairingCode)com.google.android.apps.youtube.common.fromguava.c.a(pairingcode);
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        c = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        e = (com.google.android.apps.ytremote.backend.logic.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
    }

    static com.google.android.apps.ytremote.backend.logic.c a(ae ae1)
    {
        return ae1.e;
    }

    static void a(ae ae1, PairingCode pairingcode, Uri uri)
    {
        uri = new Intent("com.google.android.youtube.action.mrp_pairing_code_registered");
        uri.putExtra("pairingCode", pairingcode.toString());
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            ae1.b.sendBroadcast(uri);
            return;
        }
    }

    static void a(ae ae1, PairingCode pairingcode, CloudScreen cloudscreen)
    {
        try
        {
            ae1.c.execute(new af(ae1, pairingcode, cloudscreen));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ae ae1)
        {
            L.a("Could not register pairing code", ae1);
        }
    }

    static YouTubeTvScreen b(ae ae1)
    {
        return ae1.f;
    }

    private Bundle c(int j)
    {
        return (new b(j)).b((long)a.t()).a(SystemClock.uptimeMillis()).a().a();
    }

    static PairingCode c(ae ae1)
    {
        return ae1.d;
    }

    private int d()
    {
        switch (com.google.android.apps.youtube.app.remote.ag.a[a.n().ordinal()])
        {
        case 1: // '\001'
        default:
            return 3;

        case 2: // '\002'
            return 4;

        case 3: // '\003'
            return 7;

        case 4: // '\004'
            return 2;

        case 5: // '\005'
            return 1;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return 0;

        case 10: // '\n'
            return 1081;
        }
    }

    static void d(ae ae1)
    {
        Intent intent;
        if (ae1.i == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        intent = new Intent();
        intent.putExtra("android.media.intent.extra.ITEM_ID", ae1.a.p());
        intent.putExtra("android.media.intent.extra.ITEM_STATUS", ae1.c(ae1.d()));
        ae1.i.send(ae1.b, 0, intent);
        ae1.i = null;
        return;
        ae1;
        L.a("Could not send status update", ae1);
        return;
    }

    static Context e(ae ae1)
    {
        return ae1.b;
    }

    public final boolean a(Intent intent, x x1)
    {
        boolean flag1 = false;
        if (!"android.media.intent.action.GET_STATUS".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        intent = c(d());
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.media.intent.extra.ITEM_STATUS", intent);
        bundle.putString("android.media.intent.extra.ITEM_ID", a.p());
        x1.a(bundle);
        flag1 = true;
_L4:
        return flag1;
_L2:
label0:
        {
            if ("com.google.android.apps.youtube.app.remote.action.WATCH_STATUS".equals(intent.getAction()))
            {
                i = (PendingIntent)intent.getParcelableExtra("android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER");
                return true;
            }
            if (!TextUtils.isEmpty(a.p()))
            {
                boolean flag;
                if (a.n() == RemoteControl.RemotePlayerState.ADVERTISEMENT)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            intent = new Bundle();
            x1.a(b.getResources().getString(p.bn), intent);
            return true;
        }
        if ("android.media.intent.action.RESUME".equals(intent.getAction()))
        {
            a.e();
            return true;
        }
        if ("android.media.intent.action.PAUSE".equals(intent.getAction()))
        {
            a.f();
            return true;
        }
        if ("android.media.intent.action.SEEK".equals(intent.getAction()))
        {
            int j = (int)intent.getLongExtra("android.media.intent.extra.ITEM_POSITION", 0L);
            a.c(j);
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        a.a(f, "", 0L, null, 0, null);
        a.a(g);
        a.a(h);
    }

    public final void c()
    {
        super.c();
        a.b(g);
        a.b(h);
    }
}
