// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.config.AppConfigKey;
import com.ubercab.client.feature.music.MusicProviderAdapter;
import com.ubercab.client.feature.settings.SettingsFragment;
import com.ubercab.rider.realtime.model.Client;

public final class fhb
    implements ide
{

    final SettingsFragment a;

    private fhb(SettingsFragment settingsfragment)
    {
        a = settingsfragment;
        super();
    }

    public fhb(SettingsFragment settingsfragment, byte byte0)
    {
        this(settingsfragment);
    }

    private void a(fhc fhc1)
    {
        fhc1 = fhc1.a;
        if (fhc1 == null)
        {
            return;
        }
        if (SettingsFragment.a(a) == null)
        {
            SettingsFragment.a(a, fhc1.getFirstName(), fhc1.getLastName(), fhc1.getEmail(), fhc1.getMobileCountryIso2(), fhc1.getCurrentMobile(), fhc1.getPictureUrl());
        }
        SettingsFragment.b(a).a(a.d.a(AppConfigKey.b, true));
        SettingsFragment.b(a).a(fhc1.getThirdPartyIdentities());
    }

    public final void call(Object obj)
    {
        a((fhc)obj);
    }
}
