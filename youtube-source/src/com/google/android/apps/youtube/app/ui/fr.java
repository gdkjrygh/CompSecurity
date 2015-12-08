// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fq, fm

final class fr
    implements android.view.View.OnClickListener
{

    final fm a;
    final fq b;

    fr(fq fq1, fm fm1)
    {
        b = fq1;
        a = fm1;
        super();
    }

    public final void onClick(View view)
    {
        if (fq.a(b) != null)
        {
            b.c.a(fq.a(b));
        }
    }
}
