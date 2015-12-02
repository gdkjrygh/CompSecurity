// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;

public final class mh
{

    public final int a;
    public final android.view.ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public mh(akk akk1)
    {
        b = akk1.getLayoutParams();
        android.view.ViewParent viewparent = akk1.getParent();
        d = akk1.e();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(akk1.a());
            c.removeView(akk1.a());
            akk1.a(true);
            return;
        } else
        {
            throw new mf("Could not get the parent of the WebView for an overlay.");
        }
    }
}
