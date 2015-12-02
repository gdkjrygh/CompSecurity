// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.rider.realtime.model.MobileMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class efy
    implements efj
{

    private static final List a = (new gkf()).a("com.google.android.talk").a("com.android.mms").a("com.facebook.orca").a("com.whatsapp").a("com.tencent.mm").a("jp.naver.line.android").a("com.kakao.talk").a();

    public efy()
    {
    }

    private static String a(Context context)
    {
        return android.provider.Telephony.Sms.getDefaultSmsPackage(context);
    }

    private static boolean a(Context context, ArrayList arraylist, String s, String s1)
    {
        if (!cwm.b(context, s1))
        {
            return false;
        } else
        {
            context = new Intent("android.intent.action.SEND");
            context.setType("text/plain");
            context.setPackage(s1);
            context.putExtra("android.intent.extra.TEXT", s);
            arraylist.add(context);
            return true;
        }
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        Object obj = Uri.parse(s).getQueryParameter("message");
        s = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); a(context, ((ArrayList) (s)), ((String) (obj)), (String)iterator.next())) { }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            String s1 = a(context);
            if (s1 != null && !a.contains(s1))
            {
                a(context, ((ArrayList) (s)), ((String) (obj)), s1);
            }
        } else
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("sms:"));
            intent.putExtra("sms_body", ((String) (obj)));
            s.add(intent);
        }
        if (s.isEmpty())
        {
            return eew.b;
        }
        obj = Intent.createChooser((Intent)s.get(0), context.getString(0x7f0703ea));
        if (s.size() > 1)
        {
            s.remove(0);
            ((Intent) (obj)).putExtra("android.intent.extra.INITIAL_INTENTS", (Intent[])s.toArray(new Intent[s.size()]));
        }
        context.startActivity(((Intent) (obj)));
        return (new eex()).a(n.bg).b("message").a(mobilemessage.getId()).b();
    }

}
