// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import com.samsung.android.sdk.richnotification.SrnImageAsset;
import com.samsung.android.sdk.richnotification.SrnValidationException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

private static abstract class mChoices extends mChoices
{

    private final List mChoices;

    protected mChoices addChoice(String s, String s1)
    {
        mChoices.add(new mChoices(s, s1));
        return this;
    }

    protected mChoices addChoice(String s, String s1, SrnImageAsset srnimageasset)
    {
        mChoices.add(new mChoices(s, s1, srnimageasset));
        return this;
    }

    protected mChoices addChoice(String s, String s1, SrnImageAsset srnimageasset, boolean flag)
    {
        List list = mChoices;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        list.add(new mChoices(s, s1, srnimageasset, Integer.valueOf(i)));
        return this;
    }

    protected void validateSelf(SrnRemoteInputAction srnremoteinputaction)
        throws SrnValidationException
    {
        if (mChoices.isEmpty())
        {
            throw new SrnValidationException((new StringBuilder("Choices of SrnRempteInputAction(")).append(SrnRemoteInputAction.access$3(srnremoteinputaction)).append(") are empty.").toString());
        } else
        {
            return;
        }
    }

    protected ype(ype ype)
    {
        super(ype);
        mChoices = new ArrayList();
    }

    protected mChoices(mChoices mchoices)
    {
        super(mchoices);
        mChoices = new ArrayList(mchoices.mChoices);
    }
}
