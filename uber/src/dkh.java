// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.PasswordResetResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class dkh
    implements Callback
{

    final dkf a;

    private dkh(dkf dkf1)
    {
        a = dkf1;
        super();
    }

    dkh(dkf dkf1, byte byte0)
    {
        this(dkf1);
    }

    private void a(PasswordResetResponse passwordresetresponse)
    {
        if (dkf.a(a) != null)
        {
            dkf.a(a).a(new enh(passwordresetresponse));
        }
    }

    public final void failure(RetrofitError retrofiterror)
    {
        if (dkf.a(a) != null)
        {
            dkg dkg1 = dkf.a(a);
            new eng(retrofiterror);
            dkg1.a();
        }
    }

    public final void success(Object obj, Response response)
    {
        a((PasswordResetResponse)obj);
    }
}
