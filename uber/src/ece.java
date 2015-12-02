// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.faresplit.master.FareSplitSummaryFragment;

public final class ece
    implements icg
{

    final FareSplitSummaryFragment a;

    private ece(FareSplitSummaryFragment faresplitsummaryfragment)
    {
        a = faresplitsummaryfragment;
        super();
    }

    public ece(FareSplitSummaryFragment faresplitsummaryfragment, byte byte0)
    {
        this(faresplitsummaryfragment);
    }

    public final void a()
    {
        a.dismiss();
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        a.dismiss();
        Toast.makeText(a.getActivity(), a.getString(0x7f070631), 0).show();
    }
}
