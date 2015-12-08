// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.jiubang.core.c.j;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            j, e

class h extends j
{

    final e a;

    public h(e e1, ContentResolver contentresolver)
    {
        a = e1;
        super(contentresolver);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
        obj = (com.gau.go.launcherex.gowidget.language.j)obj;
        e.a(a, cursor);
        e.d(a);
        ((com.gau.go.launcherex.gowidget.language.j) (obj)).e();
    }

    protected void a(int i, Object obj, ContentProviderResult acontentproviderresult[])
    {
        super.a(i, obj, acontentproviderresult);
        switch (i)
        {
        default:
            return;

        case 2: // '\002'
            e.e(a);
            break;
        }
        f.a(e.a(a)).i();
    }
}
