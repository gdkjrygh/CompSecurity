// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ui.ev;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity, ae, PostPairingActivity

public class ScreenPairingActivity extends YouTubeActivity
{

    private ev n;
    private YouTubeApplication o;
    private boolean p;

    public ScreenPairingActivity()
    {
    }

    public static Intent a(Context context, String s, int i)
    {
        context = new Intent(context, com/google/android/apps/youtube/app/honeycomb/phone/ScreenPairingActivity);
        if (s != null)
        {
            context.putExtra("video_id", s);
            context.putExtra("video_position_ms", i);
        }
        return context;
    }

    private void a(int i, int k, int i1)
    {
        ViewGroup viewgroup = (ViewGroup)findViewById(i);
        ((TextView)viewgroup.findViewById(j.cO)).setText(String.valueOf(k));
        ((TextView)viewgroup.findViewById(j.bS)).setText(i1);
    }

    static boolean a(ScreenPairingActivity screenpairingactivity, boolean flag)
    {
        screenpairingactivity.p = true;
        return true;
    }

    protected final boolean a(com.google.android.apps.youtube.app.compat.j j1)
    {
        j1.a();
        return true;
    }

    protected final Dialog a_(int i)
    {
        switch (i)
        {
        default:
            return super.a_(i);

        case 1027: 
            return n.a(i);
        }
    }

    public final String d()
    {
        return "yt_add_screen";
    }

    public void handleSignOutEvent(aj aj)
    {
        finish();
    }

    public void onActivityResult(int i, int k, Intent intent)
    {
        if (n.a(i, k, intent))
        {
            return;
        } else
        {
            super.onActivityResult(i, k, intent);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = (YouTubeApplication)getApplication();
        ae ae1 = new ae(this);
        n = new ev(this, o.p(), o.m(), o.l(), o.k(), o.D(), ae1, o.A(), l.aY);
        boolean flag;
        if (bundle == null)
        {
            flag = false;
        } else
        {
            flag = bundle.getBoolean("paired", false);
        }
        p = flag;
        if (!p) goto _L2; else goto _L1
_L1:
        startActivity(new Intent(this, com/google/android/apps/youtube/app/honeycomb/phone/PostPairingActivity));
_L4:
        b(p.dZ);
        a(j.de, 1, p.dF);
        a(j.df, 2, p.dG);
        a(j.dg, 3, p.dH);
        return;
_L2:
        if (bundle != null)
        {
            n.a(bundle.getString("pairing_code"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onPause()
    {
        super.onPause();
        o.E().b(this);
        n.b();
    }

    protected void onResume()
    {
        super.onResume();
        o.E().a(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("paired", p);
        bundle.putString("pairing_code", n.a());
    }

    protected void onStart()
    {
        super.onStart();
        Object obj;
        if (!p)
        {
            if ("android.intent.action.VIEW".equals(((Intent) (obj = getIntent())).getAction()))
            {
                obj = ((Intent) (obj)).getData();
                if (obj != null && ((Uri) (obj)).getPathSegments().contains("remote"))
                {
                    n.a(((Uri) (obj)).getQueryParameter("pairingCode"));
                }
                setIntent(new Intent());
                return;
            }
        }
    }

    protected void onStop()
    {
        super.onStop();
    }
}
