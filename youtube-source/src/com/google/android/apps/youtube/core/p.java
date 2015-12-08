// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.az;
import com.google.android.apps.youtube.core.client.s;
import com.google.android.apps.youtube.core.utils.PackageUtil;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a, au

final class p extends f
{

    final a a;

    p(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        au au1 = a.au();
        Object obj;
        if (au1.y() && au1.f() != null)
        {
            obj = au1.E();
            StringBuilder stringbuilder = (new StringBuilder()).append(PackageUtil.f(a.a));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = "";
            } else
            {
                obj = (new StringBuilder(" [")).append(((String) (obj))).append("]").toString();
            }
            obj = stringbuilder.append(((String) (obj))).toString();
            obj = new s(a.a, a.aJ(), (new StringBuilder()).append(Build.MODEL).append("@").append(Build.MANUFACTURER).toString(), ((String) (obj)), au1.f(), au1.z(), au1.A(), au1.B());
        } else
        {
            obj = new az();
        }
        return a.a(((com.google.android.apps.youtube.core.client.l) (obj)));
    }
}
