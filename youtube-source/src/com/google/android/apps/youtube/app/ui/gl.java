// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            TabbedView

final class gl
    implements android.view.View.OnClickListener
{

    final TabbedView a;

    gl(TabbedView tabbedview)
    {
        a = tabbedview;
        super();
    }

    public final void onClick(View view)
    {
        TabbedView.a(a, view);
    }
}
