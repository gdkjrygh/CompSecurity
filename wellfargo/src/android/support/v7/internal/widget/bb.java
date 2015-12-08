// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            al, bd

class bb extends al
{

    private final bd a;

    public bb(Resources resources, bd bd1)
    {
        super(resources);
        a = bd1;
    }

    public Drawable getDrawable(int i)
    {
        Drawable drawable = super.getDrawable(i);
        if (drawable != null)
        {
            a.a(i, drawable);
        }
        return drawable;
    }
}
