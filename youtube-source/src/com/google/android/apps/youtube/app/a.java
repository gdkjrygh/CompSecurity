// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app:
//            g, DebugOfflineAdActivity

final class a
    implements android.view.View.OnClickListener
{

    final DebugOfflineAdActivity a;

    a(DebugOfflineAdActivity debugofflineadactivity)
    {
        a = debugofflineadactivity;
        super();
    }

    public final void onClick(View view)
    {
        (new g(a, (byte)0)).execute(new Void[] {
            null
        });
    }
}
