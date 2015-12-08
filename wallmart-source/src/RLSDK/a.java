// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;

public final class a
{

    private Context a;

    public a(Context context)
    {
        a = context;
    }

    public static String a(InputStream inputstream)
    {
        StringWriter stringwriter;
        char ac[];
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        stringwriter = new StringWriter();
        ac = new char[1024];
        inputstream = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
_L1:
        int i = inputstream.read(ac);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        stringwriter.write(ac, 0, i);
          goto _L1
        inputstream;
        inputstream.getMessage();
        return null;
        inputstream = stringwriter.toString();
        return inputstream;
    }

    public final InputStream a(String s)
        throws MalformedURLException, IOException
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        obj = (ConnectivityManager)a.getSystemService("connectivity");
        flag = flag1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        NetworkInfo anetworkinfo[];
        anetworkinfo = ((ConnectivityManager) (obj)).getAllNetworkInfo();
        flag = flag1;
        if (anetworkinfo == null) goto _L2; else goto _L3
_L3:
        int i = 0;
_L8:
        flag = flag1;
        if (i >= anetworkinfo.length) goto _L2; else goto _L4
_L4:
        if (anetworkinfo[i].getState() != android.net.NetworkInfo.State.CONNECTED) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        anetworkinfo = (InputStream)(new URL(s)).getContent();
        return anetworkinfo;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
        IOException ioexception;
        ioexception;
        (new StringBuilder("IOException reading from ")).append(s).toString();
_L7:
        return null;
    }
}
