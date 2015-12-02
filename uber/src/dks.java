// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.ClientSignupResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class dks
    implements Callback
{

    final String a;
    final dkr b;
    private final String c;
    private final boolean d;

    public dks(dkr dkr1, String s, String s1)
    {
        this(dkr1, s, s1, false);
    }

    public dks(dkr dkr1, String s, String s1, boolean flag)
    {
        b = dkr1;
        super();
        c = s;
        d = flag;
        a = s1;
    }

    private void a(ClientSignupResponse clientsignupresponse, Response response)
    {
        dkr.a(b).c(new dlh(c, a, d, clientsignupresponse, response));
    }

    public final void failure(RetrofitError retrofiterror)
    {
        dkr.a(b).c(new dlh(c, a, d, retrofiterror));
    }

    public final void success(Object obj, Response response)
    {
        a((ClientSignupResponse)obj, response);
    }
}
