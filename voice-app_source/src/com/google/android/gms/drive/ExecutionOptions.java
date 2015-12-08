// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.drive.internal.zzs;

// Referenced classes of package com.google.android.gms.drive:
//            Drive

public final class ExecutionOptions
{
    public static final class Builder
    {

        private String zzadn;
        private boolean zzado;
        private int zzadp;

        public ExecutionOptions build()
        {
            if (zzadp == 1 && !zzado)
            {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            } else
            {
                return new ExecutionOptions(zzadn, zzado, zzadp);
            }
        }

        public Builder setConflictStrategy(int i)
        {
            if (!ExecutionOptions.zzbY(i))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized value for conflict strategy: ").append(i).toString());
            } else
            {
                zzadp = i;
                return this;
            }
        }

        public Builder setNotifyOnCompletion(boolean flag)
        {
            zzado = flag;
            return this;
        }

        public Builder setTrackingTag(String s)
        {
            if (!ExecutionOptions.zzct(s))
            {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] {
                    Integer.valueOf(0x10000)
                }));
            } else
            {
                zzadn = s;
                return this;
            }
        }

        public Builder()
        {
            zzadp = 0;
        }
    }


    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 0x10000;
    private final String zzadn;
    private final boolean zzado;
    private final int zzadp;

    public ExecutionOptions(String s, boolean flag, int i)
    {
        zzadn = s;
        zzado = flag;
        zzadp = i;
    }

    public static void zza(GoogleApiClient googleapiclient, ExecutionOptions executionoptions)
    {
        googleapiclient = (zzs)googleapiclient.zza(Drive.zzNX);
        if (executionoptions.zzpj() && !googleapiclient.zzpE())
        {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        } else
        {
            return;
        }
    }

    public static boolean zzbX(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public static boolean zzbY(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
    }

    public static boolean zzct(String s)
    {
        return s != null && !s.isEmpty() && s.length() <= 0x10000;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (ExecutionOptions)obj;
        if (!zzt.equal(zzadn, ((ExecutionOptions) (obj)).zzadn) || zzadp != ((ExecutionOptions) (obj)).zzadp)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzado == ((ExecutionOptions) (obj)).zzado) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzadn, Integer.valueOf(zzadp), Boolean.valueOf(zzado)
        });
    }

    public String zzpi()
    {
        return zzadn;
    }

    public boolean zzpj()
    {
        return zzado;
    }

    public int zzpk()
    {
        return zzadp;
    }
}
