// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gsf:
//            g

public class f
{

    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static HashMap e;
    private static Object f;
    private static String g[] = new String[0];

    public f()
    {
    }

    public static int a(ContentResolver contentresolver, String s, int i)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        int j = i;
        if (contentresolver != null)
        {
            try
            {
                j = Integer.parseInt(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return i;
            }
        }
        return j;
    }

    public static long a(ContentResolver contentresolver, String s, long l)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        long l1 = l;
        if (contentresolver != null)
        {
            try
            {
                l1 = Long.parseLong(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return l;
            }
        }
        return l1;
    }

    public static Object a(ContentResolver contentresolver)
    {
        com/google/android/gsf/f;
        JVM INSTR monitorenter ;
        b(contentresolver);
        contentresolver = ((ContentResolver) (f));
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
        return contentresolver;
        contentresolver;
        throw contentresolver;
    }

    static Object a(Object obj)
    {
        f = obj;
        return obj;
    }

    public static String a(ContentResolver contentresolver, String s, String s1)
    {
        com/google/android/gsf/f;
        JVM INSTR monitorenter ;
        Object obj;
        b(contentresolver);
        obj = f;
        if (!e.containsKey(s)) goto _L2; else goto _L1
_L1:
        contentresolver = (String)e.get(s);
        if (contentresolver != null)
        {
            s1 = contentresolver;
        }
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
        String s2 = s1;
_L4:
        return s2;
_L2:
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
        String as[];
        int i;
        int j;
        as = g;
        j = as.length;
        i = 0;
_L5:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s2 = s1;
        if (s.startsWith(as[i])) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
        contentresolver;
        throw contentresolver;
        Cursor cursor;
        cursor = contentresolver.query(a, null, null, new String[] {
            s
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_158;
        }
        e.put(s, null);
        s2 = s1;
        if (cursor == null) goto _L4; else goto _L6
_L6:
        cursor.close();
        return s1;
        contentresolver = cursor.getString(1);
        com/google/android/gsf/f;
        JVM INSTR monitorenter ;
        if (obj == f)
        {
            e.put(s, contentresolver);
        }
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
        if (contentresolver != null)
        {
            s1 = contentresolver;
        }
        s2 = s1;
        if (cursor == null) goto _L4; else goto _L7
_L7:
        cursor.close();
        return s1;
        contentresolver;
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver;
        if (cursor != null)
        {
            cursor.close();
        }
        throw contentresolver;
    }

    static HashMap a()
    {
        return e;
    }

    public static transient Map a(ContentResolver contentresolver, String as[])
    {
        contentresolver = contentresolver.query(b, null, null, as, null);
        as = new TreeMap();
        if (contentresolver == null)
        {
            return as;
        }
        for (; contentresolver.moveToNext(); as.put(contentresolver.getString(0), contentresolver.getString(1))) { }
        break MISSING_BLOCK_LABEL_66;
        as;
        contentresolver.close();
        throw as;
        contentresolver.close();
        return as;
    }

    public static boolean a(ContentResolver contentresolver, String s, boolean flag)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        if (contentresolver == null || contentresolver.equals(""))
        {
            return flag;
        }
        if (c.matcher(contentresolver).matches())
        {
            return true;
        }
        if (d.matcher(contentresolver).matches())
        {
            return false;
        } else
        {
            Log.w("Gservices", (new StringBuilder("attempt to read gservices key ")).append(s).append(" (value \"").append(contentresolver).append("\") as boolean").toString());
            return flag;
        }
    }

    private static void b(ContentResolver contentresolver)
    {
        if (e == null)
        {
            e = new HashMap();
            f = new Object();
            (new g("Gservices", contentresolver)).start();
        }
    }

    public static transient void b(ContentResolver contentresolver, String as[])
    {
        Map map = a(contentresolver, as);
        com/google/android/gsf/f;
        JVM INSTR monitorenter ;
        b(contentresolver);
        g = as;
        for (contentresolver = map.entrySet().iterator(); contentresolver.hasNext(); e.put(as.getKey(), as.getValue()))
        {
            as = (java.util.Map.Entry)contentresolver.next();
        }

        break MISSING_BLOCK_LABEL_76;
        contentresolver;
        throw contentresolver;
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
    }

    static String[] b()
    {
        return g;
    }

}
