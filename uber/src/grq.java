// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.network.ramen.internal.model.Message;
import com.ubercab.network.ramen.internal.model.Response;
import java.util.Iterator;
import java.util.List;

final class grq
    implements grn
{

    final gro a;

    private grq(gro gro1)
    {
        a = gro1;
        super();
    }

    grq(gro gro1, byte byte0)
    {
        this(gro1);
    }

    public final void a(gqq gqq1)
    {
        gqq1 = (Response)gro.g(a).a(gqq1.g(), com/ubercab/network/ramen/internal/model/Response);
        for (gqq1 = gqq1.getMessages().iterator(); gqq1.hasNext();)
        {
            Message message = (Message)gqq1.next();
            gro.a(a, Math.max(gro.d(a), message.getSequenceNum()));
            Iterator iterator = gro.h(a).iterator();
            while (iterator.hasNext()) 
            {
                ((grr)iterator.next()).a(new com.ubercab.network.ramen.model.Message(message));
            }
        }

        break MISSING_BLOCK_LABEL_119;
        gqq1;
    }
}
