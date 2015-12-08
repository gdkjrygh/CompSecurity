// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.golauncher.a.a.a;

import android.util.Log;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.golauncher.a.a.a:
//            f

public class h
{

    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final f e;
    public final int f;

    public h(f f1)
    {
        JSONObject jsonobject = new JSONObject(f1.a);
        e = f1;
        a = jsonobject.getString("productId");
        if (jsonobject.has("orderId"))
        {
            f1 = jsonobject.getString("orderId");
        } else
        {
            f1 = (new StringBuilder()).append("12999763169054705758.").append(jsonobject.getLong("purchaseTime")).toString();
        }
        b = f1;
        c = jsonobject.getString("purchaseToken");
        f = jsonobject.getInt("purchaseState");
        d = jsonobject.getLong("purchaseTime");
        Log.i("wss", (new StringBuilder()).append("TransactionDetails:productId ").append(a).append(" orderId:").append(b).append(" purchaseToken:").append(c).append(" purchaseStatus:").append(f).append(" purchaseTime:").append(d).toString());
    }

    public String toString()
    {
        return String.format("%s purchased at %s(%s). Token: %s, Signature: %s", new Object[] {
            a, Long.valueOf(d), b, c, e.b
        });
    }
}
