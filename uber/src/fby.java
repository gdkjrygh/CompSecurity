// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.feature.promo.v3.PromoViewModel;
import java.util.Collections;
import java.util.List;

public final class fby
    implements hqm
{

    public fby()
    {
    }

    public final hqt a(ViewGroup viewgroup, Class class1)
    {
        return new com.ubercab.client.feature.promo.v3.PromoViewModel.ViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03015d, viewgroup, false));
    }

    public final List a()
    {
        return Collections.singletonList(com/ubercab/client/feature/promo/v3/PromoViewModel);
    }
}
