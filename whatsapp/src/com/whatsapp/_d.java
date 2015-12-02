// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            aq

final class _d
    implements com.actionbarsherlock.widget.SearchView.OnQueryTextListener
{

    final aq a;

    _d(aq aq1)
    {
        a = aq1;
        super();
    }

    public boolean onQueryTextChange(String s)
    {
        return a.a(s);
    }

    public boolean onQueryTextSubmit(String s)
    {
        return false;
    }
}
