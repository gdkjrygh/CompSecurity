// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.c.d;
import com.google.android.apps.youtube.core.identity.ai;

// Referenced classes of package com.google.android.apps.youtube.app:
//            GuideActivity

final class af
    implements d
{

    final GuideActivity a;

    af(GuideActivity guideactivity)
    {
        a = guideactivity;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (ai)obj;
        GuideActivity.a(a, ((ai) (obj)));
    }
}
