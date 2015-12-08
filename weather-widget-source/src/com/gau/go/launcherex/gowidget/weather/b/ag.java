// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ae

class ag extends j
{

    private WeakReference a;

    public ag(ContentResolver contentresolver, ae ae1)
    {
        super(contentresolver);
        a = new WeakReference(ae1);
    }

    protected void a(int i, Object obj, int k)
    {
        ae ae1 = (ae)a.get();
        if (ae1 != null)
        {
            ae.a(ae1, i, obj, k);
        }
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        ae ae1 = (ae)a.get();
        if (ae1 != null)
        {
            ae.a(ae1, i, obj, cursor);
        }
    }

    protected void a(int i, Object obj, Uri uri)
    {
        ae ae1 = (ae)a.get();
        if (ae1 != null)
        {
            ae.a(ae1, i, obj, uri);
        }
    }
}
