// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Page;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            al, f

final class am
    implements b
{

    final f a;
    final Activity b;
    final al c;

    am(al al1, f f, Activity activity)
    {
        c = al1;
        a = f;
        b = activity;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        al.a(c, exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Page)obj1;
        if (((Page) (obj)).totalResults == 1)
        {
            al.a(c, "No +Page Delegate");
            al.a(c, a);
            return;
        } else
        {
            al.a(c, ((Page) (obj)));
            al.a(c, b, a, ((Page) (obj)).entries);
            return;
        }
    }
}
