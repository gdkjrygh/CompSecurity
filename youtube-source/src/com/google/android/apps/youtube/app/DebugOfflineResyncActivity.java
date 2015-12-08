// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.w;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.youtube.app:
//            v, q, r, s, 
//            YouTubeApplication, ax, t, u

public class DebugOfflineResyncActivity extends YouTubeActivity
{

    private AsyncTask A;
    private View n;
    private TextView o;
    private Button p;
    private Button q;
    private Button r;
    private TextView s;
    private ListView t;
    private TextView u;
    private as v;
    private Account w;
    private OfflineStoreInterface x;
    private com.google.android.apps.youtube.app.v y;
    private AsyncTask z;

    public DebugOfflineResyncActivity()
    {
    }

    static AsyncTask a(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        return debugofflineresyncactivity.A;
    }

    static AsyncTask b(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        return debugofflineresyncactivity.z;
    }

    static void c(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        debugofflineresyncactivity.e();
    }

    static void d(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        Iterator iterator = debugofflineresyncactivity.x.e().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (x)iterator.next();
            if (((x) (obj)).f() != null)
            {
                obj = ((x) (obj)).f().i().b(0L).a();
                debugofflineresyncactivity.x.a(((v) (obj)));
            }
        } while (true);
    }

    private void e()
    {
        y.a();
        y.a(ContentResolver.getPeriodicSyncs(w, "com.google.android.youtube.provider"));
        s.setText(String.format("Saved resync interval: %d seconds", new Object[] {
            Long.valueOf(x.i())
        }));
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
        setContentView(l.G);
        n = findViewById(j.cT);
        o = (TextView)findViewById(j.a);
        s = (TextView)findViewById(j.aG);
        y = new com.google.android.apps.youtube.app.v(this);
        t = (ListView)findViewById(j.dj);
        t.setAdapter(y);
        p = (Button)findViewById(j.ej);
        p.setOnClickListener(new com.google.android.apps.youtube.app.q(this));
        q = (Button)findViewById(j.bc);
        q.setOnClickListener(new r(this));
        r = (Button)findViewById(j.dY);
        r.setOnClickListener(new s(this));
        u = (TextView)findViewById(j.cM);
        bundle = ((YouTubeApplication)getApplication()).d();
        v = bundle.aQ();
        String s1 = bundle.aV().b();
        if (s1 != null)
        {
            o.setText((new StringBuilder("Signed in as ")).append(s1).toString());
            w = v.a(s1);
            x = bundle.q().a(bundle.aT().c());
            e();
            A = new t(this);
            z = new u(this);
            return;
        } else
        {
            n.setVisibility(8);
            u.setVisibility(0);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        K().a("Offline Resync");
    }
}
