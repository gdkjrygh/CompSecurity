// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;

public interface SignupCartDataEntryCallback
    extends CartDataEntryCallback
{

    public abstract void onCancel();

    public abstract void onClose();

    public abstract void onComplete();
}
