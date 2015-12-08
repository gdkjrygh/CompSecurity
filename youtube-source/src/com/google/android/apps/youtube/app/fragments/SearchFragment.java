// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.provider.SearchRecentSuggestions;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.z;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;
import com.google.android.apps.youtube.app.navigation.AppNavigator;
import com.google.android.apps.youtube.app.search.SearchType;
import com.google.android.apps.youtube.app.ui.LoadingFrameLayout;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.a;
import com.google.android.apps.youtube.app.ui.bi;
import com.google.android.apps.youtube.app.ui.presenter.am;
import com.google.android.apps.youtube.app.ui.presenter.cc;
import com.google.android.apps.youtube.app.ui.presenter.cv;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.innertube.SearchService;
import com.google.android.apps.youtube.datalib.innertube.au;
import com.google.android.apps.youtube.uilib.innertube.q;
import com.google.android.apps.youtube.uilib.innertube.t;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, bp, bo, br, 
//            bs, bn, bq, bm

public class SearchFragment extends PaneFragment
    implements q
{

    private ListView Y;
    private t Z;
    private ax a;
    private LoadingFrameLayout aa;
    private aw ab;
    private bi ac;
    private Handler ad;
    private bq ae;
    private Runnable af;
    private SearchType ag;
    private com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter ah;
    private Spinner ai;
    private Spinner aj;
    private RemoteControlContextualMenuController ak;
    private boolean al;
    private SearchService b;
    private SearchRecentSuggestions d;
    private SharedPreferences e;
    private Analytics f;
    private a g;
    private String h;
    private TextView i;

    public SearchFragment()
    {
        ag = SearchType.DEFAULT_SEARCH_TYPE;
        ah = com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.ALL_TIME;
    }

    private void L()
    {
        Object obj;
        byte abyte0[];
        au au1;
        al = false;
        ah = (com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter)ac.a();
        abyte0 = AppNavigator.b(E().getNavigationEndpoint());
        au1 = b.a();
        au1.a(h);
        au1.a(a.aW());
        obj = ag;
        com.google.android.apps.youtube.app.fragments.bp.a[((SearchType) (obj)).ordinal()];
        JVM INSTR tableswitch 1 2: default 96
    //                   1 183
    //                   2 190;
           goto _L1 _L2 _L3
_L1:
        obj = com.google.android.apps.youtube.datalib.innertube.SearchService.ResultTypeRestrictType.RESULT_TYPE_ANY;
_L8:
        au1.a(((com.google.android.apps.youtube.datalib.innertube.SearchService.ResultTypeRestrictType) (obj)));
        obj = ah;
        bp.b[((com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 144
    //                   1 197
    //                   2 204
    //                   3 211;
           goto _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_211;
_L4:
        obj = com.google.android.apps.youtube.datalib.innertube.SearchService.UploadDateRestrictType.UPLOAD_DATE_ANY;
_L9:
        au1.a(((com.google.android.apps.youtube.datalib.innertube.SearchService.UploadDateRestrictType) (obj)));
        au1.a(abyte0);
        aa.a();
        b.a(au1, new bo(this));
        return;
_L2:
        obj = com.google.android.apps.youtube.datalib.innertube.SearchService.ResultTypeRestrictType.RESULT_TYPE_CHANNEL;
          goto _L8
_L3:
        obj = com.google.android.apps.youtube.datalib.innertube.SearchService.ResultTypeRestrictType.RESULT_TYPE_PLAYLIST;
          goto _L8
_L5:
        obj = com.google.android.apps.youtube.datalib.innertube.SearchService.UploadDateRestrictType.UPLOAD_DATE_TODAY;
          goto _L9
_L6:
        obj = com.google.android.apps.youtube.datalib.innertube.SearchService.UploadDateRestrictType.UPLOAD_DATE_THIS_WEEK;
          goto _L9
        obj = com.google.android.apps.youtube.datalib.innertube.SearchService.UploadDateRestrictType.UPLOAD_DATE_THIS_MONTH;
          goto _L9
    }

    static SearchType a(SearchFragment searchfragment, SearchType searchtype)
    {
        searchfragment.ag = searchtype;
        return searchtype;
    }

    static com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter a(SearchFragment searchfragment, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter)
    {
        searchfragment.ah = timefilter;
        return timefilter;
    }

    static String a(SearchFragment searchfragment)
    {
        return searchfragment.h;
    }

    static LoadingFrameLayout b(SearchFragment searchfragment)
    {
        return searchfragment.aa;
    }

    private final void b(SearchType searchtype, String s1, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter)
    {
        h = s1;
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        h = s1.trim();
_L6:
        if (i != null)
        {
            i.setText(h);
        }
        if (!e.getBoolean("no_search_history", false))
        {
            d.saveRecentQuery(h, null);
        }
        ag = searchtype;
        if (ai != null)
        {
            ai.setSelection(searchtype.ordinal());
        }
        if (timefilter != null)
        {
            ah = timefilter;
        }
        if (!m())
        {
            break; /* Loop/switch isn't completed */
        }
        L();
_L4:
        return;
_L2:
        if (!TextUtils.isEmpty(h)) goto _L4; else goto _L3
_L3:
        h = "";
        if (true) goto _L6; else goto _L5
_L5:
        al = true;
        return;
    }

    static t c(SearchFragment searchfragment)
    {
        return searchfragment.Z;
    }

    static aw d(SearchFragment searchfragment)
    {
        return searchfragment.ab;
    }

    static Analytics e(SearchFragment searchfragment)
    {
        return searchfragment.f;
    }

    static void f(SearchFragment searchfragment)
    {
        searchfragment.L();
    }

    static SearchType g(SearchFragment searchfragment)
    {
        return searchfragment.ag;
    }

    static Runnable h(SearchFragment searchfragment)
    {
        return searchfragment.af;
    }

    static Handler i(SearchFragment searchfragment)
    {
        return searchfragment.ad;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(l.bs, viewgroup, false);
        aa = (LoadingFrameLayout)viewgroup.findViewById(j.cm);
        aa.setOnRetryClickListener(this);
        Y = (ListView)aa.findViewById(j.ei);
        ak = RemoteControlContextualMenuController.a(c, a.W(), ab, WatchFeature.SEARCH, c.P(), a.f());
        cc cc1 = new cc(c, c.q(), a.bf(), a.aw(), a.aT(), a.aQ(), a.bk(), g, a.F(), a.G(), a.ai(), ab, ak);
        z z1 = new z(new am(c, new cv(), a.bf()));
        Z = new t(c.N(), Y, z1, b, a.bf(), cc1, ab);
        if (h == null)
        {
            String s1;
            SearchType asearchtype[];
            int k;
            int i1;
            int j1;
            int k1;
            if (bundle == null)
            {
                bundle = h();
            }
            s1 = bundle.getString("search_query");
            b(SearchType.fromString(bundle.getString("search_type")), s1, (com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter)bundle.getSerializable("time_filter"));
        }
        ai = (Spinner)viewgroup.findViewById(j.es);
        bundle = new ArrayAdapter(c, 0x1090008);
        bundle.setDropDownViewResource(0x1090009);
        asearchtype = SearchType.values();
        k1 = asearchtype.length;
        for (k = 0; k < k1; k++)
        {
            j1 = asearchtype[k].getDescriptionStringResourceId();
            i1 = j1;
            if (j1 == p.hf)
            {
                i1 = p.v;
            }
            bundle.add(a(i1));
        }

        ai.setAdapter(bundle);
        ai.setOnItemSelectedListener(new br(this, (byte)0));
        ai.setSelection(ag.ordinal());
        aj = (Spinner)viewgroup.findViewById(j.fE);
        ac = bi.a(c, new bs(this, (byte)0), ah, aj, l.W);
        i = (TextView)layoutinflater.inflate(l.b, null);
        i.setText(h);
        i.setOnClickListener(new bn(this));
        return viewgroup;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = G().d();
        ab = a.aO();
        b = a.v();
        d = a.j();
        e = a.aP();
        f = a.ba();
        g = new a(a.C());
        ad = new Handler();
        ae = new bq(this, (byte)0);
        af = new bm(this);
    }

    public final void a(SupportActionBar supportactionbar)
    {
        super.a(supportactionbar);
        supportactionbar.a(true);
        supportactionbar.a(i);
    }

    public final void a(SearchType searchtype, String s1, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter)
    {
        c.O().d();
        b(searchtype, s1, timefilter);
    }

    public final void d()
    {
        super.d();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("search_query", h);
        bundle.putString("search_type", ag.toString());
        bundle.putSerializable("time_filter", ah);
    }

    public final void k_()
    {
        L();
    }

    public final void r()
    {
        super.r();
        c.O().a(ae);
        ak.b();
        if (al)
        {
            L();
        }
    }

    public final void s()
    {
        super.s();
        c.O().b(ae);
        ad.removeCallbacks(af);
    }

    public final void t()
    {
        super.t();
        ak.a();
    }
}
