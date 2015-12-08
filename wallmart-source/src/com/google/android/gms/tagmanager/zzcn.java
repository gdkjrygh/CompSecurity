// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.zzqp;
import com.google.android.gms.internal.zzrw;
import com.google.android.gms.internal.zzrx;
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
    private final String zzaOS;
    private zzbf zzaRo;
    private final ExecutorService zzaRv = Executors.newSingleThreadExecutor();

    zzcn(Context context, String s)
    {
        mContext = context;
        zzaOS = s;
    }

    private com.google.android.gms.internal.zzqp.zzc zza(ByteArrayOutputStream bytearrayoutputstream)
    {
        try
        {
            bytearrayoutputstream = zzaz.zzeN(bytearrayoutputstream.toString("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzaC("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzaE("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
        return bytearrayoutputstream;
    }

    private void zzd(com.google.android.gms.internal.zzqh.zza zza1)
        throws IllegalArgumentException
    {
        if (zza1.zziR == null && zza1.zzaTu == null)
        {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        } else
        {
            return;
        }
    }

    private com.google.android.gms.internal.zzqp.zzc zzr(byte abyte0[])
    {
        try
        {
            abyte0 = zzqp.zzb(com.google.android.gms.internal.zzaf.zzf.zzc(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzbg.e("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzbg.zzaE("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        zzbg.v("The container was successfully loaded from the resource (using binary file)");
        return abyte0;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        zzaRv.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void zzAD()
    {
        Object obj;
        if (zzaRo == null)
        {
            throw new IllegalStateException("Callback must be set before execute");
        }
        zzaRo.zzzL();
        zzbg.v("Attempting to load resource from disk");
        if ((zzcb.zzAv().zzAw() == zzcb.zza.zzaRd || zzcb.zzAv().zzAw() == zzcb.zza.zzaRe) && zzaOS.equals(zzcb.zzAv().getContainerId()))
        {
            zzaRo.zza(zzbf.zza.zzaQC);
            return;
        }
        Object obj1;
        try
        {
            obj = new FileInputStream(zzAE());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaC("Failed to find the resource in the disk");
            zzaRo.zza(zzbf.zza.zzaQC);
            return;
        }
        obj1 = new ByteArrayOutputStream();
        zzqp.zzc(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj1)));
        obj1 = com.google.android.gms.internal.zzqh.zza.zzs(((ByteArrayOutputStream) (obj1)).toByteArray());
        zzd(((com.google.android.gms.internal.zzqh.zza) (obj1)));
        zzaRo.zzB(obj1);
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaE("Error closing stream for reading resource from disk");
        }
_L1:
        zzbg.v("The Disk resource was successfully read.");
        return;
        Object obj2;
        obj2;
        zzaRo.zza(zzbf.zza.zzaQD);
        zzbg.zzaE("Failed to read the resource from disk");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaE("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        zzaRo.zza(zzbf.zza.zzaQD);
        zzbg.zzaE("Failed to read the resource from disk. The resource is inconsistent");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaE("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            zzbg.zzaE("Error closing stream for reading resource from disk");
        }
        throw obj2;
    }

    File zzAE()
    {
        String s = (new StringBuilder()).append("resource_").append(zzaOS).toString();
        return new File(mContext.getDir("google_tagmanager", 0), s);
    }

    public void zza(zzbf zzbf1)
    {
        zzaRo = zzbf1;
    }

    public void zzb(com.google.android.gms.internal.zzqh.zza zza1)
    {
        zzaRv.execute(new Runnable(zza1) {

            final zzcn zzaRw;
            final com.google.android.gms.internal.zzqh.zza zzaRx;

            public void run()
            {
                zzaRw.zzc(zzaRx);
            }

            
            {
                zzaRw = zzcn.this;
                zzaRx = zza1;
                super();
            }
        });
    }

    boolean zzc(com.google.android.gms.internal.zzqh.zza zza1)
    {
        FileOutputStream fileoutputstream;
        File file;
        file = zzAE();
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzqh.zza zza1)
        {
            zzbg.e("Error opening resource file for writing");
            return false;
        }
        fileoutputstream.write(zzrx.zzf(zza1));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzqh.zza zza1)
        {
            zzbg.zzaE("error closing stream for writing resource to disk");
            return true;
        }
        return true;
        zza1;
        zzbg.zzaE("Error writing resource to disk. Removing resource from disk.");
        file.delete();
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzqh.zza zza1)
        {
            zzbg.zzaE("error closing stream for writing resource to disk");
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
            zzbg.zzaE("error closing stream for writing resource to disk");
        }
        throw zza1;
    }

    public com.google.android.gms.internal.zzqp.zzc zzjc(int i)
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
            zzbg.zzaE((new StringBuilder()).append("Failed to load the container. No default container resource found with the resource ID ").append(i).toString());
            return null;
        }
        zzbg.v((new StringBuilder()).append("Attempting to load a container from the resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
        try
        {
            obj = new ByteArrayOutputStream();
            zzqp.zzc(((java.io.InputStream) (obj1)), ((java.io.OutputStream) (obj)));
            obj1 = zza(((ByteArrayOutputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            zzbg.zzaE((new StringBuilder()).append("Error reading the default container with resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
            return null;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        zzbg.v("The container was successfully loaded from the resource (using JSON file format)");
        return ((com.google.android.gms.internal.zzqp.zzc) (obj1));
        obj = zzr(((ByteArrayOutputStream) (obj)).toByteArray());
        return ((com.google.android.gms.internal.zzqp.zzc) (obj));
    }

    public void zzzM()
    {
        zzaRv.execute(new Runnable() {

            final zzcn zzaRw;

            public void run()
            {
                zzaRw.zzAD();
            }

            
            {
                zzaRw = zzcn.this;
                super();
            }
        });
    }
}
