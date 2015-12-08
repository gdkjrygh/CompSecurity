// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Context;
import android.text.TextUtils;
import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            j, d, i, k

class g extends j
{

    final d a;

    g(d d1, Context context, String s, String s1)
    {
        a = d1;
        super(context, s, s1);
    }

    protected void a(k k1)
    {
        d.a(a, true);
        if (a.d)
        {
            return;
        }
        i.a[k1.ordinal()];
        JVM INSTR tableswitch 1 1: default 48
    //                   1 67;
           goto _L1 _L2
_L1:
        d.a(a, k1);
_L4:
        a.f.hideProgressDialog();
        return;
_L2:
        if (!TextUtils.isEmpty(a()))
        {
            d.a(a, a());
        } else
        {
            d.a(a, "/");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onPostExecute(Object obj)
    {
        a((k)obj);
    }
}
