// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class dqt
{

    private final hkr a;

    private dqt(hkr hkr1)
    {
        a = hkr1;
    }

    public static dqt a(hkr hkr1)
    {
        return new dqt(hkr1);
    }

    private Object a(dqu dqu, Object obj)
    {
        if (!d(dqu))
        {
            return obj;
        }
        obj = c(dqu);
        if (obj == null || obj.equals("null"))
        {
            return null;
        } else
        {
            return c(dqu);
        }
    }

    private static String a(String s)
    {
        s = s.split("_");
        StringBuilder stringbuilder = new StringBuilder(s[0].toLowerCase());
        for (int i = 1; i < s.length; i++)
        {
            String s1 = s[i];
            stringbuilder.append(Character.toString(s1.charAt(0)).toUpperCase());
            if (s1.length() > 1)
            {
                stringbuilder.append(s1.substring(1, s1.length()).toLowerCase());
            }
        }

        return stringbuilder.toString();
    }

    private Object c(dqu dqu)
    {
        Map map = e(dqu);
        if (map == null)
        {
            dqu = null;
        } else
        {
            String s = dqu.toString();
            Object obj = map.get(a(s));
            dqu = ((dqu) (obj));
            if (obj == null)
            {
                return map.get(s.toLowerCase());
            }
        }
        return dqu;
    }

    private boolean d(dqu dqu)
    {
        Map map = e(dqu);
        if (map != null)
        {
            if (map.containsKey(a(dqu = dqu.toString())) || map.containsKey(dqu.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }

    private Map e(dqu dqu)
    {
        Object obj = a.a();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((Map) (obj));
_L2:
        String as[] = dqu.getClass().getName().split("\\$");
        int i = 1;
        dqu = ((dqu) (obj));
        do
        {
            obj = dqu;
            if (i >= as.length)
            {
                continue;
            }
            obj = as[i];
            StringBuilder stringbuilder = new StringBuilder(Character.toString(((String) (obj)).charAt(0)).toLowerCase());
            if (((String) (obj)).length() > 1)
            {
                stringbuilder.append(((String) (obj)).substring(1, ((String) (obj)).length()));
            }
            dqu = (Map)dqu.get(stringbuilder.toString());
            if (dqu == null)
            {
                return null;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a(dqu dqu)
    {
        dqu = ((dqu) (c(dqu)));
        if (dqu == null)
        {
            return 0;
        } else
        {
            return ((Double)dqu).intValue();
        }
    }

    public final String a(dqu dqu, String s)
    {
        return (String)a(dqu, s);
    }

    public final boolean a(dqu dqu, boolean flag)
    {
        dqu = ((dqu) (c(dqu)));
        if (dqu == null)
        {
            return flag;
        } else
        {
            return ((Boolean)dqu).booleanValue();
        }
    }

    public final Integer b(dqu dqu)
    {
        dqu = (Double)a(dqu, null);
        if (dqu != null)
        {
            return Integer.valueOf(dqu.intValue());
        } else
        {
            return null;
        }
    }
}
