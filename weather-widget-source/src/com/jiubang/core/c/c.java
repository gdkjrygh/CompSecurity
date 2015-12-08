// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;

import android.os.Process;

// Referenced classes of package com.jiubang.core.c:
//            i, a

class c extends i
{

    final a a;

    c(a a1)
    {
        a = a1;
        super(null);
    }

    public Object call()
    {
        Process.setThreadPriority(10);
        return a.a(b);
    }
}
