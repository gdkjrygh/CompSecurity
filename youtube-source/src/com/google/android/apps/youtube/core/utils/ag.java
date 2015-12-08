// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.o;
import com.google.android.youtube.p;
import java.util.Date;

public final class ag
{

    public static int a(String s)
    {
        int l = 0;
        String as[] = s.split(":");
        int j = as.length;
        Object obj;
        int i;
        int k;
        int i1;
        if (j == 0)
        {
            obj = s;
        } else
        {
            obj = as[j - 1];
        }
        if (j >= 2)
        {
            try
            {
                i = Integer.parseInt(as[j - 2]);
            }
            catch (NumberFormatException numberformatexception1)
            {
                L.b((new StringBuilder("error parsing minutes: ")).append(s).toString());
                i = 0;
            }
        } else
        {
            i = 0;
        }
        if (j >= 3)
        {
            try
            {
                j = Integer.parseInt(as[j - 3]);
            }
            catch (NumberFormatException numberformatexception)
            {
                L.b((new StringBuilder("error parsing hours: ")).append(s).toString());
                j = 0;
            }
        } else
        {
            j = 0;
        }
        as = ((String) (obj)).split("\\.");
        if (as.length <= 1) goto _L2; else goto _L1
_L1:
        try
        {
            k = Integer.parseInt(as[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.b((new StringBuilder("error parsing seconds: ")).append(s).toString());
            k = 0;
        }
        try
        {
            i1 = Integer.parseInt(as[1]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.b((new StringBuilder("error parsing milliseconds: ")).append(s).toString());
            continue; /* Loop/switch isn't completed */
        }
        l = i1;
_L4:
        return j * 0x36ee80 + i * 60000 + k * 1000 + l;
_L2:
        try
        {
            k = Integer.parseInt(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            L.b((new StringBuilder("error parsing seconds: ")).append(((String) (obj))).toString());
            k = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(Context context, long l, boolean flag, boolean flag1)
    {
        c.a(context);
        if (flag)
        {
            Object obj = new Date(l);
            c.a(obj);
            c.a(context);
            if (((Date) (obj)).before(new Date()))
            {
                return context.getString(p.cr, new Object[] {
                    a(((Date) (obj)), context.getResources())
                });
            }
            if (DateUtils.isToday(((Date) (obj)).getTime()))
            {
                return context.getString(p.cs, new Object[] {
                    DateUtils.formatDateTime(context, ((Date) (obj)).getTime(), 2561)
                });
            } else
            {
                String s = DateUtils.formatDateTime(context, ((Date) (obj)).getTime(), 2);
                obj = DateUtils.formatDateTime(context, ((Date) (obj)).getTime(), 2561);
                return context.getString(p.ct, new Object[] {
                    s, obj
                });
            }
        }
        if (flag1)
        {
            return context.getString(p.cn);
        } else
        {
            return context.getString(p.cp);
        }
    }

    public static String a(Date date, Resources resources)
    {
        if (date != null)
        {
            long l1 = date.getTime();
            long l2 = System.currentTimeMillis();
            if (l2 > l1)
            {
                int i = (int)((l2 - l1) / 1000L);
                int j = i / 60;
                int k = j / 60;
                int l = k / 24;
                int i1 = l / 7;
                int j1 = l / 30;
                int k1 = j1 / 12;
                if (k1 > 0)
                {
                    return resources.getQuantityString(o.n, k1, new Object[] {
                        Integer.valueOf(k1)
                    });
                }
                if (j1 > 0)
                {
                    return resources.getQuantityString(o.h, j1, new Object[] {
                        Integer.valueOf(j1)
                    });
                }
                if (i1 > 0)
                {
                    return resources.getQuantityString(o.m, i1, new Object[] {
                        Integer.valueOf(i1)
                    });
                }
                if (l > 0)
                {
                    return resources.getQuantityString(o.e, l, new Object[] {
                        Integer.valueOf(l)
                    });
                }
                if (k > 0)
                {
                    return resources.getQuantityString(o.f, k, new Object[] {
                        Integer.valueOf(k)
                    });
                }
                if (j > 0)
                {
                    return resources.getQuantityString(o.g, j, new Object[] {
                        Integer.valueOf(j)
                    });
                }
                if (i > 0)
                {
                    return resources.getQuantityString(o.k, i, new Object[] {
                        Integer.valueOf(i)
                    });
                }
            }
        }
        return null;
    }
}
