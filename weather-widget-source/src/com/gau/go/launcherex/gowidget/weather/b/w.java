// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentValues;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.d;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            v

class w
    implements d
{

    final ContentValues a;
    final c b;
    final v c;

    w(v v1, ContentValues contentvalues, c c1)
    {
        c = v1;
        a = contentvalues;
        b = c1;
        super();
    }

    public void a()
    {
        v.a(c, a);
        b.b(this);
    }
}
