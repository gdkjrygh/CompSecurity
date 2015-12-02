// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class efq
    implements efj
{

    public efq()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        String s1 = Uri.parse(s).getQueryParameter("url");
        if (s1 == null)
        {
            return eew.b;
        }
        if (s1.startsWith("http://"))
        {
            s = (new StringBuilder("https://")).append(s1.substring(7)).toString();
        } else
        {
            s = s1;
            if (!s1.startsWith("market://"))
            {
                s = s1;
                if (!s1.startsWith("https://"))
                {
                    s = (new StringBuilder("https://")).append(s1).toString();
                }
            }
        }
        try
        {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return eew.b;
        }
        return (new eex()).a(n.aX).b(s).a(mobilemessage.getId()).b();
    }
}
