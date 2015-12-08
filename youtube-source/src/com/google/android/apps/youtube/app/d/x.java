// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.app.AlertDialog;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            s

final class x
    implements Runnable
{

    final s a;

    x(s s1)
    {
        a = s1;
        super();
    }

    public final void run()
    {
        s.f(a).show();
    }
}
