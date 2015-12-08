// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
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
import com.google.android.gms.maps.model.a.v;

// Referenced classes of package com.google.android.gms.maps.a:
//            ag, am, ap, as, 
//            av, bb, be, bh, 
//            bk, bn, bq, bt, 
//            bw, bz, cr, g, 
//            ab, p

public interface d
    extends IInterface
{

    public abstract CameraPosition a();

    public abstract a a(PolylineOptions polylineoptions);

    public abstract g a(CircleOptions circleoptions);

    public abstract j a(GroundOverlayOptions groundoverlayoptions);

    public abstract p a(MarkerOptions markeroptions);

    public abstract s a(PolygonOptions polygonoptions);

    public abstract v a(TileOverlayOptions tileoverlayoptions);

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1, int l1);

    public abstract void a(Bundle bundle);

    public abstract void a(com.google.android.gms.a.j j1);

    public abstract void a(com.google.android.gms.a.j j1, int i1, ag ag);

    public abstract void a(com.google.android.gms.a.j j1, ag ag);

    public abstract void a(am am);

    public abstract void a(ap ap);

    public abstract void a(as as);

    public abstract void a(av av);

    public abstract void a(bb bb);

    public abstract void a(be be);

    public abstract void a(bh bh);

    public abstract void a(bk bk);

    public abstract void a(bn bn);

    public abstract void a(bq bq);

    public abstract void a(bt bt);

    public abstract void a(bw bw);

    public abstract void a(bz bz);

    public abstract void a(cr cr, com.google.android.gms.a.j j1);

    public abstract void a(com.google.android.gms.maps.a.g g1);

    public abstract void a(String s1);

    public abstract void a(boolean flag);

    public abstract float b();

    public abstract void b(Bundle bundle);

    public abstract void b(com.google.android.gms.a.j j1);

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

    public abstract ab k();

    public abstract com.google.android.gms.maps.a.p l();

    public abstract boolean m();

    public abstract m n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean s();
}
