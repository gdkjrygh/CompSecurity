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

    private static final Object zzaSN = null;
    private static Long zzaSO = new Long(0L);
    private static Double zzaSP = new Double(0.0D);
    private static zzde zzaSQ = zzde.zzT(0L);
    private static String zzaSR;
    private static Boolean zzaSS = new Boolean(false);
    private static List zzaST = new ArrayList(0);
    private static Map zzaSU = new HashMap();
    private static com.google.android.gms.internal.zzag.zza zzaSV;

    private static double getDouble(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        } else
        {
            zzbg.e("getDouble received non-Number");
            return 0.0D;
        }
    }

    public static Object zzBa()
    {
        return zzaSN;
    }

    public static Long zzBb()
    {
        return zzaSO;
    }

    public static Double zzBc()
    {
        return zzaSP;
    }

    public static Boolean zzBd()
    {
        return zzaSS;
    }

    public static zzde zzBe()
    {
        return zzaSQ;
    }

    public static String zzBf()
    {
        return zzaSR;
    }

    public static com.google.android.gms.internal.zzag.zza zzBg()
    {
        return zzaSV;
    }

    public static String zzF(Object obj)
    {
        if (obj == null)
        {
            return zzaSR;
        } else
        {
            return obj.toString();
        }
    }

    public static zzde zzG(Object obj)
    {
        if (obj instanceof zzde)
        {
            return (zzde)obj;
        }
        if (zzM(obj))
        {
            return zzde.zzT(zzN(obj));
        }
        if (zzL(obj))
        {
            return zzde.zza(Double.valueOf(getDouble(obj)));
        } else
        {
            return zzeZ(zzF(obj));
        }
    }

    public static Long zzH(Object obj)
    {
        if (zzM(obj))
        {
            return Long.valueOf(zzN(obj));
        } else
        {
            return zzfa(zzF(obj));
        }
    }

    public static Double zzI(Object obj)
    {
        if (zzL(obj))
        {
            return Double.valueOf(getDouble(obj));
        } else
        {
            return zzfb(zzF(obj));
        }
    }

    public static Boolean zzJ(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return zzfc(zzF(obj));
        }
    }

    public static com.google.android.gms.internal.zzag.zza zzK(Object obj)
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
        zza.zziU = (String)obj;
_L4:
        zza.zzje = flag;
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
                com.google.android.gms.internal.zzag.zza zza1 = zzK(((Iterator) (obj1)).next());
                if (zza1 == zzaSV)
                {
                    return zzaSV;
                }
                if (flag || zza1.zzje)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza1);
            }
            zza.zziV = (com.google.android.gms.internal.zzag.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzag.zza[0]);
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
                com.google.android.gms.internal.zzag.zza zza2 = zzK(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = zzK(((java.util.Map.Entry) (obj3)).getValue());
                if (zza2 == zzaSV || obj3 == zzaSV)
                {
                    return zzaSV;
                }
                if (flag || zza2.zzje || ((com.google.android.gms.internal.zzag.zza) (obj3)).zzje)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(zza2);
                arraylist.add(obj3);
            }
            zza.zziW = (com.google.android.gms.internal.zzag.zza[])((List) (obj)).toArray(new com.google.android.gms.internal.zzag.zza[0]);
            zza.zziX = (com.google.android.gms.internal.zzag.zza[])arraylist.toArray(new com.google.android.gms.internal.zzag.zza[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (zzL(obj))
        {
            zza.type = 1;
            zza.zziU = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (zzM(obj))
        {
            zza.type = 6;
            zza.zzja = zzN(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        zza.type = 8;
        zza.zzjb = ((Boolean)obj).booleanValue();
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
        zzbg.e(stringbuilder.append(((String) (obj))).toString());
        return zzaSV;
    }

    private static boolean zzL(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof zzde) && ((zzde)obj).zzAV();
    }

    private static boolean zzM(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof zzde) && ((zzde)obj).zzAW();
    }

    private static long zzN(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            zzbg.e("getInt64 received non-Number");
            return 0L;
        }
    }

    public static com.google.android.gms.internal.zzag.zza zzeY(String s)
    {
        com.google.android.gms.internal.zzag.zza zza = new com.google.android.gms.internal.zzag.zza();
        zza.type = 5;
        zza.zziZ = s;
        return zza;
    }

    private static zzde zzeZ(String s)
    {
        zzde zzde1;
        try
        {
            zzde1 = zzde.zzeX(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            zzbg.e((new StringBuilder()).append("Failed to convert '").append(s).append("' to a number.").toString());
            return zzaSQ;
        }
        return zzde1;
    }

    private static Long zzfa(String s)
    {
        s = zzeZ(s);
        if (s == zzaSQ)
        {
            return zzaSO;
        } else
        {
            return Long.valueOf(s.longValue());
        }
    }

    private static Double zzfb(String s)
    {
        s = zzeZ(s);
        if (s == zzaSQ)
        {
            return zzaSP;
        } else
        {
            return Double.valueOf(s.doubleValue());
        }
    }

    private static Boolean zzfc(String s)
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
            return zzaSS;
        }
    }

    public static String zzg(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzF(zzl(zza));
    }

    public static zzde zzh(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzG(zzl(zza));
    }

    public static Long zzi(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzH(zzl(zza));
    }

    public static Double zzj(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzI(zzl(zza));
    }

    public static Boolean zzk(com.google.android.gms.internal.zzag.zza zza)
    {
        return zzJ(zzl(zza));
    }

    public static Object zzl(com.google.android.gms.internal.zzag.zza zza)
    {
        boolean flag = false;
        int l = 0;
        int i = 0;
        if (zza == null)
        {
            return zzaSN;
        }
        switch (zza.type)
        {
        default:
            zzbg.e((new StringBuilder()).append("Failed to convert a value of type: ").append(zza.type).toString());
            return zzaSN;

        case 1: // '\001'
            return zza.zziU;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(zza.zziV.length);
            zza = zza.zziV;
            for (l = zza.length; i < l; i++)
            {
                Object obj = zzl(zza[i]);
                if (obj == zzaSN)
                {
                    return zzaSN;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (zza.zziW.length != zza.zziX.length)
            {
                zzbg.e((new StringBuilder()).append("Converting an invalid value to object: ").append(zza.toString()).toString());
                return zzaSN;
            }
            HashMap hashmap = new HashMap(zza.zziX.length);
            for (int j = ((flag) ? 1 : 0); j < zza.zziW.length; j++)
            {
                Object obj1 = zzl(zza.zziW[j]);
                Object obj2 = zzl(zza.zziX[j]);
                if (obj1 == zzaSN || obj2 == zzaSN)
                {
                    return zzaSN;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            zzbg.e("Trying to convert a macro reference to object");
            return zzaSN;

        case 5: // '\005'
            zzbg.e("Trying to convert a function id to object");
            return zzaSN;

        case 6: // '\006'
            return Long.valueOf(zza.zzja);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            zza = zza.zzjc;
            int i1 = zza.length;
            for (int k = l; k < i1; k++)
            {
                String s = zzg(zza[k]);
                if (s == zzaSR)
                {
                    return zzaSN;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(zza.zzjb);
        }
    }

    static 
    {
        zzaSR = new String("");
        zzaSV = zzK(zzaSR);
    }
}
