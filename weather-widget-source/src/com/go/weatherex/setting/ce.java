// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.TextView;
import com.jiubang.core.c.j;

// Referenced classes of package com.go.weatherex.setting:
//            cc

class ce extends j
{

    final cc a;

    public ce(cc cc1, ContentResolver contentresolver)
    {
        a = cc1;
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
            cc.a(a, cursor);
            break;
        }
        s = "";
        if (TextUtils.isEmpty(com.go.weatherex.setting.cc.j(a)))
        {
            break MISSING_BLOCK_LABEL_270;
        }
        obj = new ComponentName(com.go.weatherex.setting.cc.j(a).split("#")[0], com.go.weatherex.setting.cc.j(a).split("#")[1]);
        obj = cc.k(a).getActivityInfo(((ComponentName) (obj)), 0).loadLabel(a.getActivity().getPackageManager()).toString();
_L5:
        Object obj1;
        cursor = s;
        obj1 = obj;
        if (TextUtils.isEmpty(cc.l(a)))
        {
            break MISSING_BLOCK_LABEL_210;
        }
        cursor = new ComponentName(cc.l(a).split("#")[0], cc.l(a).split("#")[1]);
        cursor = cc.k(a).getActivityInfo(cursor, 0).loadLabel(a.getActivity().getPackageManager()).toString();
        obj1 = obj;
_L3:
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            cc.m(a).setText(((CharSequence) (obj1)));
        }
        if (!TextUtils.isEmpty(cursor))
        {
            cc.n(a).setText(cursor);
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
