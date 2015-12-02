// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.ubercab.rider.realtime.model.MobileMessage;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class efw
    implements efj
{

    public efw()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        s = Uri.parse(s).getQueryParameter("url");
        if (cwm.b(context, "com.facebook.katana"))
        {
            Toast.makeText(context, context.getString(0x7f0703f9), 0).show();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", s);
            intent.setPackage("com.facebook.katana");
            context.startActivity(intent);
            return (new eex()).a(n.bg).b("facebook_native").a(mobilemessage.getId()).b();
        }
        try
        {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("https://www.facebook.com/sharer/sharer.php?u=")).append(URLEncoder.encode(s, "UTF-8")).toString())));
            context = (new eex()).a(n.bg).b("facebook_web").a(mobilemessage.getId()).b();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return eew.b;
        }
        return context;
    }
}
