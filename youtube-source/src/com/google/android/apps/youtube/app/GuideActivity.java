// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.v;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.a.a.a.a.am;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.ls;
import com.google.android.apps.youtube.app.b.m;
import com.google.android.apps.youtube.app.b.s;
import com.google.android.apps.youtube.app.b.t;
import com.google.android.apps.youtube.app.b.u;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.compat.d;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.fragments.ChannelStoreFragment;
import com.google.android.apps.youtube.app.fragments.GuideFragment;
import com.google.android.apps.youtube.app.fragments.LoadingFragment;
import com.google.android.apps.youtube.app.fragments.PaneFragment;
import com.google.android.apps.youtube.app.fragments.SearchFragment;
import com.google.android.apps.youtube.app.fragments.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;
import com.google.android.apps.youtube.app.honeycomb.ui.f;
import com.google.android.apps.youtube.app.navigation.AppNavigator;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.ap;
import com.google.android.apps.youtube.app.search.SearchType;
import com.google.android.apps.youtube.app.ui.SliderLayout;
import com.google.android.apps.youtube.app.ui.ft;
import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.c.e;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.al;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.core.utils.q;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.i;
import com.google.android.youtube.j;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ae, af, aj, YouTubeApplication, 
//            ah, ax, ag, ai

public abstract class GuideActivity extends YouTubeActivity
    implements d, f, ft, gj
{

    private aa A;
    private l B;
    private aw C;
    private Analytics D;
    private String E;
    private com.google.android.gms.c.a F;
    private PaneBackStack G;
    private View H;
    private SignedInState I;
    private ProgressDialog J;
    private af K;
    private af L;
    private GDataRequestFactory M;
    private AppNavigator N;
    private boolean O;
    private boolean P;
    private SearchType Q;
    private PaneDescriptor R;
    private WatchDescriptor S;
    private PaneDescriptor T;
    private boolean U;
    private com.google.android.apps.youtube.app.aj V;
    private an W;
    private boolean X;
    private boolean Y;
    private final com.google.android.apps.youtube.common.c.d Z = new ae(this);
    private final com.google.android.apps.youtube.common.c.d aa = new com.google.android.apps.youtube.app.af(this);
    private e ab;
    private e ac;
    private e ad;
    protected YouTubeApplication n;
    protected Resources o;
    protected h p;
    protected android.support.v4.app.l q;
    protected SliderLayout r;
    protected GuideFragment s;
    protected com.google.android.apps.youtube.app.compat.q t;
    protected boolean u;
    protected boolean v;
    protected boolean w;
    private ax x;
    private a y;
    private SharedPreferences z;

    public GuideActivity()
    {
        Q = SearchType.DEFAULT_SEARCH_TYPE;
    }

    private PaneDescriptor C()
    {
        if (com.google.android.apps.youtube.core.utils.p.a(this) && !p.a() && B.b())
        {
            PaneDescriptor panedescriptor = com.google.android.apps.youtube.app.fragments.navigation.d.i();
            kz kz1 = new kz();
            kz1.s = new ls();
            panedescriptor.setNavigationEndpoint(kz1);
            return panedescriptor;
        } else
        {
            return D();
        }
    }

    private static PaneDescriptor D()
    {
        PaneDescriptor panedescriptor = com.google.android.apps.youtube.app.fragments.navigation.d.b("FEwhat_to_watch", false);
        kz kz1 = new kz();
        kz1.c = new am();
        kz1.c.b = "FEwhat_to_watch";
        panedescriptor.setNavigationEndpoint(kz1);
        return panedescriptor;
    }

    private void E()
    {
        SupportActionBar supportactionbar = K();
        if (U)
        {
            supportactionbar.a(com.google.android.apps.youtube.app.compat.SupportActionBar.HomeAction.NONE, false);
        } else
        if (!G.isEmpty() || !F())
        {
            supportactionbar.a(com.google.android.apps.youtube.app.compat.SupportActionBar.HomeAction.UP, true);
        } else
        if (u)
        {
            supportactionbar.a(com.google.android.apps.youtube.app.compat.SupportActionBar.HomeAction.NONE, false);
        } else
        {
            supportactionbar.a(com.google.android.apps.youtube.app.compat.SupportActionBar.HomeAction.DRAWER_TOGGLE, true);
            if (r())
            {
                supportactionbar.d();
            } else
            {
                supportactionbar.e();
            }
        }
        b();
    }

    private boolean F()
    {
        return isTaskRoot() || X;
    }

    private Intent G()
    {
        return (new Intent(this, com/google/android/apps/youtube/app/honeycomb/Shell$HomeActivity)).setFlags(0x14000000);
    }

    private void H()
    {
        if (s == null)
        {
            s = new GuideFragment();
            a(j.bv, s, "GuideFragment", 0);
        }
    }

    private PaneFragment I()
    {
        PaneFragment panefragment = (PaneFragment)c().a("PaneFragment");
        if (panefragment != null)
        {
            return panefragment;
        } else
        {
            return null;
        }
    }

    private PaneFragment J()
    {
        PaneFragment panefragment = I();
        if (panefragment != null && panefragment.m())
        {
            return panefragment;
        } else
        {
            return null;
        }
    }

    private void T()
    {
        if (T != null)
        {
            PaneFragment panefragment = T.newFragment();
            a(j.di, panefragment, "PaneFragment", 0);
        }
    }

    private void U()
    {
        if (r() && !r.b())
        {
            H.setVisibility(0);
            a(H, 0.7F);
            return;
        } else
        {
            H.setVisibility(8);
            return;
        }
    }

    private void V()
    {
        if (!w)
        {
            PaneFragment panefragment = J();
            if (panefragment != null)
            {
                if (s())
                {
                    panefragment.a(K());
                    return;
                }
                PaneFragment.b(K());
            }
        }
        b(com.google.android.youtube.p.A);
    }

    private void W()
    {
        if (u)
        {
            t();
            V();
            return;
        }
        if (r())
        {
            t();
            V();
            return;
        } else
        {
            u();
            V();
            return;
        }
    }

    private android.support.v4.app.Fragment.SavedState a(android.support.v4.app.Fragment.SavedState savedstate)
    {
        if (savedstate == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        Field field = android/support/v4/app/Fragment$SavedState.getDeclaredField("mState");
        field.setAccessible(true);
        ((Bundle)field.get(savedstate)).setClassLoader(getClassLoader());
        return savedstate;
        savedstate;
        com.google.android.apps.youtube.common.L.b("Set class loader hack failed.", savedstate);
_L2:
        return null;
        savedstate;
        com.google.android.apps.youtube.common.L.b("Set class loader hack failed.", savedstate);
        continue; /* Loop/switch isn't completed */
        savedstate;
        com.google.android.apps.youtube.common.L.b("Set class loader hack failed.", savedstate);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private IntentType a(Intent intent)
    {
        Object obj;
        IntentType intenttype;
        boolean flag;
        boolean flag3;
        boolean flag4;
        obj = null;
        flag4 = false;
        flag3 = false;
        flag = false;
        intenttype = IntentType.NONE;
        if (!intent.hasExtra("pane")) goto _L2; else goto _L1
_L1:
        Object obj1;
        a((PaneDescriptor)intent.getExtras().getParcelable("pane"));
        obj1 = IntentType.BROWSE;
_L4:
        if (!X)
        {
            y.a(new m());
        }
        Y = true;
        return ((IntentType) (obj1));
_L2:
        if (intent.hasExtra("watch"))
        {
            a((WatchDescriptor)intent.getExtras().getParcelable("watch"));
            obj1 = IntentType.WATCH;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = intenttype;
        if (!intent.hasExtra("alias"))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = intent.getStringExtra("alias");
        if (!((String) (obj1)).equals(com/google/android/apps/youtube/app/honeycomb/Shell$HomeActivity.getName()))
        {
            break; /* Loop/switch isn't completed */
        }
        X = true;
        obj = IntentType.BROWSE;
_L5:
        obj1 = obj;
        if (obj == IntentType.NONE)
        {
            obj1 = obj;
            if (intent.hasExtra("query"))
            {
                b(intent);
                obj1 = IntentType.SEARCH;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((String) (obj1)).equals(com/google/android/apps/youtube/app/honeycomb/Shell$ResultsActivity.getName()))
        {
            b(intent);
            obj = IntentType.SEARCH;
        } else
        {
label0:
            {
                if (!((String) (obj1)).equals(com/google/android/apps/youtube/app/honeycomb/Shell$ChannelActivity.getName()))
                {
                    break label0;
                }
                obj1 = intent.getData();
                if (obj1 != null)
                {
                    obj = com.google.android.apps.youtube.app.fragments.navigation.d.a(((Uri) (obj1)));
                } else
                if (intent.hasExtra("username"))
                {
                    obj = com.google.android.apps.youtube.app.fragments.navigation.d.a(intent.getStringExtra("username"));
                }
                if (obj != null)
                {
                    a(((PaneDescriptor) (obj)));
                    flag = true;
                }
                obj = intenttype;
                if (flag)
                {
                    obj = IntentType.BROWSE;
                }
            }
        }
          goto _L5
        if (!((String) (obj1)).equals(com/google/android/apps/youtube/app/honeycomb/Shell$WatchActivity.getName()))
        {
            break MISSING_BLOCK_LABEL_434;
        }
        obj = intent.getDataString();
        if (((String) (obj)).contains("m.youtube.com"))
        {
            boolean flag1;
            if (((String) (obj)).contains("m.youtube.com") && ((String) (obj)).contains("watch"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                com.google.android.apps.youtube.core.utils.m.b(this, intent.getData());
                return IntentType.NONE;
            }
        }
        obj = intent.getData();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        obj1 = com.google.android.apps.youtube.core.utils.q.a(((Uri) (obj)));
        if (obj1 == null || ((q) (obj1)).a == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        flag4 = b(((Uri) (obj)), ((q) (obj1)).a);
_L6:
        obj = intenttype;
        if (flag4)
        {
            obj = IntentType.WATCH;
        }
          goto _L5
        obj = WatchDescriptor.createFromExternalIntent(intent);
        if (obj != null)
        {
            a(((WatchDescriptor) (obj)));
            flag4 = true;
        }
          goto _L6
        if (((String) (obj1)).equals(com/google/android/apps/youtube/app/honeycomb/Shell$PlaylistActivity.getName()))
        {
            obj = intent.getData();
            boolean flag2;
            boolean flag5;
            if (obj != null)
            {
                obj1 = com.google.android.apps.youtube.core.utils.q.a(((Uri) (obj)));
                if (obj1 != null)
                {
                    obj = ((q) (obj1)).a;
                } else
                {
                    obj = null;
                }
                if (obj1 != null)
                {
                    flag5 = ((q) (obj1)).b;
                } else
                {
                    flag5 = false;
                }
            } else
            if (intent.hasExtra("playlist_uri"))
            {
                obj = com.google.android.apps.youtube.core.utils.q.a((Uri)intent.getParcelableExtra("playlist_uri")).a;
                flag5 = false;
            } else
            {
                flag5 = false;
                obj = null;
            }
            if (obj == null)
            {
                obj = IntentType.NONE;
            } else
            if (flag5)
            {
                a(WatchDescriptor.createFromPlaylistId(((String) (obj)), null));
                obj = IntentType.WATCH;
            } else
            {
                com.google.android.apps.youtube.common.fromguava.c.a(obj);
                a(com.google.android.apps.youtube.app.fragments.navigation.d.b(com.google.android.apps.youtube.datalib.innertube.d.a(((String) (obj))), false));
                obj = IntentType.BROWSE;
            }
        } else
        {
            obj = intenttype;
            if (((String) (obj1)).equals(com/google/android/apps/youtube/app/honeycomb/Shell$MediaSearchActivity.getName()))
            {
                obj = WatchDescriptor.createFromMediaSearchIntent(intent);
                if (obj == null)
                {
                    flag2 = flag3;
                } else
                {
                    a(((WatchDescriptor) (obj)));
                    flag2 = true;
                }
                obj = intenttype;
                if (flag2)
                {
                    obj = IntentType.WATCH;
                }
            }
        }
          goto _L5
    }

    private void a(float f1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            Drawable drawable = findViewById(j.bv).getBackground();
            if (drawable != null)
            {
                drawable.setAlpha(ah.a(f1));
            }
        }
    }

    private void a(int i1, Fragment fragment, String s1, int j1)
    {
        v v1 = q.a();
        v1.b(i1, fragment, s1);
        v1.a(j1);
        v1.a();
    }

    private static void a(View view, float f1)
    {
        if (view == null)
        {
            return;
        }
        Drawable drawable = view.getBackground();
        if (drawable != null)
        {
            drawable.setAlpha(ah.a(f1));
        }
        view.invalidate();
    }

    static void a(GuideActivity guideactivity)
    {
        guideactivity.W();
    }

    static void a(GuideActivity guideactivity, ai ai1)
    {
        if (!guideactivity.P)
        {
            guideactivity.c(true);
        }
    }

    static void a(GuideActivity guideactivity, aj aj1)
    {
        guideactivity.T = null;
        guideactivity.f();
    }

    static void a(GuideActivity guideactivity, Exception exception)
    {
        if (guideactivity.J.isShowing())
        {
            guideactivity.dismissDialog(1032);
        }
        if (!guideactivity.p.a()) goto _L2; else goto _L1
_L1:
        guideactivity.C.c(exception);
_L3:
        guideactivity.f();
_L4:
        return;
_L2:
        if (guideactivity.I != SignedInState.NEW) goto _L4; else goto _L3
    }

    private void a(PaneFragment panefragment, PaneDescriptor panedescriptor, boolean flag)
    {
        boolean flag1 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        G.popAll();
_L4:
        if (flag1)
        {
            android.support.v4.app.Fragment.SavedState savedstate = q.a(I());
            G.push(T, savedstate);
        }
        if (B.b() && panedescriptor != null && panedescriptor.mustAuthenticate())
        {
            G.setAuthenticated();
        }
        a(j.di, ((Fragment) (panefragment)), "PaneFragment", 8194);
        return;
_L2:
        if (T != null)
        {
            flag1 = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(com.google.android.apps.youtube.app.fragments.navigation.a a1)
    {
        PaneFragment panefragment = ((PaneDescriptor)a1.a).newFragment();
        a1 = a((android.support.v4.app.Fragment.SavedState)a1.b);
        if (a1 != null)
        {
            panefragment.a(a1);
        }
        a(j.di, ((Fragment) (panefragment)), "PaneFragment", 4097);
    }

    private void b(PaneDescriptor panedescriptor)
    {
        if (panedescriptor != null)
        {
            R = panedescriptor;
        }
        m();
    }

    private void b(boolean flag)
    {
        if (!v)
        {
            if (J() != null)
            {
                PaneFragment.J();
            }
            float f1 = o.getFraction(i.c, 1, 1);
            if ((double)f1 > 0.050000000000000003D && (double)f1 < 0.94999999999999996D)
            {
                if (!u)
                {
                    u = true;
                    r.a(f1);
                    a(1.0F);
                }
                return;
            }
        }
        if (u)
        {
            u = false;
            if (flag)
            {
                r.a(1);
            } else
            {
                r.a();
                i();
            }
        }
        a(0.95F);
    }

    private boolean b(Intent intent)
    {
        String s1 = intent.getStringExtra("query");
        Q = SearchType.fromQuery(s1);
        a(SearchType.removeModifiersFromQuery(s1), (com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter)intent.getSerializableExtra("selected_time_filter"));
        return true;
    }

    private boolean b(Uri uri, String s1)
    {
        try
        {
            a(WatchDescriptor.createFromPlaylistId(s1, (String)al.a(uri).a.get(0)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.apps.youtube.common.L.b((new StringBuilder("invalid intercepted Uri: ")).append(uri).toString());
            C.a(com.google.android.youtube.p.bn);
            d(true);
            return false;
        }
        return true;
    }

    private void c(PaneDescriptor panedescriptor)
    {
        T = panedescriptor;
        if (s != null && s.m())
        {
            s.a();
        }
    }

    private void c(boolean flag)
    {
        byte byte0 = 0;
        if (P)
        {
            return;
        }
        if (J.isShowing())
        {
            dismissDialog(1032);
        }
        I = SignedInState.SIGNED_IN;
        b();
        H();
        boolean flag1;
        if (flag && G.isAuthenticated())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            byte0 = 2;
        }
        if (R != null)
        {
            a(R, byte0 | 1);
            R = null;
            return;
        }
        if (flag1 || T == null)
        {
            a(C(), byte0 | 4);
            y.a(new s());
            return;
        } else
        {
            W();
            return;
        }
    }

    public void A()
    {
        w = false;
        V.sendEmptyMessage(3);
    }

    public final an B()
    {
        return W;
    }

    protected final Dialog a(int i1, Bundle bundle)
    {
        if (i1 == 1032)
        {
            return J;
        } else
        {
            return super.a(i1, bundle);
        }
    }

    public final void a(int i1)
    {
        if (i1 == 0)
        {
            t();
            V();
            r.setTouchInterceptArea(com.google.android.apps.youtube.app.ui.SliderLayout.TouchInterceptArea.ALL);
        } else
        {
            u();
            V();
            r.setTouchInterceptArea(com.google.android.apps.youtube.app.ui.SliderLayout.TouchInterceptArea.LEFT_EDGE);
        }
        U();
    }

    public void a(int i1, int j1)
    {
        if (i1 == j1 || r.b())
        {
            H.setVisibility(8);
        } else
        {
            H.setVisibility(0);
            float f1 = (float)(j1 - i1) / (float)j1;
            a(H, f1 * 0.7F);
        }
        K().a((float)(j1 - i1) / (float)j1);
    }

    public final void a(Uri uri)
    {
        if (I() instanceof ChannelStoreFragment)
        {
            ((ChannelStoreFragment)I()).a(uri);
        }
    }

    public final void a(Uri uri, String s1)
    {
        if (I() instanceof ChannelStoreFragment)
        {
            ((ChannelStoreFragment)I()).a(uri, s1);
        }
    }

    protected abstract void a(IntentType intenttype, boolean flag);

    public final void a(PaneDescriptor panedescriptor)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(panedescriptor);
        if (!P && I != SignedInState.NEW)
        {
            a(panedescriptor, 1);
            return;
        } else
        {
            R = panedescriptor;
            return;
        }
    }

    protected void a(PaneDescriptor panedescriptor, int i1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        Intent intent;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i1 & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag2 = panedescriptor.isGuideEntry();
        if (i1 != 0 || !flag2 || F() || T == null) goto _L2; else goto _L1
_L1:
        intent = G();
        intent.putExtra("pane", panedescriptor);
        startActivity(intent);
_L4:
        return;
_L2:
        flag2 = flag1 | (i1 | flag2);
        if (T != null && T.equals(panedescriptor))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag2 && i1 != 0)
        {
            G.popAll();
        } else
        if (flag2 || i1 == 0)
        {
            if (panedescriptor.mustAuthenticate() && !B.b())
            {
                b(panedescriptor);
                return;
            }
            a(panedescriptor.newFragment(), panedescriptor, flag2);
            c(panedescriptor);
        }
        if (U)
        {
            r.setEnabled(true);
            U = false;
            if (r())
            {
                t();
            } else
            {
                u();
            }
        }
        if (z.getBoolean("show_channel_store_turorial", true) && p())
        {
            r.a(0, false);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!flag) goto _L4; else goto _L3
_L3:
        h();
        return;
    }

    public final void a(WatchDescriptor watchdescriptor)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(watchdescriptor);
        if (!P)
        {
            b(watchdescriptor);
            S = null;
            return;
        } else
        {
            S = watchdescriptor;
            return;
        }
    }

    public void a(RemoteControl remotecontrol, boolean flag)
    {
        super.a(remotecontrol, flag);
        PaneFragment panefragment = J();
        if (panefragment != null && (panefragment instanceof ap))
        {
            ((ap)panefragment).a(remotecontrol, flag);
        }
    }

    public final void a(Subscription subscription)
    {
        if (I() instanceof ChannelStoreFragment)
        {
            ((ChannelStoreFragment)I()).a(subscription);
        }
    }

    public final void a(String s1, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter)
    {
        PaneFragment panefragment = I();
        if (panefragment instanceof SearchFragment)
        {
            ((SearchFragment)panefragment).a(Q, s1, timefilter);
            h();
            return;
        } else
        {
            a(com.google.android.apps.youtube.app.fragments.navigation.d.a(Q, s1, timefilter));
            return;
        }
    }

    public boolean a(MotionEvent motionevent)
    {
        if (s() && J() != null)
        {
            return PaneFragment.I();
        } else
        {
            return true;
        }
    }

    public boolean a(com.google.android.apps.youtube.app.compat.j j1)
    {
        M().a(com.google.android.youtube.m.b, j1);
        t = j1.c(j.cA);
        t.b(false);
        PaneFragment panefragment = J();
        if (panefragment != null)
        {
            panefragment.a(j1);
        }
        if (O)
        {
            O = false;
            onSearchRequested();
        }
        return true;
    }

    public final boolean a(com.google.android.apps.youtube.app.compat.q q1)
    {
        if (q1.e() != j.cA) goto _L2; else goto _L1
_L1:
        if (!B.b()) goto _L4; else goto _L3
_L3:
        D.a("SignOut", "Menu");
        A.a("User action in action bar menu");
_L6:
        return true;
_L4:
        D.a("SignIn", "Menu");
        b(D());
        return true;
_L2:
        PaneFragment panefragment = J();
        if (panefragment == null || !panefragment.a(q1))
        {
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void a_()
    {
        boolean flag = false;
        super.a_();
        P = false;
        String s1;
        if (B.b())
        {
            c(false);
        } else
        if (!B.b() && !A.a())
        {
            m();
        } else
        {
            f();
        }
        s1 = n.s();
        if (!com.google.android.apps.youtube.common.fromguava.b.a(E, s1))
        {
            flag = true;
        }
        E = s1;
        if (flag)
        {
            T();
        }
        if (S != null)
        {
            a(S);
        }
    }

    public final void b(Uri uri)
    {
        if (I() instanceof ChannelStoreFragment)
        {
            ((ChannelStoreFragment)I()).b(uri);
        }
    }

    protected abstract void b(WatchDescriptor watchdescriptor);

    public boolean b(com.google.android.apps.youtube.app.compat.j j1)
    {
        PaneFragment panefragment = J();
        if (panefragment != null)
        {
            panefragment.b(j1);
        }
        if (t != null)
        {
            j1 = t;
            int i1;
            if (B.b())
            {
                i1 = com.google.android.youtube.p.cF;
            } else
            {
                i1 = com.google.android.youtube.p.cE;
            }
            j1.c(i1);
            t.b(p.a());
        }
        return true;
    }

    public final String d()
    {
        return "yt_home";
    }

    public final void d(boolean flag)
    {
        if (!G.isEmpty())
        {
            a(G.pop());
        } else
        {
            if (flag)
            {
                finish();
                return;
            }
            a(C(), 6);
        }
        h();
    }

    protected int e()
    {
        return com.google.android.youtube.l.Y;
    }

    public final void e(boolean flag)
    {
        if (v != flag)
        {
            v = flag;
            w();
            y();
            E();
            if (!v)
            {
                getWindow().setFlags(0, 1024);
            }
            O().b();
            closeOptionsMenu();
            x();
        }
    }

    protected void f()
    {
        if (P)
        {
            return;
        }
        if (J.isShowing())
        {
            dismissDialog(1032);
        }
        I = SignedInState.SIGNED_OUT;
        b();
        H();
        byte byte0;
        if (G.isAuthenticated())
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (R != null && !R.mustAuthenticate())
        {
            a(R, byte0 | 1);
        } else
        if (G.isAuthenticated() || T == null)
        {
            a(C(), byte0 | 4);
            y.a(new t());
        } else
        {
            T();
            W();
        }
        R = null;
    }

    public final void f(boolean flag)
    {
        if (flag)
        {
            V();
        } else
        if (w)
        {
            O().d();
            return;
        }
    }

    public final boolean g()
    {
        if (!G.isEmpty())
        {
            a(G.popCheckpoint());
            E();
        } else
        {
            if (!F())
            {
                Intent intent = G();
                intent.setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
                startActivity(intent);
                return true;
            }
            if (!v)
            {
                if (!r())
                {
                    V.sendEmptyMessage(1);
                    return true;
                } else
                {
                    h();
                    return true;
                }
            }
        }
        return true;
    }

    protected final void h()
    {
        V.sendEmptyMessage(2);
    }

    protected final void i()
    {
        r.a(1, false);
    }

    protected final boolean j()
    {
        return true;
    }

    protected final boolean k()
    {
        return I == SignedInState.SIGNED_IN;
    }

    protected final boolean l()
    {
        return I == SignedInState.SIGNED_OUT;
    }

    public final void m()
    {
        com.google.android.apps.youtube.app.ah ah1;
label0:
        {
            if (!B.b())
            {
                I = SignedInState.NEW;
                b();
                y.a(new u());
                showDialog(1032);
                ah1 = new com.google.android.apps.youtube.app.ah(this);
                if (!A.a())
                {
                    break label0;
                }
                A.a(this, ah1);
            }
            return;
        }
        A.b(this, ah1);
    }

    public final void n()
    {
        PaneDescriptor panedescriptor = I().E();
        if (panedescriptor != null)
        {
            Q = panedescriptor.getSearchType();
        }
        boolean flag;
        if (T == null)
        {
            if (panedescriptor == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = T.equals(panedescriptor);
        }
        if (!flag)
        {
            c(panedescriptor);
        }
        b(true);
        E();
    }

    public final PaneDescriptor o()
    {
        return T;
    }

    public void onBackPressed()
    {
        if (r() && s != null && !u)
        {
            h();
            return;
        }
        if (J() != null)
        {
            PaneFragment.K();
        }
        d(true);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        b(false);
        w();
        O().e();
    }

    protected void onCreate(Bundle bundle)
    {
        R();
        super.onCreate(bundle);
        n = (YouTubeApplication)getApplication();
        x = n.d();
        y = x.bf();
        o = getResources();
        q = c();
        V = new com.google.android.apps.youtube.app.aj(this);
        P = false;
        I = SignedInState.NEW;
        N = new AppNavigator(this, y);
        z = x.aP();
        A = x.bk();
        B = x.aT();
        C = x.aO();
        D = x.ba();
        E = n.s();
        W = x.W();
        p = x.aX();
        if (bundle != null)
        {
            G = (PaneBackStack)bundle.getParcelable("back_stack");
            T = (PaneDescriptor)bundle.getParcelable("current_descriptor");
        } else
        {
            G = new PaneBackStack();
        }
        bundle = x.f();
        K = bundle.t();
        L = bundle.k();
        M = bundle.a();
        setContentView(e());
        getWindow().setBackgroundDrawableResource(com.google.android.youtube.f.e);
        r = (SliderLayout)findViewById(j.eP);
        r.setTouchInterceptArea(com.google.android.apps.youtube.app.ui.SliderLayout.TouchInterceptArea.LEFT_EDGE);
        r.setListener(this);
        H = findViewById(j.fK);
        s = (GuideFragment)c().a("GuideFragment");
        w();
        b(false);
        K().a(this);
        H.setOnClickListener(new ag(this));
        if (T == null)
        {
            U = true;
            a(new LoadingFragment(), null, true);
            i();
            r.setEnabled(false);
            c(((PaneDescriptor) (null)));
        }
        J = new ProgressDialog(this);
        J.setMessage(getString(com.google.android.youtube.p.fC));
        J.setCancelable(false);
        J.setCanceledOnTouchOutside(false);
        F = new com.google.android.gms.c.a(this, 11, null, null);
        F.a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (F != null)
        {
            F.b();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        PaneFragment panefragment = J();
        boolean flag;
        if (panefragment != null && (panefragment instanceof android.view.KeyEvent.Callback))
        {
            flag = ((android.view.KeyEvent.Callback)panefragment).onKeyDown(i1, keyevent);
        } else
        {
            flag = false;
        }
        return flag || super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        PaneFragment panefragment = J();
        boolean flag;
        if (panefragment != null && (panefragment instanceof android.view.KeyEvent.Callback))
        {
            flag = ((android.view.KeyEvent.Callback)panefragment).onKeyUp(i1, keyevent);
        } else
        {
            flag = false;
        }
        return flag || super.onKeyUp(i1, keyevent);
    }

    protected void onNewIntent(Intent intent)
    {
        Y = false;
        if ("com.google.android.youtube.action.search".equals(intent.getAction()))
        {
            onSearchRequested();
            a(IntentType.SEARCH, false);
            return;
        }
        IntentType intenttype = a(intent);
        if (intenttype != IntentType.NONE)
        {
            a(intenttype, false);
            return;
        } else
        {
            super.onNewIntent(intent);
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
        P = true;
        y.a(new e[] {
            ab, ad
        });
        O().b(this);
        V.removeMessages(1);
        V.removeMessages(2);
        V.removeMessages(3);
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        if (bundle != null)
        {
            y.a(new m());
            Y = bundle.getBoolean("has_handled_intent", false);
        }
        if (!Y)
        {
            bundle = getIntent();
            if (bundle != null)
            {
                IntentType intenttype = IntentType.NONE;
                if ("com.google.android.youtube.action.search".equals(bundle.getAction()))
                {
                    O = true;
                    bundle = IntentType.SEARCH;
                } else
                {
                    bundle = a(bundle);
                }
                if (bundle != IntentType.NONE)
                {
                    a(bundle, true);
                }
            }
        }
    }

    protected void onResume()
    {
        super.onResume();
        Object obj = F;
        String s1 = getPackageName();
        ((com.google.android.gms.c.a) (obj)).a(System.currentTimeMillis(), s1, null, null);
        ab = y.a(this, com/google/android/apps/youtube/core/identity/aj, Z);
        ad = y.a(this, com/google/android/apps/youtube/core/identity/ai, aa);
        obj = O();
        ((ActionBarMenuHelper) (obj)).a(this);
        w = ((ActionBarMenuHelper) (obj)).c();
        E();
        V();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("back_stack", G);
        bundle.putParcelable("current_descriptor", T);
        bundle.putBoolean("has_handled_intent", Y);
    }

    protected void onStart()
    {
        super.onStart();
        ac = y.a(this, com/google/android/apps/youtube/common/network/a, new com.google.android.apps.youtube.app.ai(this, (byte)0));
    }

    protected void onStop()
    {
        super.onStop();
        y.a(new e[] {
            ac
        });
    }

    public boolean p()
    {
        return !v;
    }

    public final com.google.android.apps.youtube.datalib.d.a q()
    {
        return N;
    }

    public final boolean r()
    {
        boolean flag = false;
        if (r != null)
        {
            flag = r.b(0);
        }
        return flag;
    }

    public final boolean s()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (r == null)
            {
                break label0;
            }
            if (!u)
            {
                flag = flag1;
                if (!r.b(1))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    protected void t()
    {
        if (!w)
        {
            E();
        }
    }

    protected void u()
    {
        if (!w)
        {
            E();
        }
    }

    public void v()
    {
        t();
        V();
        U();
    }

    protected void w()
    {
        int i1;
        if (!v)
        {
            i1 = O().a();
        } else
        {
            i1 = 0;
        }
        r.setPadding(0, i1, 0, 0);
    }

    protected void x()
    {
        if (v)
        {
            r.setEnabled(false);
            if (r())
            {
                i();
            }
        } else
        {
            SliderLayout sliderlayout = r;
            boolean flag;
            if (!U)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sliderlayout.setEnabled(flag);
        }
        b(false);
    }

    protected abstract void y();

    public void z()
    {
        w = true;
    }

    private class IntentType extends Enum
    {

        private static final IntentType $VALUES[];
        public static final IntentType BROWSE;
        public static final IntentType NONE;
        public static final IntentType SEARCH;
        public static final IntentType WATCH;

        public static IntentType valueOf(String s1)
        {
            return (IntentType)Enum.valueOf(com/google/android/apps/youtube/app/GuideActivity$IntentType, s1);
        }

        public static IntentType[] values()
        {
            return (IntentType[])$VALUES.clone();
        }

        static 
        {
            NONE = new IntentType("NONE", 0);
            WATCH = new IntentType("WATCH", 1);
            SEARCH = new IntentType("SEARCH", 2);
            BROWSE = new IntentType("BROWSE", 3);
            $VALUES = (new IntentType[] {
                NONE, WATCH, SEARCH, BROWSE
            });
        }

        private IntentType(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class SignedInState extends Enum
    {

        private static final SignedInState $VALUES[];
        public static final SignedInState NEW;
        public static final SignedInState SIGNED_IN;
        public static final SignedInState SIGNED_OUT;

        public static SignedInState valueOf(String s1)
        {
            return (SignedInState)Enum.valueOf(com/google/android/apps/youtube/app/GuideActivity$SignedInState, s1);
        }

        public static SignedInState[] values()
        {
            return (SignedInState[])$VALUES.clone();
        }

        static 
        {
            NEW = new SignedInState("NEW", 0);
            SIGNED_IN = new SignedInState("SIGNED_IN", 1);
            SIGNED_OUT = new SignedInState("SIGNED_OUT", 2);
            $VALUES = (new SignedInState[] {
                NEW, SIGNED_IN, SIGNED_OUT
            });
        }

        private SignedInState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
