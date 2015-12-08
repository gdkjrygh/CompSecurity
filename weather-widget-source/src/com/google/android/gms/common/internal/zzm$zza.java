// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzm, zzx, zzw

private static final class zzadY
{

    private final String zzOj;
    private final ComponentName zzadY;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzadY))
            {
                return false;
            }
            obj = (zzadY)obj;
            if (!zzw.equal(zzOj, ((zzOj) (obj)).zzOj) || !zzw.equal(zzadY, ((zzadY) (obj)).zzadY))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzOj, zzadY
        });
    }

    public String toString()
    {
        if (zzOj == null)
        {
            return zzadY.flattenToString();
        } else
        {
            return zzOj;
        }
    }

    public Intent zzoK()
    {
        if (zzOj != null)
        {
            return (new Intent(zzOj)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(zzadY);
        }
    }

    public (ComponentName componentname)
    {
        zzOj = null;
        zzadY = (ComponentName)zzx.zzv(componentname);
    }

    public zzadY(String s)
    {
        zzOj = zzx.zzcs(s);
        zzadY = null;
    }
}
