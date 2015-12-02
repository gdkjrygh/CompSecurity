// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashSet;
import java.util.List;

final class oj
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    public lo A;
    private HashSet B;
    private int C;
    private int D;
    private ajq E;
    public final String a;
    public final Context b;
    public final amb c;
    public final VersionInfoParcel d;
    public aiw e;
    public kz f;
    public oi g;
    public lc h;
    public aiw i;
    public AdSizeParcel j;
    public ain k;
    public aio l;
    public aip m;
    public ll n;
    public agl o;
    public afz p;
    public aco q;
    public acp r;
    public abz s;
    public List t;
    public nb u;
    public aiu v;
    public View w;
    public int x;
    public boolean y;
    public boolean z;

    public oj(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel)
    {
        this(context, adsizeparcel, s1, versioninfoparcel, (byte)0);
    }

    private oj(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel, byte byte0)
    {
        v = null;
        w = null;
        x = 0;
        y = false;
        z = false;
        B = null;
        C = -1;
        D = -1;
        abn.a(context);
        if (adsizeparcel.e || adsizeparcel.i)
        {
            g = null;
        } else
        {
            g = new oi(context);
            g.setMinimumWidth(adsizeparcel.g);
            g.setMinimumHeight(adsizeparcel.d);
            g.setVisibility(4);
        }
        if (context != null && (context instanceof Activity) && g != null)
        {
            ot.e();
            ajc.a((Activity)context, this);
            ot.e();
            ajc.a((Activity)context, this);
        }
        j = adsizeparcel;
        a = s1;
        b = context;
        d = versioninfoparcel;
        c = new amb(new oo(this));
        E = new ajq(200L);
    }

    private void b(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_3;
        if (g != null && k != null && k.b != null && k.b.i().b() && (!flag || E.a()))
        {
            int ai[] = new int[2];
            g.getLocationOnScreen(ai);
            kx.a();
            int i1 = oe.b(b, ai[0]);
            kx.a();
            int j1 = oe.b(b, ai[1]);
            if (i1 != C || j1 != D)
            {
                C = i1;
                D = j1;
                akl akl1 = k.b.i();
                i1 = C;
                j1 = D;
                if (!flag)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                akl1.a(i1, j1, flag);
                return;
            }
        }
        return;
    }

    private void e()
    {
        if (k != null && k.b != null)
        {
            k.b.stopLoading();
        }
    }

    public final HashSet a()
    {
        return B;
    }

    public final void a(HashSet hashset)
    {
        B = hashset;
    }

    public final void a(boolean flag)
    {
        if (x == 0)
        {
            e();
        }
        if (e != null)
        {
            e.g();
        }
        if (i != null)
        {
            i.g();
        }
        if (flag)
        {
            k = null;
        }
    }

    public final void b()
    {
        if (k != null && k.b != null)
        {
            k.b.destroy();
        }
    }

    public final void c()
    {
        if (k == null || k.m == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        k.m.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        of.e("Could not destroy mediation adapter.");
        return;
    }

    public final void d()
    {
        h = null;
        n = null;
        o = null;
        p = null;
        s = null;
        A = null;
        if (b != null && (b instanceof Activity) && g != null)
        {
            ot.g().a((Activity)b, this);
            ot.e();
            ajc.b((Activity)b, this);
        }
        a(false);
        if (g != null)
        {
            g.removeAllViews();
        }
        b();
        c();
        k = null;
    }

    public final void onGlobalLayout()
    {
        b(false);
    }

    public final void onScrollChanged()
    {
        b(true);
    }
}
