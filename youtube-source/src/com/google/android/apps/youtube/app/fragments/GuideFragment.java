// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.b.r;
import com.google.android.apps.youtube.app.d.ae;
import com.google.android.apps.youtube.app.d.ai;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.navigation.AppNavigator;
import com.google.android.apps.youtube.app.ui.cp;
import com.google.android.apps.youtube.app.ui.cq;
import com.google.android.apps.youtube.app.ui.de;
import com.google.android.apps.youtube.app.ui.q;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.identity.z;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.innertube.j;
import com.google.android.apps.youtube.datalib.innertube.model.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.a.c;
import com.google.android.apps.youtube.datalib.innertube.model.a.g;
import com.google.android.apps.youtube.datalib.innertube.model.a.i;
import com.google.android.apps.youtube.datalib.offline.n;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.f;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ab, t, u, v, 
//            w, x, y, z, 
//            aa

public class GuideFragment extends Fragment
    implements ai
{

    private ax Y;
    private aw Z;
    private WatchWhileActivity a;
    private j aa;
    private n ab;
    private l ac;
    private AppNavigator ad;
    private ae ae;
    private c af;
    private h ag;
    private ArrayList ah;
    private ListView b;
    private View c;
    private ProgressBar d;
    private LinearLayout e;
    private ImageView f;
    private TextView g;
    private Button h;
    private View i;

    public GuideFragment()
    {
    }

    static c a(GuideFragment guidefragment, c c1)
    {
        guidefragment.af = null;
        return null;
    }

    static void a(GuideFragment guidefragment)
    {
        guidefragment.a(false);
    }

    static void a(GuideFragment guidefragment, String s1, boolean flag)
    {
        guidefragment.a(s1, true);
    }

    private void a(String s1, boolean flag)
    {
        boolean flag1 = false;
        d.setVisibility(8);
        g.setText(s1);
        e.setVisibility(0);
        s1 = f;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        s1.setVisibility(k);
        s1 = h;
        if (flag)
        {
            k = ((flag1) ? 1 : 0);
        } else
        {
            k = 8;
        }
        s1.setVisibility(k);
    }

    private void a(boolean flag)
    {
label0:
        {
label1:
            {
                if (m())
                {
                    if (!p.a(a) || !ab.a())
                    {
                        break label0;
                    }
                    b(true);
                    if (!ac.b())
                    {
                        break label1;
                    }
                    ae.a();
                    i.setBackgroundResource(f.f);
                }
                return;
            }
            ae.b();
            i.setVisibility(8);
            return;
        }
        b(false);
        b.setVisibility(8);
        c.setVisibility(0);
        e.setVisibility(8);
        g.setText("");
        d.setVisibility(0);
        ae.a();
        com.google.android.apps.youtube.datalib.innertube.l l1 = aa.a();
        l1.a(flag);
        aa.a(l1, new ab(this));
    }

    static WatchWhileActivity b(GuideFragment guidefragment)
    {
        return guidefragment.a;
    }

    private void b(boolean flag)
    {
        boolean flag1 = false;
        View view = i;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        view.setVisibility(k);
        if (flag)
        {
            b.setVisibility(8);
            c.setVisibility(0);
            String s1 = j().getString(com.google.android.youtube.p.cg);
            flag = flag1;
            if (!ac.b())
            {
                flag = true;
            }
            a(s1, flag);
        }
    }

    static ListView c(GuideFragment guidefragment)
    {
        return guidefragment.b;
    }

    static AppNavigator d(GuideFragment guidefragment)
    {
        return guidefragment.ad;
    }

    static ax e(GuideFragment guidefragment)
    {
        return guidefragment.Y;
    }

    static h f(GuideFragment guidefragment)
    {
        return guidefragment.ag;
    }

    static void g(GuideFragment guidefragment)
    {
        guidefragment.ag.b();
        Iterator iterator = guidefragment.ah.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if (!(obj instanceof c) || ((c)obj).h())
            {
                guidefragment.ag.a(obj);
            }
        } while (true);
    }

    static ArrayList h(GuideFragment guidefragment)
    {
        return guidefragment.ah;
    }

    static void i(GuideFragment guidefragment)
    {
        guidefragment.d.setVisibility(8);
        guidefragment.b.setVisibility(0);
        guidefragment.e.setVisibility(8);
        guidefragment.a();
    }

    static aw j(GuideFragment guidefragment)
    {
        return guidefragment.Z;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.youtube.l.af, viewgroup, false);
        ae.a(layoutinflater);
        c = layoutinflater.findViewById(com.google.android.youtube.j.eR);
        d = (ProgressBar)c.findViewWithTag("progressbar");
        e = (LinearLayout)c.findViewWithTag("error");
        g = (TextView)c.findViewWithTag("error_message");
        f = (ImageView)c.findViewWithTag("alert_error");
        h = (Button)c.findViewWithTag("retry_button");
        h.setOnClickListener(new t(this));
        b = (ListView)layoutinflater.findViewById(com.google.android.youtube.j.by);
        ag = new h();
        ag.a(com/google/android/apps/youtube/datalib/innertube/model/a/g, new u(this));
        ag.a(com/google/android/apps/youtube/datalib/innertube/model/a/f, new v(this));
        ag.a(com/google/android/apps/youtube/datalib/innertube/model/a/i, new w(this));
        ag.a(com/google/android/apps/youtube/datalib/innertube/model/a/c, new x(this));
        ag.a(com/google/android/apps/youtube/datalib/innertube/model/a/b, new y(this));
        b.setAdapter(ag);
        b.setOnItemClickListener(new com.google.android.apps.youtube.app.fragments.z(this));
        i = layoutinflater.findViewById(com.google.android.youtube.j.bx);
        i.setOnClickListener(new aa(this));
        if (Y.aP().getBoolean("show_channel_store_turorial", true))
        {
            Y.aP().edit().putBoolean("show_channel_store_turorial", false).apply();
        }
        return layoutinflater;
    }

    public final void a()
    {
        if (af != null)
        {
            af.b(false);
            af = null;
        }
        ag.notifyDataSetChanged();
        Object obj = a.o();
        int k;
        int i1;
        if (obj != null)
        {
            obj = ((PaneDescriptor) (obj)).getNavigationEndpoint();
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            return;
        }
        i1 = ag.getCount();
        k = 0;
        do
        {
label0:
            {
                if (k < i1)
                {
                    Object obj1 = ag.getItem(k);
                    if ((obj1 instanceof b) || !(obj1 instanceof c))
                    {
                        break label0;
                    }
                    obj1 = (c)obj1;
                    if (!((c) (obj1)).a(((com.google.a.a.a.a.kz) (obj))))
                    {
                        break label0;
                    }
                    ((c) (obj1)).b(true);
                    af = ((c) (obj1));
                }
                ag.notifyDataSetChanged();
                return;
            }
            k++;
        } while (true);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        com.google.android.apps.youtube.common.fromguava.c.a(i() instanceof WatchWhileActivity, "GuideFragment must be attached to an instance of GuideActivity.");
        a = (WatchWhileActivity)i();
        Y = ((YouTubeApplication)a.getApplication()).d();
        Z = Y.aO();
        aa = Y.s();
        ab = Y.m();
        ac = Y.aT();
        ad = AppNavigator.a(a, Y.bf());
        ae = new ae(a, Y);
        ae.a(this);
        ah = new ArrayList();
    }

    public final void b()
    {
        a.m();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
    }

    public void handleChannelSubscribed(com.google.android.apps.youtube.app.ui.p p1)
    {
        L.e("Guide refreshing due to channel subscription ");
        a(true);
    }

    public void handleChannelUnsubscribed(q q)
    {
        L.e("Guide refreshing due to channel un-subscription ");
        a(true);
    }

    public void handleConnectivityChanged(com.google.android.apps.youtube.common.network.a a1)
    {
        if (p.a(a))
        {
            a(false);
        }
    }

    public void handlePlaylistAddAction(cp cp)
    {
        L.e("Guide refreshing due to playlist addition");
        a(true);
    }

    public void handlePlaylistDeleteAction(cq cq)
    {
        L.e("Guide refreshing due to playlist deletion");
        a(true);
    }

    public void handlePlaylistLikeAction(de de)
    {
        L.e("Guide refreshing due to playlist like action");
        a(true);
    }

    public void handleProfileChanged(com.google.android.apps.youtube.core.identity.n n1)
    {
        ae.a();
    }

    public void handleSignIn(com.google.android.apps.youtube.core.identity.ai ai1)
    {
        a(false);
    }

    public void handleSignOut(aj aj)
    {
        a(false);
    }

    public final void r()
    {
        super.r();
        Y.bf().a(this);
        a(false);
        Y.bf().a(new r());
        if (ac.b() && ac.d().a().isEmpty())
        {
            ac.a(Y.f(), Y.bf());
        }
    }

    public final void s()
    {
        super.s();
        Y.bf().b(this);
    }
}
