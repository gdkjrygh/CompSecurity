// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.go.weatherex.home.b:
//            h

final class j extends android.graphics.drawable.Drawable.ConstantState
{

    int a;
    int b;
    int c;

    j(j j1)
    {
        if (j1 != null)
        {
            a = j1.a;
            b = j1.b;
            c = j1.c;
        }
    }

    public int getChangingConfigurations()
    {
        return c;
    }

    public Drawable newDrawable()
    {
        return new h(this, null);
    }

    public Drawable newDrawable(Resources resources)
    {
        return new h(this, null);
    }
}
