// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.network.uspout.model.Message;
import java.util.Map;

public final class djv
    implements gps
{

    private final cix a;
    private final UspoutClient b;
    private final cyy c;
    private boolean d;

    public djv(cix cix1, UspoutClient uspoutclient, cyy cyy)
    {
        a = cix1;
        b = uspoutclient;
        c = cyy;
    }

    public final void a()
    {
        d = true;
    }

    public final void a(Map map)
    {
        if (!d)
        {
            return;
        } else
        {
            b.a(new Message[] {
                Message.create(map, System.currentTimeMillis(), a.d(), a.e())
            });
            return;
        }
    }
}
