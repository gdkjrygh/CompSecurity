// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.zzbg;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            zzlr, zzql, zzqq

public class zzqr
{

    public static final Integer zzaUg = Integer.valueOf(0);
    public static final Integer zzaUh = Integer.valueOf(1);
    private final Context mContext;
    private final ExecutorService zzaRv;

    public zzqr(Context context)
    {
        this(context, Executors.newSingleThreadExecutor());
    }

    zzqr(Context context, ExecutorService executorservice)
    {
        mContext = context;
        zzaRv = executorservice;
    }

    private String zzfr(String s)
    {
        return (new StringBuilder()).append("resource_").append(s).toString();
    }

    private byte[] zzm(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzlr.zza(inputstream, bytearrayoutputstream);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbg.zzaE("Error closing stream for reading resource from disk");
            return null;
        }
_L2:
        return bytearrayoutputstream.toByteArray();
        IOException ioexception;
        ioexception;
        zzbg.zzaE("Failed to read the resource from disk");
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbg.zzaE("Error closing stream for reading resource from disk");
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbg.zzaE("Error closing stream for reading resource from disk");
            return null;
        }
        throw exception;
    }

    public void zza(String s, Integer integer, zzql zzql1, zzqq zzqq1)
    {
        zzaRv.execute(new Runnable(s, integer, zzql1, zzqq1) {

            final String zzaUi;
            final Integer zzaUj;
            final zzql zzaUk;
            final zzqq zzaUl;
            final zzqr zzaUm;

            public void run()
            {
                zzaUm.zzb(zzaUi, zzaUj, zzaUk, zzaUl);
            }

            
            {
                zzaUm = zzqr.this;
                zzaUi = s;
                zzaUj = integer;
                zzaUk = zzql1;
                zzaUl = zzqq1;
                super();
            }
        });
    }

    void zzb(String s, Integer integer, zzql zzql1, zzqq zzqq1)
    {
        zzbg.v("DiskLoader: Starting to load resource from Disk.");
        Object obj = zzql1.zzt(zzm(new FileInputStream(zzfq(s))));
        if (obj != null)
        {
            try
            {
                zzbg.v((new StringBuilder()).append("Saved resource loaded: ").append(zzfr(s)).toString());
                zzqq1.zza(Status.zzaaD, obj, zzaUh, zzfp(s));
                return;
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                zzbg.e((new StringBuilder()).append("Saved resource not found: ").append(zzfr(s)).toString());
            }
            catch (zzqp.zzg zzg)
            {
                zzbg.e((new StringBuilder()).append("Saved resource is corrupted: ").append(zzfr(s)).toString());
            }
        }
        if (integer == null)
        {
            zzqq1.zza(Status.zzaaF, null, null, 0L);
            return;
        }
        s = mContext.getResources().openRawResource(integer.intValue());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        s = ((String) (zzql1.zzt(zzm(s))));
        if (s != null)
        {
            try
            {
                zzbg.v((new StringBuilder()).append("Default resource loaded: ").append(mContext.getResources().getResourceEntryName(integer.intValue())).toString());
                zzqq1.zza(Status.zzaaD, s, zzaUg, 0L);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbg.e((new StringBuilder()).append("Default resource not found. ID: ").append(integer).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbg.e((new StringBuilder()).append("Default resource resource is corrupted: ").append(integer).toString());
            }
        }
        zzqq1.zza(Status.zzaaF, null, null, 0L);
        return;
    }

    public void zze(String s, byte abyte0[])
    {
        zzaRv.execute(new Runnable(s, abyte0) {

            final byte zzQu[];
            final String zzaUi;
            final zzqr zzaUm;

            public void run()
            {
                zzaUm.zzf(zzaUi, zzQu);
            }

            
            {
                zzaUm = zzqr.this;
                zzaUi = s;
                zzQu = abyte0;
                super();
            }
        });
    }

    void zzf(String s, byte abyte0[])
    {
        FileOutputStream fileoutputstream;
        File file;
        file = zzfq(s);
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e("Error opening resource file for writing");
            return;
        }
        fileoutputstream.write(abyte0);
        try
        {
            fileoutputstream.close();
            zzbg.v((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        zzbg.e("Error writing resource to disk. Removing resource from disk");
        file.delete();
        try
        {
            fileoutputstream.close();
            zzbg.v((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        try
        {
            fileoutputstream.close();
            zzbg.v((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e("Error closing stream for writing resource to disk");
        }
        throw abyte0;
    }

    public long zzfp(String s)
    {
        s = zzfq(s);
        if (s.exists())
        {
            return s.lastModified();
        } else
        {
            return 0L;
        }
    }

    File zzfq(String s)
    {
        return new File(mContext.getDir("google_tagmanager", 0), zzfr(s));
    }

}
