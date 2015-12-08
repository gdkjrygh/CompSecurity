// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            h

final class i
    implements android.view.View.OnClickListener
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void onClick(View view)
    {
        view = a;
        boolean flag;
        if (!h.a(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(view, flag);
        h.b(a);
    }
}
