// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzh, zzm, zzo, zzq, 
//            zzn

public abstract class zzi extends zzh
{
    static class zza extends Exception
    {

        public zza()
        {
        }

        public zza(Throwable throwable)
        {
            super(throwable);
        }
    }


    private static long startTime = 0L;
    private static String zzlA;
    private static String zzlB;
    private static zzo zzlC;
    static boolean zzlD = false;
    private static Method zzlo;
    private static Method zzlp;
    private static Method zzlq;
    private static Method zzlr;
    private static Method zzls;
    private static Method zzlt;
    private static Method zzlu;
    private static Method zzlv;
    private static Method zzlw;
    private static Method zzlx;
    private static Method zzly;
    private static String zzlz;

    protected zzi(Context context, zzm zzm1, zzn zzn)
    {
        super(context, zzm1, zzn);
    }

    static String zza(Context context, zzm zzm1)
        throws zza
    {
        if (zzlA != null)
        {
            return zzlA;
        }
        if (zzlr == null)
        {
            throw new zza();
        }
        try
        {
            context = (ByteBuffer)zzlr.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        zzlA = zzm1.zza(context.array(), true);
        context = zzlA;
        return context;
    }

    static ArrayList zza(MotionEvent motionevent, DisplayMetrics displaymetrics)
        throws zza
    {
        if (zzls == null || motionevent == null)
        {
            throw new zza();
        }
        try
        {
            motionevent = (ArrayList)zzls.invoke(null, new Object[] {
                motionevent, displaymetrics
            });
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new zza(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new zza(motionevent);
        }
        return motionevent;
    }

    protected static void zza(String s, Context context, zzm zzm1)
    {
        com/google/android/gms/internal/zzi;
        JVM INSTR monitorenter ;
        boolean flag = zzlD;
        if (!flag)
        {
            try
            {
                zzlC = new zzo(zzm1, null);
                zzlz = s;
                zzi(context);
                startTime = zzw().longValue();
                zzlD = true;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                com/google/android/gms/internal/zzi;
            }
        }
        com/google/android/gms/internal/zzi;
        JVM INSTR monitorexit ;
        return;
        throw s;
    }

    static String zzb(Context context, zzm zzm1)
        throws zza
    {
        if (zzlB != null)
        {
            return zzlB;
        }
        if (zzlu == null)
        {
            throw new zza();
        }
        try
        {
            context = (ByteBuffer)zzlu.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        zzlB = zzm1.zza(context.array(), true);
        context = zzlB;
        return context;
    }

    private static String zzb(byte abyte0[], String s)
        throws zza
    {
        try
        {
            abyte0 = new String(zzlC.zzc(abyte0, s), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new zza(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new zza(abyte0);
        }
        return abyte0;
    }

    static String zzd(Context context)
        throws zza
    {
        if (zzlt == null)
        {
            throw new zza();
        }
        try
        {
            context = (String)zzlt.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        return context;
    }

    static ArrayList zze(Context context)
        throws zza
    {
        if (zzlv == null)
        {
            throw new zza();
        }
        try
        {
            context = (ArrayList)zzlv.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (context.size() == 2)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new zza();
        return context;
    }

    static int[] zzf(Context context)
        throws zza
    {
        if (zzlw == null)
        {
            throw new zza();
        }
        try
        {
            context = (int[])zzlw.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        return context;
    }

    static int zzg(Context context)
        throws zza
    {
        if (zzlx == null)
        {
            throw new zza();
        }
        int i;
        try
        {
            i = ((Integer)zzlx.invoke(null, new Object[] {
                context
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        return i;
    }

    static int zzh(Context context)
        throws zza
    {
        if (zzly == null)
        {
            throw new zza();
        }
        int i;
        try
        {
            i = ((Integer)zzly.invoke(null, new Object[] {
                context
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        return i;
    }

    private static void zzi(Context context)
        throws zza
    {
        File file;
        File file1;
        byte abyte0[];
        String s;
        byte abyte1[];
        Class class1;
        Object obj;
        Class class2;
        Class class3;
        Class class4;
        Class class5;
        Class class6;
        Class class7;
        Class class8;
        Object obj1;
        try
        {
            abyte0 = zzlC.zzc(zzq.getKey());
            abyte1 = zzlC.zzc(abyte0, zzq.zzE());
            file1 = context.getCacheDir();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        file = file1;
        if (file1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        file1 = context.getDir("dex", 0);
        file = file1;
        if (file1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        file1 = File.createTempFile("ads", ".jar", file);
        obj = new FileOutputStream(file1);
        ((FileOutputStream) (obj)).write(abyte1, 0, abyte1.length);
        ((FileOutputStream) (obj)).close();
        obj1 = new DexClassLoader(file1.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
        context = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzJ()));
        class1 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzX()));
        obj = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzR()));
        class2 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzN()));
        class3 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzZ()));
        class4 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzL()));
        class5 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzV()));
        class6 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzT()));
        class7 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzH()));
        class8 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzP()));
        obj1 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzF()));
        zzlo = context.getMethod(zzb(abyte0, zzq.zzK()), new Class[0]);
        zzlp = class1.getMethod(zzb(abyte0, zzq.zzY()), new Class[0]);
        zzlq = ((Class) (obj)).getMethod(zzb(abyte0, zzq.zzS()), new Class[0]);
        zzlr = class2.getMethod(zzb(abyte0, zzq.zzO()), new Class[] {
            android/content/Context
        });
        zzls = class3.getMethod(zzb(abyte0, zzq.zzaa()), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        zzlt = class4.getMethod(zzb(abyte0, zzq.zzM()), new Class[] {
            android/content/Context
        });
        zzlu = class5.getMethod(zzb(abyte0, zzq.zzW()), new Class[] {
            android/content/Context
        });
        zzlv = class6.getMethod(zzb(abyte0, zzq.zzU()), new Class[] {
            android/content/Context
        });
        zzlw = class7.getMethod(zzb(abyte0, zzq.zzI()), new Class[] {
            android/content/Context
        });
        zzlx = class8.getMethod(zzb(abyte0, zzq.zzQ()), new Class[] {
            android/content/Context
        });
        zzly = ((Class) (obj1)).getMethod(zzb(abyte0, zzq.zzG()), new Class[] {
            android/content/Context
        });
        context = file1.getName();
        file1.delete();
        (new File(file, context.replace(".jar", ".dex"))).delete();
        return;
        context;
        s = file1.getName();
        file1.delete();
        (new File(file, s.replace(".jar", ".dex"))).delete();
        throw context;
    }

    static String zzv()
        throws zza
    {
        if (zzlz == null)
        {
            throw new zza();
        } else
        {
            return zzlz;
        }
    }

    static Long zzw()
        throws zza
    {
        if (zzlo == null)
        {
            throw new zza();
        }
        Long long1;
        try
        {
            long1 = (Long)zzlo.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new zza(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new zza(invocationtargetexception);
        }
        return long1;
    }

    static String zzx()
        throws zza
    {
        if (zzlq == null)
        {
            throw new zza();
        }
        String s;
        try
        {
            s = (String)zzlq.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new zza(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new zza(invocationtargetexception);
        }
        return s;
    }

    static Long zzy()
        throws zza
    {
        if (zzlp == null)
        {
            throw new zza();
        }
        Long long1;
        try
        {
            long1 = (Long)zzlp.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new zza(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new zza(invocationtargetexception);
        }
        return long1;
    }

    protected void zzb(Context context)
    {
        try
        {
            zza(1, zzx());
        }
        catch (zza zza9) { }
        try
        {
            zza(2, zzv());
        }
        catch (zza zza8) { }
        try
        {
            long l = zzw().longValue();
            zza(25, l);
            if (startTime != 0L)
            {
                zza(17, l - startTime);
                zza(23, startTime);
            }
        }
        catch (zza zza7) { }
        try
        {
            ArrayList arraylist = zze(context);
            zza(31, ((Long)arraylist.get(0)).longValue());
            zza(32, ((Long)arraylist.get(1)).longValue());
        }
        catch (zza zza6) { }
        try
        {
            zza(33, zzy().longValue());
        }
        catch (zza zza5) { }
        try
        {
            zza(27, zza(context, zzlm));
        }
        catch (zza zza4) { }
        try
        {
            zza(29, zzb(context, zzlm));
        }
        catch (zza zza3) { }
        try
        {
            int ai[] = zzf(context);
            zza(5, ai[0]);
            zza(6, ai[1]);
        }
        catch (zza zza2) { }
        try
        {
            zza(12, zzg(context));
        }
        catch (zza zza1) { }
        try
        {
            zza(3, zzh(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

    protected void zzc(Context context)
    {
        try
        {
            zza(2, zzv());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            zza(1, zzx());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            zza(25, zzw().longValue());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            context = zza(zzlk, zzll);
            zza(14, ((Long)context.get(0)).longValue());
            zza(15, ((Long)context.get(1)).longValue());
            if (context.size() >= 3)
            {
                zza(16, ((Long)context.get(2)).longValue());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

}
