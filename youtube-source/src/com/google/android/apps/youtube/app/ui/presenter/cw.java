// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.as;
import com.google.android.apps.youtube.datalib.innertube.model.au;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            y, cx

public final class cw extends a
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final gr e;
    private final View f;
    private final View g;
    private final View h;
    private final View i;
    private final y j;
    private final LinearLayout k;
    private final View l;
    private final Context m;
    private final v n;
    private as o;
    private int p;

    public cw(Context context, bj bj, com.google.android.apps.youtube.datalib.d.a a1, v v1)
    {
        super(a1);
        m = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        n = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        a = View.inflate(context, l.bw, null);
        b = (TextView)a.findViewById(j.fF);
        c = (TextView)a.findViewById(j.aP);
        d = (TextView)a.findViewById(j.z);
        e = new gr(bj, (ImageView)a.findViewById(j.fy));
        g = a.findViewById(j.fA);
        f = a.findViewById(j.eu);
        h = a.findViewById(j.aU);
        i = a.findViewById(j.aE);
        k = (LinearLayout)a.findViewById(j.bn);
        l = a.findViewById(j.bm);
        j = new y(bj, a);
        a.setOnClickListener(this);
        l.setOnClickListener(new cx(this, a1));
    }

    private int a()
    {
        if (com.google.android.apps.youtube.core.utils.l.b(m))
        {
            return 2;
        } else
        {
            return m.getResources().getConfiguration().orientation;
        }
    }

    private View a(f f1, as as1)
    {
        super.a(f1, as1);
        o = as1;
        j.a(as1);
        int i1 = a();
        Object obj;
        Object obj1;
        au au1;
        if (i1 != p)
        {
            p = i1;
            f1 = m.getResources();
            obj = (android.widget.LinearLayout.LayoutParams)g.getLayoutParams();
            obj1 = (android.widget.LinearLayout.LayoutParams)h.getLayoutParams();
            TextView textview;
            if (i1 == 2)
            {
                k.setOrientation(0);
                g.setPadding((int)f1.getDimension(g.K), g.getPaddingTop(), (int)f1.getDimension(g.L), (int)f1.getDimension(g.J));
                h.setPadding(h.getPaddingLeft(), 0, h.getPaddingRight(), h.getPaddingBottom());
                obj.width = 0;
                obj.weight = f1.getInteger(k.l);
                obj1.width = 0;
                obj1.weight = f1.getInteger(k.k);
                f.setVisibility(0);
            } else
            {
                k.setOrientation(1);
                g.setPadding(0, g.getPaddingTop(), 0, 0);
                h.setPadding(h.getPaddingLeft(), (int)f1.getDimension(g.I), h.getPaddingRight(), h.getPaddingBottom());
                obj.width = -1;
                obj.weight = 0.0F;
                obj1.width = -1;
                obj1.weight = 0.0F;
                f.setVisibility(8);
            }
        }
        au1 = as1.f();
        b.setText(au1.c());
        textview = d;
        i1 = a();
        obj = au1.d();
        obj1 = au1.g();
        if (obj == null)
        {
            f1 = ((f) (obj1));
        } else
        if (obj1 == null)
        {
            f1 = ((f) (obj));
        } else
        {
            if (i1 == 2)
            {
                f1 = System.getProperty("line.separator");
            } else
            {
                f1 = " \267 ";
            }
            f1 = TextUtils.concat(new CharSequence[] {
                obj, f1, obj1
            });
        }
        textview.setText(f1);
        if (au1.f() == null)
        {
            c.setText(p.cl);
        } else
        {
            c.setText(au1.f());
        }
        e.a(au1.b());
        i.setVisibility(0);
        ad.a(n, i, as1);
        return a;
    }

    static as a(cw cw1)
    {
        return cw1.o;
    }

    public final volatile View a(f f1, u u)
    {
        return a(f1, (as)u);
    }

    public final volatile View a(f f1, Object obj)
    {
        return a(f1, (as)obj);
    }
}
