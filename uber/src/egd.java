// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class egd
    implements efj
{

    public egd()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        Object obj = Uri.parse(s);
        s = ((Uri) (obj)).getQueryParameter("message");
        obj = ((Uri) (obj)).getQueryParameter("url");
        if (cwm.b(context, "com.sina.weibo"))
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(s).append(((String) (obj))).toString());
            intent.setPackage("com.sina.weibo");
            context.startActivity(intent);
            return (new eex()).a(n.bg).b("weibo_native").a(mobilemessage.getId()).b();
        }
        Intent intent1 = new Intent("android.intent.action.VIEW");
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("http").authority("service.weibo.com").path("share/share.php");
        if (!TextUtils.isEmpty(s))
        {
            builder.appendQueryParameter("title", s);
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            builder.appendQueryParameter("url", ((String) (obj)));
        }
        intent1.setData(builder.build());
        context.startActivity(intent1);
        return (new eex()).a(n.bg).b("weibo_web").a(mobilemessage.getId()).b();
    }
}
