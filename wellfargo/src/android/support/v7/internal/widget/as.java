// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.widget.ab;
import android.support.v7.widget.ag;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat, az, aw

class as extends ag
{

    final aw a;
    final SpinnerCompat b;

    as(SpinnerCompat spinnercompat, View view, aw aw)
    {
        b = spinnercompat;
        a = aw;
        super(view);
    }

    public ab a()
    {
        return a;
    }

    public boolean b()
    {
        if (!SpinnerCompat.a(b).b())
        {
            SpinnerCompat.a(b).c();
        }
        return true;
    }
}
