// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.jiubang.core.b.a;
import com.jiubang.playsdk.d.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.go.weatherex.themestore:
//            ac, j, k

public class i
{

    private k a;
    private Context b;
    private Map c;
    private int d;

    i(Context context)
    {
        d = 0;
        b = context.getApplicationContext();
        c = new HashMap();
    }

    static int a(i k, List list, List list1)
    {
        return k.a(list, list1);
    }

    private int a(List list, List list1)
    {
        if (list != null && list1 != null) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        return l;
_L2:
        list = list.iterator();
        int k = 0;
        do
        {
            l = k;
            if (!list.hasNext())
            {
                continue;
            }
            if (!list1.contains((String)list.next()))
            {
                k++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static k a(i k)
    {
        return k.a;
    }

    static List a(i k, int l)
    {
        return k.b(l);
    }

    static List a(i k, String s)
    {
        return k.a(s);
    }

    private List a(String s)
    {
        ArrayList arraylist;
        Object obj;
        arraylist = new ArrayList();
        obj = GoWidgetApplication.c(b).b().getString(s, "");
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        s = (List)c.get(s);
_L4:
        return s;
_L2:
        int k;
        try
        {
            obj = new JSONArray(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return arraylist;
        }
        k = 0;
        s = arraylist;
        if (k >= ((JSONArray) (obj)).length()) goto _L4; else goto _L3
_L3:
        arraylist.add(((JSONArray) (obj)).getString(k));
        k++;
        break MISSING_BLOCK_LABEL_62;
    }

    static void a(i k, List list, String s)
    {
        k.a(list, s);
    }

    private void a(List list, String s)
    {
        if (list != null)
        {
            JSONArray jsonarray = new JSONArray();
            for (list = list.iterator(); list.hasNext(); jsonarray.put((String)list.next())) { }
            list = jsonarray.toString();
            if (!TextUtils.isEmpty(list))
            {
                android.content.SharedPreferences.Editor editor = GoWidgetApplication.c(b).b().edit();
                editor.putString(s, list);
                editor.commit();
                return;
            }
        }
    }

    static int b(i k)
    {
        int l = k.d;
        k.d = l + 1;
        return l;
    }

    private List b(int k)
    {
        Object obj = ac.b(com.go.weatherex.themestore.ac.a(k));
        ArrayList arraylist = new ArrayList();
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                e e1 = (e)((Iterator) (obj)).next();
                if (e1.f() != null)
                {
                    arraylist.add(e1.f().c());
                }
            } while (true);
        }
        return arraylist;
    }

    static boolean b(i k, List list, List list1)
    {
        return k.b(list, list1);
    }

    private boolean b(List list, List list1)
    {
        boolean flag1;
        list = list.iterator();
        flag1 = false;
_L2:
        boolean flag;
        flag = flag1;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s = (String)list.next();
        Iterator iterator = list1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_83;
            }
        } while (!s.equals((String)iterator.next()));
        flag = false;
_L3:
        flag1 = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        return flag;
        flag = true;
          goto _L3
    }

    void a()
    {
        List list = b(1);
        List list1 = b(3);
        (new j(this)).execute(new Object[] {
            list, list1
        });
    }

    void a(int k)
    {
        String s = null;
        List list;
        if (k == 1)
        {
            list = b(1);
            s = "key_record_widget_theme_package_names";
        } else
        if (k == 3)
        {
            list = b(3);
            s = "key_record_background_theme_package_names";
        } else
        {
            list = null;
        }
        if (list == null)
        {
            return;
        }
        if (c != null)
        {
            c.put(s, list);
        }
        a(list, s);
    }

    public void a(k k)
    {
        a = k;
    }
}
