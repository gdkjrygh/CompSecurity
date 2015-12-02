// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

final class ng.Object
    implements hst
{

    final fzh a;
    final fzg b;

    private Application b()
    {
        Application application = fzh.a(a).C();
        if (application == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return application;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fzg fzg1, fzh fzh1)
    {
        b = fzg1;
        a = fzh1;
        super();
    }
}
