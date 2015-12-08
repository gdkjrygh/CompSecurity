// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            i, j

class m extends BroadcastReceiver
{

    final i a;

    private m(i j)
    {
        a = j;
        super();
    }

    m(i j, j j1)
    {
        this(j);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        s = intent.getAction();
        if (!"android.intent.action.PACKAGE_REMOVED".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = intent.getDataString();
        if (!TextUtils.isEmpty(s))
        {
            s = s.replace("package:", "");
            boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            c.a("dynamicbg", (new StringBuilder()).append("\u6709apk\u5305\u88AB\u5220\u9664,\u662F\u4E0D\u662F\u6B63\u5728\u4F7F\u7528\u7684\u4E3B\u9898\u5305\u88AB\u5220\u4E86\u5462?pkgName: ").append(s).append(", mPackageName:").append(i.g(a)).append(", replacing:").append(flag).toString());
            if (i.g(a).equals(s) && !flag)
            {
                i.a(a, "com.gau.go.launcherex.gowidget.weatherwidget");
                i.i(a);
                a.b(context);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!"android.intent.action.PACKAGE_REPLACED".equals(s)) goto _L1; else goto _L3
_L3:
        c.a("dynamicbg", "\u6709apk\u5305\u88AB\u66FF\u6362\u5B89\u88C5,\u662F\u4E0D\u662F\u6B63\u5728\u4F7F\u7528\u7684\u4E3B\u9898\u5305\u88AB\u66FF\u6362\u4E86\u5462?");
        String s1 = intent.getDataString();
        if (!TextUtils.isEmpty(s1))
        {
            s1 = s1.replace("package:", "");
            boolean flag1 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            c.a("dynamicbg", (new StringBuilder()).append("\u6709apk\u5305\u88AB\u66FF\u6362\u5B89\u88C5,\u662F\u4E0D\u662F\u6B63\u5728\u4F7F\u7528\u7684\u4E3B\u9898\u5305\u88AB\u66FF\u6362\u4E86\u5462?replacing\uFF1A").append(flag1).toString());
            if (flag1 && i.g(a).equals(s1))
            {
                i.a(a, s1);
                i.i(a);
                a.b(context);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
