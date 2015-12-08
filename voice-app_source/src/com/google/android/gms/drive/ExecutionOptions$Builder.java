// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;


// Referenced classes of package com.google.android.gms.drive:
//            ExecutionOptions

public static final class zzadp
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

    public zzadp setConflictStrategy(int i)
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

    public zzadp setNotifyOnCompletion(boolean flag)
    {
        zzado = flag;
        return this;
    }

    public zzado setTrackingTag(String s)
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

    public ()
    {
        zzadp = 0;
    }
}
