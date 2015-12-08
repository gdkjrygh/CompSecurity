// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardSubmit, CustSSLSocketFactory

public class DataExtractionTask extends AsyncTask
{

    public static String data[] = null;
    public static String keys[] = null;
    Handler a;
    String b;
    Image c;
    CountDownLatch d;
    CreditCardSubmit e;

    public DataExtractionTask(Handler handler, String s, String as[], Image image)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        a = handler;
        b = s;
        keys = as;
        data = new String[as.length];
        c = image;
    }

    private String a(JSONObject jsonobject, String s)
    {
        String s1 = "";
        if (jsonobject != null)
        {
            try
            {
                s1 = jsonobject.getString(s);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
                return "";
            }
        }
        return s1;
    }

    private void a(String s)
    {
        e.a(CreditCardSubmit.d.c);
        e.e.add(s);
    }

    private byte[] a(Image image)
    {
        image.setImageMimeType(com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF);
        image.setImageFilePath("");
        byte abyte0[];
        try
        {
            image.imageWriteToFileBuffer();
        }
        catch (KmcRuntimeException kmcruntimeexception)
        {
            kmcruntimeexception.printStackTrace();
        }
        catch (KmcException kmcexception)
        {
            kmcexception.printStackTrace();
        }
        image = image.getImageFileBuffer();
        abyte0 = new byte[image.capacity()];
        image.get(abyte0);
        return abyte0;
    }

    private int b(String s)
    {
        Arrays.fill(data, "");
        if (s.contains("LOW IMAGE QUALITY"))
        {
            return -1;
        }
        JSONObject jsonobject;
        int i;
        int j;
        try
        {
            s = (new JSONObject(s)).getJSONArray("fields");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return -1;
        }
        i = 0;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = s.getJSONObject(i);
        j = 0;
_L2:
        if (j >= keys.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(jsonobject, "name").equalsIgnoreCase(keys[j]))
        {
            data[j] = a(jsonobject, "text");
        }
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        i++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_35;
_L3:
        return 0;
    }

    private byte[] b(Image image)
    {
        Object obj1;
        byte abyte0[];
        image.setImageMimeType(com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF);
        obj1 = null;
        image = image.getImageFilePath();
        abyte0 = new byte[(int)(new File(image)).length()];
        Object obj = new BufferedInputStream(new FileInputStream(image));
        image = ((Image) (obj));
        ((InputStream) (obj)).read(abyte0);
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Image image)
            {
                image.printStackTrace();
                return abyte0;
            }
        }
_L2:
        return abyte0;
        obj1;
        obj = null;
_L5:
        image = ((Image) (obj));
        ((Exception) (obj1)).printStackTrace();
        if (obj == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Image image)
        {
            image.printStackTrace();
            return abyte0;
        }
        return abyte0;
        image;
        obj = obj1;
_L4:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw image;
        obj1;
        obj = image;
        image = ((Image) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
          goto _L5
    }

    HttpClient a()
    {
        Object obj;
        try
        {
            obj = KeyStore.getInstance(KeyStore.getDefaultType());
            ((KeyStore) (obj)).load(null, null);
            obj = new CustSSLSocketFactory(((KeyStore) (obj)));
            ((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            BasicHttpParams basichttpparams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basichttpparams, "UTF-8");
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
            obj = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        }
        catch (Exception exception)
        {
            return new DefaultHttpClient();
        }
        return ((HttpClient) (obj));
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        as = new Message();
        HttpClient httpclient = a();
        BasicResponseHandler basicresponsehandler = new BasicResponseHandler();
        ByteArrayEntity bytearrayentity = new ByteArrayEntity(a(c));
        try
        {
            HttpPut httpput = new HttpPut(b);
            org.apache.http.params.HttpParams httpparams = httpclient.getParams();
            HttpConnectionParams.setConnectionTimeout(httpparams, 10000);
            HttpConnectionParams.setSoTimeout(httpparams, 0x124f8);
            httpput.setParams(httpparams);
            httpput.addHeader("Content-Type", "image/tiff");
            httpput.setEntity(bytearrayentity);
            as.arg2 = b((String)httpclient.execute(httpput, basicresponsehandler));
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            a(clientprotocolexception.toString());
        }
        catch (IOException ioexception)
        {
            a(ioexception.toString());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            a(illegalargumentexception.toString());
        }
        catch (RuntimeException runtimeexception)
        {
            a(runtimeexception.toString());
        }
        if (e.resultCode == CreditCardSubmit.d.a)
        {
            String as1[] = data;
            int j = as1.length;
            for (int i = 0; i < j; i++)
            {
                String s = as1[i];
                e.e.add(s);
            }

        }
        d.countDown();
        if (a != null)
        {
            a.sendMessage(as);
        }
        return null;
    }

}
