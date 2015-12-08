// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.youtube.api.a.a;
import com.google.android.apps.youtube.api.ac;
import com.google.android.apps.youtube.api.j;
import com.google.android.apps.youtube.api.m;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.internal.dynamic.d;
import java.util.ArrayList;

public final class StandalonePlayerActivity extends Activity
    implements m
{

    private String a;
    private String b;
    private ArrayList c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private j i;
    private a j;
    private ac k;

    public StandalonePlayerActivity()
    {
    }

    public final void a(j j1)
    {
        i = j1;
        j = new a(this, j1, false);
        j.b(false);
        k = new ac(this, (View)com.google.android.youtube.player.internal.dynamic.d.a(j.j()), j.a(), a, b, c, d, e, f, g, h);
        k.show();
        j.b(8);
        j1 = j;
        boolean flag;
        if (!k.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1.d(flag);
        j1 = new Intent();
        j1.putExtra("initialization_result", YouTubeInitializationResult.SUCCESS.name());
        setResult(-1, j1);
    }

    public final void a(Exception exception)
    {
        Intent intent = new Intent();
        intent.putExtra("initialization_result", com.google.android.apps.youtube.api.j.a(exception).name());
        setResult(1, intent);
        finish();
    }

    protected final void onCreate(Bundle bundle)
    {
        Intent intent = getIntent();
        String s2 = intent.getStringExtra("developer_key");
        String s3 = intent.getStringExtra("app_package");
        String s4 = intent.getStringExtra("app_version");
        String s1 = intent.getStringExtra("client_library_version");
        String s = s1;
        if (s1 == null)
        {
            s = "1.0.0";
        }
        a = intent.getStringExtra("video_id");
        b = intent.getStringExtra("playlist_id");
        c = intent.getStringArrayListExtra("video_ids");
        d = intent.getIntExtra("current_index", 0);
        e = intent.getIntExtra("start_time_millis", 0);
        f = intent.getBooleanExtra("autoplay", false);
        g = intent.getBooleanExtra("lightbox_mode", false);
        h = intent.getBooleanExtra("window_has_status_bar", false);
        setTheme(ac.a(g, h));
        super.onCreate(bundle);
        if (!g)
        {
            setRequestedOrientation(6);
        }
        if (!s.matches("^(\\d+\\.){2}(\\d+)(\\w?)$"))
        {
            a(new IllegalStateException("Invalid client version"));
            return;
        } else
        {
            com.google.android.apps.youtube.api.j.a(this, new Handler(getMainLooper()), this, s2, s3, s4, s);
            return;
        }
    }

    public final void onDestroy()
    {
        if (j != null)
        {
            j.a(isFinishing());
        }
        if (i != null)
        {
            j j1 = i;
            boolean flag;
            if (!isFinishing())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j1.a(flag);
        }
        if (k != null && k.isShowing())
        {
            k.dismiss();
        }
        super.onDestroy();
    }

    public final boolean onKeyDown(int l, KeyEvent keyevent)
    {
        return j != null && j.a(l, keyevent) || super.onKeyUp(l, keyevent);
    }

    public final boolean onKeyUp(int l, KeyEvent keyevent)
    {
        return j != null && j.b(l, keyevent) || super.onKeyUp(l, keyevent);
    }

    public final void onPause()
    {
        if (j != null)
        {
            j.g();
        }
        if (k != null)
        {
            k.a();
        }
        super.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        if (j != null)
        {
            j.f();
        }
    }

    public final void onStart()
    {
        super.onStart();
        if (j != null)
        {
            j.e();
        }
    }

    public final void onStop()
    {
        if (j != null)
        {
            j.h();
        }
        super.onStop();
    }
}
