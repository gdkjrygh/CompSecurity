// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.Filter;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            wd, CallsFragment, e7

class a9b
    implements wd
{

    final CallsFragment a;

    a9b(CallsFragment callsfragment)
    {
        a = callsfragment;
        super();
    }

    public void a()
    {
        CallsFragment.f(a).getFilter().filter(CallsFragment.c(a));
    }

    public void a(String s)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
        CallsFragment.f(a).notifyDataSetChanged();
    }
}
