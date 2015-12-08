// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaz, zzbg, zzbf, zzcb

class zzcn
    implements zzp.zzf
{

    private final Context mContext;
    private final String zzaKy;
    private zzbf zzaMU;
    private final ExecutorService zzaNb = Executors.newSingleThreadExecutor();

    zzcn(Context context, String s)
    {
        mContext = context;
        zzaKy = s;
    }

    private com.google.android.gms.internal.zzqf.zzc zza(ByteArrayOutputStream bytearrayoutputstream)
    {
        try
        {
            bytearrayoutputstream = zzaz.zzey(bytearrayoutputstream.toString("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzay("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzaC("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
        return bytearrayoutputstream;
    }

    private void zzd(com.google.android.gms.internal.zzpx.zza zza1)
        throws IllegalArgumentException
    {
        if (zza1.zziO == null && zza1.zzaPa == null)
        {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        } else
        {
            return;
        }
    }

    private com.google.android.gms.internal.zzqf.zzc zzr(byte abyte0[])
    {
        try
        {
            abyte0 = zzqf.zzb(com.google.android.gms.internal.zzaf.zzf.zzc(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzbg.zzaz("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzbg.zzaC("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        zzbg.zzaB("The container was successfully loaded from the resource (using binary file)");
        return abyte0;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        zzaNb.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void zza(zzbf zzbf1)
    {
        zzaMU = zzbf1;
    }

    public void zzb(com.google.android.gms.internal.zzpx.zza zza1)
    {
        zzaNb.execute(new Runnable(zza1) {

            final zzcn zzaNc;
            final com.google.android.gms.internal.zzpx.zza zzaNd;

            public void run()
            {
                zzaNc.zzc(zzaNd);
            }

            
            {
                zzaNc = zzcn.this;
                zzaNd = zza1;
                super();
            }
        });
    }

    boolean zzc(com.google.android.gms.internal.zzpx.zza zza1)
    {
        FileOutputStream fileoutputstream;
        File file;
        file = zzzo();
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzpx.zza zza1)
        {
            zzbg.zzaz("Error opening resource file for writing");
            return false;
        }
        fileoutputstream.write(zzrn.zzf(zza1));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzpx.zza zza1)
        {
            zzbg.zzaC("error closing stream for writing resource to disk");
            return true;
        }
        return true;
        zza1;
        zzbg.zzaC("Error writing resource to disk. Removing resource from disk.");
        file.delete();
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzpx.zza zza1)
        {
            zzbg.zzaC("error closing stream for writing resource to disk");
            return false;
        }
        return false;
        zza1;
        try
        {
            fileoutputstream.close();
        }
        catch (IOException ioexception)
        {
            zzbg.zzaC("error closing stream for writing resource to disk");
        }
        throw zza1;
    }

    public com.google.android.gms.internal.zzqf.zzc zziR(int i)
    {
        Object obj;
        Object obj1;
        try
        {
            obj1 = mContext.getResources().openRawResource(i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaC((new StringBuilder()).append("Failed to load the container. No default container resource found with the resource ID ").append(i).toString());
            return null;
        }
        zzbg.zzaB((new StringBuilder()).append("Attempting to load a container from the resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
        try
        {
            obj = new ByteArrayOutputStream();
            zzqf.zzc(((java.io.InputStream) (obj1)), ((java.io.OutputStream) (obj)));
            obj1 = zza(((ByteArrayOutputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            zzbg.zzaC((new StringBuilder()).append("Error reading the default container with resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
            return null;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        zzbg.zzaB("The container was successfully loaded from the resource (using JSON file format)");
        return ((com.google.android.gms.internal.zzqf.zzc) (obj1));
        obj = zzr(((ByteArrayOutputStream) (obj)).toByteArray());
        return ((com.google.android.gms.internal.zzqf.zzc) (obj));
    }

    public void zzyw()
    {
        zzaNb.execute(new Runnable() {

            final zzcn zzaNc;

            public void run()
            {
                zzaNc.zzzn();
            }

            
            {
                zzaNc = zzcn.this;
                super();
            }
        });
    }

    void zzzn()
    {
        Object obj;
        if (zzaMU == null)
        {
            throw new IllegalStateException("Callback must be set before execute");
        }
        zzaMU.zzyv();
        zzbg.zzaB("Attempting to load resource from disk");
        if ((zzcb.zzzf().zzzg() == zzcb.zza.zzaMJ || zzcb.zzzf().zzzg() == zzcb.zza.zzaMK) && zzaKy.equals(zzcb.zzzf().getContainerId()))
        {
            zzaMU.zza(zzbf.zza.zzaMi);
            return;
        }
        Object obj1;
        try
        {
            obj = new FileInputStream(zzzo());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzay("Failed to find the resource in the disk");
            zzaMU.zza(zzbf.zza.zzaMi);
            return;
        }
        obj1 = new ByteArrayOutputStream();
        zzqf.zzc(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj1)));
        obj1 = com.google.android.gms.internal.zzpx.zza.zzs(((ByteArrayOutputStream) (obj1)).toByteArray());
        zzd(((com.google.android.gms.internal.zzpx.zza) (obj1)));
        zzaMU.zzz(obj1);
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
_L1:
        zzbg.zzaB("The Disk resource was successfully read.");
        return;
        Object obj2;
        obj2;
        zzaMU.zza(zzbf.zza.zzaMj);
        zzbg.zzaC("Failed to read the resource from disk");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        zzaMU.zza(zzbf.zza.zzaMj);
        zzbg.zzaC("Failed to read the resource from disk. The resource is inconsistent");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
        throw obj2;
    }

    File zzzo()
    {
        String s = (new StringBuilder()).append("resource_").append(zzaKy).toString();
        return new File(mContext.getDir("google_tagmanager", 0), s);
    }
}
