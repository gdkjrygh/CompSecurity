// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            bo

final class bp
    implements Runnable
{

    final bo a;

    bp(bo bo1)
    {
        a = bo1;
        super();
    }

    public final void run()
    {
        if (bo.a(a) != null)
        {
            bo.a(a).setBackgroundDrawable(null);
        }
    }
}
