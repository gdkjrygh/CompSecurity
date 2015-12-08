// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.c;
import com.jiubang.commerce.utils.i;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            p, o

public class n
{

    private static n a;
    private Context b;
    private ExecutorService c;

    private n(Context context)
    {
        b = context;
        c = Executors.newSingleThreadExecutor();
    }

    static Context a(n n1)
    {
        return n1.b;
    }

    public static n a(Context context)
    {
        if (a == null)
        {
            a = new n(context);
        }
        return a;
    }

    public static String a(String s)
    {
        int k = s.hashCode();
        return (new StringBuilder()).append(c.c).append(String.valueOf(k)).toString();
    }

    public void a(String s, p p1)
    {
        if (TextUtils.isEmpty(s))
        {
            if (p1 != null)
            {
                p1.a(s);
            }
            return;
        } else
        {
            c.execute(new o(this, s, p1));
            return;
        }
    }

    public boolean a(List list, boolean flag, boolean flag1)
    {
        if (list == null || list.isEmpty())
        {
            return false;
        }
        Object obj = new ArrayList();
        ((List) (obj)).addAll(list);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            a a1 = (a)((Iterator) (obj)).next();
            if (a1 != null)
            {
                if (flag && !TextUtils.isEmpty(a1.h()))
                {
                    i.a(b, a1.h(), a(a1.h()));
                }
                if (flag1 && !TextUtils.isEmpty(a1.i()))
                {
                    i.a(b, a1.i(), a(a1.i()));
                }
                if (j.a)
                {
                    j.a("Ad_SDK", (new StringBuilder()).append("syncLoadAdImage(ad count:").append(list.size()).append(", isNeedDownloadBanner:").append(flag1).append(")").toString());
                }
            }
        } while (true);
        return true;
    }
}
