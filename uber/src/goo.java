// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public final class goo
{

    private Context a;

    public goo(Context context)
    {
        a = context;
    }

    public final String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s = (new StringBuilder("country_")).append(s.toLowerCase(Locale.US)).toString();
        int i = gom.getField(s).getInt(null);
        s = a.getString(i);
        return s;
        s;
        return "";
    }

    final Map a()
    {
        TreeMap treemap = new TreeMap(new Comparator() {

            final goo a;

            private static int a(String s1, String s2)
            {
                Collator collator = Collator.getInstance(Locale.getDefault());
                collator.setStrength(0);
                return collator.compare(s1.toLowerCase(), s2.toLowerCase());
            }

            public final int compare(Object obj, Object obj1)
            {
                return a((String)obj, (String)obj1);
            }

            
            {
                a = goo.this;
                super();
            }
        });
        String as[] = a.getResources().getStringArray(gof.ubc__country_iso2);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            treemap.put(a(s), s);
        }

        return treemap;
    }
}
