// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzi

public class zzx
{

    public static String zza(Map map)
    {
        return zzb(map, "ISO-8859-1");
    }

    public static zzb.zza zzb(zzi zzi1)
    {
        Map map;
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        long l;
        long l1;
        long l2;
        long l3;
        long l5;
        long l6;
        long l7;
        long l8;
        l8 = System.currentTimeMillis();
        map = zzi1.zzA;
        l2 = 0L;
        l6 = 0L;
        l7 = 0L;
        l = 0L;
        l1 = 0L;
        flag2 = false;
        flag1 = false;
        flag = false;
        s = (String)map.get("Date");
        if (s != null)
        {
            l2 = zzg(s);
        }
        s = (String)map.get("Cache-Control");
        l3 = l1;
        l5 = l;
        if (s == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        boolean flag3;
        flag3 = true;
        as = s.split(",");
        i = 0;
_L6:
        flag1 = flag;
        l3 = l1;
        l5 = l;
        flag2 = flag3;
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        String s2;
        s2 = as[i].trim();
        if (s2.equals("no-cache") || s2.equals("no-store"))
        {
            return null;
        }
        if (!s2.startsWith("max-age=")) goto _L5; else goto _L4
_L4:
        long l4 = Long.parseLong(s2.substring(8));
        l3 = l1;
_L7:
        i++;
        l1 = l3;
        l = l4;
          goto _L6
_L5:
        if (!s2.startsWith("stale-while-revalidate="))
        {
            break MISSING_BLOCK_LABEL_212;
        }
        l3 = Long.parseLong(s2.substring(23));
        l4 = l;
          goto _L7
        if (s2.equals("must-revalidate")) goto _L9; else goto _L8
_L8:
        l3 = l1;
        l4 = l;
        if (!s2.equals("proxy-revalidate")) goto _L7; else goto _L9
_L9:
        flag = true;
        l3 = l1;
        l4 = l;
          goto _L7
_L2:
        String s1 = (String)map.get("Expires");
        l = l7;
        if (s1 != null)
        {
            l = zzg(s1);
        }
        s1 = (String)map.get("Last-Modified");
        l4 = l6;
        if (s1 != null)
        {
            l4 = zzg(s1);
        }
        s1 = (String)map.get("ETag");
        Exception exception;
        if (flag2)
        {
            l1 = l5 * 1000L + l8;
            zzb.zza zza1;
            if (flag1)
            {
                l = l1;
            } else
            {
                l = 1000L * l3 + l1;
            }
        } else
        if (l2 > 0L && l >= l2)
        {
            l = (l - l2) + l8;
            l1 = l;
        } else
        {
            l = 0L;
            l1 = 0L;
        }
        zza1 = new zzb.zza();
        zza1.data = zzi1.data;
        zza1.zzb = s1;
        zza1.zzf = l1;
        zza1.zze = l;
        zza1.zzc = l2;
        zza1.zzd = l4;
        zza1.zzg = map;
        return zza1;
        exception;
        l3 = l1;
        l4 = l;
          goto _L7
        exception;
        l3 = l1;
        l4 = l;
          goto _L7
    }

    public static String zzb(Map map, String s)
    {
        String s1;
        s1 = (String)map.get("Content-Type");
        map = s;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        as = s1.split(";");
        i = 1;
_L7:
        map = s;
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        map = as[i].trim().split("=");
        if (map.length != 2 || !map[0].equals("charset")) goto _L5; else goto _L4
_L4:
        map = map[1];
_L2:
        return map;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static long zzg(String s)
    {
        long l;
        try
        {
            l = DateUtils.parseDate(s).getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }
}
