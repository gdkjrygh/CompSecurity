// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzx

public abstract class zze
{
    private static class zza extends zze
    {

        List zzadb;

        public zze zza(zze zze1)
        {
            ArrayList arraylist = new ArrayList(zzadb);
            arraylist.add(zzx.zzv(zze1));
            return new zza(arraylist);
        }

        public boolean zzd(char c)
        {
            for (Iterator iterator = zzadb.iterator(); iterator.hasNext();)
            {
                if (((zze)iterator.next()).zzd(c))
                {
                    return true;
                }
            }

            return false;
        }

        zza(List list)
        {
            zzadb = list;
        }
    }


    public static final zze zzacG = zza("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").zza(zza('\u2000', '\u200A'));
    public static final zze zzacH = zza("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").zza(zza('\u2000', '\u2006')).zza(zza('\u2008', '\u200A'));
    public static final zze zzacI = zza('\0', '\177');
    public static final zze zzacJ;
    public static final zze zzacK = zza('\t', '\r').zza(zza('\034', ' ')).zza(zzc('\u1680')).zza(zzc('\u180E')).zza(zza('\u2000', '\u2006')).zza(zza('\u2008', '\u200B')).zza(zza('\u2028', '\u2029')).zza(zzc('\u205F')).zza(zzc('\u3000'));
    public static final zze zzacL = new zze() {

        public boolean zzd(char c1)
        {
            return Character.isDigit(c1);
        }

    };
    public static final zze zzacM = new zze() {

        public boolean zzd(char c1)
        {
            return Character.isLetter(c1);
        }

    };
    public static final zze zzacN = new zze() {

        public boolean zzd(char c1)
        {
            return Character.isLetterOrDigit(c1);
        }

    };
    public static final zze zzacO = new zze() {

        public boolean zzd(char c1)
        {
            return Character.isUpperCase(c1);
        }

    };
    public static final zze zzacP = new zze() {

        public boolean zzd(char c1)
        {
            return Character.isLowerCase(c1);
        }

    };
    public static final zze zzacQ = zza('\0', '\037').zza(zza('\177', '\237'));
    public static final zze zzacR = zza('\0', ' ').zza(zza('\177', '\240')).zza(zzc('\255')).zza(zza('\u0600', '\u0603')).zza(zza("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).zza(zza('\u2000', '\u200F')).zza(zza('\u2028', '\u202F')).zza(zza('\u205F', '\u2064')).zza(zza('\u206A', '\u206F')).zza(zzc('\u3000')).zza(zza('\uD800', '\uF8FF')).zza(zza("\uFEFF\uFFF9\uFFFA\uFFFB"));
    public static final zze zzacS = zza('\0', '\u04F9').zza(zzc('\u05BE')).zza(zza('\u05D0', '\u05EA')).zza(zzc('\u05F3')).zza(zzc('\u05F4')).zza(zza('\u0600', '\u06FF')).zza(zza('\u0750', '\u077F')).zza(zza('\u0E00', '\u0E7F')).zza(zza('\u1E00', '\u20AF')).zza(zza('\u2100', '\u213A')).zza(zza('\uFB50', '\uFDFF')).zza(zza('\uFE70', '\uFEFF')).zza(zza('\uFF61', '\uFFDC'));
    public static final zze zzacT = new zze() {

        public zze zza(zze zze2)
        {
            zzx.zzv(zze2);
            return this;
        }

        public boolean zzb(CharSequence charsequence)
        {
            zzx.zzv(charsequence);
            return true;
        }

        public boolean zzd(char c1)
        {
            return true;
        }

    };
    public static final zze zzacU = new zze() {

        public zze zza(zze zze2)
        {
            return (zze)zzx.zzv(zze2);
        }

        public boolean zzb(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

        public boolean zzd(char c1)
        {
            return false;
        }

    };

    public zze()
    {
    }

    public static zze zza(char c, char c1)
    {
        boolean flag;
        if (c1 >= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzZ(flag);
        return new zze(c, c1) {

            final char zzacY;
            final char zzacZ;

            public boolean zzd(char c2)
            {
                return zzacY <= c2 && c2 <= zzacZ;
            }

            
            {
                zzacY = c;
                zzacZ = c1;
                super();
            }
        };
    }

    public static zze zza(CharSequence charsequence)
    {
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            return new zze(charsequence) {

                final char zzacX[];

                public boolean zzd(char c)
                {
                    return Arrays.binarySearch(zzacX, c) >= 0;
                }

            
            {
                zzacX = ac;
                super();
            }
            };

        case 0: // '\0'
            return zzacU;

        case 1: // '\001'
            return zzc(charsequence.charAt(0));

        case 2: // '\002'
            return new zze(charsequence.charAt(0), charsequence.charAt(1)) {

                final char zzacV;
                final char zzacW;

                public boolean zzd(char c)
                {
                    return c == zzacV || c == zzacW;
                }

            
            {
                zzacV = c;
                zzacW = c1;
                super();
            }
            };
        }
    }

    public static zze zzc(char c)
    {
        return new zze(c) {

            final char zzada;

            public zze zza(zze zze1)
            {
                if (zze1.zzd(zzada))
                {
                    return zze1;
                } else
                {
                    return zza(zze1);
                }
            }

            public boolean zzd(char c1)
            {
                return c1 == zzada;
            }

            
            {
                zzada = c;
                super();
            }
        };
    }

    public zze zza(zze zze1)
    {
        return new zza(Arrays.asList(new zze[] {
            this, (zze)zzx.zzv(zze1)
        }));
    }

    public boolean zzb(CharSequence charsequence)
    {
        for (int i = charsequence.length() - 1; i >= 0; i--)
        {
            if (!zzd(charsequence.charAt(i)))
            {
                return false;
            }
        }

        return true;
    }

    public abstract boolean zzd(char c);

    static 
    {
        zze zze1 = zza('0', '9');
        char ac[] = "\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray();
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            char c = ac[i];
            zze1 = zze1.zza(zza(c, (char)(c + 9)));
        }

        zzacJ = zze1;
    }
}
