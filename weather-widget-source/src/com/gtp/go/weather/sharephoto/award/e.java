// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.ContentValues;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gtp.go.weather.sharephoto.b.a;
import com.gtp.go.weather.sharephoto.b.b;
import com.gtp.go.weather.sharephoto.b.d;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            u, c, i

class e extends AsyncTask
{

    final b a;
    final c b;

    e(c c1, b b1)
    {
        b = c1;
        a = b1;
        super();
    }

    protected transient b a(b ab[])
    {
        Object obj = ab[0];
        ab = new b();
        ab.a(((b) (obj)).a());
        ab.b(((b) (obj)).b());
        a a1 = new a();
        a1.a(((b) (obj)).d().a());
        ab.a(a1);
        com.gtp.go.weather.sharephoto.award.u.a(a1);
        if (!TextUtils.isEmpty(a1.b()))
        {
            long l = c.e(b).a();
            long l1 = ((b) (obj)).a();
            obj = new ContentValues();
            ((ContentValues) (obj)).put("apk_pic_path", a1.b());
            com.gtp.go.weather.sharephoto.b.a.b.a(c.f(b), ((ContentValues) (obj)), "user_award_id=? and award_id=?", new String[] {
                String.valueOf(l), String.valueOf(l1)
            });
        }
        return ab;
    }

    protected void a(b b1)
    {
        c.g(b).remove(a.d().a());
        if (a.a() == b1.a() && a.b() == b1.b())
        {
            a.d().b(b1.d().b());
            com.gtp.go.weather.sharephoto.award.c.d(b).notifyDataSetChanged();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((b[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((b)obj);
    }
}
