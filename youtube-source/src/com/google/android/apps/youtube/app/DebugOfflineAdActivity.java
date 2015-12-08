// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.a.a.a.a.ml;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.client.h;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.app:
//            l, i, YouTubeApplication, ax, 
//            n, a, b, c, 
//            d, e, f, h

public class DebugOfflineAdActivity extends YouTubeActivity
{

    private Button A;
    private OfflineStoreInterface B;
    private b C;
    private View n;
    private TextView o;
    private TextView p;
    private ListView q;
    private TextView r;
    private com.google.android.apps.youtube.uilib.a.h s;
    private Button t;
    private Button u;
    private Button v;
    private Button w;
    private h x;
    private TextView y;
    private Button z;

    public DebugOfflineAdActivity()
    {
    }

    static b a(DebugOfflineAdActivity debugofflineadactivity)
    {
        return debugofflineadactivity.C;
    }

    static void a(DebugOfflineAdActivity debugofflineadactivity, long l1)
    {
        debugofflineadactivity.x.a(l1);
        debugofflineadactivity.e();
    }

    static OfflineStoreInterface b(DebugOfflineAdActivity debugofflineadactivity)
    {
        return debugofflineadactivity.B;
    }

    static List c(DebugOfflineAdActivity debugofflineadactivity)
    {
        long l1 = debugofflineadactivity.C.a();
        Map map = debugofflineadactivity.B.g();
        TreeMap treemap = new TreeMap();
        for (Iterator iterator = debugofflineadactivity.B.e().iterator(); iterator.hasNext();)
        {
            x x1 = (x)iterator.next();
            if (!map.containsKey(x1.a()))
            {
                treemap.put(x1.b(), new com.google.android.apps.youtube.app.l(x1, null));
            } else
            {
                debugofflineadactivity = new ArrayList();
                Object obj = ((List)map.get(x1.a())).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    ml ml1 = (ml)((Iterator) (obj)).next();
                    if (ml1.b.length > 0)
                    {
                        debugofflineadactivity.add(new i(ml1, l1));
                    }
                } while (true);
                obj = x1.b();
                if (debugofflineadactivity.isEmpty())
                {
                    debugofflineadactivity = null;
                }
                treemap.put(obj, new com.google.android.apps.youtube.app.l(x1, debugofflineadactivity));
            }
        }

        return new ArrayList(treemap.values());
    }

    static TextView d(DebugOfflineAdActivity debugofflineadactivity)
    {
        return debugofflineadactivity.r;
    }

    static ListView e(DebugOfflineAdActivity debugofflineadactivity)
    {
        return debugofflineadactivity.q;
    }

    private void e()
    {
        long l1 = x.g();
        l1 = Math.min(9L, (C.a() - l1) / TimeUnit.MINUTES.toMillis(1L));
        y.setText((new StringBuilder(">=")).append(Long.toString(l1)).append("min").toString());
    }

    static com.google.android.apps.youtube.uilib.a.h f(DebugOfflineAdActivity debugofflineadactivity)
    {
        return debugofflineadactivity.s;
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
        setContentView(l.F);
        n = findViewById(j.cT);
        o = (TextView)findViewById(j.a);
        p = (TextView)findViewById(j.cM);
        bundle = ((YouTubeApplication)getApplication()).d();
        Object obj = bundle.aT();
        C = bundle.aG();
        if (((com.google.android.apps.youtube.core.identity.l) (obj)).b())
        {
            obj = ((com.google.android.apps.youtube.core.identity.l) (obj)).c();
            o.setText((new StringBuilder("Signed in as ")).append(((String) (obj))).toString());
            B = bundle.q().a(((String) (obj)));
        } else
        {
            n.setVisibility(8);
            p.setVisibility(0);
        }
        s = new com.google.android.apps.youtube.uilib.a.h();
        s.a(com/google/android/apps/youtube/app/l, new n(this));
        q = (ListView)findViewById(j.ch);
        r = (TextView)findViewById(0x1020004);
        q.setAdapter(s);
        t = (Button)findViewById(j.bJ);
        t.setOnClickListener(new a(this));
        u = (Button)findViewById(j.eh);
        u.setOnClickListener(new com.google.android.apps.youtube.app.b(this));
        v = (Button)findViewById(j.bd);
        v.setOnClickListener(new c(this));
        w = (Button)findViewById(j.bb);
        w.setOnClickListener(new d(this));
        x = bundle.H();
        y = (TextView)findViewById(j.bZ);
        z = (Button)findViewById(j.bX);
        z.setOnClickListener(new e(this));
        A = (Button)findViewById(j.bY);
        A.setOnClickListener(new f(this));
        e();
    }

    protected void onResume()
    {
        super.onResume();
        (new com.google.android.apps.youtube.app.h(this, (byte)0)).execute(new Void[] {
            null
        });
        K().a(p.dV);
        r.setVisibility(0);
        r.setText("Loading...");
    }
}
