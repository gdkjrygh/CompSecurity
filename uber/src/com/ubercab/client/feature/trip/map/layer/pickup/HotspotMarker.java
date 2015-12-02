// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pickup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import cje;
import cjg;
import cjl;
import cjm;
import cjn;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.rider.realtime.model.GeoJsonFeature;
import ecx;
import gbg;
import gbh;
import gjz;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HotspotMarker
{

    cjl a;
    private final GeoJsonFeature b;
    private final cje c;
    private int d;
    private cjg e;
    private int f;
    private Animator g;
    private Animator h;
    private Animator i;
    private Animator j;
    private final Set k = new HashSet();
    private boolean l;
    private boolean m;

    public HotspotMarker(cjn cjn1, GeoJsonFeature geojsonfeature, int i1, cje cje)
    {
        c = cje;
        b = (GeoJsonFeature)gjz.a(geojsonfeature);
        e = cjn1.a();
        setState$72569c07(i1);
        a = cjn1.a((new cjm()).a().a(ecx.a(b)).a(c).c().a(false));
    }

    public static int a(int i1)
    {
        return i1 != gbg.a ? 12 : 16;
    }

    static void a(HotspotMarker hotspotmarker)
    {
        hotspotmarker.setTransparency(0.25F);
    }

    static Set b(HotspotMarker hotspotmarker)
    {
        return hotspotmarker.k;
    }

    static int c(HotspotMarker hotspotmarker)
    {
        return hotspotmarker.d;
    }

    private boolean c()
    {
        return e != null && a != null;
    }

    private void d()
    {
        setOverlayDimensions(a(f) * 2);
        if (!m && a != null)
        {
            a.a(c);
        }
    }

    static void d(HotspotMarker hotspotmarker)
    {
        hotspotmarker.d();
    }

    private boolean e()
    {
        return g != null && g.isRunning();
    }

    static boolean e(HotspotMarker hotspotmarker)
    {
        return hotspotmarker.l;
    }

    private void setTransparency(float f1)
    {
        if (a.b() == f1)
        {
            return;
        } else
        {
            a.a(f1);
            return;
        }
    }

    public final void a(double d1)
    {
        if (c() && a.c() && !e())
        {
            long l1 = getProximityAwarenessDistance();
            if (d1 > (double)l1)
            {
                setTransparency(0.25F);
                setOverlayDimensions(d);
                return;
            }
            if (d1 <= (double)getSnapDistance())
            {
                setTransparency(0.0F);
                return;
            }
            int i1 = d;
            i1 = (int)((double)l1 - d1) * 2 + i1;
            if ((double)i1 != a.a())
            {
                setTransparency(0.25F);
                setOverlayDimensions(i1);
                return;
            }
        }
    }

    public final void a(gbh gbh)
    {
        k.add(gbh);
    }

    public final boolean a()
    {
        return a.c();
    }

    public final boolean a(UberLatLng uberlatlng)
    {
        while (!c() || UberLatLng.a(uberlatlng, ecx.a(b)) > (double)getSnapDistance()) 
        {
            return false;
        }
        return true;
    }

    public final void b()
    {
        m = true;
        a.d();
    }

    public final void b(gbh gbh)
    {
        k.remove(gbh);
    }

    public GeoJsonFeature getPickupLocation()
    {
        return b;
    }

    public UberLatLng getPosition()
    {
        return ecx.a(b);
    }

    int getProximityAwarenessDistance()
    {
        return (int)((float)a(f) * 1.5F);
    }

    public Animator getPulseAnimator()
    {
        if (g == null)
        {
            int i1 = a(f);
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                i1 * 2, i1
            });
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final HotspotMarker a;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    valueanimator1 = (Integer)valueanimator1.getAnimatedValue();
                    a.setOverlayDimensions(valueanimator1.intValue());
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            valueanimator.addListener(new AnimatorListenerAdapter() {

                final HotspotMarker a;

                public final void onAnimationCancel(Animator animator)
                {
                    HotspotMarker.d(a);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    if (!HotspotMarker.e(a))
                    {
                        HotspotMarker.d(a);
                    }
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            valueanimator.setRepeatCount(-1);
            valueanimator.setRepeatMode(2);
            valueanimator.setDuration(800L);
            g = valueanimator;
        }
        return g;
    }

    public Animator getRemoveAnimator()
    {
        if (h == null)
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                d, 1
            });
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final HotspotMarker a;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    valueanimator1 = (Integer)valueanimator1.getAnimatedValue();
                    a.setOverlayDimensions(valueanimator1.intValue());
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            valueanimator.setInterpolator(new FastOutSlowInInterpolator());
            valueanimator.addListener(new AnimatorListenerAdapter() {

                final HotspotMarker a;

                public final void onAnimationCancel(Animator animator1)
                {
                    a.b();
                }

                public final void onAnimationEnd(Animator animator1)
                {
                    a.b();
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            h = valueanimator;
        }
        Animator animator = h;
        long l1;
        if (e())
        {
            l1 = 0L;
        } else
        {
            l1 = 300L;
        }
        animator.setDuration(l1);
        return h;
    }

    public Animator getShowAnimator()
    {
        if (i == null)
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                1, d
            });
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final HotspotMarker a;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    valueanimator1 = (Integer)valueanimator1.getAnimatedValue();
                    a.setOverlayDimensions(valueanimator1.intValue());
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            valueanimator.setInterpolator(new FastOutSlowInInterpolator());
            valueanimator.setDuration(300L);
            valueanimator.addListener(new AnimatorListenerAdapter() {

                final HotspotMarker a;

                public final void onAnimationCancel(Animator animator)
                {
                    a.a.e();
                    a.setOverlayDimensions(HotspotMarker.c(a));
                }

                public final void onAnimationEnd(Animator animator)
                {
                    for (animator = HotspotMarker.b(a).iterator(); animator.hasNext(); ((gbh)animator.next()).a()) { }
                }

                public final void onAnimationStart(Animator animator)
                {
                    a.a.e();
                    HotspotMarker.a(a);
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            i = valueanimator;
        }
        return i;
    }

    int getSnapDistance()
    {
        return (int)((float)a(f) * 1.25F);
    }

    public int getState$646e883f()
    {
        return f;
    }

    public Animator getTransitionToPrimaryAnimator()
    {
        if (j == null)
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                a(f) * 2, a(gbg.a) * 2
            });
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final HotspotMarker a;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    valueanimator1 = (Integer)valueanimator1.getAnimatedValue();
                    a.setOverlayDimensions(valueanimator1.intValue());
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            valueanimator.setInterpolator(new FastOutSlowInInterpolator());
            valueanimator.setDuration(300L);
            valueanimator.addListener(new AnimatorListenerAdapter() {

                final HotspotMarker a;

                public final void onAnimationEnd(Animator animator)
                {
                    a.setState$72569c07(gbg.a);
                }

            
            {
                a = HotspotMarker.this;
                super();
            }
            });
            j = valueanimator;
        }
        return j;
    }

    public void setOverlayDimensions(int i1)
    {
        while (!a.c() || a.a() == (double)i1) 
        {
            return;
        }
        a.a(i1, i1);
    }

    public void setSelected(boolean flag)
    {
        if (l != flag)
        {
            l = flag;
            if (!l && e())
            {
                g.cancel();
                return;
            }
        }
    }

    void setState$72569c07(int i1)
    {
        f = i1;
        d = a(f) * 2;
    }
}
