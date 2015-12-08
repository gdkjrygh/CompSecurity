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
//            zzfy, zzlg

class zzyL
    implements a
{

    final zzfy zzBO;
    final boolean zzBW;
    final String zzyL;

    public zzc zzfs()
    {
        zzBO.zza(2, zzBW);
        return null;
    }

    public Object zzft()
    {
        return zzfs();
    }

    public zzc zzg(InputStream inputstream)
    {
        try
        {
            inputstream = zzlg.zzk(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            zzBO.zza(2, zzBW);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            zzBO.zza(2, zzBW);
            return null;
        } else
        {
            return new zzc(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(zzyL));
        }
    }

    public Object zzh(InputStream inputstream)
    {
        return zzg(inputstream);
    }

    mats.zzc(zzfy zzfy1, boolean flag, String s)
    {
        zzBO = zzfy1;
        zzBW = flag;
        zzyL = s;
        super();
    }
}
