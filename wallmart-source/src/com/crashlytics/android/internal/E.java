// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            aa, D, v, q

final class E extends aa
{

    private D a;

    E(D d)
    {
        a = d;
        super();
    }

    public final void a()
    {
        try
        {
            D.a(a);
            return;
        }
        catch (Exception exception)
        {
            v.a().b().a("Crashlytics", "Problem encountered during Crashlytics initialization.", exception);
        }
    }
}
