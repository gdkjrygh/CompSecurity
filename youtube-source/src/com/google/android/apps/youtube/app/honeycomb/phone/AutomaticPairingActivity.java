// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.bk;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity, f, a, b, 
//            c

public class AutomaticPairingActivity extends YouTubeActivity
{

    protected am n;
    private YouTubeTvScreensMonitor o;
    private Analytics p;
    private CloudScreen q;
    private YouTubeTvScreen r;
    private an s;
    private YouTubeApplication t;
    private Handler u;
    private bk v;
    private f w;
    private b x;
    private b y;

    public AutomaticPairingActivity()
    {
    }

    static Analytics a(AutomaticPairingActivity automaticpairingactivity)
    {
        return automaticpairingactivity.p;
    }

    static void a(AutomaticPairingActivity automaticpairingactivity, YouTubeTvScreen youtubetvscreen)
    {
        automaticpairingactivity.a(youtubetvscreen);
    }

    private void a(YouTubeTvScreen youtubetvscreen)
    {
        v.a(w);
        s.a(youtubetvscreen, y);
    }

    static void b(AutomaticPairingActivity automaticpairingactivity)
    {
        (automaticpairingactivity. new ConnectionErrorDialogFragment()).a(automaticpairingactivity.c(), "automatic_connect_failed");
    }

    static f c(AutomaticPairingActivity automaticpairingactivity)
    {
        return automaticpairingactivity.w;
    }

    static bk d(AutomaticPairingActivity automaticpairingactivity)
    {
        return automaticpairingactivity.v;
    }

    private void e()
    {
        Message message = Message.obtain(u, 10000);
        u.sendMessageDelayed(message, 1000L);
    }

    static void e(AutomaticPairingActivity automaticpairingactivity)
    {
        automaticpairingactivity.e();
    }

    public final String d()
    {
        return "yt_auto_add_screen";
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            q = (CloudScreen)bundle.getParcelable("cloud_screen");
            r = (YouTubeTvScreen)bundle.getParcelable("yt_tv_screen");
        }
        t = (YouTubeApplication)getApplication();
        s = t.p();
        v = t.k();
        o = t.l();
        p = t.D();
        w = new f(this, (byte)0);
        b(p.C);
        setContentView(l.j);
        n = N();
        y = new a(this);
        x = new com.google.android.apps.youtube.app.honeycomb.phone.b(this);
        u = new c(this);
    }

    protected void onStart()
    {
        super.onStart();
        if (r == null) goto _L2; else goto _L1
_L1:
        if (!v.a(r)) goto _L4; else goto _L3
_L3:
        if (!com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED.equals(v.b())) goto _L6; else goto _L5
_L5:
        e();
_L8:
        return;
_L6:
        if (com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTING.equals(v.b()))
        {
            v.a(w);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a(r);
        return;
_L2:
        if (q != null)
        {
            o.a(q, x);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onStop()
    {
        super.onStop();
        v.b(w);
    }

    private class ConnectionErrorDialogFragment extends YouTubeDialogFragment
    {

        final AutomaticPairingActivity Y;

        public final Dialog c(Bundle bundle)
        {
            super.a(bundle);
            bundle = new android.app.AlertDialog.Builder(i());
            bundle.setTitle(p.E);
            bundle.setMessage(p.D);
            bundle.setOnCancelListener(new d(this));
            bundle.setPositiveButton(p.dA, new e(this));
            return bundle.create();
        }

        public ConnectionErrorDialogFragment()
        {
            Y = AutomaticPairingActivity.this;
            super();
        }
    }

}
