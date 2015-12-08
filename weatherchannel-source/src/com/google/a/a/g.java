// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.google.a.a:
//            h, c

public class g
{

    private static final String e[] = {
        "/aclk", "/pcs/click"
    };
    private String a;
    private String b;
    private String c;
    private String d[] = {
        ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"
    };
    private c f;

    public g(c c1)
    {
        a = "googleads.g.doubleclick.net";
        b = "/pagead/ads";
        c = "ad.doubleclick.net";
        f = c1;
    }

    private Uri a(Uri uri, Context context, String s, boolean flag)
        throws h
    {
        boolean flag1;
        try
        {
            flag1 = a(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new h("Provided Uri is not in a valid state");
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (uri.toString().contains("dc_ms="))
        {
            throw new h("Parameter already exists: dc_ms");
        }
        break MISSING_BLOCK_LABEL_64;
        if (uri.getQueryParameter("ms") != null)
        {
            throw new h("Query parameter already exists: ms");
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        context = f.a(context, s);
_L1:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        return b(uri, "dc_ms", context);
        context = f.a(context);
          goto _L1
        uri = a(uri, "ms", ((String) (context)));
        return uri;
    }

    private Uri a(Uri uri, String s, String s1)
        throws UnsupportedOperationException
    {
        String s2 = uri.toString();
        int j = s2.indexOf("&adurl");
        int i = j;
        if (j == -1)
        {
            i = s2.indexOf("?adurl");
        }
        if (i != -1)
        {
            return Uri.parse((new StringBuilder(s2.substring(0, i + 1))).append(s).append("=").append(s1).append("&").append(s2.substring(i + 1)).toString());
        } else
        {
            return uri.buildUpon().appendQueryParameter(s, s1).build();
        }
    }

    private Uri b(Uri uri, String s, String s1)
    {
        String s2 = uri.toString();
        int i = s2.indexOf(";adurl");
        if (i != -1)
        {
            return Uri.parse((new StringBuilder(s2.substring(0, i + 1))).append(s).append("=").append(s1).append(";").append(s2.substring(i + 1)).toString());
        } else
        {
            uri = uri.getEncodedPath();
            int j = s2.indexOf(uri);
            return Uri.parse((new StringBuilder(s2.substring(0, uri.length() + j))).append(";").append(s).append("=").append(s1).append(";").append(s2.substring(uri.length() + j)).toString());
        }
    }

    public Uri a(Uri uri, Context context)
        throws h
    {
        return a(uri, context, null, false);
    }

    public boolean a(Uri uri)
    {
        if (uri == null)
        {
            throw new NullPointerException();
        }
        boolean flag;
        try
        {
            flag = uri.getHost().equals(c);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        return flag;
    }

    public boolean b(Uri uri)
    {
        boolean flag1 = false;
        if (uri == null)
        {
            throw new NullPointerException();
        }
        String as[];
        int i;
        int j;
        boolean flag;
        try
        {
            uri = uri.getHost();
            as = d;
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        i = 0;
        flag = flag1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flag = uri.endsWith(as[i]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        flag = true;
        return flag;
        for (i++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_31;
    }

}
