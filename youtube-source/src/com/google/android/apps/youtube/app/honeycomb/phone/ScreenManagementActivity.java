// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.compat.j;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity, ad, o, ac, 
//            q

public class ScreenManagementActivity extends YouTubeActivity
{

    private YouTubeApplication n;
    private YouTubeTvScreensMonitor o;
    private PagedListView p;
    private ArrayAdapter q;

    public ScreenManagementActivity()
    {
    }

    static void a(ScreenManagementActivity screenmanagementactivity)
    {
        screenmanagementactivity.e();
    }

    static void a(String s, FragmentActivity fragmentactivity)
    {
        ah.b(fragmentactivity, Html.fromHtml(fragmentactivity.getString(p.aZ, new Object[] {
            TextUtils.htmlEncode(s)
        })).toString(), 1);
    }

    static boolean a(String s, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((YouTubeTvScreen)list.next()).getScreenName().equals(s))
            {
                return true;
            }
        }

        return false;
    }

    static ArrayAdapter b(ScreenManagementActivity screenmanagementactivity)
    {
        return screenmanagementactivity.q;
    }

    private void e()
    {
        Object obj = o.b();
        q.clear();
        YouTubeTvScreen youtubetvscreen;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); q.add(new ad(youtubetvscreen)))
        {
            youtubetvscreen = (YouTubeTvScreen)((Iterator) (obj)).next();
        }

    }

    protected final boolean a(j j1)
    {
        j1.a();
        return true;
    }

    public final String d()
    {
        return null;
    }

    public void handleSignOutEvent(aj aj)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n = (YouTubeApplication)getApplication();
        o = n.l();
        setContentView(l.aX);
        b(p.dW);
        bundle = new o(this);
        p = (PagedListView)findViewById(com.google.android.youtube.j.ep);
        q = new ac(this, this, l.aW, com.google.android.youtube.j.eq, bundle, (byte)0);
        p.setAdapter(q);
        p.setOnItemClickListener(new q(this));
    }

    protected void onPause()
    {
        super.onPause();
        n.E().b(this);
    }

    public void onResume()
    {
        super.onResume();
        n.E().a(this);
        e();
    }
}
