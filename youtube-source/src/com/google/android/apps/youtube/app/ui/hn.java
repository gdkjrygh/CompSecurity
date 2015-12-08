// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            LikeAction

final class hn
{

    static final int a[];

    static 
    {
        a = new int[LikeAction.values().length];
        try
        {
            a[LikeAction.LIKE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[LikeAction.DISLIKE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[LikeAction.REMOVE_LIKE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
