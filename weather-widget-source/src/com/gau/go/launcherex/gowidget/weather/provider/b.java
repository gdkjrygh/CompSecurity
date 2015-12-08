// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.provider;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.ArrayList;
import java.util.List;

public class b
{

    public static List a(Context context, String s)
    {
        Context context1;
        Context context2;
        Object obj1;
        Object obj2;
        StringBuilder stringbuilder;
        ArrayList arraylist;
        context1 = null;
        context2 = null;
        stringbuilder = null;
        obj1 = null;
        obj2 = null;
        arraylist = new ArrayList();
        context = r.b(context, "city", 0x7f06001f);
        context1 = context;
        if (context1 == null)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        context2 = context1;
        context = stringbuilder;
        s = context1.rawQuery("select * from city where city like ?", new String[] {
            (new StringBuilder()).append(s).append("%").toString()
        });
        obj2 = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        obj2 = s;
        context2 = context1;
        context = s;
        obj1 = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_470;
        }
_L2:
        context2 = context1;
        context = s;
        obj1 = s;
        obj2 = new CityBean();
        context2 = context1;
        context = s;
        obj1 = s;
        ((CityBean) (obj2)).b(s.getString(s.getColumnIndex("city")));
        context2 = context1;
        context = s;
        obj1 = s;
        ((CityBean) (obj2)).a(s.getString(s.getColumnIndex("posID")));
        context2 = context1;
        context = s;
        obj1 = s;
        ((CityBean) (obj2)).d(s.getString(s.getColumnIndex("province")));
        context2 = context1;
        context = s;
        obj1 = s;
        ((CityBean) (obj2)).c(s.getString(s.getColumnIndex("country")));
        context2 = context1;
        context = s;
        obj1 = s;
        ((CityBean) (obj2)).e(s.getString(s.getColumnIndex("timeZone")));
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder = new StringBuilder();
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder.append(((CityBean) (obj2)).b());
        context2 = context1;
        context = s;
        obj1 = s;
        if (TextUtils.isEmpty(((CityBean) (obj2)).d()))
        {
            break MISSING_BLOCK_LABEL_332;
        }
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder.append(", ");
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder.append(((CityBean) (obj2)).d());
        context2 = context1;
        context = s;
        obj1 = s;
        if (TextUtils.isEmpty(((CityBean) (obj2)).c()))
        {
            break MISSING_BLOCK_LABEL_413;
        }
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder.append(", ");
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder.append("(");
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder.append(((CityBean) (obj2)).c());
        context2 = context1;
        context = s;
        obj1 = s;
        stringbuilder.append(")");
        context2 = context1;
        context = s;
        obj1 = s;
        ((CityBean) (obj2)).f(stringbuilder.toString());
        context2 = context1;
        context = s;
        obj1 = s;
        arraylist.add(obj2);
        context2 = context1;
        context = s;
        obj1 = s;
        boolean flag = s.moveToNext();
        if (flag) goto _L2; else goto _L1
_L1:
        obj2 = s;
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
        }
        if (context1 == null || !context1.isOpen()) goto _L4; else goto _L3
_L3:
        context1.close();
_L4:
        return arraylist;
        s;
        context = null;
        obj1 = context1;
        context1 = context;
_L7:
        context2 = context1;
        context = ((Context) (obj1));
        s.printStackTrace();
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        if (context1 == null || !context1.isOpen()) goto _L4; else goto _L3
        s;
        Object obj = null;
        context = context2;
        context2 = obj;
_L6:
        if (context != null)
        {
            context.close();
        }
        if (context2 != null && context2.isOpen())
        {
            context2.close();
        }
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        s;
          goto _L7
    }
}
