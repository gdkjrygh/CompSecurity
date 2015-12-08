// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.g;
import com.google.android.gms.maps.model.a.j;
import com.google.android.gms.maps.model.a.m;
import com.google.android.gms.maps.model.a.p;
import com.google.android.gms.maps.model.a.s;

// Referenced classes of package com.google.android.gms.maps.a:
//            w, ac, af, ai, 
//            ao, ar, au, ax, 
//            ba, bd, bg, bj, 
//            g, s, p

public interface d
    extends IInterface
{

    public abstract CameraPosition a();

    public abstract a a(PolylineOptions polylineoptions);

    public abstract g a(CircleOptions circleoptions);

    public abstract j a(GroundOverlayOptions groundoverlayoptions);

    public abstract m a(MarkerOptions markeroptions);

    public abstract p a(PolygonOptions polygonoptions);

    public abstract s a(TileOverlayOptions tileoverlayoptions);

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1, int l1);

    public abstract void a(k k1);

    public abstract void a(k k1, int i1, w w);

    public abstract void a(k k1, w w);

    public abstract void a(ac ac);

    public abstract void a(af af);

    public abstract void a(ai ai);

    public abstract void a(ao ao);

    public abstract void a(ar ar);

    public abstract void a(au au);

    public abstract void a(ax ax);

    public abstract void a(ba ba);

    public abstract void a(bd bd);

    public abstract void a(bg bg);

    public abstract void a(bj bj, k k1);

    public abstract void a(com.google.android.gms.maps.a.g g1);

    public abstract void a(boolean flag);

    public abstract float b();

    public abstract void b(k k1);

    public abstract boolean b(boolean flag);

    public abstract float c();

    public abstract void c(boolean flag);

    public abstract void d();

    public abstract void d(boolean flag);

    public abstract void e();

    public abstract int f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract Location j();

    public abstract com.google.android.gms.maps.a.s k();

    public abstract com.google.android.gms.maps.a.p l();

    public abstract k m();

    public abstract boolean n();
}
