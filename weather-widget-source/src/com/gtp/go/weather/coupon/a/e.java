// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.a;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.coupon.b.b;
import com.gtp.go.weather.coupon.c.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.coupon.a:
//            k, g, j, h, 
//            i

public class e
{

    private Context a;
    private com.jiubang.core.c.a.b b;
    private h c;

    public e(Context context)
    {
        a = context;
    }

    static Context a(e e1)
    {
        return e1.a;
    }

    public static ArrayList a(Context context, String as[], String s, String as1[])
    {
        ArrayList arraylist = new ArrayList();
        context = context.getContentResolver().query(WeatherContentProvider.C, as, s, as1, null);
        if (context != null)
        {
            if (context.moveToFirst())
            {
                int l = context.getColumnCount();
                do
                {
                    as = new b();
                    int i = 0;
                    while (i < l) 
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
                        if (s.equals("shop_name"))
                        {
                            as.g(context.getString(i));
                        } else
                        if (s.equals("coupon_type"))
                        {
                            as.a(context.getInt(i));
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

    static void a(e e1, ArrayList arraylist, ArrayList arraylist1)
    {
        e1.a(arraylist, arraylist1);
    }

    private void a(ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null && !arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist3;
        ContentValues contentvalues;
        arraylist3 = new ArrayList();
        contentvalues = new ContentValues();
        if (arraylist1 != null) goto _L4; else goto _L3
_L3:
        arraylist = arraylist.iterator();
        do
        {
            do
            {
                if (!arraylist.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                arraylist1 = (b)arraylist.next();
            } while (arraylist1 == null);
            contentvalues.clear();
            contentvalues.put("coupon_id", Long.valueOf(arraylist1.b()));
            contentvalues.put("source_coupon_id", Long.valueOf(arraylist1.c()));
            contentvalues.put("title", arraylist1.d());
            contentvalues.put("desc", arraylist1.e());
            contentvalues.put("shop_name", arraylist1.m());
            contentvalues.put("coupon_type", Integer.valueOf(arraylist1.f()));
            contentvalues.put("exp_time", arraylist1.g());
            contentvalues.put("code", arraylist1.h());
            contentvalues.put("logo_url", arraylist1.i());
            if (!TextUtils.isEmpty(arraylist1.i()))
            {
                String s = com.gtp.go.weather.coupon.c.a.a(arraylist1.i());
                if (!TextUtils.isEmpty(s))
                {
                    arraylist1.f(s);
                    contentvalues.put("logo_path", s);
                    if ((new File(s)).exists())
                    {
                        arraylist1.b(true);
                    }
                }
            }
            arraylist3.add(ContentProviderOperation.newInsert(WeatherContentProvider.C).withValues(contentvalues).build());
        } while (true);
_L4:
        ArrayList arraylist2;
        arraylist2 = new ArrayList();
        arraylist = arraylist.iterator();
_L5:
        boolean flag;
        if (!arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_543;
        }
        b b1 = (b)arraylist.next();
        Iterator iterator = arraylist1.iterator();
        b b2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_537;
            }
            b2 = (b)iterator.next();
        } while (b2.b() != b1.b());
        contentvalues.clear();
        if (!b2.g().equals(b1.g()))
        {
            b2.c(b1.g());
            contentvalues.put("exp_time", b1.g());
        }
        if (!b2.e().equals(b1.e()))
        {
            b2.b(b1.e());
            contentvalues.put("desc", b1.e());
        }
        if (contentvalues.size() > 0)
        {
            arraylist3.add(ContentProviderOperation.newUpdate(WeatherContentProvider.C).withValues(contentvalues).withSelection("coupon_id=?", new String[] {
                String.valueOf(b2.b())
            }).build());
            flag = true;
        } else
        {
            flag = true;
        }
_L7:
        if (!flag)
        {
            arraylist2.add(b1);
        }
          goto _L5
        if (arraylist3 == null || arraylist3.isEmpty()) goto _L1; else goto _L6
_L6:
        try
        {
            a.getContentResolver().applyBatch("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            if (com.gtp.a.a.b.c.a())
            {
                arraylist.printStackTrace();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            if (com.gtp.a.a.b.c.a())
            {
                arraylist.printStackTrace();
                return;
            }
        }
          goto _L1
        flag = false;
          goto _L7
        arraylist = arraylist2;
          goto _L3
    }

    static h b(e e1)
    {
        return e1.c;
    }

    static com.jiubang.core.c.a.b c(e e1)
    {
        return e1.b;
    }

    public void a()
    {
        (new k(this, null)).execute(new Object[0]);
    }

    public void a(int i, ArrayList arraylist)
    {
        (new g(this, i, arraylist)).execute(new Object[0]);
    }

    public void a(h h)
    {
        c = h;
    }

    public void a(com.jiubang.core.c.a.b b1)
    {
        b = b1;
    }

    public void a(String s, long l, i i)
    {
        (new j(this, s, l, i)).execute(new Object[0]);
    }

    public void b()
    {
        if (c != null)
        {
            c = null;
        }
    }
}
