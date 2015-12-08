// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzr

public final class zzx extends zzg
{

    private static final zzx zzabe = new zzx();

    private zzx()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zzb(Context context, int i, int j)
        throws com.google.android.gms.dynamic.zzg.zza
    {
        return zzabe.zzc(context, i, j);
    }

    private View zzc(Context context, int i, int j)
        throws com.google.android.gms.dynamic.zzg.zza
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzw(context);
            context = (View)zze.zzn(((zzr)zzak(context)).zza(zzd1, i, j));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.dynamic.zzg.zza((new StringBuilder()).append("Could not get button with size ").append(i).append(" and color ").append(j).toString(), context);
        }
        return context;
    }

    public zzr zzaJ(IBinder ibinder)
    {
        return zzr.zza.zzaI(ibinder);
    }

    public Object zzd(IBinder ibinder)
    {
        return zzaJ(ibinder);
    }

}
