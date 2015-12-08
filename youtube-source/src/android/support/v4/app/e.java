// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            k, Fragment

final class e
    implements k
{

    final Fragment a;

    e(Fragment fragment)
    {
        a = fragment;
        super();
    }

    public final View a(int i)
    {
        if (a.R == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.R.findViewById(i);
        }
    }
}
