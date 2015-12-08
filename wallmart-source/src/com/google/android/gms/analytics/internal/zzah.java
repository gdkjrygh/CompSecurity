// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zze, zzam, zzaj, 
//            zzf, zzb, zzab, zzr, 
//            zzaf, zzm, zzo

class zzah extends zzd
{
    private class zza
    {

        private int zzOt;
        private ByteArrayOutputStream zzOu;
        final zzah zzOv;

        public byte[] getPayload()
        {
            return zzOu.toByteArray();
        }

        public boolean zzj(zzab zzab1)
        {
            zzx.zzv(zzab1);
            if (zzOt + 1 > zzOv.zzif().zzjw())
            {
                return false;
            }
            String s = zzOv.zza(zzab1, false);
            if (s == null)
            {
                zzOv.zzie().zza(zzab1, "Error formatting hit");
                return true;
            }
            byte abyte0[] = s.getBytes();
            int j = abyte0.length;
            if (j > zzOv.zzif().zzjo())
            {
                zzOv.zzie().zza(zzab1, "Hit size exceeds the maximum size limit");
                return true;
            }
            int i = j;
            if (zzOu.size() > 0)
            {
                i = j + 1;
            }
            if (i + zzOu.size() > zzOv.zzif().zzjq())
            {
                return false;
            }
            try
            {
                if (zzOu.size() > 0)
                {
                    zzOu.write(zzah.zzkw());
                }
                zzOu.write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (zzab zzab1)
            {
                zzOv.zze("Failed to write payload when batching hits", zzab1);
                return true;
            }
            zzOt = zzOt + 1;
            return true;
        }

        public int zzkx()
        {
            return zzOt;
        }

        public zza()
        {
            zzOv = zzah.this;
            super();
            zzOu = new ByteArrayOutputStream();
        }
    }


    private static final byte zzOs[] = "\n".getBytes();
    private final String zzHj;
    private final zzaj zzOr;

    zzah(zzf zzf1)
    {
        super(zzf1);
        zzHj = zza("GoogleAnalytics", zze.VERSION, android.os.Build.VERSION.RELEASE, zzam.zza(Locale.getDefault()), Build.MODEL, Build.ID);
        zzOr = new zzaj(zzf1.zzid());
    }

