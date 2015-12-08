// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.gms.internal:
//            i, dp

public final class hh
{

    private String a[];
    private dp b;

    private Uri a(Uri uri, Context context, String s, boolean flag)
    {
        try
        {
            if (uri.getQueryParameter("ms") != null)
            {
                throw new i("Query parameter already exists: ms");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new i("Provided Uri is not in a valid state");
        }
        int k;
        context = b.a(context, s);
        s = uri.toString();
        k = s.indexOf("&adurl");
        int j;
        j = k;
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        j = s.indexOf("?adurl");
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        return Uri.parse((new StringBuilder(s.substring(0, j + 1))).append("ms").append("=").append(context).append("&").append(s.substring(j + 1)).toString());
        uri = uri.buildUpon().appendQueryParameter("ms", context).build();
        return uri;
    }

    public final Uri a(Uri uri, Context context)
    {
        try
        {
            uri = a(uri, context, uri.getQueryParameter("ai"), true);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new i("Provided Uri is not in a valid state");
        }
        return uri;
    }

    public final dp a()
    {
        return b;
    }

    public final void a(MotionEvent motionevent)
    {
        b.a(motionevent);
    }

    public final boolean a(Uri uri)
    {
        boolean flag1 = false;
        if (uri == null)
        {
            throw new NullPointerException();
        }
        String as[];
        int j;
        int k;
        boolean flag;
        try
        {
            uri = uri.getHost();
            as = a;
            k = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        j = 0;
        flag = flag1;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flag = uri.endsWith(as[j]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        flag = true;
        return flag;
        for (j++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_31;
    }
}
