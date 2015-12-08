// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;

public class  extends IOException
{

    private static final long serialVersionUID = 0x9f95917c52ce6e25L;

    (int i, int j)
    {
        super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
    }
}
