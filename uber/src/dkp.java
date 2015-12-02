// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.SafetyNetAddContactsRequest;
import com.ubercab.client.core.model.SafetyNetAddContactsResponse;
import com.ubercab.client.core.model.SafetyNetDeleteContactsResponse;
import com.ubercab.client.core.model.SafetyNetGetContactsResponse;
import com.ubercab.client.core.model.SafetyNetGetSharedTripContactsResponse;
import com.ubercab.client.core.model.SafetyNetShareTripResponse;
import com.ubercab.client.core.network.SafetyNetApi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dkp
{

    private final cev a;
    private final SafetyNetApi b;

    public dkp(cev cev, SafetyNetApi safetynetapi)
    {
        a = cev;
        b = safetynetapi;
    }

    static cev a(dkp dkp1)
    {
        return dkp1.a;
    }

    public final void a(String s)
    {
        Callback callback = new Callback() {

            final dkp a;

            private void a(SafetyNetGetContactsResponse safetynetgetcontactsresponse, Response response)
            {
                dkp.a(a).c(new dnb(safetynetgetcontactsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkp.a(a).c(new dnb(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((SafetyNetGetContactsResponse)obj, response);
            }

            
            {
                a = dkp.this;
                super();
            }
        };
        b.getContacts(s, callback);
    }

    public final void a(String s, SafetyNetAddContactsRequest safetynetaddcontactsrequest)
    {
        Callback callback = new Callback() {

            final dkp a;

            private void a(SafetyNetAddContactsResponse safetynetaddcontactsresponse, Response response)
            {
                dkp.a(a).c(new dmz(safetynetaddcontactsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkp.a(a).c(new dmz(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((SafetyNetAddContactsResponse)obj, response);
            }

            
            {
                a = dkp.this;
                super();
            }
        };
        safetynetaddcontactsrequest = gkg.a("contacts", safetynetaddcontactsrequest.mContacts);
        b.addContacts(s, safetynetaddcontactsrequest, callback);
    }

    public final void a(String s, String s1, String s2, List list)
    {
        Callback callback = new Callback() {

            final dkp a;

            private void a(SafetyNetShareTripResponse safetynetsharetripresponse, Response response)
            {
                dkp.a(a).c(new dnd(safetynetsharetripresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkp.a(a).c(new dnd(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((SafetyNetShareTripResponse)obj, response);
            }

            
            {
                a = dkp.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        hashmap.put("tripShareUrl", s2);
        hashmap.put("senderName", s1);
        hashmap.put("contacts", list);
        b.shareTrip(s, hashmap, callback);
    }

    public final void a(String s, List list)
    {
        Callback callback = new Callback() {

            final dkp a;

            private void a(SafetyNetDeleteContactsResponse safetynetdeletecontactsresponse, Response response)
            {
                dkp.a(a).c(new dna(safetynetdeletecontactsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkp.a(a).c(new dna(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((SafetyNetDeleteContactsResponse)obj, response);
            }

            
            {
                a = dkp.this;
                super();
            }
        };
        list = gkg.a("contacts", list);
        b.deleteContacts(s, list, callback);
    }

    public final void b(String s)
    {
        Callback callback = new Callback() {

            final dkp a;

            private void a(SafetyNetGetSharedTripContactsResponse safetynetgetsharedtripcontactsresponse, Response response)
            {
                dkp.a(a).c(new dnc(safetynetgetsharedtripcontactsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkp.a(a).c(new dnc(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((SafetyNetGetSharedTripContactsResponse)obj, response);
            }

            
            {
                a = dkp.this;
                super();
            }
        };
        b.getSharedTripContacts(s, callback);
    }
}
