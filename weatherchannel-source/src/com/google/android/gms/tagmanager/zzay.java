// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
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

        public static final zza zzaMa;
        public static final zza zzaMb;
        public static final zza zzaMc;
        private static final zza zzaMd[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzay$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaMd.clone();
        }

        static 
        {
            zzaMa = new zza("NONE", 0);
            zzaMb = new zza("URL", 1);
            zzaMc = new zza("BACKSLASH", 2);
            zzaMd = (new zza[] {
                zzaMa, zzaMb, zzaMc
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ID;
    private static final String zzaLE;
    private static final String zzaLW;
    private static final String zzaLX;
    private static final String zzaLY;

    public zzay()
    {
        super(ID, new String[] {
            zzaLE
        });
    }

    private String zza(String s, zza zza1, Set set)
    {
        static class _cls1
        {

            static final int zzaLZ[];

            static 
            {
                zzaLZ = new int[zza.values().length];
                try
                {
                    zzaLZ[zza.zzaMb.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzaLZ[zza.zzaMc.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzaLZ[zza.zzaMa.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.zzaLZ[zza1.ordinal()])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                zza1 = zzdj.zzeQ(s);
            }
            // Misplaced declaration of an exception variable
            catch (zza zza1)
            {
                zzbg.zzb("Joiner: unsupported encoding", zza1);
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

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        com.google.android.gms.internal.zzag.zza zza1 = (com.google.android.gms.internal.zzag.zza)map.get(zzaLE);
        if (zza1 == null)
        {
            return zzdf.zzzQ();
        }
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaLW);
        String s;
        Object obj1;
        StringBuilder stringbuilder;
        if (obj != null)
        {
            s = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        } else
        {
            s = "";
        }
        obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaLX);
        if (obj != null)
        {
            obj1 = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = zza.zzaMa;
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaLY);
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
                obj = zza.zzaMb;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = zza.zzaMc;
                map = new HashSet();
                zza(map, s);
                zza(map, ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                zzbg.zzaz((new StringBuilder()).append("Joiner: unsupported escape type: ").append(map).toString());
                return zzdf.zzzQ();
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
        return zzdf.zzI(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = zza1.zziS;
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
        while (i < zza1.zziT.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = zzdf.zzg(zza1.zziT[i]);
            s2 = zzdf.zzg(zza1.zziU[i]);
            zza(stringbuilder, s1, ((zza) (obj)), map);
            stringbuilder.append(((String) (obj1)));
            zza(stringbuilder, s2, ((zza) (obj)), map);
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbM.toString();
        zzaLE = zzae.zzdw.toString();
        zzaLW = zzae.zzfu.toString();
        zzaLX = zzae.zzfy.toString();
        zzaLY = zzae.zzeR.toString();
    }
}
