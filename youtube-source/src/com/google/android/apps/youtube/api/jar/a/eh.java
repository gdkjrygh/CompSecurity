// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.be;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ed

final class eh
    implements Runnable
{

    final float a;
    final ed b;

    eh(ed ed1, float f)
    {
        b = ed1;
        a = f;
        super();
    }

    public final void run()
    {
        ed.a(b).setFontScale(a);
    }
}
