// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.common.http;

import android.content.ContentResolver;
import android.util.Log;
import com.google.android.gsf.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.common.http:
//            c

public final class UrlRules
{

    private static final Pattern a = Pattern.compile(" +");
    private static final Pattern b = Pattern.compile("\\W");
    private static UrlRules c = new UrlRules(new c[0]);
    private static Object d;
    private final c e[];
    private final Pattern f;

    private UrlRules(c ac[])
    {
        Arrays.sort(ac);
        StringBuilder stringbuilder = new StringBuilder("(");
        for (int i = 0; i < ac.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(")|(");
            }
            stringbuilder.append(b.matcher(ac[i].b).replaceAll("\\\\$0"));
        }

        f = Pattern.compile(stringbuilder.append(")").toString());
        e = ac;
    }

    public static UrlRules a(ContentResolver contentresolver)
    {
        com/google/android/common/http/UrlRules;
        JVM INSTR monitorenter ;
        Object obj = com.google.android.gsf.f.a(contentresolver);
        if (obj != d) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", (new StringBuilder("Using cached rules, versionToken: ")).append(obj).toString());
        }
        contentresolver = c;
_L6:
        com/google/android/common/http/UrlRules;
        JVM INSTR monitorexit ;
        return contentresolver;
_L2:
        Object obj1;
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", "Scanning for Gservices \"url:*\" rules");
        }
        obj1 = com.google.android.gsf.f.a(contentresolver, new String[] {
            "url:"
        });
        contentresolver = new ArrayList();
        obj1 = ((Map) (obj1)).entrySet().iterator();
_L4:
        Object obj2;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_244;
        }
        obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
        String s;
        s = ((String)((java.util.Map.Entry) (obj2)).getKey()).substring(4);
        obj2 = (String)((java.util.Map.Entry) (obj2)).getValue();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj2)).length() == 0) goto _L4; else goto _L5
_L5:
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", (new StringBuilder("  Rule ")).append(s).append(": ").append(((String) (obj2))).toString());
        }
        contentresolver.add(new c(s, ((String) (obj2))));
          goto _L4
        RuleFormatException ruleformatexception;
        ruleformatexception;
        Log.e("UrlRules", "Invalid rule from Gservices", ruleformatexception);
          goto _L4
        contentresolver;
        throw contentresolver;
        c = new UrlRules((c[])contentresolver.toArray(new c[contentresolver.size()]));
        d = obj;
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", (new StringBuilder("New rules stored, versionToken: ")).append(obj).toString());
        }
        contentresolver = c;
          goto _L6
    }

    static Pattern a()
    {
        return a;
    }

    public final c a(String s)
    {
        s = f.matcher(s);
        if (s.lookingAt())
        {
            for (int i = 0; i < e.length; i++)
            {
                if (s.group(i + 1) != null)
                {
                    return e[i];
                }
            }

        }
        return c.e;
    }

}
