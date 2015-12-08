// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import java.util.concurrent.Callable;

// Referenced classes of package com.go.weatherex.home.a:
//            f, k

class i
    implements Callable
{

    final k a;
    final f b;

    i(f f1, k k)
    {
        b = f1;
        super();
        a = k;
    }

    public com.jiubang.core.a.i a()
    {
        return f.a(b, a, f.a(b, a));
    }

    public Object call()
    {
        return a();
    }
}
