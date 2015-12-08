// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fm, fp, fq

final class fn
    implements b
{

    final fm a;

    fn(fm fm1)
    {
        a = fm1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        if (fm.a(a) != null)
        {
            fm.a(a).h_();
        }
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Page)obj1;
        fq fq1;
        for (obj1 = a.e.iterator(); ((Iterator) (obj1)).hasNext(); a.a(fq1, ((Page) (obj))))
        {
            fq1 = (fq)((Iterator) (obj1)).next();
        }

        if (fm.a(a) != null)
        {
            fm.a(a).b(((Page) (obj)).totalResults);
        }
    }
}
