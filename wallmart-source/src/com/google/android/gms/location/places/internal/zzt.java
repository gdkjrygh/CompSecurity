// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzrn;
import com.google.android.gms.internal.zzrw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzt extends zzc
{

    private final String TAG = "SafeDataBufferRef";

    public zzt(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    protected int zzA(String s, int i)
    {
        int j = i;
        if (zzcd(s))
        {
            j = i;
            if (!zzcf(s))
            {
                j = getInteger(s);
            }
        }
        return j;
    }

    protected String zzD(String s, String s1)
    {
        String s2 = s1;
        if (zzcd(s))
        {
            s2 = s1;
            if (!zzcf(s))
            {
                s2 = getString(s);
            }
        }
        return s2;
    }

    protected SafeParcelable zza(String s, android.os.Parcelable.Creator creator)
    {
        s = zzc(s, null);
        if (s == null)
        {
            return null;
        } else
        {
            return com.google.android.gms.common.internal.safeparcel.zzc.zza(s, creator);
        }
    }

    protected List zza(String s, android.os.Parcelable.Creator creator, List list)
    {
        s = zzc(s, null);
        if (s != null) goto _L2; else goto _L1
_L1:
        zzrn zzrn1;
        return list;
_L2:
        byte abyte0[][];
        int j;
        if ((zzrn1 = zzrn.zzx(s)).zzbbM == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = new ArrayList(zzrn1.zzbbM.length);
        abyte0 = zzrn1.zzbbM;
        j = abyte0.length;
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s.add(com.google.android.gms.common.internal.safeparcel.zzc.zza(abyte0[i], creator));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        return s;
        s;
        if (Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected List zza(String s, List list)
    {
        s = zzc(s, null);
        if (s != null) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        ArrayList arraylist;
        if (((zzrn) (s = zzrn.zzx(s))).zzbbL == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist = new ArrayList(((zzrn) (s)).zzbbL.length);
        int i = 0;
_L4:
        if (i >= ((zzrn) (s)).zzbbL.length)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Integer.valueOf(((zzrn) (s)).zzbbL[i]));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        return arraylist;
        s;
        if (Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected float zzb(String s, float f)
    {
        float f1 = f;
        if (zzcd(s))
        {
            f1 = f;
            if (!zzcf(s))
            {
                f1 = getFloat(s);
            }
        }
        return f1;
    }

    protected List zzb(String s, List list)
    {
        s = zzc(s, null);
        if (s != null) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        if (((zzrn) (s = zzrn.zzx(s))).zzbbK == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = Arrays.asList(((zzrn) (s)).zzbbK);
        return s;
        s;
        if (Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected byte[] zzc(String s, byte abyte0[])
    {
        byte abyte1[] = abyte0;
        if (zzcd(s))
        {
            abyte1 = abyte0;
            if (!zzcf(s))
            {
                abyte1 = getByteArray(s);
            }
        }
        return abyte1;
    }

    protected boolean zzh(String s, boolean flag)
    {
        boolean flag1 = flag;
        if (zzcd(s))
        {
            flag1 = flag;
            if (!zzcf(s))
            {
                flag1 = getBoolean(s);
            }
        }
        return flag1;
    }
}
