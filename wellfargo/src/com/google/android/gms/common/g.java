// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common:
//            h, eq, et, dw, 
//            jk, as, iy, dz, 
//            bk, jh, jb, dt, 
//            cs, ei, u, cp, 
//            ek, hf, bh, gl, 
//            go, gc, ap, bw, 
//            bq, bt, gi, hw, 
//            aj, am, dh, cf, 
//            if, x, r, hz, 
//            ho, hc, cc, fn, 
//            bn, bz, ag, js, 
//            be, i, cm, gu, 
//            gz, de, en, hi, 
//            fe, ef, db, jq, 
//            ay, fb, ik, jy, 
//            bb, dn, fi, in, 
//            ad, cj, gf, l, 
//            ht, ga, ic, cy, 
//            fr, iv, je, is, 
//            jv, dk, jn, ey, 
//            dq, cv, ew, fx, 
//            aa, gr, hl, o, 
//            fk, av, ec, fu, 
//            gw, hr, iq

class g
{

    static final h a[];
    static final h b[];
    private static Set c;
    private static Set d;

    static Set a()
    {
        if (c == null)
        {
            c = a(b);
        }
        return c;
    }

    private static Set a(h ah[])
    {
        HashSet hashset = new HashSet(ah.length);
        int k = ah.length;
        for (int j = 0; j < k; j++)
        {
            hashset.add(ah[j]);
        }

        return hashset;
    }

    static transient h[] a(h ah[][])
    {
        int i1 = ah.length;
        int j = 0;
        int k = 0;
        for (; j < i1; j++)
        {
            k += ah[j].length;
        }

        h ah1[] = new h[k];
        int k1 = ah.length;
        k = 0;
        j = 0;
        for (; k < k1; k++)
        {
            h ah2[] = ah[k];
            for (int j1 = 0; j1 < ah2.length;)
            {
                ah1[j] = ah2[j1];
                j1++;
                j++;
            }

        }

        return ah1;
    }

    static Set b()
    {
        if (d == null)
        {
            d = a(a);
        }
        return d;
    }

    static 
    {
        a = (new h[] {
            eq.a[0], et.a[0], dw.a[0], jk.a[0], as.a[0], iy.a[0], dz.a[0], bk.a[0], jh.a[0], jb.a[0], 
            dt.a[0], cs.a[0], ei.a[0], u.a[0], cp.a[0], ek.a[0], hf.a[0], bh.a[0], gl.a[0], go.a[0], 
            gc.a[0], ap.a[0], bw.a[0], bq.a[0], bt.a[0], gi.a[0], hw.a[0], aj.a[0], am.a[0], dh.a[0], 
            cf.a[0], if.a[0], if.a[1], x.a[0], r.a[0], hz.a[0], ho.a[0], hc.a[0], cc.a[0], fn.a[0], 
            fn.a[1], bn.a[0], bz.a[0], ag.a[0], js.a[0], be.a[0], i.a[0], cm.a[0], gu.a[0], gz.a[0], 
            de.a[0], en.a[0], hi.a[0], fe.a[0], ef.a[0], db.a[0], jq.a[0], ay.a[0], fb.a[0], ik.a[0], 
            jy.a[0], bb.a[0], dn.a[0], fi.a[0], in.a[0], ad.a[0], cj.a[0], gf.a[0], l.a[0], ht.a[0], 
            ga.a[0], ic.a[0], cy.a[0], fr.a[0], iv.a[0], je.a[0], is.a[0], jv.a[0], dk.a[0], jn.a[0], 
            ey.a[0], dq.a[0], cv.a[0], ew.a[0], fx.a[0], aa.a[0], gr.a[0], hl.a[0], o.a[0], fk.a[0], 
            av.a[0], ec.a[0], fu.a[0], gw.a[0], hr.a[0]
        });
        b = a(new h[][] {
            eq.a, et.a, iq.a, dw.a, jk.a, as.a, iy.a, dz.a, bk.a, jh.a, 
            jb.a, dt.a, cs.a, ei.a, u.a, cp.a, ek.a, hf.a, bh.a, gl.a, 
            go.a, gc.a, ap.a, bw.a, bq.a, bt.a, gi.a, hw.a, aj.a, am.a, 
            dh.a, cf.a, if.a, x.a, r.a, hz.a, ho.a, hc.a, cc.a, fn.a, 
            bn.a, bz.a, ag.a, js.a, be.a, i.a, cm.a, gu.a, gz.a, de.a, 
            en.a, hi.a, fe.a, ef.a, db.a, jq.a, ay.a, fb.a, ik.a, jy.a, 
            bb.a, dn.a, fi.a, in.a, ad.a, cj.a, gf.a, l.a, ht.a, ga.a, 
            ic.a, cy.a, fr.a, iv.a, je.a, is.a, jv.a, dk.a, jn.a, ey.a, 
            dq.a, cv.a, ew.a, fx.a, aa.a, gr.a, hl.a, o.a, fk.a, av.a, 
            ec.a, fu.a, gw.a, hr.a
        });
    }
}
