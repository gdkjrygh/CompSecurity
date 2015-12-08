// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.ContentResolver;
import android.database.Cursor;
import com.gtp.go.weather.sharephoto.b.a.b;
import com.gtp.go.weather.sharephoto.b.a.c;
import com.gtp.go.weather.sharephoto.b.d;
import com.gtp.go.weather.sharephoto.b.k;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            k

class n extends j
{

    private WeakReference a;

    public n(ContentResolver contentresolver, com.gtp.go.weather.sharephoto.award.k k1)
    {
        super(contentresolver);
        a = new WeakReference(k1);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        com.gtp.go.weather.sharephoto.award.k k1 = (com.gtp.go.weather.sharephoto.award.k)a.get();
        if (k1 == null)
        {
            return;
        }
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            obj = new ArrayList();
            if (cursor != null)
            {
                if (cursor.moveToFirst())
                {
                    do
                    {
                        ((List) (obj)).add(c.a(cursor));
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
            k.a(k1, ((List) (obj)));
            return;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList();
            if (cursor != null)
            {
                if (cursor.moveToFirst())
                {
                    do
                    {
                        arraylist.add(b.a(cursor));
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
            k.a(k1, (d)obj, arraylist);
            return;

        case 3: // '\003'
            obj = new ArrayList();
            break;
        }
        if (cursor != null)
        {
            if (cursor.moveToFirst())
            {
                do
                {
                    ((List) (obj)).add(k.a(cursor));
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        com.gtp.go.weather.sharephoto.award.k.b(k1, ((List) (obj)));
    }
}
