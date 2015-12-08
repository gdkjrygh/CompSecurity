// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;

// Referenced classes of package com.go.weatherex.g:
//            d

class f extends j
{

    private WeakReference a;

    public f(ContentResolver contentresolver, d d1)
    {
        super(contentresolver);
        a = new WeakReference(d1);
    }

    protected void a(int i, Object obj, int k)
    {
        d d1 = (d)a.get();
        if (d1 != null)
        {
            d.a(d1, i, obj, k);
        }
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        d d1 = (d)a.get();
        if (d1 != null)
        {
            d.a(d1, i, obj, cursor);
        }
    }

    protected void a(int i, Object obj, Uri uri)
    {
        d d1 = (d)a.get();
        if (d1 != null)
        {
            d.a(d1, i, obj, uri);
        }
    }
}
