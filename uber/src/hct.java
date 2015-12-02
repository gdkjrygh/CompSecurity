// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.ubercab.mvc.app.MvcActivity;
import com.ubercab.rds.feature.trip.TripDetailsActivity;
import com.ubercab.rds.feature.trip.TripReceiptActivity;

public final class hct extends gqb
    implements hcx
{

    chp a;
    hjf b;
    hco c;
    hck d;
    private hcw e;
    private String f;

    public hct(MvcActivity mvcactivity, String s)
    {
        super(mvcactivity, hcy.a().a(new hbt(mvcactivity.getApplication())).a());
        a.a(h.a);
        f = s;
    }

    static hcw a(hct hct1)
    {
        return hct1.e;
    }

    private void a(hcu hcu1)
    {
        hcu1.a(this);
    }

    protected final void a(Context context, Bundle bundle)
    {
        e = new hcw(context, this, a, c);
        a(((android.view.View) (e)));
        a(b.b(f), (icg)c());
    }

    protected final volatile void a(gqa gqa)
    {
        a((hcu)gqa);
    }

    public final void a(String s)
    {
        a.a(i.d);
        MvcActivity mvcactivity = d();
        cwz.a(mvcactivity);
        b.a(f, d.z(), s, null).a(ico.a()).b(new _cls1(mvcactivity, s));
    }

    public final void b(String s)
    {
        MvcActivity mvcactivity = d();
        b.a(f, d.z(), null, s).a(ico.a()).b(new _cls2(mvcactivity, s));
    }

    public final void c(String s)
    {
        a.a(i.e);
        String s1 = d.y();
        if ("client".equals(s1))
        {
            d().startActivity(TripReceiptActivity.a(d(), s));
        } else
        if ("driver".equals(s1))
        {
            d().startActivity(TripDetailsActivity.a(d(), s));
            return;
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
