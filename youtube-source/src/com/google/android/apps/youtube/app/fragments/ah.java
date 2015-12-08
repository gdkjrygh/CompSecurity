// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.BatchEntry;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ag

final class ah
    implements b
{

    final ag a;

    ah(ag ag1)
    {
        a = ag1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a.a.a(a.b, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj1 = (List)obj1;
        obj = new ArrayList();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((BatchEntry)((Iterator) (obj1)).next()).a)) { }
        a.a.a(a.b, new Page(((List) (obj)).size(), ((List) (obj)).size(), 0, null, null, ((List) (obj))));
    }
}
