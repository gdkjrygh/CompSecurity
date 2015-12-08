// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzid, zzbz, zzbv, zzlb, 
//            zzhq

public class zzdr
{

    private static final Set zzwF = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzwG = new DecimalFormat("#,###");
    private zzid zzoA;
    private File zzwH;
    private boolean zzwI;

    public zzdr(zzid zzid1)
    {
        zzoA = zzid1;
        zzid1 = zzid1.getContext().getCacheDir();
        if (zzid1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Context.getCacheDir() returned null");
        } else
        {
            zzwH = new File(zzid1, "admobVideoStreams");
            if (!zzwH.isDirectory() && !zzwH.mkdirs())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Could not create preload cache directory at ").append(zzwH.getAbsolutePath()).toString());
                zzwH = null;
                return;
            }
            if (!zzwH.setReadable(true, false) || !zzwH.setExecutable(true, false))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Could not set cache file permissions at ").append(zzwH.getAbsolutePath()).toString());
                zzwH = null;
                return;
            }
        }
    }

    private String zzX(String s)
    {
        return zzk.zzcA().zzax(s);
    }

    static zzid zza(zzdr zzdr1)
    {
        return zzdr1.zzoA;
    }

    private File zza(File file)
    {
        return new File(zzwH, (new StringBuilder()).append(file.getName()).append(".done").toString());
    }

    private void zza(String s, File file)
    {
        zza.zzGF.post(new Runnable(s, file) {

            final String zzwJ;
            final File zzwK;
            final zzdr zzwN;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheCanceled");
                hashmap.put("src", zzwJ);
                if (zzwK != null)
                {
                    hashmap.put("cachedSrc", zzwK.getAbsolutePath());
                }
                com.google.android.gms.internal.zzdr.zza(zzwN).zzc("onPrecacheEvent", hashmap);
            }

            
            {
                zzwN = zzdr.this;
                zzwJ = s;
                zzwK = file;
                super();
            }
        });
    }

    private void zza(String s, File file, int i)
    {
        zza.zzGF.post(new Runnable(s, file, i) {

            final String zzwJ;
            final File zzwK;
            final int zzwM;
            final zzdr zzwN;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheComplete");
                hashmap.put("src", zzwJ);
                hashmap.put("cachedSrc", zzwK.getAbsolutePath());
                hashmap.put("totalBytes", Integer.toString(zzwM));
                com.google.android.gms.internal.zzdr.zza(zzwN).zzc("onPrecacheEvent", hashmap);
            }

            
            {
                zzwN = zzdr.this;
                zzwJ = s;
                zzwK = file;
                zzwM = i;
                super();
            }
        });
    }

    private void zza(String s, File file, int i, int j)
    {
        zza.zzGF.post(new Runnable(s, file, i, j) {

            final String zzwJ;
            final File zzwK;
            final int zzwL;
            final int zzwM;
            final zzdr zzwN;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheProgress");
                hashmap.put("src", zzwJ);
                hashmap.put("cachedSrc", zzwK.getAbsolutePath());
                hashmap.put("bytesLoaded", Integer.toString(zzwL));
                hashmap.put("totalBytes", Integer.toString(zzwM));
                com.google.android.gms.internal.zzdr.zza(zzwN).zzc("onPrecacheEvent", hashmap);
            }

            
            {
                zzwN = zzdr.this;
                zzwJ = s;
                zzwK = file;
                zzwL = i;
                zzwM = j;
                super();
            }
        });
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
        zzwI = true;
    }

    public boolean zzW(String s)
    {
        Object obj;
        File file;
        String s1;
        if (zzwH == null)
        {
            zza(s, null);
            return false;
        }
        while (zzdQ() > ((Integer)zzbz.zztO.get()).intValue()) 
        {
            if (!zzdR())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Unable to expire stream cache");
                zza(s, null);
                return false;
            }
        }
        obj = zzX(s);
        file = new File(zzwH, ((String) (obj)));
        obj = zza(file);
        if (file.isFile() && ((File) (obj)).isFile())
        {
            int i = (int)file.length();
            com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Stream cache hit at ").append(s).toString());
            zza(s, file, i);
            return true;
        }
        s1 = (new StringBuilder()).append(zzwH.getAbsolutePath()).append(s).toString();
        synchronized (zzwF)
        {
            if (!zzwF.contains(s1))
            {
                break MISSING_BLOCK_LABEL_220;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Stream cache already in progress at ").append(s).toString());
            zza(s, file);
        }
        return false;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
        zzwF.add(s1);
        set;
        JVM INSTR monitorexit ;
        Object obj1;
        obj1 = (new URL(s)).openConnection();
        int j = ((Integer)zzbz.zztS.get()).intValue();
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
        zzlb zzlb1;
        zzhq zzhq1;
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
        if (zzwI)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaA((new StringBuilder()).append("Preload aborted for URL \"").append(s).append("\"").toString());
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Preload failed for URL \"").append(s).append("\"").toString(), ((Throwable) (obj)));
        }
        if (file.exists() && !file.delete())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Could not delete partial cache file at ").append(file.getAbsolutePath()).toString());
        }
        zza(s, file);
        zzwF.remove(s1);
        return false;
