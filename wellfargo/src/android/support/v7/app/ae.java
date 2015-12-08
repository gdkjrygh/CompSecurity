// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.graphics.Rect;
import android.support.v7.internal.widget.ai;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class ae
    implements ai
{

    final AppCompatDelegateImplV7 a;

    ae(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public void a(Rect rect)
    {
        rect.top = AppCompatDelegateImplV7.c(a, rect.top);
    }
}
