// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.widget.SearchView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.compat.j;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            a, e

final class d extends a
{

    private final e i = new e(this, (byte)0);

    public d(YouTubeActivity youtubeactivity, am am, String s, o o)
    {
        super(youtubeactivity, am, s, o);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        break MISSING_BLOCK_LABEL_5;
        if (a != null && b != null && c != ActionBarMenuHelper.SearchMode.DISABLED && c != ActionBarMenuHelper.SearchMode.CUSTOM)
        {
            a.c();
            if (!flag)
            {
                b.clearFocus();
                return;
            }
        }
        return;
    }

    public final boolean a(j j)
    {
        boolean flag = super.a(j);
        if (c != ActionBarMenuHelper.SearchMode.DISABLED)
        {
            if (i != null)
            {
                a.a(i);
            }
            if (c == ActionBarMenuHelper.SearchMode.CUSTOM)
            {
                b.setImeOptions(0x2000003);
            }
        }
        return flag;
    }

    public final void d()
    {
        super.d();
        while (a == null || b == null || c == ActionBarMenuHelper.SearchMode.DISABLED || c == ActionBarMenuHelper.SearchMode.CUSTOM || !a.g()) 
        {
            return;
        }
        a.b();
    }
}
