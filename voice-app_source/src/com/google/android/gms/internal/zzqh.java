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
//            zzlg, zzqb, zzqg

public class zzqh
{

    public static final Integer zzaPM = Integer.valueOf(0);
    public static final Integer zzaPN = Integer.valueOf(1);
    private final Context mContext;
    private final ExecutorService zzaNb;

    public zzqh(Context context)
    {
        this(context, Executors.newSingleThreadExecutor());
    }

    zzqh(Context context, ExecutorService executorservice)
    {
        mContext = context;
        zzaNb = executorservice;
    }

    private String zzfc(String s)
    {
        return (new StringBuilder()).append("resource_").append(s).toString();
    }

    private byte[] zzm(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzlg.zza(inputstream, bytearrayoutputstream);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbg.zzaC("Error closing stream for reading resource from disk");
            return null;
        }
_L2:
        return bytearrayoutputstream.toByteArray();
        IOException ioexception;
        ioexception;
        zzbg.zzaC("Failed to read the resource from disk");
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbg.zzaC("Error closing stream for reading resource from disk");
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
            zzbg.zzaC("Error closing stream for reading resource from disk");
            return null;
        }
        throw exception;
    }

    public void zza(String s, Integer integer, zzqb zzqb1, zzqg zzqg1)
    {
        zzaNb.execute(new Runnable(s, integer, zzqb1, zzqg1) {

            final String zzaPO;
            final Integer zzaPP;
            final zzqb zzaPQ;
            final zzqg zzaPR;
            final zzqh zzaPS;

            public void run()
            {
                zzaPS.zzb(zzaPO, zzaPP, zzaPQ, zzaPR);
            }

            
            {
                zzaPS = zzqh.this;
                zzaPO = s;
                zzaPP = integer;
                zzaPQ = zzqb1;
                zzaPR = zzqg1;
                super();
            }
        });
    }

    void zzb(String s, Integer integer, zzqb zzqb1, zzqg zzqg1)
    {
        zzbg.zzaB("DiskLoader: Starting to load resource from Disk.");
        Object obj = zzqb1.zzt(zzm(new FileInputStream(zzfb(s))));
        if (obj != null)
        {
            try
            {
                zzbg.zzaB((new StringBuilder()).append("Saved resource loaded: ").append(zzfc(s)).toString());
                zzqg1.zza(Status.zzXP, obj, zzaPN, zzfa(s));
                return;
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                zzbg.zzaz((new StringBuilder()).append("Saved resource not found: ").append(zzfc(s)).toString());
            }
            catch (zzqf.zzg zzg)
            {
                zzbg.zzaz((new StringBuilder()).append("Saved resource is corrupted: ").append(zzfc(s)).toString());
            }
        }
        if (integer == null)
        {
            zzqg1.zza(Status.zzXR, null, null, 0L);
            return;
        }
        s = mContext.getResources().openRawResource(integer.intValue());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        s = ((String) (zzqb1.zzt(zzm(s))));
        if (s != null)
        {
            try
            {
                zzbg.zzaB((new StringBuilder()).append("Default resource loaded: ").append(mContext.getResources().getResourceEntryName(integer.intValue())).toString());
                zzqg1.zza(Status.zzXP, s, zzaPM, 0L);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbg.zzaz((new StringBuilder()).append("Default resource not found. ID: ").append(integer).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbg.zzaz((new StringBuilder()).append("Default resource resource is corrupted: ").append(integer).toString());
            }
        }
        zzqg1.zza(Status.zzXR, null, null, 0L);
        return;
    }

    public void zze(String s, byte abyte0[])
    {
        zzaNb.execute(new Runnable(s, abyte0) {

            final byte zzOn[];
            final String zzaPO;
            final zzqh zzaPS;

            public void run()
            {
                zzaPS.zzf(zzaPO, zzOn);
            }

            
            {
                zzaPS = zzqh.this;
                zzaPO = s;
                zzOn = abyte0;
                super();
            }
        });
    }

    void zzf(String s, byte abyte0[])
    {
        FileOutputStream fileoutputstream;
        File file;
        file = zzfb(s);
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz("Error opening resource file for writing");
            return;
        }
        fileoutputstream.write(abyte0);
        try
        {
            fileoutputstream.close();
            zzbg.zzaB((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        zzbg.zzaz("Error writing resource to disk. Removing resource from disk");
        file.delete();
        try
        {
            fileoutputstream.close();
            zzbg.zzaB((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        try
        {
            fileoutputstream.close();
            zzbg.zzaB((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz("Error closing stream for writing resource to disk");
        }
        throw abyte0;
    }

    public long zzfa(String s)
    {
        s = zzfb(s);
        if (s.exists())
        {
            return s.lastModified();
        } else
        {
            return 0L;
        }
    }

    File zzfb(String s)
    {
        return new File(mContext.getDir("google_tagmanager", 0), zzfc(s));
    }

}
