// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public static final class zzNB
{

    private final String mName;
    private boolean zzNA;
    private int zzNB;
    private boolean zzNC;
    private String zzND;
    private final List zzNE = new ArrayList();
    private BitSet zzNF;
    private String zzNG;
    private String zzNz;

    public zzNB zzJ(boolean flag)
    {
        zzNA = flag;
        return this;
    }

    public zzNA zzK(boolean flag)
    {
        zzNC = flag;
        return this;
    }

    public zzNC zzaj(int i)
    {
        if (zzNF == null)
        {
            zzNF = new BitSet();
        }
        zzNF.set(i);
        return this;
    }

    public zzNF zzbr(String s)
    {
        zzNz = s;
        return this;
    }

    public zzNz zzbs(String s)
    {
        zzNG = s;
        return this;
    }

    public RegisterSectionInfo zzkM()
    {
        int i = 0;
        int ai[] = null;
        if (zzNF != null)
        {
            int ai1[] = new int[zzNF.cardinality()];
            int j = zzNF.nextSetBit(0);
            do
            {
                ai = ai1;
                if (j < 0)
                {
                    break;
                }
                ai1[i] = j;
                j = zzNF.nextSetBit(j + 1);
                i++;
            } while (true);
        }
        return new RegisterSectionInfo(mName, zzNz, zzNA, zzNB, zzNC, zzND, (Feature[])zzNE.toArray(new Feature[zzNE.size()]), ai, zzNG);
    }

    public (String s)
    {
        mName = s;
        zzNB = 1;
    }
}
