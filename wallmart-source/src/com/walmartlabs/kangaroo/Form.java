// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Form
{
    public static class Builder
    {

        final List mKeyValuePairs = new ArrayList();

        public Builder add(String s, String s1)
        {
            mKeyValuePairs.add(new Pair(s, s1));
            return this;
        }

        public Form build()
        {
            return new Form(this);
        }

        public Builder()
        {
        }
    }


    private final List mKeyValuePairs;

    private Form(Builder builder)
    {
        mKeyValuePairs = Collections.unmodifiableList(builder.mKeyValuePairs);
    }


    public List getKeyValuePairs()
    {
        return mKeyValuePairs;
    }
}
