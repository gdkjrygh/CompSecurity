// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.formats.zzc;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            zzgf, zzlr

class zzzF
    implements a
{

    final zzgf zzDb;
    final boolean zzDj;
    final String zzzF;

    public zzc zzfu()
    {
        zzDb.zza(2, zzDj);
        return null;
    }

    public Object zzfv()
    {
        return zzfu();
    }

    public zzc zzg(InputStream inputstream)
    {
        try
        {
            inputstream = zzlr.zzk(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            zzDb.zza(2, zzDj);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            zzDb.zza(2, zzDj);
            return null;
        } else
        {
            return new zzc(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(zzzF));
        }
    }

    public Object zzh(InputStream inputstream)
    {
        return zzg(inputstream);
    }

    mats.zzc(zzgf zzgf1, boolean flag, String s)
    {
        zzDb = zzgf1;
        zzDj = flag;
        zzzF = s;
        super();
    }
}
