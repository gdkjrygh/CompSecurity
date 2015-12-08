// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeFocusChangeListener
    implements android.view.View.OnFocusChangeListener
{
    public static class Builder
    {

        private final List mListeners = new ArrayList();

        public Builder addListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
        {
            mListeners.add(onfocuschangelistener);
            return this;
        }

        public CompositeFocusChangeListener build()
        {
            return new CompositeFocusChangeListener(this);
        }


        public Builder()
        {
        }
    }


    private List mListeners;

    public CompositeFocusChangeListener()
    {
        mListeners = new ArrayList();
    }

    protected CompositeFocusChangeListener(Builder builder)
    {
        mListeners = new ArrayList();
        mListeners = builder.mListeners;
    }

    public void addListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        mListeners.add(onfocuschangelistener);
    }

    public void onFocusChange(View view, boolean flag)
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((android.view.View.OnFocusChangeListener)iterator.next()).onFocusChange(view, flag)) { }
    }

    public void removeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        mListeners.remove(onfocuschangelistener);
    }
}
