// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.response.TestAccount;
import java.util.List;

final class dzt
    implements icg
{

    final dzs a;
    private final Client b;

    private dzt(dzs dzs1, Client client)
    {
        a = dzs1;
        super();
        b = client;
    }

    dzt(dzs dzs1, Client client, byte byte0)
    {
        this(dzs1, client);
    }

    private void a(List list)
    {
        if (list != null && gki.e(list, new gka(b.getUuid()) {

        final String a;
        final dzt b;

        private boolean a(TestAccount testaccount)
        {
            return a.equals(testaccount.getUuid());
        }

        public final boolean apply(Object obj)
        {
            return a((TestAccount)obj);
        }

            
            {
                b = dzt.this;
                a = s;
                super();
            }
    }) == -1)
        {
            list.add(0, TestAccount.create(b.getUuid(), b.getFirstName(), b.getLastName(), b.getEmail(), b.getToken(), b.getRole()));
        }
        a.o.a(list);
        dzs.a(a, list);
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((List)obj);
    }

    public final void a(Throwable throwable)
    {
        a.o.a(null);
        dzs.a(a, null);
    }
}
