// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import com.mobileapptracker.MobileAppTracker;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.rider.realtime.object.PersistedObjectDataStore;
import java.util.concurrent.ExecutorService;

public final class cyx
    implements hsr
{

    static final boolean a;
    private final hzb A;
    private final hzb B;
    private final hzb C;
    private final hzb D;
    private final hzb E;
    private final hzb F;
    private final hzb G;
    private final hzb H;
    private final hzb I;
    private final hzb J;
    private final hzb K;
    private final hzb L;
    private final hzb M;
    private final hzb N;
    private final hzb O;
    private final hzb P;
    private final hzb Q;
    private final hzb R;
    private final hzb S;
    private final hzb T;
    private final hzb U;
    private final hzb V;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;
    private final hzb h;
    private final hzb i;
    private final hzb j;
    private final hzb k;
    private final hzb l;
    private final hzb m;
    private final hzb n;
    private final hzb o;
    private final hzb p;
    private final hzb q;
    private final hzb r;
    private final hzb s;
    private final hzb t;
    private final hzb u;
    private final hzb v;
    private final hzb w;
    private final hzb x;
    private final hzb y;
    private final hzb z;

    private cyx(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7, hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11, hzb hzb12, hzb hzb13, 
            hzb hzb14, hzb hzb15, hzb hzb16, hzb hzb17, hzb hzb18, hzb hzb19, hzb hzb20, 
            hzb hzb21, hzb hzb22, hzb hzb23, hzb hzb24, hzb hzb25, hzb hzb26, hzb hzb27, 
            hzb hzb28, hzb hzb29, hzb hzb30, hzb hzb31, hzb hzb32, hzb hzb33, hzb hzb34, 
            hzb hzb35, hzb hzb36, hzb hzb37, hzb hzb38, hzb hzb39, hzb hzb40, hzb hzb41, 
            hzb hzb42, hzb hzb43, hzb hzb44, hzb hzb45, hzb hzb46)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        }
        g = hzb5;
        if (!a && hzb6 == null)
        {
            throw new AssertionError();
        }
        h = hzb6;
        if (!a && hzb7 == null)
        {
            throw new AssertionError();
        }
        i = hzb7;
        if (!a && hzb8 == null)
        {
            throw new AssertionError();
        }
        j = hzb8;
        if (!a && hzb9 == null)
        {
            throw new AssertionError();
        }
        k = hzb9;
        if (!a && hzb10 == null)
        {
            throw new AssertionError();
        }
        l = hzb10;
        if (!a && hzb11 == null)
        {
            throw new AssertionError();
        }
        m = hzb11;
        if (!a && hzb12 == null)
        {
            throw new AssertionError();
        }
        n = hzb12;
        if (!a && hzb13 == null)
        {
            throw new AssertionError();
        }
        o = hzb13;
        if (!a && hzb14 == null)
        {
            throw new AssertionError();
        }
        p = hzb14;
        if (!a && hzb15 == null)
        {
            throw new AssertionError();
        }
        q = hzb15;
        if (!a && hzb16 == null)
        {
            throw new AssertionError();
        }
        r = hzb16;
        if (!a && hzb17 == null)
        {
            throw new AssertionError();
        }
        s = hzb17;
        if (!a && hzb18 == null)
        {
            throw new AssertionError();
        }
        t = hzb18;
        if (!a && hzb19 == null)
        {
            throw new AssertionError();
        }
        u = hzb19;
        if (!a && hzb20 == null)
        {
            throw new AssertionError();
        }
        v = hzb20;
        if (!a && hzb21 == null)
        {
            throw new AssertionError();
        }
        w = hzb21;
        if (!a && hzb22 == null)
        {
            throw new AssertionError();
        }
        x = hzb22;
        if (!a && hzb23 == null)
        {
            throw new AssertionError();
        }
        y = hzb23;
        if (!a && hzb24 == null)
        {
            throw new AssertionError();
        }
        z = hzb24;
        if (!a && hzb25 == null)
        {
            throw new AssertionError();
        }
        A = hzb25;
        if (!a && hzb26 == null)
        {
            throw new AssertionError();
        }
        B = hzb26;
        if (!a && hzb27 == null)
        {
            throw new AssertionError();
        }
        C = hzb27;
        if (!a && hzb28 == null)
        {
            throw new AssertionError();
        }
        D = hzb28;
        if (!a && hzb29 == null)
        {
            throw new AssertionError();
        }
        E = hzb29;
        if (!a && hzb30 == null)
        {
            throw new AssertionError();
        }
        F = hzb30;
        if (!a && hzb31 == null)
        {
            throw new AssertionError();
        }
        G = hzb31;
        if (!a && hzb32 == null)
        {
            throw new AssertionError();
        }
        H = hzb32;
        if (!a && hzb33 == null)
        {
            throw new AssertionError();
        }
        I = hzb33;
        if (!a && hzb34 == null)
        {
            throw new AssertionError();
        }
        J = hzb34;
        if (!a && hzb35 == null)
        {
            throw new AssertionError();
        }
        K = hzb35;
        if (!a && hzb36 == null)
        {
            throw new AssertionError();
        }
        L = hzb36;
        if (!a && hzb37 == null)
        {
            throw new AssertionError();
        }
        M = hzb37;
        if (!a && hzb38 == null)
        {
            throw new AssertionError();
        }
        N = hzb38;
        if (!a && hzb39 == null)
        {
            throw new AssertionError();
        }
        O = hzb39;
        if (!a && hzb40 == null)
        {
            throw new AssertionError();
        }
        P = hzb40;
        if (!a && hzb41 == null)
        {
            throw new AssertionError();
        }
        Q = hzb41;
        if (!a && hzb42 == null)
        {
            throw new AssertionError();
        }
        R = hzb42;
        if (!a && hzb43 == null)
        {
            throw new AssertionError();
        }
        S = hzb43;
        if (!a && hzb44 == null)
        {
            throw new AssertionError();
        }
        T = hzb44;
        if (!a && hzb45 == null)
        {
            throw new AssertionError();
        }
        U = hzb45;
        if (!a && hzb46 == null)
        {
            throw new AssertionError();
        } else
        {
            V = hzb46;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8, hzb hzb9, hzb hzb10, hzb hzb11, hzb hzb12, hzb hzb13, hzb hzb14, 
            hzb hzb15, hzb hzb16, hzb hzb17, hzb hzb18, hzb hzb19, hzb hzb20, hzb hzb21, 
            hzb hzb22, hzb hzb23, hzb hzb24, hzb hzb25, hzb hzb26, hzb hzb27, hzb hzb28, 
            hzb hzb29, hzb hzb30, hzb hzb31, hzb hzb32, hzb hzb33, hzb hzb34, hzb hzb35, 
            hzb hzb36, hzb hzb37, hzb hzb38, hzb hzb39, hzb hzb40, hzb hzb41, hzb hzb42, 
            hzb hzb43, hzb hzb44, hzb hzb45, hzb hzb46)
    {
        return new cyx(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8, hzb9, hzb10, hzb11, hzb12, hzb13, hzb14, hzb15, hzb16, hzb17, hzb18, hzb19, hzb20, hzb21, hzb22, hzb23, hzb24, hzb25, hzb26, hzb27, hzb28, hzb29, hzb30, hzb31, hzb32, hzb33, hzb34, hzb35, hzb36, hzb37, hzb38, hzb39, hzb40, hzb41, hzb42, hzb43, hzb44, hzb45, hzb46);
    }

    private void a(RiderApplication riderapplication)
    {
        if (riderapplication == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(riderapplication);
            riderapplication.a = (chp)c.a();
            riderapplication.b = (dcv)d.a();
            riderapplication.c = (cev)e.a();
            riderapplication.d = (dai)f.a();
            riderapplication.e = (gqd)g.a();
            riderapplication.f = (czg)h.a();
            riderapplication.g = (ExecutorService)i.a();
            riderapplication.h = (gmg)j.a();
            riderapplication.i = hss.a(k);
            riderapplication.j = (chx)l.a();
            riderapplication.k = (dch)m.a();
            riderapplication.l = (dqv)n.a();
            riderapplication.m = (MobileAppTracker)o.a();
            riderapplication.n = (efa)p.a();
            riderapplication.o = (cig)q.a();
            riderapplication.p = (grb)r.a();
            riderapplication.q = (dwx)s.a();
            riderapplication.r = (PersistedObjectDataStore)t.a();
            riderapplication.s = (daj)u.a();
            riderapplication.t = (dol)v.a();
            riderapplication.u = (doq)w.a();
            riderapplication.v = (dod)x.a();
            riderapplication.w = (djt)y.a();
            riderapplication.x = (dqx)z.a();
            riderapplication.y = (dda)A.a();
            riderapplication.z = hss.a(B);
            riderapplication.A = (cyy)C.a();
            riderapplication.B = (czf)D.a();
            riderapplication.C = (eyy)E.a();
            riderapplication.D = (dor)F.a();
            riderapplication.E = (fei)G.a();
            riderapplication.F = (dal)H.a();
            riderapplication.G = (cyl)I.a();
            riderapplication.H = (gpt)J.a();
            riderapplication.I = (dao)K.a();
            riderapplication.J = (djv)L.a();
            riderapplication.K = (ijj)M.a();
            riderapplication.L = (gmc)N.a();
            riderapplication.M = (das)O.a();
            riderapplication.N = (glf)P.a();
            riderapplication.O = (dat)Q.a();
            riderapplication.P = (UspoutClient)R.a();
            riderapplication.Q = (dak)S.a();
            riderapplication.R = (gju)T.a();
            riderapplication.S = (ContentResolver)U.a();
            riderapplication.T = (foz)V.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((RiderApplication)obj);
    }

    static 
    {
        boolean flag;
        if (!cyx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
