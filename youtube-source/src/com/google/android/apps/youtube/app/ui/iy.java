// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            WatchWhileLayout, iw

final class iy
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    final WatchWhileLayout a;
    private boolean b;

    private iy(WatchWhileLayout watchwhilelayout)
    {
        a = watchwhilelayout;
        super();
    }

    iy(WatchWhileLayout watchwhilelayout, byte byte0)
    {
        this(watchwhilelayout);
    }

    static void a(iy iy1)
    {
        iy1.b = false;
    }

    public final void onClick(View view)
    {
        if (WatchWhileLayout.d(a) != null)
        {
            if (b)
            {
                WatchWhileLayout.d(a).G();
            } else
            {
                WatchWhileLayout.d(a).F();
            }
        }
        b = false;
    }

    public final boolean onLongClick(View view)
    {
        b = true;
        if (WatchWhileLayout.d(a) != null)
        {
            WatchWhileLayout.d(a);
        }
        return false;
    }
}
