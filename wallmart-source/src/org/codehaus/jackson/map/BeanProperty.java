// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.lang.annotation.Annotation;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.map.util.Named;
import org.codehaus.jackson.type.JavaType;

public interface BeanProperty
    extends Named
{
    public static class Std
        implements BeanProperty
    {

        protected final Annotations _contextAnnotations;
        protected final AnnotatedMember _member;
        protected final String _name;
        protected final JavaType _type;

        public Annotation getAnnotation(Class class1)
        {
            return _member.getAnnotation(class1);
        }

        public Annotation getContextAnnotation(Class class1)
        {
            if (_contextAnnotations == null)
            {
                return null;
            } else
            {
                return _contextAnnotations.get(class1);
            }
        }

        public AnnotatedMember getMember()
        {
            return _member;
        }

        public String getName()
        {
            return _name;
        }

        public JavaType getType()
        {
            return _type;
        }

        public Std withType(JavaType javatype)
        {
            return new Std(_name, javatype, _contextAnnotations, _member);
        }

        public Std(String s, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember)
        {
            _name = s;
            _type = javatype;
            _member = annotatedmember;
            _contextAnnotations = annotations;
        }
    }


    public abstract Annotation getAnnotation(Class class1);

    public abstract Annotation getContextAnnotation(Class class1);

    public abstract AnnotatedMember getMember();

    public abstract String getName();

    public abstract JavaType getType();
}
