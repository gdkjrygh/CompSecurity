// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;


// Referenced classes of package com.contextlogic.wish.api.service:
//            FeedCampaignLogService

public static final class  extends Enum
{

    private static final Dismiss $VALUES[];
    public static final Dismiss Action;
    public static final Dismiss Dismiss;
    public static final Dismiss Impression;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/service/FeedCampaignLogService$FeedCampaignLogServiceActionType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Impression = new <init>("Impression", 0);
        Action = new <init>("Action", 1);
        Dismiss = new <init>("Dismiss", 2);
        $VALUES = (new .VALUES[] {
            Impression, Action, Dismiss
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
