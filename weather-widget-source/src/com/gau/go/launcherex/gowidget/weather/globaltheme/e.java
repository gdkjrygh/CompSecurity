// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme:
//            d

class e extends j
{

    private WeakReference a;

    public e(ContentResolver contentresolver, d d1)
    {
        super(contentresolver);
        a = new WeakReference(d1);
    }

    protected void a(int i, Object obj, int k)
    {
        d d1;
        d1 = (d)a.get();
        break MISSING_BLOCK_LABEL_12;
        while (true) 
        {
            do
            {
                return;
            } while (d1 == null || k <= 0);
            switch (i)
            {
            default:
                return;

            case 1: // '\001'
                if (obj instanceof SparseArray)
                {
                    obj = (SparseArray)obj;
                    i = ((SparseArray) (obj)).keyAt(0);
                    obj = ((SparseArray) (obj)).valueAt(0);
                    if (obj instanceof b)
                    {
                        d.a(d1, i, (b)obj);
                        com.gau.go.launcherex.gowidget.weather.globaltheme.d.b(d1, i, (b)obj);
                        return;
                    }
                }
                break;

            case 2: // '\002'
                obj = ((Object) ((Object[])(Object[])obj));
                d.c(d1, ((Integer)obj[0]).intValue(), (b)obj[1]);
                return;

            case 3: // '\003'
                obj = ((Object) ((Object[])(Object[])obj));
                d.d(d1, ((Integer)obj[0]).intValue(), (b)obj[1]);
                return;
            }
        }
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
    }

    protected void a(int i, Object obj, Uri uri)
    {
        super.a(i, obj, uri);
    }

    protected void b(int i, Object obj, int k)
    {
        super.b(i, obj, k);
    }
}
