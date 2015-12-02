// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.faresplit.master.FareSplitSummaryFragment;

public final class ecg
    implements icg
{

    final FareSplitSummaryFragment a;

    private ecg(FareSplitSummaryFragment faresplitsummaryfragment)
    {
        a = faresplitsummaryfragment;
        super();
    }

    public ecg(FareSplitSummaryFragment faresplitsummaryfragment, byte byte0)
    {
        this(faresplitsummaryfragment);
    }

    private void b()
    {
        FareSplitSummaryFragment.a(a);
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
        FareSplitSummaryFragment.a(a);
        Toast.makeText(a.getActivity(), a.getString(0x7f070631), 0).show();
    }
}
