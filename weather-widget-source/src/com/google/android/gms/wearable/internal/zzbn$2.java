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

class zzbbf
    implements Runnable
{

    final Uri zzaKy;
    final boolean zzaZT;
    final zzbn zzbbd;
    final com.google.android.gms.common.api. zzbbe;
    final String zzbbf;

    public void run()
    {
        Object obj;
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.v("WearableClient", "Executing receiveFileFromChannelTask");
        }
        if (!"file".equals(zzaKy.getScheme()))
        {
            Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
            zzbbe.zzx(new Status(10, "Channel.receiveFile used with non-file URI"));
            return;
        }
        File file = new File(zzaKy.getPath());
        int i;
        if (zzaZT)
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
            zzbbe.zzx(new Status(13));
            return;
        }
        ((zzaw)zzbbd.zzoA()).zza(new u(zzbbe), zzbbf, ((ParcelFileDescriptor) (obj)));
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
        zzbbe.zzx(new Status(8));
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

    u(zzbn zzbn1, Uri uri, com.google.android.gms.common.api. , boolean flag, String s)
    {
        zzbbd = zzbn1;
        zzaKy = uri;
        zzbbe = ;
        zzaZT = flag;
        zzbbf = s;
        super();
    }
}
