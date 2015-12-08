// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail;

import com.android.a.aa;
import com.jiubang.playsdk.a.a.c;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.views.HorizontalListView;
import java.util.List;

// Referenced classes of package com.jiubang.playsdk.detail:
//            ThemePreviewLastItemView, b

class a
    implements k
{

    final ThemePreviewLastItemView a;

    a(ThemePreviewLastItemView themepreviewlastitemview)
    {
        a = themepreviewlastitemview;
        super();
    }

    public void a(aa aa)
    {
        ThemePreviewLastItemView.a(a);
    }

    public void a(c c1)
    {
        if (c1 == null || c1.a == null || c1.a.isEmpty())
        {
            ThemePreviewLastItemView.a(a);
            return;
        } else
        {
            ThemePreviewLastItemView.b(a);
            com.jiubang.playsdk.detail.ThemePreviewLastItemView.c(a).a(new b(a, a.getContext(), c1.a));
            return;
        }
    }

    public volatile void a(Object obj)
    {
        a((c)obj);
    }
}
