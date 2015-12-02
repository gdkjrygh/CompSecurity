// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package com.whatsapp.messaging:
//            bk, bf

public final class b_ extends bk
{

    private static b_ c;
    private static final TrustManager d[];
    private static final X509Certificate e[];
    private static final String z[];

    public b_()
    {
    }

    public static b_ a()
    {
        return c;
    }

    static X509Certificate[] b()
    {
        return e;
    }

    protected SSLSocketFactory a(SSLContext sslcontext)
    {
        try
        {
            sslcontext.init(null, d, null);
            sslcontext = sslcontext.getSocketFactory();
        }
        // Misplaced declaration of an exception variable
        catch (SSLContext sslcontext)
        {
            Log.a(sslcontext);
            throw new RuntimeException(sslcontext);
        }
        return sslcontext;
    }

    public Socket createSocket()
    {
        return super.createSocket();
    }

    public Socket createSocket(String s, int i)
    {
        return super.createSocket(s, i);
    }

    public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
    {
        return super.createSocket(s, i, inetaddress, j);
    }

    public Socket createSocket(InetAddress inetaddress, int i)
    {
        return super.createSocket(inetaddress, i);
    }

    public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
    {
        return super.createSocket(inetaddress, i, inetaddress1, j);
    }

    public Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        return super.createSocket(socket, s, i, flag);
    }

    public String[] getDefaultCipherSuites()
    {
        return super.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites()
    {
        return super.getSupportedCipherSuites();
    }

    static 
    {
        Object obj;
        String as[];
        int i;
        int j;
        as = new String[2];
        obj = "N\016II\002";
        i = -1;
        j = 0;
_L20:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L10:
        if (l > k) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        switch (i)
        {
        default:
            as1[j] = ((String) (obj));
            obj = "6w\"I\027Y\037H-t;\031J6nR\034F'{O\037\"I\0276w\005)sR\031:\036yX\033c%yZ\013J\023~J\003E/UA\023g\022YU\033^!|Y\013N\023]y)w.~Z3M\003tM\030N\007n\\kU\fX\\6K>bQj\005-|A2m#Vp\003W6Jyh;\003nv\f?\000\b\"#n\036\177C\027M1}ZkZ!ys\027@2W])n1tw9a5IR\037c\021cbnw*nZ \005&]U\fM%IO\026I>Ry\035c `C\020?-\177U)V<ta\023K-]N\0356\027[L\024:-|A2m#Vp\003W6Jyh;\003kC\f?\005}\"#\005\005bIoB7\177l\022x=~M\013^ \177c2`\000rI-@\r\002m><\000\tW4U\fX\\6e>bQjC\ttm8\\\\BR\036N\001x|1~\fQr\035\005]M+\030L5\177L\037X\bOA76%^v\034|\005mU6l\nkn\003=]NV\030;<~O1:)~B#A\016{l\027[\017\013U\034`<~O\037:)~B#\005*PZ-B0Q*\024I\013M|8|\034p_\033f&]U\fM%YO\035>>Ry\035c `C\020?-|A2m#Vp\003W6Jyh;\003nv\f?\000\b\"#\005\005@^\002B&o\\\033>1\177X2B+lv\034|\005oU6l\nkh\023J\bOB#;\034tO\033u&]U\fM%IO\026I>Ry\035c `C\020?-\177U)\005=bU F s|\017H]Iz\rAQs]\000g\006}w1V<hk8=P]J\002YT[\\cv\005bIoB7\177l\022x=~M\013^ \177c2`\000rI-\005+S#,kW^(\026a>Ry\035c\016`C\020?(WU,m7\002c\023K%_Y=d\025Rp3H]M+\030L5\177L\037X\bOA76%^v\034|\005mU6\005\007TJ/VV\003o\027F#\\V\033?#yH+H7syiK5\177Y\033^1{ZnH*{_\031M\rkP\030h5~T\025a,q.;y-mA\020YU\fm\003\005\000{,o8\020T)\fZ\000`A\017l+xM\002lR\017|h_\"BO\002k)Ma e\027LN\035ESiM\031L7hi\031cR@}\024>7vN bUtAc\0053Vv*U\000hQ\037vTQO\bw5X,\002M\flJm \nrpj>\034y0\003K\003QI5D3@phUKw4\fW\023XKm]\002`S\027?P\rJ\t\005\022\016\1771$*UHuu\007Tl8A O0c8\006S.*6\023s_\033^%xV\033?#yH+H7syiK5\177Y\030^1{ZnH&{_. 1}\",\0051pH\000\\3s/\025M]v0\021W-jj?L\003\\B(wOP] z\003\f^\023C(}Z\031@0X)5X,\021s?^'\013nqb*H+\022U @O/\005-c^\000` pQ\021_0\177q6m2oq\n61tMqb3M_oB\bw4\027{\027K);u7S\\\027:\006oV\027ePkh)w\027U\177#n\t\177l\031\0053\025K\025z>\fw9hQqo 7\\\017s\000`Ov,.k!C#\r62SSj_\00006w\"I\027^\024KDy^\b[-|R\031N0\1776w\"I\027";
            j = 1;
            i = 0;
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            as1[j] = ((String) (obj));
            z = as;
            obj = "Ct:T\003".toCharArray();
            j = obj.length;
            i = 0;
            break;
        }
_L17:
        if (j > i) goto _L4; else goto _L3
_L3:
        obj = (new String(((char []) (obj)))).intern();
        byte byte0;
        char c1;
        try
        {
            obj = CertificateFactory.getInstance(((String) (obj)));
        }
        catch (CertificateException certificateexception)
        {
            throw new RuntimeException(certificateexception);
        }
        obj = ((CertificateFactory) (obj)).generateCertificates(new ByteArrayInputStream(z[1].getBytes(z[0])));
        e = (X509Certificate[])((Collection) (obj)).toArray(new X509Certificate[((Collection) (obj)).size()]);
        d = (new TrustManager[] {
            new bf()
        });
        c = new b_();
        return;
_L2:
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 244
    //                   0 265
    //                   1 271
    //                   2 277
    //                   3 283;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_283;
_L5:
        byte0 = 58;
_L11:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L10
_L6:
        byte0 = 27;
          goto _L11
_L7:
        byte0 = 90;
          goto _L11
_L8:
        byte0 = 15;
          goto _L11
        byte0 = 100;
          goto _L11
_L4:
        k = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 328
    //                   0 349
    //                   1 355
    //                   2 361
    //                   3 367;
           goto _L12 _L13 _L14 _L15 _L16
_L16:
        break MISSING_BLOCK_LABEL_367;
_L12:
        byte0 = 58;
_L18:
        obj[i] = (char)(byte0 ^ k);
        i++;
          goto _L17
_L13:
        byte0 = 27;
          goto _L18
_L14:
        byte0 = 90;
          goto _L18
_L15:
        byte0 = 15;
          goto _L18
        byte0 = 100;
          goto _L18
        Object obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        throw new Error(((Throwable) (obj1)));
        if (true) goto _L20; else goto _L19
_L19:
    }
}
