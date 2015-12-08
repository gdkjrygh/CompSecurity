// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.jiubang.commerce.ad.b.a.l;
import com.jiubang.commerce.ad.e.aj;
import com.jiubang.commerce.c.a;
import com.jiubang.commerce.utils.f;
import com.jiubang.commerce.utils.g;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;
import com.jiubang.commerce.utils.q;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            n, e

public class d
{

    private static String a;

    public static String a(Context context)
    {
        if (a == null)
        {
            a = b(context);
            if (a == null)
            {
                a = c(context);
            }
        }
        return a;
    }

    public static String a(Context context, l l1, String s, String s1, String s2, String s3)
    {
        int i = 0;
        long l2 = System.currentTimeMillis();
        if (!k.a(context))
        {
            l1 = new n(0, 2, s3, "network is not ok", System.currentTimeMillis() - l2);
        } else
        if (g.a(s3))
        {
            l1 = new n(0, 3, s3, "srcUrl is market url", System.currentTimeMillis() - l2);
        } else
        if (!aj.a(context).b())
        {
            n n1 = new n(0, 1, s3, "close to pre load", System.currentTimeMillis() - l2);
            l1 = n1;
            if (j.a)
            {
                j.a("Ad_SDK", (new StringBuilder()).append("getHttpRedirectUrlFromLocation(close to pre load, moduleId:").append(s).append(", mapId:").append(s1).append(", aId:").append(s2).append(", adUrl:").append(s3).append(")").toString());
                l1 = n1;
            }
        } else
        {
label0:
            {
                Object obj1;
                BasicHttpParams basichttpparams;
                int i1;
                int j1;
                int k1;
                int i2;
                int j2;
                int k2;
                for (Object obj = s3; obj != null; obj = obj1)
                {
                    break label0;
                }

                i1 = i;
                j1 = i;
                k1 = i;
                i2 = i;
                j2 = i;
                k2 = i;
                try
                {
                    l1 = new n(i, 1, null, "url is null", System.currentTimeMillis() - l2);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (c(((IllegalArgumentException) (obj)).getMessage()))
                    {
                        l1 = new n(i1, 3, s3, "parse success: invalid url", System.currentTimeMillis() - l2);
                    } else
                    {
                        l1 = new n(i1, 2, null, (new StringBuilder()).append("IllegalArgumentException:").append(((IllegalArgumentException) (obj)).getMessage()).toString(), System.currentTimeMillis() - l2);
                    }
                    ((IllegalArgumentException) (obj)).printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s3)
                {
                    l1 = new n(j1, 2, null, (new StringBuilder()).append("ConnectTimeoutException:").append(s3.getMessage()).toString(), System.currentTimeMillis() - l2);
                    s3.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s3)
                {
                    l1 = new n(k1, 2, null, (new StringBuilder()).append("SocketTimeoutException:").append(s3.getMessage()).toString(), System.currentTimeMillis() - l2);
                    s3.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s3)
                {
                    l1 = new n(i2, 2, null, (new StringBuilder()).append("ClientProtocolException:").append(s3.getMessage()).toString(), System.currentTimeMillis() - l2);
                    s3.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s3)
                {
                    l1 = new n(j2, 2, null, (new StringBuilder()).append("IOException:").append(s3.getMessage()).toString(), System.currentTimeMillis() - l2);
                    s3.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s3)
                {
                    l1 = new n(k2, 2, null, s3.getMessage(), System.currentTimeMillis() - l2);
                    s3.printStackTrace();
                }
            }
        }
        if (l1 != null)
        {
            l1.a(context, s, s1, s2);
            return l1.a();
        } else
        {
            return "";
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        if (!g.a(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_417;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        l1 = new n(i, 3, ((String) (obj)), "parse success", System.currentTimeMillis() - l2);
        break MISSING_BLOCK_LABEL_35;
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        obj1 = new HttpGet(((String) (obj)));
        if (l1 == null) goto _L2; else goto _L1
_L1:
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        if (l1.a() != 1) goto _L2; else goto _L3
_L3:
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        j.a("UA", (new StringBuilder()).append("\u6A21\u5757ID:").append(s).append(" \u9700\u8981\u89E3\u6790\u7684URL:").append(s3).append(" \u8BBE\u7F6EUser-Agent").toString());
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        ((HttpGet) (obj1)).addHeader("User-Agent", a(context));
_L4:
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        basichttpparams = new BasicHttpParams();
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        basichttpparams.setParameter("http.protocol.handle-redirects", Boolean.valueOf(false));
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        basichttpparams.setParameter("http.connection.timeout", Integer.valueOf(15000));
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        basichttpparams.setParameter("http.socket.timeout", Integer.valueOf(15000));
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        ((HttpGet) (obj1)).setParams(basichttpparams);
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        obj1 = (new DefaultHttpClient()).execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        i = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
        if (i != 302 && i != 301 && i != 303)
        {
            break MISSING_BLOCK_LABEL_1351;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        obj = ((HttpResponse) (obj1)).getHeaders("Location");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1246;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        if (obj.length <= 0 || obj[0] == null)
        {
            break MISSING_BLOCK_LABEL_1246;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        obj = obj[0].getValue();
_L5:
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_1253;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        if (((String) (obj)).indexOf("{") > 0)
        {
            break MISSING_BLOCK_LABEL_1084;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        obj1 = obj;
        if (((String) (obj)).indexOf("}") <= 0)
        {
            break MISSING_BLOCK_LABEL_1825;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        obj1 = ((String) (obj)).replaceAll("\\{", "").replaceAll("\\}", "");
        break MISSING_BLOCK_LABEL_1825;
_L2:
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        j.a("UA", (new StringBuilder()).append("\u6A21\u5757ID:").append(s).append(" \u9700\u8981\u89E3\u6790\u7684URL:").append(s3).append(" \u4E0D\u8BBE\u7F6EUser-Agent").toString());
          goto _L4
        obj = "";
          goto _L5
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        l1 = new n(i, 1, null, "headers is null", System.currentTimeMillis() - l2);
        break MISSING_BLOCK_LABEL_35;
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_1672;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        l1 = ((HttpResponse) (obj1)).getEntity();
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_1666;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        l1 = f.a(l1.getContent(), "UTF-8", 50);
_L7:
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        if (TextUtils.isEmpty(l1))
        {
            break MISSING_BLOCK_LABEL_1565;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        if (!l1.equals("repeat click"))
        {
            break MISSING_BLOCK_LABEL_1565;
        }
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        j.a("Ad_SDK", (new StringBuilder()).append("getHttpRedirectUrlFromLocation(repeat click, ").append(((String) (obj))).append(")").toString());
        return ((String) (obj));
        l1;
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        l1.printStackTrace();
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        l1 = new n(i, 3, ((String) (obj)), "parse success: no gp url", System.currentTimeMillis() - l2);
        break MISSING_BLOCK_LABEL_35;
        l1 = "";
        if (true) goto _L7; else goto _L6
_L6:
        i1 = i;
        j1 = i;
        k1 = i;
        i2 = i;
        j2 = i;
        k2 = i;
        l1 = new n(i, 1, null, (new StringBuilder()).append("network statusCode is not 200, 301, 302, 303::->[").append(i).append("]").toString(), System.currentTimeMillis() - l2);
        break MISSING_BLOCK_LABEL_35;
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s) || s.endsWith("&preclick=1"))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append("&preclick=1").toString();
        }
    }

    private static String b(Context context)
    {
        com/jiubang/commerce/ad/url/d;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            com.jiubang.commerce.c.a.a(new e(context));
        }
        context = a;
        com/jiubang/commerce/ad/url/d;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static String b(String s)
    {
        a = s;
        return s;
    }

    private static String c(Context context)
    {
        com/jiubang/commerce/ad/url/d;
        JVM INSTR monitorenter ;
        String s;
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        s = android.os.Build.VERSION.RELEASE;
        if (s.length() <= 0) goto _L2; else goto _L1
_L1:
        stringbuffer.append(s);
_L3:
        String s1;
        stringbuffer.append("; ");
        s1 = q.d(context);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        s = s1;
        if ("en_us".equals(s1.toLowerCase()))
        {
            s = "en";
        }
        stringbuffer.append(s.toLowerCase());
        context = q.b(context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        stringbuffer.append("-");
        stringbuffer.append(context.toLowerCase());
_L4:
        if ("REL".equals(android.os.Build.VERSION.CODENAME))
        {
            context = Build.MODEL;
            if (context.length() > 0)
            {
                stringbuffer.append("; ");
                stringbuffer.append(context);
            }
        }
        context = Build.ID;
        if (context.length() > 0)
        {
            stringbuffer.append(" Build/");
            stringbuffer.append(context);
        }
        context = String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1", new Object[] {
            stringbuffer
        });
        com/jiubang/commerce/ad/url/d;
        JVM INSTR monitorexit ;
        return context;
_L2:
        stringbuffer.append("1.0");
          goto _L3
        context;
        throw context;
        stringbuffer.append("en");
          goto _L4
    }

    private static boolean c(String s)
    {
        while (TextUtils.isEmpty(s) || !s.contains("character in query at index")) 
        {
            return false;
        }
        return true;
    }
}
