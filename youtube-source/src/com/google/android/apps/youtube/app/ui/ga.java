// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.ah;
import com.google.android.apps.youtube.datalib.innertube.model.am;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fw

final class ga
    implements ah
{

    final am a;
    final fw b;

    ga(fw fw1, am am)
    {
        b = fw1;
        a = am;
        super();
    }

    public final void a()
    {
        fw.b(b, a);
    }

    public final void a(Exception exception)
    {
        fw.d(b).c(exception);
    }

    public final void b()
    {
    }
}
