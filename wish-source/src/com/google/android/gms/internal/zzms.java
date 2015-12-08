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
//            zzhy, zzmm, zzmr

public class zzms
{

    public static final Integer zzaHy = Integer.valueOf(0);
    public static final Integer zzaHz = Integer.valueOf(1);
    private final Context mContext;
    private final ExecutorService zzaEN;

    public zzms(Context context)
    {
        this(context, Executors.newSingleThreadExecutor());
    }

    zzms(Context context, ExecutorService executorservice)
    {
        mContext = context;
        zzaEN = executorservice;
    }

    private String zzeu(String s)
    {
        return (new StringBuilder()).append("resource_").append(s).toString();
    }

    private byte[] zzf(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzhy.zza(inputstream, bytearrayoutputstream);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
            return null;
        }
_L2:
        return bytearrayoutputstream.toByteArray();
        IOException ioexception;
        ioexception;
        zzbg.zzan("Failed to read the resource from disk");
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
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
            zzbg.zzan("Error closing stream for reading resource from disk");
            return null;
        }
        throw exception;
    }

    public void zza(String s, Integer integer, zzmm zzmm1, zzmr zzmr1)
    {
        zzaEN.execute(new Runnable(s, integer, zzmm1, zzmr1) {

            final String zzaHA;
            final Integer zzaHB;
            final zzmm zzaHC;
            final zzmr zzaHD;
            final zzms zzaHE;

            public void run()
            {
                zzaHE.zzb(zzaHA, zzaHB, zzaHC, zzaHD);
            }

            
            {
                zzaHE = zzms.this;
                zzaHA = s;
                zzaHB = integer;
                zzaHC = zzmm1;
                zzaHD = zzmr1;
                super();
            }
        });
    }

    void zzb(String s, Integer integer, zzmm zzmm1, zzmr zzmr1)
    {
        zzbg.zzam("DiskLoader: Starting to load resource from Disk.");
        Object obj = zzmm1.zzp(zzf(new FileInputStream(zzet(s))));
        if (obj != null)
        {
            try
            {
                zzbg.zzam((new StringBuilder()).append("Saved resource loaded: ").append(zzeu(s)).toString());
                zzmr1.zza(Status.zzQU, obj, zzaHz, zzes(s));
                return;
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                zzbg.zzak((new StringBuilder()).append("Saved resource not found: ").append(zzeu(s)).toString());
            }
            catch (zzmq.zzg zzg)
            {
                zzbg.zzak((new StringBuilder()).append("Saved resource is corrupted: ").append(zzeu(s)).toString());
            }
        }
        if (integer == null)
        {
            zzmr1.zza(Status.zzQW, null, null, 0L);
            return;
        }
        s = mContext.getResources().openRawResource(integer.intValue());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        s = ((String) (zzmm1.zzp(zzf(s))));
        if (s != null)
        {
            try
            {
                zzbg.zzam((new StringBuilder()).append("Default resource loaded: ").append(mContext.getResources().getResourceEntryName(integer.intValue())).toString());
                zzmr1.zza(Status.zzQU, s, zzaHy, 0L);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbg.zzak((new StringBuilder()).append("Default resource not found. ID: ").append(integer).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbg.zzak((new StringBuilder()).append("Default resource resource is corrupted: ").append(integer).toString());
            }
        }
        zzmr1.zza(Status.zzQW, null, null, 0L);
        return;
    }

    public void zze(String s, byte abyte0[])
    {
        zzaEN.execute(new Runnable(s, abyte0) {

            final byte zzKl[];
            final String zzaHA;
            final zzms zzaHE;

            public void run()
            {
                zzaHE.zzf(zzaHA, zzKl);
            }

            
            {
                zzaHE = zzms.this;
                zzaHA = s;
                zzKl = abyte0;
                super();
            }
        });
    }

    public long zzes(String s)
    {
        s = zzet(s);
        if (s.exists())
        {
            return s.lastModified();
        } else
        {
            return 0L;
        }
    }

    File zzet(String s)
    {
        return new File(mContext.getDir("google_tagmanager", 0), zzeu(s));
    }

    void zzf(String s, byte abyte0[])
    {
        FileOutputStream fileoutputstream;
        File file;
        file = zzet(s);
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak("Error opening resource file for writing");
            return;
        }
        fileoutputstream.write(abyte0);
        try
        {
            fileoutputstream.close();
            zzbg.zzam((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        zzbg.zzak("Error writing resource to disk. Removing resource from disk");
        file.delete();
        try
        {
            fileoutputstream.close();
            zzbg.zzam((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        try
        {
            fileoutputstream.close();
            zzbg.zzam((new StringBuilder()).append("Resource ").append(s).append(" saved on Disk.").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak("Error closing stream for writing resource to disk");
        }
        throw abyte0;
    }

}
