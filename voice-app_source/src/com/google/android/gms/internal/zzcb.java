// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal:
//            zzbz, zzbv, zzhl, zzce

public class zzcb
{

    private final Context mContext;
    private final String zzqr;
    private int zzuA;
    private int zzuB;
    private int zzuC;
    private String zzuD;
    private BlockingQueue zzuF;
    private ExecutorService zzuG;
    private LinkedHashMap zzuH;
    private AtomicBoolean zzuI;
    private File zzuJ;
    private int zzuz;

    public zzcb(Context context, String s, String s1, int i, int j, int k, int l, 
            Map map, int i1)
    {
        zzuH = new LinkedHashMap();
        mContext = context;
        zzqr = s;
        zzuD = s1;
        zzuA = i;
        zzuB = j;
        zzuC = k;
        zzq(l);
        zzuI = new AtomicBoolean(false);
        zzuI.set(((Boolean)zzbz.zzub.get()).booleanValue());
        if (zzuI.get())
        {
            context = Environment.getExternalStorageDirectory();
            if (context != null)
            {
                zzuJ = new File(context, "sdk_csi_data.txt");
            }
        }
        for (context = map.entrySet().iterator(); context.hasNext(); zzd((String)s.getKey(), (String)s.getValue()))
        {
            s = (java.util.Map.Entry)context.next();
        }

        if (i1 == 1)
        {
            zzdj();
        }
        if (i1 == 2)
        {
            zzdk();
        }
        init();
    }

    private void init()
    {
        zzuF = new ArrayBlockingQueue(zzuA);
        zzuG = Executors.newSingleThreadExecutor();
        zzuG.execute(new Runnable() {

            final zzcb zzuK;

            public void run()
            {
                zzcb.zza(zzuK);
            }

            
            {
                zzuK = zzcb.this;
                super();
            }
        });
    }

    static void zza(zzcb zzcb1)
    {
        zzcb1.zzdl();
    }

    private void zza(File file, String s)
    {
        if (file == null) goto _L2; else goto _L1
_L1:
        FileOutputStream fileoutputstream = new FileOutputStream(file, true);
        file = fileoutputstream;
        fileoutputstream.write(s.getBytes());
        file = fileoutputstream;
        fileoutputstream.write(10);
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        fileoutputstream.close();
_L4:
        return;
        file;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", file);
        return;
        IOException ioexception;
        ioexception;
        s = null;
_L7:
        file = s;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", ioexception);
        if (s == null) goto _L4; else goto _L3
_L3:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", file);
        }
        return;
        s;
        file = null;
_L6:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", file);
            }
        }
        throw s;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
        return;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        s = fileoutputstream;
          goto _L7
    }

    private void zzb(List list)
    {
        if (list != null && !list.isEmpty())
        {
            zzd("eid", TextUtils.join(",", list));
        }
    }

    private boolean zzc(Map map)
    {
        int i;
        boolean flag;
        flag = false;
        i = 0;
_L2:
        if (flag || i >= zzuB)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        Thread.sleep(zzuC);
        String s = zza(zzuD, map);
        if (zzuI.get())
        {
            zza(zzuJ, s);
            break MISSING_BLOCK_LABEL_95;
        }
        try
        {
            zzo.zzbv().zzc(mContext, zzqr, s);
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("CsiReporter: interrupted in sendReport()", interruptedexception);
            Thread.currentThread().interrupt();
            break MISSING_BLOCK_LABEL_98;
        }
        break MISSING_BLOCK_LABEL_95;
        return flag;
        flag = true;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void zzdj()
    {
        zzb(zzbz.zzdb());
    }

    private void zzdk()
    {
        zzb(zzbz.zzx(mContext));
    }

    private void zzdl()
    {
        do
        {
            Object obj;
            do
            {
                obj = zzp(zzuz);
            } while (obj == null);
            obj = zzc(((List) (obj))).values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzc((Map)((Iterator) (obj)).next());
            }
        } while (true);
        InterruptedException interruptedexception;
        interruptedexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("CsiReporter:reporter interrupted", interruptedexception);
        return;
    }

    private List zzp(int i)
        throws InterruptedException
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < i; j++)
        {
            arraylist.add(zzuF.take());
        }

        return arraylist;
    }

    private void zzq(int i)
    {
        int j = i;
        if (i < 1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("CsiReporter - too small batch size :").append(i).append(", changed to 1").toString());
            j = 1;
        }
        i = j;
        if (j > zzuA)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("CsiReporter - batch size :").append(j).append(" bigger than buffer size, ").append("change to buffer limit").toString());
            i = zzuA;
        }
        zzuz = i;
    }

    String zza(String s, Map map)
    {
        s = Uri.parse(s).buildUpon();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); s.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return s.build().toString();
    }

    public boolean zza(zzce zzce1)
    {
        return zzuF.offer(zzce1);
    }

    Map zzc(List list)
    {
        Object obj;
        obj = new LinkedHashMap();
        for (list = list.iterator(); list.hasNext();)
        {
            zzce zzce1 = (zzce)list.next();
            String s = zzce1.zzdr();
            if (((Map) (obj)).containsKey(s))
            {
                ((List)((Map) (obj)).get(s)).add(zzce1);
            } else
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(zzce1);
                ((Map) (obj)).put(s, arraylist);
            }
        }

        list = new LinkedHashMap();
        obj = ((Map) (obj)).entrySet().iterator();
_L2:
        List list1;
        java.util.Map.Entry entry;
        LinkedHashMap linkedhashmap;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        list1 = (List)entry.getValue();
        linkedhashmap = new LinkedHashMap(zzuH);
        Map map = zzce.zza((zzce[])list1.toArray(new zzce[list1.size()]));
        linkedhashmap.putAll(map);
        list.put(entry.getKey(), linkedhashmap);
        continue; /* Loop/switch isn't completed */
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("CsiReporter:failed to merge tickers:").append(list1).toString(), illegalargumentexception);
        if (true) goto _L2; else goto _L1
_L1:
        return list;
    }

    void zzd(String s, String s1)
    {
        zzuH.put(s, s1);
    }
}
