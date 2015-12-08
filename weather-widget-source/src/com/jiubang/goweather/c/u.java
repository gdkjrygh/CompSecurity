// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.goweather.c:
//            i

public class u
{

    public static List a(Context context, String s, int j)
    {
        Object obj;
        Object obj1;
        String s1;
        obj1 = null;
        ArrayList arraylist = new ArrayList();
        String s2;
        String s3;
        String s4;
        try
        {
            context = i.a(context, j);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = null;
            context = ((Context) (obj1));
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            context = null;
            s = null;
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        s = context.rawQuery("select * from city where name like ? or pinyin like ?", new String[] {
            (new StringBuilder()).append(s).append("%").toString(), (new StringBuilder()).append(s).append("%").toString()
        });
        obj = s;
        if (s == null) goto _L4; else goto _L3
_L3:
        obj = s;
        if (!s.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s.getString(s.getColumnIndex("name"));
        s3 = s.getString(s.getColumnIndex("posID"));
        s1 = s.getString(s.getColumnIndex("parent"));
        obj = s.getString(s.getColumnIndex("root"));
        s4 = s.getString(s.getColumnIndex("timeZone"));
        if (Integer.parseInt(s.getString(s.getColumnIndex("_id"))) <= 5000)
        {
            obj1 = "\u4E2D\u56FD";
        } else
        {
            obj1 = obj;
            obj = s1;
        }
        arraylist.add(new CityBean(s3, s2, ((String) (obj)), ((String) (obj1)), s4, (new StringBuilder()).append(s2).append(", ").append(((String) (obj))).toString()));
        if (true) goto _L3; else goto _L4
        obj;
_L9:
        ((Exception) (obj)).printStackTrace();
        if (s != null)
        {
            s.close();
        }
        if (context != null && context.isOpen())
        {
            context.close();
        }
_L6:
        return arraylist;
_L7:
        if (s != null)
        {
            s.close();
        }
        if (context != null && context.isOpen())
        {
            context.close();
        }
        throw obj;
_L2:
        obj = null;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (context == null || !context.isOpen()) goto _L6; else goto _L5
_L5:
        context.close();
        return arraylist;
        obj;
        s = null;
          goto _L7
        obj;
          goto _L7
        obj;
          goto _L7
        obj;
        s = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static List a(Context context, String s, int j, List list)
    {
        Object obj1;
        String s1;
        obj1 = null;
        Object obj;
        String s2;
        String s3;
        String s4;
        if (list == null)
        {
            obj = new ArrayList();
        } else
        {
            list.clear();
            obj = list;
        }
        try
        {
            context = i.a(context, j);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            s = null;
            context = ((Context) (obj1));
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            context = null;
            s = null;
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        s = context.rawQuery("select * from city where parent like ?", new String[] {
            (new StringBuilder()).append(s).append("%").toString()
        });
        list = s;
        if (s == null) goto _L4; else goto _L3
_L3:
        list = s;
        if (!s.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s.getString(s.getColumnIndex("name"));
        s3 = s.getString(s.getColumnIndex("posID"));
        s1 = s.getString(s.getColumnIndex("parent"));
        list = s.getString(s.getColumnIndex("root"));
        s4 = s.getString(s.getColumnIndex("timeZone"));
        if (Integer.parseInt(s.getString(s.getColumnIndex("_id"))) <= 5000)
        {
            obj1 = "\u4E2D\u56FD";
        } else
        {
            obj1 = list;
            list = s1;
        }
        ((List) (obj)).add(new CityBean(s3, s2, list, ((String) (obj1)), s4, (new StringBuilder()).append(s2).append(", ").append(list).toString()));
        if (true) goto _L3; else goto _L4
        list;
_L9:
        list.printStackTrace();
        if (s != null)
        {
            s.close();
        }
        if (context != null && context.isOpen())
        {
            context.close();
        }
_L6:
        return ((List) (obj));
_L7:
        if (s != null)
        {
            s.close();
        }
        if (context != null && context.isOpen())
        {
            context.close();
        }
        throw list;
_L2:
        list = null;
_L4:
        if (list != null)
        {
            list.close();
        }
        if (context == null || !context.isOpen()) goto _L6; else goto _L5
_L5:
        context.close();
        return ((List) (obj));
        list;
        s = null;
          goto _L7
        list;
          goto _L7
        list;
          goto _L7
        list;
        s = null;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
