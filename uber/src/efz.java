// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class efz
    implements efj
{

    public efz()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        Object obj = Uri.parse(s);
        s = ((Uri) (obj)).getQueryParameter("message");
        obj = ((Uri) (obj)).getQueryParameter("url");
        s = new Intent("android.intent.action.VIEW", Uri.parse((new android.net.Uri.Builder()).scheme("https").authority("twitter.com").appendPath("intent").appendPath("tweet").appendQueryParameter("text", s).appendQueryParameter("url", ((String) (obj))).build().toString()));
        if (cwm.b(context, "com.twitter.android"))
        {
            s.setPackage("com.twitter.android");
            context.startActivity(s);
            return (new eex()).a(n.bg).b("twitter_native").a(mobilemessage.getId()).b();
        } else
        {
            context.startActivity(Intent.createChooser(s, context.getString(0x7f0703eb)));
            return (new eex()).a(n.bg).b("twitter_web").a(mobilemessage.getId()).b();
        }
    }
}
