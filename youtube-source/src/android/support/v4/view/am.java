// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            bw, bx, PagerTitleStrip, ViewPager, 
//            aj

final class am extends DataSetObserver
    implements bw, bx
{

    final PagerTitleStrip a;
    private int b;

    private am(PagerTitleStrip pagertitlestrip)
    {
        a = pagertitlestrip;
        super();
    }

    am(PagerTitleStrip pagertitlestrip, byte byte0)
    {
        this(pagertitlestrip);
    }

    public final void a(int i)
    {
        float f = 0.0F;
        if (b == 0)
        {
            a.a(a.a.b(), a.a.a());
            if (PagerTitleStrip.a(a) >= 0.0F)
            {
                f = PagerTitleStrip.a(a);
            }
            a.a(a.a.b(), f, true);
        }
    }

    public final void a(int i, float f)
    {
        int j = i;
        if (f > 0.5F)
        {
            j = i + 1;
        }
        a.a(j, f, false);
    }

    public final void a(aj aj, aj aj1)
    {
        a.a(aj, aj1);
    }

    public final void b(int i)
    {
        b = i;
    }

    public final void onChanged()
    {
        float f = 0.0F;
        a.a(a.a.b(), a.a.a());
        if (PagerTitleStrip.a(a) >= 0.0F)
        {
            f = PagerTitleStrip.a(a);
        }
        a.a(a.a.b(), f, true);
    }
}
