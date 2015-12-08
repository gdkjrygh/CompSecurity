// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            v

final class C
    implements Callable
{

    private v a;

    C(v v1)
    {
        a = v1;
        super();
    }

    public final Object call()
        throws Exception
    {
        return Boolean.valueOf(v.f(a).exists());
    }
}
