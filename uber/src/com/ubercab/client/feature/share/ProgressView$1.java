// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.feature.share:
//            ProgressView

final class a
    implements Runnable
{

    final ProgressView a;

    public final void run()
    {
        if (ProgressView.a(a))
        {
            a.mTextDots.setText(ProgressView.i()[ProgressView.b(a)]);
            if (ProgressView.c(a) == ProgressView.i().length)
            {
                ProgressView.d(a);
            }
            a.postDelayed(this, 250L);
        }
    }

    (ProgressView progressview)
    {
        a = progressview;
        super();
    }
}
