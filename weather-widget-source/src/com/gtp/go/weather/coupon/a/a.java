// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.coupon.b.b;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            d, c, b

public class a
{

    private static volatile a a;
    private Context b;

    private a(Context context)
    {
        b = context.getApplicationContext();
    }

    static Context a(a a1)
    {
        return a1.b;
    }

    public static a a(Context context)
    {
        if (a == null)
        {
            a = new a(context);
        }
        return a;
    }

    public static ArrayList a(Context context, String as[], String s, String as1[])
    {
        ArrayList arraylist = new ArrayList();
        context = context.getContentResolver().query(WeatherContentProvider.D, as, s, as1, null);
        if (context != null)
        {
            if (context.moveToFirst())
            {
                int j = context.getColumnCount();
                do
                {
                    as = new b();
                    int i = 0;
                    while (i < j) 
                    {
                        s = context.getColumnName(i);
                        if (s.equals("coupon_id"))
                        {
                            as.a(context.getLong(i));
                        } else
                        if (s.equals("source_coupon_id"))
                        {
                            as.b(context.getLong(i));
                        } else
                        if (s.equals("title"))
                        {
                            as.a(context.getString(i));
                        } else
                        if (s.equals("desc"))
                        {
                            as.b(context.getString(i));
                        } else
                        if (s.equals("coupon_type"))
                        {
                            as.a(context.getInt(i));
                        } else
                        if (s.equals("shop_name"))
                        {
                            as.g(context.getString(i));
                        } else
                        if (s.equals("exp_time"))
                        {
                            as.c(context.getString(i));
                        } else
                        if (s.equals("code"))
                        {
                            as.d(context.getString(i));
                        } else
                        if (s.equals("logo_url"))
                        {
                            as.e(context.getString(i));
                        } else
                        if (s.equals("logo_path"))
                        {
                            as.f(context.getString(i));
                        }
                        i++;
                    }
                    arraylist.add(as);
                } while (context.moveToNext());
            }
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return arraylist;
            }
        }
        return arraylist;
    }

    static ArrayList a(a a1, ArrayList arraylist)
    {
        return a1.b(arraylist);
    }

    private void a(LinkedList linkedlist, b b1)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i <= linkedlist.size())
                {
                    if (i != linkedlist.size())
                    {
                        break label0;
                    }
                    linkedlist.add(b1);
                }
                return;
            }
            if (com.gtp.go.weather.coupon.c.a.a(((b)linkedlist.get(i)).g(), b1.g()))
            {
                linkedlist.add(i, b1);
                return;
            }
            i++;
        } while (true);
    }

    private ArrayList b(ArrayList arraylist)
    {
        LinkedList linkedlist = new LinkedList();
        ArrayList arraylist1 = new ArrayList();
        int i = arraylist.size() - 1;
        while (i >= 0) 
        {
            if (com.gtp.go.weather.coupon.c.a.c(((b)arraylist.get(i)).g()))
            {
                a(linkedlist, (b)arraylist.get(i));
            } else
            {
                arraylist1.add(arraylist.get(i));
            }
            i--;
        }
        arraylist1.addAll(linkedlist);
        return arraylist1;
    }

    public void a(com.gtp.go.weather.coupon.a a1)
    {
        (new d(this, a1)).execute(new Object[0]);
    }

    public void a(b b1)
    {
        if (b1 == null)
        {
            return;
        } else
        {
            (new c(this, b1)).execute(new Object[0]);
            return;
        }
    }

    public void a(ArrayList arraylist)
    {
        long al[] = new long[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++)
        {
            al[i] = ((Long)arraylist.get(i)).longValue();
        }

        (new com.gtp.go.weather.coupon.a.b(this, arraylist)).execute(new Object[0]);
        arraylist = new Intent();
        arraylist.setAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_COUPON_DELETE");
        arraylist.putExtra("extra_coupon_delete_id", al);
        b.sendBroadcast(arraylist);
    }
}
