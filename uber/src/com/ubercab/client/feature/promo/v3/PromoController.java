// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v3;

import android.content.Context;
import android.os.Bundle;
import butterknife.ButterKnife;
import fbj;
import fbn;
import fbo;
import fbp;
import fbq;
import fbr;
import fbt;
import fbv;
import fbz;
import gqa;
import gqb;
import hb;
import ica;
import ico;
import ide;
import idi;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.promo.v3:
//            PromoView, DisplayPromoActivity

public class PromoController extends gqb
    implements fbv
{

    public fbn a;
    public fbt b;
    private final DisplayPromoActivity c;
    private final ide d = new fbp(this, (byte)0);
    private final ide e = new fbo(this, (byte)0);
    private final ide f = new fbr(this, (byte)0);
    private final ide g = new fbq(this, (byte)0);
    private ica h;
    private ica i;
    public PromoView mView;

    public PromoController(DisplayPromoActivity displaypromoactivity, fbj fbj1)
    {
        super(displaypromoactivity, fbj1);
        c = displaypromoactivity;
    }

    private void a(fbj fbj1)
    {
        fbj1.a(this);
    }

    public final void a()
    {
        i.a(f, g);
    }

    protected final void a(Context context, Bundle bundle)
    {
        super.a(context, bundle);
        ButterKnife.inject(this, c);
        h = fbt.a().c(new idi() {

            final PromoController a;

            private static Iterable a(List list)
            {
                return list;
            }

            public final volatile Object a(Object obj)
            {
                return a((List)obj);
            }

            
            {
                a = PromoController.this;
                super();
            }
        }).d(fbz.a()).k().a(ico.a());
        context = mView.mInputView;
        i = fbt.b().d(fbz.a()).a(ico.a());
        mView.a(this);
        h.a(d, e);
    }

    protected final volatile void a(gqa gqa)
    {
        a((fbj)gqa);
    }

    public final hb b()
    {
        return a;
    }
}
