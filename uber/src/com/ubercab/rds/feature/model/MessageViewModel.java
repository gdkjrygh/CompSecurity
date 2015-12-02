// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.model;

import com.ubercab.ui.collection.model.ViewModel;
import hco;
import java.util.List;

// Referenced classes of package com.ubercab.rds.feature.model:
//            Shape_MessageViewModel

public abstract class MessageViewModel extends ViewModel
{

    public MessageViewModel()
    {
    }

    public static MessageViewModel create()
    {
        return new Shape_MessageViewModel();
    }

    public abstract List getActionSummaries();

    public abstract String getAvatarUrl();

    public abstract List getMessageBodyComponents();

    public abstract String getName();

    public abstract hco getRdsImageLoader();

    public abstract String getTime();

    public abstract MessageViewModel setActionSummaries(List list);

    public abstract MessageViewModel setAvatarUrl(String s);

    public abstract MessageViewModel setMessageBodyComponents(List list);

    public abstract MessageViewModel setName(String s);

    public abstract MessageViewModel setRdsImageLoader(hco hco);

    public abstract MessageViewModel setTime(String s);
}
