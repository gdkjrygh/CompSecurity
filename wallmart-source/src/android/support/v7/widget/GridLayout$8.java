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
        return 0x80000000;
    }

    String getDebugString()
    {
        return "FILL";
    }

    int getGravityOffset(View view, int i)
    {
        return 0;
    }

    public int getSizeInCell(View view, int i, int j)
    {
        return j;
    }

    ignment()
    {
    }
}
