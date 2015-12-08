// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzbo, zzbl, zzbn, zzbp

public class zzbm
{
    static class zza
    {

        ByteArrayOutputStream zzsj;
        Base64OutputStream zzsk;

        public String toString()
        {
            String s;
            try
            {
                zzsk.close();
            }
            catch (IOException ioexception)
            {
                zzb.zzb("HashManager: Unable to convert to Base64.", ioexception);
            }
            zzsj.close();
            s = zzsj.toString();
            zzsj = null;
            zzsk = null;
            return s;
            Object obj;
            obj;
            zzb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
            zzsj = null;
            zzsk = null;
            return "";
            obj;
            zzsj = null;
            zzsk = null;
            throw obj;
        }

        public void write(byte abyte0[])
            throws IOException
        {
            zzsk.write(abyte0);
        }

        public zza()
        {
            zzsj = new ByteArrayOutputStream(4096);
            zzsk = new Base64OutputStream(zzsj, 10);
        }
    }


    private final int zzse = 6;
    private final int zzsf;
    private final int zzsg = 0;
    private final zzbl zzsh = new zzbo();

    public zzbm(int i)
    {
        zzsf = i;
    }

    private String zzA(String s)
    {
        String as[];
        int i;
        as = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = zzcz();
        Arrays.sort(as, new Comparator() {

            final zzbm zzsi;

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((String)obj, (String)obj1);
            }

            public int compare(String s1, String s2)
            {
                return s2.length() - s1.length();
            }

            
            {
                zzsi = zzbm.this;
                super();
            }
        });
        i = 0;
_L2:
        if (i >= as.length || i >= zzsf)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (as[i].trim().length() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        s.write(zzsh.zzz(as[i]));
          goto _L3
        IOException ioexception;
        ioexception;
        zzb.zzb("Error while writing hash to byteStream", ioexception);
        return s.toString();
    }

    String zzB(String s)
    {
        Iterator iterator;
        String as[] = s.split("\n");
        if (as.length == 0)
        {
            return "";
        }
        s = zzcz();
        PriorityQueue priorityqueue = new PriorityQueue(zzsf, new Comparator() {

            final zzbm zzsi;

            public int compare(Object obj, Object obj1)
            {
                return zza((zzbp.zza)obj, (zzbp.zza)obj1);
            }

            public int zza(zzbp.zza zza2, zzbp.zza zza3)
            {
                return (int)(zza2.value - zza3.value);
            }

            
            {
                zzsi = zzbm.this;
                super();
            }
        });
        int i = 0;
        while (i < as.length) 
        {
            String as1[] = zzbn.zzD(as[i]);
            if (as1.length >= zzse)
            {
                zzbp.zza(as1, zzsf, zzse, priorityqueue);
            }
            i++;
        }
        iterator = priorityqueue.iterator();
_L2:
        zzbp.zza zza1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        zza1 = (zzbp.zza)iterator.next();
        s.write(zzsh.zzz(zza1.zzsm));
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        zzb.zzb("Error while writing hash to byteStream", ioexception);
_L1:
        return s.toString();
    }

    public String zza(ArrayList arraylist)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuffer.append('\n'))
        {
            stringbuffer.append(((String)arraylist.next()).toLowerCase(Locale.US));
        }

        switch (zzsg)
        {
        default:
            return "";

        case 0: // '\0'
            return zzB(stringbuffer.toString());

        case 1: // '\001'
            return zzA(stringbuffer.toString());
        }
    }

    zza zzcz()
    {
        return new zza();
    }
}
