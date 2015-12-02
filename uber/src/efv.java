// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.rider.realtime.model.MobileMessage;
import java.util.Locale;

public final class efv
    implements efj
{

    public efv()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        Object obj = Uri.parse(s);
        s = ((Uri) (obj)).getQueryParameter("subject");
        obj = ((Uri) (obj)).getQueryParameter("body");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse((new StringBuilder("mailto:?subject=")).append(s).toString()));
        if (cwm.b(context, "com.google.android.gm") && "US".equals(Locale.getDefault().getCountry()))
        {
            intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        }
        if (obj != null)
        {
            intent.putExtra("android.intent.extra.TEXT", ((String) (obj)));
        }
        context.startActivity(Intent.createChooser(intent, context.getString(0x7f0703e9)));
        return (new eex()).a(n.bg).b("email").a(mobilemessage.getId()).b();
    }
}
