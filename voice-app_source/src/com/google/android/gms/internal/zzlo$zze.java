// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.internal.zzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzlo

public static class ernal.zzi extends zzi
{

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzd(dataholder, i, j);
    }

    protected Collection zzd(DataHolder dataholder, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        if (dataholder.zze("inDriveSpace", i, j))
        {
            arraylist.add(DriveSpace.zzadi);
        }
        if (dataholder.zze("isAppData", i, j))
        {
            arraylist.add(DriveSpace.zzadj);
        }
        if (dataholder.zze("inGooglePhotosSpace", i, j))
        {
            arraylist.add(DriveSpace.zzadk);
        }
        return arraylist;
    }

    public lder(int i)
    {
        super("spaces", Arrays.asList(new String[] {
            "inDriveSpace", "isAppData", "inGooglePhotosSpace"
        }), Collections.emptySet(), i);
    }
}
