// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class mIconRefine
{

    public final ImageView mIcon1;
    public final ImageView mIcon2;
    public final ImageView mIconRefine;
    public final TextView mText1;
    public final TextView mText2;

    public (View view)
    {
        mText1 = (TextView)view.findViewById(0x1020014);
        mText2 = (TextView)view.findViewById(0x1020015);
        mIcon1 = (ImageView)view.findViewById(0x1020007);
        mIcon2 = (ImageView)view.findViewById(0x1020008);
        mIconRefine = (ImageView)view.findViewById(com.actionbarsherlock.wCache.mIconRefine);
    }
}
