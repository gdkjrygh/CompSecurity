// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
//            zzby, zzbu, zzhu, zzcd

public class zzca
{

    final Context mContext;
    final String zzqK;
    String zzvg;
    BlockingQueue zzvi;
    ExecutorService zzvj;
    LinkedHashMap zzvk;
    private AtomicBoolean zzvl;
    private File zzvm;

    public zzca(Context context, String s, String s1, Map map)
    {
        zzvk = new LinkedHashMap();
        mContext = context;
        zzqK = s;
        zzvg = s1;
        zzvl = new AtomicBoolean(false);
        zzvl.set(((Boolean)zzby.zzuD.get()).booleanValue());
        if (zzvl.get())
        {
            context = Environment.getExternalStorageDirectory();
            if (context != null)
            {
                zzvm = new File(context, "sdk_csi_data.txt");
            }
        }
        for (context = map.entrySet().iterator(); context.hasNext(); zzvk.put(s.getKey(), s.getValue()))
        {
            s = (java.util.Map.Entry)context.next();
        }

        zzvi = new ArrayBlockingQueue(30);
        zzvj = Executors.newSingleThreadExecutor();
        zzvj.execute(new Runnable() {

            final zzca zzvn;

            public void run()
            {
                zzca.zza(zzvn);
            }

            
            {
                zzvn = zzca.this;
                super();
            }
        });
    }

    static void zza(zzca zzca1)
    {
        zzca1.zzdi();
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
        return;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        s = fileoutputstream;
          goto _L7
    }

    private void zzc(Map map, String s)
    {
        map = zza(zzvg, map, s);
        if (zzvl.get())
        {
            zza(zzvm, map);
            return;
        } else
        {
            zzp.zzbx().zzc(mContext, zzqK, map);
            return;
        }
    }

    private void zzdi()
    {
        do
        {
            zzcd zzcd1;
            String s;
            do
            {
                zzcd1 = (zzcd)zzvi.take();
                s = zzcd1.zzdn();
            } while (TextUtils.isEmpty(s));
            zzvk.putAll(zzcd1.zzn());
            zzc(zzvk, s);
        } while (true);
        InterruptedException interruptedexception;
        interruptedexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("CsiReporter:reporter interrupted", interruptedexception);
        return;
    }

    String zza(String s, Map map, String s1)
    {
        s = Uri.parse(s).buildUpon();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); s.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        s = new StringBuilder(s.build().toString());
        s.append("&").append("it").append("=").append(s1);
        return s.toString();
    }

    public boolean zza(zzcd zzcd1)
    {
        return zzvi.offer(zzcd1);
    }

    public void zzb(List list)
    {
        if (list != null && !list.isEmpty())
        {
            zzvk.put("e", TextUtils.join(",", list));
        }
    }
}
