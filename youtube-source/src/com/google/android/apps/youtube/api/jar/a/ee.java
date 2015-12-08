// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.be;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ed

final class ee
    implements Runnable
{

    final List a;
    final ed b;

    ee(ed ed1, List list)
    {
        b = ed1;
        a = list;
        super();
    }

    public final void run()
    {
        ed.a(b).a(a);
    }
}
