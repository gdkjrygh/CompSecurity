// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.mixpanel.android.mpmetrics.MPConfig;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;

// Referenced classes of package com.mixpanel.android.util:
//            RemoteService

public class HttpService
    implements RemoteService
{

    private static final String LOGTAG = "MixpanelAPI.Message";

    public HttpService()
    {
    }

    private static byte[] slurp(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[8192];
        do
        {
            int i = inputstream.read(abyte0, 0, abyte0.length);
            if (i == -1)
            {
                bytearrayoutputstream.flush();
                return bytearrayoutputstream.toByteArray();
            }
            bytearrayoutputstream.write(abyte0, 0, i);
        } while (true);
    }

    public boolean isOnline(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null) goto _L2; else goto _L1
_L1:
        if (!context.isConnectedOrConnecting()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        boolean flag1 = flag;
        StringBuilder stringbuilder;
        if (!MPConfig.DEBUG)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        stringbuilder = new StringBuilder("ConnectivityManager says we ");
        if (flag)
        {
            context = "are";
        } else
        {
            context = "are not";
        }
        Log.v("MixpanelAPI.Message", stringbuilder.append(context).append(" online").toString());
        return flag;
        context;
        flag = true;
        flag1 = flag;
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
            flag1 = flag;
        }
        return flag1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public byte[] performRequest(String s, List list)
        throws RemoteService.ServiceUnavailableException, IOException
    {
        byte abyte0[];
        boolean flag;
        int i;
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.Message", (new StringBuilder("Attempting request to ")).append(s).toString());
        }
        abyte0 = null;
        i = 0;
        flag = false;
_L1:
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        byte abyte1[];
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        if (i >= 3 || flag)
        {
            if (MPConfig.DEBUG && i >= 3)
            {
                Log.v("MixpanelAPI.Message", "Could not connect to Mixpanel service after three retries.");
            }
            return abyte0;
        }
        obj18 = null;
        obj15 = null;
        obj13 = null;
        obj14 = null;
        obj17 = null;
        obj16 = null;
        obj20 = null;
        obj3 = null;
        obj19 = null;
        obj12 = null;
        obj10 = null;
        obj4 = null;
        obj8 = null;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj5 = obj14;
        obj2 = obj3;
        Object obj1 = (HttpURLConnection)(new URL(s)).openConnection();
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        ((HttpURLConnection) (obj1)).setConnectTimeout(2000);
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        ((HttpURLConnection) (obj1)).setReadTimeout(10000);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_634;
        }
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        ((HttpURLConnection) (obj1)).setDoOutput(true);
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        UrlEncodedFormEntity urlencodedformentity = new UrlEncodedFormEntity(list, "UTF-8");
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        ((HttpURLConnection) (obj1)).setRequestMethod("POST");
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        ((HttpURLConnection) (obj1)).setFixedLengthStreamingMode((int)urlencodedformentity.getContentLength());
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj19;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj20;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        obj3 = ((HttpURLConnection) (obj1)).getOutputStream();
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj3;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj3;
        obj = obj12;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        obj12 = new BufferedOutputStream(((OutputStream) (obj3)));
        urlencodedformentity.writeTo(((OutputStream) (obj12)));
        ((BufferedOutputStream) (obj12)).close();
        obj = null;
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj3;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj3;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj3;
        ((OutputStream) (obj3)).close();
        obj19 = null;
        obj18 = null;
        obj17 = null;
        obj13 = null;
        obj8 = obj1;
        obj9 = obj16;
        obj6 = obj17;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj15;
        obj7 = obj19;
        obj = obj13;
        obj4 = obj1;
        obj5 = obj14;
        obj2 = obj18;
        obj3 = ((HttpURLConnection) (obj1)).getInputStream();
        obj8 = obj1;
        obj9 = obj3;
        obj6 = obj17;
        abyte1 = abyte0;
        obj10 = obj1;
        obj11 = obj3;
        obj7 = obj19;
        obj = obj13;
        obj4 = obj1;
        obj5 = obj3;
        obj2 = obj18;
        obj12 = slurp(((InputStream) (obj3)));
        obj8 = obj1;
        obj9 = obj3;
        obj6 = obj17;
        abyte1 = ((byte []) (obj12));
        obj10 = obj1;
        obj11 = obj3;
        obj7 = obj19;
        obj = obj13;
        obj4 = obj1;
        obj5 = obj3;
        obj2 = obj18;
        ((InputStream) (obj3)).close();
        int j = 1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        abyte0 = ((byte []) (obj12));
        flag = j;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            abyte0 = ((byte []) (obj12));
            flag = j;
        }
          goto _L1
        obj = null;
        obj1;
        obj3 = obj6;
        obj1 = obj8;
        obj6 = obj;
_L8:
        obj = obj6;
        obj4 = obj1;
        obj5 = obj9;
        obj2 = obj3;
        if (!MPConfig.DEBUG)
        {
            break MISSING_BLOCK_LABEL_921;
        }
        obj = obj6;
        obj4 = obj1;
        obj5 = obj9;
        obj2 = obj3;
        Log.d("MixpanelAPI.Message", "Failure to connect, likely caused by a known issue with Android lib. Retrying.");
        j = i + 1;
        if (obj6 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj6)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((OutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj9 != null)
        {
            try
            {
                ((InputStream) (obj9)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        abyte0 = abyte1;
        i = j;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            abyte0 = abyte1;
            i = j;
        }
          goto _L1
        s = null;
        list;
        obj3 = obj7;
        obj1 = obj10;
_L7:
        obj = s;
        obj4 = obj1;
        obj5 = obj11;
        obj2 = obj3;
        if (503 != ((HttpURLConnection) (obj1)).getResponseCode()) goto _L3; else goto _L2
_L2:
        obj = s;
        obj4 = obj1;
        obj5 = obj11;
        obj2 = obj3;
        throw new RemoteService.ServiceUnavailableException("Service Unavailable", ((HttpURLConnection) (obj1)).getHeaderField("Retry-After"));
        s;
        obj1 = obj4;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((OutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        if (obj5 != null)
        {
            try
            {
                ((InputStream) (obj5)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw s;
_L3:
        obj = s;
        obj4 = obj1;
        obj5 = obj11;
        obj2 = obj3;
        throw list;
        s;
        obj = obj12;
        obj5 = obj17;
        obj2 = obj3;
        if (true) goto _L5; else goto _L4
_L4:
        list;
        s = ((String) (obj12));
        obj11 = obj13;
        if (true) goto _L7; else goto _L6
_L6:
        EOFException eofexception;
        eofexception;
        obj6 = obj12;
        obj9 = obj18;
        abyte1 = abyte0;
          goto _L8
    }
}
