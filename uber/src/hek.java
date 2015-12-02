// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.ubercab.mvc.app.MvcActivity;
import com.ubercab.rds.feature.conversation.ConversationActivity;
import com.ubercab.rds.realtime.response.ContactResponse;

public final class hek extends gqb
    implements heo
{

    chp a;
    hjf b;
    hck c;

    public hek(MvcActivity mvcactivity)
    {
        super(mvcactivity, heh.a().a(new hbt(mvcactivity.getApplication())).a());
        a.a(h.b);
    }

    private void a(hel hel1)
    {
        hel1.a(this);
    }

    protected final void a(Context context, Bundle bundle)
    {
        a(((android.view.View) (new hen(context, this))));
        a(b.a(c.z()), (icg)c());
    }

    public final void a(ContactResponse contactresponse)
    {
        a.a(i.f);
        MvcActivity mvcactivity = d();
        mvcactivity.startActivity(ConversationActivity.a(mvcactivity, contactresponse.getId(), contactresponse.getFlowNodeName()));
    }

    protected final volatile void a(gqa gqa)
    {
        a((hel)gqa);
    }
}
