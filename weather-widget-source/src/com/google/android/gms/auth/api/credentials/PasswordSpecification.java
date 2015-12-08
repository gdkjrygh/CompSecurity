// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            zze

public final class PasswordSpecification
    implements SafeParcelable
{
    public static class zza
    {

        private final List zzRr = new ArrayList();
        private final List zzRs = new ArrayList();
        private int zzRt;
        private int zzRu;
        private final TreeSet zzRw = new TreeSet();

        private void zzly()
        {
            Iterator iterator = zzRs.iterator();
            int i;
            for (i = 0; iterator.hasNext(); i = ((Integer)iterator.next()).intValue() + i) { }
            if (i > zzRu)
            {
                throw new zzb("required character count cannot be greater than the max password size");
            } else
            {
                return;
            }
        }

        private void zzlz()
        {
            boolean aflag[] = new boolean[95];
            for (Iterator iterator = zzRr.iterator(); iterator.hasNext();)
            {
                char ac[] = ((String)iterator.next()).toCharArray();
                int j = ac.length;
                int i = 0;
                while (i < j) 
                {
                    char c = ac[i];
                    if (aflag[c - 32])
                    {
                        throw new zzb((new StringBuilder()).append("character ").append(c).append(" occurs in more than one required character set").toString());
                    }
                    aflag[c - 32] = true;
                    i++;
                }
            }

        }

        private TreeSet zzr(String s, String s1)
        {
            if (TextUtils.isEmpty(s))
            {
                throw new zzb((new StringBuilder()).append(s1).append(" cannot be null or empty").toString());
            }
            TreeSet treeset = new TreeSet();
            s = s.toCharArray();
            int j = s.length;
            for (int i = 0; i < j; i++)
            {
                char c = s[i];
                if (PasswordSpecification.zzc(c, 32, 126))
                {
                    throw new zzb((new StringBuilder()).append(s1).append(" must only contain ASCII printable characters").toString());
                }
                treeset.add(Character.valueOf(c));
            }

            return treeset;
        }

        public zza zzbD(String s)
        {
            zzRw.addAll(zzr(s, "allowedChars"));
            return this;
        }

        public zza zzf(String s, int i)
        {
            if (i < 1)
            {
                throw new zzb("count must be at least 1");
            } else
            {
                s = zzr(s, "requiredChars");
                zzRr.add(PasswordSpecification.zzc(s));
                zzRs.add(Integer.valueOf(i));
                return this;
            }
        }

        public zza zzh(int i, int j)
        {
            if (i < 1)
            {
                throw new zzb("minimumSize must be at least 1");
            }
            if (i > j)
            {
                throw new zzb("maximumSize must be greater than or equal to minimumSize");
            } else
            {
                zzRt = i;
                zzRu = j;
                return this;
            }
        }

        public PasswordSpecification zzlx()
        {
            if (zzRw.isEmpty())
            {
                throw new zzb("no allowed characters specified");
            } else
            {
                zzly();
                zzlz();
                return new PasswordSpecification(1, PasswordSpecification.zzc(zzRw), zzRr, zzRs, zzRt, zzRu);
            }
        }

        public zza()
        {
            zzRt = 12;
            zzRu = 16;
        }
    }

    public static class zzb extends Error
    {

        public zzb(String s)
        {
            super(s);
        }
    }


    public static final zze CREATOR = new zze();
    public static final PasswordSpecification zzRo = (new zza()).zzh(12, 16).zzbD("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zzf("abcdefghijkmnopqrstxyz", 1).zzf("ABCDEFGHJKLMNPQRSTXY", 1).zzf("3456789", 1).zzlx();
    public static final PasswordSpecification zzRp = (new zza()).zzh(12, 16).zzbD("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zzf("abcdefghijklmnopqrstuvwxyz", 1).zzf("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zzf("1234567890", 1).zzlx();
    final int mVersionCode;
    final String zzRq;
    final List zzRr;
    final List zzRs;
    final int zzRt;
    final int zzRu;
    private final int zzRv[] = zzlw();
    private final Random zzsT = new SecureRandom();

    PasswordSpecification(int i, String s, List list, List list1, int j, int k)
    {
        mVersionCode = i;
        zzRq = s;
        zzRr = Collections.unmodifiableList(list);
        zzRs = Collections.unmodifiableList(list1);
        zzRt = j;
        zzRu = k;
    }

    private int zza(char c)
    {
        return c - 32;
    }

    private static String zzb(Collection collection)
    {
        char ac[] = new char[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            ac[i] = ((Character)collection.next()).charValue();
        }

        return new String(ac);
    }

    private static boolean zzb(int i, int j, int k)
    {
        return i < j || i > k;
    }

    static String zzc(Collection collection)
    {
        return zzb(collection);
    }

    static boolean zzc(int i, int j, int k)
    {
        return zzb(i, j, k);
    }

    private int[] zzlw()
    {
        int ai[] = new int[95];
        Arrays.fill(ai, -1);
        Iterator iterator = zzRr.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            char ac[] = ((String)iterator.next()).toCharArray();
            int k = ac.length;
            for (int j = 0; j < k; j++)
            {
                ai[zza(ac[j])] = i;
            }

        }

        return ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
