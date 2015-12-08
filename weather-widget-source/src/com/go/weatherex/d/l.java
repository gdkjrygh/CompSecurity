// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.content.ContentResolver;
import android.database.Cursor;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;

// Referenced classes of package com.go.weatherex.d:
//            a, e

class l extends j
{

    private WeakReference a;

    public l(ContentResolver contentresolver, a a1)
    {
        super(contentresolver);
        a = new WeakReference(a1);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        for (obj = (a)a.get(); obj == null || cursor == null || cursor.getCount() < 1;)
        {
            return;
        }

        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            obj.getClass();
            break;
        }
        com.go.weatherex.d.a.a(((a) (obj)), new e(((a) (obj)), com.go.weatherex.d.a.a(((a) (obj)), cursor)));
        com.go.weatherex.d.a.p(((a) (obj)));
    }
}
