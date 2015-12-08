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

final class A
    implements Callable
{

    private com.crashlytics.android.v a;

    A(com.crashlytics.android.v v1)
    {
        a = v1;
        super();
    }

    public final Object call()
        throws Exception
    {
        v.f(a).createNewFile();
        v.a().b().a("Crashlytics", "Initialization marker file created.");
        return null;
    }
}
