// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class zzu
{

    protected static final Comparator zzaw = new Comparator() {

        public int compare(Object obj, Object obj1)
        {
            return zza((byte[])obj, (byte[])obj1);
        }

        public int zza(byte abyte0[], byte abyte1[])
        {
            return abyte0.length - abyte1.length;
        }

    };
    private List zzas;
    private List zzat;
    private int zzau;
    private final int zzav;

    public zzu(int i)
    {
        zzas = new LinkedList();
        zzat = new ArrayList(64);
        zzau = 0;
        zzav = i;
    }

    private void zzy()
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte0[];
        for (; zzau > zzav; zzau = zzau - abyte0.length)
        {
            abyte0 = (byte[])zzas.remove(0);
            zzat.remove(abyte0);
        }

        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = abyte0.length;
        j = zzav;
        if (i <= j) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        zzas.add(abyte0);
        j = Collections.binarySearch(zzat, abyte0, zzaw);
        i = j;
        if (j < 0)
        {
            i = -j - 1;
        }
        zzat.add(i, abyte0);
        zzau = zzau + abyte0.length;
        zzy();
        if (true) goto _L2; else goto _L4
_L4:
        abyte0;
        throw abyte0;
    }

    public byte[] zzb(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = 0;
_L8:
        if (j >= zzat.size()) goto _L2; else goto _L1
_L1:
        byte abyte0[] = (byte[])zzat.get(j);
        if (abyte0.length < i) goto _L4; else goto _L3
_L3:
        zzau = zzau - abyte0.length;
        zzat.remove(j);
        zzas.remove(abyte0);
_L6:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        abyte0 = new byte[i];
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
