// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.ui;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.player.ui:
//            h, f

final class g
    implements android.view.View.OnClickListener
{

    final h a;
    final f b;

    g(f f, h h1)
    {
        b = f;
        a = h1;
        super();
    }

    public final void onClick(View view)
    {
        if (a != null)
        {
            a.a(b);
        }
    }
}
