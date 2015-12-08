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

    private static Map zzaOA = new HashMap();
    private static com.google.android.gms.internal.zzag.zza zzaOB;
    private static final Object zzaOt = null;
    private static Long zzaOu = new Long(0L);
    private static Double zzaOv = new Double(0.0D);
    private static zzde zzaOw = zzde.zzT(0L);
    private static String zzaOx;
    private static Boolean zzaOy = new Boolean(false);
    private static List zzaOz = new ArrayList(0);

    private static double getDouble(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        } else
        {
            zzbg.zzaz("getDouble received non-Number");
            return 0.0D;
        }
    }

    public static String zzD(Object obj)
    {
        if (obj == null)
        {
            return zzaOx;
        } else
        {
            return obj.toString();
        }
    }

    public static zzde zzE(Object obj)
    {
        if (obj instanceof zzde)
        {
            return (zzde)obj;
        }
        if (zzK(obj))
        {
            return zzde.zzT(zzL(obj));
        }
        if (zzJ(obj))
        {
            return zzde.zza(Double.valueOf(getDouble(obj)));
        } else
        {
            return zzeK(zzD(obj));
        }
    }

    public static Long zzF(Object obj)
    {
        if (zzK(obj))
        {
            return Long.valueOf(zzL(obj));
        } else
        {
            return zzeL(zzD(obj));
        }
    }

    public static Double zzG(Object obj)
    {
        if (zzJ(obj))
        {
            return Double.valueOf(getDouble(obj));
        } else
        {
            return zzeM(zzD(obj));
        }
    }

    public static Boolean zzH(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return zzeN(zzD(obj));
        }
    }

    public static com.google.android.gms.internal.zzag.zza zzI(Object obj)
    {
        com.google.android.gms.internal.zzag.zza zza;
        boolean flag;
        flag = false;
        zza = new com.google.android.gms.internal.zzag.zza();
        if (obj instanceof com.google.android.gms.internal.zzag.zza)
        {
            return (com.google.android.gms.internal.zzag.zza)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        zza.type = 1;
        zza.zziR = (String)obj;
_L4:
        zza.zzjb = flag;
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
                com.google.android.gms.internal.zzag.zza zza1 = zzI(((Iterator) (obj1)).next());
                if (zza1 == zzaOB)
                {
                    return zzaOB;
                }
                if (flag || zza1.zzjb)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza1);
            }
            zza.zziS = (com.google.android.gms.internal.zzag.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzag.zza[0]);
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
                com.google.android.gms.internal.zzag.zza zza2 = zzI(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = zzI(((java.util.Map.Entry) (obj3)).getValue());
                if (zza2 == zzaOB || obj3 == zzaOB)
                {
                    return zzaOB;
                }
                if (flag || zza2.zzjb || ((com.google.android.gms.internal.zzag.zza) (obj3)).zzjb)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza2);
                arraylist.add(obj3);
            }
            zza.zziT = (com.google.android.gms.internal.zzag.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzag.zza[0]);
            zza.zziU = (com.google.android.gms.internal.zzag.zza[])arraylist.toArray(new com.google.android.gms.internal.zzag.zza[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (zzJ(obj))
        {
            zza.type = 1;
            zza.zziR = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (zzK(obj))
        {
            zza.type = 6;
            zza.zziX = zzL(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        zza.type = 8;
        zza.zziY = ((Boolean)obj).booleanValue();
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
        zzbg.zzaz(stringbuilder.append(((String) (obj))).toString());
        return zzaOB;
    }

    private static boolean zzJ(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof zzde) && ((zzde)obj).zzzF();
    }

    private static boolean zzK(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof zzde) && ((zzde)obj).zzzG();
    }

    private static long zzL(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            zzbg.zzaz("getInt64 received non-Number");
            return 0L;
        }
    }

    public static com.google.android.gms.internal.zzag.zza zzeJ(String s)
    {
        com.google.android.gms.internal.zzag.zza zza = new com.google.android.gms.internal.zzag.zza();
        zza.type = 5;
        zza.zziW = s;
        return zza;
    }

    private static zzde zzeK(String s)
    {
        zzde zzde1;
        try
        {
            zzde1 = zzde.zzeI(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            zzbg.zzaz((new StringBuilder()).append("Failed to convert '").append(s).append("' to a number.").toString());
            return zzaOw;
        }
        return zzde1;
    }

    private static Long zzeL(String s)
    {
        s = zzeK(s);
        if (s == zzaOw)
        {
            return zzaOu;
        } else
        {
            return Long.valueOf(s.longValue());
        }
    }

    private static Double zzeM(String s)
    {
        s = zzeK(s);
        if (s == zzaOw)
        {
            return zzaOv;
        } else
        {
            return Double.valueOf(s.doubleValue());
        }
    }

    private static Boolean zzeN(String s)
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
            return zzaOy;
        }
    }

    public static String zzg(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzD(zzl(zza));
    }

    public static zzde zzh(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzE(zzl(zza));
    }

    public static Long zzi(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzF(zzl(zza));
    }

    public static Double zzj(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzG(zzl(zza));
    }

    public static Boolean zzk(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzH(zzl(zza));
    }

    public static Object zzl(com.google.android.gms.internal.zzag.zza zza)
    {
        boolean flag = false;
        int l = 0;
        int i = 0;
        if (zza == null)
        {
            return zzaOt;
        }
        switch (zza.type)
        {
        default:
            zzbg.zzaz((new StringBuilder()).append("Failed to convert a value of type: ").append(zza.type).toString());
            return zzaOt;

        case 1: // '\001'
            return zza.zziR;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(zza.zziS.length);
            zza = zza.zziS;
            for (l = zza.length; i < l; i++)
            {
                Object obj = zzl(zza[i]);
                if (obj == zzaOt)
                {
                    return zzaOt;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (zza.zziT.length != zza.zziU.length)
            {
                zzbg.zzaz((new StringBuilder()).append("Converting an invalid value to object: ").append(zza.toString()).toString());
                return zzaOt;
            }
            HashMap hashmap = new HashMap(zza.zziU.length);
            for (int j = ((flag) ? 1 : 0); j < zza.zziT.length; j++)
            {
                Object obj1 = zzl(zza.zziT[j]);
                Object obj2 = zzl(zza.zziU[j]);
                if (obj1 == zzaOt || obj2 == zzaOt)
                {
                    return zzaOt;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            zzbg.zzaz("Trying to convert a macro reference to object");
            return zzaOt;

        case 5: // '\005'
            zzbg.zzaz("Trying to convert a function id to object");
            return zzaOt;

        case 6: // '\006'
            return Long.valueOf(zza.zziX);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            zza = zza.zziZ;
            int i1 = zza.length;
            for (int k = l; k < i1; k++)
            {
                String s = zzg(zza[k]);
                if (s == zzaOx)
                {
                    return zzaOt;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(zza.zziY);
        }
    }

    public static Object zzzK()
    {
        return zzaOt;
    }

    public static Long zzzL()
    {
        return zzaOu;
    }

    public static Double zzzM()
    {
        return zzaOv;
    }

    public static Boolean zzzN()
    {
        return zzaOy;
    }

    public static zzde zzzO()
    {
        return zzaOw;
    }

    public static String zzzP()
    {
        return zzaOx;
    }

    public static com.google.android.gms.internal.zzag.zza zzzQ()
    {
        return zzaOB;
    }

    static 
    {
        zzaOx = new String("");
        zzaOB = zzI(zzaOx);
    }
}
