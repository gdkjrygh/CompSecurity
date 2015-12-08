// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl, zzv, zzu

private static final class zzTP
{

    private final ComponentName zzTP;
    private final String zzso;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzTP))
            {
                return false;
            }
            obj = (zzTP)obj;
            if (!zzu.equal(zzso, ((zzso) (obj)).zzso) || !zzu.equal(zzTP, ((zzTP) (obj)).zzTP))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzso, zzTP
        });
    }

    public String toString()
    {
        if (zzso == null)
        {
            return zzTP.flattenToString();
        } else
        {
            return zzso;
        }
    }

    public Intent zzmh()
    {
        if (zzso != null)
        {
            return (new Intent(zzso)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(zzTP);
        }
    }

    public (ComponentName componentname)
    {
        zzso = null;
        zzTP = (ComponentName)zzv.zzr(componentname);
    }

    public zzTP(String s)
    {
        zzso = zzv.zzbS(s);
        zzTP = null;
    }
}
