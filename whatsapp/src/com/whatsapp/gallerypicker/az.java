// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

// Referenced classes of package com.whatsapp.gallerypicker:
//            a7, ar

public class az extends a7
{

    private long d;

    protected az(ar ar, ContentResolver contentresolver, String s, long l)
    {
        super(ar, contentresolver, Uri.fromFile(new File(s)));
        d = l;
    }

    public Bitmap a(int i)
    {
        return super.a(i);
    }

    public Bitmap a(int i, int j)
    {
        return super.a(i, j);
    }

    public Uri a()
    {
        return super.a();
    }

    public String b()
    {
        return super.b();
    }

    public String c()
    {
        return super.c();
    }

    public long d()
    {
        return d;
    }
}
