// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.internal:
//            db

final class bg
{

    public final int a;
    public final android.view.ViewGroup.LayoutParams b;
    public final ViewGroup c;

    public bg(db db1)
    {
        b = db1.getLayoutParams();
        android.view.ViewParent viewparent = db1.getParent();
        if (viewparent instanceof ViewGroup)
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(db1);
            c.removeView(db1);
            db1.a(true);
            return;
        } else
        {
            throw new bp.a("Could not get the parent of the WebView for an overlay.");
        }
    }
}
