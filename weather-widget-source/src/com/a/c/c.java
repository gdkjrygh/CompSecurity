// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package com.a.c:
//            i, d, j

public abstract class c
{

    private static final WeakHashMap a = new WeakHashMap(0);

    public c()
    {
    }

    public static c a(View view)
    {
        c c1 = (c)a.get(view);
        Object obj = c1;
        if (c1 == null)
        {
            int k = Integer.valueOf(android.os.Build.VERSION.SDK).intValue();
            if (k >= 14)
            {
                obj = new i(view);
            } else
            if (k >= 11)
            {
                obj = new d(view);
            } else
            {
                obj = new j(view);
            }
            a.put(view, obj);
        }
        return ((c) (obj));
    }

    public abstract c a(float f);

    public abstract c a(long l);

    public abstract void a();

    public abstract c b(float f);

}