    private int zza(URL url, byte abyte0[])
    {
        URL url2;
        OutputStream outputstream;
        OutputStream outputstream1;
        Object obj;
        url2 = null;
        outputstream1 = null;
        obj = null;
        outputstream = null;
        zzx.zzv(url);
        zzx.zzv(abyte0);
        zzb("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (zzin())
        {
            zza("Post payload\n", new String(abyte0));
        }
        url = zzc(url);
        URL url1;
        url2 = url;
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        url2.setDoOutput(true);
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        url2.setFixedLengthStreamingMode(abyte0.length);
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        url2.connect();
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        outputstream1 = url2.getOutputStream();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        outputstream1.write(abyte0);
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        zzb(url2);
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        int j = url2.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        zzhz().zzhZ();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        zzb("POST status", Integer.valueOf(j));
        int i;
        if (outputstream1 != null)
        {
            try
            {
                outputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                zze("Error closing http post connection output stream", url);
            }
        }
        i = j;
        if (url2 != null)
        {
            url2.disconnect();
            i = j;
        }
_L2:
        return i;
        abyte0;
        url2 = null;
_L5:
        url = outputstream;
        url1 = url2;
        zzd("Network POST connection error", abyte0);
        i = 0;
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                zze("Error closing http post connection output stream", url);
            }
        }
        if (url2 == null) goto _L2; else goto _L1
_L1:
        url2.disconnect();
        return 0;
        abyte0;
        url1 = null;
        url = url2;
_L4:
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                zze("Error closing http post connection output stream", url);
            }
        }
        if (url1 != null)
        {
            url1.disconnect();
        }
        throw abyte0;
        abyte0;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
          goto _L5
    }

    private static String zza(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    private void zza(StringBuilder stringbuilder, String s, String s1)
        throws UnsupportedEncodingException
    {
        if (stringbuilder.length() != 0)
        {
            stringbuilder.append('&');
        }
        stringbuilder.append(URLEncoder.encode(s, "UTF-8"));
        stringbuilder.append('=');
        stringbuilder.append(URLEncoder.encode(s1, "UTF-8"));
    }

    private int zzb(URL url)
    {
        URL url1;
        URL url2;
        zzx.zzv(url);
        zzb("GET request", url);
        url2 = null;
        url1 = null;
        url = zzc(url);
        url1 = url;
        url2 = url;
        url.connect();
        url1 = url;
        url2 = url;
        zzb(((HttpURLConnection) (url)));
        url1 = url;
        url2 = url;
        int j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        url1 = url;
        url2 = url;
        zzhz().zzhZ();
        url1 = url;
        url2 = url;
        zzb("GET status", Integer.valueOf(j));
        int i;
        i = j;
        if (url != null)
        {
            url.disconnect();
            i = j;
        }
_L2:
        return i;
        url;
        url2 = url1;
        zzd("Network GET connection error", url);
        i = 0;
        if (url1 == null) goto _L2; else goto _L1
_L1:
        url1.disconnect();
        return 0;
        url;
        if (url2 != null)
        {
            url2.disconnect();
        }
        throw url;
    }

    private int zzb(URL url, byte abyte0[])
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        zzx.zzv(url);
        zzx.zzv(abyte0);
        byte abyte1[];
        abyte1 = zzg(abyte0);
        zza("POST compressed size, ratio %, url", Integer.valueOf(abyte1.length), Long.valueOf((100L * (long)abyte1.length) / (long)abyte0.length), url);
        if (abyte1.length > abyte0.length)
        {
            zzc("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(abyte1.length), Integer.valueOf(abyte0.length));
        }
        if (zzin())
        {
            zza("Post payload", (new StringBuilder()).append("\n").append(new String(abyte0)).toString());
        }
        url = zzc(url);
        url.setDoOutput(true);
        url.addRequestProperty("Content-Encoding", "gzip");
        url.setFixedLengthStreamingMode(abyte1.length);
        url.connect();
        abyte0 = url.getOutputStream();
        abyte0.write(abyte1);
        abyte0.close();
        int j;
        zzb(((HttpURLConnection) (url)));
        j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        zzhz().zzhZ();
        zzb("POST status", Integer.valueOf(j));
        int i;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                zze("Error closing http compressed post connection output stream", abyte0);
            }
        }
        i = j;
        if (url != null)
        {
            url.disconnect();
            i = j;
        }
_L2:
        return i;
        abyte0;
        url = null;
_L5:
        zzd("Network compressed POST connection error", abyte0);
        i = 0;
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                zze("Error closing http compressed post connection output stream", abyte0);
            }
        }
        if (url == null) goto _L2; else goto _L1
_L1:
        url.disconnect();
        return 0;
        abyte0;
        url = null;
        obj = obj1;
