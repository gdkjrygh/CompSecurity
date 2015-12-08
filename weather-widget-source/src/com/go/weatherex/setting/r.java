// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.text.TextUtils;
import android.widget.TextView;
import com.jiubang.core.c.j;

// Referenced classes of package com.go.weatherex.setting:
//            p

class r extends j
{

    final p a;

    public r(p p1, ContentResolver contentresolver)
    {
        a = p1;
        super(contentresolver);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
        if (cursor != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            p.a(a, cursor);
            break;
        }
        s = "";
        if (TextUtils.isEmpty(com.go.weatherex.setting.p.j(a)))
        {
            break MISSING_BLOCK_LABEL_270;
        }
        obj = new ComponentName(com.go.weatherex.setting.p.j(a).split("#")[0], com.go.weatherex.setting.p.j(a).split("#")[1]);
        obj = p.l(a).getActivityInfo(((ComponentName) (obj)), 0).loadLabel(p.k(a).getPackageManager()).toString();
_L5:
        Object obj1;
        cursor = s;
        obj1 = obj;
        if (TextUtils.isEmpty(p.m(a)))
        {
            break MISSING_BLOCK_LABEL_210;
        }
        cursor = new ComponentName(p.m(a).split("#")[0], p.m(a).split("#")[1]);
        cursor = p.l(a).getActivityInfo(cursor, 0).loadLabel(p.k(a).getPackageManager()).toString();
        obj1 = obj;
_L3:
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            p.n(a).setText(((CharSequence) (obj1)));
        }
        if (!TextUtils.isEmpty(cursor))
        {
            p.o(a).setText(cursor);
            return;
        }
          goto _L1
        cursor;
        obj = "";
_L4:
        cursor.printStackTrace();
        cursor = s;
        obj1 = obj;
          goto _L3
        cursor;
          goto _L4
        obj = "";
          goto _L5
    }
}
