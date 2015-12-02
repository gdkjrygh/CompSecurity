// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.profiles.onboarding.OnBoardingIntroCard;
import java.util.Arrays;
import java.util.List;

final class fad
    implements ezz
{

    private final String a;
    private final gmg b;

    fad(gmg gmg1)
    {
        b = gmg1;
        a = b.b(dbf.aL, "base_s3_url");
    }

    private OnBoardingIntroCard b()
    {
        return OnBoardingIntroCard.a((new StringBuilder()).append(a).append(b.b(dbf.aL, "business_card_url")).toString(), 0x7f070077, 0x7f070078);
    }

    private OnBoardingIntroCard c()
    {
        return OnBoardingIntroCard.a((new StringBuilder()).append(a).append(b.b(dbf.aL, "expense_card_url")).toString(), 0x7f070437, 0x7f070438);
    }

    private OnBoardingIntroCard d()
    {
        return OnBoardingIntroCard.a((new StringBuilder()).append(a).append(b.b(dbf.aL, "tag_card_url")).toString(), 0x7f07048c, 0x7f07048d);
    }

    public final List a()
    {
        return Arrays.asList(new OnBoardingIntroCard[] {
            b(), d(), c()
        });
    }
}
