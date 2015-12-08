// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            DefaultApiPlayerSurface

final class s
    implements Runnable
{

    final DefaultApiPlayerSurface a;

    s(DefaultApiPlayerSurface defaultapiplayersurface)
    {
        a = defaultapiplayersurface;
        super();
    }

    public final void run()
    {
        DefaultApiPlayerSurface.a(a).setVisibility(8);
    }
}
