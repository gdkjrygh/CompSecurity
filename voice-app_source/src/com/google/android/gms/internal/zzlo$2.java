// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.internal:
//            zzlo

static final class nternal.zzj extends zzj
{

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzk(dataholder, i, j);
    }

    protected BitmapTeleporter zzk(DataHolder dataholder, int i, int j)
    {
        throw new IllegalStateException("Thumbnail field is write only");
    }

    apTeleporter(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }
}
