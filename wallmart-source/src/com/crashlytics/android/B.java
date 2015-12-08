// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.v;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            v

final class B
    implements Callable
{

    private com.crashlytics.android.v a;

    B(com.crashlytics.android.v v1)
    {
        a = v1;
        super();
    }

    private Boolean a()
        throws Exception
    {
        boolean flag;
        try
        {
            flag = v.f(a).delete();
            v.a().b().a("Crashlytics", (new StringBuilder("Initialization marker file removed: ")).append(flag).toString());
        }
        catch (Exception exception)
        {
            v.a().b().a("Crashlytics", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public final Object call()
        throws Exception
    {
        return a();
    }
}