_L4:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                zze("Error closing http compressed post connection output stream", obj);
            }
        }
        if (url != null)
        {
            url.disconnect();
        }
        throw abyte0;
        abyte0;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
        continue; /* Loop/switch isn't completed */
        abyte0;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
          goto _L5
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
          goto _L5
    }

    private URL zzb(zzab zzab1, String s)
    {
        if (zzab1.zzkm())
        {
            zzab1 = (new StringBuilder()).append(zzif().zzjy()).append(zzif().zzjA()).append("?").append(s).toString();
        } else
        {
            zzab1 = (new StringBuilder()).append(zzif().zzjz()).append(zzif().zzjA()).append("?").append(s).toString();
        }
        try
        {
            zzab1 = new URL(zzab1);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
        {
            zze("Error trying to parse the hardcoded host url", zzab1);
            return null;
        }
        return zzab1;
    }

    private void zzb(HttpURLConnection httpurlconnection)
        throws IOException
    {
        HttpURLConnection httpurlconnection1 = null;
        httpurlconnection = httpurlconnection.getInputStream();
        httpurlconnection1 = httpurlconnection;
        byte abyte0[] = new byte[1024];
_L2:
        httpurlconnection1 = httpurlconnection;
        int i = httpurlconnection.read(abyte0);
        if (i > 0) goto _L2; else goto _L1
_L1:
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        httpurlconnection.close();
        return;
        httpurlconnection;
        zze("Error closing http connection input stream", httpurlconnection);
        return;
        httpurlconnection;
        if (httpurlconnection1 != null)
        {
            try
            {
                httpurlconnection1.close();
            }
            catch (IOException ioexception)
            {
                zze("Error closing http connection input stream", ioexception);
            }
        }
        throw httpurlconnection;
    }

    private boolean zzg(zzab zzab1)
    {
        String s;
        zzx.zzv(zzab1);
        boolean flag;
        if (!zzab1.zzkm())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = zza(zzab1, flag);
        if (s != null) goto _L2; else goto _L1
_L1:
        zzie().zza(zzab1, "Error formatting hit for upload");
_L4:
        return true;
_L2:
        if (s.length() > zzif().zzjn())
        {
            break; /* Loop/switch isn't completed */
        }
        zzab1 = zzb(zzab1, s);
        if (zzab1 == null)
        {
            zzbc("Failed to build collect GET endpoint url");
            return false;
        }
        if (zzb(zzab1) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s1 = zza(zzab1, false);
        if (s1 == null)
        {
            zzie().zza(zzab1, "Error formatting hit for POST upload");
            return true;
        }
        byte abyte0[] = s1.getBytes();
        if (abyte0.length > zzif().zzjp())
        {
            zzie().zza(zzab1, "Hit payload exceeds size limit");
            return true;
        }
        zzab1 = zzh(zzab1);
        if (zzab1 == null)
        {
            zzbc("Failed to build collect POST endpoint url");
            return false;
        }
        if (zza(zzab1, abyte0) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static byte[] zzg(byte abyte0[])
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        gzipoutputstream.write(abyte0);
        gzipoutputstream.close();
        bytearrayoutputstream.close();
        return bytearrayoutputstream.toByteArray();
    }

    private URL zzh(zzab zzab1)
    {
        if (zzab1.zzkm())
        {
            zzab1 = (new StringBuilder()).append(zzif().zzjy()).append(zzif().zzjA()).toString();
        } else
        {
            zzab1 = (new StringBuilder()).append(zzif().zzjz()).append(zzif().zzjA()).toString();
        }
        try
        {
            zzab1 = new URL(zzab1);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
        {
            zze("Error trying to parse the hardcoded host url", zzab1);
            return null;
        }
        return zzab1;
    }

    private String zzi(zzab zzab1)
    {
        return String.valueOf(zzab1.zzkj());
    }

    private URL zzkv()
    {
        Object obj = (new StringBuilder()).append(zzif().zzjy()).append(zzif().zzjB()).toString();
        try
        {
            obj = new URL(((String) (obj)));
        }
        catch (MalformedURLException malformedurlexception)
        {
            zze("Error trying to parse the hardcoded host url", malformedurlexception);
            return null;
        }
        return ((URL) (obj));
    }

    static byte[] zzkw()
    {
        return zzOs;
    }

    String zza(zzab zzab1, boolean flag)
    {
        StringBuilder stringbuilder;
        zzx.zzv(zzab1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = zzab1.zzn().entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s = (String)entry.getKey();
                if (!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s) && !"z".equals(s) && !"_gmsv".equals(s))
                {
                    zza(stringbuilder, s, (String)entry.getValue());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
        {
            zze("Failed to encode name or value", zzab1);
            return null;
        }
        zza(stringbuilder, "ht", String.valueOf(zzab1.zzkk()));
        zza(stringbuilder, "qt", String.valueOf(zzid().currentTimeMillis() - zzab1.zzkk()));
        if (zzif().zzjk())
        {
            zza(stringbuilder, "_gmsv", zze.VERSION);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = zzab1.zzkn();
        if (l == 0L) goto _L4; else goto _L3
_L3:
        zzab1 = String.valueOf(l);
_L6:
        zza(stringbuilder, "z", ((String) (zzab1)));
_L2:
        return stringbuilder.toString();
_L4:
        zzab1 = zzi(zzab1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    List zza(List list, boolean flag)
    {
        zza zza1;
        ArrayList arraylist;
        boolean flag1;
        if (!list.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zzx.zzZ(flag1);
        zza("Uploading batched hits. compression, count", Boolean.valueOf(flag), Integer.valueOf(list.size()));
        zza1 = new zza();
        arraylist = new ArrayList();
        list = list.iterator();
label0:
        do
        {
            zzab zzab1;
label1:
            {
                if (list.hasNext())
                {
                    zzab1 = (zzab)list.next();
                    if (zza1.zzj(zzab1))
                    {
                        break label1;
                    }
                }
                if (zza1.zzkx() == 0)
                {
                    return arraylist;
                }
                break label0;
            }
            arraylist.add(Long.valueOf(zzab1.zzkj()));
        } while (true);
        list = zzkv();
        if (list == null)
        {
            zzbc("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int i;
        if (flag)
        {
            i = zzb(list, zza1.getPayload());
        } else
        {
            i = zza(((URL) (list)), zza1.getPayload());
        }
        if (200 == i)
        {
            zza("Batched upload completed. Hits batched", Integer.valueOf(zza1.zzkx()));
            return arraylist;
        }
        zza("Network error uploading hits. status code", Integer.valueOf(i));
        if (zzif().zzjE().contains(Integer.valueOf(i)))
        {
            zzbb("Server instructed the client to stop batching");
            zzOr.start();
        }
        return Collections.emptyList();
    }

    HttpURLConnection zzc(URL url)
        throws IOException
    {
        url = url.openConnection();
        if (!(url instanceof HttpURLConnection))
        {
            throw new IOException("Failed to obtain http connection");
        } else
        {
            url = (HttpURLConnection)url;
            url.setDefaultUseCaches(false);
            url.setConnectTimeout(zzif().zzjN());
            url.setReadTimeout(zzif().zzjO());
            url.setInstanceFollowRedirects(false);
            url.setRequestProperty("User-Agent", zzHj);
            url.setDoInput(true);
            return url;
        }
    }

    public List zzf(List list)
    {
        boolean flag2 = true;
        zzic();
        zzio();
        zzx.zzv(list);
        boolean flag1;
        if (zzif().zzjE().isEmpty() || !zzOr.zzv(zzif().zzjx() * 1000L))
        {
            flag2 = false;
            flag1 = false;
        } else
        {
            boolean flag;
            if (zzif().zzjC() != zzm.zzMz)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (zzif().zzjD() != zzo.zzMK)
            {
                flag2 = false;
                flag1 = flag;
            }
        }
        if (flag1)
        {
            return zza(list, flag2);
        } else
        {
            return zzg(list);
        }
    }

    List zzg(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            zzab zzab1;
label0:
            {
                if (list.hasNext())
                {
                    zzab1 = (zzab)list.next();
                    if (zzg(zzab1))
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            arraylist.add(Long.valueOf(zzab1.zzkj()));
            if (arraylist.size() >= zzif().zzjv())
            {
                return arraylist;
            }
        } while (true);
    }

    protected void zzhB()
    {
        zza("Network initialized. User agent", zzHj);
    }

    public boolean zzku()
    {
        zzic();
        zzio();
        Object obj = (ConnectivityManager)getContext().getSystemService("connectivity");
        try
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        }
        catch (SecurityException securityexception)
        {
            securityexception = null;
        }
        if (obj == null || !((NetworkInfo) (obj)).isConnected())
        {
            zzaY("No network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

}
