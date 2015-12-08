// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.view.KeyEvent;
import com.google.android.apps.youtube.api.ApiPlayer;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class s
    implements Runnable
{

    final int a;
    final KeyEvent b;
    final d c;

    s(d d1, int i, KeyEvent keyevent)
    {
        c = d1;
        a = i;
        b = keyevent;
        super();
    }

    public final void run()
    {
        d.a(c).a(a, b);
    }
}
