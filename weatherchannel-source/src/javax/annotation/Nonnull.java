// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation;

import java.lang.annotation.Annotation;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

public interface Nonnull
    extends Annotation
{
    public static class Checker
        implements TypeQualifierValidator
    {

        public volatile When forConstantValue(Annotation annotation, Object obj)
        {
            return forConstantValue((Nonnull)annotation, obj);
        }

        public When forConstantValue(Nonnull nonnull, Object obj)
        {
            if (obj == null)
            {
                return When.NEVER;
            } else
            {
                return When.ALWAYS;
            }
        }

        public Checker()
        {
        }
    }


    public abstract When when();
}
