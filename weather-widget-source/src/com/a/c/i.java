// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

// Referenced classes of package com.a.c:
//            c

class i extends c
{

    private final WeakReference a;

    i(View view)
    {
        a = new WeakReference(view.animate());
    }

    public c a(float f)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.scaleX(f);
        }
        return this;
    }

    public c a(long l)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.setDuration(l);
        }
        return this;
    }

    public void a()
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.start();
        }
    }

    public c b(float f)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.scaleY(f);
        }
        return this;
    }
}
