// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.i;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            ContinuableController, b, c, d

public abstract class h extends ContinuableController
{

    private ContinuableController a;
    private Object b;

    public h(i i, a a1, Object obj, aw aw)
    {
        super(i, a1, obj, aw);
        a1.a(this, com/google/android/apps/youtube/uilib/innertube/h, obj);
        b = obj;
    }

    protected final void a(ContinuableController continuablecontroller)
    {
        a = continuablecontroller;
    }

    protected final Object b()
    {
        return b;
    }

    public final void e()
    {
        if (a != null)
        {
            a.e();
            return;
        } else
        {
            super.e();
            return;
        }
    }

    public void handleContentEvent(b b1)
    {
    }

    public void handleErrorEvent(c c)
    {
    }

    public void handleLoadingEvent(d d)
    {
    }
}
