// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractContainerBox;

public class GenericMediaHeaderAtom extends AbstractContainerBox
{

    public static final String TYPE = "gmhd";

    public GenericMediaHeaderAtom()
    {
        super("gmhd");
    }
}
