// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.OkHttpClient;

final class ng.Object
    implements hst
{

    final fzj a;
    final fzi b;

    private OkHttpClient b()
    {
        OkHttpClient okhttpclient = fzj.b(a).w();
        if (okhttpclient == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return okhttpclient;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fzi fzi1, fzj fzj1)
    {
        b = fzi1;
        a = fzj1;
        super();
    }
}
