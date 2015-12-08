// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            x

final class y
    implements b
{

    private final x a;
    private final FragmentActivity b;

    public y(x x1, FragmentActivity fragmentactivity)
    {
        a = x1;
        b = fragmentactivity;
    }

    public final void a(Object obj, Exception exception)
    {
        obj = b.getString(p.bv);
        Toast.makeText(b, ((CharSequence) (obj)), 1).show();
    }

    public final volatile void a(Object obj, Object obj1)
    {
        if (a != null)
        {
            a.a();
        }
    }
}
