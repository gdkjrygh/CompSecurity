// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
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

    private final List zzNY;
    private final long zzNZ;
    private final long zzOa;
    private final int zzOb;
    private final boolean zzOc;
    private final String zzOd;
    private final Map zzvs;

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
        zzx.zzv(zzc1);
        zzx.zzv(map);
        zzOa = l;
        zzOc = flag;
        zzNZ = l1;
        zzOb = i;
        Object obj;
        if (list != null)
        {
            obj = list;
        } else
        {
            obj = Collections.EMPTY_LIST;
        }
        zzNY = ((List) (obj));
        zzOd = zze(list);
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
        if (!TextUtils.isEmpty(zzOd))
        {
            zzam.zzb(list, "_v", zzOd);
            if (zzOd.equals("ma4.0.0") || zzOd.equals("ma4.0.1"))
            {
                list.remove("adid");
            }
        }
        zzvs = Collections.unmodifiableMap(list);
    }

    public static zzab zza(zzc zzc1, zzab zzab1, Map map)
    {
        return new zzab(zzc1, map, zzab1.zzkk(), zzab1.zzkm(), zzab1.zzkj(), zzab1.zzki(), zzab1.zzkl());
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

    private String zzo(String s, String s1)
    {
        zzx.zzcs(s);
        boolean flag;
        if (!s.startsWith("&"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Short param name required");
        s = (String)zzvs.get(s);
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
        stringbuffer.append("ht=").append(zzOa);
        if (zzNZ != 0L)
        {
            stringbuffer.append(", dbId=").append(zzNZ);
        }
        if ((long)zzOb != 0L)
        {
            stringbuffer.append(", appUID=").append(zzOb);
        }
        Object obj = new ArrayList(zzvs.keySet());
        Collections.sort(((List) (obj)));
        String s;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuffer.append((String)zzvs.get(s)))
        {
            s = (String)((Iterator) (obj)).next();
            stringbuffer.append(", ");
            stringbuffer.append(s);
            stringbuffer.append("=");
        }

        return stringbuffer.toString();
    }

    public int zzki()
    {
        return zzOb;
    }

    public long zzkj()
    {
        return zzNZ;
    }

    public long zzkk()
    {
        return zzOa;
    }

    public List zzkl()
    {
        return zzNY;
    }

    public boolean zzkm()
    {
        return zzOc;
    }

    public long zzkn()
    {
        return zzam.zzbo(zzo("_s", "0"));
    }

    public String zzko()
    {
        return zzo("_m", "");
    }

    public Map zzn()
    {
        return zzvs;
    }
}
