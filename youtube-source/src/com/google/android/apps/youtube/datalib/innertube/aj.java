// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.content.SharedPreferences;
import com.google.a.a.a.a.ct;
import com.google.a.a.a.a.ii;
import com.google.android.apps.youtube.common.e.c;
import com.google.android.apps.youtube.datalib.a.f;
import java.util.HashMap;
import java.util.Map;

public final class aj
    implements f
{

    private static final Map a;
    private final SharedPreferences b;
    private final boolean c;

    public aj(SharedPreferences sharedpreferences, boolean flag)
    {
        b = sharedpreferences;
        c = flag;
    }

    public final void a(ii ii1)
    {
        String s = b.getString("ExoPlayer", com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.getDefaultValue(c).name());
        if (!a.containsKey(s) || com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.SERVER_EXPERIMENT.name().equals(s))
        {
            return;
        }
        ct ct1;
        if (ii1.b != null)
        {
            ct1 = ii1.b;
        } else
        {
            ct1 = new ct();
        }
        ct1.e = com.google.android.apps.youtube.common.e.c.a(ct1.e, new int[] {
            ((Integer)a.get(s)).intValue()
        });
        ii1.b = ct1;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put(com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.OFF.name(), Integer.valueOf(0xdc502));
        hashmap.put(com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.NON_ADAPTIVE.name(), Integer.valueOf(0xe6b04));
        hashmap.put(com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.ADAPTIVE.name(), Integer.valueOf(0xe6b05));
        a = hashmap;
    }
}
