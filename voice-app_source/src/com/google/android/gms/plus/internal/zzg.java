// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.plus.PlusOneDummyView;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzc

public final class zzg extends com.google.android.gms.dynamic.zzg
{

    private static final zzg zzaHt = new zzg();

    private zzg()
    {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    public static View zza(Context context, int i, int j, String s, int k)
    {
        if (s == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new PlusOneDummyView(context, i);
            }
        }
        s = (View)zze.zzn(((zzc)zzaHt.zzak(context)).zza(zze.zzw(context), i, j, s, k));
        return s;
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzdv(ibinder);
    }

    protected zzc zzdv(IBinder ibinder)
    {
        return zzc.zza.zzds(ibinder);
    }

}
