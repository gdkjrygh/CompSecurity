// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbn

class zzQu
    implements Callable
{

    final byte zzQu[];
    final ParcelFileDescriptor zzbbc;
    final zzbn zzbbd;

    public Object call()
        throws Exception
    {
        return zzCI();
    }

    public Boolean zzCI()
    {
        android.os.ileDescriptor.AutoCloseOutputStream autocloseoutputstream;
        if (Log.isLoggable("WearableClient", 3))
        {
            Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(zzbbc).toString());
        }
        autocloseoutputstream = new android.os.ileDescriptor.AutoCloseOutputStream(zzbbc);
        Object obj;
        autocloseoutputstream.write(zzQu);
        autocloseoutputstream.flush();
        if (Log.isLoggable("WearableClient", 3))
        {
            Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(zzbbc).toString());
        }
        obj = Boolean.valueOf(true);
        IOException ioexception;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzbbc).toString());
            }
            autocloseoutputstream.close();
        }
        catch (IOException ioexception1)
        {
            return ((Boolean) (obj));
        }
        return ((Boolean) (obj));
        obj;
        Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(zzbbc).toString());
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzbbc).toString());
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        return Boolean.valueOf(false);
        obj;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzbbc).toString());
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        throw obj;
    }

    tream(zzbn zzbn1, ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        zzbbd = zzbn1;
        zzbbc = parcelfiledescriptor;
        zzQu = abyte0;
        super();
    }
}
