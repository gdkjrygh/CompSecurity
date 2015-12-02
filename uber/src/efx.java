// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class efx
    implements efj
{

    public efx()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        Uri uri = Uri.parse(s);
        String s1 = uri.getQueryParameter("message");
        s = s1;
        if (s1 == null)
        {
            s = uri.getQueryParameter("url");
        }
        if (s == null)
        {
            return eew.b;
        } else
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", s);
            context.startActivity(Intent.createChooser(intent, context.getString(0x7f0703ea)));
            return (new eex()).a(n.bg).b("generic").a(mobilemessage.getId()).b();
        }
    }
}
