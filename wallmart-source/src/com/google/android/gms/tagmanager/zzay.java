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

        public static final zza zzaQu;
        public static final zza zzaQv;
        public static final zza zzaQw;
        private static final zza zzaQx[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzay$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaQx.clone();
        }

        static 
        {
            zzaQu = new zza("NONE", 0);
            zzaQv = new zza("URL", 1);
            zzaQw = new zza("BACKSLASH", 2);
            zzaQx = (new zza[] {
                zzaQu, zzaQv, zzaQw
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ID;
    private static final String zzaPY;
    private static final String zzaQq;
    private static final String zzaQr;
    private static final String zzaQs;

    public zzay()
    {
        super(ID, new String[] {
            zzaPY
        });
    }

    private String zza(String s, zza zza1, Set set)
    {
        static class _cls1
        {

            static final int zzaQt[];

            static 
            {
                zzaQt = new int[zza.values().length];
                try
                {
                    zzaQt[zza.zzaQv.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzaQt[zza.zzaQw.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzaQt[zza.zzaQu.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.zzaQt[zza1.ordinal()])
        {
        default:
            return s;

        case 1: // '\001'
            try
            {
                zza1 = zzdj.zzff(s);
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

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        com.google.android.gms.internal.zzag.zza zza1 = (com.google.android.gms.internal.zzag.zza)map.get(zzaPY);
        if (zza1 == null)
        {
            return zzdf.zzBg();
        }
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaQq);
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
        obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaQr);
        if (obj != null)
        {
            obj1 = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        } else
        {
            obj1 = "=";
        }
        obj = zza.zzaQu;
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaQs);
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
                obj = zza.zzaQv;
                map = null;
            } else
            if ("backslash".equals(map))
            {
                obj = zza.zzaQw;
                map = new HashSet();
                zza(map, s);
                zza(map, ((String) (obj1)));
                map.remove(Character.valueOf('\\'));
            } else
            {
                zzbg.e((new StringBuilder()).append("Joiner: unsupported escape type: ").append(map).toString());
                return zzdf.zzBg();
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
        return zzdf.zzK(stringbuilder.toString());
_L2:
        flag = true;
        obj1 = zza1.zziV;
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
        while (i < zza1.zziW.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(s);
            }
            s1 = zzdf.zzg(zza1.zziW[i]);
            s2 = zzdf.zzg(zza1.zziX[i]);
            zza(stringbuilder, s1, ((zza) (obj)), map);
            stringbuilder.append(((String) (obj1)));
            zza(stringbuilder, s2, ((zza) (obj)), map);
            i++;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbP.toString();
        zzaPY = zzae.zzdz.toString();
        zzaQq = zzae.zzfx.toString();
        zzaQr = zzae.zzfB.toString();
        zzaQs = zzae.zzeU.toString();
    }
}
