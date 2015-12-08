// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae

final class w
    implements ae
{

    private final View a;
    private final List b;

    public w(View view, List list)
    {
        a = view;
        b = list;
    }

    public final View a(int i, Object obj)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ae)iterator.next()).a(i, obj)) { }
        return a;
    }
}
