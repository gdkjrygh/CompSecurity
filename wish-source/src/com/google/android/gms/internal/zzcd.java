// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
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
//            zzgd, zzat, zzap, zzht, 
//            zzfq

public class zzcd
{

    private static final Set zztQ = Collections.synchronizedSet(new HashSet());
    private zzgd zznp;
    private File zztR;
    private boolean zztS;

    public zzcd(zzgd zzgd1)
    {
        zznp = zzgd1;
        zzgd1 = zzgd1.getContext().getCacheDir();
        if (zzgd1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Context.getCacheDir() returned null");
        } else
        {
            zztR = new File(zzgd1, "admobVideoStreams");
            if (!zztR.mkdirs() && !zztR.isDirectory())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not create preload cache directory at ").append(zztR.getAbsolutePath()).toString());
                zztR = null;
                return;
            }
        }
    }

    private String zzJ(String s)
    {
        return zzj.zzbJ().zzai(s);
    }

    static zzgd zza(zzcd zzcd1)
    {
        return zzcd1.zznp;
    }

    private File zza(File file)
    {
        return new File(zztR, (new StringBuilder()).append(file.getName()).append(".done").toString());
    }

    private void zza(String s, File file)
    {
        zza.zzCH.post(new Runnable(s, file) {

            final String zztT;
            final File zztU;
            final zzcd zztX;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheCanceled");
                hashmap.put("src", zztT);
                if (zztU != null)
                {
                    hashmap.put("cachedSrc", zztU.getAbsolutePath());
                }
                com.google.android.gms.internal.zzcd.zza(zztX).zzb("onPrecacheEvent", hashmap);
            }

            
            {
                zztX = zzcd.this;
                zztT = s;
                zztU = file;
                super();
            }
        });
    }

    private void zza(String s, File file, int i)
    {
        zza.zzCH.post(new Runnable(s, file, i) {

            final String zztT;
            final File zztU;
            final int zztW;
            final zzcd zztX;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheComplete");
                hashmap.put("src", zztT);
                hashmap.put("cachedSrc", zztU.getAbsolutePath());
                hashmap.put("totalBytes", Integer.toString(zztW));
                com.google.android.gms.internal.zzcd.zza(zztX).zzb("onPrecacheEvent", hashmap);
            }

            
            {
                zztX = zzcd.this;
                zztT = s;
                zztU = file;
                zztW = i;
                super();
            }
        });
    }

    private void zza(String s, File file, int i, int j)
    {
        zza.zzCH.post(new Runnable(s, file, i, j) {

            final String zztT;
            final File zztU;
            final int zztV;
            final int zztW;
            final zzcd zztX;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheProgress");
                hashmap.put("src", zztT);
                hashmap.put("cachedSrc", zztU.getAbsolutePath());
                hashmap.put("bytesLoaded", Integer.toString(zztV));
                hashmap.put("totalBytes", Integer.toString(zztW));
                com.google.android.gms.internal.zzcd.zza(zztX).zzb("onPrecacheEvent", hashmap);
            }

            
            {
                zztX = zzcd.this;
                zztT = s;
                zztU = file;
                zztV = i;
                zztW = j;
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
        zztS = true;
    }

    public boolean zzI(String s)
    {
        Object obj;
        String s1;
        Object obj1;
        if (zztR == null)
        {
            zza(s, null);
            return false;
        }
        while (zzcY() > ((Integer)zzat.zzrs.get()).intValue()) 
        {
            if (!zzcZ())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Unable to expire stream cache");
                zza(s, null);
                return false;
            }
        }
        obj = zzJ(s);
        obj = new File(zztR, ((String) (obj)));
        obj1 = zza(((File) (obj)));
        if (((File) (obj)).isFile() && ((File) (obj1)).isFile())
        {
            int i = (int)((File) (obj)).length();
            com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Stream cache hit at ").append(s).toString());
            zza(s, ((File) (obj)), i);
            return true;
        }
        s1 = (new StringBuilder()).append(zztR.getAbsolutePath()).append(s).toString();
        synchronized (zztQ)
        {
            if (!zztQ.contains(s1))
            {
                break MISSING_BLOCK_LABEL_218;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Stream cache already in progress at ").append(s).toString());
            zza(s, ((File) (obj)));
        }
        return false;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
        zztQ.add(s1);
        set;
        JVM INSTR monitorexit ;
        Object obj2;
        int j;
        obj2 = (new URL(s)).openConnection();
        j = ((Integer)zzat.zzrw.get()).intValue();
        ((URLConnection) (obj2)).setConnectTimeout(j);
        ((URLConnection) (obj2)).setReadTimeout(j);
        if (!(obj2 instanceof HttpURLConnection))
        {
            break MISSING_BLOCK_LABEL_429;
        }
        j = ((HttpURLConnection)obj2).getResponseCode();
        if (j >= 400)
        {
            try
            {
                throw new IOException((new StringBuilder()).append("HTTP status code ").append(j).append(" at ").append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            Object obj3;
            FileChannel filechannel;
            ByteBuffer bytebuffer;
            zzht zzht1;
            zzfq zzfq1;
            int k;
            int l;
            int i1;
            long l1;
            long l2;
            if (zztS)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Preload aborted for URL \"").append(s).append("\"").toString());
            } else
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Preload failed for URL \"").append(s).append("\"").toString(), ((Throwable) (obj1)));
            }
            if (((File) (obj)).exists() && !((File) (obj)).delete())
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not delete partial cache file at ").append(((File) (obj)).getAbsolutePath()).toString());
            }
            zza(s, ((File) (obj)));
            zztQ.remove(s1);
            return false;
        }
        l = ((URLConnection) (obj2)).getContentLength();
        if (l >= 0)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Stream cache aborted, missing content-length header at ").append(s).toString());
        zza(s, ((File) (obj)));
        zztQ.remove(s1);
        return false;
        obj3 = (new DecimalFormat("#,###")).format(l);
        i1 = ((Integer)zzat.zzrt.get()).intValue();
        if (l <= i1)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Content length ").append(((String) (obj3))).append(" exceeds limit at ").append(s).toString());
        zza(s, ((File) (obj)));
        zztQ.remove(s1);
        return false;
        com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Caching ").append(((String) (obj3))).append(" bytes from ").append(s).toString());
        obj2 = Channels.newChannel(((URLConnection) (obj2)).getInputStream());
        obj3 = new FileOutputStream(((File) (obj)));
        filechannel = ((FileOutputStream) (obj3)).getChannel();
        bytebuffer = ByteBuffer.allocate(0x100000);
        zzht1 = zzh.zzaU();
        l1 = zzht1.currentTimeMillis();
        zzfq1 = new zzfq(((Long)zzat.zzrv.get()).longValue());
        l2 = ((Long)zzat.zzru.get()).longValue();
        j = 0;
