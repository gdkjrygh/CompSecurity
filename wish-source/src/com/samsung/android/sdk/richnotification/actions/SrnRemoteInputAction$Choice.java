// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import com.samsung.android.sdk.richnotification.SrnImageAsset;

// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

private static class mSelected
{

    private final SrnImageAsset mChoiceIcon;
    private final String mChoiceId;
    private final String mChoiceLabel;
    private final Integer mSelected;

    public (String s, String s1)
    {
        this(s, s1, null, null);
    }

    public <init>(String s, String s1, SrnImageAsset srnimageasset)
    {
        this(s, s1, srnimageasset, null);
    }

    public <init>(String s, String s1, SrnImageAsset srnimageasset, Integer integer)
    {
        if (s == null)
        {
            throw new NullPointerException("label is null.");
        }
        if (s1 == null)
        {
            throw new NullPointerException("choiceID is null.");
        } else
        {
            mChoiceLabel = s;
            mChoiceId = s1;
            mChoiceIcon = srnimageasset;
            mSelected = integer;
            return;
        }
    }
}
