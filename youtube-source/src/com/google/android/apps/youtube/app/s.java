// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineResyncActivity

final class s
    implements android.view.View.OnClickListener
{

    final DebugOfflineResyncActivity a;

    s(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        a = debugofflineresyncactivity;
        super();
    }

    public final void onClick(View view)
    {
        DebugOfflineResyncActivity.c(a);
    }
}
