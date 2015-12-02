// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class ger
{

    private Uri a;
    private boolean b;

    private ger()
    {
    }

    ger(byte byte0)
    {
        this();
    }

    final void a(Uri uri, boolean flag)
    {
        a = uri;
        b = flag;
    }

    public final boolean a()
    {
        return b;
    }

    final boolean a(Uri uri)
    {
        return a != null && a.equals(uri);
    }
}
