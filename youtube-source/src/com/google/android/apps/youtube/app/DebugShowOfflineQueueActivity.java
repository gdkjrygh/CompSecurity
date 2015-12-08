// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.a.a.c;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.common.database.e;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.datalib.offline.i;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            YouTubeApplication, ax, ab, z

public class DebugShowOfflineQueueActivity extends YouTubeActivity
{

    private i n;
    private ListView o;
    private TextView p;
    private h q;
    private AsyncTask r;

    public DebugShowOfflineQueueActivity()
    {
    }

    static i a(DebugShowOfflineQueueActivity debugshowofflinequeueactivity)
    {
        return debugshowofflinequeueactivity.n;
    }

    static List a(DebugShowOfflineQueueActivity debugshowofflinequeueactivity, i k)
    {
        debugshowofflinequeueactivity = k.d();
        k = new ArrayList();
        for (; debugshowofflinequeueactivity.hasNext(); k.add(debugshowofflinequeueactivity.next())) { }
        debugshowofflinequeueactivity.a();
        return k;
    }

    static TextView b(DebugShowOfflineQueueActivity debugshowofflinequeueactivity)
    {
        return debugshowofflinequeueactivity.p;
    }

    static h c(DebugShowOfflineQueueActivity debugshowofflinequeueactivity)
    {
        return debugshowofflinequeueactivity.q;
    }

    public final String d()
    {
        return null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!PackageUtil.b(this))
        {
            finish();
        }
        setContentView(l.L);
        n = ((YouTubeApplication)getApplication()).d().ab();
        q = new h();
        q.a(com/google/android/apps/youtube/a/a/c, new ab(this));
        o = (ListView)findViewById(j.ch);
        p = (TextView)findViewById(0x1020004);
        o.setAdapter(q);
        r = new z(this);
    }

    protected void onResume()
    {
        super.onResume();
        r.execute(new Void[] {
            null
        });
        K().a("Show offline queue");
        p.setVisibility(0);
        p.setText("Loading...");
    }
}
