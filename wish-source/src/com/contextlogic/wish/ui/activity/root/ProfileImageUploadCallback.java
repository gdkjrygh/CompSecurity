// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.api.data.WishUser;

public interface ProfileImageUploadCallback
{

    public abstract void onFailure(boolean flag);

    public abstract void onSuccess(WishUser wishuser);
}
