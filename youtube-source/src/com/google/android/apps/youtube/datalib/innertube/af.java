// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.text.TextUtils;
import com.google.a.a.a.a.ma;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class af extends b
{

    private Collection c;
    private String d;

    public af(p p)
    {
        super(p);
        c = new ArrayList();
        d = "";
        a(new byte[0]);
    }

    public final af a(String s)
    {
        d = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    public final af a(Collection collection)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(collection);
        c = collection;
        return this;
    }

    protected final void c()
    {
        if (TextUtils.isEmpty(d))
        {
            boolean flag;
            if (!c.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.b(flag);
            return;
        } else
        {
            com.google.android.apps.youtube.common.fromguava.c.a(d);
            return;
        }
    }

    public final String e()
    {
        return "player/refresh";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        ma ma1 = new ma();
        ma1.b = d();
        ma1.d = d;
        ma1.c = (com.google.a.a.a.a.mm[])c.toArray(ma1.c);
        return ma1;
    }
}
