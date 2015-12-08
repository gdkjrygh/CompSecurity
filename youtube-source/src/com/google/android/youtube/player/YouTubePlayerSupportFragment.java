// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.youtube.player:
//            g, i, YouTubePlayerView, f

public class YouTubePlayerSupportFragment extends Fragment
    implements g
{

    private final i a = new i(this, (byte)0);
    private Bundle b;
    private YouTubePlayerView c;
    private String d;
    private f e;
    private boolean f;

    public YouTubePlayerSupportFragment()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = new YouTubePlayerView(i(), null, 0, a);
        if (c != null && e != null)
        {
            c.setUseTextureView(f);
            c.a(i(), this, d, e, b);
            b = null;
            e = null;
        }
        return c;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle = bundle.getBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE");
        } else
        {
            bundle = null;
        }
        b = bundle;
    }

    public final void d()
    {
        super.d();
        c.a();
    }

    public final void e()
    {
        c.d();
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        Bundle bundle1;
        if (c != null)
        {
            bundle1 = c.e();
        } else
        {
            bundle1 = b;
        }
        bundle.putBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE", bundle1);
    }

    public final void f()
    {
        c.b(i().isFinishing());
        c = null;
        super.f();
    }

    public final void r()
    {
        super.r();
        c.b();
    }

    public final void s()
    {
        c.c();
        super.s();
    }

    public final void t()
    {
        if (c != null)
        {
            FragmentActivity fragmentactivity = i();
            YouTubePlayerView youtubeplayerview = c;
            boolean flag;
            if (fragmentactivity == null || fragmentactivity.isFinishing())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            youtubeplayerview.a(flag);
        }
        super.t();
    }
}
