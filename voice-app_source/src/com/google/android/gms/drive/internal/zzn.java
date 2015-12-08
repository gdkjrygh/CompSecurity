// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzn extends Metadata
{

    private final MetadataBundle zzaeF;

    public zzn(MetadataBundle metadatabundle)
    {
        zzaeF = metadatabundle;
    }

    public Object freeze()
    {
        return zzpl();
    }

    public boolean isDataValid()
    {
        return zzaeF != null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Metadata [mImpl=").append(zzaeF).append("]").toString();
    }

    public Object zza(MetadataField metadatafield)
    {
        return zzaeF.zza(metadatafield);
    }

    public Metadata zzpl()
    {
        return new zzn(MetadataBundle.zza(zzaeF));
    }
}
