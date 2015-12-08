// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.youtube.h;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            a

public final class ax extends a
{

    public ax(View view, android.view.View.OnClickListener onclicklistener)
    {
        super(view, onclicklistener);
    }

    public final View a(x x1)
    {
        if (x1 == null)
        {
            b();
        } else
        if (x1.v())
        {
            c();
        } else
        if (x1.t())
        {
            if (x1.u())
            {
                a(h.Z, 0, x1.o(), 100);
            } else
            {
                b();
            }
        } else
        {
            a(false, x1.o(), 100);
        }
        return null;
    }

    public final volatile View a(f f, Object obj)
    {
        return a((x)obj);
    }
}
