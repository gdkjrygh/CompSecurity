// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ax;
import com.google.android.apps.youtube.core.utils.PackageUtil;

public final class aw extends ax
{

    public final String a;
    private final Context d;

    public aw(ContentResolver contentresolver, Context context)
    {
        Object obj1 = null;
        Object obj = null;
        super(contentresolver, "youtube");
        d = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        context = b.query(Uri.parse("content://com.google.settings/partner"), new String[] {
            "value"
        }, "name='youtube_client_id'", null, null);
        contentresolver = obj1;
        if (context != null)
        {
            contentresolver = obj;
            if (context.moveToFirst())
            {
                int i1 = context.getColumnIndex("value");
                contentresolver = obj;
                if (i1 != -1)
                {
                    contentresolver = context.getString(i1);
                }
            }
            context.close();
        }
        if (!TextUtils.isEmpty(contentresolver)) goto _L2; else goto _L1
_L1:
        context = "mvapp-android-google";
_L4:
        a = context;
        return;
_L2:
        context = contentresolver;
        if (!contentresolver.startsWith("mvapp-android-"))
        {
            context = (new StringBuilder("mvapp-android-")).append(contentresolver).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean X()
    {
        return PackageUtil.a(d) && PackageUtil.g(d) >= 5700;
    }

    private static SparseBooleanArray a(String s1)
    {
        SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
        s1 = s1.split(",");
        int j1 = s1.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            String s2 = s1[i1];
            try
            {
                sparsebooleanarray.put(Integer.parseInt(s2), true);
            }
            catch (NumberFormatException numberformatexception) { }
            i1++;
        }
        return sparsebooleanarray;
    }

    public final int a()
    {
        return a("min_app_version", 0);
    }

    public final int b()
    {
        return a("target_app_version", 0);
    }

    public final SparseBooleanArray c()
    {
        return a(a("blacklisted_app_versions", ""));
    }

    public final SparseBooleanArray d()
    {
        return a(a("discouraged_app_versions", ""));
    }

    public final long e()
    {
        return a("time_between_upgrade_prompts_millis", 0x240c8400L);
    }

    public final String f()
    {
        if (super.f() != null)
        {
            return super.f();
        } else
        {
            return "UA-20803990-1";
        }
    }

    protected final int g()
    {
        return 100;
    }

    public final boolean h()
    {
        return a("enable_mdx_logs", true);
    }

    public final boolean i()
    {
        return a("enable_mdx_private_videos", true);
    }

    public final boolean j()
    {
        return a("enable_mdx_live_videos_5_6", true);
    }

    public final boolean k()
    {
        return a("enable_mdx_v3_protocol_5_6", false);
    }

    public final boolean l()
    {
        return a((new StringBuilder("enable_exo_proxy:")).append(PackageUtil.c(d)).toString(), X());
    }

    public final boolean m()
    {
        return a((new StringBuilder("enable_exo_cache:")).append(PackageUtil.c(d)).toString(), X());
    }

    public final boolean n()
    {
        return X() && android.os.Build.VERSION.SDK_INT >= 14 && a("is_bgol_enabled_5_5", true);
    }

    public final boolean o()
    {
        return a("enable_lact", false);
    }

    public final boolean p()
    {
        return a("enable_more_ads", false);
    }

    public final int q()
    {
        return a("remote_volume_step_percent", 3);
    }

    public final boolean r()
    {
        return a("ads_pings_send_user_auth", true);
    }

    public final boolean s()
    {
        return a("ads_pings_send_visitor_id", true);
    }

    public final boolean t()
    {
        return X() && a((new StringBuilder("enable_amodo_only:")).append(PackageUtil.c(d)).toString(), true);
    }

    public final int u()
    {
        return a((new StringBuilder("exo_buffer_segment_size:")).append(PackageUtil.c(d)).toString(), -1);
    }

    public final int v()
    {
        return a((new StringBuilder("exo_video_buffer_segment_count:")).append(PackageUtil.c(d)).toString(), -1);
    }

    public final int w()
    {
        return a((new StringBuilder("exo_audio_buffer_segment_count:")).append(PackageUtil.c(d)).toString(), -1);
    }
}
