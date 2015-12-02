// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ehw
    implements cdu
{

    private final String a;
    private final Map b = new HashMap();

    ehw(String s)
    {
        a = s;
    }

    public final String a(String s, String s1)
    {
        Object obj;
        StringBuilder stringbuilder;
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        obj = null;
        stringbuilder = null;
        s = (HttpURLConnection)(new URL(Uri.parse(a).buildUpon().appendQueryParameter("channel_name", s).appendQueryParameter("socket_id", s1).build().toString())).openConnection();
        for (s1 = b.entrySet().iterator(); s1.hasNext(); s.setRequestProperty((String)((java.util.Map.Entry) (obj)).getKey(), (String)((java.util.Map.Entry) (obj)).getValue()))
        {
            obj = (java.util.Map.Entry)s1.next();
        }

          goto _L1
        s1;
        obj = s;
        s = s1;
_L3:
        throw new cdt(s);
        s1;
        s = ((String) (obj));
_L4:
        if (s != null)
        {
            s.disconnect();
        }
        throw s1;
_L1:
        s1 = s.getInputStream();
        obj = new BufferedReader(new InputStreamReader(s1));
        stringbuilder = new StringBuilder();
_L2:
        String s2 = ((BufferedReader) (obj)).readLine();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        stringbuilder.append(s2);
          goto _L2
        ((BufferedReader) (obj)).close();
        s1.close();
        if (s.getResponseCode() != 200)
        {
            throw new cdt(stringbuilder.toString());
        }
        s1 = stringbuilder.toString();
        if (s != null)
        {
            s.disconnect();
        }
        return s1;
        s;
        obj = stringbuilder;
          goto _L3
        s1;
          goto _L4
    }

    final void a(Map map)
    {
        b.putAll(map);
    }
}
