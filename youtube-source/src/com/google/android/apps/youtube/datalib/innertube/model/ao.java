// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.net.Uri;
import android.text.TextUtils;
import com.google.a.a.a.a.sy;
import com.google.android.apps.youtube.common.fromguava.c;

public final class ao
{

    private final Uri a;
    private final int b;
    private final int c;

    public ao(sy sy1)
    {
        Object obj;
        com.google.android.apps.youtube.common.fromguava.c.a(sy1);
        obj = sy1.b;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        a = ((Uri) (obj));
        b = sy1.c;
        c = sy1.d;
        return;
_L2:
        Uri uri = Uri.parse(((String) (obj)));
        obj = uri;
        if (TextUtils.isEmpty(uri.getScheme()))
        {
            obj = uri.buildUpon().scheme("https").build();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Uri a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof ao))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = (ao)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ao) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((ao) (obj)).a) && b == ((ao) (obj)).b && c == ((ao) (obj)).c) goto _L1; else goto _L4
_L4:
        return false;
        return false;
    }

    public final int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return ((i + 31) * 31 + b) * 31 + c;
    }
}
