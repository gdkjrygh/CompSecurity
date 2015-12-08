// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


// Referenced classes of package io.fabric.sdk.android.services.common:
//            QueueFile

static class length
{

    static final int HEADER_LENGTH = 4;
    static final length NULL = new <init>(0, 0);
    final int length;
    final int position;

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("[").append("position = ").append(position).append(", length = ").append(length).append("]").toString();
    }


    (int i, int j)
    {
        position = i;
        length = j;
    }
}
