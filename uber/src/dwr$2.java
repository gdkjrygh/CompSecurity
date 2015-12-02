// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class ang.Object
    implements Runnable
{

    final dop a;
    final dwr b;

    public final void run()
    {
        String s;
        s = b.a();
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        try
        {
            aam.a(dwr.a(b)).a();
            dwr.a(b, null);
            a.a("gcm", s);
            return;
        }
        catch (Exception exception)
        {
            a.a(exception);
        }
        return;
    }

    (dwr dwr1, dop dop1)
    {
        b = dwr1;
        a = dop1;
        super();
    }
}
