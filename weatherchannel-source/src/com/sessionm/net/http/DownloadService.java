// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net.http;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.sessionm.a.a;
import com.sessionm.core.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Locale;

// Referenced classes of package com.sessionm.net.http:
//            b

public class DownloadService extends IntentService
{

    public static final String CHECKSUM_ALGORITHM = "CHECKSUM_ALGORITHM";
    private static final String DOWNLOAD_DESTINATION = "DOWNLOAD_DESTINATION";
    private static final String DOWNLOAD_URL = "DOWNLOAD_URL";
    private static final String EXPECTED_CHECKSUM = "EXPECTED_CHECKSUM";
    private static final String EXPECTED_SIZE = "EXPECTED_SIZE";
    private static final String TAG = "SessionM.Download";
    private static b listener;
    private static boolean simulateDownloadFailure;

    public DownloadService()
    {
        super("Download Service");
    }

    private void downloadFile(String s, String s1, String s2, String s3, int i)
    {
        Object obj1;
        Object obj3;
        Object obj4;
        int j;
        int k;
        int i1;
        int j1;
        long l2;
        long l3;
        if (Log.isLoggable("SessionM.Download", 3))
        {
            Log.d("SessionM.Download", String.format("start downloading url: %s", new Object[] {
                s
            }));
        }
        k = 0;
        j = 0;
        i1 = 0;
        l3 = 0L;
        j1 = 1;
        obj4 = null;
        obj1 = null;
        obj3 = null;
        l2 = l3;
        long l1 = System.currentTimeMillis();
        l2 = l1;
        l3 = l1;
        Object obj = (HttpURLConnection)(new URL(s)).openConnection();
        obj1 = obj4;
        k = j;
        ((HttpURLConnection) (obj)).setInstanceFollowRedirects(true);
        obj1 = obj4;
        k = j;
        ((HttpURLConnection) (obj)).setConnectTimeout(30000);
        obj1 = obj4;
        k = j;
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        obj1 = obj4;
        k = j;
        File file = new File(s1);
        obj1 = obj4;
        k = j;
        MessageDigest messagedigest = h.b(file, s3);
        obj1 = obj4;
        k = j;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj1 = obj4;
        k = j;
        l2 = file.length();
        obj1 = obj4;
        k = j;
        if (!Log.isLoggable("SessionM.Download", 3))
        {
            break MISSING_BLOCK_LABEL_244;
        }
        obj1 = obj4;
        k = j;
        Log.d("SessionM.Download", String.format("Resuming download at %d bytes.", new Object[] {
            Long.valueOf(l2)
        }));
        obj1 = obj4;
        k = j;
        ((HttpURLConnection) (obj)).setRequestProperty("Range", String.format(Locale.US, "bytes=%d-", new Object[] {
            Long.valueOf(l2)
        }));
        if (messagedigest == null) goto _L2; else goto _L1
_L1:
        obj1 = obj4;
        k = j;
        s1 = new DigestInputStream(new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream(), 0x10000), messagedigest);
_L10:
        int l;
        l = j1;
        obj1 = s1;
        k = j;
        j = ((HttpURLConnection) (obj)).getResponseCode();
        if (j < 200 || j >= 400) goto _L4; else goto _L3
_L3:
        l = j1;
        i1 = j;
        obj1 = s1;
        k = j;
        s3 = new BufferedOutputStream(new FileOutputStream(file, file.exists()));
        obj1 = new byte[0x10000];
        l = 1;
        k = 0;
_L11:
        i1 = l;
        j1 = s1.read(((byte []) (obj1)));
        if (j1 == -1) goto _L6; else goto _L5
_L5:
        i1 = l;
        if (!simulateDownloadFailure || k <= 500) goto _L7; else goto _L6
_L6:
        i1 = l;
        if (!simulateDownloadFailure) goto _L9; else goto _L8
_L8:
        i1 = l;
        boolean flag;
        try
        {
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            obj1 = obj;
        }
        finally
        {
            i = k;
        }
        i = j;
        j = k;
        s2 = s3;
        k = i1;
        obj = obj3;
        s3 = ((String) (obj1));
_L28:
        l = i;
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        l = s3.getResponseCode();
        i = l;
_L23:
        l = k;
        if (k == 1)
        {
            l = 6;
        }
        if (Log.isLoggable("SessionM.Download", 3))
        {
            Log.d("SessionM.Download", "Uncaught exception during download processing", ((Throwable) (obj)));
        }
        h.a(s1);
        h.a(s2);
        l2 = System.currentTimeMillis();
        if (Log.isLoggable("SessionM.Download", 3))
        {
            s1 = String.format(Locale.US, "URL: %s, code: %d, error: %s, processing time: %d, response size: %d", new Object[] {
                s, Integer.valueOf(i), null, Long.valueOf(l2 - l1), Integer.valueOf(j)
            });
            Log.d("SessionM.Download", (new StringBuilder()).append("Finish request, ").append(s1).toString());
        }
        j = l;
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_653;
        }
        s3.disconnect();
        j = l;
