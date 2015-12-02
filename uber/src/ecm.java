// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.faresplit.minion.FareSplitInvitationFragment;

public final class ecm
    implements icg
{

    final FareSplitInvitationFragment a;

    private ecm(FareSplitInvitationFragment faresplitinvitationfragment)
    {
        a = faresplitinvitationfragment;
        super();
    }

    public ecm(FareSplitInvitationFragment faresplitinvitationfragment, byte byte0)
    {
        this(faresplitinvitationfragment);
    }

    private void b()
    {
        a.dismiss();
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        b();
    }

    public final void a(Throwable throwable)
    {
        FareSplitInvitationFragment.a(a);
        a.dismiss();
        Toast.makeText(a.getActivity(), a.getString(0x7f070631), 0).show();
    }
}
