// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbn, zzaw

class zzaZV
    implements Runnable
{

    final Uri zzaKy;
    final long zzaZU;
    final long zzaZV;
    final zzbn zzbbd;
    final com.google.android.gms.common.api. zzbbe;
    final String zzbbf;

    public void run()
    {
        Object obj;
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.v("WearableClient", "Executing sendFileToChannelTask");
        }
        if (!"file".equals(zzaKy.getScheme()))
        {
            Log.w("WearableClient", "Channel.sendFile used with non-file URI");
            zzbbe.zzx(new Status(10, "Channel.sendFile used with non-file URI"));
            return;
        }
        File file = new File(zzaKy.getPath());
        try
        {
            obj = ParcelFileDescriptor.open(file, 0x10000000);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("WearableClient", (new StringBuilder()).append("File couldn't be opened for Channel.sendFile: ").append(file).toString());
            zzbbe.zzx(new Status(13));
            return;
        }
        ((zzaw)zzbbd.zzoA()).zza(new r(zzbbe), zzbbf, ((ParcelFileDescriptor) (obj)), zzaZU, zzaZV);
        try
        {
            ((ParcelFileDescriptor) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
        }
        return;
        Object obj1;
        obj1;
        Log.w("WearableClient", "Channel.sendFile failed.", ((Throwable) (obj1)));
        zzbbe.zzx(new Status(8));
        try
        {
            ((ParcelFileDescriptor) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
        }
        return;
        obj1;
        try
        {
            ((ParcelFileDescriptor) (obj)).close();
        }
        catch (IOException ioexception)
        {
            Log.w("WearableClient", "Failed to close sourceFd", ioexception);
        }
        throw obj1;
    }

    r(zzbn zzbn1, Uri uri, com.google.android.gms.common.api. , String s, long l, long l1)
    {
        zzbbd = zzbn1;
        zzaKy = uri;
        zzbbe = ;
        zzbbf = s;
        zzaZU = l;
        zzaZV = l1;
        super();
    }
}