_L19:
        if (listener != null)
        {
            listener.a(this, s, j);
        }
        return;
_L2:
        obj1 = obj4;
        k = j;
        if (!Log.isLoggable("SessionM.Download", 3))
        {
            break MISSING_BLOCK_LABEL_705;
        }
        obj1 = obj4;
        k = j;
        Log.d("SessionM.Download", "Skipping file checksum since digest is unavailable.");
        obj1 = obj4;
        k = j;
        s1 = new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream(), 0x10000);
          goto _L10
        s2;
        l = 7;
        i1 = j;
        obj1 = s1;
        k = j;
        try
        {
            throw s2;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            k = l;
        }
        finally
        {
            i = 0;
        }
        obj1 = null;
        i = i1;
        j = 0;
        s3 = ((String) (obj));
        obj = s2;
        s2 = ((String) (obj1));
        break MISSING_BLOCK_LABEL_487;
_L7:
        i1 = l;
        s3.write(((byte []) (obj1)), 0, j1);
        i1 = l;
        s3.flush();
_L12:
        k += j1;
          goto _L11
        obj3;
        l = 7;
          goto _L12
_L9:
        if (i == 0) goto _L14; else goto _L13
_L13:
        i1 = l;
        if (file.length() == (long)i) goto _L14; else goto _L15
_L15:
        i1 = l;
        if (!Log.isLoggable("SessionM.Download", 3))
        {
            break MISSING_BLOCK_LABEL_898;
        }
        i1 = l;
        Log.d("SessionM.Download", String.format(Locale.US, "incorrect file size file for url: %s expected: %d actual: %d", new Object[] {
            s, Integer.valueOf(i), Long.valueOf(file.length())
        }));
        i = 5;
        i1 = i;
        flag = file.delete();
        if (flag) goto _L17; else goto _L16
_L16:
        i = 7;
        s2 = s3;
_L21:
        h.a(s1);
        h.a(s2);
        l2 = System.currentTimeMillis();
        if (Log.isLoggable("SessionM.Download", 3))
        {
            s1 = String.format(Locale.US, "URL: %s, code: %d, error: %s, processing time: %d, response size: %d", new Object[] {
                s, Integer.valueOf(j), null, Long.valueOf(l2 - l1), Integer.valueOf(k)
            });
            Log.d("SessionM.Download", (new StringBuilder()).append("Finish request, ").append(s1).toString());
        }
        j = i;
        if (obj == null) goto _L19; else goto _L18
_L18:
        ((HttpURLConnection) (obj)).disconnect();
        j = i;
          goto _L19
        s1;
        j = i;
        if (Log.isLoggable("SessionM.Download", 3))
        {
            Log.d("SessionM.Download", "Exception on disconnect.", s1);
            j = i;
        }
          goto _L19
_L14:
        if (messagedigest == null)
        {
            break MISSING_BLOCK_LABEL_1227;
        }
        i1 = l;
        obj1 = a.a(messagedigest.digest());
        i1 = l;
        if (!((String) (obj1)).equals(s2))
        {
            break MISSING_BLOCK_LABEL_1157;
        }
        i1 = l;
        i = l;
        if (!Log.isLoggable("SessionM.Download", 3))
        {
            break MISSING_BLOCK_LABEL_1670;
        }
        i1 = l;
        Log.d("SessionM.Download", String.format(Locale.US, "downloaded file for url: %s checksum: %s", new Object[] {
            s, obj1
        }));
        i = l;
        break MISSING_BLOCK_LABEL_1670;
        i1 = l;
        if (!Log.isLoggable("SessionM.Download", 3))
        {
            break MISSING_BLOCK_LABEL_1205;
        }
        i1 = l;
        Log.d("SessionM.Download", String.format(Locale.US, "checksums do not match for url: %s expected: %s actual: %s", new Object[] {
            s, s2, obj1
        }));
        i = 4;
        i1 = i;
        if (!file.delete())
        {
            i = 7;
        }
        break MISSING_BLOCK_LABEL_1670;
        i1 = l;
        i = l;
        if (!Log.isLoggable("SessionM.Download", 3)) goto _L17; else goto _L20
_L20:
        i1 = l;
        Log.d("SessionM.Download", String.format(Locale.US, "downloaded file for url: %s", new Object[] {
            s
        }));
        i = l;
