// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.provider.SearchRecentSuggestions;
import com.google.android.apps.youtube.common.e.f;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class bu extends f
{

    final ax a;

    bu(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        return new SearchRecentSuggestions(ax.c(a), "com.google.android.youtube.SuggestionProvider", 1);
    }
}
