// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.ubercab.mvc.app.MvcActivity;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.feature.conversation.ConversationActivity;
import com.ubercab.rds.feature.messages.MessagesActivity;
import com.ubercab.rds.feature.trip.TripHistoryActivity;
import com.ubercab.rds.feature.trip.TripProblemActivity;
import com.ubercab.rds.realtime.response.ContactResponse;

public final class hdi extends gqb
    implements hdp, hdw, hed
{

    chp a;
    hch b;
    hck c;
    final hdn d;
    final hdu e;
    final heb f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;

    public hdi(MvcActivity mvcactivity)
    {
        super(mvcactivity, hda.a().a(new hbt(mvcactivity.getApplication())).a());
        a.a(h.c);
        b.b("com.ubercab.rds.RETURN_HELP");
        d = new hdn(mvcactivity, this);
        f = new heb(mvcactivity, this);
        e = new hdu(mvcactivity, this);
    }

    private void a(hdj hdj1)
    {
        hdj1.a(this);
    }

    private boolean a(int i1, int j1)
    {
        return "client".equals(c.y()) && i1 == 0 && j1 > 0;
    }

    private void f()
    {
        if (g())
        {
            ((hdl)c()).e();
        } else
        if (h())
        {
            ((hdl)c()).f();
            return;
        }
    }

    private boolean g()
    {
        return j && l && k;
    }

    private boolean h()
    {
        return g && i && h;
    }

    public final void a()
    {
        a.a(i.g);
        MvcActivity mvcactivity = d();
        mvcactivity.startActivity(MessagesActivity.a(mvcactivity));
    }

    protected final void a(Context context, Bundle bundle)
    {
        context = new hdl(context);
        context.a(c.y());
        a(((android.view.View) (context)));
        a(((gpz) (d)), ((android.view.ViewGroup) (((hdl)c()).a())), bundle);
        a(((gpz) (f)), ((android.view.ViewGroup) (((hdl)c()).b())), bundle);
        a(((gpz) (e)), ((android.view.ViewGroup) (((hdl)c()).c())), bundle);
    }

    public final void a(TripSummary tripsummary)
    {
        a.a(i.k);
        MvcActivity mvcactivity = d();
        mvcactivity.startActivity(TripProblemActivity.a(mvcactivity, tripsummary));
    }

    public final void a(ContactResponse contactresponse)
    {
        a.a(i.j);
        MvcActivity mvcactivity = d();
        mvcactivity.startActivity(ConversationActivity.a(mvcactivity, contactresponse.getId(), contactresponse.getFlowNodeName()));
    }

    protected final volatile void a(gqa gqa)
    {
        a((hdj)gqa);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            ((hdl)c()).c().setVisibility(8);
        }
        h = true;
        k = flag;
        f();
    }

    public final void a(boolean flag, int i1, int j1)
    {
        if (!flag && j1 != 0) goto _L2; else goto _L1
_L1:
        ((hdl)c()).a().setVisibility(8);
_L4:
        g = true;
        j = flag;
        f();
        return;
_L2:
        if (a(i1, j1))
        {
            ((hdl)c()).d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (flag || !flag1)
        {
            ((hdl)c()).b().setVisibility(8);
        }
        i = true;
        l = flag;
        f();
    }

    public final void b()
    {
        a.a(i.h);
        MvcActivity mvcactivity = d();
        mvcactivity.startActivity(TripHistoryActivity.a(mvcactivity).setAction("com.ubercab.rds.ACTION_TRIP_PROBLEM"));
    }
}
