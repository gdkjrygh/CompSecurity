// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.ubercab.client.feature.settings.SettingsActivity;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class efs
    implements efj
{

    public efs()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        context.startActivity(new Intent(context, com/ubercab/client/feature/settings/SettingsActivity));
        return (new eex()).a(true).a().a(n.be).a(mobilemessage.getId()).b();
    }
}
