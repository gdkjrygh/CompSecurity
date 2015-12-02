// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.FragmentActivity;
import com.ubercab.client.core.model.ParcelableUpgrade;
import com.ubercab.client.feature.upgrade.UpgradeFragment;
import com.ubercab.rider.realtime.model.Upgrade;
import java.util.Map;

final class ghn
    implements icg
{

    final ghl a;

    private ghn(ghl ghl1)
    {
        a = ghl1;
        super();
    }

    ghn(ghl ghl1, byte byte0)
    {
        this(ghl1);
    }

    private void a(Map map)
    {
        map = (Upgrade)map.get("master");
        ghl.a(a, 2);
        if (map != null && cwm.a(map.getVersion(), "3.76.4").intValue() > 0)
        {
            map = UpgradeFragment.a(ParcelableUpgrade.create(map));
            map.setCancelable(false);
            map.show(a.getActivity().getSupportFragmentManager(), UpgradeFragment.a);
        }
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((Map)obj);
    }

    public final void a(Throwable throwable)
    {
        ghl.a(a, 0);
    }
}
