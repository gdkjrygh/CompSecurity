// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import org.aspectj.runtime.reflect.Factory;

public abstract class ChunkOffsetBox extends AbstractFullBox
{

    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;

    public ChunkOffsetBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("ChunkOffsetBox.java", com/coremedia/iso/boxes/ChunkOffsetBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 17);
    }

    public abstract long[] getChunkOffsets();

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder(String.valueOf(getClass().getSimpleName()))).append("[entryCount=").append(getChunkOffsets().length).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
