// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;


final class q
{

    static final int a[];

    static 
    {
        a = new int[CommentFooterPresenter.Model.State.values().length];
        try
        {
            a[CommentFooterPresenter.Model.State.CAN_LOAD_MORE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[CommentFooterPresenter.Model.State.NO_MORE_COMMENTS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[CommentFooterPresenter.Model.State.LOADING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[CommentFooterPresenter.Model.State.NO_COMMENTS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
