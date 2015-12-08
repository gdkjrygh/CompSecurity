// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.go.weatherex.home.a:
//            f

class j extends FutureTask
{

    final f a;

    public j(f f, Callable callable)
    {
        a = f;
        super(callable);
    }

    protected void done()
    {
    }
}
