// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.messaging.b_;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.message.BasicHttpRequest;
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

public class af3
{

    private static final String z[];

    private static List a(String s)
    {
        if (s == null)
        {
            Log.e(z[0]);
            return null;
        } else
        {
            return App.aB.a(s);
        }
    }

    public static HttpResponse b(String s)
    {
        boolean flag = ov.e;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Log.e(z[3]);
        s = null;
_L6:
        return s;
        s;
        throw s;
_L2:
        int j;
        int k;
        URL url;
label0:
        {
            try
            {
                url = new URL(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e(z[7]);
                return null;
            }
            try
            {
                if (url.getProtocol().equals(z[10]))
                {
                    break label0;
                }
                Log.e(z[13]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return null;
        }
        List list = a(url.getHost());
        if (list == null)
        {
            try
            {
                Log.w(z[11]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return null;
        }
        int i = url.getPort();
        if (i == -1)
        {
            i = url.getDefaultPort();
        }
        Object obj;
        BasicHttpProcessor basichttpprocessor;
        BasicHttpParams basichttpparams;
        HttpRequestExecutor httprequestexecutor;
        BasicHttpContext basichttpcontext;
        DefaultHttpClientConnection defaulthttpclientconnection;
        int l;
        boolean flag1;
        try
        {
            Collections.shuffle(list);
            j = list.size();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (j > 4)
        {
            j = 4;
        } else
        {
            j = list.size();
        }
        basichttpprocessor = new BasicHttpProcessor();
        basichttpprocessor.addInterceptor(new RequestContent());
        basichttpprocessor.addInterceptor(new RequestTargetHost());
        basichttpprocessor.addInterceptor(new RequestUserAgent());
        basichttpprocessor.removeRequestInterceptorByClass(org/apache/http/protocol/RequestExpectContinue);
        k = 0;
_L13:
        if (k >= j) goto _L4; else goto _L3
_L3:
        basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basichttpparams, z[2]);
        HttpProtocolParams.setUserAgent(basichttpparams, afm.a());
        httprequestexecutor = new HttpRequestExecutor();
        basichttpcontext = new BasicHttpContext(null);
        defaulthttpclientconnection = new DefaultHttpClientConnection();
        s = (InetAddress)list.get(k);
        Thread.sleep((int)(Math.random() * ((Math.pow(2D, k) - 1.0D) * 4000D)));
        obj = new Socket();
        ((Socket) (obj)).connect(new InetSocketAddress(s, i), 60000);
        ((Socket) (obj)).setSoTimeout(60000);
        s = b_.a().createSocket(((Socket) (obj)), url.getHost(), i, true);
        basichttpcontext.setAttribute(z[12], defaulthttpclientconnection);
        if (!defaulthttpclientconnection.isOpen())
        {
            defaulthttpclientconnection.bind(s, basichttpparams);
        }
        obj = url.getPath();
        s = ((String) (obj));
        if (url.getQuery() != null)
        {
            s = (new StringBuilder()).append(((String) (obj))).append("?").append(url.getQuery()).toString();
        }
        s = new BasicHttpRequest(z[8], s);
        s.addHeader(z[4], z[18]);
        s.setParams(basichttpparams);
        httprequestexecutor.preProcess(s, basichttpprocessor, basichttpcontext);
        obj = httprequestexecutor.execute(s, defaulthttpclientconnection, basichttpcontext);
        ((HttpResponse) (obj)).setParams(basichttpparams);
        httprequestexecutor.postProcess(((HttpResponse) (obj)), basichttpprocessor, basichttpcontext);
        l = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        s = ((String) (obj));
        if (l < 500) goto _L6; else goto _L5
_L5:
        s = ((String) (obj));
        if (k == j - 1) goto _L6; else goto _L7
_L7:
        flag1 = App.i();
        s = ((String) (obj));
        if (!flag1) goto _L6; else goto _L8
_L8:
        Log.w((new StringBuilder()).append(z[6]).append(l).append(z[5]).append(k).append("/").append(j).append(")").toString());
        s = ((String) (obj));
        if (flag) goto _L6; else goto _L9
_L9:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_867;
        }
_L4:
        return null;
        s;
        throw s;
        s;
        try
        {
            Log.w((new StringBuilder()).append(z[16]).append(k).append("/").append(j).append(z[17]).append(s.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (k == j - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (App.i()) goto _L9; else goto _L10
_L10:
        throw s;
        s;
        throw s;
        s;
        try
        {
            Log.w((new StringBuilder()).append(z[1]).append(k).append("/").append(j).append(z[15]).append(s.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (k == j - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (App.i()) goto _L9; else goto _L11
_L11:
        throw s;
        s;
        try
        {
            Log.w((new StringBuilder()).append(z[14]).append(k).append("/").append(j).append(z[9]).append(s.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (k == j - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (App.i()) goto _L9; else goto _L12
_L12:
        throw s;
        k++;
          goto _L13
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[19];
        obj = "\027$&K\t\03646I\t\021?\177SI\f$";
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
                obj = "\027$&KA\032$}SR\013 7IT\020\"r\023";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "*\004\024\026\036";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\027$&K\t\021?\177OG\r77O";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "<?<UC\034$;TH";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "_x";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\027$&KV\020#&\024D\0364\177HR\036$'HE\02047\033";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\027$&K\t\03516NT\023";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "8\025\006";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "Vp";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\027$&KU";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\027$&KA\032$}UIR16_T\032#!^U";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\027$&K\b\034?<UC\034$;TH";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\027$&K\t\03516\026V\r?&TE\020<";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\027$&KA\032$}^T\r? \033\016";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "Vp";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\027$&KA\032$}RI\032\" TT_x";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "Vp";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\034<=HC";
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
        char c = obj[j];
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
        byte byte1 = 38;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 127;
          goto _L9
_L5:
        byte1 = 80;
          goto _L9
_L6:
        byte1 = 82;
          goto _L9
        byte1 = 59;
          goto _L9
    }
}
