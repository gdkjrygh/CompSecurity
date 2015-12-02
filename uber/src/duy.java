// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class duy
{

    private final Object a;

    public duy(Object obj)
    {
        a = obj;
    }

    private static String a(Map map, String s)
    {
        map = ((Map) (map.get(s)));
        if (map != null)
        {
            return map.toString();
        } else
        {
            return "";
        }
    }

    private String b(String s)
    {
        int i;
        if (s == null || a == null)
        {
            return "";
        }
        if (a instanceof Map)
        {
            return a((Map)a, s);
        }
        Object obj;
        Object obj1;
        String as[];
        int j;
        try
        {
            obj = a;
            obj1 = a.getClass();
            as = s.split("\\.");
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        s = ((String) (obj1));
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj1 = s.getDeclaredField(as[i]);
        ((Field) (obj1)).setAccessible(true);
        obj = ((Field) (obj1)).get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s = obj.getClass();
        break MISSING_BLOCK_LABEL_123;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        return obj.toString();
        return "";
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder(s.length());
        Matcher matcher = Pattern.compile("\\{\\{(.*?)\\}\\}").matcher(s);
        int i;
        for (i = 0; matcher.find(); i = matcher.end())
        {
            String s1 = b(matcher.group(1).trim());
            stringbuilder.append(s.substring(i, matcher.start()));
            stringbuilder.append(s1);
        }

        stringbuilder.append(s.substring(i, s.length()));
        return stringbuilder.toString();
    }
}
