// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.FragmentActivity;
import com.ubercab.client.core.ui.ChipEditText;
import com.ubercab.client.feature.faresplit.master.FareSplitInviteFragment;

public final class ebx
    implements icg
{

    final FareSplitInviteFragment a;

    private ebx(FareSplitInviteFragment faresplitinvitefragment)
    {
        a = faresplitinvitefragment;
        super();
    }

    public ebx(FareSplitInviteFragment faresplitinvitefragment, byte byte0)
    {
        this(faresplitinvitefragment);
    }

    public final void a()
    {
        a.e();
        a.mEditTextInvitees.setText("");
        a.getActivity().setResult(-1);
        a.getActivity().finish();
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        a.e();
    }
}
