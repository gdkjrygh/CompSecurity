// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;


// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            a

final class b
    implements android.widget.SearchView.OnQueryTextListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final boolean onQueryTextChange(String s)
    {
        return false;
    }

    public final boolean onQueryTextSubmit(String s)
    {
        return com.google.android.apps.youtube.app.honeycomb.ui.a.a(a, s);
    }
}
