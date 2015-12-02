// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import cjg;
import cji;
import cjk;
import cjn;
import cjo;
import cjp;
import cjq;
import cjt;
import cjw;
import cjy;
import cka;
import ckd;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.map.MapView;
import com.ubercab.android.map.Marker;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.map.MapViewExtension;
import com.ubercab.client.feature.trip.event.PanelSlideEvent;
import czb;
import czi;
import czj;
import dak;
import daq;
import dbf;
import dce;
import dfp;
import djb;
import dtz;
import eeg;
import eei;
import eem;
import eeo;
import eep;
import eer;
import eet;
import ewg;
import ewm;
import fpv;
import fqp;
import fta;
import fte;
import fwk;
import fyi;
import fyp;
import fzc;
import fzg;
import fzh;
import fzi;
import fzj;
import fzk;
import fzl;
import fzn;
import fzp;
import fzq;
import fzu;
import fzv;
import gaq;
import gmg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n;

public class MapFragment extends czb
    implements cjp, cjq, cjt, eem, eeo, eer, fpv, fwk
{

    public static final UberLatLng c = new UberLatLng(0.0D, 0.0D);
    private Rect A;
    private Rect B;
    private eep C;
    private cjy D;
    private final List E = new CopyOnWriteArrayList();
    private final List F = new CopyOnWriteArrayList();
    private final List G = new ArrayList();
    private final Handler H = new Handler(Looper.getMainLooper());
    private final Runnable I = new Runnable() {

        final MapFragment a;

        public final void run()
        {
            boolean flag;
            if (!MapFragment.a(a, a.j.g()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.a(flag);
        }

            
            {
                a = MapFragment.this;
                super();
            }
    };
    public chp d;
    public cev e;
    public gmg f;
    public ewg g;
    public dak h;
    public fta i;
    public fte j;
    public dce k;
    public fzk l;
    public fzl m;
    ImageButton mButtonMyLocation;
    MapView mViewMap;
    MapViewExtension mViewMapExtension;
    public RiderApplication n;
    public ewm o;
    fzq p;
    boolean q;
    cjk r;
    cjn s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private Bundle z;

    public MapFragment()
    {
        w = 0x80000000;
    }

    static Bundle a(MapFragment mapfragment)
    {
        return mapfragment.z;
    }

    private void a(cji cji)
    {
        if (!r())
        {
            return;
        } else
        {
            t = true;
            s.b(cji);
            t = false;
            v();
            u();
            return;
        }
    }

    private void a(cjn cjn1, Bundle bundle)
    {
        Object obj = h.b();
        RiderLocation riderlocation = ((RiderLocation) (obj));
        if (obj == null)
        {
            riderlocation = h.c();
        }
        if (riderlocation == null || cjn1.b() == null)
        {
            return;
        }
        obj = riderlocation.getUberLatLng();
        if (bundle != null && bundle.containsKey("com.ubercab.CAMERA_POSITION"))
        {
            bundle = new cjg("com.ubercab.CAMERA_POSITION", bundle);
            a(cjk.a(bundle.b(), bundle.d()));
        } else
        {
            a(cjk.a(riderlocation.getUberLatLng(), 15F));
        }
        mViewMapExtension.a(cjn1.b().a(((UberLatLng) (obj))));
        b(false);
    }

    static void a(MapFragment mapfragment, cjn cjn1, Bundle bundle)
    {
        mapfragment.a(cjn1, bundle);
    }

    private void a(fzp fzp1)
    {
        fzp1.a(this);
    }

    static boolean a(MapFragment mapfragment, int i1)
    {
        return mapfragment.c(i1);
    }

    private fzp b(dfp dfp)
    {
        p = new fzq(this);
        return fzg.a().a(new djb(this)).a(p).a(dfp).a();
    }

    private void b(cji cji)
    {
        if (!r())
        {
            return;
        } else
        {
            t = true;
            s.a(cji, x, new cjo() {

                final MapFragment a;

                public final void a()
                {
                    if (MapFragment.c(a))
                    {
                        MapFragment.d(a);
                        a.mViewMap.post(new Runnable(this) {

                            final _cls4 a;

                            public final void run()
                            {
                                MapFragment.e(a.a);
                                MapFragment.f(a.a);
                            }

            
            {
                a = _pcls4;
                super();
            }
                        });
                    }
                }

                public final void b()
                {
                    if (MapFragment.c(a))
                    {
                        MapFragment.d(a);
                        MapFragment.e(a);
                        MapFragment.f(a);
                    }
                }

            
            {
                a = MapFragment.this;
                super();
            }
            });
            mViewMap.postDelayed(new Runnable() {

                final MapFragment a;

                public final void run()
                {
                    while (!a.isAdded() || !MapFragment.c(a)) 
                    {
                        return;
                    }
                    MapFragment.d(a);
                    MapFragment.e(a);
                    MapFragment.f(a);
                }

            
            {
                a = MapFragment.this;
                super();
            }
            }, x + 500);
            return;
        }
    }

    private void b(cjn cjn1, Bundle bundle)
    {
        boolean flag;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.ubercab.STATE_SHOW_DESTINATION_ETA_TIME", false);
        } else
        {
            flag = false;
        }
        cjn1 = fzi.a().a(p).a((fqp)((czi)getActivity()).d()).a(new fzv(cjn1, this, getActivity(), flag)).a();
        G.add(cjn1.b());
        G.add(cjn1.h());
        G.add(cjn1.g());
        G.add(cjn1.f());
        G.add(cjn1.e());
        if (!g.e())
        {
            G.add(cjn1.d());
        }
        G.add(cjn1.c());
        G.add(cjn1.i());
    }

    static void b(MapFragment mapfragment, cjn cjn1, Bundle bundle)
    {
        mapfragment.b(cjn1, bundle);
    }

    private void b(eep eep1)
    {
        cji cji = eep1.a(mViewMap.getWidth(), mViewMap.getHeight());
        if (eep1.b())
        {
            b(cji);
            return;
        } else
        {
            a(cji);
            return;
        }
    }

    private void b(boolean flag)
    {
        boolean flag1 = true;
        if (q) goto _L2; else goto _L1
_L1:
        final class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[fzn.a().length];
                try
                {
                    a[fzn.e - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[fzn.d - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[fzn.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[fzn.g - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[fzn.h - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[fzn.i - 1] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[fzn.f - 1] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6.a[m.e() - 1];
        JVM INSTR tableswitch 1 7: default 64
    //                   1 97
    //                   2 97
    //                   3 102
    //                   4 102
    //                   5 102
    //                   6 102
    //                   7 117;
           goto _L2 _L3 _L3 _L4 _L4 _L4 _L4 _L5
_L3:
        flag1 = false;
        continue;
_L4:
        if (m.f())
        {
            flag1 = false;
        }
        continue;
_L5:
        boolean flag2;
        if (j.i() != null && j.a())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (m.f() || flag2)
        {
            flag1 = false;
        }
        continue;
_L2:
        flag1 = false;
        do
        {
            if (flag1 && mButtonMyLocation.getVisibility() == 0 || !flag1 && mButtonMyLocation.getVisibility() == 8)
            {
                return;
            }
            if (flag)
            {
                if (flag1)
                {
                    mButtonMyLocation.setAlpha(0.0F);
                    mButtonMyLocation.setVisibility(0);
                    mButtonMyLocation.animate().alpha(1.0F).setListener(null).setDuration(x).start();
                    return;
                } else
                {
                    mButtonMyLocation.animate().alpha(0.0F).setDuration(x).setListener(new AnimatorListenerAdapter() {

                        final MapFragment a;

                        public final void onAnimationEnd(Animator animator)
                        {
                            if (a.mButtonMyLocation != null)
                            {
                                a.mButtonMyLocation.setVisibility(8);
                            }
                        }

            
            {
                a = MapFragment.this;
                super();
            }
                    }).start();
                    return;
                }
            }
            if (flag1)
            {
                mButtonMyLocation.setAlpha(1.0F);
                mButtonMyLocation.setVisibility(0);
                return;
            }
            mButtonMyLocation.setAlpha(0.0F);
            mButtonMyLocation.setVisibility(8);
            return;
        } while (true);
    }

    static boolean b(MapFragment mapfragment)
    {
        return mapfragment.v;
    }

    private boolean c(int i1)
    {
        return i1 == 1 || i1 == 2 || i1 == 4 && o.k();
    }

    static boolean c(MapFragment mapfragment)
    {
        return mapfragment.t;
    }

    static boolean d(MapFragment mapfragment)
    {
        mapfragment.t = false;
        return false;
    }

    static void e(MapFragment mapfragment)
    {
        mapfragment.v();
    }

    static void f(MapFragment mapfragment)
    {
        mapfragment.u();
    }

    private boolean r()
    {
        return s != null;
    }

    private boolean s()
    {
        return s != null && s.c() != null && s.c().b();
    }

    private void t()
    {
        mViewMap.a(new cka() {

            final MapFragment a;

            public final void a(cjn cjn1)
            {
                a.s = cjn1;
                cjn1.a(a);
                cjn1.a(a);
                cjn1.a(a);
                boolean flag;
                if (!a.f.b(dbf.bX))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                cjn1.a(flag);
                cjn1.d();
                cjn1.e();
                if (!a.f.b(dbf.bP))
                {
                    cjn1.b(true);
                }
                if (cjn1.c() != null)
                {
                    cjn1.c().d();
                    cjn1.c().b(true);
                    cjn1.c().f();
                    cjn1.c().h();
                    cjn1.c().g();
                    cjn1.c().e();
                    cjn1.c().i();
                    a.mViewMapExtension.a(a);
                    a.mViewMapExtension.a(a);
                    MapViewExtension mapviewextension = a.mViewMapExtension;
                    Object obj;
                    if (a.f.b(dbf.bH))
                    {
                        obj = new eei();
                    } else
                    {
                        obj = new eeg(a.getActivity());
                    }
                    mapviewextension.a(((eej) (obj)));
                    MapFragment.a(a, cjn1, MapFragment.a(a));
                    MapFragment.b(a, cjn1, MapFragment.a(a));
                    if (MapFragment.b(a))
                    {
                        a.q();
                        return;
                    }
                }
            }

            
            {
                a = MapFragment.this;
                super();
            }
        });
    }

    private void u()
    {
        eep eep1 = C;
        if (eep1 != null)
        {
            C = null;
            b(eep1);
        }
    }

    private void v()
    {
        Rect rect = B;
        if (rect != null)
        {
            B = null;
            a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    private void w()
    {
        Object obj1 = h.c();
        if (obj1 == null)
        {
            return;
        }
        int i1 = m.e();
        Object obj = h.b();
        if (obj != null)
        {
            obj = ((RiderLocation) (obj)).getUberLatLng();
        } else
        {
            obj = null;
        }
        if (i1 == fzn.c || i1 == fzn.f)
        {
            obj1 = ((RiderLocation) (obj1)).getUberLatLng();
            boolean flag;
            if (obj != null && ((UberLatLng) (obj)).b(((UberLatLng) (obj1))))
            {
                flag = ((UberLatLng) (obj)).b(((UberLatLng) (obj1)));
            } else
            {
                flag = false;
            }
            m.a(flag);
            return;
        } else
        {
            b(true);
            return;
        }
    }

    public final View a(Marker marker)
    {
        for (Iterator iterator = G.iterator(); iterator.hasNext();)
        {
            View view = ((eet)iterator.next()).b(marker);
            if (view != null)
            {
                return view;
            }
        }

        return null;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1)
    {
        if (i1 == 3)
        {
            q = true;
            b(true);
        } else
        if (i1 == 2)
        {
            q = false;
            b(true);
            return;
        }
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        Rect rect = new Rect(i1, j1, k1, l1);
        if (rect.equals(A))
        {
            return;
        }
        if (!r() || t)
        {
            B = rect;
            return;
        }
        A = rect;
        mViewMap.a(i1, j1, k1, l1);
        if (C != null)
        {
            u();
            return;
        } else
        {
            m.a();
            return;
        }
    }

    public final void a(cjg cjg1)
    {
        if (r() && !t) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i.a(cjg1.b()) && s.c() != null)
        {
            s.c().a(true);
        }
        if (s.b() != null)
        {
            for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).a(cjg1)) { }
            mViewMapExtension.a(s.b().a(cjg1.b()));
            Iterator iterator1 = F.iterator();
            while (iterator1.hasNext()) 
            {
                ((cjq)iterator1.next()).a(cjg1);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(cjq cjq1)
    {
        F.add(cjq1);
    }

    public final volatile void a(czj czj)
    {
        a((fzp)czj);
    }

    public final void a(eem eem1)
    {
        E.add(eem1);
    }

    public final void a(eep eep1)
    {
        if (t)
        {
            C = eep1;
            return;
        } else
        {
            b(eep1);
            return;
        }
    }

    final void a(boolean flag)
    {
        if (!r() || s.c() == null)
        {
            return;
        } else
        {
            s.c().a(flag);
            s.c().b(flag);
            return;
        }
    }

    public final boolean a(Point point)
    {
        C = null;
        q = false;
        if (o.l() && j.g() == 4 && o.k())
        {
            q = true;
        }
        for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).b(point)) { }
        for (Iterator iterator1 = E.iterator(); iterator1.hasNext();)
        {
            if (((eem)iterator1.next()).a(point))
            {
                return true;
            }
        }

        return false;
    }

    public final void b(int i1)
    {
        mButtonMyLocation.animate().translationY(i1).setInterpolator(new DecelerateInterpolator()).setDuration(x).start();
    }

    public final void b(cjq cjq1)
    {
        F.remove(cjq1);
    }

    public final void b(eem eem1)
    {
        E.remove(eem1);
    }

    public final boolean b(Point point)
    {
        for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).a(point)) { }
        u = false;
        for (Iterator iterator1 = E.iterator(); iterator1.hasNext();)
        {
            if (((eem)iterator1.next()).b(point))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean b(Marker marker)
    {
        for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).a(marker)) { }
        return true;
    }

    public final cic f()
    {
        return czb.a;
    }

    public final void g()
    {
        if (!f.b(dbf.bH) && s() && s.a() != null)
        {
            float f1 = s.a().d() - 0.075F;
            if (f1 > 0.0F)
            {
                s.b(cjk.a(f1));
                return;
            }
        }
    }

    public final void h()
    {
        while (f.b(dbf.bH) || !s() || s.a() == null) 
        {
            return;
        }
        float f1 = s.a().d();
        s.b(cjk.a(f1 + 0.075F));
    }

    public final void i()
    {
        b(true);
    }

    public final List j()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = G.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            List list = ((eet)iterator.next()).a();
            if (list != null)
            {
                arraylist.addAll(list);
            }
        } while (true);
        return arraylist;
    }

    public final boolean j_()
    {
        m.a(false);
        if (r() && !u)
        {
            cjg cjg1 = s.a();
            if (cjg1 != null)
            {
                UberLatLng uberlatlng = cjg1.b();
                RiderLocation riderlocation = h.b();
                if (riderlocation != null && !uberlatlng.b(riderlocation.getUberLatLng()))
                {
                    u = true;
                    a(cjg1);
                }
            }
        }
        for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).y_()) { }
        for (Iterator iterator1 = E.iterator(); iterator1.hasNext();)
        {
            if (((eem)iterator1.next()).j_())
            {
                return true;
            }
        }

        return false;
    }

    public final List k()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = G.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            List list = ((eet)iterator.next()).b();
            if (list != null)
            {
                arraylist.addAll(list);
            }
        } while (true);
        return arraylist;
    }

    public final boolean k_()
    {
        for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).d()) { }
        u = false;
        for (Iterator iterator1 = E.iterator(); iterator1.hasNext();)
        {
            if (((eem)iterator1.next()).k_())
            {
                return true;
            }
        }

        return false;
    }

    public final void l()
    {
        if (r())
        {
            s.c().a(false);
        }
    }

    public final void m()
    {
        if (r())
        {
            s.c().a(true);
        }
    }

    public final void n()
    {
        for (Iterator iterator = G.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public final UberLatLng o()
    {
        cjg cjg1;
        if (r())
        {
            if ((cjg1 = s.a()) != null)
            {
                return cjg1.b();
            }
        }
        return null;
    }

    public void onClickMyLocationButton()
    {
        int i1 = m.e();
        if (i1 == fzn.c || i1 == fzn.f || i1 == fzn.d)
        {
            e.c(new fyp());
            d.a(n.aP);
            return;
        } else
        {
            m.a(true);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Resources resources = getResources();
        x = resources.getInteger(0x7f0b0010);
        y = resources.getDimensionPixelSize(0x7f0800a4);
        D = dtz.a(n, k.a());
        r = new cjk();
        m.a(bundle);
        z = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0301c2, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestinationChangedEvent(fyi fyi)
    {
        m.b();
        b(true);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        mViewMapExtension.b(this);
        mViewMapExtension.b(this);
        mViewMap.b();
        s = null;
        ButterKnife.reset(this);
    }

    public void onForcePinLocationEvent(gaq gaq1)
    {
        H.removeCallbacks(I);
        boolean flag = gaq1.a().isHotspotLocation();
        if (r() && s.c() != null && flag)
        {
            s.c().a(false);
            H.postDelayed(I, 2000L);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        mViewMap.c();
    }

    public void onPanelSlideEvent(PanelSlideEvent panelslideevent)
    {
        boolean flag;
        if (!panelslideevent.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != q)
        {
            q = flag;
            b(true);
        }
    }

    public void onPause()
    {
        super.onPause();
        mViewMap.d();
        if (r())
        {
            m.d();
            l.d();
            for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).f()) { }
        }
        v = false;
    }

    public void onPinLocationEvent(daq daq)
    {
        if (!r())
        {
            return;
        } else
        {
            w();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        mViewMap.e();
        q();
        v = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        cjn cjn1 = mViewMap.a();
        if (cjn1 != null && cjn1.a() != null)
        {
            cjn1.a().a("com.ubercab.CAMERA_POSITION", bundle);
            m.b(bundle);
            for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).a(bundle)) { }
        }
    }

    public void onTripUiStateChangedEvent(fzc fzc)
    {
        boolean flag = false;
        if (!r())
        {
            return;
        }
        int i1 = j.g();
        boolean flag2 = fte.b(w);
        boolean flag3 = fte.b(i1);
        boolean flag1 = c(i1);
        w = i1;
        if (o.l() && (i1 == 4 || i1 == 3) && o.k())
        {
            fzc = cjk.a(o.m(), y);
            if (i1 == 3)
            {
                b(fzc);
            } else
            {
                a(fzc);
            }
            if (i1 == 4)
            {
                q = true;
                if (s != null && s.b() != null && s.a() != null)
                {
                    fzc = s.b().a(s.a().b());
                    if (fzc != null)
                    {
                        i1 = ((Point) (fzc)).y;
                        int j1 = o.h();
                        a(cjk.a(s.b().a(new Point(((Point) (fzc)).x, ((Point) (fzc)).y + (i1 - j1)))));
                    }
                }
            }
        } else
        if (i1 == 2)
        {
            m.a(false);
        } else
        if (!flag2 && flag3)
        {
            m.a(true);
        } else
        {
            w();
        }
        if (!flag1)
        {
            flag = true;
        }
        a(flag);
        b(true);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mViewMap.a(z, D);
        t();
    }

    public final float p()
    {
        if (!r())
        {
            return 0.0F;
        } else
        {
            return s.a().d();
        }
    }

    final void q()
    {
        if (!r())
        {
            return;
        }
        m.c();
        for (Iterator iterator = G.iterator(); iterator.hasNext(); ((eet)iterator.next()).e()) { }
        l.c();
        E.add(l);
        F.add(l);
    }

    public final void r_()
    {
        if (s.c() != null)
        {
            s.c().a(false);
        }
    }

    public final void s_()
    {
        if (s.c() != null)
        {
            s.c().a(true);
        }
    }

    public final void t_()
    {
        s.a(cjk.a());
    }

}