_L17:
        s2 = s3;
          goto _L21
        obj1;
        if (!Log.isLoggable("SessionM.Download", 3)) goto _L23; else goto _L22
_L22:
        Log.d("SessionM.Download", "Status code unavailable.", ((Throwable) (obj1)));
          goto _L23
        s1;
        j = l;
        if (Log.isLoggable("SessionM.Download", 3))
        {
            Log.d("SessionM.Download", "Exception on disconnect.", s1);
            j = l;
        }
          goto _L19
        s2;
        i = 0;
        s3 = null;
        obj = null;
        j = k;
        l1 = l2;
        s1 = ((String) (obj1));
_L27:
        h.a(s1);
        h.a(s3);
        l2 = System.currentTimeMillis();
        if (Log.isLoggable("SessionM.Download", 3))
        {
            s = String.format(Locale.US, "URL: %s, code: %d, error: %s, processing time: %d, response size: %d", new Object[] {
                s, Integer.valueOf(j), null, Long.valueOf(l2 - l1), Integer.valueOf(i)
            });
            Log.d("SessionM.Download", (new StringBuilder()).append("Finish request, ").append(s).toString());
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1461;
        }
        ((HttpURLConnection) (obj)).disconnect();
_L25:
        throw s2;
        s;
        if (Log.isLoggable("SessionM.Download", 3))
        {
            Log.d("SessionM.Download", "Exception on disconnect.", s);
        }
        if (true) goto _L25; else goto _L24
_L24:
        s3 = null;
        s1 = ((String) (obj1));
        j = k;
        continue; /* Loop/switch isn't completed */
        s2;
        i = 0;
        continue; /* Loop/switch isn't completed */
        obj;
        String s4 = s2;
        k = i;
        s2 = ((String) (obj));
        obj = s3;
        s3 = s4;
        i = j;
        j = k;
        continue; /* Loop/switch isn't completed */
        obj;
        String s5 = s2;
        k = i;
        s2 = ((String) (obj));
        obj = s3;
        s3 = s5;
        i = j;
        j = k;
        if (true) goto _L27; else goto _L26
_L26:
        obj;
        i = 0;
        j = 0;
        s1 = null;
        s3 = null;
        k = 1;
        s2 = null;
        l1 = l3;
          goto _L28
        s1;
        k = 1;
        s2 = null;
        i = 0;
        j = 0;
        Object obj2 = null;
        s3 = ((String) (obj));
        obj = s1;
        s1 = obj2;
          goto _L28
        Throwable throwable;
        throwable;
        k = 1;
        s2 = s3;
        i = j;
        j = 0;
        s3 = ((String) (obj));
        obj = throwable;
          goto _L28
_L4:
        i = 1;
        k = 0;
        s2 = ((String) (obj3));
          goto _L21
        s2 = s3;
          goto _L21
    }

    public static boolean isSimulateDownloadFailure()
    {
        return simulateDownloadFailure;
    }

    public static void setListener(b b1)
    {
        listener = b1;
    }

    public static void setSimulateDownloadFailure(boolean flag)
    {
        simulateDownloadFailure = flag;
    }

    public static void start(Context context, String s, String s1, String s2, String s3, int i)
    {
        if (Log.isLoggable("SessionM.Download", 3))
        {
            Log.d("SessionM.Download", String.format("send download intent url: %s, path: %s", new Object[] {
                s, s1
            }));
        }
        Intent intent = new Intent(context, com/sessionm/net/http/DownloadService);
        intent.setFlags(0x10000000);
        intent.putExtra("DOWNLOAD_URL", s);
        intent.putExtra("EXPECTED_CHECKSUM", s2);
        intent.putExtra("DOWNLOAD_DESTINATION", s1);
        intent.putExtra("CHECKSUM_ALGORITHM", s3);
        intent.putExtra("EXPECTED_SIZE", i);
        context.startService(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        String s = intent.getStringExtra("DOWNLOAD_URL");
        String s1 = intent.getStringExtra("DOWNLOAD_DESTINATION");
        if (Log.isLoggable("SessionM.Download", 3))
        {
            Log.d("SessionM.Download", String.format("received download intent url: %s, path: %s", new Object[] {
                s, s1
            }));
        }
        if (s == null)
        {
            throw new NullPointerException("null url sent to download service.");
        }
        if (s1 == null)
        {
            throw new NullPointerException("null destination path sent to download service.");
        } else
        {
            downloadFile(s, s1, intent.getStringExtra("EXPECTED_CHECKSUM"), intent.getStringExtra("CHECKSUM_ALGORITHM"), intent.getIntExtra("EXPECTED_SIZE", 0));
            return;
        }
    }
}
