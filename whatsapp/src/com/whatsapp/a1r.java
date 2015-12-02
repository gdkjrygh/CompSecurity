// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.SSLCertificateSocketFactory;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestExpectContinue;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;

// Referenced classes of package com.whatsapp:
//            App, ov, afm

public class a1r
{

    private static final String z[];
    private HttpEntity a;
    private List b;
    private URL c;
    private BasicHttpProcessor d;

    private a1r(URL url)
    {
        c = url;
        b = new ArrayList();
        d = new BasicHttpProcessor();
        d.addInterceptor(new RequestContent());
        d.addInterceptor(new RequestTargetHost());
        d.addInterceptor(new RequestUserAgent());
        d.removeRequestInterceptorByClass(org/apache/http/protocol/RequestExpectContinue);
    }

    private static List a(String s)
    {
        if (s == null)
        {
            Log.e(z[4]);
            return null;
        } else
        {
            return App.aB.a(s);
        }
    }

    public static a1r b(String s)
    {
label0:
        {
            try
            {
                if (!TextUtils.isEmpty(s))
                {
                    break label0;
                }
                Log.e(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return null;
        }
        s = new URL(s);
        if (s.getProtocol().equals(z[0]))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Log.e(z[1]);
        return null;
        try
        {
            s = new a1r(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(z[3]);
            return null;
        }
        return s;
    }

    public HttpResponse a()
    {
        Object obj;
        int j;
        int k;
        boolean flag;
        flag = ov.e;
        List list = a(c.getHost());
        if (list == null)
        {
            try
            {
                Log.w(z[7]);
            }
            catch (IOException ioexception)
            {
                throw ioexception;
            }
            return null;
        }
        int i = c.getPort();
        if (i == -1)
        {
            i = c.getDefaultPort();
        }
        Object obj1;
        BasicHttpParams basichttpparams;
        BasicHttpContext basichttpcontext;
        HttpRequestExecutor httprequestexecutor;
        Object obj2;
        NameValuePair namevaluepair;
        int l;
        boolean flag1;
        try
        {
            Collections.shuffle(list);
            j = list.size();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j > 4)
        {
            j = 4;
        } else
        {
            j = list.size();
        }
        k = 0;
_L17:
        if (k >= j) goto _L2; else goto _L1
_L1:
        Thread.sleep((int)(Math.random() * ((Math.pow(2D, k) - 1.0D) * 4000D)));
        basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basichttpparams, z[8]);
        HttpProtocolParams.setUserAgent(basichttpparams, afm.a());
        basichttpcontext = new BasicHttpContext(null);
        obj1 = new DefaultHttpClientConnection();
        httprequestexecutor = new HttpRequestExecutor();
        obj = (InetAddress)list.get(k);
        obj2 = new Socket();
        ((Socket) (obj2)).connect(new InetSocketAddress(((InetAddress) (obj)), i), 60000);
        ((Socket) (obj2)).setSoTimeout(60000);
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        obj = (SSLSocketFactory)SSLSocketFactory.getDefault();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        obj = SSLCertificateSocketFactory.getDefault(60000, null);
        ((Socket) (obj2)).setSoTimeout(60000);
        obj = ((SSLSocketFactory) (obj)).createSocket(((Socket) (obj2)), c.getHost(), i, true);
        basichttpcontext.setAttribute(z[9], obj1);
        if (!((DefaultHttpClientConnection) (obj1)).isOpen())
        {
            ((DefaultHttpClientConnection) (obj1)).bind(((Socket) (obj)), basichttpparams);
        }
        obj = new BasicHttpEntityEnclosingRequest(z[10], c.getPath());
        if (a != null)
        {
            ((BasicHttpEntityEnclosingRequest) (obj)).setEntity(a);
        }
        ((BasicHttpEntityEnclosingRequest) (obj)).addHeader(z[14], z[17]);
        obj2 = b.iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            namevaluepair = (NameValuePair)((Iterator) (obj2)).next();
            ((BasicHttpEntityEnclosingRequest) (obj)).addHeader(namevaluepair.getName(), namevaluepair.getValue());
        } while (!flag);
        ((BasicHttpEntityEnclosingRequest) (obj)).setParams(basichttpparams);
        httprequestexecutor.preProcess(((org.apache.http.HttpRequest) (obj)), d, basichttpcontext);
        obj1 = httprequestexecutor.execute(((org.apache.http.HttpRequest) (obj)), ((org.apache.http.HttpClientConnection) (obj1)), basichttpcontext);
        ((HttpResponse) (obj1)).setParams(basichttpparams);
        httprequestexecutor.postProcess(((HttpResponse) (obj1)), d, basichttpcontext);
        l = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
        obj = obj1;
        if (l < 500) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (k == j - 1) goto _L4; else goto _L5
_L5:
        flag1 = App.i();
        obj = obj1;
        if (!flag1) goto _L4; else goto _L6
_L6:
        Log.w((new StringBuilder()).append(z[12]).append(l).append(z[11]).append(k).append("/").append(j).append(")").toString());
        if (!flag) goto _L8; else goto _L7
_L7:
        obj = obj1;
_L4:
        return ((HttpResponse) (obj));
        obj;
        throw obj;
        obj;
        try
        {
            Log.w((new StringBuilder()).append(z[13]).append(k).append("/").append(j).append(z[16]).append(((IOException) (obj)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (k == j - 1) goto _L10; else goto _L9
_L9:
        if (App.i()) goto _L8; else goto _L10
_L10:
        throw obj;
        obj;
        throw obj;
        obj;
        try
        {
            Log.w((new StringBuilder()).append(z[5]).append(k).append("/").append(j).append(z[15]).append(((HttpException) (obj)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (k == j - 1) goto _L12; else goto _L11
_L11:
        if (App.i()) goto _L8; else goto _L12
_L12:
        throw obj;
        obj;
        throw obj;
        obj;
        try
        {
            Log.w((new StringBuilder()).append(z[6]).append(k).append("/").append(j).append(z[18]).append(((Exception) (obj)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (k == j - 1) goto _L14; else goto _L13
_L13:
        if (App.i()) goto _L8; else goto _L14
_L14:
        throw obj;
_L8:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        obj = null;
        if (true) goto _L4; else goto _L15
_L15:
        k++;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public void a(String s, String s1)
    {
        b.add(new BasicNameValuePair(s, s1));
    }

    public void a(HttpEntity httpentity)
    {
        a = httpentity;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[19];
        obj = "9$z `";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "9$z <31j}c#?z?p><";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "9$z <??#$r#7k$";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "9$z <31j%a=";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "9$z <04j\"<??#8|\"$";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "9$z c>#z\177{%$~5a#?|p;";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "9$z c>#z\177v#\"a\"3y";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "9$z c>#z\177}>}o4w#5}#v\"";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\004\004H}+";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "9$z =2?`>v2$g?}";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\001\037]\004";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "qx";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "9$z c>#z\177q04##g0${#p>4kp";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "9$z c>#z\177z>5|\"|#p&";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                obj = "\022?`>v2$g?}";
                byte0 = 13;
                i = 14;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "xp";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "xp";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "2<a#v";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "xp";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 500
    //                   0 523
    //                   1 530
    //                   2 537
    //                   3 544;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_544;
_L3:
        byte byte1 = 19;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 81;
          goto _L9
_L5:
        byte1 = 80;
          goto _L9
_L6:
        byte1 = 14;
          goto _L9
        byte1 = 80;
          goto _L9
    }
}
