// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
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
//            zzd, zzal, zzai, zze, 
//            zzb, zzaa, zzq, zzae, 
//            zzl, zzn

class zzag extends zzd
{
    private class zza
    {

        private int zzIx;
        private ByteArrayOutputStream zzIy;
        final zzag zzIz;

        public byte[] getPayload()
        {
            return zzIy.toByteArray();
        }

        public boolean zzj(zzaa zzaa1)
        {
            zzv.zzr(zzaa1);
            if (zzIx + 1 > zzIz.zzgI().zzia())
            {
                return false;
            }
            String s = zzIz.zza(zzaa1, false);
            if (s == null)
            {
                zzIz.zzgH().zza(zzaa1, "Error formatting hit");
                return true;
            }
            byte abyte0[] = s.getBytes();
            int j = abyte0.length;
            if (j > zzIz.zzgI().zzhS())
            {
                zzIz.zzgH().zza(zzaa1, "Hit size exceeds the maximum size limit");
                return true;
            }
            int i = j;
            if (zzIy.size() > 0)
            {
                i = j + 1;
            }
            if (i + zzIy.size() > zzIz.zzgI().zzhU())
            {
                return false;
            }
            try
            {
                if (zzIy.size() > 0)
                {
                    zzIy.write(zzag.zzja());
                }
                zzIy.write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (zzaa zzaa1)
            {
                zzIz.zze("Failed to write payload when batching hits", zzaa1);
                return true;
            }
            zzIx = zzIx + 1;
            return true;
        }

        public int zzjb()
        {
            return zzIx;
        }

        public zza()
        {
            zzIz = zzag.this;
            super();
            zzIy = new ByteArrayOutputStream();
        }
    }


    private static final byte zzIw[] = "\n".getBytes();
    private final String zzBW;
    private final zzai zzIv;

    zzag(zze zze1)
    {
        super(zze1);
        zzBW = zza("GoogleAnalytics", "4.5.0", android.os.Build.VERSION.RELEASE, zzal.zza(Locale.getDefault()), Build.MODEL, Build.ID);
        zzIv = new zzai(zze1.zzgG());
    }

    private int zza(URL url)
    {
        URL url1;
        URL url2;
        zzv.zzr(url);
        zzb("GET request", url);
        url2 = null;
        url1 = null;
        url = zzb(url);
        url1 = url;
        url2 = url;
        url.connect();
        url1 = url;
        url2 = url;
        zza(((HttpURLConnection) (url)));
        url1 = url;
        url2 = url;
        int j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        url1 = url;
        url2 = url;
        zzfZ().zzgB();
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
        zzv.zzr(url);
        zzv.zzr(abyte0);
        zzb("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (zzgQ())
        {
            zza("Post payload\n", new String(abyte0));
        }
        url = zzb(url);
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
        zza(((HttpURLConnection) (url2)));
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
        zzfZ().zzgB();
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

    private void zza(HttpURLConnection httpurlconnection)
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

    private int zzb(URL url, byte abyte0[])
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        zzv.zzr(url);
        zzv.zzr(abyte0);
        byte abyte1[];
        abyte1 = zze(abyte0);
        zza("POST compressed size, ratio %, url", Integer.valueOf(abyte1.length), Long.valueOf((100L * (long)abyte1.length) / (long)abyte0.length), url);
        if (abyte1.length > abyte0.length)
        {
            zzc("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(abyte1.length), Integer.valueOf(abyte0.length));
        }
        if (zzgQ())
        {
            zza("Post payload", (new StringBuilder()).append("\n").append(new String(abyte0)).toString());
        }
        url = zzb(url);
        url.setDoOutput(true);
        url.addRequestProperty("Content-Encoding", "gzip");
        url.setFixedLengthStreamingMode(abyte1.length);
        url.connect();
        abyte0 = url.getOutputStream();
        abyte0.write(abyte1);
        abyte0.close();
        int j;
        zza(url);
        j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        zzfZ().zzgB();
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

    private URL zzb(zzaa zzaa1, String s)
    {
        if (zzaa1.zziQ())
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzic()).append(zzgI().zzie()).append("?").append(s).toString();
        } else
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzid()).append(zzgI().zzie()).append("?").append(s).toString();
        }
        try
        {
            zzaa1 = new URL(zzaa1);
        }
        // Misplaced declaration of an exception variable
        catch (zzaa zzaa1)
        {
            zze("Error trying to parse the hardcoded host url", zzaa1);
            return null;
        }
        return zzaa1;
    }

