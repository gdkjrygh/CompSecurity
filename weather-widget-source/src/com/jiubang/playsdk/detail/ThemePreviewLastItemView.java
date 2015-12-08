// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.views.HorizontalListView;

// Referenced classes of package com.jiubang.playsdk.detail:
//            a

public class ThemePreviewLastItemView extends LinearLayout
{

    private HorizontalListView a;
    private ViewGroup b;
    private k c;

    public ThemePreviewLastItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new a(this);
    }

    private void a()
    {
        b.setVisibility(8);
    }

    static void a(ThemePreviewLastItemView themepreviewlastitemview)
    {
        themepreviewlastitemview.a();
    }

    private void b()
    {
        if (getResources().getConfiguration().orientation == 1)
        {
            b.setVisibility(0);
        }
    }

    static void b(ThemePreviewLastItemView themepreviewlastitemview)
    {
        themepreviewlastitemview.b();
    }

    static HorizontalListView c(ThemePreviewLastItemView themepreviewlastitemview)
    {
        return themepreviewlastitemview.a;
    }

    public void a(String s, int i)
    {
        y.a().a(s, 0, i, c);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (HorizontalListView)findViewById(0x7f0903dd);
        b = (ViewGroup)findViewById(0x7f0903da);
        a();
    }
}
