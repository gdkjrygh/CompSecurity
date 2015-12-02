// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.settings.SettingsActivity;
import com.ubercab.client.feature.settings.SettingsFragment;
import com.ubercab.rider.realtime.model.Client;

public final class fgy
    implements icg
{

    final SettingsActivity a;

    private fgy(SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }

    public fgy(SettingsActivity settingsactivity, byte byte0)
    {
        this(settingsactivity);
    }

    private void a(Client client)
    {
        if (a.r != null)
        {
            a.r.a(client);
        }
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((Client)obj);
    }

    public final void a(Throwable throwable)
    {
        Toast.makeText(a, a.getString(0x7f070631), 0).show();
    }
}
