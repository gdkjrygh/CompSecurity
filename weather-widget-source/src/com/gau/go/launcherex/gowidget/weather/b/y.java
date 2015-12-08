// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentProviderResult;
import android.content.Context;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            x

class y extends j
{

    private WeakReference a;

    public y(x x1)
    {
        super(x.b(x1).getContentResolver());
        a = new WeakReference(x1);
    }

    protected void a(int i, Object obj, ContentProviderResult acontentproviderresult[])
    {
        acontentproviderresult = (x)a.get();
        if (acontentproviderresult == null)
        {
            return;
        }
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            x.a(acontentproviderresult, (List)obj);
            break;
        }
    }
}
