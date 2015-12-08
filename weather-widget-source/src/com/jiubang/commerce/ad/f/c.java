// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.f;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;

public class c
{

    private static final Uri a = Uri.parse("content://downloads/my_downloads");
    private Context b;
    private ContentObserver c;

    private void b()
    {
        b.getContentResolver().unregisterContentObserver(c);
    }

    public void a()
    {
        b();
    }

}
