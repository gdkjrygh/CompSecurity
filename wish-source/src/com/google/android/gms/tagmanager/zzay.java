// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdj, zzbg, zzdf

class zzay extends zzak
{
    private static final class zza extends Enum
    {

        public static final zza zzaDM;
        public static final zza zzaDN;
        public static final zza zzaDO;
        private static final zza zzaDP[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzay$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaDP.clone();
        }

        static 
        {
            zzaDM = new zza("NONE", 0);
            zzaDN = new zza("URL", 1);
            zzaDO = new zza("BACKSLASH", 2);
            zzaDP = (new zza[] {
                zzaDM, zzaDN, zzaDO
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ID;
    private static final String zzaDI;
    private static final String zzaDJ;
    private static final String zzaDK;
    private static final String zzaDq;

    public zzay()
    {
        super(ID, new String[] {
            zzaDq
        });
    }

    private String zza(String s, zza zza1, Set set)
    {
        static class _cls1
        {

            static final int zzaDL[];

            static 
            {
                zzaDL = new int[zza.values().length];
                try
                {
                    zzaDL[zza.zzaDN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzaDL[zza.zzaDO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzaDL[zza.zzaDM.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.zzaDL[zza1.ordinal()])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                zza1 = zzdj.zzei(s);
            }
            // Misplaced declaration of an exception variable
            catch (zza zza1)
            {
                com.google.android.gms.tagmanager.zzbg.zzb("Joiner: unsupported encoding", zza1);
                return s;
            }
            return zza1;

        case 2: // '\002'
            s = s.replace("\\", "\\\\");
            zza1 = set.iterator();
            break;
        }
        while (zza1.hasNext()) 
        {
            set = ((Character)zza1.next()).toString();
            s = s.replace(set, (new StringBuilder()).append("\\").append(set).toString());
        }
        return s;
    }

    private void zza(StringBuilder stringbuilder, String s, zza zza1, Set set)
    {
        stringbuilder.append(zza(s, zza1, set));
    }

    private void zza(Set set, String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            set.add(Character.valueOf(s.charAt(i)));
        }

    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(zzaDq);
        if (zza1 == null)
        {
            return zzdf.zzxU();
        }
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaDI);
        String s;
        Object obj1;
        StringBuilder stringbuilder;
        if (obj != null)
        {
            s = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        } else
        {
            s = "";
        }
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaDJ);
        if (obj != null)
        {
            obj1 = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = zza.zzaDM;
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaDK);
        String s1;
        String s2;
        int i;
        boolean flag;
        int j;
        if (map != null)
        {
            map = zzdf.zzg(map);
            if ("url".equals(map))
            {
                obj = zza.zzaDN;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = zza.zzaDO;
                map = new HashSet();
                zza(map, s);
                zza(map, ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                zzbg.zzak((new StringBuilder()).append("Joiner: unsupported escape type: ").append(map).toString());
                return zzdf.zzxU();
            }
        } else
        {
            map = null;
        }
        stringbuilder = new StringBuilder();
        zza1.type;
        JVM INSTR tableswitch 2 3: default 144
    //                   2 254
    //                   3 323;
           goto _L1 _L2 _L3
_L1:
        zza(stringbuilder, zzdf.zzg(zza1), ((zza) (obj)), map);
_L5:
        return zzdf.zzE(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = zza1.zzhl;
        j = obj1.length;
        i = 0;
        while (i < j) 
        {
            zza1 = obj1[i];
            if (!flag)
            {
                stringbuilder.append(s);
            }
            zza(stringbuilder, zzdf.zzg(zza1), ((zza) (obj)), map);
            i++;
            flag = false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        i = 0;
        while (i < zza1.zzhm.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = zzdf.zzg(zza1.zzhm[i]);
            s2 = zzdf.zzg(zza1.zzhn[i]);
            zza(stringbuilder, s1, ((zza) (obj)), map);
            stringbuilder.append(((String) (obj1)));
            zza(stringbuilder, s2, ((zza) (obj)), map);
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzae.toString();
        zzaDq = zzb.zzbO.toString();
        zzaDI = zzb.zzdM.toString();
        zzaDJ = zzb.zzdQ.toString();
        zzaDK = zzb.zzdj.toString();
    }
}
