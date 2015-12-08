// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            x, au, ar

final class av
    implements x
{

    final ar a;
    final au b;

    av(au au1, ar ar1)
    {
        b = au1;
        a = ar1;
        super();
    }

    public final void a(View view, int i)
    {
        b.b.a(i);
        if (b.b.t != null)
        {
            b.b.a(view, i, au.a(b).getItemId(i));
        }
        b.d();
    }
}