_L2:
        k = ((ReadableByteChannel) (obj2)).read(bytebuffer);
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = j + k;
        if (k <= i1)
        {
            break MISSING_BLOCK_LABEL_735;
        }
        throw new IOException("stream cache file size limit exceeded");
        bytebuffer.flip();
        while (filechannel.write(bytebuffer) > 0) ;
        bytebuffer.clear();
        if (zzht1.currentTimeMillis() - l1 > 1000L * l2)
        {
            throw new IOException("stream cache time limit exceeded");
        }
        if (zztS)
        {
            throw new IOException("abort requested");
        }
        j = k;
        if (!zzfq1.tryAcquire())
        {
            continue; /* Loop/switch isn't completed */
        }
        zza(s, ((File) (obj)), k, l);
        j = k;
        if (true) goto _L2; else goto _L1
_L1:
        ((FileOutputStream) (obj3)).close();
        if (com.google.android.gms.ads.internal.util.client.zzb.zzC(3))
        {
            obj2 = (new DecimalFormat("#,###")).format(j);
            com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Preloaded ").append(((String) (obj2))).append(" bytes from ").append(s).toString());
        }
        zzb(((File) (obj1)));
        zza(s, ((File) (obj)), j);
        zztQ.remove(s1);
        return true;
    }

    public int zzcY()
    {
        int i;
        int k;
        i = 0;
        k = 0;
        if (zztR != null) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        File afile[] = zztR.listFiles();
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

    public boolean zzcZ()
    {
        if (zztR == null)
        {
            return false;
        }
        File file = null;
        long l = 0x7fffffffffffffffL;
        File afile[] = zztR.listFiles();
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
