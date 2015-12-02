// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.Serializable;

class weight
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    int code;
    float weight;

    public (int i, float f)
    {
        code = i;
        weight = f;
    }
}
