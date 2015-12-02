// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ubercab.android.wechat.share.model.WebpageObject;
import com.ubercab.rider.realtime.model.MobileMessage;

public abstract class ega
    implements efj
{

    public ega()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        Object obj = Uri.parse(s);
        s = ((Uri) (obj)).getQueryParameter("title");
        String s1 = ((Uri) (obj)).getQueryParameter("description");
        obj = ((Uri) (obj)).getQueryParameter("url");
        cxj cxj1 = new cxj(context, context.getString(0x7f0706c3));
        if (cwm.b(context, "com.tencent.mm"))
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                cxj1.a((new cxi()).a(s1).b(s).a(new WebpageObject(((String) (obj)))).a(), c(), (new StringBuilder()).append(mobilemessage.getId()).append(gju.a()).toString());
            } else
            {
                cxj1.a(s, c());
            }
            return (new eex()).a(n.bg).b(b()).a(mobilemessage.getId()).b();
        } else
        {
            return (new eex()).a(n.bg).b(a()).a(mobilemessage.getId()).a(false).b();
        }
    }

    protected abstract String a();

    protected abstract String b();

    protected abstract cxk c();
}
