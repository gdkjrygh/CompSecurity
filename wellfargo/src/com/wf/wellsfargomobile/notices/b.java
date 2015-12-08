// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.google.android.gms.common.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            c

public class b
{

    private static b c;
    private List a;
    private Map b;

    public b()
    {
        b = new HashMap();
        a = new ArrayList();
    }

    public static b a(Context context)
    {
        Object obj;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        c = new b();
        obj = new c("1", context.getResources().getString(0x7f080086), d.c(context));
        c.a.add(obj);
        c.b.put(((c) (obj)).a, obj);
        obj = new StringBuilder(9000);
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(context.getAssets().open("gson_LICENSE.txt")));
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        ((StringBuilder) (obj)).append(s).append("\n");
          goto _L1
        IOException ioexception;
        ioexception;
        obj = new c("2", context.getResources().getString(0x7f08013f), ((StringBuilder) (obj)).toString());
        c.a.add(obj);
        c.b.put(((c) (obj)).a, obj);
        obj = new StringBuilder(9000);
        ioexception = new BufferedReader(new InputStreamReader(context.getAssets().open("leakcanary_LICENSE.txt")));
_L2:
        s = ioexception.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        ((StringBuilder) (obj)).append(s).append("\n");
          goto _L2
        ioexception;
        context = new c("3", context.getResources().getString(0x7f080140), ((StringBuilder) (obj)).toString());
        c.a.add(context);
        c.b.put(((c) (context)).a, context);
        return c;
    }

    public static List b(Context context)
    {
        return a(context).a;
    }

    public static Map c(Context context)
    {
        return a(context).b;
    }
}
