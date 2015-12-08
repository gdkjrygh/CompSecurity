// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.h5;

import android.content.Context;
import android.webkit.WebView;
import android.widget.ProgressBar;

// Referenced classes of package com.jiubang.commerce.ad.h5:
//            c

public class b extends WebView
{

    private ProgressBar a;

    public b(Context context)
    {
        super(context);
        a();
    }

    static ProgressBar a(b b1)
    {
        return b1.a;
    }

    private void a()
    {
        a = new ProgressBar(getContext(), null, 0x1010078);
        a.setLayoutParams(new android.widget.AbsoluteLayout.LayoutParams(-1, 3, 0, 0));
        addView(a);
        setWebChromeClient(new c(this));
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        android.widget.AbsoluteLayout.LayoutParams layoutparams = (android.widget.AbsoluteLayout.LayoutParams)a.getLayoutParams();
        layoutparams.x = i;
        layoutparams.y = j;
        a.setLayoutParams(layoutparams);
        super.onScrollChanged(i, j, k, l);
    }
}
