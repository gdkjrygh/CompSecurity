// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//            ab, ac

class ak extends DataSetObserver
{

    final ab a;

    private ak(ab ab1)
    {
        a = ab1;
        super();
    }

    ak(ab ab1, ac ac)
    {
        this(ab1);
    }

    public void onChanged()
    {
        if (a.b())
        {
            a.c();
        }
    }

    public void onInvalidated()
    {
        a.a();
    }
}
