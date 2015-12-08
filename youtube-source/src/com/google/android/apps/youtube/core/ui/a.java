// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            AbstractWorkspace

final class a
    implements Runnable
{

    final AbstractWorkspace a;

    a(AbstractWorkspace abstractworkspace)
    {
        a = abstractworkspace;
        super();
    }

    public final void run()
    {
        a.b(AbstractWorkspace.a(a)).dispatchDisplayHint(0);
    }
}
