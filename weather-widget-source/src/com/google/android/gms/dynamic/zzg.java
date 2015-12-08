// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;

public abstract class zzg
{
    public static class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }

        public zza(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }


    private final String zzana;
    private Object zzanb;

    protected zzg(String s)
    {
        zzana = s;
    }

    protected final Object zzar(Context context)
        throws zza
    {
        if (zzanb == null)
        {
            zzx.zzv(context);
            context = GooglePlayServicesUtil.getRemoteContext(context);
            if (context == null)
            {
                throw new zza("Could not get remote context.");
            }
            context = context.getClassLoader();
            try
            {
                zzanb = zzd((IBinder)context.loadClass(zzana).newInstance());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new zza("Could not load creator class.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new zza("Could not instantiate creator.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new zza("Could not access creator.", context);
            }
        }
        return zzanb;
    }

    protected abstract Object zzd(IBinder ibinder);
}
