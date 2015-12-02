// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class dsm extends DataSetObserver
{

    final dsl a;

    private dsm(dsl dsl1)
    {
        a = dsl1;
        super();
    }

    dsm(dsl dsl1, byte byte0)
    {
        this(dsl1);
    }

    public final void onChanged()
    {
        a.notifyDataSetChanged();
    }
}
