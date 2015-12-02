// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.feature.trip.overlay.HighlightOverlayView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class fvv
    implements gcm
{

    List a;
    private final chp b;
    private final Context c;
    private final gmg d;
    private HighlightOverlayView e;
    private fvx f;
    private ViewGroup g;

    public fvv(chp chp1, gmg gmg1, Context context)
    {
        a = new CopyOnWriteArrayList();
        b = chp1;
        d = gmg1;
        c = context;
    }

    public final void a(ViewGroup viewgroup)
    {
        g = viewgroup;
    }

    public final void a(fvw fvw1)
    {
        a.add(fvw1);
    }

    public final void a(boolean flag)
    {
        if (d.a(dbf.ca))
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvw)iterator.next()).a(this, flag)) { }
            if (flag)
            {
                b.a(f.f);
                return;
            }
        }
    }

    public final boolean a()
    {
        while (!d.a(dbf.ca) || e == null || g == null) 
        {
            return false;
        }
        g.removeView(e);
        e.b(this);
        e = null;
        return true;
    }

    public final boolean a(fvx fvx1, Rect rect)
    {
        if (!d.a(dbf.ca))
        {
            return false;
        }
        if (e == null && g != null)
        {
            f = fvx1;
            e = (HighlightOverlayView)((LayoutInflater)c.getSystemService("layout_inflater")).inflate(0x7f030076, g, false);
            e.a(this);
            g.addView(e);
            e.a(f.g, f.b, f.c, f.d);
            e.a(rect);
            b.a(f.e);
            return true;
        } else
        {
            return false;
        }
    }

    public final void b(fvw fvw1)
    {
        a.remove(fvw1);
    }
}
