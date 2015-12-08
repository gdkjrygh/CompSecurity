// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            ah, GDataRequest, af

final class ai
    implements b
{

    final ah a;
    private final GDataRequest b;
    private final b c;
    private final List d = Collections.synchronizedList(new ArrayList());

    public ai(ah ah1, GDataRequest gdatarequest, b b1)
    {
        a = ah1;
        super();
        b = gdatarequest;
        c = b1;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        c.a(b, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Page)obj1;
        d.addAll(((Page) (obj)).entries);
        if (((Page) (obj)).nextUri != null)
        {
            ah.a(a).a(b.b(((Page) (obj)).nextUri), this);
            return;
        } else
        {
            c.a(b, new ArrayList(d));
            return;
        }
    }
}
