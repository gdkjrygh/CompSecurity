// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.ubercab.android.wechat.share.model.TextObject;

public final class cxj
{

    cxn a;

    public cxj(Context context, String s)
    {
        a = cxo.a(context, s);
    }

    public final boolean a(cxh cxh1, cxk cxk1, String s)
    {
        com.ubercab.android.wechat.share.port.modelmsg.SendMessageToWX.Req req = new com.ubercab.android.wechat.share.port.modelmsg.SendMessageToWX.Req();
        req.message = cxh1.a();
        req.scene = cxk1.a();
        req.transaction = s;
        return a.a(req);
    }

    public final boolean a(String s, cxk cxk1)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = new TextObject(s);
            return a((new cxi()).a(s).a(), cxk1, (new StringBuilder("text")).append(System.currentTimeMillis()).toString());
        } else
        {
            return false;
        }
    }
}
