// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.SignaturePattern;
import org.aspectj.lang.reflect.TypePattern;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            TypePatternImpl, SignaturePatternImpl

public class DeclareAnnotationImpl
    implements DeclareAnnotation
{

    private String annText;
    private AjType declaringType;
    private org.aspectj.lang.reflect.DeclareAnnotation.Kind kind;
    private SignaturePattern signaturePattern;
    private Annotation theAnnotation;
    private TypePattern typePattern;

    public DeclareAnnotationImpl(AjType ajtype, String s, String s1, Annotation annotation, String s2)
    {
        declaringType = ajtype;
        if (s.equals("at_type"))
        {
            kind = org.aspectj.lang.reflect.DeclareAnnotation.Kind.Type;
        } else
        if (s.equals("at_field"))
        {
            kind = org.aspectj.lang.reflect.DeclareAnnotation.Kind.Field;
        } else
        if (s.equals("at_method"))
        {
            kind = org.aspectj.lang.reflect.DeclareAnnotation.Kind.Method;
        } else
        if (s.equals("at_constructor"))
        {
            kind = org.aspectj.lang.reflect.DeclareAnnotation.Kind.Constructor;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Unknown declare annotation kind: ").append(s).toString());
        }
        if (kind == org.aspectj.lang.reflect.DeclareAnnotation.Kind.Type)
        {
            typePattern = new TypePatternImpl(s1);
        } else
        {
            signaturePattern = new SignaturePatternImpl(s1);
        }
        theAnnotation = annotation;
        annText = s2;
    }

    public Annotation getAnnotation()
    {
        return theAnnotation;
    }

    public String getAnnotationAsText()
    {
        return annText;
    }

    public AjType getDeclaringType()
    {
        return declaringType;
    }

    public org.aspectj.lang.reflect.DeclareAnnotation.Kind getKind()
    {
        return kind;
    }

    public SignaturePattern getSignaturePattern()
    {
        return signaturePattern;
    }

    public TypePattern getTypePattern()
    {
        return typePattern;
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        stringbuffer.append("declare @");
        static class _cls1
        {

            static final int $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[];

            static 
            {
                $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind = new int[org.aspectj.lang.reflect.DeclareAnnotation.Kind.values().length];
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[org.aspectj.lang.reflect.DeclareAnnotation.Kind.Type.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[org.aspectj.lang.reflect.DeclareAnnotation.Kind.Method.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[org.aspectj.lang.reflect.DeclareAnnotation.Kind.Field.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[org.aspectj.lang.reflect.DeclareAnnotation.Kind.Constructor.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.org.aspectj.lang.reflect.DeclareAnnotation.Kind[getKind().ordinal()];
        JVM INSTR tableswitch 1 4: default 56
    //                   1 77
    //                   2 101
    //                   3 125
    //                   4 149;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        stringbuffer.append(" : ");
        stringbuffer.append(getAnnotationAsText());
        return stringbuffer.toString();
_L2:
        stringbuffer.append("type : ");
        stringbuffer.append(getTypePattern().asString());
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("method : ");
        stringbuffer.append(getSignaturePattern().asString());
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("field : ");
        stringbuffer.append(getSignaturePattern().asString());
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append("constructor : ");
        stringbuffer.append(getSignaturePattern().asString());
        if (true) goto _L1; else goto _L6
_L6:
    }
}
