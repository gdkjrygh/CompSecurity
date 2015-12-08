// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdr, zzip, zzby, zzbu, 
//            zzlm, zzib

public class zzdu extends zzdr
{

    private static final Set zzxB = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzxC = new DecimalFormat("#,###");
    private File zzxD;
    private boolean zzxE;

    public zzdu(zzip zzip1)
    {
        super(zzip1);
        zzip1 = zzip1.getContext().getCacheDir();
        if (zzip1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Context.getCacheDir() returned null");
        } else
        {
            zzxD = new File(zzip1, "admobVideoStreams");
            if (!zzxD.isDirectory() && !zzxD.mkdirs())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Could not create preload cache directory at ").append(zzxD.getAbsolutePath()).toString());
                zzxD = null;
                return;
            }
            if (!zzxD.setReadable(true, false) || !zzxD.setExecutable(true, false))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Could not set cache file permissions at ").append(zzxD.getAbsolutePath()).toString());
                zzxD = null;
                return;
            }
        }
    }

    private File zza(File file)
    {
        return new File(zzxD, (new StringBuilder()).append(file.getName()).append(".done").toString());
    }

    private static void zzb(File file)
    {
        if (file.isFile())
        {
            file.setLastModified(System.currentTimeMillis());
            return;
        }
        try
        {
            file.createNewFile();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    public void abort()
    {
        zzxE = true;
    }

    public boolean zzZ(String s)
    {
        Object obj;
        File file;
        String s1;
        if (zzxD == null)
        {
            zzf(s, null);
            return false;
        }
        while (zzdH() > ((Integer)zzby.zzuj.get()).intValue()) 
        {
            if (!zzdI())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Unable to expire stream cache");
                zzf(s, null);
                return false;
            }
        }
        obj = zzaa(s);
        file = new File(zzxD, ((String) (obj)));
        obj = zza(file);
        if (file.isFile() && ((File) (obj)).isFile())
        {
            int i = (int)file.length();
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Stream cache hit at ").append(s).toString());
            zza(s, file.getAbsolutePath(), i);
            return true;
        }
        s1 = (new StringBuilder()).append(zzxD.getAbsolutePath()).append(s).toString();
        synchronized (zzxB)
        {
            if (!zzxB.contains(s1))
            {
                break MISSING_BLOCK_LABEL_226;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Stream cache already in progress at ").append(s).toString());
            zzf(s, file.getAbsolutePath());
        }
        return false;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
        zzxB.add(s1);
        set;
        JVM INSTR monitorexit ;
        Object obj1;
        obj1 = (new URL(s)).openConnection();
        int j = ((Integer)zzby.zzuo.get()).intValue();
        ((URLConnection) (obj1)).setConnectTimeout(j);
        ((URLConnection) (obj1)).setReadTimeout(j);
        if (!(obj1 instanceof HttpURLConnection)) goto _L2; else goto _L1
_L1:
        int k = ((HttpURLConnection)obj1).getResponseCode();
        if (k < 400) goto _L2; else goto _L3
_L3:
        try
        {
            throw new IOException((new StringBuilder()).append("HTTP status code ").append(k).append(" at ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = null;
        }
_L7:
        Object obj2;
        FileChannel filechannel;
        ByteBuffer bytebuffer;
        zzlm zzlm1;
        zzib zzib1;
        int l;
        int i1;
        int j1;
        int k1;
        long l1;
        long l2;
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        catch (IOException ioexception) { }
        catch (NullPointerException nullpointerexception) { }
        if (zzxE)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD((new StringBuilder()).append("Preload aborted for URL \"").append(s).append("\"").toString());
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Preload failed for URL \"").append(s).append("\"").toString(), ((Throwable) (obj)));
        }
        if (file.exists() && !file.delete())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Could not delete partial cache file at ").append(file.getAbsolutePath()).toString());
        }
        zzf(s, file.getAbsolutePath());
        zzxB.remove(s1);
        return false;
_L2:
        j1 = ((URLConnection) (obj1)).getContentLength();
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_500;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Stream cache aborted, missing content-length header at ").append(s).toString());
        zzf(s, file.getAbsolutePath());
        zzxB.remove(s1);
        return false;
        obj2 = zzxC.format(j1);
        k1 = ((Integer)zzby.zzuk.get()).intValue();
        if (j1 <= k1)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Content length ").append(((String) (obj2))).append(" exceeds limit at ").append(s).toString());
        zzf(s, file.getAbsolutePath());
        zzxB.remove(s1);
        return false;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Caching ").append(((String) (obj2))).append(" bytes from ").append(s).toString());
        obj2 = Channels.newChannel(((URLConnection) (obj1)).getInputStream());
        obj1 = new FileOutputStream(file);
        filechannel = ((FileOutputStream) (obj1)).getChannel();
        bytebuffer = ByteBuffer.allocate(0x100000);
        zzlm1 = zzp.zzbB();
        l = 0;
        l1 = zzlm1.currentTimeMillis();
        zzib1 = new zzib(((Long)zzby.zzun.get()).longValue());
        l2 = ((Long)zzby.zzum.get()).longValue();
_L5:
        i1 = ((ReadableByteChannel) (obj2)).read(bytebuffer);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_854;
        }
        i1 = l + i1;
        if (i1 <= k1)
        {
            break MISSING_BLOCK_LABEL_749;
        }
        throw new IOException("stream cache file size limit exceeded");
        bytebuffer.flip();
        while (filechannel.write(bytebuffer) > 0) ;
        bytebuffer.clear();
        if (zzlm1.currentTimeMillis() - l1 > 1000L * l2)
        {
            throw new IOException("stream cache time limit exceeded");
        }
        if (zzxE)
        {
            throw new IOException("abort requested");
        }
        l = i1;
        if (!zzib1.tryAcquire()) goto _L5; else goto _L4
_L4:
        zza(s, file.getAbsolutePath(), i1, j1, false);
        l = i1;
          goto _L5
        ((FileOutputStream) (obj1)).close();
        if (com.google.android.gms.ads.internal.util.client.zzb.zzM(3))
        {
            obj2 = zzxC.format(l);
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Preloaded ").append(((String) (obj2))).append(" bytes from ").append(s).toString());
        }
        file.setReadable(true, false);
        zzb(((File) (obj)));
        zza(s, file.getAbsolutePath(), l);
        zzxB.remove(s1);
        return true;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int zzdH()
    {
        int i;
        int k;
        i = 0;
        k = 0;
        if (zzxD != null) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        File afile[] = zzxD.listFiles();
        int l = afile.length;
        int j = 0;
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            k = i;
            if (!afile[j].getName().endsWith(".done"))
            {
                k = i + 1;
            }
            j++;
            i = k;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean zzdI()
    {
        if (zzxD == null)
        {
            return false;
        }
        File file = null;
        long l = 0x7fffffffffffffffL;
        File afile[] = zzxD.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file1 = afile[i];
            if (file1.getName().endsWith(".done"))
            {
                continue;
            }
            long l1 = file1.lastModified();
            if (l1 < l)
            {
                file = file1;
                l = l1;
            }
        }

        boolean flag;
        if (file != null)
        {
            boolean flag1 = file.delete();
            file = zza(file);
            flag = flag1;
            if (file.isFile())
            {
                flag = flag1 & file.delete();
            }
        } else
        {
            flag = false;
        }
        return flag;
    }

}
