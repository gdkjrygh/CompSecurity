// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            j

final class k
    implements Callable
{

    final String a;
    final j b;

    k(j j1, String s)
    {
        b = j1;
        a = s;
        super();
    }

    public final Object call()
    {
        j.a(b, a);
        return null;
    }
}
