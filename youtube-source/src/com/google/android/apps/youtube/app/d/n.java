// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ui.presenter.g;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            f

final class n
    implements g
{

    final f a;

    private n(f f1)
    {
        a = f1;
        super();
    }

    n(f f1, byte byte0)
    {
        this(f1);
    }

    public final void a(Uri uri)
    {
        String s;
        List list;
        c.a(uri);
        s = uri.getHost();
        list = uri.getPathSegments();
        if (!"www.youtube.com".equals(s) && !"youtube.com".equals(s)) goto _L2; else goto _L1
_L1:
        if (list.size() < 2)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (!"user".equals(list.get(0)) && !"channel".equals(list.get(0))) goto _L2; else goto _L3
_L3:
        boolean flag;
        if (!TextUtils.isEmpty((CharSequence)list.get(1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        if (flag)
        {
            f.f(a).a(uri);
            return;
        } else
        {
            com.google.android.apps.youtube.app.d.f.c(a).startActivity(new Intent("android.intent.action.VIEW", uri));
            return;
        }
_L2:
        if (!"gdata.youtube.com".equals(s) || list.size() < 4 || !"feeds".equals(list.get(0)) || !"api".equals(list.get(1)) || !"users".equals(list.get(2)) && !"channels".equals(list.get(2)))
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (!TextUtils.isEmpty((CharSequence)list.get(3)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L4
        flag = false;
          goto _L4
    }
}
