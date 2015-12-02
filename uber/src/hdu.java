// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;
import com.ubercab.mvc.app.MvcActivity;
import com.ubercab.rds.core.model.Shape_SupportTree;
import com.ubercab.rds.core.model.SupportIssue;
import com.ubercab.rds.core.model.SupportTree;
import com.ubercab.rds.core.network.SupportApi;
import com.ubercab.rds.feature.help.HelpSupportActivity;
import com.ubercab.rds.feature.support.SupportFormActivity;

public final class hdu extends gqb
    implements hdz
{

    chp a;
    hoi b;
    cix c;
    hch d;
    hck e;
    SupportApi f;
    private hdw g;
    private String h;

    public hdu(MvcActivity mvcactivity, hdw hdw1)
    {
        super(mvcactivity, hde.a().a(new hbt(mvcactivity.getApplication())).a());
        g = hdw1;
    }

    public hdu(MvcActivity mvcactivity, String s)
    {
        this(mvcactivity, ((hdw) (null)));
        h = s;
    }

    private void a(hdv hdv1)
    {
        hdv1.a(this);
    }

    public final void a()
    {
        if (g != null)
        {
            g.b();
        }
    }

    protected final void a(Context context, Bundle bundle)
    {
        bundle = e.y();
        Object obj = b;
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new hdy(context, this, ((hoi) (obj)), bundle, flag);
        a(((android.view.View) (obj)));
        if (h != null)
        {
            ((hdy) (obj)).a(hcr.a((SupportTree)b.a("com.ubercab.rds.SUPPORT_TREE", com/ubercab/rds/core/model/Shape_SupportTree), h));
            return;
        }
        obj = c.c();
        if (obj != null && ((UberLocation) (obj)).g() != null)
        {
            bundle = ((UberLocation) (obj)).g();
            double d4 = bundle.a();
            double d3 = bundle.b();
            double d2 = d4;
            double d1 = d3;
            if (d.a())
            {
                context = context.getResources();
                d2 = cxb.a(context.getString(hbo.ub__rds__hailstorm_latitude), d4);
                d1 = cxb.a(context.getString(hbo.ub__rds__hailstorm_longitude), d3);
            }
            a(f.supportHome("android", e.y(), cwt.a(), d2, d1), (icg)c());
            return;
        } else
        {
            a(f.supportHome("android", bundle, cwt.a()), (icg)c());
            return;
        }
    }

    public final void a(SupportIssue supportissue)
    {
        Object obj;
        if (h == null)
        {
            obj = i.l;
        } else
        {
            obj = i.i;
        }
        a.a(((cif) (obj)));
        obj = supportissue.getType();
        supportissue = supportissue.getId();
        if ("category".equals(obj))
        {
            d().startActivity(HelpSupportActivity.a(d(), supportissue));
        } else
        if ("faq".equals(obj) || "form".equals(obj))
        {
            d().startActivity(SupportFormActivity.a(d(), ((String) (obj)), supportissue, null, null));
            return;
        }
    }

    protected final volatile void a(gqa gqa)
    {
        a((hdv)gqa);
    }

    public final void a(boolean flag)
    {
        if (g != null)
        {
            g.a(flag);
        }
    }
}
