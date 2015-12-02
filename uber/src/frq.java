// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.trip.TripFragment;

public final class frq
    implements icg
{

    final TripFragment a;

    private frq(TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }

    public frq(TripFragment tripfragment, byte byte0)
    {
        this(tripfragment);
    }

    public final void a()
    {
        a.e();
        a.E.q();
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        a.e();
        Toast.makeText(a.getActivity(), a.getString(0x7f070631), 0).show();
    }
}
