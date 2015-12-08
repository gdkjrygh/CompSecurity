// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.internal:
//            de, ch, du, cg, 
//            ce, ac, do, hh, 
//            dp, cf, dn, cb, 
//            ap, dc, cc, aj, 
//            ag, cd, db, dj, 
//            at, bz, cm

public final class ca extends de
    implements ch, du
{

    private final at a;
    private final bz b;
    private final db c;
    private final Object d;
    private final Context e;
    private final Object f;
    private final cm g;
    private final hh h;
    private de i;
    private cg j;
    private boolean k;
    private ag l;
    private aj m;
    private ap n;

    private ac a(ce ce1)
    {
        if (j.hE == null)
        {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = j.hE.split("x");
        if (aobj.length != 2)
        {
            throw new a((new StringBuilder("Could not parse the ad size from the ad response: ")).append(j.hE).toString(), 0);
        }
        int l1;
        int i2;
        int j2;
        try
        {
            l1 = Integer.parseInt(aobj[0]);
            i2 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (ce ce1)
        {
            throw new a((new StringBuilder("Could not parse the ad size from the ad response: ")).append(j.hE).toString(), 0);
        }
        aobj = ce1.eq.eL;
        j2 = aobj.length;
        ac ac1;
        int j1;
        int k1;
        for (int i1 = 0; i1 < j2; i1++)
        {
            ac1 = aobj[i1];
            float f1 = e.getResources().getDisplayMetrics().density;
            if (ac1.width == -1)
            {
                j1 = (int)((float)ac1.widthPixels / f1);
            } else
            {
                j1 = ac1.width;
            }
            if (ac1.height == -2)
            {
                k1 = (int)((float)ac1.heightPixels / f1);
            } else
            {
                k1 = ac1.height;
            }
            if (l1 == j1 && i2 == k1)
            {
                return new ac(ac1, ce1.eq.eL);
            }
        }

        throw new a((new StringBuilder("The ad size from the ad response was not one of the requested sizes: ")).append(j.hE).toString(), 0);
    }

    static Object a(ca ca1)
    {
        return ca1.f;
    }

    private void a(long l1)
    {
        do
        {
            if (!b(l1))
            {
                throw new a("Timed out waiting for WebView to finish loading.", 2);
            }
        } while (!k);
    }

    static bz b(ca ca1)
    {
        return ca1.b;
    }

    private boolean b(long l1)
    {
        l1 = 60000L - (SystemClock.elapsedRealtime() - l1);
        if (l1 <= 0L)
        {
            return false;
        }
        try
        {
            f.wait(l1);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new a("Ad request cancelled.", -1);
        }
        return true;
    }

    static cg c(ca ca1)
    {
        return ca1.j;
    }

    static db d(ca ca1)
    {
        return ca1.c;
    }

    public final void a()
    {
        Object obj5 = f;
        obj5;
        JVM INSTR monitorenter ;
        Object obj3;
        com.google.android.gms.internal.do.a("AdLoaderBackgroundTask started.");
        String s = h.a().a(e);
        obj3 = new ce(g, s);
        Object obj;
        Object obj1;
        Object obj2;
        int i1;
        obj = null;
        obj2 = null;
        i1 = -2;
        obj1 = obj2;
        long l1 = SystemClock.elapsedRealtime();
        obj1 = obj2;
        de de1 = cf.a(e, ((ce) (obj3)), this);
        obj1 = obj2;
        Object obj4 = d;
        obj1 = obj2;
        obj4;
        JVM INSTR monitorenter ;
        i = de1;
        if (i == null)
        {
            throw new a("Could not start the ad request service.", 0);
        }
          goto _L1
        obj;
        obj1 = obj2;
        obj4;
        JVM INSTR monitorexit ;
        obj1 = obj2;
        aa aa;
        db db1;
        java.util.List list;
        java.util.List list1;
        java.util.List list2;
        String s1;
        aj aj1;
        int j1;
        boolean flag;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            obj5;
        }
        i1 = ((a) (obj)).getErrorCode();
        if (i1 != 3 && i1 != -1) goto _L3; else goto _L2
_L2:
        com.google.android.gms.internal.do.b(((a) (obj)).getMessage());
_L19:
        j = new cg(i1);
        dn.a.post(new cb(this));
        obj = obj1;
_L17:
        aa = ((ce) (obj3)).hu;
        db1 = c;
        list = j.fO;
        list1 = j.fP;
        list2 = j.hD;
        j1 = j.orientation;
        l1 = j.fS;
        s1 = ((ce) (obj3)).hx;
        flag = j.hB;
        if (n == null) goto _L5; else goto _L4
_L4:
        obj1 = n.b;
_L20:
        if (n == null) goto _L7; else goto _L6
_L6:
        obj2 = n.c;
_L21:
        if (n == null) goto _L9; else goto _L8
_L8:
        obj3 = n.d;
_L22:
        aj1 = m;
        if (n == null) goto _L11; else goto _L10
_L10:
        obj4 = n.e;
_L23:
        obj = new dc(aa, db1, list, i1, list1, list2, j1, l1, s1, flag, ((ai) (obj1)), ((av) (obj2)), ((String) (obj3)), aj1, ((al) (obj4)), j.hC, ((ac) (obj)), j.hA);
        dn.a.post(new cc(this, ((dc) (obj))));
        obj5;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj4;
        JVM INSTR monitorexit ;
_L13:
        obj1 = obj2;
        if (b(l1))
        {
            break MISSING_BLOCK_LABEL_424;
        }
        obj1 = obj2;
        throw new a("Timed out waiting for ad response.", 2);
        throw obj;
        obj1 = obj2;
        if (j == null) goto _L13; else goto _L12
_L12:
        obj1 = obj2;
        obj4 = d;
        obj1 = obj2;
        obj4;
        JVM INSTR monitorenter ;
        i = null;
        obj4;
        JVM INSTR monitorexit ;
        obj1 = obj2;
        if (j.errorCode == -2)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        obj1 = obj2;
        if (j.errorCode == -3)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        obj1 = obj2;
        throw new a((new StringBuilder("There was a problem getting an ad response. ErrorCode: ")).append(j.errorCode).toString(), j.errorCode);
        obj;
        obj1 = obj2;
        obj4;
        JVM INSTR monitorexit ;
        obj1 = obj2;
        throw obj;
        obj1 = obj2;
        if (j.errorCode == -3)
        {
            break MISSING_BLOCK_LABEL_611;
        }
        obj1 = obj2;
        if (!TextUtils.isEmpty(j.hz))
        {
            break MISSING_BLOCK_LABEL_575;
        }
        obj1 = obj2;
        throw new a("No fill from ad server.", 3);
        obj1 = obj2;
        boolean flag1 = j.hB;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_611;
        }
        obj1 = obj2;
        m = new aj(j.hz);
        obj1 = obj2;
        if (((ce) (obj3)).eq.eL == null)
        {
            break MISSING_BLOCK_LABEL_633;
        }
        obj1 = obj2;
        obj = a(((ce) (obj3)));
        obj1 = obj;
        if (!j.hB) goto _L15; else goto _L14
_L14:
        obj1 = obj;
        obj2 = d;
        obj1 = obj;
        obj2;
        JVM INSTR monitorenter ;
        l = new ag(e, ((ce) (obj3)), a, m);
        obj2;
        JVM INSTR monitorexit ;
        obj1 = obj;
        n = l.a(l1, 60000L);
        obj1 = obj;
        n.a;
        JVM INSTR tableswitch 0 1: default 886
    //                   0 851
    //                   1 812;
           goto _L16 _L17 _L18
_L16:
        obj1 = obj;
        throw new a((new StringBuilder("Unexpected mediation result: ")).append(n.a).toString(), 0);
        obj;
        obj1 = obj2;
        throw new a((new StringBuilder("Could not parse mediation config: ")).append(j.hz).toString(), 0);
        obj4;
        obj1 = obj;
        obj2;
        JVM INSTR monitorexit ;
        obj1 = obj;
        throw obj4;
_L18:
        obj1 = obj;
        throw new a("No fill from any mediation ad networks.", 3);
_L15:
        obj1 = obj;
        dn.a.post(new cd(this));
        obj1 = obj;
        a(l1);
          goto _L17
_L3:
        com.google.android.gms.internal.do.d(((a) (obj)).getMessage());
          goto _L19
_L5:
        obj1 = null;
          goto _L20
_L7:
        obj2 = null;
          goto _L21
_L9:
        obj3 = null;
          goto _L22
_L11:
        obj4 = null;
          goto _L23
    }

    public final void a(cg cg1)
    {
        synchronized (f)
        {
            com.google.android.gms.internal.do.a("Received ad response.");
            j = cg1;
            f.notify();
        }
    }

    public final void a(db db1)
    {
        synchronized (f)
        {
            com.google.android.gms.internal.do.a("WebView finished loading.");
            k = true;
            f.notify();
        }
    }

    public final void v_()
    {
        synchronized (d)
        {
            if (i != null)
            {
                i.f();
            }
            c.stopLoading();
            dj.a(c);
            if (l != null)
            {
                l.a();
            }
        }
    }

    private class a extends Exception
    {

        private final int hp;

        public final int getErrorCode()
        {
            return hp;
        }

        public a(String s, int i1)
        {
            super(s);
            hp = i1;
        }
    }

}
