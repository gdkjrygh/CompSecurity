// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.youtube.p;

public final class LikeAction extends Enum
{

    private static final LikeAction $VALUES[];
    public static final LikeAction DISLIKE;
    public static final LikeAction LIKE;
    public static final LikeAction REMOVE_LIKE;
    private final int successToastStringId;

    private LikeAction(String s, int i, int j)
    {
        super(s, i);
        successToastStringId = j;
    }

    public static LikeAction valueOf(String s)
    {
        return (LikeAction)Enum.valueOf(com/google/android/apps/youtube/app/ui/LikeAction, s);
    }

    public static LikeAction[] values()
    {
        return (LikeAction[])$VALUES.clone();
    }

    public final int getSuccessToastStringId()
    {
        return successToastStringId;
    }

    static 
    {
        LIKE = new LikeAction("LIKE", 0, p.eM);
        DISLIKE = new LikeAction("DISLIKE", 1, p.eK);
        REMOVE_LIKE = new LikeAction("REMOVE_LIKE", 2, p.eP);
        $VALUES = (new LikeAction[] {
            LIKE, DISLIKE, REMOVE_LIKE
        });
    }
}
