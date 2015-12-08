// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.zip.DeflaterOutputStream;

// Referenced classes of package com.mapbar.android.location:
//            i, a

public final class l
{

    public static String a = "000000000000001";
    public static String b = "";
    public static int c;
    public static int d;
    public static int e;
    public static String f = "";
    public static long g;
    public static int h;
    public static int i;
    public static int j;
    public static String k = "";
    public static String l = "";
    public static int m;
    public static boolean n = true;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static String v;
    public static String w = "";
    private static MessageDigest x;

    public l()
    {
    }

    static String a()
    {
        Object obj1;
        boolean flag1;
        long l1;
        long l2;
        l1 = 0L;
        flag1 = true;
        obj1 = new StringBuilder();
        l2 = (SystemClock.elapsedRealtime() - g) / 1000L;
        if (!"wd".equals(f)) goto _L2; else goto _L1
_L1:
        if (l2 <= 5L) goto _L4; else goto _L3
_L3:
        c = 0;
        d = 0;
        e = 0;
        h = 0;
        i = 0;
        j = 0;
_L14:
        ((StringBuilder) (obj1)).append(c).append(",").append(d).append(",").append(e).append(",").append(l1).append(",").append(h).append(",").append(i).append(",").append(j).append(";");
        if (!n) goto _L6; else goto _L5
_L5:
        ((StringBuilder) (obj1)).append(k).append(",").append(l).append(",").append(t).append(",").append(u).append(",").append(m).append("|").append(v).append(";");
        if (!com.mapbar.android.location.b.b.a(k) || t < 0 || u < 0) goto _L8; else goto _L7
_L7:
        boolean flag = true;
_L12:
        if (com.mapbar.android.location.b.b.a(w))
        {
            ((StringBuilder) (obj1)).append(w).append(";");
            flag = flag1;
        }
        if (!flag) goto _L10; else goto _L9
_L9:
        Object obj;
        String s1;
        com.mapbar.android.location.i.a("MapTags", (new StringBuilder()).append("maptag = ").append(((StringBuilder) (obj1)).toString()).toString());
        s1 = a(((StringBuilder) (obj1)).toString());
        obj = "";
        obj1 = com.mapbar.android.location.a.a(b(((StringBuilder) (obj1)).toString()), "iso-8859-1");
        obj = obj1;
        obj1 = ((String) (obj1)).replaceAll("\n", "").replaceAll("\r", "");
        obj = obj1;
_L11:
        return (new StringBuilder()).append("[Android][").append(s1).append("]").append(((String) (obj))).toString();
_L2:
        if (l2 <= 60L)
        {
            break; /* Loop/switch isn't completed */
        }
        c = 0;
        d = 0;
        e = 0;
        h = 0;
        i = 0;
        j = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        ((StringBuilder) (obj1)).append(k).append(",").append(l).append(",").append(o).append(",").append(p).append(",").append(q).append(",").append(r).append(",").append(s).append(",").append(m).append(";");
        if (com.mapbar.android.location.b.b.a(k) && o >= 0 && p >= 0)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
_L10:
        return new String();
        Exception exception;
        exception;
        if (true) goto _L11; else goto _L8
_L8:
        flag = false;
        if (true) goto _L12; else goto _L4
_L4:
        l1 = l2;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static String a(Context context)
    {
        Object obj;
        android.content.SharedPreferences.Editor editor;
        obj = null;
        editor = null;
        long l1 = 0L;
        com/mapbar/android/location/l;
        JVM INSTR monitorenter ;
        Context context1 = obj;
        SharedPreferences sharedpreferences = context.getSharedPreferences("CellLocation", 0);
        context1 = obj;
        long l2 = sharedpreferences.getLong("popIndex", 0L);
        context = editor;
        context1 = obj;
        if (l2 >= sharedpreferences.getLong("pushIndex", 0L))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        context1 = obj;
        editor = sharedpreferences.edit();
        context1 = obj;
        context = sharedpreferences.getString((new StringBuilder()).append("info").append(l2 % 100L).toString(), null);
        l2 = 1L + l2;
        if (l2 >= 0L)
        {
            l1 = l2;
        }
        context1 = context;
        editor.putLong("popIndex", l1);
        context1 = context;
        try
        {
            editor.commit();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = context1;
        }
        finally
        {
            com/mapbar/android/location/l;
        }
        com/mapbar/android/location/l;
        JVM INSTR monitorexit ;
        return context;
        throw context;
    }

    private static String a(String s1)
    {
        com/mapbar/android/location/l;
        JVM INSTR monitorenter ;
        String s3 = new String();
        String s2 = s3;
        if (x == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s1 = x.digest((new StringBuilder()).append("MAPBAR").append(s1).append("ANDROID").toString().getBytes());
        s2 = s3;
        if (s1 != null)
        {
            try
            {
                s2 = com.mapbar.android.location.a.a(s1, "iso-8859-1");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s2 = s3;
            }
            finally
            {
                com/mapbar/android/location/l;
            }
        }
        com/mapbar/android/location/l;
        JVM INSTR monitorexit ;
        return s2;
        throw s1;
    }

    public static void a(Context context, String s1)
    {
        com/mapbar/android/location/l;
        JVM INSTR monitorenter ;
        boolean flag = com.mapbar.android.location.b.b.a(s1);
        if (flag) goto _L2; else goto _L1
_L1:
        com/mapbar/android/location/l;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l1;
        context = context.getSharedPreferences("CellLocation", 0);
        l1 = context.getLong("pushIndex", 0L);
        context = context.edit();
        context.putString((new StringBuilder()).append("info").append(l1 % 100L).toString(), s1);
        l1++;
        if (l1 >= 0L) goto _L4; else goto _L3
_L3:
        context.putLong("pushIndex", 0L);
        context.putLong("popIndex", 0L);
_L6:
        context.commit();
        continue; /* Loop/switch isn't completed */
_L4:
        context.putLong("pushIndex", l1);
        if (true) goto _L6; else goto _L5
_L5:
        context;
        throw context;
        context;
        if (true) goto _L1; else goto _L7
_L7:
    }

    private static byte[] b(String s1)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(bytearrayoutputstream);
        deflateroutputstream.write(s1.getBytes());
        deflateroutputstream.close();
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        s1 = bytearrayoutputstream.toByteArray();
        return s1;
        s1;
        return null;
    }

    static 
    {
        try
        {
            x = MessageDigest.getInstance("MD5");
        }
        catch (Exception exception) { }
    }
}
