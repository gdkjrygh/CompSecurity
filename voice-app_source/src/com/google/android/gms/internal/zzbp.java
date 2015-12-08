// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzbn

public class zzbp
{
    public static class zza
    {

        final long value;
        final String zzrT;

        public boolean equals(Object obj)
        {
            while (obj == null || !(obj instanceof zza) || ((zza)obj).value != value) 
            {
                return false;
            }
            return true;
        }

        public int hashCode()
        {
            return (int)value;
        }

        zza(long l, String s)
        {
            value = l;
            zzrT = s;
        }
    }


    static long zza(int i, int j, long l, long l1, long l2)
    {
        return (((((l + 0x4000ffffL) - ((((long)i + 0x7fffffffL) % 0x4000ffffL) * l1) % 0x4000ffffL) % 0x4000ffffL) * l2) % 0x4000ffffL + ((long)j + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
    }

    static long zza(long l, int i)
    {
        long l1;
        if (i == 0)
        {
            l1 = 1L;
        } else
        {
            l1 = l;
            if (i != 1)
            {
                if (i % 2 == 0)
                {
                    return zza((l * l) % 0x4000ffffL, i / 2) % 0x4000ffffL;
                } else
                {
                    return ((zza((l * l) % 0x4000ffffL, i / 2) % 0x4000ffffL) * l) % 0x4000ffffL;
                }
            }
        }
        return l1;
    }

    static String zza(String as[], int i, int j)
    {
        if (as.length < i + j)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaz("Unable to construct shingle");
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int k = i; k < (i + j) - 1; k++)
        {
            stringbuffer.append(as[k]);
            stringbuffer.append(' ');
        }

        stringbuffer.append(as[(i + j) - 1]);
        return stringbuffer.toString();
    }

    static void zza(int i, long l, String s, PriorityQueue priorityqueue)
    {
        s = new zza(l, s);
        break MISSING_BLOCK_LABEL_10;
        if ((priorityqueue.size() != i || ((zza)priorityqueue.peek()).value <= ((zza) (s)).value) && !priorityqueue.contains(s))
        {
            priorityqueue.add(s);
            if (priorityqueue.size() > i)
            {
                priorityqueue.poll();
                return;
            }
        }
        return;
    }

    public static void zza(String as[], int i, int j, PriorityQueue priorityqueue)
    {
        long l = zzb(as, 0, j);
        zza(i, l, zza(as, 0, j), priorityqueue);
        long l1 = zza(0x1001fffL, j - 1);
        for (int k = 1; k < (as.length - j) + 1; k++)
        {
            l = zza(zzbn.zzB(as[k - 1]), zzbn.zzB(as[(k + j) - 1]), l, l1, 0x1001fffL);
            zza(i, l, zza(as, k, j), priorityqueue);
        }

    }

    private static long zzb(String as[], int i, int j)
    {
        long l = ((long)zzbn.zzB(as[i]) + 0x7fffffffL) % 0x4000ffffL;
        for (int k = i + 1; k < i + j; k++)
        {
            l = ((l * 0x1001fffL) % 0x4000ffffL + ((long)zzbn.zzB(as[k]) + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
        }

        return l;
    }
}
