// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            zzek, zzhy

class zzyI
    implements a
{

    final zzek zzyD;
    final boolean zzyI;

    public Drawable zza(InputStream inputstream)
    {
        try
        {
            inputstream = zzhy.zzd(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            zzyD.zza(2, zzyI);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            zzyD.zza(2, zzyI);
            return null;
        } else
        {
            return new BitmapDrawable(Resources.getSystem(), inputstream);
        }
    }

    public Object zzb(InputStream inputstream)
    {
        return zza(inputstream);
    }

    public Drawable zzel()
    {
        zzyD.zza(2, zzyI);
        return null;
    }

    public Object zzem()
    {
        return zzel();
    }

    e(zzek zzek1, boolean flag)
    {
        zzyD = zzek1;
        zzyI = flag;
        super();
    }
}
