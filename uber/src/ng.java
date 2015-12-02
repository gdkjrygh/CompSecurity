// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import org.json.JSONException;
import org.json.JSONObject;

public final class ng extends aiw
    implements nj
{

    aiw a;
    Object b;
    AdResponseParcel c;
    aeb d;
    private final nf e;
    private final nd f;
    private final Object g = new Object();
    private final Context h;
    private final amb i;

    public ng(Context context, nd nd, amb amb1, nf nf)
    {
        b = new Object();
        e = nf;
        h = context;
        f = nd;
        i = amb1;
    }

    private aiw a(AdRequestInfoParcel adrequestinfoparcel)
    {
        return ni.a(h, adrequestinfoparcel, this);
    }

    static nf a(ng ng1)
    {
        return ng1.e;
    }

    private void a(long l)
    {
        do
        {
            if (!b(l))
            {
                throw new nh("Timed out waiting for ad response.", 2);
            }
        } while (c == null);
        synchronized (g)
        {
            a = null;
        }
        if (c.e != -2 && c.e != -3)
        {
            throw new nh((new StringBuilder("There was a problem getting an ad response. ErrorCode: ")).append(c.e).toString(), c.e);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(boolean flag)
    {
        ot.h().a(flag);
        aav aav1 = ot.h().a(h);
        if (aav1 != null && !aav1.isAlive())
        {
            of.a("start fetching content...");
            aav1.a();
        }
    }

    private AdSizeParcel b(AdRequestInfoParcel adrequestinfoparcel)
    {
        if (c.m == null)
        {
            throw new nh("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = c.m.split("x");
        if (aobj.length != 2)
        {
            throw new nh((new StringBuilder("Invalid ad size format from the ad response: ")).append(c.m).toString(), 0);
        }
        int i1;
        int j1;
        int k1;
        try
        {
            i1 = Integer.parseInt(aobj[0]);
            j1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            throw new nh((new StringBuilder("Invalid ad size number from the ad response: ")).append(c.m).toString(), 0);
        }
        aobj = adrequestinfoparcel.d.h;
        k1 = aobj.length;
        AdSizeParcel adsizeparcel;
        int k;
        int l;
        for (int j = 0; j < k1; j++)
        {
            adsizeparcel = aobj[j];
            float f1 = h.getResources().getDisplayMetrics().density;
            if (adsizeparcel.f == -1)
            {
                k = (int)((float)adsizeparcel.g / f1);
            } else
            {
                k = adsizeparcel.f;
            }
            if (adsizeparcel.c == -2)
            {
                l = (int)((float)adsizeparcel.d / f1);
            } else
            {
                l = adsizeparcel.c;
            }
            if (i1 == k && j1 == l)
            {
                return new AdSizeParcel(adsizeparcel, adrequestinfoparcel.d.h);
            }
        }

        throw new nh((new StringBuilder("The ad size from the ad response was not one of the requested sizes: ")).append(c.m).toString(), 0);
    }

    private boolean b(long l)
    {
        l = 60000L - (ot.i().b() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            b.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new nh("Ad request cancelled.", -1);
        }
        return true;
    }

    private void c()
    {
        if (c.e != -3)
        {
            if (TextUtils.isEmpty(c.c))
            {
                throw new nh("No fill from ad server.", 3);
            }
            ot.h().a(h, c.u);
            if (c.h)
            {
                try
                {
                    d = new aeb(c.c);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new nh((new StringBuilder("Could not parse mediation config: ")).append(c.c).toString(), 0);
                }
            }
        }
    }

    public final void a()
    {
        Object obj2 = b;
        obj2;
        JVM INSTR monitorenter ;
        AdRequestInfoParcel adrequestinfoparcel;
        of.a("AdLoaderBackgroundTask started.");
        String s = i.a().a(h);
        String s1 = oq.a(h).d();
        adrequestinfoparcel = new AdRequestInfoParcel(f, s, s1);
        int j;
        long l;
        long l1;
        j = -2;
        l1 = -1L;
        l = l1;
        long l2 = ot.i().b();
        l = l1;
        Object obj1 = a(adrequestinfoparcel);
        l = l1;
        Object obj = g;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        a = ((aiw) (obj1));
        if (a == null)
        {
            throw new nh("Could not start the ad request service.", 0);
        }
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        throw exception;
        exception;
        obj = null;
_L12:
        j = exception.a();
        if (j != 3 && j != -1) goto _L3; else goto _L2
_L2:
        of.c(exception.getMessage());
_L9:
        if (c != null) goto _L5; else goto _L4
_L4:
        c = new AdResponseParcel(j);
_L10:
        ajc.a.post(new _cls1());
_L8:
        boolean flag = TextUtils.isEmpty(c.r);
        if (flag) goto _L7; else goto _L6
_L6:
        exception = new JSONObject(c.r);
_L11:
        obj = new aio(adrequestinfoparcel, c, d, ((AdSizeParcel) (obj)), j, l, c.n, exception);
        ajc.a.post(new _cls2(((aio) (obj))));
        obj2;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        a(l2);
        l = l1;
        l1 = ot.i().b();
        l = l1;
        c();
        l = l1;
        if (adrequestinfoparcel.d.h == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        l = l1;
        obj = b(adrequestinfoparcel);
_L13:
        a(c.v);
        l = l1;
          goto _L8
_L3:
        of.e(exception.getMessage());
          goto _L9
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        c = new AdResponseParcel(j, c.k);
          goto _L10
        exception;
        of.b("Error parsing the JSON for Active View.", exception);
_L7:
        exception = null;
          goto _L11
        exception;
        l = l1;
          goto _L12
        obj = null;
          goto _L13
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        synchronized (b)
        {
            of.a("Received ad response.");
            c = adresponseparcel;
            b.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public final void b()
    {
        synchronized (g)
        {
            if (a != null)
            {
                a.g();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