_L2:
        j1 = ((URLConnection) (obj1)).getContentLength();
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_494;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Stream cache aborted, missing content-length header at ").append(s).toString());
        zza(s, file);
        zzwF.remove(s1);
        return false;
        obj2 = zzwG.format(j1);
        k1 = ((Integer)zzbz.zztP.get()).intValue();
        if (j1 <= k1)
        {
            break MISSING_BLOCK_LABEL_580;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Content length ").append(((String) (obj2))).append(" exceeds limit at ").append(s).toString());
        zza(s, file);
        zzwF.remove(s1);
        return false;
        com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Caching ").append(((String) (obj2))).append(" bytes from ").append(s).toString());
        obj2 = Channels.newChannel(((URLConnection) (obj1)).getInputStream());
        obj1 = new FileOutputStream(file);
        filechannel = ((FileOutputStream) (obj1)).getChannel();
        bytebuffer = ByteBuffer.allocate(0x100000);
        zzlb1 = zzo.zzbz();
        l1 = zzlb1.currentTimeMillis();
        zzhq1 = new zzhq(((Long)zzbz.zztR.get()).longValue());
        l2 = ((Long)zzbz.zztQ.get()).longValue();
        l = 0;
_L5:
        i1 = ((ReadableByteChannel) (obj2)).read(bytebuffer);
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l + i1;
        if (i1 <= k1)
        {
            break MISSING_BLOCK_LABEL_740;
        }
        throw new IOException("stream cache file size limit exceeded");
        bytebuffer.flip();
        while (filechannel.write(bytebuffer) > 0) ;
        bytebuffer.clear();
        if (zzlb1.currentTimeMillis() - l1 > 1000L * l2)
        {
            throw new IOException("stream cache time limit exceeded");
        }
        if (zzwI)
        {
            throw new IOException("abort requested");
        }
        l = i1;
        if (!zzhq1.tryAcquire())
        {
            continue; /* Loop/switch isn't completed */
        }
        zza(s, file, i1, j1);
        l = i1;
        if (true) goto _L5; else goto _L4
_L4:
        ((FileOutputStream) (obj1)).close();
        if (com.google.android.gms.ads.internal.util.client.zzb.zzL(3))
        {
            obj2 = zzwG.format(l);
            com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Preloaded ").append(((String) (obj2))).append(" bytes from ").append(s).toString());
        }
        file.setReadable(true, false);
        zzb(((File) (obj)));
        zza(s, file, l);
        zzwF.remove(s1);
        return true;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int zzdQ()
    {
        int i;
        int k;
        i = 0;
        k = 0;
        if (zzwH != null) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        File afile[] = zzwH.listFiles();
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

    public boolean zzdR()
    {
        if (zzwH == null)
        {
            return false;
        }
        File file = null;
        long l = 0x7fffffffffffffffL;
        File afile[] = zzwH.listFiles();
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
