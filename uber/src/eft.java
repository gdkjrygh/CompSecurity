// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class eft
    implements efj
{

    public eft()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        return (new eex()).a(n.bg).b("url").a(mobilemessage.getId()).b();
    }
}
