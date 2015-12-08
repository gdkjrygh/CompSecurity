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
//            zzbk, zzat

class zzaVa
    implements Runnable
{

    final com.google.android.gms.common.api. zzaFp;
    final Uri zzaGx;
    final boolean zzaTS;
    final zzbk zzaUZ;
    final String zzaVa;

    public void run()
    {
        Object obj;
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.v("WearableClient", "Executing receiveFileFromChannelTask");
        }
        if (!"file".equals(zzaGx.getScheme()))
        {
            Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
            zzaFp.zzr(new Status(10, "Channel.receiveFile used with non-file URI"));
            return;
        }
        File file = new File(zzaGx.getPath());
        int i;
        if (zzaTS)
        {
            i = 0x2000000;
        } else
        {
            i = 0;
        }
        try
        {
            obj = ParcelFileDescriptor.open(file, i | 0x20000000);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("WearableClient", (new StringBuilder()).append("File couldn't be opened for Channel.receiveFile: ").append(file).toString());
            zzaFp.zzr(new Status(13));
            return;
        }
        ((zzat)zzaUZ.zznM()).zza(new u(zzaFp), zzaVa, ((ParcelFileDescriptor) (obj)));
        try
        {
            ((ParcelFileDescriptor) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
        }
        return;
        Object obj1;
        obj1;
        Log.w("WearableClient", "Channel.receiveFile failed.", ((Throwable) (obj1)));
        zzaFp.zzr(new Status(8));
        try
        {
            ((ParcelFileDescriptor) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
        }
        return;
        obj1;
        try
        {
            ((ParcelFileDescriptor) (obj)).close();
        }
        catch (IOException ioexception)
        {
            Log.w("WearableClient", "Failed to close targetFd", ioexception);
        }
        throw obj1;
    }

    u(zzbk zzbk1, Uri uri, com.google.android.gms.common.api. , boolean flag, String s)
    {
        zzaUZ = zzbk1;
        zzaGx = uri;
        zzaFp = ;
        zzaTS = flag;
        zzaVa = s;
        super();
    }
}