    private static byte[] zze(byte abyte0[])
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        gzipoutputstream.write(abyte0);
        gzipoutputstream.close();
        bytearrayoutputstream.close();
        return bytearrayoutputstream.toByteArray();
    }

    private boolean zzg(zzaa zzaa1)
    {
        String s;
        zzv.zzr(zzaa1);
        boolean flag;
        if (!zzaa1.zziQ())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = zza(zzaa1, flag);
        if (s != null) goto _L2; else goto _L1
_L1:
        zzgH().zza(zzaa1, "Error formatting hit for upload");
_L4:
        return true;
_L2:
        if (s.length() > zzgI().zzhR())
        {
            break; /* Loop/switch isn't completed */
        }
        zzaa1 = zzb(zzaa1, s);
        if (zzaa1 == null)
        {
            zzaJ("Failed to build collect GET endpoint url");
            return false;
        }
        if (zza(zzaa1) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s1 = zza(zzaa1, false);
        if (s1 == null)
        {
            zzgH().zza(zzaa1, "Error formatting hit for POST upload");
            return true;
        }
        byte abyte0[] = s1.getBytes();
        if (abyte0.length > zzgI().zzhT())
        {
            zzgH().zza(zzaa1, "Hit payload exceeds size limit");
            return true;
        }
        zzaa1 = zzh(zzaa1);
        if (zzaa1 == null)
        {
            zzaJ("Failed to build collect POST endpoint url");
            return false;
        }
        if (zza(zzaa1, abyte0) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private URL zzh(zzaa zzaa1)
    {
        if (zzaa1.zziQ())
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzic()).append(zzgI().zzie()).toString();
        } else
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzid()).append(zzgI().zzie()).toString();
        }
        try
        {
            zzaa1 = new URL(zzaa1);
        }
        // Misplaced declaration of an exception variable
        catch (zzaa zzaa1)
        {
            zze("Error trying to parse the hardcoded host url", zzaa1);
            return null;
        }
        return zzaa1;
    }

    private String zzi(zzaa zzaa1)
    {
        return String.valueOf(zzaa1.zziN());
    }

    private URL zziZ()
    {
        Object obj = (new StringBuilder()).append(zzgI().zzic()).append(zzgI().zzif()).toString();
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

    static byte[] zzja()
    {
        return zzIw;
    }

    String zza(zzaa zzaa1, boolean flag)
    {
        StringBuilder stringbuilder;
        zzv.zzr(zzaa1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = zzaa1.zzhe().entrySet().iterator();
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
        catch (zzaa zzaa1)
        {
            zze("Failed to encode name or value", zzaa1);
            return null;
        }
        zza(stringbuilder, "ht", String.valueOf(zzaa1.zziO()));
        zza(stringbuilder, "qt", String.valueOf(zzgG().currentTimeMillis() - zzaa1.zziO()));
        if (zzgI().zzhO())
        {
            zza(stringbuilder, "_gmsv", zzfZ().zzgy());
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = zzaa1.zziR();
        if (l == 0L) goto _L4; else goto _L3
_L3:
        zzaa1 = String.valueOf(l);
_L6:
        zza(stringbuilder, "z", ((String) (zzaa1)));
_L2:
        return stringbuilder.toString();
_L4:
        zzaa1 = zzi(zzaa1);
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
        zzv.zzQ(flag1);
        zza("Uploading batched hits. compression, count", Boolean.valueOf(flag), Integer.valueOf(list.size()));
        zza1 = new zza();
        arraylist = new ArrayList();
        list = list.iterator();
label0:
        do
        {
            zzaa zzaa1;
label1:
            {
                if (list.hasNext())
                {
                    zzaa1 = (zzaa)list.next();
                    if (zza1.zzj(zzaa1))
                    {
                        break label1;
                    }
                }
                if (zza1.zzjb() == 0)
                {
                    return arraylist;
                }
                break label0;
            }
            arraylist.add(Long.valueOf(zzaa1.zziN()));
        } while (true);
        list = zziZ();
        if (list == null)
        {
            zzaJ("Failed to build batching endpoint url");
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
            zza("Batched upload completed. Hits batched", Integer.valueOf(zza1.zzjb()));
            return arraylist;
        }
        zza("Network error uploading hits. status code", Integer.valueOf(i));
        if (zzgI().zzii().contains(Integer.valueOf(i)))
        {
            zzaI("Server instructed the client to stop batching");
            zzIv.start();
        }
        return Collections.emptyList();
    }

    HttpURLConnection zzb(URL url)
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
            url.setConnectTimeout(zzgI().zzir());
            url.setReadTimeout(zzgI().zzis());
            url.setInstanceFollowRedirects(false);
            url.setRequestProperty("User-Agent", zzBW);
            url.setDoInput(true);
            return url;
        }
    }

    public List zzg(List list)
    {
        boolean flag2 = true;
        zzgF();
        zzgR();
        zzv.zzr(list);
        boolean flag1;
        if (zzgI().zzii().isEmpty() || !zzIv.zzt(zzgI().zzib() * 1000L))
        {
            flag2 = false;
            flag1 = false;
        } else
        {
            boolean flag;
            if (zzgI().zzig() != zzl.zzGD)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (zzgI().zzih() != zzn.zzGP)
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
            return zzh(list);
        }
    }

    protected void zzgb()
    {
        zza("Network initialized. User agent", zzBW);
    }

    List zzh(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            zzaa zzaa1;
label0:
            {
                if (list.hasNext())
                {
                    zzaa1 = (zzaa)list.next();
                    if (zzg(zzaa1))
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            arraylist.add(Long.valueOf(zzaa1.zziN()));
            if (arraylist.size() >= zzgI().zzhZ())
            {
                return arraylist;
            }
        } while (true);
    }

    public boolean zziY()
    {
        zzgF();
        zzgR();
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
            zzaF("No network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

}
