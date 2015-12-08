// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            e, MediaViewActivity

public class j
    implements e
{

    private static j a = null;
    private static MediaViewActivity b = null;

    private j()
    {
    }

    public static j a(MediaViewActivity mediaviewactivity)
    {
        if (a == null || b != mediaviewactivity)
        {
            a = new j();
            b = mediaviewactivity;
        }
        return a;
    }

    public void a(int i, Intent intent)
    {
    }

    public void a(Uri uri)
    {
        uri = uri.getQueryParameter("t");
        if (uri != null)
        {
            Toast.makeText(b, uri, 0).show();
        }
    }

    public void a(String s, Uri uri)
    {
        if (s != null && uri != null && uri.isHierarchical())
        {
            if (s.equalsIgnoreCase("toast"))
            {
                a(uri);
                return;
            }
            if (s.equalsIgnoreCase("longtoast"))
            {
                b(uri);
                return;
            }
            if (s.equalsIgnoreCase("dialog"))
            {
                c(uri);
                return;
            }
            if (s.equalsIgnoreCase("sendmsg"))
            {
                d(uri);
                return;
            }
            if (s.equalsIgnoreCase("close"))
            {
                e(uri);
                return;
            }
        }
    }

    public void b(Uri uri)
    {
        uri = uri.getQueryParameter("t");
        if (uri != null)
        {
            Toast.makeText(b, uri, 1).show();
        }
    }

    public void c(Uri uri)
    {
        String s = uri.getQueryParameter("t");
        uri.getQueryParameter("m");
        if (s == null);
    }

    public void d(Uri uri)
    {
        uri.getQueryParameter("t");
        Boolean.parseBoolean(uri.getQueryParameter("i"));
    }

    public void e(Uri uri)
    {
        b.setResult(0);
        b.finish();
    }

}
