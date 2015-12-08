// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            zzby, zzbu, zzhl, zzhu, 
//            zzgk

public class zzgj
    implements Thread.UncaughtExceptionHandler
{

    private Context mContext;
    private VersionInfoParcel zzBp;
    private Thread.UncaughtExceptionHandler zzDn;
    private Thread.UncaughtExceptionHandler zzDo;

    public zzgj(Context context, VersionInfoParcel versioninfoparcel, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Thread.UncaughtExceptionHandler uncaughtexceptionhandler1)
    {
        zzDn = uncaughtexceptionhandler;
        zzDo = uncaughtexceptionhandler1;
        mContext = context;
        zzBp = versioninfoparcel;
    }

    public static zzgj zza(Context context, Thread thread, VersionInfoParcel versioninfoparcel)
    {
        if (context == null || thread == null || versioninfoparcel == null)
        {
            return null;
        }
        if (!zzz(context))
        {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = thread.getUncaughtExceptionHandler();
        context = new zzgj(context, versioninfoparcel, uncaughtexceptionhandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtexceptionhandler == null || !(uncaughtexceptionhandler instanceof zzgj))
        {
            try
            {
                thread.setUncaughtExceptionHandler(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzc("Fail to set UncaughtExceptionHandler.", context);
                return null;
            }
            return context;
        } else
        {
            return (zzgj)uncaughtexceptionhandler;
        }
    }

    private Throwable zzb(Throwable throwable)
    {
        if (((Boolean)zzby.zzuc.get()).booleanValue())
        {
            return throwable;
        }
        LinkedList linkedlist = new LinkedList();
        for (; throwable != null; throwable = throwable.getCause())
        {
            linkedlist.push(throwable);
        }

        throwable = null;
        do
        {
            if (linkedlist.isEmpty())
            {
                break;
            }
            Throwable throwable1 = (Throwable)linkedlist.pop();
            StackTraceElement astacktraceelement[] = throwable1.getStackTrace();
            ArrayList arraylist = new ArrayList();
            arraylist.add(new StackTraceElement(throwable1.getClass().getName(), "<filtered>", "<filtered>", 1));
            int j = astacktraceelement.length;
            int i = 0;
            boolean flag = false;
            while (i < j) 
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                if (zzao(stacktraceelement.getClassName()))
                {
                    arraylist.add(stacktraceelement);
                    flag = true;
                } else
                if (zzap(stacktraceelement.getClassName()))
                {
                    arraylist.add(stacktraceelement);
                } else
                {
                    arraylist.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
                i++;
            }
            if (flag)
            {
                if (throwable == null)
                {
                    throwable = new Throwable(throwable1.getMessage());
                } else
                {
                    throwable = new Throwable(throwable1.getMessage(), throwable);
                }
                throwable.setStackTrace((StackTraceElement[])arraylist.toArray(new StackTraceElement[0]));
            }
        } while (true);
        return throwable;
    }

    private static boolean zzz(Context context)
    {
        return ((Boolean)zzby.zzub.get()).booleanValue();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (!zza(throwable)) goto _L2; else goto _L1
_L1:
        if (Looper.getMainLooper().getThread() == thread) goto _L4; else goto _L3
_L3:
        zza(throwable, true);
_L6:
        return;
_L4:
        zza(throwable, false);
_L2:
        if (zzDn != null)
        {
            zzDn.uncaughtException(thread, throwable);
            return;
        }
        if (zzDo != null)
        {
            zzDo.uncaughtException(thread, throwable);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void zza(Throwable throwable, boolean flag)
    {
        if (zzz(mContext))
        {
            if ((throwable = zzb(throwable)) != null)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(zzb(throwable, flag));
                zzp.zzbx().zza(mContext, zzBp.zzIz, arraylist, zzp.zzbA().zzgf());
                return;
            }
        }
    }

    protected boolean zza(Throwable throwable)
    {
        boolean flag2 = true;
        if (throwable == null)
        {
            return false;
        }
        boolean flag = false;
        boolean flag1 = false;
        for (; throwable != null; throwable = throwable.getCause())
        {
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int j = astacktraceelement.length;
            for (int i = 0; i < j; i++)
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                if (zzao(stacktraceelement.getClassName()))
                {
                    flag1 = true;
                }
                if (getClass().getName().equals(stacktraceelement.getClassName()))
                {
                    flag = true;
                }
            }

        }

        if (!flag1 || flag)
        {
            flag2 = false;
        }
        return flag2;
    }

    protected boolean zzao(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        if (s.startsWith("com.google.android.gms.ads"))
        {
            return true;
        }
        if (s.startsWith("com.google.ads"))
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/zzgk);
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zza((new StringBuilder()).append("Fail to check class type for class ").append(s).toString(), exception);
            return false;
        }
        return flag;
    }

    protected boolean zzap(String s)
    {
        while (TextUtils.isEmpty(s) || !s.startsWith("android.") && !s.startsWith("java.")) 
        {
            return false;
        }
        return true;
    }

    String zzb(Throwable throwable, boolean flag)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(android.os.Build.VERSION.SDK_INT)).appendQueryParameter("device", zzp.zzbx().zzgt()).appendQueryParameter("js", zzBp.zzIz).appendQueryParameter("appid", mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringwriter.toString()).appendQueryParameter("eids", TextUtils.join(",", zzby.zzde())).appendQueryParameter("trapped", String.valueOf(flag)).toString();
    }
}
