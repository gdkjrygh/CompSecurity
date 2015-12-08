// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzlo

public class zzlr extends zzj
{

    public static final zzlr zzahD = new zzlr();

    private zzlr()
    {
        super("driveId", Arrays.asList(new String[] {
            "sqlId", "resourceId", "mimeType"
        }), Arrays.asList(new String[] {
            "dbInstanceId"
        }), 0x3e8fa0);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzm(dataholder, i, j);
    }

    protected DriveId zzm(DataHolder dataholder, int i, int j)
    {
        long l = dataholder.zznb().getLong("dbInstanceId");
        int k;
        if ("application/vnd.google-apps.folder".equals(dataholder.zzd(zzlo.zzahg.getName(), i, j)))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        return new DriveId(dataholder.zzd("resourceId", i, j), Long.valueOf(dataholder.zzb("sqlId", i, j)).longValue(), l, k);
    }

}
