// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.os.Binder;
import com.google.android.apps.youtube.core.utils.w;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            k, h

final class g extends w
{

    final h a;

    g(Class class1, h h)
    {
        a = h;
        super(class1);
    }

    protected final void a(Binder binder)
    {
        ((k)binder).b(a);
    }

    protected final void b(Binder binder)
    {
        ((k)binder).a(a);
    }
}
