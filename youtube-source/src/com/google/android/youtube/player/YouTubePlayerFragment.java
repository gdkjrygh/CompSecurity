// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.youtube.player:
//            g, h, YouTubePlayerView, f

public class YouTubePlayerFragment extends Fragment
    implements g
{

    private final h a = new h(this, (byte)0);
    private Bundle b;
    private YouTubePlayerView c;
    private String d;
    private f e;
    private boolean f;

    public YouTubePlayerFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            bundle = bundle.getBundle("YouTubePlayerFragment.KEY_PLAYER_VIEW_STATE");
        } else
        {
            bundle = null;
        }
        b = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = new YouTubePlayerView(getActivity(), null, 0, a);
        if (c != null && e != null)
        {
            c.setUseTextureView(f);
            c.a(getActivity(), this, d, e, b);
            b = null;
            e = null;
        }
        return c;
    }

    public void onDestroy()
    {
        if (c != null)
        {
            Activity activity = getActivity();
            YouTubePlayerView youtubeplayerview = c;
            boolean flag;
            if (activity == null || activity.isFinishing())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            youtubeplayerview.a(flag);
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        c.b(getActivity().isFinishing());
        c = null;
        super.onDestroyView();
    }

    public void onPause()
    {
        c.c();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        c.b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Bundle bundle1;
        if (c != null)
        {
            bundle1 = c.e();
        } else
        {
            bundle1 = b;
        }
        bundle.putBundle("YouTubePlayerFragment.KEY_PLAYER_VIEW_STATE", bundle1);
    }

    public void onStart()
    {
        super.onStart();
        c.a();
    }

    public void onStop()
    {
        c.d();
        super.onStop();
    }
}
