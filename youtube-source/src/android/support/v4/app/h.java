// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            k, FragmentActivity

final class h
    implements k
{

    final FragmentActivity a;

    h(FragmentActivity fragmentactivity)
    {
        a = fragmentactivity;
        super();
    }

    public final View a(int i)
    {
        return a.findViewById(i);
    }
}
