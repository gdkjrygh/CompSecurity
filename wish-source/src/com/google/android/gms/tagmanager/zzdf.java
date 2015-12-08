// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzde, zzbg

public class zzdf
{

    private static final Object zzaGf = null;
    private static Long zzaGg = new Long(0L);
    private static Double zzaGh = new Double(0.0D);
    private static zzde zzaGi = zzde.zzS(0L);
    private static String zzaGj;
    private static Boolean zzaGk = new Boolean(false);
    private static List zzaGl = new ArrayList(0);
    private static Map zzaGm = new HashMap();
    private static com.google.android.gms.internal.zzd.zza zzaGn;

    private static double getDouble(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        } else
        {
            zzbg.zzak("getDouble received non-Number");
            return 0.0D;
        }
    }

    public static zzde zzA(Object obj)
    {
        if (obj instanceof zzde)
        {
            return (zzde)obj;
        }
        if (zzG(obj))
        {
            return zzde.zzS(zzH(obj));
        }
        if (zzF(obj))
        {
            return zzde.zza(Double.valueOf(getDouble(obj)));
        } else
        {
            return zzec(zzz(obj));
        }
    }

    public static Long zzB(Object obj)
    {
        if (zzG(obj))
        {
            return Long.valueOf(zzH(obj));
        } else
        {
            return zzed(zzz(obj));
        }
    }

    public static Boolean zzD(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return zzef(zzz(obj));
        }
    }

    public static com.google.android.gms.internal.zzd.zza zzE(Object obj)
    {
        com.google.android.gms.internal.zzd.zza zza;
        boolean flag;
        flag = false;
        zza = new com.google.android.gms.internal.zzd.zza();
        if (obj instanceof com.google.android.gms.internal.zzd.zza)
        {
            return (com.google.android.gms.internal.zzd.zza)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        zza.type = 1;
        zza.zzhk = (String)obj;
_L4:
        zza.zzhu = flag;
        return zza;
_L2:
        if (obj instanceof List)
        {
            zza.type = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                com.google.android.gms.internal.zzd.zza zza1 = zzE(((Iterator) (obj1)).next());
                if (zza1 == zzaGn)
                {
                    return zzaGn;
                }
                if (flag || zza1.zzhu)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza1);
            }
            zza.zzhl = (com.google.android.gms.internal.zzd.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzd.zza[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            zza.type = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                com.google.android.gms.internal.zzd.zza zza2 = zzE(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = zzE(((java.util.Map.Entry) (obj3)).getValue());
                if (zza2 == zzaGn || obj3 == zzaGn)
                {
                    return zzaGn;
                }
                if (flag || zza2.zzhu || ((com.google.android.gms.internal.zzd.zza) (obj3)).zzhu)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza2);
                arraylist.add(obj3);
            }
            zza.zzhm = (com.google.android.gms.internal.zzd.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzd.zza[0]);
            zza.zzhn = (com.google.android.gms.internal.zzd.zza[])arraylist.toArray(new com.google.android.gms.internal.zzd.zza[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (zzF(obj))
        {
            zza.type = 1;
            zza.zzhk = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (zzG(obj))
        {
            zza.type = 6;
            zza.zzhq = zzH(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        zza.type = 8;
        zza.zzhr = ((Boolean)obj).booleanValue();
        if (true) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder = (new StringBuilder()).append("Converting to Value from unknown object type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().toString();
        }
        zzbg.zzak(stringbuilder.append(((String) (obj))).toString());
        return zzaGn;
    }

    private static boolean zzF(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof zzde) && ((zzde)obj).zzxJ();
    }

    private static boolean zzG(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof zzde) && ((zzde)obj).zzxK();
    }

    private static long zzH(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            zzbg.zzak("getInt64 received non-Number");
            return 0L;
        }
    }

    private static zzde zzec(String s)
    {
        zzde zzde1;
        try
        {
            zzde1 = zzde.zzea(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            zzbg.zzak((new StringBuilder()).append("Failed to convert '").append(s).append("' to a number.").toString());
            return zzaGi;
        }
        return zzde1;
    }

    private static Long zzed(String s)
    {
        s = zzec(s);
        if (s == zzaGi)
        {
            return zzaGg;
        } else
        {
            return Long.valueOf(s.longValue());
        }
    }

    private static Boolean zzef(String s)
    {
        if ("true".equalsIgnoreCase(s))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(s))
        {
            return Boolean.FALSE;
        } else
        {
            return zzaGk;
        }
    }

    public static String zzg(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzz(zzl(zza));
    }

    public static zzde zzh(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzA(zzl(zza));
    }

    public static Long zzi(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzB(zzl(zza));
    }

    public static Boolean zzk(com.google.android.gms.internal.zzd.zza zza)
    {
        return zzD(zzl(zza));
    }

    public static Object zzl(com.google.android.gms.internal.zzd.zza zza)
    {
        boolean flag = false;
        int l = 0;
        int i = 0;
        if (zza == null)
        {
            return zzaGf;
        }
        switch (zza.type)
        {
        default:
            zzbg.zzak((new StringBuilder()).append("Failed to convert a value of type: ").append(zza.type).toString());
            return zzaGf;

        case 1: // '\001'
            return zza.zzhk;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(zza.zzhl.length);
            zza = zza.zzhl;
            for (l = zza.length; i < l; i++)
            {
                Object obj = zzl(zza[i]);
                if (obj == zzaGf)
                {
                    return zzaGf;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (zza.zzhm.length != zza.zzhn.length)
            {
                zzbg.zzak((new StringBuilder()).append("Converting an invalid value to object: ").append(zza.toString()).toString());
                return zzaGf;
            }
            HashMap hashmap = new HashMap(zza.zzhn.length);
            for (int j = ((flag) ? 1 : 0); j < zza.zzhm.length; j++)
            {
                Object obj1 = zzl(zza.zzhm[j]);
                Object obj2 = zzl(zza.zzhn[j]);
                if (obj1 == zzaGf || obj2 == zzaGf)
                {
                    return zzaGf;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            zzbg.zzak("Trying to convert a macro reference to object");
            return zzaGf;

        case 5: // '\005'
            zzbg.zzak("Trying to convert a function id to object");
            return zzaGf;

        case 6: // '\006'
            return Long.valueOf(zza.zzhq);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            zza = zza.zzhs;
            int i1 = zza.length;
            for (int k = l; k < i1; k++)
            {
                String s = zzg(zza[k]);
                if (s == zzaGj)
                {
                    return zzaGf;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(zza.zzhr);
        }
    }

    public static Object zzxO()
    {
        return zzaGf;
    }

    public static Long zzxP()
    {
        return zzaGg;
    }

    public static Boolean zzxR()
    {
        return zzaGk;
    }

    public static zzde zzxS()
    {
        return zzaGi;
    }

    public static String zzxT()
    {
        return zzaGj;
    }

    public static com.google.android.gms.internal.zzd.zza zzxU()
    {
        return zzaGn;
    }

    public static String zzz(Object obj)
    {
        if (obj == null)
        {
            return zzaGj;
        } else
        {
            return obj.toString();
        }
    }

    static 
    {
        zzaGj = new String("");
        zzaGn = zzE(zzaGj);
    }
}
