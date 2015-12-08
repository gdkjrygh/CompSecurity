// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.net.Uri;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.e.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
{

    private final b a;
    private final Set b = new HashSet();

    public a(b b1)
    {
        a = b1;
    }

    private void b(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Uri uri = (Uri)list.next();
            if (uri != null)
            {
                Object obj = a;
                obj = com.google.android.apps.youtube.datalib.e.b.a("adtracking", 0x323467f);
                ((f) (obj)).a(uri);
                ((f) (obj)).a(false);
                a.a(((f) (obj)), com.google.android.apps.youtube.datalib.a.b.b);
            }
        } while (true);
    }

    public final void a(String s, List list)
    {
        if (b.contains(s))
        {
            return;
        } else
        {
            b(list);
            b.add(s);
            return;
        }
    }

    public final void a(List list)
    {
        b(list);
    }
}
