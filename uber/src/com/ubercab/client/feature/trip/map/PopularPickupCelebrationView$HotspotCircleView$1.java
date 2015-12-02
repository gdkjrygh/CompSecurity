// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class a extends AnimatorListenerAdapter
{

    final tVisibility a;

    public void onAnimationStart(Animator animator)
    {
        a.tAlpha(0.0F);
        a.tVisibility(0);
    }

    ( )
    {
        a = ;
        super();
    }
}
