// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package io.card.payment:
//            ai

public class ae
{

    private static final String a = io/card/payment/ae.getSimpleName();
    private static final Map b;
    private static final Set c;
    private static boolean g;
    private Map d;
    private ai e;
    private Class f;

    public ae(Class class1, List list)
    {
        d = new LinkedHashMap();
        f = class1;
        String s;
        for (class1 = list.iterator(); class1.hasNext(); c(s))
        {
            list = (ai)class1.next();
            s = list.a();
            if (s == null)
            {
                throw new RuntimeException("Null localeName");
            }
            if (d.containsKey(s))
            {
                throw new RuntimeException((new StringBuilder("Locale ")).append(s).append(" already added").toString());
            }
            d.put(s, list);
        }

        a(((String) (null)));
    }

    private void c(String s)
    {
        ai ai1 = (ai)d.get(s);
        ArrayList arraylist = new ArrayList();
        String s2 = a;
        (new StringBuilder("Checking locale ")).append(s).toString();
        Enum aenum[] = (Enum[])f.getEnumConstants();
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = aenum[i];
            String s3 = (new StringBuilder("[")).append(s).append(",").append(enum).append("]").toString();
            if (ai1.a(enum, null) == null)
            {
                arraylist.add((new StringBuilder("Missing ")).append(s3).toString());
            }
        }

        for (s = arraylist.iterator(); s.hasNext();)
        {
            s.next();
            String s1 = a;
        }

    }

    private ai d(String s)
    {
        Object obj3 = null;
        Object obj1 = null;
        Object obj = obj1;
        if (s != null)
        {
            if (s.length() < 2)
            {
                obj = obj1;
            } else
            {
                ai ai1 = obj3;
                if (b.containsKey(s))
                {
                    obj = (String)b.get(s);
                    ai1 = (ai)d.get(obj);
                    String s1 = a;
                    (new StringBuilder("Overriding locale specifier ")).append(s).append(" with ").append(((String) (obj))).toString();
                }
                obj = ai1;
                if (ai1 == null)
                {
                    Object obj2;
                    if (s.contains("_"))
                    {
                        obj = s;
                    } else
                    {
                        obj = (new StringBuilder()).append(s).append("_").append(Locale.getDefault().getCountry()).toString();
                    }
                    obj = (ai)d.get(obj);
                }
                obj2 = obj;
                if (obj == null)
                {
                    obj2 = (ai)d.get(s);
                }
                obj = obj2;
                if (obj2 == null)
                {
                    s = s.substring(0, 2);
                    return (ai)d.get(s);
                }
            }
        }
        return ((ai) (obj));
    }

    public final String a(Enum enum)
    {
        return a(enum, e);
    }

    public final String a(Enum enum, ai ai1)
    {
        String s = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        Object obj = ai1.a(enum, s);
        ai1 = ((ai) (obj));
        if (obj == null)
        {
            (new StringBuilder("Missing localized string for [")).append(e.a()).append(",Key.").append(enum.toString()).append("]").toString();
            ai1 = a;
            ai1 = ((ai)d.get("en")).a(enum, s);
        }
        obj = ai1;
        if (ai1 == null)
        {
            ai1 = a;
            (new StringBuilder("Missing localized string for [en,Key.")).append(enum.toString()).append("], so defaulting to keyname").toString();
            obj = enum.toString();
        }
        return ((String) (obj));
    }

    public final void a(String s)
    {
        String s1 = a;
        (new StringBuilder("setLanguage(")).append(s).append(")").toString();
        e = null;
        e = b(s);
        if (!g && e == null)
        {
            throw new AssertionError();
        } else
        {
            s = a;
            (new StringBuilder("setting locale to:")).append(e.a()).toString();
            return;
        }
    }

    public final ai b(String s)
    {
        ai ai1 = null;
        if (s != null)
        {
            ai1 = d(s);
        }
        Object obj = ai1;
        if (ai1 == null)
        {
            obj = Locale.getDefault().toString();
            String s1 = a;
            (new StringBuilder()).append(s).append(" not found.  Attempting to look for ").append(((String) (obj))).toString();
            obj = d(((String) (obj)));
        }
        s = ((String) (obj));
        if (obj == null)
        {
            s = a;
            s = (ai)d.get("en");
        }
        if (!g && s == null)
        {
            throw new AssertionError();
        } else
        {
            return s;
        }
    }

    static 
    {
        boolean flag;
        if (!io/card/payment/ae.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        b = new HashMap();
        c = new HashSet();
        b.put("zh_CN", "zh-Hans");
        b.put("zh_TW", "zh-Hant_TW");
        b.put("zh_HK", "zh-Hant");
        b.put("en_UK", "en_GB");
        b.put("en_IE", "en_GB");
        b.put("iw_IL", "he");
        b.put("no", "nb");
        c.add("he");
        c.add("ar");
    }
}
