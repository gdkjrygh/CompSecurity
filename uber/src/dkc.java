// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.CreateInvitesResponse;
import com.ubercab.client.core.model.InvitationsResponse;
import com.ubercab.client.core.network.InvitationsApi;
import java.util.List;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dkc
{

    private final cev a;
    private final InvitationsApi b;
    private boolean c;

    public dkc(cev cev, InvitationsApi invitationsapi)
    {
        b = invitationsapi;
        a = cev;
    }

    static cev a(dkc dkc1)
    {
        return dkc1.a;
    }

    public final void a()
    {
        Callback callback = new Callback() {

            final dkc a;

            private void a(InvitationsResponse invitationsresponse, Response response)
            {
                dkc.a(a).c(new dma(invitationsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkc.a(a).c(new dma(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((InvitationsResponse)obj, response);
            }

            
            {
                a = dkc.this;
                super();
            }
        };
        b.getInvites(null, null, 25, callback);
        c = false;
    }

    public final void a(List list)
    {
        c = true;
        Callback callback = new Callback() {

            final dkc a;

            private void a(CreateInvitesResponse createinvitesresponse, Response response)
            {
                dkc.a(a).c(new dln(createinvitesresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkc.a(a).c(new dln(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((CreateInvitesResponse)obj, response);
            }

            
            {
                a = dkc.this;
                super();
            }
        };
        list = gkg.a("invitees", list);
        b.createInvites(list, callback);
    }

    public final boolean b()
    {
        return c;
    }
}
