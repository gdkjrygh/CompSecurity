// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzam, zzc, Command

public class zzab
{

    private final List zzLZ;
    private final long zzMa;
    private final long zzMb;
    private final int zzMc;
    private final boolean zzMd;
    private final String zzMe;
    private final Map zzyn;

    public zzab(zzc zzc1, Map map, long l, boolean flag)
    {
        this(zzc1, map, l, flag, 0L, 0, null);
    }

    public zzab(zzc zzc1, Map map, long l, boolean flag, long l1, 
            int i)
    {
        this(zzc1, map, l, flag, l1, i, null);
    }

    public zzab(zzc zzc1, Map map, long l, boolean flag, long l1, 
            int i, List list)
    {
        zzu.zzu(zzc1);
        zzu.zzu(map);
        zzMb = l;
        zzMd = flag;
        zzMa = l1;
        zzMc = i;
        Object obj;
        if (list != null)
        {
            obj = list;
        } else
        {
            obj = Collections.EMPTY_LIST;
        }
        zzLZ = ((List) (obj));
        zzMe = zze(list);
        list = new HashMap();
        obj = map.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (zzj(entry1.getKey()))
            {
                String s1 = zza(zzc1, entry1.getKey());
                if (s1 != null)
                {
                    list.put(s1, zzb(zzc1, entry1.getValue()));
                }
            }
        } while (true);
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (!zzj(entry.getKey()))
            {
                String s = zza(zzc1, entry.getKey());
                if (s != null)
                {
                    list.put(s, zzb(zzc1, entry.getValue()));
                }
            }
        } while (true);
        if (!TextUtils.isEmpty(zzMe))
        {
            zzam.zzb(list, "_v", zzMe);
            if (zzMe.equals("ma4.0.0") || zzMe.equals("ma4.0.1"))
            {
                list.remove("adid");
            }
        }
        zzyn = Collections.unmodifiableMap(list);
    }

    public static zzab zza(zzc zzc1, zzab zzab1, Map map)
    {
        return new zzab(zzc1, map, zzab1.zzjW(), zzab1.zzjY(), zzab1.zzjV(), zzab1.zzjU(), zzab1.zzjX());
    }

    private static String zza(zzc zzc1, Object obj)
    {
        if (obj == null)
        {
            zzc1 = null;
        } else
        {
            Object obj1 = obj.toString();
            obj = obj1;
            if (((String) (obj1)).startsWith("&"))
            {
                obj = ((String) (obj1)).substring(1);
            }
            int i = ((String) (obj)).length();
            obj1 = obj;
            if (i > 256)
            {
                obj1 = ((String) (obj)).substring(0, 256);
                zzc1.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(i), obj1);
            }
            zzc1 = ((zzc) (obj1));
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                return null;
            }
        }
        return zzc1;
    }

    private static String zzb(zzc zzc1, Object obj)
    {
        Object obj1;
        int i;
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = obj.toString();
        }
        i = ((String) (obj)).length();
        obj1 = obj;
        if (i > 8192)
        {
            obj1 = ((String) (obj)).substring(0, 8192);
            zzc1.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(i), obj1);
        }
        return ((String) (obj1));
    }

    private static String zze(List list)
    {
        if (list == null) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L5:
        if (!list.hasNext()) goto _L2; else goto _L3
_L3:
        Command command = (Command)list.next();
        if (!"appendVersion".equals(command.getId())) goto _L5; else goto _L4
_L4:
        list = command.getValue();
_L7:
        if (TextUtils.isEmpty(list))
        {
            return null;
        } else
        {
            return list;
        }
_L2:
        list = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean zzj(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            return obj.toString().startsWith("&");
        }
    }

    private String zzn(String s, String s1)
    {
        zzu.zzcj(s);
        boolean flag;
        if (!s.startsWith("&"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Short param name required");
        s = (String)zzyn.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("ht=").append(zzMb);
        if (zzMa != 0L)
        {
            stringbuffer.append(", dbId=").append(zzMa);
        }
        if ((long)zzMc != 0L)
        {
            stringbuffer.append(", appUID=").append(zzMc);
        }
        Object obj = new ArrayList(zzyn.keySet());
        Collections.sort(((List) (obj)));
        String s;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuffer.append((String)zzyn.get(s)))
        {
            s = (String)((Iterator) (obj)).next();
            stringbuffer.append(", ");
            stringbuffer.append(s);
            stringbuffer.append("=");
        }

        return stringbuffer.toString();
    }

    public int zzjU()
    {
        return zzMc;
    }

    public long zzjV()
    {
        return zzMa;
    }

    public long zzjW()
    {
        return zzMb;
    }

    public List zzjX()
    {
        return zzLZ;
    }

    public boolean zzjY()
    {
        return zzMd;
    }

    public long zzjZ()
    {
        return zzam.zzbj(zzn("_s", "0"));
    }

    public String zzka()
    {
        return zzn("_m", "");
    }

    public Map zzn()
    {
        return zzyn;
    }
}
