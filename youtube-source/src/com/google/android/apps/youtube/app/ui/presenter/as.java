// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.apps.youtube.uilib.a.f;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            a

public final class as extends a
{

    public as(View view, android.view.View.OnClickListener onclicklistener)
    {
        super(view, onclicklistener);
    }

    public final View a(s s1)
    {
        if (s1 == null)
        {
            b();
        } else
        if (s1.e())
        {
            c();
        } else
        {
            a(true, s1.c(), s1.d());
        }
        return null;
    }

    public final volatile View a(f f, Object obj)
    {
        return a((s)obj);
    }
}
