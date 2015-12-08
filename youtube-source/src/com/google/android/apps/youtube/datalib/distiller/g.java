// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;
import com.google.android.apps.youtube.datalib.distiller.model.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller:
//            i

public abstract class g extends i
{

    private com.google.android.apps.youtube.datalib.distiller.model.c a;

    public g()
    {
    }

    public final void a(com.google.android.apps.youtube.datalib.distiller.model.c c1)
    {
        a = (com.google.android.apps.youtube.datalib.distiller.model.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
    }

    protected final void c()
    {
        boolean flag;
        if ((a instanceof TopLevelComment) || (a instanceof b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
    }

    public final String d()
    {
        if (a instanceof TopLevelComment)
        {
            return (new StringBuilder("activities/")).append(((TopLevelComment)a).k()).toString();
        } else
        {
            return (new StringBuilder("comments/")).append(((b)a).b()).toString();
        }
    }
}
