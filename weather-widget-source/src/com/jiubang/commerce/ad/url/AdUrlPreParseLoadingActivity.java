// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.jiubang.commerce.ad.b.a.l;
import com.jiubang.commerce.ad.f;
import com.jiubang.commerce.utils.g;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            f, g, l, a, 
//            c

public class AdUrlPreParseLoadingActivity extends Activity
{

    private static AdUrlPreParseLoadingActivity b;
    private boolean a;
    private Handler c;
    private l d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    private boolean l;
    private Runnable m;
    private c n;

    public AdUrlPreParseLoadingActivity()
    {
        c = null;
        m = new com.jiubang.commerce.ad.url.f(this);
        n = new com.jiubang.commerce.ad.url.g(this);
    }

    static Handler a(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        return adurlpreparseloadingactivity.c;
    }

    private void a()
    {
        if (TextUtils.isEmpty(i))
        {
            Toast.makeText(getApplicationContext(), com.jiubang.commerce.ad.f.a(getApplicationContext()).e("desksetting_net_error"), 1).show();
            return;
        }
        String s;
        if (TextUtils.isEmpty(j))
        {
            s = i;
        } else
        {
            s = j;
        }
        com.jiubang.commerce.utils.g.a(this, s, l, k);
    }

    static void b(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        adurlpreparseloadingactivity.a();
    }

    static String c(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        return adurlpreparseloadingactivity.e;
    }

    static String d(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        return adurlpreparseloadingactivity.j;
    }

    static Runnable e(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        return adurlpreparseloadingactivity.m;
    }

    static boolean f(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        return adurlpreparseloadingactivity.l;
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        if (c != null && m != null)
        {
            c.removeCallbacks(m);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj = null;
        boolean flag1 = true;
        super.onCreate(bundle);
        setContentView(com.jiubang.commerce.ad.f.a(this).b("ad_jump_tips_layout"));
        Intent intent = getIntent();
        boolean flag;
        if (intent != null)
        {
            flag = intent.getBooleanExtra("isParseUrl", true);
        } else
        {
            flag = true;
        }
        a = flag;
        if (!a)
        {
            b = this;
            return;
        }
        long l1;
        if (intent != null)
        {
            bundle = (l)intent.getSerializableExtra("paramsBean");
        } else
        {
            bundle = null;
        }
        d = bundle;
        if (intent != null)
        {
            bundle = intent.getStringExtra("pkgName");
        } else
        {
            bundle = "-1";
        }
        e = bundle;
        if (intent != null)
        {
            bundle = intent.getStringExtra("moduleId");
        } else
        {
            bundle = "-1";
        }
        f = bundle;
        if (intent != null)
        {
            bundle = intent.getStringExtra("mapId");
        } else
        {
            bundle = "-1";
        }
        g = bundle;
        if (intent != null)
        {
            bundle = intent.getStringExtra("aId");
        } else
        {
            bundle = "-1";
        }
        h = bundle;
        if (intent != null)
        {
            bundle = intent.getStringExtra("downloadUrl");
        } else
        {
            bundle = null;
        }
        i = bundle;
        bundle = obj;
        if (intent != null)
        {
            bundle = intent.getStringExtra("redirectUrl");
        }
        j = bundle;
        if (intent != null)
        {
            l1 = intent.getLongExtra("timeOutDuration", l.a);
        } else
        {
            l1 = l.a;
        }
        if (l1 <= 0L)
        {
            l1 = l.a;
        }
        if (intent != null)
        {
            flag = intent.getBooleanExtra("isShowFloatWindow", true);
        } else
        {
            flag = true;
        }
        k = flag;
        flag = flag1;
        if (intent != null)
        {
            flag = intent.getBooleanExtra("isOpenBrowser", true);
        }
        l = flag;
        if (TextUtils.isEmpty(j))
        {
            finish();
            return;
        }
        c = new Handler();
        if (com.jiubang.commerce.ad.url.a.a(getApplicationContext(), d, e, f, g, h, j, i, l1, k, false, "", n))
        {
            c.removeCallbacks(m);
            c.postDelayed(m, l1);
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        c = null;
    }
}
