// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import com.ebay.redlasersdk.BarcodeResult;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

// Referenced classes of package RLSDK:
//            c, p, a

private static final class <init> extends AsyncTask
{

    private static transient String a(BarcodeResult abarcoderesult[])
    {
        Object obj;
        StringBuilder stringbuilder;
        String s;
        BarcodeResult barcoderesult = abarcoderesult[0];
        stringbuilder = new StringBuilder();
        obj = barcoderesult.barcodeString;
        s = barcoderesult.getBarcodeType();
        if (barcoderesult.barcodeType != 16)
        {
            abarcoderesult = ((BarcodeResult []) (obj));
            if (barcoderesult.barcodeType != 16384)
            {
                break MISSING_BLOCK_LABEL_123;
            }
        }
        byte abyte0[];
        int j;
        abarcoderesult = new StringBuilder();
        abyte0 = MessageDigest.getInstance("SHA-1").digest(((String) (obj)).getBytes("UTF-8"));
        j = abyte0.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        abarcoderesult.append(String.format("%02X", new Object[] {
            Byte.valueOf(abyte0[i])
        }));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            abarcoderesult = abarcoderesult.toString();
        }
        // Misplaced declaration of an exception variable
        catch (BarcodeResult abarcoderesult[])
        {
            abarcoderesult.printStackTrace();
            abarcoderesult = "**ErrorGeneratingHash**";
        }
        // Misplaced declaration of an exception variable
        catch (BarcodeResult abarcoderesult[])
        {
            abarcoderesult.printStackTrace();
            abarcoderesult = "**ErrorGeneratingHash**";
        }
        try
        {
            stringbuilder.append("http://api.redlaser.com/logscan");
            stringbuilder.append((new StringBuilder("?udid=")).append(p.a()).toString());
            stringbuilder.append((new StringBuilder("&key=")).append(URLEncoder.encode(c.e, "UTF-8")).toString());
            stringbuilder.append("&platform=android");
            stringbuilder.append((new StringBuilder("&barcode=")).append(URLEncoder.encode(abarcoderesult, "UTF-8")).toString());
            stringbuilder.append((new StringBuilder("&btype=")).append(URLEncoder.encode(s, "UTF-8")).toString());
            stringbuilder.append((new StringBuilder("&locale=")).append(URLEncoder.encode(Locale.getDefault().toString(), "UTF-8")).toString());
        }
        // Misplaced declaration of an exception variable
        catch (BarcodeResult abarcoderesult[])
        {
            Log.e("StatusManager.LogScanTask", "Logic error sanitizing scan logging URL parameters.", abarcoderesult);
            return "";
        }
        abarcoderesult = stringbuilder.toString();
        abyte0 = new a(c.b());
        try
        {
            abarcoderesult = abyte0.a(abarcoderesult);
        }
        // Misplaced declaration of an exception variable
        catch (BarcodeResult abarcoderesult[])
        {
            Log.e("StatusManager.LogScanTask", "Logic error. Bad scan logging URL.", abarcoderesult);
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (BarcodeResult abarcoderesult[])
        {
            Log.e("StatusManager.LogScanTask", "Logic error. Bad URL cache.", abarcoderesult);
            return "";
        }
        return RLSDK.a.a(abarcoderesult);
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((BarcodeResult[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        if (obj != null && ((String) (obj)).contains("DENIED"))
        {
            obj = c.b.edit();
            ((android.content.edPreferences.Editor) (obj)).putString("disableCapture", "YES");
            ((android.content.edPreferences.Editor) (obj)).commit();
            c.a = c;
        }
    }

    private Object()
    {
    }

    Object(byte byte0)
    {
        this();
    }
}
