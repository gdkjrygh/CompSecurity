// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzns;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzf

public class zzn extends zzd
{

    private volatile String zzJd;
    private Future zzKG;

    protected zzn(zzf zzf)
    {
        super(zzf);
    }

    static String zza(zzn zzn1)
    {
        return zzn1.zziS();
    }

    private boolean zzg(Context context, String s)
    {
        Context context1;
        Context context2;
        Context context3;
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        flag = false;
        zzu.zzcj(s);
        zzu.zzbZ("ClientId should be saved from worker thread");
        obj1 = null;
        obj2 = null;
        obj = null;
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        zza("Storing clientId", s);
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        context = context.openFileOutput("gaClientId", 0);
        context2 = context;
        context3 = context;
        context1 = context;
        context.write(s.getBytes());
        boolean flag1 = true;
        flag = flag1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zze("Failed to close clientId writing stream", context);
                return true;
            }
            flag = flag1;
        }
_L2:
        return flag;
        context;
        context1 = context2;
        zze("Error creating clientId file", context);
        if (context2 == null) goto _L2; else goto _L1
_L1:
        try
        {
            context2.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zze("Failed to close clientId writing stream", context);
            return false;
        }
        return false;
        context;
        context1 = context3;
        zze("Error writing to clientId file", context);
        if (context3 == null) goto _L2; else goto _L3
_L3:
        try
        {
            context3.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zze("Failed to close clientId writing stream", context);
            return false;
        }
        return false;
        context;
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zze("Failed to close clientId writing stream", s);
            }
        }
        throw context;
    }

    private String zziS()
    {
        String s;
        String s1;
        s1 = zziT();
        s = s1;
        if (!zzg(zzhS().getContext(), s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        zze("Error saving clientId file", exception);
        return "0";
    }

    protected String zzX(Context context)
    {
        zzu.zzbZ("ClientId should be loaded from worker thread");
        Object obj = context.openFileInput("gaClientId");
        Object obj1 = obj;
        byte abyte0[] = new byte[36];
        obj1 = obj;
        int i = ((FileInputStream) (obj)).read(abyte0, 0, abyte0.length);
        obj1 = obj;
        if (((FileInputStream) (obj)).available() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        zzaW("clientId file seems corrupted, deleting it.");
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zze("Failed to close client id reading stream", context);
                return null;
            }
        }
_L4:
        return null;
_L2:
        if (i >= 14)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        zzaW("clientId file is empty, deleting it.");
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zze("Failed to close client id reading stream", context);
                return null;
            }
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        String s = new String(abyte0, 0, i);
        obj1 = obj;
        zza("Read client id from disk", s);
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zze("Failed to close client id reading stream", context);
            }
        }
        return s;
        context;
        context = null;
_L10:
        if (context == null) goto _L4; else goto _L5
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zze("Failed to close client id reading stream", context);
            return null;
        }
        return null;
        IOException ioexception;
        ioexception;
        obj = null;
_L9:
        obj1 = obj;
        zze("Error reading client id file, deleting it", ioexception);
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj == null) goto _L4; else goto _L6
_L6:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zze("Failed to close client id reading stream", context);
            return null;
        }
        return null;
        context;
        obj1 = null;
_L8:
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                zze("Failed to close client id reading stream", obj);
            }
        }
        throw context;
        context;
        if (true) goto _L8; else goto _L7
_L7:
        ioexception;
          goto _L9
        context;
        context = ((Context) (obj));
          goto _L10
    }

    protected void zzhn()
    {
    }

    public String zziP()
    {
        zzia();
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzJd == null)
        {
            zzKG = zzhS().zzb(new Callable() {

                final zzn zzKH;

                public Object call()
                    throws Exception
                {
                    return zziU();
                }

                public String zziU()
                    throws Exception
                {
                    return zzKH.zziR();
                }

            
            {
                zzKH = zzn.this;
                super();
            }
            });
        }
        obj = zzKG;
        if (obj == null) goto _L2; else goto _L1
_L1:
        zzJd = (String)zzKG.get();
_L3:
        if (zzJd == null)
        {
            zzJd = "0";
        }
        zza("Loaded clientId", zzJd);
        zzKG = null;
_L2:
        obj = zzJd;
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Object obj1;
        obj1;
        zzd("ClientId loading or generation was interrupted", obj1);
        zzJd = "0";
          goto _L3
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        zze("Failed to load or generate client id", obj1);
        zzJd = "0";
          goto _L3
    }

    String zziQ()
    {
        this;
        JVM INSTR monitorenter ;
        zzJd = null;
        zzKG = zzhS().zzb(new Callable() {

            final zzn zzKH;

            public Object call()
                throws Exception
            {
                return zziU();
            }

            public String zziU()
                throws Exception
            {
                return zzn.zza(zzKH);
            }

            
            {
                zzKH = zzn.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return zziP();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    String zziR()
    {
        String s1 = zzX(zzhS().getContext());
        String s = s1;
        if (s1 == null)
        {
            s = zziS();
        }
        return s;
    }

    protected String zziT()
    {
        return UUID.randomUUID().toString().toLowerCase();
    }
}
