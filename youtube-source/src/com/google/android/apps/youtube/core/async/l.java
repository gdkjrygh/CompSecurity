// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            k, af

final class l
    implements Runnable
{

    final k a;
    private final Object b;
    private final b c;

    public l(k k1, Object obj, b b1)
    {
        a = k1;
        super();
        b = obj;
        c = b1;
    }

    public final void run()
    {
        k.a(a).a(b, c);
    }
}
