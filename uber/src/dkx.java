// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.Group;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class dkx
    implements Callback
{

    final String a;
    final dkw b;

    dkx(dkw dkw1, String s)
    {
        b = dkw1;
        super();
        a = s;
    }

    private void a(Group group, Response response)
    {
        dkw.b(b).c(new ejz(group, response, a));
    }

    public final void failure(RetrofitError retrofiterror)
    {
        dkw.b(b).c(new ejz(retrofiterror, a));
    }

    public final void success(Object obj, Response response)
    {
        a((Group)obj, response);
    }
}
