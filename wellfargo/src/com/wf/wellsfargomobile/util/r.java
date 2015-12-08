// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.wf.wellsfargomobile.webview.a;

public class r
{

    public static WebView a(Context context, ViewGroup viewgroup)
    {
        context = com.wf.wellsfargomobile.webview.a.a(context);
        context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        context.setVisibility(8);
        viewgroup.addView(context);
        return context;
    }
}
