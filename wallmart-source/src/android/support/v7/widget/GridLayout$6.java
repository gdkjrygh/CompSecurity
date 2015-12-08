// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

static final class ignment extends ignment
{

    public int getAlignmentValue(View view, int i, int j)
    {
        return i >> 1;
    }

    String getDebugString()
    {
        return "CENTER";
    }

    int getGravityOffset(View view, int i)
    {
        return i >> 1;
    }

    ignment()
    {
    }
}
