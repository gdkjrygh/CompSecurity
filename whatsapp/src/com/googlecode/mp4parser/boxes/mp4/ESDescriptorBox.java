// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4:
//            AbstractDescriptorBox

public class ESDescriptorBox extends AbstractDescriptorBox
{

    public static final String TYPE = "esds";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;

    public ESDescriptorBox()
    {
        super("esds");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("ESDescriptorBox.java", com/googlecode/mp4parser/boxes/mp4/ESDescriptorBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 38);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"), 49);
    }

    public boolean equals(Object obj)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ESDescriptorBox)obj;
            if (data == null ? ((ESDescriptorBox) (obj)).data != null : !data.equals(((ESDescriptorBox) (obj)).data))
            {
                return false;
            }
        }
        return true;
    }

    public ESDescriptor getEsDescriptor()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (ESDescriptor)super.getDescriptor();
    }

    public int hashCode()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (data != null)
        {
            return data.hashCode();
        } else
        {
            return 0;
        }
    }

    static 
    {
        ajc$preClinit();
    }
}
