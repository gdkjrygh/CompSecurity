// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.text.TextUtils;
import com.walmart.android.service.Utils;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpUriRequest;

public class UrlUtils
{

    private static String ALL_SIZES[];
    public static String IMAGE_SIZE_100;
    public static String IMAGE_SIZE_150;
    public static String IMAGE_SIZE_215;
    public static String IMAGE_SIZE_300;
    public static String IMAGE_SIZE_500;
    public static String IMAGE_SIZE_60;
    private static final Pattern sHttpUrlPattern = Pattern.compile("^http.*$", 2);

    public UrlUtils()
    {
    }

    public static HashMap extractParameters(String s)
    {
        HashMap hashmap = new HashMap();
        int i = s.indexOf("?");
        if (i != -1)
        {
            s = s.substring(i + 1).split("&");
            int k = s.length;
            for (int j = 0; j < k; j++)
            {
                String as[] = s[j].split("=");
                if (as.length == 2)
                {
                    hashmap.put(as[0], as[1]);
                }
            }

        }
        return hashmap;
    }

    public static String getRequestString(HttpUriRequest httpurirequest)
    {
        if (httpurirequest.getMethod().equals("POST") || httpurirequest.getMethod().equals("PUT"))
        {
            return reconstructAsGetUrl((HttpEntityEnclosingRequestBase)httpurirequest);
        } else
        {
            return httpurirequest.getURI().toString();
        }
    }

    public static String getURLFromThumbnailURL(String s, String s1)
    {
        String s2 = s1;
        int i = 0;
        do
        {
label0:
            {
                String s3 = s2;
                if (i < ALL_SIZES.length)
                {
                    s2 = s2.replace(ALL_SIZES[i], s);
                    if (s2.equals(s1))
                    {
                        break label0;
                    }
                    s3 = s2;
                }
                return s3.replace(".gif", ".jpg").replace("\\/", "/");
            }
            i++;
        } while (true);
    }

    public static boolean isHttpUrl(String s)
    {
        if (s != null)
        {
            return sHttpUrlPattern.matcher(s).matches();
        } else
        {
            return false;
        }
    }

    public static String reconstructAsGetUrl(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder(httpentityenclosingrequestbase.getURI().toString());
        HttpEntity httpentity = httpentityenclosingrequestbase.getEntity();
        boolean flag;
        if (httpentityenclosingrequestbase.getURI().getQuery() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (httpentity == null) goto _L2; else goto _L1
_L1:
        httpentityenclosingrequestbase = Utils.inputStreamToString(httpentity.getContent());
        if (TextUtils.isEmpty(httpentityenclosingrequestbase)) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        stringbuilder.append("&");
_L6:
        stringbuilder.append(httpentityenclosingrequestbase);
_L2:
        return stringbuilder.toString();
_L5:
        stringbuilder.append("?");
          goto _L6
        httpentityenclosingrequestbase;
          goto _L2
        httpentityenclosingrequestbase;
          goto _L2
    }

    static 
    {
        IMAGE_SIZE_60 = "60X60";
        IMAGE_SIZE_100 = "100X100";
        IMAGE_SIZE_150 = "150X150";
        IMAGE_SIZE_215 = "215X215";
        IMAGE_SIZE_300 = "300X300";
        IMAGE_SIZE_500 = "500X500";
        ALL_SIZES = (new String[] {
            IMAGE_SIZE_60, IMAGE_SIZE_100, IMAGE_SIZE_150, IMAGE_SIZE_215, IMAGE_SIZE_300, IMAGE_SIZE_500
        });
    }
}
