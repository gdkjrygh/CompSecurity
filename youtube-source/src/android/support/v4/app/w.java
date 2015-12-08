// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.widget.ListView;

// Referenced classes of package android.support.v4.app:
//            ListFragment

final class w
    implements Runnable
{

    final ListFragment a;

    w(ListFragment listfragment)
    {
        a = listfragment;
        super();
    }

    public final void run()
    {
        a.b.focusableViewAvailable(a.b);
    }
}
